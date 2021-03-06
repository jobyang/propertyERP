<%@page import="com.cnfantasia.jfq.share.constant.ShareConstant"%>
<%@page import="com.cnfantasia.pub.constant.CookieConstant"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.cnfantasia.server.business.pub.utils.CookieUtil" %>
<%@ page import="com.cnfantasia.pub.util.WeChatConfig" %>
<%@ include file="/head.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>意外惊喜</title>
<base href="." target="_blank">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width; initial-scale=1.0; user-scalable=no">
<script type="text/javascript" src="<%=request.getContextPath()%>/amazing/js/jquery-1.11.2.min.js"></script>
<script src="<%=request.getContextPath()%>/amazing/js/perfectload.js?v061601"></script>
<script type="text/javascript">
$(function(){
    $.MyCommon.PageLoading({ sleep: 0 });
})
</script>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/amazing/css/falling.css?V0615">
</head>
<body>
<div id="container"> 
	<div class="gift dsn">
    	<div class="gift-txt opacity0">
    	<span class="orange t01">哇塞！意外惊喜</span><br/>
    	<span class="t02">恭喜获得</span>
    	<c:if test="${rewardType==1 || rewardType==2}"><span class="orange t02">解放区消费券</span></c:if>
    	<c:if test="${rewardType==3}"><span class="orange t02">怡宝桶装水兑换券</span></c:if>
    	<c:if test="${rewardType==4}"><span class="orange t02">58到家家政服务券</span></c:if>
    	<c:if test="${rewardType==5}"><span class="orange t02">电影票兑换券</span></c:if>
    	<c:if test="${rewardType==6}"><span class="orange t02">租车券</span></c:if>
    	<c:if test="${rewardType==99}"><span class="orange t02">${name}</span></c:if>
    	</div>
    	<div class="gift-img giftBtn">
            <span class="gift-num dsn">
                <span class="f03">
                <c:if test="${rewardType==1 || rewardType==2}">解放区消费券</c:if>
    			<c:if test="${rewardType==3}">怡宝桶装水兑换券</c:if>
    			<c:if test="${rewardType==4}">58到家家政服务券</c:if>
    			<c:if test="${rewardType==5}">电影票兑换券</c:if>
    			<c:if test="${rewardType==6}">租车券</c:if>
    			<c:if test="${rewardType==99}">${name}</c:if>
                </span>
                <span class="f00">
                	 <c:choose>
                	<c:when test="rewardType==5">
                	<span class="f04">兑换码</span>${exchCode}
                	</c:when>
                	<c:otherwise>
	                	<c:choose><c:when test="${empty showCount}">
		                	<c:if test="${hbAmount!= null and hbAmount!=0 and !(hbAmount eq '')}"><span class="f04">￥</span>${fn:substring(hbAmount,0,fn:indexOf(hbAmount,"."))}</c:if>
		                </c:when>
		                <c:otherwise>${showCount}</c:otherwise></c:choose>
                		<%-- <span class="f04">￥</span>${fn:substring(hbAmount,0,fn:indexOf(hbAmount,"."))} --%>
                	</c:otherwise>
               		</c:choose>
                </span>
                <span class="f01 grey">有效期至
					<c:set var="expiryTimeLong" value="${expiryTimeLong }" />
                    <%
                    	String expiryTimeLong = pageContext.getAttribute("expiryTimeLong").toString();
						Date expiryTime = new java.util.Date(Long.parseLong(expiryTimeLong));
						out.write(new SimpleDateFormat("yyyy-MM-dd").format(expiryTime)); 
					%>
				</span>
        	</span>
        	<div class="pic"><img class="gf" src="<%=request.getContextPath()%>/amazing/images/xiaofeiquan.png" /><img class="lightbg animated5s infinite rotateOut01" src="<%=request.getContextPath()%>/amazing/images/lightbg.png" /></div>
        </div>
    	<div class="dl-btn prize-info bgblue dsn" onclick="trankPage(this,${subscribe});">查看消费券</div>
        <div class="main-box erweima-info dsn" style="margin:3% auto !important;"><img src="<%=request.getContextPath()%>/amazing/images/chakanxiaofeiquan.png" /></div>
        <div class="close-btn "><div class="arrow01"></div>戳右上角分享</div>
    </div>

    <%-- <div class="gift dsn">
    	<div class="gift-txt opacity0">
    		<span class="orange t01">哇塞！意外惊喜！</span><br/><span class="t02">恭喜获得</span>
    		<c:if test="${rewardType==1 || rewardType==2}"><span class="orange t02">${hbAmount/100 }元消费券</span></c:if>
    		<c:if test="${rewardType==3}"><span class="orange t02">${hbAmount/100 }元消费券</span></c:if>
    		<c:if test="${rewardType==4}"><span class="orange t02">${hbAmount/100 }元消费券</span></c:if>
    	</div>
    	<div class="gift-img giftBtn">
    	<span class="gift-num dsn">￥${hbAmount/100 }<br><span class="f01">解放区消费券</span></span>
    	<div class="pic"><img class="gf" src="<%=request.getContextPath()%>/amazing/images/xiaofeiquan.png" /><img class="lightbg animated5s infinite rotateOut01 dsn" src="<%=request.getContextPath()%>/amazing/images/lightbg.png" /></div>
    	</div>
    	<div class="gift-btn prize-info dsn"><input class="giftBtn" type="button" value="领券逛超市" onclick="window.location.href='../shareDiscount/toShopping.do';" /></div> <!-- onclick="alert('开发中，敬请期待');"  -->
    	<div class="dl-btn prize-info dsn">戳右上角分享给好友</div>
        <div class="close-btn dsn"><div class="arrow01"></div>戳右上角分享</div>
    </div> --%>
    
    <ul class="eggs">
    	<li class="animated1s bounceInDown"><img src="<%=request.getContextPath()%>/amazing/images/egg-big.png" /></li>
    	<li class="animated2s bounceInDown"><img src="<%=request.getContextPath()%>/amazing/images/egg-big.png" /></li>
    	<li class="animated3s bounceInDown"><img src="<%=request.getContextPath()%>/amazing/images/egg-big.png" /></li>
    </ul>
    <div id="fallingContainer">
    </div>
</div>
<script src="<%=request.getContextPath()%>/amazing/js/xback.js"></script>
<script src="<%=request.getContextPath()%>/amazing/js/fastclick.js"></script>
<script src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
<script>
	$(function(){
		new FastClick(document.body);
	});
	
	$(function(){
		XBack.listen(function(){
			window.location = '<%=request.getSession().getAttribute(CookieConstant.ShareUrl)%>';
		});
	});
	function trankPage(obj,type){
		if(type==1){//已经关注直接获取我的优惠券
			window.location.href='../prize/list.do';
		}else{//展示关注
			$(obj).hide();
			$('.gift-txt').hide();
			$('.erweima-info').show();
		}
	}
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/amazing/js/falling.js?0611"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/amazing/js/jquery.eggs.js?v0611"></script>
</body>
<script>
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "//hm.baidu.com/hm.js?10613c5cec2e7e169835579b1c82fd77";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();

	var shareTitle = '<%=ShareConstant.shareTitle%>';
	var shareUrl = '<%=request.getSession().getAttribute(CookieConstant.ShareUrl)%>';

	wx.config({
	    debug: false, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
	    appId: '<%=com.cnfantasia.pub.util.WeChatConfig.APPID%>', // 必填，公众号的唯一标识
	    timestamp: '${signInfo.timestamp}', // 必填，生成签名的时间戳
	    nonceStr: '${signInfo.nonceStr}', // 必填，生成签名的随机串
	    signature: '${signInfo.signature}',// 必填，签名，见附录1
	    jsApiList: ['onMenuShareTimeline','onMenuShareAppMessage'] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
	});
	
	wx.ready(function(){
	    // config信息验证后会执行ready方法，所有接口调用都必须在config接口获得结果之后，config是一个客户端的异步操作，所以如果需要在页面加载时就调用相关接口，则须把相关接口放在ready函数中调用来确保正确执行。对于用户触发时才调用的接口，则可以直接调用，不需要放在ready函数中。
	    
		//分享朋友圈
		wx.onMenuShareTimeline({
		    title: shareTitle, // 分享标题
		    link: shareUrl, // 分享链接
		    imgUrl: '<%=ShareConstant.shareIcon%>', // 分享图标
		    success: function () { 
		        // 用户确认分享后执行的回调函数
		    },
		    cancel: function () { 
		        // 用户取消分享后执行的回调函数
		    }
		});
		
		//发送给朋友
		wx.onMenuShareAppMessage({
		    title: shareTitle, // 分享标题
		    desc: '<%=ShareConstant.getShareDesc()%>', // 分享描述
		    link: shareUrl, // 分享链接
		    imgUrl: '<%=ShareConstant.shareIcon%>', // 分享图标
		    type: 'link', // 分享类型,music、video或link，不填默认为link
		    dataUrl: '', // 如果type是music或video，则要提供数据链接，默认为空
		    success: function () { 
		        // 用户确认分享后执行的回调函数
		    },
		    cancel: function () { 
		        // 用户取消分享后执行的回调函数
		    }
		});
	});
	
	
</script>
</html>