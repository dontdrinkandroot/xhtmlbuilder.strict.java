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
package net.dontdrinkandroot.xhtmlbuilder.strict.attrgroup;

import net.dontdrinkandroot.xhtmlbuilder.type.xsd.NMTokens;


/**
 * Core attributes common to most elements.
 * 
 * <pre>
 * &lt;!ENTITY % coreattrs
 * id          ID             #IMPLIED
 *   class       CDATA          #IMPLIED
 *   style       %StyleSheet;   #IMPLIED
 *   title       %Text;         #IMPLIED"
 * &gt;
 * </pre>
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 * 
 * @param <T>
 *            Type of the implementing element.
 */
public interface CoreAttrs<T> {

	String getId();


	T setId(String id);


	NMTokens getClasses();


	T setClasses(NMTokens classes);


	String getStyle();


	T setStyle(String style);


	String getTitle();


	T setTitle(String title);

}