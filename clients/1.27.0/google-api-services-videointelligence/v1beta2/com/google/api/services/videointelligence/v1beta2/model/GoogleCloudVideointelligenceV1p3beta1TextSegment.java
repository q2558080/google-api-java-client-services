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

package com.google.api.services.videointelligence.v1beta2.model;

/**
 * Video segment level annotation results for text detection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1p3beta1TextSegment extends com.google.api.client.json.GenericJson {

  /**
   * Confidence for the track of detected text. It is calculated as the highest over all frames
   * where OCR detected text appears.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Information related to the frames where OCR detected text appears.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p3beta1TextFrame> frames;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1p3beta1TextFrame used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1p3beta1TextFrame.class);
  }

  /**
   * Video segment where a text snippet was detected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p3beta1VideoSegment segment;

  /**
   * Confidence for the track of detected text. It is calculated as the highest over all frames
   * where OCR detected text appears.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Confidence for the track of detected text. It is calculated as the highest over all frames
   * where OCR detected text appears.
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1TextSegment setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Information related to the frames where OCR detected text appears.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p3beta1TextFrame> getFrames() {
    return frames;
  }

  /**
   * Information related to the frames where OCR detected text appears.
   * @param frames frames or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1TextSegment setFrames(java.util.List<GoogleCloudVideointelligenceV1p3beta1TextFrame> frames) {
    this.frames = frames;
    return this;
  }

  /**
   * Video segment where a text snippet was detected.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1VideoSegment getSegment() {
    return segment;
  }

  /**
   * Video segment where a text snippet was detected.
   * @param segment segment or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1TextSegment setSegment(GoogleCloudVideointelligenceV1p3beta1VideoSegment segment) {
    this.segment = segment;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1TextSegment set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p3beta1TextSegment) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1TextSegment clone() {
    return (GoogleCloudVideointelligenceV1p3beta1TextSegment) super.clone();
  }

}
