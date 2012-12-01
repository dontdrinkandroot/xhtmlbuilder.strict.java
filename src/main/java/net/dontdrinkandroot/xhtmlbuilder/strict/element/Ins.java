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
import net.dontdrinkandroot.xhtmlbuilder.strict.group.MiscInline;
import net.dontdrinkandroot.xhtmlbuilder.strict.type.Flow;
import net.dontdrinkandroot.xhtmlbuilder.type.xsd.DateTime;


/**
 * Inserted Text.
 * 
 * <pre>
 * &lt;!ELEMENT ins %Flow;&gt;
 * &lt;!ATTLIST ins
 *   %attrs;
 *   cite        %URI;          #IMPLIED
 *   datetime    %Datetime;     #IMPLIED
 *   &gt;
 * </pre>
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class Ins extends AbstractAttrsContainerElement<Ins, Flow> implements MiscInline {

	@Override
	public String getElementName() {

		return "ins";
	}


	@Override
	protected Ins getThis() {

		return this;
	}


	public Ins setCite(URI cite) {

		return this.setAttribute(Attribute.CITE, cite);
	}


	public URI getCite() {

		return this.getAttribute(Attribute.CITE);
	}


	public Ins setDateTime(DateTime dateTime) {

		return this.setAttribute(Attribute.DATETIME, dateTime);
	}


	public DateTime getDateTime() {

		return this.getAttribute(Attribute.DATETIME);
	}

}
