/*
 * Copyright 2015 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.physical_web.collection;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * SimplePwo unit test class.
 */
public class SimplePwoTest {
  private final String ID1 = "id1";
  private final String URL1 = "http://example.com";

  @Test
  public void constructorCreatesProperObject() {
    Pwo pwo = new SimplePwo(ID1, URL1);
    assertEquals(pwo.getId(), ID1);
    assertEquals(pwo.getUrl(), URL1);
  }
}
