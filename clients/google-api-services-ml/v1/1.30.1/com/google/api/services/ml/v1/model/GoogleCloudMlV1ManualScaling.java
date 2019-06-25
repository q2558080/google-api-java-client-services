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
 * Options for manually scaling a model.
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
public final class GoogleCloudMlV1ManualScaling extends com.google.api.client.json.GenericJson {

  /**
   * The number of nodes to allocate for this model. These nodes are always up, starting from the
   * time the model is deployed, so the cost of operating this model will be proportional to `nodes`
   * * number of hours since last billing cycle plus the cost for each prediction performed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer nodes;

  /**
   * The number of nodes to allocate for this model. These nodes are always up, starting from the
   * time the model is deployed, so the cost of operating this model will be proportional to `nodes`
   * * number of hours since last billing cycle plus the cost for each prediction performed.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNodes() {
    return nodes;
  }

  /**
   * The number of nodes to allocate for this model. These nodes are always up, starting from the
   * time the model is deployed, so the cost of operating this model will be proportional to `nodes`
   * * number of hours since last billing cycle plus the cost for each prediction performed.
   * @param nodes nodes or {@code null} for none
   */
  public GoogleCloudMlV1ManualScaling setNodes(java.lang.Integer nodes) {
    this.nodes = nodes;
    return this;
  }

  @Override
  public GoogleCloudMlV1ManualScaling set(String fieldName, Object value) {
    return (GoogleCloudMlV1ManualScaling) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1ManualScaling clone() {
    return (GoogleCloudMlV1ManualScaling) super.clone();
  }

}