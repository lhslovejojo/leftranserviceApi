package com.leftranservice.service.customer;

import java.io.Serializable;

/**
 * 账户关闭请求
 * 
 * @author qibo
 *
 */
public class AccountCloseRequest implements Serializable {

  private static final long serialVersionUID = -9068794589144536619L;
  /** 会员编码 */
  private String memCode;
  /** 交易所代码 */
  private String exchangeId;

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

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "AccountCloseRequest [memCode=" + memCode + ", exchangeId=" + exchangeId + "]";
  }


}
