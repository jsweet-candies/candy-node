package def.node._debugger;
@jsweet.lang.Interface
public abstract class Response extends Message {
    public double request_seq;
    public Boolean success;
    /** Contains error message if success === false. */
    @jsweet.lang.Optional
    public String message;
    /** Contains message body if success === true. */
    @jsweet.lang.Optional
    public Object body;
}

