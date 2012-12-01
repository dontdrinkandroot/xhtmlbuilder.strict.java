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

import java.net.URI;

import net.dontdrinkandroot.xhtmlbuilder.Attribute;
import net.dontdrinkandroot.xhtmlbuilder.strict.group.Inline;
import net.dontdrinkandroot.xhtmlbuilder.strict.type.AContent;
import net.dontdrinkandroot.xhtmlbuilder.strict.type.PCData;
import net.dontdrinkandroot.xhtmlbuilder.type.xsd.NMToken;


/**
 * The Anchor Element.
 * 
 * <pre>
 * &lt;!ELEMENT a %a.content;&gt;
 * &lt;!ATTLIST a
 *   %attrs;
 *   %focus;
 *   charset     %Charset;      #IMPLIED
 *   type        %ContentType;  #IMPLIED
 *   name        NMTOKEN        #IMPLIED
 *   href        %URI;          #IMPLIED
 *   hreflang    %LanguageCode; #IMPLIED
 *   rel         %LinkTypes;    #IMPLIED
 *   rev         %LinkTypes;    #IMPLIED
 *   shape       %Shape;        "rect"
 *   coords      %Coords;       #IMPLIED
 * &gt;
 * </pre>
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class A extends AbstractAttrsContainerElement<A, AContent> implements Inline {

	public A() {

	}


	public A(final String content) {

		this.appendChild(new PCData(content));
	}


	@Override
	public final String getElementName() {

		return "a";
	}


	public final A setName(final NMToken token) {

		return this.setAttribute(Attribute.NAME, token);
	}


	public final A setName(final String token) {

		return this.setAttribute(Attribute.NAME, new NMToken(token));
	}


	public final NMToken getName() {

		return this.getAttribute(Attribute.NAME);
	}


	public final A setHref(final URI href) {

		return this.setAttribute(Attribute.HREF, href);
	}


	public final URI getHref() {

		return this.getAttribute(Attribute.HREF);
	}


	@Override
	protected final A getThis() {

		return this;
	}

}
