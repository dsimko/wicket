/*
 * $Id: ContainerWithAssociatedMarkupHelper.java,v 1.1 2006/03/10 22:20:42
 * jdonnerstag Exp $ $Revision$ $Date: 2006/03/10 22:20:42 $
 * 
 * ==============================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package wicket.markup.html.autolink;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import wicket.WicketTestCase;
import wicket.markup.html.autolink.sub.PageB;
import wicket.markup.resolver.AutoLinkResolver;

/**
 * 
 */
public class AutolinkTest extends WicketTestCase
{
	/** Logging */
	private static final Log log = LogFactory.getLog(AutoLinkResolver.class);
	
	/**
	 * Construct.
	 * @param name
	 */
	public AutolinkTest(String name)
	{
		super(name);
	}

	/**
	 * 
	 * @throws Exception
	 */
	public void test_1() throws Exception
	{
		executeTest(MyPage.class, "MyPageExpectedResult.html");
	}

	/**
	 * 
	 * @throws Exception
	 */
	public void test_2() throws Exception
	{
		executeTest(PageA.class, "PageAExpectedResult.html");
	}

	/**
	 * 
	 * @throws Exception
	 */
	public void test_3() throws Exception
	{
		executeTest(PageB.class, "PageBExpectedResult.html");
	}
}
