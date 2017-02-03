package def.node.vm;
import def.node.Buffer;
@jsweet.lang.Interface
public abstract class ScriptOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String filename;
    @jsweet.lang.Optional
    public double lineOffset;
    @jsweet.lang.Optional
    public double columnOffset;
    @jsweet.lang.Optional
    public Boolean displayErrors;
    @jsweet.lang.Optional
    public double timeout;
    @jsweet.lang.Optional
    public Buffer cachedData;
    @jsweet.lang.Optional
    public Boolean produceCachedData;
}

