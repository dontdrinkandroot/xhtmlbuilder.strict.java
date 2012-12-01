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
 * Generic metainformation.
 * 
 * <pre>
 * &lt;!ELEMENT meta EMPTY&gt;
 * &lt;!ATTLIST meta
 *   %i18n;
 *   id          ID             #IMPLIED
 *   http-equiv  CDATA          #IMPLIED
 *   name        CDATA          #IMPLIED
 *   content     CDATA          #REQUIRED
 *   scheme      CDATA          #IMPLIED
 * &gt;
 * </pre>
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class Meta extends AbstractElement<Meta> implements HeadMisc, I18n<Meta> {

	public Meta(String content) {

		this.setAttribute("content", content);
	}


	public Meta setName(String name) {

		return this.setAttribute("name", name);
	}


	public String getName() {

		return this.getAttribute("name");
	}


	public Meta setHttpEquiv(String httpEquiv) {

		return this.setAttribute("http-equiv", httpEquiv);
	}


	public String tetHttpEquiv() {

		return this.getAttribute("http-equiv");
	}


	public Meta setContent(String content) {

		return this.setAttribute("content", content);
	}


	public String getContent() {

		return this.getAttribute("content");
	}


	public Meta setScheme(String scheme) {

		return this.setAttribute("scheme", scheme);
	}


	public String getScheme() {

		return this.getAttribute("scheme");
	}


	@Override
	protected Meta getThis() {

		return this;
	}


	@Override
	public String getElementName() {

		return "meta";
	}


	@Override
	protected boolean isEmpty() {

		return true;
	}

}
