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

package com.google.api.services.jobs.v3.model;

/**
 * A Company resource represents a company in the service. A company is the entity that owns job
 * postings, that is, the hiring entity responsible for employing applicants for the job position.
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
public final class Company extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The URI to employer's career site or careers page on the employer's web site, for
   * example, "https://careers.google.com".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String careerSiteUri;

  /**
   * Output only. Derived details about the company.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CompanyDerivedInfo derivedInfo;

  /**
   * Required. The display name of the company, for example, "Google LLC".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. Equal Employment Opportunity legal disclaimer text to be associated with all jobs,
   * and typically to be displayed in all roles.
   *
   * The maximum number of allowed characters is 500.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eeoText;

  /**
   * Required. Client side company identifier, used to uniquely identify the company.
   *
   * The maximum number of allowed characters is 255.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalId;

  /**
   * Optional. The street address of the company's main headquarters, which may be different from
   * the job location. The service attempts to geolocate the provided address, and populates a more
   * specific location wherever possible in DerivedInfo.headquarters_location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String headquartersAddress;

  /**
   * Optional. Set to true if it is the hiring agency that post jobs for other employers.
   *
   * Defaults to false if not provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hiringAgency;

  /**
   * Optional. A URI that hosts the employer's company logo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUri;

  /**
   * Optional. A list of keys of filterable Job.custom_attributes, whose corresponding
   * `string_values` are used in keyword search. Jobs with `string_values` under these specified
   * field keys are returned if any of the values matches the search keyword. Custom field values
   * with parenthesis, brackets and special symbols won't be properly searchable, and those keyword
   * queries need to be surrounded by quotes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> keywordSearchableJobCustomAttributes;

  /**
   * Required during company update.
   *
   * The resource name for a company. This is generated by the service when a company is created.
   *
   * The format is "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-
   * project/companies/foo".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The employer's company size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String size;

  /**
   * Output only. Indicates whether a company is flagged to be suspended from public availability by
   * the service when job content appears suspicious, abusive, or spammy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean suspended;

  /**
   * Optional. The URI representing the company's primary web site or home page, for example,
   * "https://www.google.com".
   *
   * The maximum number of allowed characters is 255.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String websiteUri;

  /**
   * Optional. The URI to employer's career site or careers page on the employer's web site, for
   * example, "https://careers.google.com".
   * @return value or {@code null} for none
   */
  public java.lang.String getCareerSiteUri() {
    return careerSiteUri;
  }

  /**
   * Optional. The URI to employer's career site or careers page on the employer's web site, for
   * example, "https://careers.google.com".
   * @param careerSiteUri careerSiteUri or {@code null} for none
   */
  public Company setCareerSiteUri(java.lang.String careerSiteUri) {
    this.careerSiteUri = careerSiteUri;
    return this;
  }

  /**
   * Output only. Derived details about the company.
   * @return value or {@code null} for none
   */
  public CompanyDerivedInfo getDerivedInfo() {
    return derivedInfo;
  }

  /**
   * Output only. Derived details about the company.
   * @param derivedInfo derivedInfo or {@code null} for none
   */
  public Company setDerivedInfo(CompanyDerivedInfo derivedInfo) {
    this.derivedInfo = derivedInfo;
    return this;
  }

  /**
   * Required. The display name of the company, for example, "Google LLC".
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the company, for example, "Google LLC".
   * @param displayName displayName or {@code null} for none
   */
  public Company setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. Equal Employment Opportunity legal disclaimer text to be associated with all jobs,
   * and typically to be displayed in all roles.
   *
   * The maximum number of allowed characters is 500.
   * @return value or {@code null} for none
   */
  public java.lang.String getEeoText() {
    return eeoText;
  }

  /**
   * Optional. Equal Employment Opportunity legal disclaimer text to be associated with all jobs,
   * and typically to be displayed in all roles.
   *
   * The maximum number of allowed characters is 500.
   * @param eeoText eeoText or {@code null} for none
   */
  public Company setEeoText(java.lang.String eeoText) {
    this.eeoText = eeoText;
    return this;
  }

  /**
   * Required. Client side company identifier, used to uniquely identify the company.
   *
   * The maximum number of allowed characters is 255.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalId() {
    return externalId;
  }

  /**
   * Required. Client side company identifier, used to uniquely identify the company.
   *
   * The maximum number of allowed characters is 255.
   * @param externalId externalId or {@code null} for none
   */
  public Company setExternalId(java.lang.String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Optional. The street address of the company's main headquarters, which may be different from
   * the job location. The service attempts to geolocate the provided address, and populates a more
   * specific location wherever possible in DerivedInfo.headquarters_location.
   * @return value or {@code null} for none
   */
  public java.lang.String getHeadquartersAddress() {
    return headquartersAddress;
  }

  /**
   * Optional. The street address of the company's main headquarters, which may be different from
   * the job location. The service attempts to geolocate the provided address, and populates a more
   * specific location wherever possible in DerivedInfo.headquarters_location.
   * @param headquartersAddress headquartersAddress or {@code null} for none
   */
  public Company setHeadquartersAddress(java.lang.String headquartersAddress) {
    this.headquartersAddress = headquartersAddress;
    return this;
  }

  /**
   * Optional. Set to true if it is the hiring agency that post jobs for other employers.
   *
   * Defaults to false if not provided.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHiringAgency() {
    return hiringAgency;
  }

  /**
   * Optional. Set to true if it is the hiring agency that post jobs for other employers.
   *
   * Defaults to false if not provided.
   * @param hiringAgency hiringAgency or {@code null} for none
   */
  public Company setHiringAgency(java.lang.Boolean hiringAgency) {
    this.hiringAgency = hiringAgency;
    return this;
  }

  /**
   * Optional. A URI that hosts the employer's company logo.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUri() {
    return imageUri;
  }

  /**
   * Optional. A URI that hosts the employer's company logo.
   * @param imageUri imageUri or {@code null} for none
   */
  public Company setImageUri(java.lang.String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

  /**
   * Optional. A list of keys of filterable Job.custom_attributes, whose corresponding
   * `string_values` are used in keyword search. Jobs with `string_values` under these specified
   * field keys are returned if any of the values matches the search keyword. Custom field values
   * with parenthesis, brackets and special symbols won't be properly searchable, and those keyword
   * queries need to be surrounded by quotes.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getKeywordSearchableJobCustomAttributes() {
    return keywordSearchableJobCustomAttributes;
  }

  /**
   * Optional. A list of keys of filterable Job.custom_attributes, whose corresponding
   * `string_values` are used in keyword search. Jobs with `string_values` under these specified
   * field keys are returned if any of the values matches the search keyword. Custom field values
   * with parenthesis, brackets and special symbols won't be properly searchable, and those keyword
   * queries need to be surrounded by quotes.
   * @param keywordSearchableJobCustomAttributes keywordSearchableJobCustomAttributes or {@code null} for none
   */
  public Company setKeywordSearchableJobCustomAttributes(java.util.List<java.lang.String> keywordSearchableJobCustomAttributes) {
    this.keywordSearchableJobCustomAttributes = keywordSearchableJobCustomAttributes;
    return this;
  }

  /**
   * Required during company update.
   *
   * The resource name for a company. This is generated by the service when a company is created.
   *
   * The format is "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-
   * project/companies/foo".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required during company update.
   *
   * The resource name for a company. This is generated by the service when a company is created.
   *
   * The format is "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-
   * project/companies/foo".
   * @param name name or {@code null} for none
   */
  public Company setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. The employer's company size.
   * @return value or {@code null} for none
   */
  public java.lang.String getSize() {
    return size;
  }

  /**
   * Optional. The employer's company size.
   * @param size size or {@code null} for none
   */
  public Company setSize(java.lang.String size) {
    this.size = size;
    return this;
  }

  /**
   * Output only. Indicates whether a company is flagged to be suspended from public availability by
   * the service when job content appears suspicious, abusive, or spammy.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSuspended() {
    return suspended;
  }

  /**
   * Output only. Indicates whether a company is flagged to be suspended from public availability by
   * the service when job content appears suspicious, abusive, or spammy.
   * @param suspended suspended or {@code null} for none
   */
  public Company setSuspended(java.lang.Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Optional. The URI representing the company's primary web site or home page, for example,
   * "https://www.google.com".
   *
   * The maximum number of allowed characters is 255.
   * @return value or {@code null} for none
   */
  public java.lang.String getWebsiteUri() {
    return websiteUri;
  }

  /**
   * Optional. The URI representing the company's primary web site or home page, for example,
   * "https://www.google.com".
   *
   * The maximum number of allowed characters is 255.
   * @param websiteUri websiteUri or {@code null} for none
   */
  public Company setWebsiteUri(java.lang.String websiteUri) {
    this.websiteUri = websiteUri;
    return this;
  }

  @Override
  public Company set(String fieldName, Object value) {
    return (Company) super.set(fieldName, value);
  }

  @Override
  public Company clone() {
    return (Company) super.clone();
  }

}
