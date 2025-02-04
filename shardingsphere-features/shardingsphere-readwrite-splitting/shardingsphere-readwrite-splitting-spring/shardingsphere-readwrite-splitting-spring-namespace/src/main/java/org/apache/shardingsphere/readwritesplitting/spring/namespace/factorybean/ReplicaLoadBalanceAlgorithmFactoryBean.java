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

package org.apache.shardingsphere.readwritesplitting.spring.namespace.factorybean;

import org.apache.shardingsphere.infra.config.algorithm.ShardingSphereAlgorithmConfiguration;
import org.apache.shardingsphere.readwritesplitting.factory.ReadQueryLoadBalanceAlgorithmFactory;
import org.apache.shardingsphere.readwritesplitting.spi.ReadQueryLoadBalanceAlgorithm;
import org.apache.shardingsphere.spring.namespace.factorybean.ShardingSphereAlgorithmFactoryBean;

import java.util.Properties;

/**
 * Replica load balance algorithm factory bean.
 */
public final class ReplicaLoadBalanceAlgorithmFactoryBean extends ShardingSphereAlgorithmFactoryBean<ReadQueryLoadBalanceAlgorithm> {
    
    public ReplicaLoadBalanceAlgorithmFactoryBean(final String type, final Properties props) {
        super(type, props, ReadQueryLoadBalanceAlgorithm.class);
    }
    
    @Override
    public ReadQueryLoadBalanceAlgorithm getObject() {
        return ReadQueryLoadBalanceAlgorithmFactory.newInstance(new ShardingSphereAlgorithmConfiguration(getType(), getProps()));
    }
}
