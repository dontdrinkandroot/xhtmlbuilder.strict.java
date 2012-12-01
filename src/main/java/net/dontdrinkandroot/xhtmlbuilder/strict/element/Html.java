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


/**
 * <pre>
 * &lt;!ELEMENT html (head, body)&gt;
 * &lt;!ATTLIST html
 *   %i18n;
 *   id          ID             #IMPLIED
 *   xmlns       %URI;          #FIXED 'http://www.w3.org/1999/xhtml'
 * &gt;
 * </pre>
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class Html extends AbstractElement<Html> implements I18n<Html> {

	private final Head head;

	private final Body body;


	public Html(final Title title) {

		this.head = new Head(title);
		this.body = new Body();
		this.setAttribute("xmlns", "http://www.w3.org/1999/xhtml");
	}


	public final Head getHead() {

		return this.head;
	}


	public final Body getBody() {

		return this.body;
	}


	@Override
	public final String getElementName() {

		return "html";
	}


	@Override
	protected final Html getThis() {

		return this;
	}


	@Override
	protected final boolean isEmpty() {

		return false;
	}


	@Override
	protected final void doElementsToString(final StringBuffer buf) {

		buf.append(this.head.toString());
		buf.append(this.body.toString());
	}

}
