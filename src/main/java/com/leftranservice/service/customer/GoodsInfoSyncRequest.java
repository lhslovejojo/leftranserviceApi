package com.leftranservice.service.customer;

import java.io.Serializable;

public class GoodsInfoSyncRequest implements Serializable {
  private static final long serialVersionUID = -7007536234862567189L;
  /** 交易所代码 */
  private String exchangeId;
  /** 产品代码 */
  private String productCode;
  /** 产品名称 */
  private String productName;
  /** 产品类别编码 */
  private String productCategoryMaxCode;
  /** 产品类别名称 */
  private String productCategoryMaxName;
  /** 产品类别ID */
  private String productCategoryInId;
  /** 计量名称 */
  private String presentUnit;
  /** 交易所市场名称 */
  private String exchangeMarketType;
  /** 业务类型 */
  private String bizType;
  /** 合约状态 */
  private String product_status;

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
   * @return the productName
   */
  public String getProductName() {
    return productName;
  }

  /**
   * @param productName
   *          the productName to set
   */
  public void setProductName(String productName) {
    this.productName = productName;
  }

  /**
   * @return the productCategoryMaxCode
   */
  public String getProductCategoryMaxCode() {
    return productCategoryMaxCode;
  }

  /**
   * @param productCategoryMaxCode
   *          the productCategoryMaxCode to set
   */
  public void setProductCategoryMaxCode(String productCategoryMaxCode) {
    this.productCategoryMaxCode = productCategoryMaxCode;
  }

  /**
   * @return the productCategoryMaxName
   */
  public String getProductCategoryMaxName() {
    return productCategoryMaxName;
  }

  /**
   * @param productCategoryMaxName
   *          the productCategoryMaxName to set
   */
  public void setProductCategoryMaxName(String productCategoryMaxName) {
    this.productCategoryMaxName = productCategoryMaxName;
  }

  /**
   * @return the productCategoryInId
   */
  public String getProductCategoryInId() {
    return productCategoryInId;
  }

  /**
   * @param productCategoryInId
   *          the productCategoryInId to set
   */
  public void setProductCategoryInId(String productCategoryInId) {
    this.productCategoryInId = productCategoryInId;
  }

  /**
   * @return the presentUnit
   */
  public String getPresentUnit() {
    return presentUnit;
  }

  /**
   * @param presentUnit
   *          the presentUnit to set
   */
  public void setPresentUnit(String presentUnit) {
    this.presentUnit = presentUnit;
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
   * @return the bizType
   */
  public String getBizType() {
    return bizType;
  }

  /**
   * @param bizType
   *          the bizType to set
   */
  public void setBizType(String bizType) {
    this.bizType = bizType;
  }

  /**
   * @return the product_status
   */
  public String getProduct_status() {
    return product_status;
  }

  /**
   * @param product_status
   *          the product_status to set
   */
  public void setProduct_status(String product_status) {
    this.product_status = product_status;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "GoodsInfoSync [exchangeId=" + exchangeId + ", productCode=" + productCode + ", productName=" + productName
        + ", productCategoryMaxCode=" + productCategoryMaxCode + ", productCategoryMaxName=" + productCategoryMaxName
        + ", productCategoryInId=" + productCategoryInId + ", presentUnit=" + presentUnit + ", exchangeMarketType="
        + exchangeMarketType + ", bizType=" + bizType + ", product_status=" + product_status + "]";
  }

}
