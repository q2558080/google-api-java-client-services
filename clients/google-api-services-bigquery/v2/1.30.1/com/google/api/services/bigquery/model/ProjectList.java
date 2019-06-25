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

package com.google.api.services.bigquery.model;

/**
 * Model definition for ProjectList.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProjectList extends com.google.api.client.json.GenericJson {

  /**
   * A hash of the page of results
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The type of list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A token to request the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Projects to which you have at least READ access.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Projects> projects;

  static {
    // hack to force ProGuard to consider Projects used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Projects.class);
  }

  /**
   * The total number of projects in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalItems;

  /**
   * A hash of the page of results
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * A hash of the page of results
   * @param etag etag or {@code null} for none
   */
  public ProjectList setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The type of list.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of list.
   * @param kind kind or {@code null} for none
   */
  public ProjectList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A token to request the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to request the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ProjectList setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Projects to which you have at least READ access.
   * @return value or {@code null} for none
   */
  public java.util.List<Projects> getProjects() {
    return projects;
  }

  /**
   * Projects to which you have at least READ access.
   * @param projects projects or {@code null} for none
   */
  public ProjectList setProjects(java.util.List<Projects> projects) {
    this.projects = projects;
    return this;
  }

  /**
   * The total number of projects in the list.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalItems() {
    return totalItems;
  }

  /**
   * The total number of projects in the list.
   * @param totalItems totalItems or {@code null} for none
   */
  public ProjectList setTotalItems(java.lang.Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  @Override
  public ProjectList set(String fieldName, Object value) {
    return (ProjectList) super.set(fieldName, value);
  }

  @Override
  public ProjectList clone() {
    return (ProjectList) super.clone();
  }

  /**
   * Model definition for ProjectListProjects.
   */
  public static final class Projects extends com.google.api.client.json.GenericJson {

    /**
     * A descriptive name for this project.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String friendlyName;

    /**
     * An opaque ID of this project.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The resource type.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String kind;

    /**
     * The numeric ID of this project.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key @com.google.api.client.json.JsonString
    private java.math.BigInteger numericId;

    /**
     * A unique reference to this project.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private ProjectReference projectReference;

    /**
     * A descriptive name for this project.
     * @return value or {@code null} for none
     */
    public java.lang.String getFriendlyName() {
      return friendlyName;
    }

    /**
     * A descriptive name for this project.
     * @param friendlyName friendlyName or {@code null} for none
     */
    public Projects setFriendlyName(java.lang.String friendlyName) {
      this.friendlyName = friendlyName;
      return this;
    }

    /**
     * An opaque ID of this project.
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * An opaque ID of this project.
     * @param id id or {@code null} for none
     */
    public Projects setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    /**
     * The resource type.
     * @return value or {@code null} for none
     */
    public java.lang.String getKind() {
      return kind;
    }

    /**
     * The resource type.
     * @param kind kind or {@code null} for none
     */
    public Projects setKind(java.lang.String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * The numeric ID of this project.
     * @return value or {@code null} for none
     */
    public java.math.BigInteger getNumericId() {
      return numericId;
    }

    /**
     * The numeric ID of this project.
     * @param numericId numericId or {@code null} for none
     */
    public Projects setNumericId(java.math.BigInteger numericId) {
      this.numericId = numericId;
      return this;
    }

    /**
     * A unique reference to this project.
     * @return value or {@code null} for none
     */
    public ProjectReference getProjectReference() {
      return projectReference;
    }

    /**
     * A unique reference to this project.
     * @param projectReference projectReference or {@code null} for none
     */
    public Projects setProjectReference(ProjectReference projectReference) {
      this.projectReference = projectReference;
      return this;
    }

    @Override
    public Projects set(String fieldName, Object value) {
      return (Projects) super.set(fieldName, value);
    }

    @Override
    public Projects clone() {
      return (Projects) super.clone();
    }

  }

}