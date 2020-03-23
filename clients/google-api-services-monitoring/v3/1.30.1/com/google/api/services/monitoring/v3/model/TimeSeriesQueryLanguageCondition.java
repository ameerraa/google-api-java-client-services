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
 * A condition type that allows alert policies to be defined using the time series query language.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimeSeriesQueryLanguageCondition extends com.google.api.client.json.GenericJson {

  /**
   * A query in the time series query language format that generates time series indicating points
   * in time that the condition should be considered active.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * A short explanation of what the query represents. For example:"Error ratio exceeds 15% for >5%
   * of servers in >2 regions"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String summary;

  /**
   * A query in the time series query language format that generates time series indicating points
   * in time that the condition should be considered active.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * A query in the time series query language format that generates time series indicating points
   * in time that the condition should be considered active.
   * @param query query or {@code null} for none
   */
  public TimeSeriesQueryLanguageCondition setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * A short explanation of what the query represents. For example:"Error ratio exceeds 15% for >5%
   * of servers in >2 regions"
   * @return value or {@code null} for none
   */
  public java.lang.String getSummary() {
    return summary;
  }

  /**
   * A short explanation of what the query represents. For example:"Error ratio exceeds 15% for >5%
   * of servers in >2 regions"
   * @param summary summary or {@code null} for none
   */
  public TimeSeriesQueryLanguageCondition setSummary(java.lang.String summary) {
    this.summary = summary;
    return this;
  }

  @Override
  public TimeSeriesQueryLanguageCondition set(String fieldName, Object value) {
    return (TimeSeriesQueryLanguageCondition) super.set(fieldName, value);
  }

  @Override
  public TimeSeriesQueryLanguageCondition clone() {
    return (TimeSeriesQueryLanguageCondition) super.clone();
  }

}
