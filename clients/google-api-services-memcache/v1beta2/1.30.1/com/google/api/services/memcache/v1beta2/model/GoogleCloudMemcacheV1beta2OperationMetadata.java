/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.memcache.v1beta2.model;

/**
 * Represents the metadata of a long-running operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Memorystore for Memcached API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMemcacheV1beta2OperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * API version used to start the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiVersion;

  /**
   * Identifies whether the user has requested cancellation of the operation. Operations that have
   * successfully been cancelled have Operation.error value with a google.rpc.Status.code of 1,
   * corresponding to `Code.CANCELLED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cancelRequested;

  /**
   * Time when the operation was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Time when the operation finished running.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Human-readable status of the operation, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusDetail;

  /**
   * Server-defined resource path for the target of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * Name of the verb executed by the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verb;

  /**
   * API version used to start the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiVersion() {
    return apiVersion;
  }

  /**
   * API version used to start the operation.
   * @param apiVersion apiVersion or {@code null} for none
   */
  public GoogleCloudMemcacheV1beta2OperationMetadata setApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Identifies whether the user has requested cancellation of the operation. Operations that have
   * successfully been cancelled have Operation.error value with a google.rpc.Status.code of 1,
   * corresponding to `Code.CANCELLED`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCancelRequested() {
    return cancelRequested;
  }

  /**
   * Identifies whether the user has requested cancellation of the operation. Operations that have
   * successfully been cancelled have Operation.error value with a google.rpc.Status.code of 1,
   * corresponding to `Code.CANCELLED`.
   * @param cancelRequested cancelRequested or {@code null} for none
   */
  public GoogleCloudMemcacheV1beta2OperationMetadata setCancelRequested(java.lang.Boolean cancelRequested) {
    this.cancelRequested = cancelRequested;
    return this;
  }

  /**
   * Time when the operation was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Time when the operation was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudMemcacheV1beta2OperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Time when the operation finished running.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Time when the operation finished running.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudMemcacheV1beta2OperationMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Human-readable status of the operation, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusDetail() {
    return statusDetail;
  }

  /**
   * Human-readable status of the operation, if any.
   * @param statusDetail statusDetail or {@code null} for none
   */
  public GoogleCloudMemcacheV1beta2OperationMetadata setStatusDetail(java.lang.String statusDetail) {
    this.statusDetail = statusDetail;
    return this;
  }

  /**
   * Server-defined resource path for the target of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * Server-defined resource path for the target of the operation.
   * @param target target or {@code null} for none
   */
  public GoogleCloudMemcacheV1beta2OperationMetadata setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  /**
   * Name of the verb executed by the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getVerb() {
    return verb;
  }

  /**
   * Name of the verb executed by the operation.
   * @param verb verb or {@code null} for none
   */
  public GoogleCloudMemcacheV1beta2OperationMetadata setVerb(java.lang.String verb) {
    this.verb = verb;
    return this;
  }

  @Override
  public GoogleCloudMemcacheV1beta2OperationMetadata set(String fieldName, Object value) {
    return (GoogleCloudMemcacheV1beta2OperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMemcacheV1beta2OperationMetadata clone() {
    return (GoogleCloudMemcacheV1beta2OperationMetadata) super.clone();
  }

}
