package com.leftranservice.service.query;

import java.io.Serializable;

public class TradeRequest implements Serializable {

  private static final long serialVersionUID = -8417957764170453143L;
  /** 业务开始日期YYYYMMDD */
  private String busiStartDate;
  /** 业务结束日期 */
  private String busiEndDate;
  /** 交易所代码 */
  private String exchangeId;
  /** 会员编号 */
  private String memCode;
  /** 业务流水（单笔查询时填写） */
  private String busiNo;
  /** 交易类型 */
  private String busiType;
  /** 默认50 */
  private int pageSize;
  /** 默认第一页 */
  private int pageNum;

  /**
   * @return the busiStartDate
   */
  public String getBusiStartDate() {
    return busiStartDate;
  }

  /**
   * @param busiStartDate
   *          the busiStartDate to set
   */
  public void setBusiStartDate(String busiStartDate) {
    this.busiStartDate = busiStartDate;
  }

  /**
   * @return the busiEndDate
   */
  public String getBusiEndDate() {
    return busiEndDate;
  }

  /**
   * @param busiEndDate
   *          the busiEndDate to set
   */
  public void setBusiEndDate(String busiEndDate) {
    this.busiEndDate = busiEndDate;
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
   * @return the memCode
   */
  public String getMemCode() {
    return memCode;
  }

  /**
   * @param memCode
   *          the memCode to set
   */
  public void setMemCode(String memCode) {
    this.memCode = memCode;
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

  /**
   * @return the busiType
   */
  public String getBusiType() {
    return busiType;
  }

  /**
   * @param busiType
   *          the busiType to set
   */
  public void setBusiType(String busiType) {
    this.busiType = busiType;
  }

  /**
   * @return the pageSize
   */
  public int getPageSize() {
    return pageSize;
  }

  /**
   * @param pageSize
   *          the pageSize to set
   */
  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * @return the pageNum
   */
  public int getPageNum() {
    return pageNum;
  }

  /**
   * @param pageNum
   *          the pageNum to set
   */
  public void setPageNum(int pageNum) {
    this.pageNum = pageNum;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "TradeRequest [busiStartDate=" + busiStartDate + ", busiEndDate=" + busiEndDate + ", exchangeId="
        + exchangeId + ", memCode=" + memCode + ", busiNo=" + busiNo + ", busiType=" + busiType + ", pageSize="
        + pageSize + ", pageNum=" + pageNum + "]";
  }

}
