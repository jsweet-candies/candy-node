package def.node;
@jsweet.lang.Interface
public abstract class NodeRequire extends def.js.Object implements NodeRequireFunction {
    native public String resolve(String id);
    public Object cache;
    public Object extensions;
    public NodeModule main;
}

