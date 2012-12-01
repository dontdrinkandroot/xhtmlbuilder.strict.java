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
package net.dontdrinkandroot.htmlbuilder;

import net.dontdrinkandroot.xhtmlbuilder.strict.XHtmlStrictDocument;
import net.dontdrinkandroot.xhtmlbuilder.strict.element.Div;
import net.dontdrinkandroot.xhtmlbuilder.strict.element.P;

import org.junit.Assert;
import org.junit.Test;


public class BuildingTest {

	@Test
	public void testStrictBuilding() throws Exception {

		final XHtmlStrictDocument doc = new XHtmlStrictDocument("Test title");

		doc.getHtml().getBody().appendChild(
				new Div().setClasses("main other").appendChild(new P().appendChild("Test String")));
		/*@formatter:off*/
		String expected = 
				"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n"
				+"\n"
				+"<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
				+"<head>\n"
				+"<title>Test title</title>\n"
				+"</head>\n"
				+"\n"
				+"<body>\n"
				+"<div class=\"main other\">\n"
				+"<p>Test String</p>\n"
				+"</div>\n"
				+"</body>\n"
				+"</html>\n";
		/*@formatter:on*/
		Assert.assertEquals(expected, doc.toString());
	}

}
