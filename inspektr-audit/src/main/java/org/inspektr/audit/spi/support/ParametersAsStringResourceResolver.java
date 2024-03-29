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
package org.inspektr.audit.spi.support;

/**
 * Returns the parameters as an array of strings.
 *
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 1.0.0
 */
public class ParametersAsStringResourceResolver extends AbstractAuditableResourceResolver {

    protected String[] createResource(final Object[] args) {
        final String[] stringArgs = new String[args.length];

        for (int i = 0; i < args.length; i++) {
            stringArgs[i] = args[i].toString();
        }

        return stringArgs;
    }
}
