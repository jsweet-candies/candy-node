package def.node.stream;
@jsweet.lang.Interface
public abstract class ReadableOptions extends def.js.Object {
    @jsweet.lang.Optional
    public double highWaterMark;
    @jsweet.lang.Optional
    public String encoding;
    @jsweet.lang.Optional
    public Boolean objectMode;
    @jsweet.lang.Optional
    public java.util.function.Function<Double,Object> read;
}

