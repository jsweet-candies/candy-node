package def.node.dgram;
@jsweet.lang.Interface
public abstract class SocketOptions extends def.js.Object {
    public jsweet.util.union.Union<def.node.StringTypes.udp4,def.node.StringTypes.udp6> type;
    @jsweet.lang.Optional
    public Boolean reuseAddr;
}

