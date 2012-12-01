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
import net.dontdrinkandroot.xhtmlbuilder.strict.type.ContentType;
import net.dontdrinkandroot.xhtmlbuilder.strict.type.MediaDesc;
import net.dontdrinkandroot.xhtmlbuilder.strict.type.PCData;


/**
 * Style info, which may include CDATA sections.
 * 
 * <pre>
 * &lt;!ELEMENT style (#PCDATA)&gt;
 * &lt;!ATTLIST style
 *    %i18n;
 *    id          ID             #IMPLIED
 *    type        %ContentType;  #REQUIRED
 *    media       %MediaDesc;    #IMPLIED
 *    title       %Text;         #IMPLIED
 *    xml:space   (preserve)     #FIXED 'preserve'
 *   &gt;
 * </pre>
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class Style extends AbstractElement<Style> implements HeadMisc, I18n<Style> {

	private PCData content;


	public Style(ContentType type) {

		this.setType(type);
	}


	public final Style setType(final ContentType type) {

		return this.setAttribute("type", type);
	}


	public final ContentType getType() {

		return this.getAttribute("type");
	}


	public Style setMedia(MediaDesc mediaDescriptor) {

		return this.setAttribute("media", mediaDescriptor);
	}


	public MediaDesc getMedia() {

		return this.getAttribute("media");
	}


	public Title getTitle() {

		return this.getAttribute("title");
	}


	public Style setTitle(Title title) {

		return this.setAttribute("title", title);
	}


	public Style setTitle(String title) {

		return this.setAttribute("title", new Title(title));
	}


	@Override
	protected Style getThis() {

		return this;
	}


	@Override
	public String getElementName() {

		return "style";
	}


	@Override
	protected boolean isEmpty() {

		return false;
	}


	public final Style setContent(final PCData content) {

		this.content = content;
		return this;
	}


	public final Style setContent(final String content) {

		this.content = new PCData(content);
		return this;
	}


	public final PCData getContent() {

		return this.content;
	}


	@Override
	protected void doElementsToString(final StringBuffer buf) {

		if (this.content != null) {
			buf.append(this.content.toString());
		}
	}

}
