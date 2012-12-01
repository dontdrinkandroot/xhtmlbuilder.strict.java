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
package net.dontdrinkandroot.xhtmlbuilder.strict.type;

import java.io.Serializable;
import java.util.regex.Pattern;


/**
 * Single or comma-separated list of media descriptors.
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class MediaDesc implements Serializable {

	private String descriptors;

	private final String regex = "[^,]+(,\\s*[^,]+)*";

	private final Pattern pattern = Pattern.compile(this.regex);


	public MediaDesc(final String descriptors) {

		this.setToken(descriptors);
	}


	public String getDescriptors() {

		return this.descriptors;
	}


	public final MediaDesc setToken(final String descriptor) {

		if (!this.pattern.matcher(descriptor).matches()) {
			throw new IllegalArgumentException("Descriptor(s) was \"" + descriptor + "\" but must match: " + this.regex);
		}
		this.descriptors = descriptor;

		return this;
	}


	@Override
	public String toString() {

		return this.descriptors;
	}

}
