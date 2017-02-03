package def.node.http;
@jsweet.lang.Interface
public abstract class RequestOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String protocol;
    @jsweet.lang.Optional
    public String host;
    @jsweet.lang.Optional
    public String hostname;
    @jsweet.lang.Optional
    public double family;
    @jsweet.lang.Optional
    public double port;
    @jsweet.lang.Optional
    public String localAddress;
    @jsweet.lang.Optional
    public String socketPath;
    @jsweet.lang.Optional
    public String method;
    @jsweet.lang.Optional
    public String path;
    @jsweet.lang.Optional
    public Headers headers;
    @jsweet.lang.Optional
    public String auth;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Agent,Boolean> agent;
    @jsweet.lang.Optional
    public double timeout;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Headers extends def.js.Object {
        native public java.lang.Object $get(String key);
    }
}

