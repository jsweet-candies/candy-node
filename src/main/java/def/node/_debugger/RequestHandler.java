package def.node._debugger;
@jsweet.lang.Interface
public abstract class RequestHandler extends def.js.Object {
    native public void apply(Boolean err, Message body, Packet res);
    @jsweet.lang.Optional
    public double request_seq;
}

