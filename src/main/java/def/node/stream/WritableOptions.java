package def.node.stream;
import def.node.Buffer;
import def.js.Function;
@jsweet.lang.Interface
public abstract class WritableOptions extends def.js.Object {
    @jsweet.lang.Optional
    public double highWaterMark;
    @jsweet.lang.Optional
    public Boolean decodeStrings;
    @jsweet.lang.Optional
    public Boolean objectMode;
    @jsweet.lang.Optional
    public jsweet.util.function.TriFunction<jsweet.util.union.Union<String,Buffer>,String,Function,Object> write;
    @jsweet.lang.Optional
    public java.util.function.BiFunction<Chunks[],Function,Object> writev;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Chunks extends def.js.Object {
        public jsweet.util.union.Union<String,Buffer> chunk;
        public String encoding;
    }
}

