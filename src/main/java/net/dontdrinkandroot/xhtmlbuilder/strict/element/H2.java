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

import net.dontdrinkandroot.xhtmlbuilder.strict.attrgroup.Attrs;
import net.dontdrinkandroot.xhtmlbuilder.strict.group.Heading;


/**
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class H2 extends AbstractH<H2> implements Heading, Attrs<H2> {

	public H2() {

	}


	public H2(final String pcData) {

		super(pcData);
	}


	@Override
	protected final H2 getThis() {

		return this;
	}


	@Override
	public final String getElementName() {

		return "h2";
	}

}
