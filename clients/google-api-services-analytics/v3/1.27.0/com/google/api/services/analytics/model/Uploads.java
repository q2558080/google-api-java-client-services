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

package com.google.api.services.analytics.model;

/**
 * Upload collection lists Analytics uploads to which the user has access. Each custom data source
 * can have a set of uploads. Each resource in the upload collection corresponds to a single
 * Analytics data upload.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Uploads extends com.google.api.client.json.GenericJson {

  /**
   * A list of uploads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Upload> items;

  static {
    // hack to force ProGuard to consider Upload used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Upload.class);
  }

  /**
   * The maximum number of resources the response can contain, regardless of the actual number of
   * resources returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or
   * otherwise specified by the max-results query parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer itemsPerPage;

  /**
   * Collection type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Link to next page for this upload collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextLink;

  /**
   * Link to previous page for this upload collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String previousLink;

  /**
   * The starting index of the resources, which is 1 by default or otherwise specified by the start-
   * index query parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer startIndex;

  /**
   * The total number of results for the query, regardless of the number of resources in the result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalResults;

  /**
   * A list of uploads.
   * @return value or {@code null} for none
   */
  public java.util.List<Upload> getItems() {
    return items;
  }

  /**
   * A list of uploads.
   * @param items items or {@code null} for none
   */
  public Uploads setItems(java.util.List<Upload> items) {
    this.items = items;
    return this;
  }

  /**
   * The maximum number of resources the response can contain, regardless of the actual number of
   * resources returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or
   * otherwise specified by the max-results query parameter.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getItemsPerPage() {
    return itemsPerPage;
  }

  /**
   * The maximum number of resources the response can contain, regardless of the actual number of
   * resources returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or
   * otherwise specified by the max-results query parameter.
   * @param itemsPerPage itemsPerPage or {@code null} for none
   */
  public Uploads setItemsPerPage(java.lang.Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  /**
   * Collection type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Collection type.
   * @param kind kind or {@code null} for none
   */
  public Uploads setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Link to next page for this upload collection.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextLink() {
    return nextLink;
  }

  /**
   * Link to next page for this upload collection.
   * @param nextLink nextLink or {@code null} for none
   */
  public Uploads setNextLink(java.lang.String nextLink) {
    this.nextLink = nextLink;
    return this;
  }

  /**
   * Link to previous page for this upload collection.
   * @return value or {@code null} for none
   */
  public java.lang.String getPreviousLink() {
    return previousLink;
  }

  /**
   * Link to previous page for this upload collection.
   * @param previousLink previousLink or {@code null} for none
   */
  public Uploads setPreviousLink(java.lang.String previousLink) {
    this.previousLink = previousLink;
    return this;
  }

  /**
   * The starting index of the resources, which is 1 by default or otherwise specified by the start-
   * index query parameter.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStartIndex() {
    return startIndex;
  }

  /**
   * The starting index of the resources, which is 1 by default or otherwise specified by the start-
   * index query parameter.
   * @param startIndex startIndex or {@code null} for none
   */
  public Uploads setStartIndex(java.lang.Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The total number of results for the query, regardless of the number of resources in the result.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalResults() {
    return totalResults;
  }

  /**
   * The total number of results for the query, regardless of the number of resources in the result.
   * @param totalResults totalResults or {@code null} for none
   */
  public Uploads setTotalResults(java.lang.Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  @Override
  public Uploads set(String fieldName, Object value) {
    return (Uploads) super.set(fieldName, value);
  }

  @Override
  public Uploads clone() {
    return (Uploads) super.clone();
  }

}
