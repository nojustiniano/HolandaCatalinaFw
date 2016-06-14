package org.hcjf.io.net.http;

/**
 * This class represents a standard web context that can be published
 * @author javaito
 * @email javaito@gmail.com
 */
public abstract class Context {

    private final String contextRegex;

    /**
     * Constructor
     * @param contextRegex Regular expression that represents the set
     * of URLs that refer to this context.
     */
    public Context(String contextRegex) {
        this.contextRegex = contextRegex;
    }

    /**
     * Return the regular expression that represents the set of URLs
     * that refer to this context.
     * @return Regular expression.
     */
    public String getContextRegex() {
        return contextRegex;
    }

    /**
     * This method is called when there comes a http package addressed to this
     * context.
     * @param request All the request information.
     * @return Return an object with all the response information.
     */
    public abstract HttpResponse onContext(HttpRequest request);

    /**
     * This method is called when there are any error on the context execution.
     * @param request All the request information.
     * @param throwable Throwable object, could be null.
     * @return Return an object with all the response information.
     */
    protected abstract HttpResponse onError(HttpRequest request, Throwable throwable);
}
