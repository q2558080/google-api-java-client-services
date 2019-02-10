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

package com.google.api.services.healthcare.v1alpha.model;

/**
 * Specifies the parameters needed for de-identification of DICOM stores.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DicomConfig extends com.google.api.client.json.GenericJson {

  /**
   * Tags to be whitelisted, for example "PatientID",  "0010,0010". Any tag that is whitelisted will
   * copied as is. All other tags will be omitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> whitelistTags;

  /**
   * Tags to be whitelisted, for example "PatientID",  "0010,0010". Any tag that is whitelisted will
   * copied as is. All other tags will be omitted.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getWhitelistTags() {
    return whitelistTags;
  }

  /**
   * Tags to be whitelisted, for example "PatientID",  "0010,0010". Any tag that is whitelisted will
   * copied as is. All other tags will be omitted.
   * @param whitelistTags whitelistTags or {@code null} for none
   */
  public DicomConfig setWhitelistTags(java.util.List<java.lang.String> whitelistTags) {
    this.whitelistTags = whitelistTags;
    return this;
  }

  @Override
  public DicomConfig set(String fieldName, Object value) {
    return (DicomConfig) super.set(fieldName, value);
  }

  @Override
  public DicomConfig clone() {
    return (DicomConfig) super.clone();
  }

}
