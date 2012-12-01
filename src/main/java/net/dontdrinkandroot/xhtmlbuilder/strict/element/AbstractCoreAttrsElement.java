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

import net.dontdrinkandroot.xhtmlbuilder.Attribute;
import net.dontdrinkandroot.xhtmlbuilder.strict.attrgroup.CoreAttrs;
import net.dontdrinkandroot.xhtmlbuilder.type.xsd.NMTokens;


/**
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 * @param <T>
 */
public abstract class AbstractCoreAttrsElement<T> extends AbstractElement<T> implements CoreAttrs<T> {

	@Override
	public final String getStyle() {

		return this.getAttribute(Attribute.STYLE);
	}


	@Override
	public String getTitle() {

		return this.getAttribute(Attribute.TITLE);
	}


	@Override
	public final T setTitle(final String title) {

		return this.setAttribute(Attribute.TITLE, title);
	}


	@Override
	public final NMTokens getClasses() {

		return this.getAttribute(Attribute.CLASS);
	}


	@Override
	public final T setClasses(final NMTokens classes) {

		return this.setAttribute(Attribute.CLASS, classes);
	}


	@Override
	public final T setStyle(final String style) {

		return this.setAttribute(Attribute.STYLE, style);
	}

}
