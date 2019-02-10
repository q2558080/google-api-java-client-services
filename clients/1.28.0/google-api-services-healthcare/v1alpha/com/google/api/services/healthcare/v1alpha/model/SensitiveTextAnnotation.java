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
 * A TextAnnotation specifies a text range that includes sensitive information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SensitiveTextAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * Maps from a resource slice (e.g. FHIR resource field path) to a set of sensitive text findings.
   * For example, Appointment.Narrative text1 --> {findings_1, findings_2, findings_3}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, Detail> details;

  static {
    // hack to force ProGuard to consider Detail used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Detail.class);
  }

  /**
   * Maps from a resource slice (e.g. FHIR resource field path) to a set of sensitive text findings.
   * For example, Appointment.Narrative text1 --> {findings_1, findings_2, findings_3}
   * @return value or {@code null} for none
   */
  public java.util.Map<String, Detail> getDetails() {
    return details;
  }

  /**
   * Maps from a resource slice (e.g. FHIR resource field path) to a set of sensitive text findings.
   * For example, Appointment.Narrative text1 --> {findings_1, findings_2, findings_3}
   * @param details details or {@code null} for none
   */
  public SensitiveTextAnnotation setDetails(java.util.Map<String, Detail> details) {
    this.details = details;
    return this;
  }

  @Override
  public SensitiveTextAnnotation set(String fieldName, Object value) {
    return (SensitiveTextAnnotation) super.set(fieldName, value);
  }

  @Override
  public SensitiveTextAnnotation clone() {
    return (SensitiveTextAnnotation) super.clone();
  }

}
