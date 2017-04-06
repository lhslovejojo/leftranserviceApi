package com.leftranservice.service.tran;

import java.io.Serializable;
import java.util.Date;

public class ConCludeRequest implements Serializable {
  private static final long serialVersionUID = 9133425219888877446L;
  /** 请求日期 */
  private Date requestTime;
  /** 请求流水号 */
  private String requestId;
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
  private Long orderPrice;
  /** 持仓价格 */
  private Long holdPrice;
  /** 成交数量 */
  private Integer orderQuantity;
  /** 成交总价 */
  private Long dealTotalPrice;
  /** 定金率 */
  private Double depositRate;
  /** 定金率是否比率(0-固定 1-比率) */
  private String depositRatioType;
  /** 定金收取方式(0-开仓价 1-持仓价) */
  private String depositType;
  /** 定金金额 */
  private Long depositBalance;
  /** 发起方手续费 */
  private Long openPoundage;
  /** 对手方手续费 */
  private Long oppPoundage;
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
   * @return the exchangeMarketType
   */
  public String getExchangeMarketType() {
    return exchangeMarketType;
  }

  /**
   * @param exchangeMarketType
   *          the exchangeMarketType to set
   */
  public void setExchangeMarketType(String exchangeMarketType) {
    this.exchangeMarketType = exchangeMarketType;
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
   * @return the openTradeAccount
   */
  public String getOpenTradeAccount() {
    return openTradeAccount;
  }

  /**
   * @param openTradeAccount
   *          the openTradeAccount to set
   */
  public void setOpenTradeAccount(String openTradeAccount) {
    this.openTradeAccount = openTradeAccount;
  }

  /**
   * @return the oppMemCode
   */
  public String getOppMemCode() {
    return oppMemCode;
  }

  /**
   * @param oppMemCode
   *          the oppMemCode to set
   */
  public void setOppMemCode(String oppMemCode) {
    this.oppMemCode = oppMemCode;
  }

  /**
   * @return the oppFundAccount
   */
  public String getOppFundAccount() {
    return oppFundAccount;
  }

  /**
   * @param oppFundAccount
   *          the oppFundAccount to set
   */
  public void setOppFundAccount(String oppFundAccount) {
    this.oppFundAccount = oppFundAccount;
  }

  /**
   * @return the oppTradeAccount
   */
  public String getOppTradeAccount() {
    return oppTradeAccount;
  }

  /**
   * @param oppTradeAccount
   *          the oppTradeAccount to set
   */
  public void setOppTradeAccount(String oppTradeAccount) {
    this.oppTradeAccount = oppTradeAccount;
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
   * @return the productCode
   */
  public String getProductCode() {
    return productCode;
  }

  /**
   * @param productCode
   *          the productCode to set
   */
  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  /**
   * @return the productCategoryId
   */
  public String getProductCategoryId() {
    return productCategoryId;
  }

  /**
   * @param productCategoryId
   *          the productCategoryId to set
   */
  public void setProductCategoryId(String productCategoryId) {
    this.productCategoryId = productCategoryId;
  }

  /**
   * @return the tradeType
   */
  public String getTradeType() {
    return tradeType;
  }

  /**
   * @param tradeType
   *          the tradeType to set
   */
  public void setTradeType(String tradeType) {
    this.tradeType = tradeType;
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
   * @return the tradeDir
   */
  public String getTradeDir() {
    return tradeDir;
  }

  /**
   * @param tradeDir
   *          the tradeDir to set
   */
  public void setTradeDir(String tradeDir) {
    this.tradeDir = tradeDir;
  }

  /**
   * @return the dealType
   */
  public String getDealType() {
    return dealType;
  }

  /**
   * @param dealType
   *          the dealType to set
   */
  public void setDealType(String dealType) {
    this.dealType = dealType;
  }

  /**
   * @return the oppDealType
   */
  public String getOppDealType() {
    return oppDealType;
  }

  /**
   * @param oppDealType
   *          the oppDealType to set
   */
  public void setOppDealType(String oppDealType) {
    this.oppDealType = oppDealType;
  }

  /**
   * @return the orderWay
   */
  public String getOrderWay() {
    return orderWay;
  }

  /**
   * @param orderWay
   *          the orderWay to set
   */
  public void setOrderWay(String orderWay) {
    this.orderWay = orderWay;
  }

  /**
   * @return the depositWay
   */
  public String getDepositWay() {
    return depositWay;
  }

  /**
   * @param depositWay
   *          the depositWay to set
   */
  public void setDepositWay(String depositWay) {
    this.depositWay = depositWay;
  }

  /**
   * @return the orderPrice
   */
  public Long getOrderPrice() {
    return orderPrice;
  }

  /**
   * @param orderPrice
   *          the orderPrice to set
   */
  public void setOrderPrice(Long orderPrice) {
    this.orderPrice = orderPrice;
  }

  /**
   * @return the holdPrice
   */
  public Long getHoldPrice() {
    return holdPrice;
  }

  /**
   * @param holdPrice
   *          the holdPrice to set
   */
  public void setHoldPrice(Long holdPrice) {
    this.holdPrice = holdPrice;
  }

  /**
   * @return the orderQuantity
   */
  public Integer getOrderQuantity() {
    return orderQuantity;
  }

  /**
   * @param orderQuantity
   *          the orderQuantity to set
   */
  public void setOrderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
  }

  /**
   * @return the dealTotalPrice
   */
  public Long getDealTotalPrice() {
    return dealTotalPrice;
  }

  /**
   * @param dealTotalPrice
   *          the dealTotalPrice to set
   */
  public void setDealTotalPrice(Long dealTotalPrice) {
    this.dealTotalPrice = dealTotalPrice;
  }

  /**
   * @return the depositRate
   */
  public Double getDepositRate() {
    return depositRate;
  }

  /**
   * @param depositRate
   *          the depositRate to set
   */
  public void setDepositRate(Double depositRate) {
    this.depositRate = depositRate;
  }

  /**
   * @return the depositRatioType
   */
  public String getDepositRatioType() {
    return depositRatioType;
  }

  /**
   * @param depositRatioType
   *          the depositRatioType to set
   */
  public void setDepositRatioType(String depositRatioType) {
    this.depositRatioType = depositRatioType;
  }

  /**
   * @return the depositType
   */
  public String getDepositType() {
    return depositType;
  }

  /**
   * @param depositType
   *          the depositType to set
   */
  public void setDepositType(String depositType) {
    this.depositType = depositType;
  }

  /**
   * @return the depositBalance
   */
  public Long getDepositBalance() {
    return depositBalance;
  }

  /**
   * @param depositBalance
   *          the depositBalance to set
   */
  public void setDepositBalance(Long depositBalance) {
    this.depositBalance = depositBalance;
  }

  /**
   * @return the openPoundage
   */
  public Long getOpenPoundage() {
    return openPoundage;
  }

  /**
   * @param openPoundage
   *          the openPoundage to set
   */
  public void setOpenPoundage(Long openPoundage) {
    this.openPoundage = openPoundage;
  }

  /**
   * @return the oppPoundage
   */
  public Long getOppPoundage() {
    return oppPoundage;
  }

  /**
   * @param oppPoundage
   *          the oppPoundage to set
   */
  public void setOppPoundage(Long oppPoundage) {
    this.oppPoundage = oppPoundage;
  }

  /**
   * @return the depotOrderNo
   */
  public String getDepotOrderNo() {
    return depotOrderNo;
  }

  /**
   * @param depotOrderNo
   *          the depotOrderNo to set
   */
  public void setDepotOrderNo(String depotOrderNo) {
    this.depotOrderNo = depotOrderNo;
  }

  /**
   * @return the oppDepotOrderNo
   */
  public String getOppDepotOrderNo() {
    return oppDepotOrderNo;
  }

  /**
   * @param oppDepotOrderNo
   *          the oppDepotOrderNo to set
   */
  public void setOppDepotOrderNo(String oppDepotOrderNo) {
    this.oppDepotOrderNo = oppDepotOrderNo;
  }

  /**
   * @return the orderId
   */
  public String getOrderId() {
    return orderId;
  }

  /**
   * @param orderId
   *          the orderId to set
   */
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * @return the oppOrderId
   */
  public String getOppOrderId() {
    return oppOrderId;
  }

  /**
   * @param oppOrderId
   *          the oppOrderId to set
   */
  public void setOppOrderId(String oppOrderId) {
    this.oppOrderId = oppOrderId;
  }

  /**
   * @return the settlementDate
   */
  public String getSettlementDate() {
    return settlementDate;
  }

  /**
   * @param settlementDate
   *          the settlementDate to set
   */
  public void setSettlementDate(String settlementDate) {
    this.settlementDate = settlementDate;
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
    return "ConCludeRequest [requestTime=" + requestTime + ", requestId=" + requestId + ", BusiNo=" + BusiNo
        + ", exchangeId=" + exchangeId + ", exchangeMarketType=" + exchangeMarketType + ", busiType=" + busiType
        + ", memCode=" + memCode + ", fundAccountClear=" + fundAccountClear + ", openTradeAccount=" + openTradeAccount
        + ", oppMemCode=" + oppMemCode + ", oppFundAccount=" + oppFundAccount + ", oppTradeAccount=" + oppTradeAccount
        + ", moneyType=" + moneyType + ", productCode=" + productCode + ", productCategoryId=" + productCategoryId
        + ", tradeType=" + tradeType + ", busiDate=" + busiDate + ", busiTime=" + busiTime + ", tradeDir=" + tradeDir
        + ", dealType=" + dealType + ", oppDealType=" + oppDealType + ", orderWay=" + orderWay + ", depositWay="
        + depositWay + ", orderPrice=" + orderPrice + ", holdPrice=" + holdPrice + ", orderQuantity=" + orderQuantity
        + ", dealTotalPrice=" + dealTotalPrice + ", depositRate=" + depositRate + ", depositRatioType="
        + depositRatioType + ", depositType=" + depositType + ", depositBalance=" + depositBalance + ", openPoundage="
        + openPoundage + ", oppPoundage=" + oppPoundage + ", depotOrderNo=" + depotOrderNo + ", oppDepotOrderNo="
        + oppDepotOrderNo + ", orderId=" + orderId + ", oppOrderId=" + oppOrderId + ", settlementDate=" + settlementDate
        + ", requestDesc=" + requestDesc + "]";
  }

}
