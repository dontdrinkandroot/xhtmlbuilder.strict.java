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
import net.dontdrinkandroot.xhtmlbuilder.strict.group.HeadMisc;


/**
 * DTD:
 * 
 * <pre>
 * &lt;!ELEMENT head (%head.misc;,
 *      ((title, %head.misc;, (base, %head.misc;)?) |
 *       (base, %head.misc;, (title, %head.misc;))))&gt;
 * 
 * &lt;!ATTLIST head
 *   %i18n;
 *   id          ID             #IMPLIED
 *   profile     %URI;          #IMPLIED
 *   &gt;
 * </pre>
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class Head extends AbstractContainerElement<Head, HeadMisc> implements I18n {

	private final Title title;

	private Base base;


	public Head(final Title title) {

		this.title = title;
	}


	public Title getTitle() {

		return this.title;
	}


	public Base getBase() {

		return this.base;
	}


	public void setBase(final Base base) {

		this.base = base;
	}


	@Override
	public String getElementName() {

		return "head";
	}


	@Override
	protected Head getThis() {

		return this;
	}


	@Override
	protected final boolean isEmpty() {

		/* Title is mandatory */
		return false;
	}


	@Override
	protected final void doElementsToString(final StringBuffer buf) {

		/* Title and base must be rendered before remaining children */
		buf.append(this.title.toString());
		if (this.base != null) {
			buf.append(this.base.toString());
		}

		super.doElementsToString(buf);
	}

}
