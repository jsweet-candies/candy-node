package def.node._debugger;
@jsweet.lang.Interface
public abstract class ResponseBodyHandler extends def.js.Object {
    native public void apply(Boolean err, Object body);
    @jsweet.lang.Optional
    public double request_seq;
    native public void apply(Boolean err);
}

