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

import net.dontdrinkandroot.xhtmlbuilder.strict.group.HeadMisc;
import net.dontdrinkandroot.xhtmlbuilder.strict.type.ContentType;
import net.dontdrinkandroot.xhtmlbuilder.type.xsd.NMTokens;


/**
 * <pre>
 * &lt;!ELEMENT link EMPTY&gt;
 * &lt;!ATTLIST link
 *   %attrs;
 *   charset     %Charset;      #IMPLIED
 *   href        %URI;          #IMPLIED
 *   hreflang    %LanguageCode; #IMPLIED
 *   type        %ContentType;  #IMPLIED
 *   rel         %LinkTypes;    #IMPLIED
 *   rev         %LinkTypes;    #IMPLIED
 *   media       %MediaDesc;    #IMPLIED
 *   target      %FrameTarget;  #IMPLIED
 * &gt;
 * </pre>
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class Link extends AbstractElement<Link> implements HeadMisc {

	@Override
	protected final Link getThis() {

		return this;
	}


	@Override
	public final String getElementName() {

		return "link";
	}


	@Override
	protected final boolean isEmpty() {

		return true;
	}


	public final Link setHref(final URI href) {

		return this.setAttribute("href", href);
	}


	public final URI getHref() {

		return this.getAttribute("href");
	}


	public final Link setRel(final NMTokens rel) {

		return this.setAttribute("rel", rel);
	}


	public final Link setRel(final String tokens) {

		return this.setAttribute("rel", new NMTokens(tokens));
	}


	public final NMTokens getRel() {

		return this.getAttribute("rel");
	}


	public final Link setType(final ContentType contentType) {

		return this.setAttribute("type", contentType);
	}


	public final ContentType getType() {

		return this.getAttribute("type");
	}

}
