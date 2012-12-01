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

import net.dontdrinkandroot.xhtmlbuilder.strict.attrgroup.I18n;
import net.dontdrinkandroot.xhtmlbuilder.strict.type.PCData;


/**
 * <pre>
 * &lt;!ELEMENT title (#PCDATA)&gt;
 * &lt;!ATTLIST title
 *   %i18n;
 *   id          ID             #IMPLIED
 * &gt;
 * </pre>
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class Title extends AbstractElement<Title> implements I18n<Title> {

	private final PCData content;


	public Title(final String text) {

		this.content = new PCData(text);
	}


	public Title(final PCData text) {

		this.content = text;
	}


	@Override
	public final String getElementName() {

		return "title";
	}


	@Override
	protected final Title getThis() {

		return this;
	}


	@Override
	protected final void doElementsToString(final StringBuffer buf) {

		buf.append(this.content.toString());
	}


	@Override
	protected final boolean isEmpty() {

		return false;
	}

}
