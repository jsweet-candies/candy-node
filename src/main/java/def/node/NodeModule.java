package def.node;
@jsweet.lang.Interface
public abstract class NodeModule extends def.js.Object {
    public Object exports;
    public NodeRequireFunction require;
    public String id;
    public String filename;
    public Boolean loaded;
    public NodeModule parent;
    public NodeModule[] children;
    native public Object require(java.lang.String id);
}

