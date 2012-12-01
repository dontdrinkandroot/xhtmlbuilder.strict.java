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
package net.dontdrinkandroot.xhtmlbuilder.strict;

import net.dontdrinkandroot.xhtmlbuilder.Document;
import net.dontdrinkandroot.xhtmlbuilder.strict.element.Html;
import net.dontdrinkandroot.xhtmlbuilder.strict.element.Title;


/**
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class XHtmlStrictDocument implements Document {

	private final String docType =
			"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";

	private final Html html;


	public XHtmlStrictDocument(final String title) {

		this.html = new Html(new Title(title));
	}


	public final Html getHtml() {

		return this.html;
	}


	@Override
	public final String getDocType() {

		return this.docType;
	}


	@Override
	public final String toString() {

		final StringBuffer buf = new StringBuffer();

		buf.append(this.docType + System.getProperty("line.separator"));
		buf.append(this.html.toString());

		return buf.toString();
	}

}
