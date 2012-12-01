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

import net.dontdrinkandroot.xhtmlbuilder.Attribute;
import net.dontdrinkandroot.xhtmlbuilder.strict.attrgroup.Attrs;


/**
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 * @param <T>
 * @param <C>
 */
public abstract class AbstractAttrsContainerElement<T, C> extends AbstractCoreAttrsContainerElement<T, C>
		implements Attrs<T> {

	public AbstractAttrsContainerElement() {

		super();
	}


	@Override
	public final String getOnClick() {

		return this.getAttribute(Attribute.ONCLICK);
	}


	@Override
	public final T setOnClick(final String onClick) {

		return this.setAttribute(Attribute.ONCLICK, onClick);
	}


	@Override
	public final T setOnDblClick(final String onDblClick) {

		return this.setAttribute("ondblclick", onDblClick);
	}


	@Override
	public final String getOnDblClick() {

		return this.getAttribute("ondblclick");
	}


	@Override
	public final T setOnMouseDown(final String onMouseDown) {

		return this.setAttribute("onmousedown", onMouseDown);
	}


	@Override
	public final String getOnMouseDown() {

		return this.getAttribute("onmousedown");
	}


	@Override
	public final T setOnMouseUp(final String onMouseUp) {

		return this.setAttribute("onmouseup", onMouseUp);
	}


	@Override
	public final String getOnMouseUp() {

		return this.getAttribute("onmouseup");
	}


	@Override
	public final T setOnMouseOver(final String onMouseOver) {

		// TODO Auto-generated method stub
		return this.getThis();
	}


	@Override
	public final String getOnMouseOver() {

		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public final T setOnMouseMove(final String onMouseMove) {

		// TODO Auto-generated method stub
		return this.getThis();
	}


	@Override
	public final String getOnMouseMove() {

		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public final T setOnMouseOut(final String onMouseOut) {

		// TODO Auto-generated method stub
		return this.getThis();
	}


	@Override
	public final String getOnMouseOut() {

		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public final T setOnKeyPress(final String onKeyPress) {

		// TODO Auto-generated method stub
		return this.getThis();
	}


	@Override
	public final String getOnKeyPress() {

		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public final T setOnKeyDown(final String onKeyDown) {

		// TODO Auto-generated method stub
		return this.getThis();
	}


	@Override
	public final String getOnKeyDown() {

		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public final T setOnKeyUp(final String onKeyUp) {

		// TODO Auto-generated method stub
		return this.getThis();
	}


	@Override
	public final String getOnKeyUp() {

		// TODO Auto-generated method stub
		return null;
	}

}
