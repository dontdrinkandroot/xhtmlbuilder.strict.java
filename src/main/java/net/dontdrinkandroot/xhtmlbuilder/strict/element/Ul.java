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

import net.dontdrinkandroot.xhtmlbuilder.strict.group.Lists;


/**
 * <pre>
 * &lt;!ELEMENT ul (li)+&gt;
 * &lt;!ATTLIST ul
 *   %attrs;
 * &gt;
 * </pre>
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 * 
 */
public class Ul extends AbstractAttrsContainerElement<Ul, Li> implements Lists {

	/**
	 * <b>Caution:</b> This is a convenience method that violates the DTD as {@link Lists} are
	 * always exepected to have at least one child. Only use this if you are sure that you are
	 * appending at least one {@link Li}.
	 */
	protected Ul() {

	}


	public Ul(final Li firstItem) {

		this.appendChild(firstItem);
	}


	/**
	 * <b>Caution:</b> This is a convenience method that violates the DTD as {@link Lists} are
	 * always exepected to have at least one child. Only use this if you are sure that you are
	 * appending at least one {@link Li}.
	 */
	public static Ul createEmptyInstance() {

		return new Ul();
	}


	@Override
	protected final Ul getThis() {

		return this;
	}


	@Override
	public final String getElementName() {

		return "ul";
	}

}
