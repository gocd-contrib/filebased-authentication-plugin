/*
 * Copyright 2017 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cd.go.authentication.passwordfile;

import org.junit.Test;

import java.util.Properties;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PasswordFileReaderTest {

    @Test
    public void shouldReadPasswordFile() throws Exception {
        PasswordFileReader reader = new PasswordFileReader();
        Properties properties = reader.read(PasswordFileReaderTest.class.getResource("/password.properties").getFile());

        assertThat(properties.getProperty("username"), is("{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g="));
    }
}