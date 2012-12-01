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

import net.dontdrinkandroot.xhtmlbuilder.strict.element.aux.TrData;
import net.dontdrinkandroot.xhtmlbuilder.strict.element.aux.TrHeading;
import net.dontdrinkandroot.xhtmlbuilder.strict.group.aux.TrContent;


//TODO: incomplete implementation
/**
 * <pre>
 * &lt;!ELEMENT tr       (th|td)+&gt;
 * &lt;!ATTLIST tr
 *  %attrs;
 *  %cellhalign;
 *  %cellvalign;
 *  &gt;
 * </pre>
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public abstract class Tr<T extends TrContent> extends AbstractContainerElement<Tr<T>, T> {

	public static TrData createDataRow(Td dataCell) {

		return new TrData(dataCell);
	}


	public static TrHeading createHeadingRow(Th headingCell) {

		return new TrHeading(headingCell);
	}


	@Override
	public String getElementName() {

		return "tr";
	}

}
