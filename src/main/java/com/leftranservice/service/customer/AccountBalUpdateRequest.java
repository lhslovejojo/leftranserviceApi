package com.leftranservice.service.customer;

import java.io.Serializable;

public class AccountBalUpdateRequest implements Serializable {

  private static final long serialVersionUID = -6873918138570467454L;
  /** 用户编码 */
  private String memCode;
  /** 交易所代码 */
  private String exchangeId;
  /** 资金账号 */
  private String fundAccountClear;
  /** 资金总余额 */
  private Double totalBal;
  /** 可用金额 */
  private Double ableBal;
  /** 冻结金额 */
  private Double frozenBal=0d;
  /** 可提余额 */
  private Double advanceBal;
public String getMemCode() {
	return memCode;
}
public void setMemCode(String memCode) {
	this.memCode = memCode;
}
public String getExchangeId() {
	return exchangeId;
}
public void setExchangeId(String exchangeId) {
	this.exchangeId = exchangeId;
}
public String getFundAccountClear() {
	return fundAccountClear;
}
public void setFundAccountClear(String fundAccountClear) {
	this.fundAccountClear = fundAccountClear;
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
	return "AccountBalUpdateRequest [memCode=" + memCode + ", exchangeId=" + exchangeId + ", fundAccountClear="
			+ fundAccountClear + ", totalBal=" + totalBal + ", ableBal=" + ableBal + ", frozenBal=" + frozenBal
			+ ", advanceBal=" + advanceBal + "]";
}

 

}
