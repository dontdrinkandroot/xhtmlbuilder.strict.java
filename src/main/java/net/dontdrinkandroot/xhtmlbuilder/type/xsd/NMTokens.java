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
package net.dontdrinkandroot.xhtmlbuilder.type.xsd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * 
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class NMTokens implements Serializable {

	private final List<String> tokens;


	public NMTokens() {

		this.tokens = new ArrayList<String>();
	}


	public NMTokens(final String tokens) {

		this();
		final String[] parts = tokens.split(" ");
		for (final String part : parts) {
			this.tokens.add(part);
		}
	}


	public final NMTokens addToken(final String token) {

		this.tokens.add(token);
		return this;
	}


	@Override
	public final String toString() {

		final StringBuffer buf = new StringBuffer();
		if (this.tokens.size() > 0) {
			int count = 0;
			final Iterator<String> it = this.tokens.iterator();
			while (count < this.tokens.size() - 1) {
				buf.append(it.next());
				buf.append(" ");
				count++;
			}
			buf.append(it.next());
		}

		return buf.toString();
	}

}
