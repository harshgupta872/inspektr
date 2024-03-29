/**
 *  Copyright 2007 Rutgers, the State University of New Jersey
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *      
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.inspektr.common.spi;

import org.aspectj.lang.JoinPoint;
import org.inspektr.common.web.ClientInfo;

/**
 * Interface for resolving the ClientInfo object.
 * 
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 1.0
 *
 */
public interface ClientInfoResolver {
	
	/**
	 * Resolve the ClientInfo from the provided arguments and return value.
	 * 
	 * @param joinPoint the point where the join occurred.
	 * @param retVal the return value from the method call.
	 * @return the constructed ClientInfo object.  Should never return null!
	 */
	ClientInfo resolveFrom(JoinPoint joinPoint, Object retVal);
}
