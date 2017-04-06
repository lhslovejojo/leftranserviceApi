package com.leftranservice.service.customer;

import java.io.Serializable;

public class AccountFrozenResponse extends CustomerResponse implements Serializable {

  private static final long serialVersionUID = -431376150116119315L;
  /** 凭证编码 */
  private String evidenceNo;

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
    return "AccountFrozenResponse [evidenceNo=" + evidenceNo + ", toString()=" + super.toString() + "]";
  }

}
