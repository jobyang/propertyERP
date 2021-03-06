/**   
* Filename:    RequestFileEntity.java   
* @version:    1.0  
* Create at:   2014年5月29日 上午4:02:29   
* Description:  
*   
* Modification History:   
* Date        Author      Version     Description   
* ----------------------------------------------------------------- 
* 2014年5月29日    shiyl      1.0         1.0 Version   
*/
package com.cnfantasia.server.business.pub.entity;

/**
 * Filename:    RequestFileEntity.java
 * @version:    1.0.0
 * Create at:   2014年5月29日 上午4:02:29
 * Description:
 *
 * Modification History:
 * Date           Author           Version           Description
 * ------------------------------------------------------------------
 * 2014年5月29日       shiyl             1.0             1.0 Version
 */
public class RequestFileEntity {
	/**文件名称*/
	private String fileName = null;
	/**文件内容*/
	private byte[] fileContent = null;
	/**文件类型*/
	private String fileType;
	/**文件大小*/
	private Long fileSize;
	/**图片宽*/
	private Integer width;
	/**图片高*/
	private Integer heigh;
	
	/**
	 * 构造方法
	 * @param userImgprofileName 用户图像名称
	 * @param userImage 用户图像内容
	 */
	public RequestFileEntity(String fileName,byte[] fileContent){
		this.fileName = fileName;
		this.fileContent = fileContent;
	}
	public RequestFileEntity(String fileName,byte[] fileContent,String fileType,Long fileSize){
		this.fileName = fileName;
		this.fileContent = fileContent;
		this.fileType = fileType;
		this.fileSize = fileSize;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getFileContent() {
		return fileContent;
	}
	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public Long getFileSize() {
		return fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeigh() {
		return heigh;
	}
	public void setHeigh(Integer heigh) {
		this.heigh = heigh;
	}
	
	
}
