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

package com.google.api.services.jobs.v3p1beta1.model;

/**
 * Input only.
 *
 * Update job request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateJobRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The Job to be updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Job job;

  /**
   * Optional but strongly recommended to be provided for the best service experience.
   *
   * If update_mask is provided, only the specified fields in job are updated. Otherwise all the
   * fields are updated.
   *
   * A field mask to restrict the fields that are updated. Only top level fields of Job are
   * supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * Required. The Job to be updated.
   * @return value or {@code null} for none
   */
  public Job getJob() {
    return job;
  }

  /**
   * Required. The Job to be updated.
   * @param job job or {@code null} for none
   */
  public UpdateJobRequest setJob(Job job) {
    this.job = job;
    return this;
  }

  /**
   * Optional but strongly recommended to be provided for the best service experience.
   *
   * If update_mask is provided, only the specified fields in job are updated. Otherwise all the
   * fields are updated.
   *
   * A field mask to restrict the fields that are updated. Only top level fields of Job are
   * supported.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * Optional but strongly recommended to be provided for the best service experience.
   *
   * If update_mask is provided, only the specified fields in job are updated. Otherwise all the
   * fields are updated.
   *
   * A field mask to restrict the fields that are updated. Only top level fields of Job are
   * supported.
   * @param updateMask updateMask or {@code null} for none
   */
  public UpdateJobRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public UpdateJobRequest set(String fieldName, Object value) {
    return (UpdateJobRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateJobRequest clone() {
    return (UpdateJobRequest) super.clone();
  }

}
