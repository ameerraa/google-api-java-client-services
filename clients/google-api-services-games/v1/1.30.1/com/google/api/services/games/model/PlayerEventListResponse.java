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

package com.google.api.services.games.model;

/**
 * A ListByPlayer response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PlayerEventListResponse extends com.google.api.client.json.GenericJson {

  /**
   * The player events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PlayerEvent> items;

  static {
    // hack to force ProGuard to consider PlayerEvent used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PlayerEvent.class);
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#playerEventListResponse`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The pagination token for the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The player events.
   * @return value or {@code null} for none
   */
  public java.util.List<PlayerEvent> getItems() {
    return items;
  }

  /**
   * The player events.
   * @param items items or {@code null} for none
   */
  public PlayerEventListResponse setItems(java.util.List<PlayerEvent> items) {
    this.items = items;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#playerEventListResponse`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#playerEventListResponse`.
   * @param kind kind or {@code null} for none
   */
  public PlayerEventListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The pagination token for the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The pagination token for the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public PlayerEventListResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public PlayerEventListResponse set(String fieldName, Object value) {
    return (PlayerEventListResponse) super.set(fieldName, value);
  }

  @Override
  public PlayerEventListResponse clone() {
    return (PlayerEventListResponse) super.clone();
  }

}
