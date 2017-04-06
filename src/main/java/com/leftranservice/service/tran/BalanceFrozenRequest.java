package com.leftranservice.service.tran;

import java.io.Serializable;
import java.util.Date;

public class BalanceFrozenRequest implements Serializable {

  private static final long serialVersionUID = -3273970992204506592L;
  /** 请求日期 */
  private Date requestTime;
  /** 请求流水号 */
  private String requestId;
  /** 业务单号（防重用） */
  private String BusiNo;
  /** 发起方编号，本接口写交易所编码 */
  private String systemCode;
  /** 资金账户 */
  private String fundAccountClear;
  /** 币种编码 */
  private String moneyType;
  /** 金额，冻结增加为正，解冻减少为负 */
  private Long amount;
  /** 业务发生日期(YYYYMMDD) */
  private String busiDate;
  /** 业务发生时间YYYYMMDDHHmmdd */
  private String busiTime;
  /** 说明 */
  private String requestDesc;

  /**
   * @return the requestTime
   */
  public Date getRequestTime() {
    return requestTime;
  }

  /**
   * @param requestTime
   *          the requestTime to set
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
   * @param requestId
   *          the requestId to set
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
   * @param busiNo
   *          the busiNo to set
   */
  public void setBusiNo(String busiNo) {
    BusiNo = busiNo;
  }

  /**
   * @return the systemCode
   */
  public String getSystemCode() {
    return systemCode;
  }

  /**
   * @param systemCode
   *          the systemCode to set
   */
  public void setSystemCode(String systemCode) {
    this.systemCode = systemCode;
  }

  /**
   * @return the fundAccountClear
   */
  public String getFundAccountClear() {
    return fundAccountClear;
  }

  /**
   * @param fundAccountClear
   *          the fundAccountClear to set
   */
  public void setFundAccountClear(String fundAccountClear) {
    this.fundAccountClear = fundAccountClear;
  }

  /**
   * @return the moneyType
   */
  public String getMoneyType() {
    return moneyType;
  }

  /**
   * @param moneyType
   *          the moneyType to set
   */
  public void setMoneyType(String moneyType) {
    this.moneyType = moneyType;
  }

  /**
   * @return the amount
   */
  public Long getAmount() {
    return amount;
  }

  /**
   * @param amount
   *          the amount to set
   */
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  /**
   * @return the busiDate
   */
  public String getBusiDate() {
    return busiDate;
  }

  /**
   * @param busiDate
   *          the busiDate to set
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
   * @param busiTime
   *          the busiTime to set
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
   * @param requestDesc
   *          the requestDesc to set
   */
  public void setRequestDesc(String requestDesc) {
    this.requestDesc = requestDesc;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "BalanceFrozenRequest [requestTime=" + requestTime + ", requestId=" + requestId + ", BusiNo=" + BusiNo
        + ", systemCode=" + systemCode + ", fundAccountClear=" + fundAccountClear + ", moneyType=" + moneyType
        + ", amount=" + amount + ", busiDate=" + busiDate + ", busiTime=" + busiTime + ", requestDesc=" + requestDesc
        + "]";
  }

}
