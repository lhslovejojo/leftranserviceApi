package com.leftranservice.service.tran;

import java.io.Serializable;

public class TranResponse implements Serializable {
  private static final long serialVersionUID = 7138848498872482997L;
  /**
   * 返回码
   */
  private String responseCode;
  /**
   * 返回描述
   */
  private String responseDesc;
  /**
   * 外部系统请求编号
   */
  private String requestId;
  /**
   * 区块链交易凭证号
   */
  private String evidenceNo;

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
   * @return the evidenceNo
   */
  public String getEvidenceNo() {
    return evidenceNo;
  }

  /**
   * @param evidenceNo
   *          the evidenceNo to set
   */
  public void setEvidenceNo(String evidenceNo) {
    this.evidenceNo = evidenceNo;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "TranResponse [responseCode=" + responseCode + ", responseDesc=" + responseDesc + ", requestId=" + requestId
        + ", evidenceNo=" + evidenceNo + "]";
  }

}
