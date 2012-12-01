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


/**
 * Used for titles etc.
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 * 
 */
public class Text implements Serializable {

	private final String text;


	public Text(final String text) {

		this.text = text;
	}


	public final String getText() {

		return this.text;
	}


	@Override
	public final String toString() {

		return this.text;
	}

}
