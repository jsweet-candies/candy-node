package def.node._debugger;
@jsweet.lang.Interface
public abstract class Event extends Message {
    public String event;
    @jsweet.lang.Optional
    public Object body;
}

