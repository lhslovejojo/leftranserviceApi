package com.leftranservice.service.query;

import java.io.Serializable;

public class FundChangeResponse implements Serializable {

  private static final long serialVersionUID = 5983090260787615783L;
  /** 业务发生日期(YYYYMMDD) */
  private String initDate;
  /** 交易所代码 */
  private String exchangeId;
  /** 资金账号 */
  private String exchangeFundAccount;
  /** 借贷方向 */
  private String direction;
  /** 发生额 */
  private long amount;
  /** 期末余额 */
  private long endingBal;
  /** 摘要码 */
  private String summary;
  /** 备注 */
  private String remark;
  /** 币种 */
  private String moneyType;
  /** 业务流水 */
  private String busiNo;

  /**
   * @return the initDate
   */
  public String getInitDate() {
    return initDate;
  }

  /**
   * @param initDate
   *          the initDate to set
   */
  public void setInitDate(String initDate) {
    this.initDate = initDate;
  }

  /**
   * @return the exchangeId
   */
  public String getExchangeId() {
    return exchangeId;
  }

  /**
   * @param exchangeId
   *          the exchangeId to set
   */
  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
  }

  /**
   * @return the exchangeFundAccount
   */
  public String getExchangeFundAccount() {
    return exchangeFundAccount;
  }

  /**
   * @param exchangeFundAccount
   *          the exchangeFundAccount to set
   */
  public void setExchangeFundAccount(String exchangeFundAccount) {
    this.exchangeFundAccount = exchangeFundAccount;
  }

  /**
   * @return the direction
   */
  public String getDirection() {
    return direction;
  }

  /**
   * @param direction
   *          the direction to set
   */
  public void setDirection(String direction) {
    this.direction = direction;
  }

  /**
   * @return the amount
   */
  public long getAmount() {
    return amount;
  }

  /**
   * @param amount
   *          the amount to set
   */
  public void setAmount(long amount) {
    this.amount = amount;
  }

  /**
   * @return the endingBal
   */
  public long getEndingBal() {
    return endingBal;
  }

  /**
   * @param endingBal
   *          the endingBal to set
   */
  public void setEndingBal(long endingBal) {
    this.endingBal = endingBal;
  }

  /**
   * @return the summary
   */
  public String getSummary() {
    return summary;
  }

  /**
   * @param summary
   *          the summary to set
   */
  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * @return the remark
   */
  public String getRemark() {
    return remark;
  }

  /**
   * @param remark
   *          the remark to set
   */
  public void setRemark(String remark) {
    this.remark = remark;
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
   * @return the busiNo
   */
  public String getBusiNo() {
    return busiNo;
  }

  /**
   * @param busiNo
   *          the busiNo to set
   */
  public void setBusiNo(String busiNo) {
    this.busiNo = busiNo;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "FundChangeResponse [initDate=" + initDate + ", exchangeId=" + exchangeId + ", exchangeFundAccount="
        + exchangeFundAccount + ", direction=" + direction + ", amount=" + amount + ", endingBal=" + endingBal
        + ", summary=" + summary + ", remark=" + remark + ", moneyType=" + moneyType + ", busiNo=" + busiNo + "]";
  }

}
