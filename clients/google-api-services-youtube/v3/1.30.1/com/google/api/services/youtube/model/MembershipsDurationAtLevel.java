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

package com.google.api.services.youtube.model;

/**
 * Model definition for MembershipsDurationAtLevel.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MembershipsDurationAtLevel extends com.google.api.client.json.GenericJson {

  /**
   * Pricing level id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String level;

  /**
   * The date and time when the user became a continuous member for the given level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String memberSince;

  /**
   * The cumulative time the user has been a member for the given level in complete months (the time
   * is rounded down to the nearest integer).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer memberTotalDurationMonths;

  /**
   * Pricing level id.
   * @return value or {@code null} for none
   */
  public java.lang.String getLevel() {
    return level;
  }

  /**
   * Pricing level id.
   * @param level level or {@code null} for none
   */
  public MembershipsDurationAtLevel setLevel(java.lang.String level) {
    this.level = level;
    return this;
  }

  /**
   * The date and time when the user became a continuous member for the given level.
   * @return value or {@code null} for none
   */
  public java.lang.String getMemberSince() {
    return memberSince;
  }

  /**
   * The date and time when the user became a continuous member for the given level.
   * @param memberSince memberSince or {@code null} for none
   */
  public MembershipsDurationAtLevel setMemberSince(java.lang.String memberSince) {
    this.memberSince = memberSince;
    return this;
  }

  /**
   * The cumulative time the user has been a member for the given level in complete months (the time
   * is rounded down to the nearest integer).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMemberTotalDurationMonths() {
    return memberTotalDurationMonths;
  }

  /**
   * The cumulative time the user has been a member for the given level in complete months (the time
   * is rounded down to the nearest integer).
   * @param memberTotalDurationMonths memberTotalDurationMonths or {@code null} for none
   */
  public MembershipsDurationAtLevel setMemberTotalDurationMonths(java.lang.Integer memberTotalDurationMonths) {
    this.memberTotalDurationMonths = memberTotalDurationMonths;
    return this;
  }

  @Override
  public MembershipsDurationAtLevel set(String fieldName, Object value) {
    return (MembershipsDurationAtLevel) super.set(fieldName, value);
  }

  @Override
  public MembershipsDurationAtLevel clone() {
    return (MembershipsDurationAtLevel) super.clone();
  }

}
