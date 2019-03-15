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
 * Provides "hints" to the speech recognizer to favor specific words and phrases in the results.
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
public final class GoogleCloudVideointelligenceV1p3beta1SpeechContext extends com.google.api.client.json.GenericJson {

  /**
   * *Optional* A list of strings containing words and phrases "hints" so that the speech
   * recognition is more likely to recognize them. This can be used to improve the accuracy for
   * specific words and phrases, for example, if specific commands are typically spoken by the user.
   * This can also be used to add additional words to the vocabulary of the recognizer. See [usage
   * limits](https://cloud.google.com/speech/limits#content).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> phrases;

  /**
   * *Optional* A list of strings containing words and phrases "hints" so that the speech
   * recognition is more likely to recognize them. This can be used to improve the accuracy for
   * specific words and phrases, for example, if specific commands are typically spoken by the user.
   * This can also be used to add additional words to the vocabulary of the recognizer. See [usage
   * limits](https://cloud.google.com/speech/limits#content).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPhrases() {
    return phrases;
  }

  /**
   * *Optional* A list of strings containing words and phrases "hints" so that the speech
   * recognition is more likely to recognize them. This can be used to improve the accuracy for
   * specific words and phrases, for example, if specific commands are typically spoken by the user.
   * This can also be used to add additional words to the vocabulary of the recognizer. See [usage
   * limits](https://cloud.google.com/speech/limits#content).
   * @param phrases phrases or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1SpeechContext setPhrases(java.util.List<java.lang.String> phrases) {
    this.phrases = phrases;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1SpeechContext set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p3beta1SpeechContext) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1SpeechContext clone() {
    return (GoogleCloudVideointelligenceV1p3beta1SpeechContext) super.clone();
  }

}
