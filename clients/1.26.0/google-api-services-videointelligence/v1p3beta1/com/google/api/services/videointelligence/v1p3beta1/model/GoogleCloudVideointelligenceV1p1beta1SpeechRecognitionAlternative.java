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

package com.google.api.services.videointelligence.v1p3beta1.model;

/**
 * Alternative hypotheses (a.k.a. n-best list).
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
public final class GoogleCloudVideointelligenceV1p1beta1SpeechRecognitionAlternative extends com.google.api.client.json.GenericJson {

  /**
   * The confidence estimate between 0.0 and 1.0. A higher number indicates an estimated greater
   * likelihood that the recognized words are correct. This field is typically provided only for the
   * top hypothesis, and only for `is_final=true` results. Clients should not rely on the
   * `confidence` field as it is not guaranteed to be accurate or consistent. The default of 0.0 is
   * a sentinel value indicating `confidence` was not set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Transcript text representing the words that the user spoke.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transcript;

  /**
   * A list of word-specific information for each recognized word.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p1beta1WordInfo> words;

  /**
   * The confidence estimate between 0.0 and 1.0. A higher number indicates an estimated greater
   * likelihood that the recognized words are correct. This field is typically provided only for the
   * top hypothesis, and only for `is_final=true` results. Clients should not rely on the
   * `confidence` field as it is not guaranteed to be accurate or consistent. The default of 0.0 is
   * a sentinel value indicating `confidence` was not set.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * The confidence estimate between 0.0 and 1.0. A higher number indicates an estimated greater
   * likelihood that the recognized words are correct. This field is typically provided only for the
   * top hypothesis, and only for `is_final=true` results. Clients should not rely on the
   * `confidence` field as it is not guaranteed to be accurate or consistent. The default of 0.0 is
   * a sentinel value indicating `confidence` was not set.
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1SpeechRecognitionAlternative setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Transcript text representing the words that the user spoke.
   * @return value or {@code null} for none
   */
  public java.lang.String getTranscript() {
    return transcript;
  }

  /**
   * Transcript text representing the words that the user spoke.
   * @param transcript transcript or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1SpeechRecognitionAlternative setTranscript(java.lang.String transcript) {
    this.transcript = transcript;
    return this;
  }

  /**
   * A list of word-specific information for each recognized word.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p1beta1WordInfo> getWords() {
    return words;
  }

  /**
   * A list of word-specific information for each recognized word.
   * @param words words or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1SpeechRecognitionAlternative setWords(java.util.List<GoogleCloudVideointelligenceV1p1beta1WordInfo> words) {
    this.words = words;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1SpeechRecognitionAlternative set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p1beta1SpeechRecognitionAlternative) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1SpeechRecognitionAlternative clone() {
    return (GoogleCloudVideointelligenceV1p1beta1SpeechRecognitionAlternative) super.clone();
  }

}
