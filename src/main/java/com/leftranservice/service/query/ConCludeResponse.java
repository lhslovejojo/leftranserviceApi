package com.leftranservice.service.query;

import java.io.Serializable;
import java.util.Date;

public class ConCludeResponse implements Serializable {
  private static final long serialVersionUID = 9133425219888877446L;
  /** 业务单号,成交单号deal_id */
  private String BusiNo;
  /** 交易所代码 */
  private String exchangeId;
  /** 交易所市场编码 */
  private String exchangeMarketType;
  /** 交易所市场业务类型 */
  private String busiType;
  /** 会员编码-发起方 */
  private String memCode;
  /** 资金账号-发起方 */
  private String fundAccountClear;
  /** 交易账号-发起方 */
  private String openTradeAccount;
  /** 会员编码-对手方 */
  private String oppMemCode;
  /** 资金账号-对手方 */
  private String oppFundAccount;
  /** 交易账号-对手方 */
  private String oppTradeAccount;
  /** 币种编码 */
  private String moneyType;
  /** 商品合约编码 */
  private String productCode;
  /** 产品类别ID */
  private String productCategoryId;
  /** 交易类型 */
  private String tradeType;
  /** 业务发生日期(YYYYMMDD) */
  private String busiDate;
  /** 业务发生时间，成交时间YYYYMMDDHHmmdd */
  private String busiTime;
  /** 买卖方向(1买2卖) */
  private String tradeDir;
  /** 成交类型(1开仓 2平仓) */
  private String dealType;
  /** 对手方成交类型 */
  private String oppDealType;
  /** 报单方式(1PC客户端 2移动客户端 3浏览器客户端 4电话委托报单 Z其他) */
  private String orderWay;
  /** 仓单/定金方式(0仓单 1定金) */
  private String depositWay;
  /** 成交价格 */
  private Double orderPrice;
  /** 持仓价格 */
  private Double holdPrice;
  /** 成交数量 */
  private Double orderQuantity;
  /** 成交总价 */
  private Double dealTotalPrice;
  /** 定金率 */
  private Double depositRate;
  /** 定金率是否比率(0-固定 1-比率) */
  private String depositRatioType;
  /** 定金收取方式(0-开仓价 1-持仓价) */
  private String depositType;
  /** 定金金额 */
  private Double depositBalance;
  /** 发起方手续费 */
  private Double openPoundage;
  /** 对手方手续费 */
  private Double oppPoundage;
  /** 建仓单号 */
  private String depotOrderNo;
  /** 对手方建仓单号 */
  private String oppDepotOrderNo;
  /** 报单编号 */
  private String orderId;
  /** 对手方报单编号 */
  private String oppOrderId;
  /** 结算日期 */
  private String settlementDate;
  /** 说明，备注 */
  private String requestDesc;
public String getBusiNo() {
	return BusiNo;
}
public void setBusiNo(String busiNo) {
	BusiNo = busiNo;
}
public String getExchangeId() {
	return exchangeId;
}
public void setExchangeId(String exchangeId) {
	this.exchangeId = exchangeId;
}
public String getExchangeMarketType() {
	return exchangeMarketType;
}
public void setExchangeMarketType(String exchangeMarketType) {
	this.exchangeMarketType = exchangeMarketType;
}
public String getBusiType() {
	return busiType;
}
public void setBusiType(String busiType) {
	this.busiType = busiType;
}
public String getMemCode() {
	return memCode;
}
public void setMemCode(String memCode) {
	this.memCode = memCode;
}
public String getFundAccountClear() {
	return fundAccountClear;
}
public void setFundAccountClear(String fundAccountClear) {
	this.fundAccountClear = fundAccountClear;
}
public String getOpenTradeAccount() {
	return openTradeAccount;
}
public void setOpenTradeAccount(String openTradeAccount) {
	this.openTradeAccount = openTradeAccount;
}
public String getOppMemCode() {
	return oppMemCode;
}
public void setOppMemCode(String oppMemCode) {
	this.oppMemCode = oppMemCode;
}
public String getOppFundAccount() {
	return oppFundAccount;
}
public void setOppFundAccount(String oppFundAccount) {
	this.oppFundAccount = oppFundAccount;
}
public String getOppTradeAccount() {
	return oppTradeAccount;
}
public void setOppTradeAccount(String oppTradeAccount) {
	this.oppTradeAccount = oppTradeAccount;
}
public String getMoneyType() {
	return moneyType;
}
public void setMoneyType(String moneyType) {
	this.moneyType = moneyType;
}
public String getProductCode() {
	return productCode;
}
public void setProductCode(String productCode) {
	this.productCode = productCode;
}
public String getProductCategoryId() {
	return productCategoryId;
}
public void setProductCategoryId(String productCategoryId) {
	this.productCategoryId = productCategoryId;
}
public String getTradeType() {
	return tradeType;
}
public void setTradeType(String tradeType) {
	this.tradeType = tradeType;
}
public String getBusiDate() {
	return busiDate;
}
public void setBusiDate(String busiDate) {
	this.busiDate = busiDate;
}
public String getBusiTime() {
	return busiTime;
}
public void setBusiTime(String busiTime) {
	this.busiTime = busiTime;
}
public String getTradeDir() {
	return tradeDir;
}
public void setTradeDir(String tradeDir) {
	this.tradeDir = tradeDir;
}
public String getDealType() {
	return dealType;
}
public void setDealType(String dealType) {
	this.dealType = dealType;
}
public String getOppDealType() {
	return oppDealType;
}
public void setOppDealType(String oppDealType) {
	this.oppDealType = oppDealType;
}
public String getOrderWay() {
	return orderWay;
}
public void setOrderWay(String orderWay) {
	this.orderWay = orderWay;
}
public String getDepositWay() {
	return depositWay;
}
public void setDepositWay(String depositWay) {
	this.depositWay = depositWay;
}
public Double getOrderPrice() {
	return orderPrice;
}
public void setOrderPrice(Double orderPrice) {
	this.orderPrice = orderPrice;
}
public Double getHoldPrice() {
	return holdPrice;
}
public void setHoldPrice(Double holdPrice) {
	this.holdPrice = holdPrice;
}
public Double getOrderQuantity() {
	return orderQuantity;
}
public void setOrderQuantity(Double orderQuantity) {
	this.orderQuantity = orderQuantity;
}
public Double getDealTotalPrice() {
	return dealTotalPrice;
}
public void setDealTotalPrice(Double dealTotalPrice) {
	this.dealTotalPrice = dealTotalPrice;
}
public Double getDepositRate() {
	return depositRate;
}
public void setDepositRate(Double depositRate) {
	this.depositRate = depositRate;
}
public String getDepositRatioType() {
	return depositRatioType;
}
public void setDepositRatioType(String depositRatioType) {
	this.depositRatioType = depositRatioType;
}
public String getDepositType() {
	return depositType;
}
public void setDepositType(String depositType) {
	this.depositType = depositType;
}
public Double getDepositBalance() {
	return depositBalance;
}
public void setDepositBalance(Double depositBalance) {
	this.depositBalance = depositBalance;
}
public Double getOpenPoundage() {
	return openPoundage;
}
public void setOpenPoundage(Double openPoundage) {
	this.openPoundage = openPoundage;
}
public Double getOppPoundage() {
	return oppPoundage;
}
public void setOppPoundage(Double oppPoundage) {
	this.oppPoundage = oppPoundage;
}
public String getDepotOrderNo() {
	return depotOrderNo;
}
public void setDepotOrderNo(String depotOrderNo) {
	this.depotOrderNo = depotOrderNo;
}
public String getOppDepotOrderNo() {
	return oppDepotOrderNo;
}
public void setOppDepotOrderNo(String oppDepotOrderNo) {
	this.oppDepotOrderNo = oppDepotOrderNo;
}
public String getOrderId() {
	return orderId;
}
public void setOrderId(String orderId) {
	this.orderId = orderId;
}
public String getOppOrderId() {
	return oppOrderId;
}
public void setOppOrderId(String oppOrderId) {
	this.oppOrderId = oppOrderId;
}
public String getSettlementDate() {
	return settlementDate;
}
public void setSettlementDate(String settlementDate) {
	this.settlementDate = settlementDate;
}
public String getRequestDesc() {
	return requestDesc;
}
public void setRequestDesc(String requestDesc) {
	this.requestDesc = requestDesc;
}
@Override
public String toString() {
	return "ConCludeResponse [BusiNo=" + BusiNo
			+ ", exchangeId=" + exchangeId + ", exchangeMarketType=" + exchangeMarketType + ", busiType=" + busiType
			+ ", memCode=" + memCode + ", fundAccountClear=" + fundAccountClear + ", openTradeAccount="
			+ openTradeAccount + ", oppMemCode=" + oppMemCode + ", oppFundAccount=" + oppFundAccount
			+ ", oppTradeAccount=" + oppTradeAccount + ", moneyType=" + moneyType + ", productCode=" + productCode
			+ ", productCategoryId=" + productCategoryId + ", tradeType=" + tradeType + ", busiDate=" + busiDate
			+ ", busiTime=" + busiTime + ", tradeDir=" + tradeDir + ", dealType=" + dealType + ", oppDealType="
			+ oppDealType + ", orderWay=" + orderWay + ", depositWay=" + depositWay + ", orderPrice=" + orderPrice
			+ ", holdPrice=" + holdPrice + ", orderQuantity=" + orderQuantity + ", dealTotalPrice=" + dealTotalPrice
			+ ", depositRate=" + depositRate + ", depositRatioType=" + depositRatioType + ", depositType=" + depositType
			+ ", depositBalance=" + depositBalance + ", openPoundage=" + openPoundage + ", oppPoundage=" + oppPoundage
			+ ", depotOrderNo=" + depotOrderNo + ", oppDepotOrderNo=" + oppDepotOrderNo + ", orderId=" + orderId
			+ ", oppOrderId=" + oppOrderId + ", settlementDate=" + settlementDate + ", requestDesc=" + requestDesc
			+ "]";
}

 
}
