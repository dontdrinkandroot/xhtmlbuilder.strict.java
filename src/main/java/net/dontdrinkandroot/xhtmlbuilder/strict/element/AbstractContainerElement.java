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

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 * 
 * @param <T>
 *            Type of the implemented subclass.
 * @param <C>
 *            Type of the child.
 */
public abstract class AbstractContainerElement<T, C> extends AbstractElement<T> implements Container<T, C> {

	private final List<C> children;


	public AbstractContainerElement() {

		super();

		this.children = new ArrayList<C>();
	}


	@Override
	public final T appendChild(final C child) {

		if (child != null) {
			this.children.add(child);
		}

		return this.getThis();
	}


	protected final List<C> getChildren() {

		return this.children;
	}


	@Override
	protected boolean isEmpty() {

		return this.children.size() == 0;
	}


	@Override
	protected void doElementsToString(final StringBuffer buf) {

		for (final C child : this.getChildren()) {
			buf.append(child.toString());
		}
	}

}
