/**
 * Copyright (C) 2012 Philip W. Sorst <philip@sorst.net>
 * and individual contributors as indicated
 * by the @authors tag.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.dontdrinkandroot.xhtmlbuilder.type.xsd;

import java.io.Serializable;
import java.util.regex.Pattern;


/**
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class NMToken implements Serializable {

	private String token;

	private final String regex = "[a-zA-Z0-9_-]+";

	private final Pattern pattern = Pattern.compile(this.regex);


	public NMToken(final String token) {

		this.setToken(token);
	}


	public final String getToken() {

		return this.token;
	}


	public final NMToken setToken(final String token) {

		if (!this.pattern.matcher(token).matches()) {
			throw new IllegalArgumentException("Token was \"" + token + "\" but must match: " + this.regex);
		}
		this.token = token;

		return this;
	}


	@Override
	public String toString() {

		return this.token;
	}

}
