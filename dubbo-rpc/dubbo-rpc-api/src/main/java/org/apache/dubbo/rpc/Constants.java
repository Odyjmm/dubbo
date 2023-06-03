/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dubbo.rpc;

public interface Constants {
    public static final String LOCAL_KEY = "local";

    public static final String STUB_KEY = "stub";

    public static final String MOCK_KEY = "mock";

    public static final String DEPRECATED_KEY = "deprecated";

    public static final String $ECHO = "$echo";
    public static final String $ECHO_PARAMETER_DESC = "Ljava/lang/Object;";

    public static final String RETURN_PREFIX = "return ";

    public static final String THROW_PREFIX = "throw";

    public static final String FAIL_PREFIX = "fail:";

    public static final String FORCE_PREFIX = "force:";

    public static final String MERGER_KEY = "merger";

    public static final String IS_SERVER_KEY = "isserver";

    public static final String FORCE_USE_TAG = "dubbo.force.tag";

    public static final String TPS_LIMIT_RATE_KEY = "tps";

    public static final String TPS_LIMIT_INTERVAL_KEY = "tps.interval";

    public static final long DEFAULT_TPS_LIMIT_INTERVAL = 60 * 1000;

    public static final String AUTO_ATTACH_INVOCATIONID_KEY = "invocationid.autoattach";

    public static final boolean DEFAULT_STUB_EVENT = false;

    public static final String STUB_EVENT_METHODS_KEY = "dubbo.stub.event.methods";

    public static final String COMPRESSOR_KEY = "dubbo.rpc.tri.compressor";

    public static final String PROXY_KEY = "proxy";

    public static final String EXECUTES_KEY = "executes";

    public static final String ACCESS_LOG_KEY = "accesslog";

    public static final String ACCESS_LOG_FIXED_PATH_KEY = "accesslog.fixed.path";

    public static final String ACTIVES_KEY = "actives";

    public static final String ID_KEY = "id";

    public static final String ASYNC_KEY = "async";

    public static final String RETURN_KEY = "return";

    public static final String TOKEN_KEY = "token";

    public static final String INTERFACE = "interface";

    public static final String INTERFACES = "interfaces";

    public static final String GENERIC_KEY = "generic";

    public static final String LOCAL_PROTOCOL = "injvm";

    public static final String DEFAULT_REMOTING_SERVER = "netty";

    public static final String SCOPE_KEY = "scope";
    public static final String SCOPE_LOCAL = "local";
    public static final String SCOPE_REMOTE = "remote";

    public static final String INPUT_KEY = "input";
    public static final String OUTPUT_KEY = "output";

    public static final String CONSUMER_MODEL = "consumerModel";
    public static final String METHOD_MODEL = "methodModel";

    public static final String SERIALIZATION_SECURITY_CHECK_KEY = "serialization.security.check";
    public static final String INVOCATION_KEY = "invocation";
    public static final String SERIALIZATION_ID_KEY = "serialization_id";

    public static final String H2_SETTINGS_HEADER_TABLE_SIZE_KEY = "dubbo.rpc.tri.header-table-size";
    public static final String H2_SETTINGS_ENABLE_PUSH_KEY = "dubbo.rpc.tri.enable-push";
    public static final String H2_SETTINGS_MAX_CONCURRENT_STREAMS_KEY = "dubbo.rpc.tri.max-concurrent-streams";
    public static final String H2_SETTINGS_INITIAL_WINDOW_SIZE_KEY = "dubbo.rpc.tri.initial-window-size";
    public static final String H2_SETTINGS_MAX_FRAME_SIZE_KEY = "dubbo.rpc.tri.max-frame-size";
    public static final String H2_SETTINGS_MAX_HEADER_LIST_SIZE_KEY = "dubbo.rpc.tri.max-header-list-size";

    public static final String ADAPTIVE_LOADBALANCE_ATTACHMENT_KEY = "lb_adaptive";
    public static final String ADAPTIVE_LOADBALANCE_START_TIME = "adaptive_startTime";
    public static final String H2_SUPPORT_NO_LOWER_HEADER_KEY = "dubbo.rpc.tri.support-no-lower-header";
    public static final String TRI_BUILTIN_SERVICE_INIT = "dubbo.tri.builtin.service.init";

    public static final String H2_IGNORE_1_0_0_KEY = "dubbo.rpc.tri.ignore-1.0.0-version";

    public static final String H2_RESOLVE_FALLBACK_TO_DEFAULT_KEY = "dubbo.rpc.tri.resolve-fallback-to-default";
}
