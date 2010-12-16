/*
 * This Work is in the public domain and is provided on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied,
 * including, without limitation, any warranties or conditions of TITLE,
 * NON-INFRINGEMENT, MERCHANTABILITY, or FITNESS FOR A PARTICULAR PURPOSE.
 * You are solely responsible for determining the appropriateness of using
 * this Work and assume any risks associated with your use of this Work.
 *
 * This Work includes contributions authored by David E. Jones, not as a
 * "work for hire", who hereby disclaims any copyright to the same.
 */
package org.moqui.impl.context

import org.moqui.context.ExecutionContext
import org.moqui.context.UserFacade
import org.moqui.context.MessageFacade
import org.moqui.context.L10nFacade
import org.moqui.context.ResourceFacade
import org.moqui.context.LoggerFacade
import org.moqui.context.CacheFacade
import org.moqui.context.TransactionFacade
import org.moqui.entity.EntityFacade
import org.moqui.service.ServiceFacade
import org.moqui.context.ScreenFacade
import org.moqui.context.ArtifactExecutionFacade

public class ExecutionContextImpl implements ExecutionContext {

    ExecutionContextFactoryImpl ecfi;

    public ExecutionContextImpl(ExecutionContextFactoryImpl ecfi) {
        this.ecfi = ecfi;
    }

    /** @see org.moqui.context.ExecutionContext#getContext() */
    public Map<String, Object> getContext() {
        return null;  // TODO: implement this
    }

    /** @see org.moqui.context.ExecutionContext#getContextRoot() */
    public Map<String, Object> getContextRoot() {
        return null;  // TODO: implement this
    }
    
    /** @see org.moqui.context.ExecutionContext#getTenantId() */
    public String getTenantId() {
        return null;  // TODO: implement this
    }

    /** @see org.moqui.context.ExecutionContext#getUser() */
    public UserFacade getUser() {
        return null;  // TODO: implement this
    }

    /** @see org.moqui.context.ExecutionContext#getMessage() */
    public MessageFacade getMessage() {
        return null;  // TODO: implement this
    }

    /** @see org.moqui.context.ExecutionContext#getL10n() */
    public L10nFacade getL10n() {
        return null;  // TODO: implement this
    }

    /** @see org.moqui.context.ExecutionContext#getResource() */
    public ResourceFacade getResource() {
        return this.ecfi.getResourceFacade();
    }

    /** @see org.moqui.context.ExecutionContext#getLogger() */
    public LoggerFacade getLogger() {
        return this.ecfi.getLoggerFacade();
    }

    /** @see org.moqui.context.ExecutionContext#getCache() */
    public CacheFacade getCache() {
        return this.ecfi.getCacheFacade();
    }

    /** @see org.moqui.context.ExecutionContext#getTransaction() */
    public TransactionFacade getTransaction() {
        return this.ecfi.getTransactionFacade();
    }

    /** @see org.moqui.context.ExecutionContext#getEntity() */
    public EntityFacade getEntity() {
        return null;  // TODO: implement this
    }

    /** @see org.moqui.context.ExecutionContext#getService() */
    public ServiceFacade getService() {
        return null;  // TODO: implement this
    }

    /** @see org.moqui.context.ExecutionContext#getScreen() */
    public ScreenFacade getScreen() {
        return this.ecfi.getScreenFacade();
    }

    /** @see org.moqui.context.ExecutionContext#getArtifactExecution() */
    public ArtifactExecutionFacade getArtifactExecution() {
        return null;  // TODO: implement this
    }
}