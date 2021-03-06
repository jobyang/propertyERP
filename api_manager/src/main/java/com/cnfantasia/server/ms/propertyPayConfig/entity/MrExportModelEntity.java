package com.cnfantasia.server.ms.propertyPayConfig.entity;

import com.cnfantasia.server.domainbase.mrStandardRoom.entity.MrStandardRoom;

import java.math.BigInteger;
import java.util.List;

/**
 * @ClassName: MrImportModelEntity
 * @Date: 2017-09-26 14:33
 * @Auther: yanghua
 * @Description:(抄表导入模板)
 */
public class MrExportModelEntity {
    private BigInteger realRoomId;
    private String buildingName;//楼栋
    private String unitName;//单元
    private String numTail;//房号
    private BigInteger mrFeeItemId;//收费项id
    private Double multiplierTimes;// 计量倍率
    private String mrName;// 计费表名称

    public BigInteger getRealRoomId() {
        return realRoomId;
    }

    public void setRealRoomId(BigInteger realRoomId) {
        this.realRoomId = realRoomId;
    }
    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getNumTail() {
        return numTail;
    }

    public void setNumTail(String numTail) {
        this.numTail = numTail;
    }

    public BigInteger getMrFeeItemId() {
        return mrFeeItemId;
    }

    public void setMrFeeItemId(BigInteger mrFeeItemId) {
        this.mrFeeItemId = mrFeeItemId;
    }

    public String getMrName() {
        return mrName;
    }

    public void setMrName(String mrName) {
        this.mrName = mrName;
    }

    public Double getMultiplierTimes() {
        return multiplierTimes;
    }

    public void setMultiplierTimes(Double multiplierTimes) {
        this.multiplierTimes = multiplierTimes;
    }
}
