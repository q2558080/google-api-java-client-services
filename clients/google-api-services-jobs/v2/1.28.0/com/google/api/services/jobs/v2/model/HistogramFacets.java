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

package com.google.api.services.jobs.v2.model;

/**
 * Input only.
 *
 * Histogram facets to be specified in SearchJobsRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HistogramFacets extends com.google.api.client.json.GenericJson {

  /**
   * Optional.
   *
   * Specifies compensation field-based histogram requests. Duplicate values of
   * CompensationHistogramRequest.type are not allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CompensationHistogramRequest> compensationHistogramFacets;

  static {
    // hack to force ProGuard to consider CompensationHistogramRequest used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CompensationHistogramRequest.class);
  }

  /**
   * Optional.
   *
   * Specifies the custom attributes histogram requests. Duplicate values of
   * CustomAttributeHistogramRequest.key are not allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CustomAttributeHistogramRequest> customAttributeHistogramFacets;

  static {
    // hack to force ProGuard to consider CustomAttributeHistogramRequest used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CustomAttributeHistogramRequest.class);
  }

  /**
   * Optional. Specifies the simple type of histogram facets, for example, `COMPANY_SIZE`,
   * `EMPLOYMENT_TYPE` etc. This field is equivalent to GetHistogramRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> simpleHistogramFacets;

  /**
   * Optional.
   *
   * Specifies compensation field-based histogram requests. Duplicate values of
   * CompensationHistogramRequest.type are not allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<CompensationHistogramRequest> getCompensationHistogramFacets() {
    return compensationHistogramFacets;
  }

  /**
   * Optional.
   *
   * Specifies compensation field-based histogram requests. Duplicate values of
   * CompensationHistogramRequest.type are not allowed.
   * @param compensationHistogramFacets compensationHistogramFacets or {@code null} for none
   */
  public HistogramFacets setCompensationHistogramFacets(java.util.List<CompensationHistogramRequest> compensationHistogramFacets) {
    this.compensationHistogramFacets = compensationHistogramFacets;
    return this;
  }

  /**
   * Optional.
   *
   * Specifies the custom attributes histogram requests. Duplicate values of
   * CustomAttributeHistogramRequest.key are not allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<CustomAttributeHistogramRequest> getCustomAttributeHistogramFacets() {
    return customAttributeHistogramFacets;
  }

  /**
   * Optional.
   *
   * Specifies the custom attributes histogram requests. Duplicate values of
   * CustomAttributeHistogramRequest.key are not allowed.
   * @param customAttributeHistogramFacets customAttributeHistogramFacets or {@code null} for none
   */
  public HistogramFacets setCustomAttributeHistogramFacets(java.util.List<CustomAttributeHistogramRequest> customAttributeHistogramFacets) {
    this.customAttributeHistogramFacets = customAttributeHistogramFacets;
    return this;
  }

  /**
   * Optional. Specifies the simple type of histogram facets, for example, `COMPANY_SIZE`,
   * `EMPLOYMENT_TYPE` etc. This field is equivalent to GetHistogramRequest.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSimpleHistogramFacets() {
    return simpleHistogramFacets;
  }

  /**
   * Optional. Specifies the simple type of histogram facets, for example, `COMPANY_SIZE`,
   * `EMPLOYMENT_TYPE` etc. This field is equivalent to GetHistogramRequest.
   * @param simpleHistogramFacets simpleHistogramFacets or {@code null} for none
   */
  public HistogramFacets setSimpleHistogramFacets(java.util.List<java.lang.String> simpleHistogramFacets) {
    this.simpleHistogramFacets = simpleHistogramFacets;
    return this;
  }

  @Override
  public HistogramFacets set(String fieldName, Object value) {
    return (HistogramFacets) super.set(fieldName, value);
  }

  @Override
  public HistogramFacets clone() {
    return (HistogramFacets) super.clone();
  }

}
