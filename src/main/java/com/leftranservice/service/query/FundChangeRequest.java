package com.leftranservice.service.query;

import java.io.Serializable;

public class FundChangeRequest implements Serializable {

  private static final long serialVersionUID = 7380145788759296469L;
  /** 业务开始日期YYYYMMDD */
  private String busiStartDate;
  /** 业务结束日期 */
  private String busiEndDate;
  /** 交易所代码 */
  private String exchangeId;
  /** 会员编号 */
  private String memCode;
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


  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "FundChangeRequest [busiStartDate=" + busiStartDate + ", busiEndDate=" + busiEndDate + ", exchangeId="
        + exchangeId + ", memCode=" + memCode + ", pageSize=" + pageSize + ", pageNum=" + pageNum + "]";
  }

public int getPageSize() {
	return pageSize;
}

public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}

public int getPageNum() {
	return pageNum;
}

public void setPageNum(int pageNum) {
	this.pageNum = pageNum;
}

}
