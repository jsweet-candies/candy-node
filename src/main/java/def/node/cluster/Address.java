package def.node.cluster;
import jsweet.util.union.Union3;
@jsweet.lang.Interface
public abstract class Address extends def.js.Object {
    public String address;
    public double port;
    public Union3<Double,def.node.StringTypes.udp4,def.node.StringTypes.udp6> addressType;
}

