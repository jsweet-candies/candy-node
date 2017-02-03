package def.node._debugger;
@jsweet.lang.Interface
@jsweet.lang.Extends({RequestInfo.class})
public abstract class Request extends Message {
    public String command;
    public Object arguments;
}

