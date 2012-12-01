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
import net.dontdrinkandroot.xhtmlbuilder.strict.group.HeadMisc;
import net.dontdrinkandroot.xhtmlbuilder.strict.type.ContentType;
import net.dontdrinkandroot.xhtmlbuilder.strict.type.PCData;


/**
 * <pre>
 * &lt;!ELEMENT script (#PCDATA)&gt;
 * &lt;!ATTLIST script
 *   id          ID             #IMPLIED
 *   charset     %Charset;      #IMPLIED
 *   type        %ContentType;  #REQUIRED
 *   language    CDATA          #IMPLIED
 *   src         %URI;          #IMPLIED
 *   defer       (defer)        #IMPLIED
 *   xml:space   (preserve)     #FIXED 'preserve'
 * &gt;
 * </pre>
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class Script extends AbstractElement<Script> implements HeadMisc {

	private PCData content;


	public Script(ContentType type) {

		this.setType(type);
	}


	@Override
	protected final Script getThis() {

		return this;
	}


	@Override
	public final String getElementName() {

		return "script";
	}


	@Override
	protected final boolean isEmpty() {

		return false;
	}


	public final Script setSrc(final URI src) {

		return this.setAttribute("src", src);
	}


	public final URI getSrc() {

		return this.getAttribute("src");
	}


	public final Script setContent(final PCData content) {

		this.content = content;
		return this;
	}


	public final Script setContent(final String content) {

		this.content = new PCData(content);
		return this;
	}


	public final PCData getContent() {

		return this.content;
	}


	public final Script setType(final ContentType type) {

		return this.setAttribute(Attribute.TYPE, type);
	}


	public final ContentType getType() {

		return this.getAttribute(Attribute.TYPE);
	}


	@Override
	protected void doElementsToString(final StringBuffer buf) {

		if (this.content != null) {
			buf.append(this.content.toString());
		}
	}

}
