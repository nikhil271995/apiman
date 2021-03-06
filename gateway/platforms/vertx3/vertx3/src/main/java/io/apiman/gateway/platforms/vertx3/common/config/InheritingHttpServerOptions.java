/*
 * Copyright 2017 JBoss Inc
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

package io.apiman.gateway.platforms.vertx3.common.config;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.json.JsonObject;

@DataObject(inheritConverter=true, generateConverter=true)
public class InheritingHttpServerOptions extends HttpServerOptions {

    public InheritingHttpServerOptions() {
        super();
    }

    public InheritingHttpServerOptions(HttpServerOptions other) {
        super(other);
    }

    public InheritingHttpServerOptions(JsonObject json) {
        super(json);
    }

}
