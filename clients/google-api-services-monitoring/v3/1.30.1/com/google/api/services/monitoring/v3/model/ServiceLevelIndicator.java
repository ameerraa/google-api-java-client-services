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

package com.google.api.services.monitoring.v3.model;

/**
 * A Service-Level Indicator (SLI) describes the "performance" of a service. For some services, the
 * SLI is well-defined. In such cases, the SLI can be described easily by referencing the well-known
 * SLI and providing the needed parameters. Alternatively, a "custom" SLI can be defined with a
 * query to the underlying metric store. An SLI is defined to be good_service / total_service over
 * any queried time interval. The value of performance always falls into the range 0 <= performance
 * <= 1. A custom SLI describes how to compute this ratio, whether this is by dividing values from a
 * pair of time series, cutting a Distribution into good and bad counts, or counting time windows in
 * which the service complies with a criterion. For separation of concerns, a single Service-Level
 * Indicator measures performance for only one aspect of service quality, such as fraction of
 * successful queries or fast-enough queries.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceLevelIndicator extends com.google.api.client.json.GenericJson {

  /**
   * Basic SLI on a well-known service type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BasicSli basicSli;

  /**
   * Request-based SLIs
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RequestBasedSli requestBased;

  /**
   * Windows-based SLIs
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WindowsBasedSli windowsBased;

  /**
   * Basic SLI on a well-known service type.
   * @return value or {@code null} for none
   */
  public BasicSli getBasicSli() {
    return basicSli;
  }

  /**
   * Basic SLI on a well-known service type.
   * @param basicSli basicSli or {@code null} for none
   */
  public ServiceLevelIndicator setBasicSli(BasicSli basicSli) {
    this.basicSli = basicSli;
    return this;
  }

  /**
   * Request-based SLIs
   * @return value or {@code null} for none
   */
  public RequestBasedSli getRequestBased() {
    return requestBased;
  }

  /**
   * Request-based SLIs
   * @param requestBased requestBased or {@code null} for none
   */
  public ServiceLevelIndicator setRequestBased(RequestBasedSli requestBased) {
    this.requestBased = requestBased;
    return this;
  }

  /**
   * Windows-based SLIs
   * @return value or {@code null} for none
   */
  public WindowsBasedSli getWindowsBased() {
    return windowsBased;
  }

  /**
   * Windows-based SLIs
   * @param windowsBased windowsBased or {@code null} for none
   */
  public ServiceLevelIndicator setWindowsBased(WindowsBasedSli windowsBased) {
    this.windowsBased = windowsBased;
    return this;
  }

  @Override
  public ServiceLevelIndicator set(String fieldName, Object value) {
    return (ServiceLevelIndicator) super.set(fieldName, value);
  }

  @Override
  public ServiceLevelIndicator clone() {
    return (ServiceLevelIndicator) super.clone();
  }

}
