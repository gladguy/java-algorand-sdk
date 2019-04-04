/*
 * Algod REST API.
 * API Endpoint for AlgoD Operations.
 *
 * OpenAPI spec version: 0.0.1
 * Contact: contact@algorand.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.algorand.algosdk.algod.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

/**
 * PendingTransactions represents a potentially truncated list of transactions currently in the node&#39;s transaction pool.
 */
@ApiModel(description = "PendingTransactions represents a potentially truncated list of transactions currently in the node's transaction pool.")

public class PendingTransactions {
  @SerializedName("totalTxns")
  private Long totalTxns = null;

  @SerializedName("truncatedTxns")
  private TransactionList truncatedTxns = null;

  public PendingTransactions totalTxns(Long totalTxns) {
    this.totalTxns = totalTxns;
    return this;
  }

   /**
   * TotalTxns
   * @return totalTxns
  **/
  @ApiModelProperty(required = true, value = "TotalTxns")
  public Long getTotalTxns() {
    return totalTxns;
  }

  public void setTotalTxns(Long totalTxns) {
    this.totalTxns = totalTxns;
  }

  public PendingTransactions truncatedTxns(TransactionList truncatedTxns) {
    this.truncatedTxns = truncatedTxns;
    return this;
  }

   /**
   * Get truncatedTxns
   * @return truncatedTxns
  **/
  @ApiModelProperty(required = true, value = "")
  public TransactionList getTruncatedTxns() {
    return truncatedTxns;
  }

  public void setTruncatedTxns(TransactionList truncatedTxns) {
    this.truncatedTxns = truncatedTxns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    PendingTransactions pendingTransactions = (PendingTransactions) o;
    return ObjectUtils.equals(this.totalTxns, pendingTransactions.totalTxns) &&
    ObjectUtils.equals(this.truncatedTxns, pendingTransactions.truncatedTxns);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(totalTxns, truncatedTxns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingTransactions {\n");
    
    sb.append("    totalTxns: ").append(toIndentedString(totalTxns)).append("\n");
    sb.append("    truncatedTxns: ").append(toIndentedString(truncatedTxns)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
