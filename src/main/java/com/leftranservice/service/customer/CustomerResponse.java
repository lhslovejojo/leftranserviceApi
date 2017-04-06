package com.leftranservice.service.customer;

import java.io.Serializable;

public class CustomerResponse implements Serializable{
  /**
   * 
   */
  private static final long serialVersionUID = 9052887488727122337L;
  /**
   * 返回码
   */
  private String responseCode;
  /**
   * 返回描述
   */
  private String responseDesc;

  /**
   * @return the responseCode
   */
  public String getResponseCode() {
    return responseCode;
  }

  /**
   * @param responseCode
   *          the responseCode to set
   */
  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  /**
   * @return the responseDesc
   */
  public String getResponseDesc() {
    return responseDesc;
  }

  /**
   * @param responseDesc
   *          the responseDesc to set
   */
  public void setResponseDesc(String responseDesc) {
    this.responseDesc = responseDesc;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return " [responseCode=" + responseCode + ", responseDesc=" + responseDesc + "]";
  }

}
