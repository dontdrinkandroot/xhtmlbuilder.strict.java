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

import net.dontdrinkandroot.xhtmlbuilder.strict.group.Inline;
import net.dontdrinkandroot.xhtmlbuilder.strict.group.Phrase;


/**
 * Abbreviation.
 * 
 * <pre>
 * &lt;!ELEMENT abbr %Inline;&gt;
 * &lt;!ATTLIST abbr %attrs;&gt;
 * </pre>
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class Abbr extends AbstractAttrsContainerElement<Abbr, Inline> implements Phrase {

	@Override
	protected Abbr getThis() {

		return this;
	}


	@Override
	public String getElementName() {

		return "Abbr";
	}

}