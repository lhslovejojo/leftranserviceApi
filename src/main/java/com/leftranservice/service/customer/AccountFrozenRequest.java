package com.leftranservice.service.customer;

import java.io.Serializable;

/**
 * 账户冻结请求
 * 
 * @author qibo
 *
 */
public class AccountFrozenRequest implements Serializable {

  private static final long serialVersionUID = -9068794589144536619L;
  /** 会员编码 */
  private String memCode;
  /** 冻结类型,1-冻结 0-解冻 */
  private short frozenType;
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
   * @return the frozenType
   */
  public short getFrozenType() {
    return frozenType;
  }

  /**
   * @param frozenType
   *          the frozenType to set
   */
  public void setFrozenType(short frozenType) {
    this.frozenType = frozenType;
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

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "AccountFrozenRequest [memCode=" + memCode + ", frozenType=" + frozenType + ", exchangeId=" + exchangeId
        + "]";
  }

}
