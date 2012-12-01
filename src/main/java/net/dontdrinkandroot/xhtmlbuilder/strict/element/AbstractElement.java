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

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map.Entry;

import net.dontdrinkandroot.xhtmlbuilder.Attribute;
import net.dontdrinkandroot.xhtmlbuilder.strict.group.Inline;


/**
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 * @param <T>
 *            The type of the implementing class, desired to determine the return type for method
 *            chaining.
 */
public abstract class AbstractElement<T> implements Serializable {

	private final HashMap<String, Serializable> attributeMap;


	public AbstractElement() {

		this.attributeMap = new HashMap<String, Serializable>();
	}


	public final String getId() {

		return this.getAttribute(Attribute.ID);
	}


	public final T setId(final String id) {

		this.setAttribute(Attribute.ID, id);
		return this.getThis();
	}


	@Override
	public final String toString() {

		final StringBuffer buf = new StringBuffer();

		/* Inline elements are not on a new line */
		if (!Inline.class.isAssignableFrom(this.getClass())) {
			buf.append(System.getProperty("line.separator"));
		}

		/* Open start tag and append attributes */
		buf.append("<" + this.getElementName());
		for (final Entry<String, Serializable> attEntry : this.attributeMap.entrySet()) {
			final String name = attEntry.getKey();
			final String value = attEntry.getValue().toString();
			buf.append(" " + name + "=\"" + value + "\"");
		}

		/* Close start tag and either close or render children */
		if (this.isEmpty()) {
			buf.append("/>");
		} else {
			buf.append(">");
			this.doElementsToString(buf);
			buf.append("</" + this.getElementName() + ">");
		}

		/* Inline elements are not on a new line */
		if (!Inline.class.isAssignableFrom(this.getClass())) {
			buf.append(System.getProperty("line.separator"));
		}

		return buf.toString();
	}


	public abstract String getElementName();


	protected final T setAttribute(final String name, final Serializable value) {

		this.attributeMap.put(name, value);
		return this.getThis();
	}


	@SuppressWarnings("unchecked")
	protected final <A extends Serializable> A getAttribute(final String name) {

		final Serializable att = this.attributeMap.get(name);
		if (att == null) {
			return null;
		}

		return (A) att;
	}


	protected final HashMap<String, Serializable> getAttributeMap() {

		return this.attributeMap;
	}


	protected void doElementsToString(final StringBuffer buf) {

	}


	/**
	 * Determines if the element should be rendered as empty: &lt;elementname /&gt;
	 * 
	 * @return True if the element should be rendered as empty.
	 */
	protected abstract boolean isEmpty();


	protected abstract T getThis();

}
