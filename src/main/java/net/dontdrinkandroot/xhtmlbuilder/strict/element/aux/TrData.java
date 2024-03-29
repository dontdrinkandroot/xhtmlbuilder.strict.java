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
package net.dontdrinkandroot.xhtmlbuilder.strict.element.aux;

import net.dontdrinkandroot.xhtmlbuilder.strict.element.Td;
import net.dontdrinkandroot.xhtmlbuilder.strict.element.Tr;


public class TrData extends Tr<Td> {

	public TrData(Td dataCell) {

		this.appendChild(dataCell);
	}


	@Override
	protected Tr<Td> getThis() {

		return this;
	}

}
