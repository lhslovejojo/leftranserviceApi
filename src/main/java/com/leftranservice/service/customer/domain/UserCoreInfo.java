package com.leftranservice.service.customer.domain;

import java.io.Serializable;

public class UserCoreInfo implements Serializable {
  private static final long serialVersionUID = 2569557119527124073L;
  /** 会员账号（清算中心） */
  private String memCodeClear;
  /** 资金账户（清算中心） */
  private String fundAccountClear;
  /** 会员主体类型 */
  private String memberMainType;
  /** 会员类型 */
  private String memberType;
  /** 资金账号 */
  private String exchangeFundAccount;
  /** 交易账号 */
  private String tradeAccount;

  /**
   * @return the memCodeClear
   */
  public String getMemCodeClear() {
    return memCodeClear;
  }

  /**
   * @param memCodeClear
   *          the memCodeClear to set
   */
  public void setMemCodeClear(String memCodeClear) {
    this.memCodeClear = memCodeClear;
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
   * @return the memberMainType
   */
  public String getMemberMainType() {
    return memberMainType;
  }

  /**
   * @param memberMainType
   *          the memberMainType to set
   */
  public void setMemberMainType(String memberMainType) {
    this.memberMainType = memberMainType;
  }

  /**
   * @return the memberType
   */
  public String getMemberType() {
    return memberType;
  }

  /**
   * @param memberType
   *          the memberType to set
   */
  public void setMemberType(String memberType) {
    this.memberType = memberType;
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
   * @return the tradeAccount
   */
  public String getTradeAccount() {
    return tradeAccount;
  }

  /**
   * @param tradeAccount
   *          the tradeAccount to set
   */
  public void setTradeAccount(String tradeAccount) {
    this.tradeAccount = tradeAccount;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "UserCoreInfo [memCodeClear=" + memCodeClear + ", fundAccountClear=" + fundAccountClear + ", memberMainType="
        + memberMainType + ", memberType=" + memberType + ", exchangeFundAccount=" + exchangeFundAccount
        + ", tradeAccount=" + tradeAccount + "]";
  }

}
