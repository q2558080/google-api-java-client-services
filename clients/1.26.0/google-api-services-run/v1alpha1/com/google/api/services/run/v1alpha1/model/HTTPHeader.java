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

package com.google.api.services.run.v1alpha1.model;

/**
 * HTTPHeader describes a custom header to be used in HTTP probes
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HTTPHeader extends com.google.api.client.json.GenericJson {

  /**
   * The header field name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The header field value
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The header field name
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The header field name
   * @param name name or {@code null} for none
   */
  public HTTPHeader setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The header field value
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The header field value
   * @param value value or {@code null} for none
   */
  public HTTPHeader setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public HTTPHeader set(String fieldName, Object value) {
    return (HTTPHeader) super.set(fieldName, value);
  }

  @Override
  public HTTPHeader clone() {
    return (HTTPHeader) super.clone();
  }

}
