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
package org.inspektr.audit.support;

import org.inspektr.audit.AuditTrailManager;
import org.inspektr.audit.AuditableActionContext;

/**
 * Simple <code>AuditTrailManager</code> that dumps auditable information to output stream.
 * <p>
 * Useful for testing.
 * 
 * @author Dmitriy Kopylenko
 * @version $Id: ConsoleAuditTrailManager.java,v 1.2 2007/06/12 15:18:43 dkopylen Exp $
 * @since 1.0
 * @see AuditTrailManager
 */
public final class ConsoleAuditTrailManager implements AuditTrailManager {

    public void record(final AuditableActionContext auditableActionContext) {
        System.out.println("Audit trail record BEGIN");
        System.out.println("=============================================================");
        System.out.println("WHO: " + auditableActionContext.getPrincipal());
        System.out.println("WHAT: " + auditableActionContext.getResourceOperatedUpon());
        System.out.println("ACTION: " + auditableActionContext.getActionPerformed());
        System.out.println("APPLICATION: " + auditableActionContext.getApplicationCode());
        System.out.println("WHEN: " + auditableActionContext.getWhenActionWasPerformed());
        System.out.println("CLIENT IP ADDRESS: " + auditableActionContext.getClientIpAddress());
        System.out.println("SERVER IP ADDRESS: " + auditableActionContext.getServerIpAddress());
        System.out.println("=============================================================");
        System.out.println("\n");
    }
}
