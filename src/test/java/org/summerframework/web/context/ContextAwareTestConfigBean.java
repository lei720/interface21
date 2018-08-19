/*
 * Copyright (c) 2011-2025 PiChen
 */

/*
 * ContextAwareTestConfigBean.java
 *
 * Created on 15 December 2001, 00:19
 */

package org.summerframework.web.context;

import org.summerframework.context.ApplicationContext;
import org.summerframework.context.ApplicationContextAware;
import org.summerframework.context.ApplicationContextException;

/**
 * @author rod
 */
public class ContextAwareTestConfigBean extends TestConfigBean implements ApplicationContextAware {

    private String namespace;

    private ApplicationContext ctx;

    /**
     * Creates new ContextAwareTestConfigBean
     */
    public ContextAwareTestConfigBean() {
    }

    /**
     * Set the ApplicationContext object used by this object
     *
     * @param ctx       ApplicationContext object used by this object
     * @param namespace namespace this object is in: null means default namespace
     * @throws ApplicationContextException if initialization attempted by this object
     *                                     after it has access to the WebApplicatinContext fails
     */
    public void setApplicationContext(ApplicationContext ctx) throws ApplicationContextException {
        this.ctx = ctx;
        //this.namespace = namespace;
    }

    public ApplicationContext getApplicationContext() {
        return ctx;
    }

    public String getNamespace() {
        return namespace;
    }

}