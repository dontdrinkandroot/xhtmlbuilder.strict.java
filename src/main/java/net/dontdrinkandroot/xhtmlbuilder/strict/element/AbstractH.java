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
package net.dontdrinkandroot.xhtmlbuilder.strict.element;

import net.dontdrinkandroot.xhtmlbuilder.strict.group.Heading;
import net.dontdrinkandroot.xhtmlbuilder.strict.type.Inline;
import net.dontdrinkandroot.xhtmlbuilder.strict.type.PCData;


/**
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 * @param <T>
 */
public abstract class AbstractH<T> extends AbstractAttrsContainerElement<T, Inline> implements Heading {

	protected AbstractH() {

	}


	protected AbstractH(final String pcData) {

		this.appendChild(new PCData(pcData));
	}


	public final T appendChild(final String pcData) {

		return this.appendChild(new PCData(pcData));
	}

}
