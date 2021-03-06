$(function(){
	
	//判断安卓ios系统
	var u = navigator.userAgent, app = navigator.appVersion;
	var isAndroid = u.indexOf('Android') > -1 || u.indexOf('Linux') > -1; //android终端或者uc浏览器
	var isiOS = !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/); //ios终端
	
	//安卓
	if(isAndroid){
		//商品跳转
		$(".buynow-btn").click(function(){
			var thisItemId = $(this).attr("data-id");
			OpenAppBySchema('jiefangqu://jiefangqu.com/openShopDetail?shopId=' + thisItemId);
		});
		
		//到家服务跳转
		$(".booknow-btn").click(function(){
			var thisServerId = this.getAttribute('data-id');
			OpenAppBySchema('jiefangqu://jiefangqu.com/openHomeServiceProductDetailAct?url=' + getCurHref('www') + '/LA/dredge/productDetail.html?productId=' + thisServerId);
		});
		
		//h5页面跳转
		$(".toh5page-btn").click(function(){
			var thisLink = this.getAttribute('data-href');
			var thisTitle = document.title;
			//var urlScheme = 'jiefangqu://jiefangqu.com/openMainActGroup?DLJ=1&clazz=com.jiefangqu.living.act.buy.BannerJumpWebViewAct&paramsStr=SA.string_array_url_params-' + thisLink + '+S.title-' + thisTitle;
			//OpenAppBySchema(urlScheme);
			location.href = thisLink;
		});
	}
	
	//ios
	if(isiOS){
		//商品跳转
		$(".buynow-btn").click(function(){
			var thisItemId = $(this).attr("data-id");
			setupWebViewJavascriptBridge(function(bridge) {
				bridge.callHandler('clientDefineAction', {'type':'1','controll':'GoodsDetailViewController','params':{'productId': thisItemId}}, function(response) {});
			});
		});
		
		//到家服务跳转
		$(".booknow-btn").click(function(){
			var thisServerId = this.getAttribute('data-id');
			setupWebViewJavascriptBridge(function(bridge) {
				bridge.callHandler('clientDefineAction', {'type':'1','controll':'HSProductInfoViewController','params':{'productId': thisServerId}}, function(response) {});
			});
		});
		
		//h5页面跳转
		$(".toh5page-btn").click(function(){
			var thisLink = this.getAttribute('data-href');
			var thisTitle = document.title;
			setupWebViewJavascriptBridge(function(bridge) {
				bridge.callHandler('clientDefineAction', {'type':'1','controll':'WebborseViewController','params':{'title': thisTitle, 'isAddHeaderReq': true, 'webUrl': thisLink}}, function(response) {});
			});
		});
	}
		
    //lazyload
    $("img.bgloading").lazyload(
    	{effect: "fadeIn"},
    	setImgBlock
    );
    
    //在app端需要滚动一下，才能显示图片。。。
	$('body,html').animate({'scrollTop':1}, 200);
});

//图片外边框有1像素空白，须设置图片为块级元素
function setImgBlock(){
	$("img.bgloading").css('display', 'block');
}

function OpenAppBySchema(scheme) {
    var ua = navigator.userAgent.toLowerCase();    
    if (ua.indexOf('safari') > -1 && (ua.indexOf('os 8') == -1
        || ua.indexOf('os 7') == -1
        || ua.indexOf('os 6') == -1
        || ua.indexOf('os 5') == -1)) {
        var schemeLinkOpen = document.getElementById('schemeLinkOpen');
        if (!schemeLinkOpen) {
            schemeLinkOpen = document.createElement('a');
            schemeLinkOpen.id = 'schemeLinkOpen';
            schemeLinkOpen.style.display = 'none';
            document.body.appendChild(schemeLinkOpen);
        }
        schemeLinkOpen.href = scheme;
        // 执行click
        schemeLinkOpen.dispatchEvent(customClickEvent());
    }
    var iframeObj = document.createElement("iframe");
    var startTime = (new Date()).getTime();
    if (iframeObj != null) {
        iframeObj.setAttribute("style", "height:0px;width:0px;display:none;")
        iframeObj.setAttribute("src", scheme);
        document.body.appendChild(iframeObj);
        document.body.removeChild(iframeObj);
    }
}

function customClickEvent() {
    var clickEvent;
    if (window.CustomEvent) {
        clickEvent = new window.CustomEvent("click", {
            canBubble: true,
            cancelable: true
        }
        );
    } else {
        clickEvent = document.createEvent('Event');
        clickEvent.initEvent('click', true, true);
    }
    return clickEvent;
}

//判断获取当前域名
function getCurHref(project){
	var curHref = '';
	var curOrigin = location.origin;
	var curProtocol = location.protocol;
	if(curOrigin.indexOf('linlile.com.cn') > -1){
		curHref = curProtocol + '//'+project+'.linlile.com.cn';
	}else if(curOrigin.indexOf('linlile.cn') > -1){
		curHref = curProtocol + '//'+project+'.linlile.cn';
	}else if(curOrigin.indexOf('jiefangqu') > -1){
		curHref = curProtocol + '//'+project+'.jiefangqu.com';
	}else{
		curHref = curProtocol + '//localhost';
	}
	return curHref;
}
	
function setupWebViewJavascriptBridge(callback) {
    if (window.WebViewJavascriptBridge) { return callback(WebViewJavascriptBridge); }
    if (window.WVJBCallbacks) { return window.WVJBCallbacks.push(callback); }
    window.WVJBCallbacks = [callback];
    var WVJBIframe = document.createElement('iframe');
    WVJBIframe.style.display = 'none';
    WVJBIframe.src = 'wvjbscheme://__BRIDGE_LOADED__';
    document.documentElement.appendChild(WVJBIframe);
    setTimeout(function() { document.documentElement.removeChild(WVJBIframe) }, 0);
}
	
function showMsg(txt, hidesoon){
	$(".bg-wrap").removeClass('hide');
	$(".pop-tips-text").text(txt);
	$(".pop-tips").fadeIn();
	if(hidesoon === 'hidesoon'){
		setTimeout(function(){
			$(".pop-tips").fadeOut();
			$(".bg-wrap").addClass('hide');
		}, 2500)
	}
}
	
function hideMsg(txt){
	$(".pop-tips-text").text(txt);
	setTimeout(function(){
		$(".pop-tips").fadeOut();
		$(".bg-wrap").addClass('hide');
	}, 2500)
}
