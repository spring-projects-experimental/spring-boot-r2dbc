/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.autoconfigure.r2dbc;

import io.r2dbc.spi.ConnectionFactory;

import org.springframework.context.ApplicationEvent;

/**
 * {@link ApplicationEvent} used internally to indicate that the schema of a new
 * {@link ConnectionFactory} has been created. This happens when {@literal schema-*.sql} files
 * are executed.
 *
 * @author Mark Paluch
 */
@SuppressWarnings("serial")
public class ConnectionFactorySchemaCreatedEvent extends ApplicationEvent {

	/**
	 * Create a new {@link ConnectionFactorySchemaCreatedEvent}.
	 * @param source the source {@link ConnectionFactory}.
	 */
	public ConnectionFactorySchemaCreatedEvent(ConnectionFactory source) {
		super(source);
	}

}
