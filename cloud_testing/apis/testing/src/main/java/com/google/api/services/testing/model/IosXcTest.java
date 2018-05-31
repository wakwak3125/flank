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

package com.google.api.services.testing.model;

/**
 * A test of an iOS application that uses the XCTest framework. Xcode supports the option to "build
 * for testing", which generates an .xctestrun file that contains a test specification (arguments,
 * test methods, etc). This test type accepts a zip file containing the .xctestrun file and its
 * corresponding Debug-iphoneos directory that contains all of the binaries needed to run the tests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IosXcTest extends com.google.api.client.json.GenericJson {

  /**
   * The .zip containing the .xctestrun file and the Debug-iphoneos directory from
   * DerivedData/Build/Products. The .xctestrun file in this zip is ignored if the xctestrun field
   * is specified. Required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FileReference testsZip;

  /**
   * An .xctestrun file that will override the .xctestrun file in the tests zip. Because the
   * .xctestrun file contains environment variables along with test methods to run and/or ignore,
   * this can be useful for sharding tests. Optional, default is taken from the tests zip.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FileReference xctestrun;

  /**
   * The .zip containing the .xctestrun file and the Debug-iphoneos directory from
   * DerivedData/Build/Products. The .xctestrun file in this zip is ignored if the xctestrun field
   * is specified. Required
   * @return value or {@code null} for none
   */
  public FileReference getTestsZip() {
    return testsZip;
  }

  /**
   * The .zip containing the .xctestrun file and the Debug-iphoneos directory from
   * DerivedData/Build/Products. The .xctestrun file in this zip is ignored if the xctestrun field
   * is specified. Required
   * @param testsZip testsZip or {@code null} for none
   */
  public IosXcTest setTestsZip(FileReference testsZip) {
    this.testsZip = testsZip;
    return this;
  }

  /**
   * An .xctestrun file that will override the .xctestrun file in the tests zip. Because the
   * .xctestrun file contains environment variables along with test methods to run and/or ignore,
   * this can be useful for sharding tests. Optional, default is taken from the tests zip.
   * @return value or {@code null} for none
   */
  public FileReference getXctestrun() {
    return xctestrun;
  }

  /**
   * An .xctestrun file that will override the .xctestrun file in the tests zip. Because the
   * .xctestrun file contains environment variables along with test methods to run and/or ignore,
   * this can be useful for sharding tests. Optional, default is taken from the tests zip.
   * @param xctestrun xctestrun or {@code null} for none
   */
  public IosXcTest setXctestrun(FileReference xctestrun) {
    this.xctestrun = xctestrun;
    return this;
  }

  @Override
  public IosXcTest set(String fieldName, Object value) {
    return (IosXcTest) super.set(fieldName, value);
  }

  @Override
  public IosXcTest clone() {
    return (IosXcTest) super.clone();
  }

}