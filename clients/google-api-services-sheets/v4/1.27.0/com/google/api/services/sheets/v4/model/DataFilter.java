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

package com.google.api.services.sheets.v4.model;

/**
 * Filter that describes what data should be selected or returned from a request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataFilter extends com.google.api.client.json.GenericJson {

  /**
   * Selects data that matches the specified A1 range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String a1Range;

  /**
   * Selects data associated with the developer metadata matching the criteria described by this
   * DeveloperMetadataLookup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeveloperMetadataLookup developerMetadataLookup;

  /**
   * Selects data that matches the range described by the GridRange.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridRange gridRange;

  /**
   * Selects data that matches the specified A1 range.
   * @return value or {@code null} for none
   */
  public java.lang.String getA1Range() {
    return a1Range;
  }

  /**
   * Selects data that matches the specified A1 range.
   * @param a1Range a1Range or {@code null} for none
   */
  public DataFilter setA1Range(java.lang.String a1Range) {
    this.a1Range = a1Range;
    return this;
  }

  /**
   * Selects data associated with the developer metadata matching the criteria described by this
   * DeveloperMetadataLookup.
   * @return value or {@code null} for none
   */
  public DeveloperMetadataLookup getDeveloperMetadataLookup() {
    return developerMetadataLookup;
  }

  /**
   * Selects data associated with the developer metadata matching the criteria described by this
   * DeveloperMetadataLookup.
   * @param developerMetadataLookup developerMetadataLookup or {@code null} for none
   */
  public DataFilter setDeveloperMetadataLookup(DeveloperMetadataLookup developerMetadataLookup) {
    this.developerMetadataLookup = developerMetadataLookup;
    return this;
  }

  /**
   * Selects data that matches the range described by the GridRange.
   * @return value or {@code null} for none
   */
  public GridRange getGridRange() {
    return gridRange;
  }

  /**
   * Selects data that matches the range described by the GridRange.
   * @param gridRange gridRange or {@code null} for none
   */
  public DataFilter setGridRange(GridRange gridRange) {
    this.gridRange = gridRange;
    return this;
  }

  @Override
  public DataFilter set(String fieldName, Object value) {
    return (DataFilter) super.set(fieldName, value);
  }

  @Override
  public DataFilter clone() {
    return (DataFilter) super.clone();
  }

}