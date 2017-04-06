package com.leftranservice.service.tran;

import java.io.Serializable;
import java.util.Date;

public class SettlementRequest implements Serializable {
  private static final long serialVersionUID = -1836223152725883914L;
  /** 请求日期 */
  private Date requestTime;
  /** 请求流水号 */
  private String requestId;
  /** 业务单号 */
  private String BusiNo;
  /** 交易所代码 */
  private String exchangeId;
  /** 会员编码 */
  private String memCode;
  /** 币种编码 */
  private String moneyType;
  /** 交割单编码 */
  private String productCode;
  /** 产品类别ID */
  private String productCategoryId;
  /** 交割申请日期时间 */
  private String deliverApplyTime;
  /** 交割生效日期时间 */
  private String deliverEffectTime;
  /** 交割地点 */
  private String deliverAddr;
  /** 交割仓库 */
  private String deliverDepot;
  /** 交割类型 */
  private String deliverType;
  /** 交割方向 */
  private String deliverDirection;
  /** 交割价格 */
  private Long deliverPrice;
  /** 交割数量 */
  private Integer deliverQuantity;
  /** 交割货款 */
  private Long deliverPayment;
  /** 交割费 */
  private Long deliverFees;
  /** 持仓价格 */
  private Long holdPrice;
  /** 业务发生日期(YYYYMMDD) */
  private String busiDate;
  /** 业务发生时间YYYYMMDDHHmmdd */
  private String busiTime;
  /** 说明，备注 */
  private String requestDesc;
  /**
   * @return the requestTime
   */
  public Date getRequestTime() {
    return requestTime;
  }
  /**
   * @param requestTime the requestTime to set
   */
  public void setRequestTime(Date requestTime) {
    this.requestTime = requestTime;
  }
  /**
   * @return the requestId
   */
  public String getRequestId() {
    return requestId;
  }
  /**
   * @param requestId the requestId to set
   */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }
  /**
   * @return the busiNo
   */
  public String getBusiNo() {
    return BusiNo;
  }
  /**
   * @param busiNo the busiNo to set
   */
  public void setBusiNo(String busiNo) {
    BusiNo = busiNo;
  }
  /**
   * @return the exchangeId
   */
  public String getExchangeId() {
    return exchangeId;
  }
  /**
   * @param exchangeId the exchangeId to set
   */
  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
  }
  /**
   * @return the memCode
   */
  public String getMemCode() {
    return memCode;
  }
  /**
   * @param memCode the memCode to set
   */
  public void setMemCode(String memCode) {
    this.memCode = memCode;
  }
  /**
   * @return the moneyType
   */
  public String getMoneyType() {
    return moneyType;
  }
  /**
   * @param moneyType the moneyType to set
   */
  public void setMoneyType(String moneyType) {
    this.moneyType = moneyType;
  }
  /**
   * @return the productCode
   */
  public String getProductCode() {
    return productCode;
  }
  /**
   * @param productCode the productCode to set
   */
  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }
  /**
   * @return the productCategoryId
   */
  public String getProductCategoryId() {
    return productCategoryId;
  }
  /**
   * @param productCategoryId the productCategoryId to set
   */
  public void setProductCategoryId(String productCategoryId) {
    this.productCategoryId = productCategoryId;
  }
  /**
   * @return the deliverApplyTime
   */
  public String getDeliverApplyTime() {
    return deliverApplyTime;
  }
  /**
   * @param deliverApplyTime the deliverApplyTime to set
   */
  public void setDeliverApplyTime(String deliverApplyTime) {
    this.deliverApplyTime = deliverApplyTime;
  }
  /**
   * @return the deliverEffectTime
   */
  public String getDeliverEffectTime() {
    return deliverEffectTime;
  }
  /**
   * @param deliverEffectTime the deliverEffectTime to set
   */
  public void setDeliverEffectTime(String deliverEffectTime) {
    this.deliverEffectTime = deliverEffectTime;
  }
  /**
   * @return the deliverAddr
   */
  public String getDeliverAddr() {
    return deliverAddr;
  }
  /**
   * @param deliverAddr the deliverAddr to set
   */
  public void setDeliverAddr(String deliverAddr) {
    this.deliverAddr = deliverAddr;
  }
  /**
   * @return the deliverDepot
   */
  public String getDeliverDepot() {
    return deliverDepot;
  }
  /**
   * @param deliverDepot the deliverDepot to set
   */
  public void setDeliverDepot(String deliverDepot) {
    this.deliverDepot = deliverDepot;
  }
  /**
   * @return the deliverType
   */
  public String getDeliverType() {
    return deliverType;
  }
  /**
   * @param deliverType the deliverType to set
   */
  public void setDeliverType(String deliverType) {
    this.deliverType = deliverType;
  }
  /**
   * @return the deliverDirection
   */
  public String getDeliverDirection() {
    return deliverDirection;
  }
  /**
   * @param deliverDirection the deliverDirection to set
   */
  public void setDeliverDirection(String deliverDirection) {
    this.deliverDirection = deliverDirection;
  }
  /**
   * @return the deliverPrice
   */
  public Long getDeliverPrice() {
    return deliverPrice;
  }
  /**
   * @param deliverPrice the deliverPrice to set
   */
  public void setDeliverPrice(Long deliverPrice) {
    this.deliverPrice = deliverPrice;
  }
  /**
   * @return the deliverQuantity
   */
  public Integer getDeliverQuantity() {
    return deliverQuantity;
  }
  /**
   * @param deliverQuantity the deliverQuantity to set
   */
  public void setDeliverQuantity(Integer deliverQuantity) {
    this.deliverQuantity = deliverQuantity;
  }
  /**
   * @return the deliverPayment
   */
  public Long getDeliverPayment() {
    return deliverPayment;
  }
  /**
   * @param deliverPayment the deliverPayment to set
   */
  public void setDeliverPayment(Long deliverPayment) {
    this.deliverPayment = deliverPayment;
  }
  /**
   * @return the deliverFees
   */
  public Long getDeliverFees() {
    return deliverFees;
  }
  /**
   * @param deliverFees the deliverFees to set
   */
  public void setDeliverFees(Long deliverFees) {
    this.deliverFees = deliverFees;
  }
  /**
   * @return the holdPrice
   */
  public Long getHoldPrice() {
    return holdPrice;
  }
  /**
   * @param holdPrice the holdPrice to set
   */
  public void setHoldPrice(Long holdPrice) {
    this.holdPrice = holdPrice;
  }
  /**
   * @return the busiDate
   */
  public String getBusiDate() {
    return busiDate;
  }
  /**
   * @param busiDate the busiDate to set
   */
  public void setBusiDate(String busiDate) {
    this.busiDate = busiDate;
  }
  /**
   * @return the busiTime
   */
  public String getBusiTime() {
    return busiTime;
  }
  /**
   * @param busiTime the busiTime to set
   */
  public void setBusiTime(String busiTime) {
    this.busiTime = busiTime;
  }
  /**
   * @return the requestDesc
   */
  public String getRequestDesc() {
    return requestDesc;
  }
  /**
   * @param requestDesc the requestDesc to set
   */
  public void setRequestDesc(String requestDesc) {
    this.requestDesc = requestDesc;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "SettlementRequest [requestTime=" + requestTime + ", requestId=" + requestId + ", BusiNo=" + BusiNo
        + ", exchangeId=" + exchangeId + ", memCode=" + memCode + ", moneyType=" + moneyType + ", productCode="
        + productCode + ", productCategoryId=" + productCategoryId + ", deliverApplyTime=" + deliverApplyTime
        + ", deliverEffectTime=" + deliverEffectTime + ", deliverAddr=" + deliverAddr + ", deliverDepot=" + deliverDepot
        + ", deliverType=" + deliverType + ", deliverDirection=" + deliverDirection + ", deliverPrice=" + deliverPrice
        + ", deliverQuantity=" + deliverQuantity + ", deliverPayment=" + deliverPayment + ", deliverFees=" + deliverFees
        + ", holdPrice=" + holdPrice + ", busiDate=" + busiDate + ", busiTime=" + busiTime + ", requestDesc="
        + requestDesc + "]";
  }
  
  
}
