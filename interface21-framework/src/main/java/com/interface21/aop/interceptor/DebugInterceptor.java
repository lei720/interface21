
/*
 * Copyright (c) 2011-2025 PiChen
 */

package com.interface21.aop.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Trivial interceptor that can be introduced in a chain to display it.
 * <p>
 * (c) Rod Johnson, 2003
 *
 * @author Rod Johnson
 */
public class DebugInterceptor implements MethodInterceptor {

    // TODO learning interceptor?
    // AI? learns usage pattern?
    // code metrics
    // param values, etc?

    private int count;

    /**
     * @see org.aopalliance.intercept.MethodInterceptor#invoke(MethodInvocation)
     */
    public Object invoke(MethodInvocation invocation) throws Throwable {
        ++count;
        System.out.println("Debug interceptor: count=" + count +
                " invocation=[" + invocation + "]");
        Object rval = invocation.proceed();
        System.out.println("Debug interceptor: next returned");
        return rval;
    }

    public int getCount() {
        return this.count;
    }

}
