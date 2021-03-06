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

package com.google.api.services.content.model;

/**
 * Model definition for ReturnPolicySeasonalOverride.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReturnPolicySeasonalOverride extends com.google.api.client.json.GenericJson {

  /**
   * Required. Last day on which the override applies. In ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endDate;

  /**
   * Required. The name of the seasonal override as shown in Merchant Center.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The policy which is in effect during that time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReturnPolicyPolicy policy;

  /**
   * Required. First day on which the override applies. In ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startDate;

  /**
   * Required. Last day on which the override applies. In ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndDate() {
    return endDate;
  }

  /**
   * Required. Last day on which the override applies. In ISO 8601 format.
   * @param endDate endDate or {@code null} for none
   */
  public ReturnPolicySeasonalOverride setEndDate(java.lang.String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Required. The name of the seasonal override as shown in Merchant Center.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The name of the seasonal override as shown in Merchant Center.
   * @param name name or {@code null} for none
   */
  public ReturnPolicySeasonalOverride setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The policy which is in effect during that time.
   * @return value or {@code null} for none
   */
  public ReturnPolicyPolicy getPolicy() {
    return policy;
  }

  /**
   * Required. The policy which is in effect during that time.
   * @param policy policy or {@code null} for none
   */
  public ReturnPolicySeasonalOverride setPolicy(ReturnPolicyPolicy policy) {
    this.policy = policy;
    return this;
  }

  /**
   * Required. First day on which the override applies. In ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartDate() {
    return startDate;
  }

  /**
   * Required. First day on which the override applies. In ISO 8601 format.
   * @param startDate startDate or {@code null} for none
   */
  public ReturnPolicySeasonalOverride setStartDate(java.lang.String startDate) {
    this.startDate = startDate;
    return this;
  }

  @Override
  public ReturnPolicySeasonalOverride set(String fieldName, Object value) {
    return (ReturnPolicySeasonalOverride) super.set(fieldName, value);
  }

  @Override
  public ReturnPolicySeasonalOverride clone() {
    return (ReturnPolicySeasonalOverride) super.clone();
  }

}
