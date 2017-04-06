package com.leftranservice.service.tran;

import java.io.Serializable;
import java.util.Date;

public class DelegateRequest implements Serializable {

  private static final long serialVersionUID = 8138801081299669204L;
  /** 请求日期 */
  private Date requestTime;
  /** 请求流水号 */
  private String requestId;
  /** 业务单号 */
  private String BusiNo;
  /** 交易所代码 */
  private String exchangeId;
  /** 会员编码 */
  private String memCode;
  /** 资金账户 */
  private String fundAccountClear;
  /** 币种编码 */
  private String moneyType;
  /** 商品合约编码 */
  private String productCode;
  /** 撤单对应报单编码 */
  private String orderSerialNo;
  /** 业务发生日期(YYYYMMDD) */
  private String busiDate;
  /** 业务发生时间YYYYMMDDHHmmdd */
  private String busiTime;
  /** 买卖方向(1买2卖) */
  private String tradeDir;
  /** 报单类型(1开仓 2平仓) */
  private String orderType;
  /** 报单方式(1PC客户端 2移动客户端 3浏览器客户端 4电话委托报单 Z其他) */
  private String orderWay;
  /** 仓单/定金方式(0仓单 1定金) */
  private String depositWay;
  /** 报单价格 */
  private Long orderPrice;
  /** 报单数量 */
  private Integer orderQuantity;
  /** 未成交数量 */
  private Integer leftQuantity;
  /** 定金率 */
  private Double depositRate;
  /** 定金率是否比率(0-固定 1-比率) */
  private String depositRatioType;
  /** 定金收取方式(0-开仓价 1-持仓价) */
  private String depositType;
  /** 手续费率 */
  private Double poundageRate;
  /** 手续费是否比率(0固定 1比率) */
  private String poundageRatioType;
  /** 手续费 */
  private Double tradePoundage;
  /** 账面价差，暂未启用 */
  private Double paperBalance;
  /** 报单冻结或报单货款冻结 */
  private Double orderFrozen;
  /** 税率 */
  private Double taxRate;
  /** 有效日期(yyyyMMdd) */
  private String validDate;
  /** 交易员 */
  private String trader;
  /** 报单IP地址 */
  private String orderIp;
  /** 报单状态(0已申报待处理 1未成交 2部分成交 3完全成交 4待撤单处理 5撤单处理中 6已经撤单 Z作废) */
  private String orderStatus;
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
   * @return the orderSerialNo
   */
  public String getOrderSerialNo() {
    return orderSerialNo;
  }

  /**
   * @param orderSerialNo
   *          the orderSerialNo to set
   */
  public void setOrderSerialNo(String orderSerialNo) {
    this.orderSerialNo = orderSerialNo;
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
   * @return the orderType
   */
  public String getOrderType() {
    return orderType;
  }

  /**
   * @param orderType
   *          the orderType to set
   */
  public void setOrderType(String orderType) {
    this.orderType = orderType;
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
   * @return the leftQuantity
   */
  public Integer getLeftQuantity() {
    return leftQuantity;
  }

  /**
   * @param leftQuantity
   *          the leftQuantity to set
   */
  public void setLeftQuantity(Integer leftQuantity) {
    this.leftQuantity = leftQuantity;
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
   * @return the poundageRate
   */
  public Double getPoundageRate() {
    return poundageRate;
  }

  /**
   * @param poundageRate
   *          the poundageRate to set
   */
  public void setPoundageRate(Double poundageRate) {
    this.poundageRate = poundageRate;
  }

  /**
   * @return the poundageRatioType
   */
  public String getPoundageRatioType() {
    return poundageRatioType;
  }

  /**
   * @param poundageRatioType
   *          the poundageRatioType to set
   */
  public void setPoundageRatioType(String poundageRatioType) {
    this.poundageRatioType = poundageRatioType;
  }

  /**
   * @return the tradePoundage
   */
  public Double getTradePoundage() {
    return tradePoundage;
  }

  /**
   * @param tradePoundage
   *          the tradePoundage to set
   */
  public void setTradePoundage(Double tradePoundage) {
    this.tradePoundage = tradePoundage;
  }

  /**
   * @return the paperBalance
   */
  public Double getPaperBalance() {
    return paperBalance;
  }

  /**
   * @param paperBalance
   *          the paperBalance to set
   */
  public void setPaperBalance(Double paperBalance) {
    this.paperBalance = paperBalance;
  }

  /**
   * @return the orderFrozen
   */
  public Double getOrderFrozen() {
    return orderFrozen;
  }

  /**
   * @param orderFrozen
   *          the orderFrozen to set
   */
  public void setOrderFrozen(Double orderFrozen) {
    this.orderFrozen = orderFrozen;
  }

  /**
   * @return the taxRate
   */
  public Double getTaxRate() {
    return taxRate;
  }

  /**
   * @param taxRate
   *          the taxRate to set
   */
  public void setTaxRate(Double taxRate) {
    this.taxRate = taxRate;
  }

  /**
   * @return the validDate
   */
  public String getValidDate() {
    return validDate;
  }

  /**
   * @param validDate
   *          the validDate to set
   */
  public void setValidDate(String validDate) {
    this.validDate = validDate;
  }

  /**
   * @return the trader
   */
  public String getTrader() {
    return trader;
  }

  /**
   * @param trader
   *          the trader to set
   */
  public void setTrader(String trader) {
    this.trader = trader;
  }

  /**
   * @return the orderIp
   */
  public String getOrderIp() {
    return orderIp;
  }

  /**
   * @param orderIp
   *          the orderIp to set
   */
  public void setOrderIp(String orderIp) {
    this.orderIp = orderIp;
  }

  /**
   * @return the orderStatus
   */
  public String getOrderStatus() {
    return orderStatus;
  }

  /**
   * @param orderStatus
   *          the orderStatus to set
   */
  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
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
    return "DelegateRequest [requestTime=" + requestTime + ", requestId=" + requestId + ", BusiNo=" + BusiNo
        + ", exchangeId=" + exchangeId + ", memCode=" + memCode + ", fundAccountClear=" + fundAccountClear
        + ", moneyType=" + moneyType + ", productCode=" + productCode + ", orderSerialNo=" + orderSerialNo
        + ", busiDate=" + busiDate + ", busiTime=" + busiTime + ", tradeDir=" + tradeDir + ", orderType=" + orderType
        + ", orderWay=" + orderWay + ", depositWay=" + depositWay + ", orderPrice=" + orderPrice + ", orderQuantity="
        + orderQuantity + ", leftQuantity=" + leftQuantity + ", depositRate=" + depositRate + ", depositRatioType="
        + depositRatioType + ", depositType=" + depositType + ", poundageRate=" + poundageRate + ", poundageRatioType="
        + poundageRatioType + ", tradePoundage=" + tradePoundage + ", paperBalance=" + paperBalance + ", orderFrozen="
        + orderFrozen + ", taxRate=" + taxRate + ", validDate=" + validDate + ", trader=" + trader + ", orderIp="
        + orderIp + ", orderStatus=" + orderStatus + ", requestDesc=" + requestDesc + "]";
  }

}
