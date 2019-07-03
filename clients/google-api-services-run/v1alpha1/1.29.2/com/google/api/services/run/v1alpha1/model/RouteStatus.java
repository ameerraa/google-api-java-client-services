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

package com.google.api.services.run.v1alpha1.model;

/**
 * RouteStatus communicates the observed state of the Route (from the controller).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RouteStatus extends com.google.api.client.json.GenericJson {

  /**
   * Similar to url, information on where the service is available on HTTP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Addressable address;

  /**
   * Conditions communicates information about ongoing/complete reconciliation processes that bring
   * the "spec" inline with the observed state of the world.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RouteCondition> conditions;

  static {
    // hack to force ProGuard to consider RouteCondition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(RouteCondition.class);
  }

  /**
   * Deprecated - use url instead. Domain holds the top-level domain that will distribute traffic
   * over the provided targets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * Deprecated - use address instead. For Cloud Run, identifical to domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domainInternal;

  /**
   * ObservedGeneration is the 'Generation' of the Route that was last processed by the controller.
   *
   * Clients polling for completed reconciliation should poll until observedGeneration =
   * metadata.generation and the Ready condition's status is True or False.
   *
   * Note that providing a trafficTarget that only has a configurationName will result in a Route
   * that does not increment either its metadata.generation or its observedGeneration, as new
   * "latest ready" revisions from the Configuration are processed without an update to the Route's
   * spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer observedGeneration;

  /**
   * Traffic holds the configured traffic distribution. These entries will always contain
   * RevisionName references. When ConfigurationName appears in the spec, this will hold the
   * LatestReadyRevisionName that we last observed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TrafficTarget> traffic;

  /**
   * URL holds the url that will distribute traffic over the provided traffic targets. It generally
   * has the form https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * Similar to url, information on where the service is available on HTTP.
   * @return value or {@code null} for none
   */
  public Addressable getAddress() {
    return address;
  }

  /**
   * Similar to url, information on where the service is available on HTTP.
   * @param address address or {@code null} for none
   */
  public RouteStatus setAddress(Addressable address) {
    this.address = address;
    return this;
  }

  /**
   * Conditions communicates information about ongoing/complete reconciliation processes that bring
   * the "spec" inline with the observed state of the world.
   * @return value or {@code null} for none
   */
  public java.util.List<RouteCondition> getConditions() {
    return conditions;
  }

  /**
   * Conditions communicates information about ongoing/complete reconciliation processes that bring
   * the "spec" inline with the observed state of the world.
   * @param conditions conditions or {@code null} for none
   */
  public RouteStatus setConditions(java.util.List<RouteCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * Deprecated - use url instead. Domain holds the top-level domain that will distribute traffic
   * over the provided targets.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * Deprecated - use url instead. Domain holds the top-level domain that will distribute traffic
   * over the provided targets.
   * @param domain domain or {@code null} for none
   */
  public RouteStatus setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Deprecated - use address instead. For Cloud Run, identifical to domain.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomainInternal() {
    return domainInternal;
  }

  /**
   * Deprecated - use address instead. For Cloud Run, identifical to domain.
   * @param domainInternal domainInternal or {@code null} for none
   */
  public RouteStatus setDomainInternal(java.lang.String domainInternal) {
    this.domainInternal = domainInternal;
    return this;
  }

  /**
   * ObservedGeneration is the 'Generation' of the Route that was last processed by the controller.
   *
   * Clients polling for completed reconciliation should poll until observedGeneration =
   * metadata.generation and the Ready condition's status is True or False.
   *
   * Note that providing a trafficTarget that only has a configurationName will result in a Route
   * that does not increment either its metadata.generation or its observedGeneration, as new
   * "latest ready" revisions from the Configuration are processed without an update to the Route's
   * spec.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getObservedGeneration() {
    return observedGeneration;
  }

  /**
   * ObservedGeneration is the 'Generation' of the Route that was last processed by the controller.
   *
   * Clients polling for completed reconciliation should poll until observedGeneration =
   * metadata.generation and the Ready condition's status is True or False.
   *
   * Note that providing a trafficTarget that only has a configurationName will result in a Route
   * that does not increment either its metadata.generation or its observedGeneration, as new
   * "latest ready" revisions from the Configuration are processed without an update to the Route's
   * spec.
   * @param observedGeneration observedGeneration or {@code null} for none
   */
  public RouteStatus setObservedGeneration(java.lang.Integer observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * Traffic holds the configured traffic distribution. These entries will always contain
   * RevisionName references. When ConfigurationName appears in the spec, this will hold the
   * LatestReadyRevisionName that we last observed.
   * @return value or {@code null} for none
   */
  public java.util.List<TrafficTarget> getTraffic() {
    return traffic;
  }

  /**
   * Traffic holds the configured traffic distribution. These entries will always contain
   * RevisionName references. When ConfigurationName appears in the spec, this will hold the
   * LatestReadyRevisionName that we last observed.
   * @param traffic traffic or {@code null} for none
   */
  public RouteStatus setTraffic(java.util.List<TrafficTarget> traffic) {
    this.traffic = traffic;
    return this;
  }

  /**
   * URL holds the url that will distribute traffic over the provided traffic targets. It generally
   * has the form https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * URL holds the url that will distribute traffic over the provided traffic targets. It generally
   * has the form https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app
   * @param url url or {@code null} for none
   */
  public RouteStatus setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public RouteStatus set(String fieldName, Object value) {
    return (RouteStatus) super.set(fieldName, value);
  }

  @Override
  public RouteStatus clone() {
    return (RouteStatus) super.clone();
  }

}