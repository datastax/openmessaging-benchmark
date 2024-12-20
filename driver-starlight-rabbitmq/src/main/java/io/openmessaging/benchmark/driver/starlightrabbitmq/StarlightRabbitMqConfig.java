/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.openmessaging.benchmark.driver.starlightrabbitmq;

import java.util.ArrayList;
import java.util.List;

public class StarlightRabbitMqConfig {

    public List<String> amqpUris = new ArrayList<>();

    public String pulsarHttpUrl;

    public String namespacePrefix;

    public String clusterName;

    public PersistenceConfiguration persistence = new PersistenceConfiguration();

    public static class PersistenceConfiguration {
        public int ensembleSize = 3;
        public int writeQuorum = 3;
        public int ackQuorum = 2;

        public boolean deduplicationEnabled = false;
    }

}
