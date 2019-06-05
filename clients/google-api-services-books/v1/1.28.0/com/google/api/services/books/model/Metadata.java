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

package com.google.api.services.books.model;

/**
 * Model definition for Metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Metadata extends com.google.api.client.json.GenericJson {

  /**
   * A list of offline dictionary metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Items> items;

  static {
    // hack to force ProGuard to consider Items used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Items.class);
  }

  /**
   * Resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A list of offline dictionary metadata.
   * @return value or {@code null} for none
   */
  public java.util.List<Items> getItems() {
    return items;
  }

  /**
   * A list of offline dictionary metadata.
   * @param items items or {@code null} for none
   */
  public Metadata setItems(java.util.List<Items> items) {
    this.items = items;
    return this;
  }

  /**
   * Resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type.
   * @param kind kind or {@code null} for none
   */
  public Metadata setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public Metadata set(String fieldName, Object value) {
    return (Metadata) super.set(fieldName, value);
  }

  @Override
  public Metadata clone() {
    return (Metadata) super.clone();
  }

  /**
   * Model definition for MetadataItems.
   */
  public static final class Items extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key("download_url")
    private java.lang.String downloadUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key("encrypted_key")
    private java.lang.String encryptedKey;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String language;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key @com.google.api.client.json.JsonString
    private java.lang.Long size;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key @com.google.api.client.json.JsonString
    private java.lang.Long version;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getDownloadUrl() {
      return downloadUrl;
    }

    /**
     * @param downloadUrl downloadUrl or {@code null} for none
     */
    public Items setDownloadUrl(java.lang.String downloadUrl) {
      this.downloadUrl = downloadUrl;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getEncryptedKey() {
      return encryptedKey;
    }

    /**
     * @param encryptedKey encryptedKey or {@code null} for none
     */
    public Items setEncryptedKey(java.lang.String encryptedKey) {
      this.encryptedKey = encryptedKey;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLanguage() {
      return language;
    }

    /**
     * @param language language or {@code null} for none
     */
    public Items setLanguage(java.lang.String language) {
      this.language = language;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getSize() {
      return size;
    }

    /**
     * @param size size or {@code null} for none
     */
    public Items setSize(java.lang.Long size) {
      this.size = size;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getVersion() {
      return version;
    }

    /**
     * @param version version or {@code null} for none
     */
    public Items setVersion(java.lang.Long version) {
      this.version = version;
      return this;
    }

    @Override
    public Items set(String fieldName, Object value) {
      return (Items) super.set(fieldName, value);
    }

    @Override
    public Items clone() {
      return (Items) super.clone();
    }

  }

}