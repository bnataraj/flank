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
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.testing.model;

/**
 * A description of how to run the test.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Testing API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TestSpecification extends com.google.api.client.json.GenericJson {

  /**
   * An Android instrumentation test.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AndroidInstrumentationTest androidInstrumentationTest;

  /**
   * An Android robo test.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AndroidRoboTest androidRoboTest;

  /**
   * An Android Application with a Test Loop
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AndroidTestLoop androidTestLoop;

  /**
   * Enables automatic Google account login. If set, the service will automatically generate a
   * Google test account and add it to the device, before executing the test. Note that test
   * accounts might be reused. Many applications show their full set of functionalities when an
   * account is present on the device. Logging into the device with these generated accounts allows
   * testing more functionalities. Default is false. Optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoGoogleLogin;

  /**
   * Disables performance metrics recording; may reduce test latency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disablePerformanceMetrics;

  /**
   * Disables video recording; may reduce test latency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableVideoRecording;

  /**
   * Test setup requirements e.g. files to install, bootstrap scripts Optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TestSetup testSetup;

  /**
   * Max time a test execution is allowed to run before it is automatically cancelled. Optional,
   * default is 5 min.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String testTimeout;

  /**
   * An Android instrumentation test.
   * @return value or {@code null} for none
   */
  public AndroidInstrumentationTest getAndroidInstrumentationTest() {
    return androidInstrumentationTest;
  }

  /**
   * An Android instrumentation test.
   * @param androidInstrumentationTest androidInstrumentationTest or {@code null} for none
   */
  public TestSpecification setAndroidInstrumentationTest(AndroidInstrumentationTest androidInstrumentationTest) {
    this.androidInstrumentationTest = androidInstrumentationTest;
    return this;
  }

  /**
   * An Android robo test.
   * @return value or {@code null} for none
   */
  public AndroidRoboTest getAndroidRoboTest() {
    return androidRoboTest;
  }

  /**
   * An Android robo test.
   * @param androidRoboTest androidRoboTest or {@code null} for none
   */
  public TestSpecification setAndroidRoboTest(AndroidRoboTest androidRoboTest) {
    this.androidRoboTest = androidRoboTest;
    return this;
  }

  /**
   * An Android Application with a Test Loop
   * @return value or {@code null} for none
   */
  public AndroidTestLoop getAndroidTestLoop() {
    return androidTestLoop;
  }

  /**
   * An Android Application with a Test Loop
   * @param androidTestLoop androidTestLoop or {@code null} for none
   */
  public TestSpecification setAndroidTestLoop(AndroidTestLoop androidTestLoop) {
    this.androidTestLoop = androidTestLoop;
    return this;
  }

  /**
   * Enables automatic Google account login. If set, the service will automatically generate a
   * Google test account and add it to the device, before executing the test. Note that test
   * accounts might be reused. Many applications show their full set of functionalities when an
   * account is present on the device. Logging into the device with these generated accounts allows
   * testing more functionalities. Default is false. Optional
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoGoogleLogin() {
    return autoGoogleLogin;
  }

  /**
   * Enables automatic Google account login. If set, the service will automatically generate a
   * Google test account and add it to the device, before executing the test. Note that test
   * accounts might be reused. Many applications show their full set of functionalities when an
   * account is present on the device. Logging into the device with these generated accounts allows
   * testing more functionalities. Default is false. Optional
   * @param autoGoogleLogin autoGoogleLogin or {@code null} for none
   */
  public TestSpecification setAutoGoogleLogin(java.lang.Boolean autoGoogleLogin) {
    this.autoGoogleLogin = autoGoogleLogin;
    return this;
  }

  /**
   * Disables performance metrics recording; may reduce test latency.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisablePerformanceMetrics() {
    return disablePerformanceMetrics;
  }

  /**
   * Disables performance metrics recording; may reduce test latency.
   * @param disablePerformanceMetrics disablePerformanceMetrics or {@code null} for none
   */
  public TestSpecification setDisablePerformanceMetrics(java.lang.Boolean disablePerformanceMetrics) {
    this.disablePerformanceMetrics = disablePerformanceMetrics;
    return this;
  }

  /**
   * Disables video recording; may reduce test latency.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableVideoRecording() {
    return disableVideoRecording;
  }

  /**
   * Disables video recording; may reduce test latency.
   * @param disableVideoRecording disableVideoRecording or {@code null} for none
   */
  public TestSpecification setDisableVideoRecording(java.lang.Boolean disableVideoRecording) {
    this.disableVideoRecording = disableVideoRecording;
    return this;
  }

  /**
   * Test setup requirements e.g. files to install, bootstrap scripts Optional
   * @return value or {@code null} for none
   */
  public TestSetup getTestSetup() {
    return testSetup;
  }

  /**
   * Test setup requirements e.g. files to install, bootstrap scripts Optional
   * @param testSetup testSetup or {@code null} for none
   */
  public TestSpecification setTestSetup(TestSetup testSetup) {
    this.testSetup = testSetup;
    return this;
  }

  /**
   * Max time a test execution is allowed to run before it is automatically cancelled. Optional,
   * default is 5 min.
   * @return value or {@code null} for none
   */
  public String getTestTimeout() {
    return testTimeout;
  }

  /**
   * Max time a test execution is allowed to run before it is automatically cancelled. Optional,
   * default is 5 min.
   * @param testTimeout testTimeout or {@code null} for none
   */
  public TestSpecification setTestTimeout(String testTimeout) {
    this.testTimeout = testTimeout;
    return this;
  }

  @Override
  public TestSpecification set(String fieldName, Object value) {
    return (TestSpecification) super.set(fieldName, value);
  }

  @Override
  public TestSpecification clone() {
    return (TestSpecification) super.clone();
  }

}
