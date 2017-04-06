package com.leftranservice.service.query;

import java.io.Serializable;

public class DepositHisResponse implements Serializable {

  private static final long serialVersionUID = 2841800882198108878L;
  /** 业务发生日期(YYYYMMDD) */
  private String initDate;
  /** 交易所代码 */
  private String exchangeId;
  /** 会员账号（清算中心） */
  private String memCodeClear;
  /** 资金账户（清算中心） */
  private String fundAccountClear;
  /** 银行产品代码 */
  private String bankProCode;
  /** 持仓产品 */
  private String productCode;
  /** 购买数量 */
  private int holdQuantity;
  /** 市场单价 */
  private long marketPrice;
  /** 总持仓成本 */
  private long holdPrice;
  /** 总持仓数量 */
  private int totalQuantity;
  /** 总盈亏 */
  private long profitAndLoss;
  /** 总市值 */
  private long marketValue;

  /**
   * @return the initDate
   */
  public String getInitDate() {
    return initDate;
  }

  /**
   * @param initDate
   *          the initDate to set
   */
  public void setInitDate(String initDate) {
    this.initDate = initDate;
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
   * @return the bankProCode
   */
  public String getBankProCode() {
    return bankProCode;
  }

  /**
   * @param bankProCode
   *          the bankProCode to set
   */
  public void setBankProCode(String bankProCode) {
    this.bankProCode = bankProCode;
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
   * @return the holdQuantity
   */
  public int getHoldQuantity() {
    return holdQuantity;
  }

  /**
   * @param holdQuantity
   *          the holdQuantity to set
   */
  public void setHoldQuantity(int holdQuantity) {
    this.holdQuantity = holdQuantity;
  }

  /**
   * @return the marketPrice
   */
  public long getMarketPrice() {
    return marketPrice;
  }

  /**
   * @param marketPrice
   *          the marketPrice to set
   */
  public void setMarketPrice(long marketPrice) {
    this.marketPrice = marketPrice;
  }

  /**
   * @return the holdPrice
   */
  public long getHoldPrice() {
    return holdPrice;
  }

  /**
   * @param holdPrice
   *          the holdPrice to set
   */
  public void setHoldPrice(long holdPrice) {
    this.holdPrice = holdPrice;
  }

  /**
   * @return the totalQuantity
   */
  public int getTotalQuantity() {
    return totalQuantity;
  }

  /**
   * @param totalQuantity
   *          the totalQuantity to set
   */
  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  /**
   * @return the profitAndLoss
   */
  public long getProfitAndLoss() {
    return profitAndLoss;
  }

  /**
   * @param profitAndLoss
   *          the profitAndLoss to set
   */
  public void setProfitAndLoss(long profitAndLoss) {
    this.profitAndLoss = profitAndLoss;
  }

  /**
   * @return the marketValue
   */
  public long getMarketValue() {
    return marketValue;
  }

  /**
   * @param marketValue
   *          the marketValue to set
   */
  public void setMarketValue(long marketValue) {
    this.marketValue = marketValue;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "DepositHisResponse [initDate=" + initDate + ", exchangeId=" + exchangeId + ", memCodeClear=" + memCodeClear
        + ", fundAccountClear=" + fundAccountClear + ", bankProCode=" + bankProCode + ", productCode=" + productCode
        + ", holdQuantity=" + holdQuantity + ", marketPrice=" + marketPrice + ", holdPrice=" + holdPrice
        + ", totalQuantity=" + totalQuantity + ", profitAndLoss=" + profitAndLoss + ", marketValue=" + marketValue
        + "]";
  }

}
