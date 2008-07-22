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
package org.inspektr.audit;

import org.aspectj.lang.JoinPoint;
import org.inspektr.audit.spi.AuditableResourceResolver;

/**
 * Useful for testing.
 * 
 * @author Dmitriy Kopylenko
 * @version $Id: SimpleAuditableResourceResolver.java,v 1.3 2007/12/03 22:01:59 lleung Exp $
 * @since 1.0
 */
public class SimpleAuditableResourceResolver implements AuditableResourceResolver {

    public String resolveFrom(JoinPoint auditableTarget, Object retval) {
        return "Resource being changed: " + auditableTarget.getTarget().getClass().getSimpleName() +
               "; Result=" + retval;
    }
    
    public String resolveFrom(JoinPoint auditableTarget, Exception exception) {
    	return "Resource being changed: " + auditableTarget.getTarget().getClass().getSimpleName() +
        "; Exception=" + exception;
    }
}