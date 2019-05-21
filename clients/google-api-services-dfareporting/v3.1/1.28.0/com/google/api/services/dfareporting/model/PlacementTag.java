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

package com.google.api.services.dfareporting.model;

/**
 * Placement Tag
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PlacementTag extends com.google.api.client.json.GenericJson {

  /**
   * Placement ID
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long placementId;

  /**
   * Tags generated for this placement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TagData> tagDatas;

  /**
   * Placement ID
   * @return value or {@code null} for none
   */
  public java.lang.Long getPlacementId() {
    return placementId;
  }

  /**
   * Placement ID
   * @param placementId placementId or {@code null} for none
   */
  public PlacementTag setPlacementId(java.lang.Long placementId) {
    this.placementId = placementId;
    return this;
  }

  /**
   * Tags generated for this placement.
   * @return value or {@code null} for none
   */
  public java.util.List<TagData> getTagDatas() {
    return tagDatas;
  }

  /**
   * Tags generated for this placement.
   * @param tagDatas tagDatas or {@code null} for none
   */
  public PlacementTag setTagDatas(java.util.List<TagData> tagDatas) {
    this.tagDatas = tagDatas;
    return this;
  }

  @Override
  public PlacementTag set(String fieldName, Object value) {
    return (PlacementTag) super.set(fieldName, value);
  }

  @Override
  public PlacementTag clone() {
    return (PlacementTag) super.clone();
  }

}