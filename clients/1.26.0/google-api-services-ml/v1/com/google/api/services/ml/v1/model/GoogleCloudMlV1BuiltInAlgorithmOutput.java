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

package com.google.api.services.ml.v1.model;

/**
 * Represents output related to a built-in algorithm Job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Machine Learning Engine. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMlV1BuiltInAlgorithmOutput extends com.google.api.client.json.GenericJson {

  /**
   * Framework on which the built-in algorithm was trained on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String framework;

  /**
   * Built-in algorithm's saved model path. Only set for non-hptuning succeeded jobs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelPath;

  /**
   * Python version on which the built-in algorithm was trained on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pythonVersion;

  /**
   * CMLE runtime version on which the built-in algorithm was trained on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String runtimeVersion;

  /**
   * Framework on which the built-in algorithm was trained on.
   * @return value or {@code null} for none
   */
  public java.lang.String getFramework() {
    return framework;
  }

  /**
   * Framework on which the built-in algorithm was trained on.
   * @param framework framework or {@code null} for none
   */
  public GoogleCloudMlV1BuiltInAlgorithmOutput setFramework(java.lang.String framework) {
    this.framework = framework;
    return this;
  }

  /**
   * Built-in algorithm's saved model path. Only set for non-hptuning succeeded jobs.
   * @return value or {@code null} for none
   */
  public java.lang.String getModelPath() {
    return modelPath;
  }

  /**
   * Built-in algorithm's saved model path. Only set for non-hptuning succeeded jobs.
   * @param modelPath modelPath or {@code null} for none
   */
  public GoogleCloudMlV1BuiltInAlgorithmOutput setModelPath(java.lang.String modelPath) {
    this.modelPath = modelPath;
    return this;
  }

  /**
   * Python version on which the built-in algorithm was trained on.
   * @return value or {@code null} for none
   */
  public java.lang.String getPythonVersion() {
    return pythonVersion;
  }

  /**
   * Python version on which the built-in algorithm was trained on.
   * @param pythonVersion pythonVersion or {@code null} for none
   */
  public GoogleCloudMlV1BuiltInAlgorithmOutput setPythonVersion(java.lang.String pythonVersion) {
    this.pythonVersion = pythonVersion;
    return this;
  }

  /**
   * CMLE runtime version on which the built-in algorithm was trained on.
   * @return value or {@code null} for none
   */
  public java.lang.String getRuntimeVersion() {
    return runtimeVersion;
  }

  /**
   * CMLE runtime version on which the built-in algorithm was trained on.
   * @param runtimeVersion runtimeVersion or {@code null} for none
   */
  public GoogleCloudMlV1BuiltInAlgorithmOutput setRuntimeVersion(java.lang.String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
    return this;
  }

  @Override
  public GoogleCloudMlV1BuiltInAlgorithmOutput set(String fieldName, Object value) {
    return (GoogleCloudMlV1BuiltInAlgorithmOutput) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1BuiltInAlgorithmOutput clone() {
    return (GoogleCloudMlV1BuiltInAlgorithmOutput) super.clone();
  }

}