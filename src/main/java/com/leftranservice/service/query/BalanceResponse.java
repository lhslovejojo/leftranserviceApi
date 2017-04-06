package com.leftranservice.service.query;

import java.io.Serializable;

public class BalanceResponse implements Serializable {

  private static final long serialVersionUID = -6873918138570467454L;
  /** 用户交易账号 */
  private String fundAccount;
  /** 交易所代码 */
  private String exchangeId;
  /** 资金账号 */
  private String exchangeFundAccount;
  /** 资金总余额 */
  private Double totalBal;
  /** 可用金额 */
  private Double ableBal;
  /** 冻结金额 */
  private Double frozenBal=0d;
  /** 可提余额 */
  private Double advanceBal;

  /**
   * @return the fundAccount
   */
  public String getFundAccount() {
    return fundAccount;
  }

  /**
   * @param fundAccount
   *          the fundAccount to set
   */
  public void setFundAccount(String fundAccount) {
    this.fundAccount = fundAccount;
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

public Double getTotalBal() {
	return totalBal;
}

public void setTotalBal(Double totalBal) {
	this.totalBal = totalBal;
}

public Double getAbleBal() {
	return ableBal;
}

public void setAbleBal(Double ableBal) {
	this.ableBal = ableBal;
}

public Double getFrozenBal() {
	return frozenBal;
}

public void setFrozenBal(Double frozenBal) {
	this.frozenBal = frozenBal;
}

public Double getAdvanceBal() {
	return advanceBal;
}

public void setAdvanceBal(Double advanceBal) {
	this.advanceBal = advanceBal;
}

@Override
public String toString() {
	return "BalanceResponse [fundAccount=" + fundAccount + ", exchangeId=" + exchangeId + ", exchangeFundAccount="
			+ exchangeFundAccount + ", totalBal=" + totalBal + ", ableBal=" + ableBal + ", frozenBal=" + frozenBal
			+ ", advanceBal=" + advanceBal + "]";
}

}
