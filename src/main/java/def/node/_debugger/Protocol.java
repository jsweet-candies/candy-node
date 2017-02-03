package def.node._debugger;
public class Protocol extends def.js.Object {
    public Packet res;
    public String state;
    native public void execute(String data);
    native public String serialize(Request rq);
    public java.util.function.Consumer<Packet> onResponse;
}

