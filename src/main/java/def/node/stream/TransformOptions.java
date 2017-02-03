package def.node.stream;
import def.node.Buffer;
import def.js.Function;
@jsweet.lang.Interface
public abstract class TransformOptions extends DuplexOptions {
    @jsweet.lang.Optional
    public jsweet.util.function.TriFunction<jsweet.util.union.Union<String,Buffer>,String,Function,Object> transform;
    @jsweet.lang.Optional
    public java.util.function.Function<Function,Object> flush;
}

