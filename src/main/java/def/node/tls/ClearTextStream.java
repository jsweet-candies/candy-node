package def.node.tls;
import def.js.Error;
@jsweet.lang.Interface
public abstract class ClearTextStream extends def.node.stream.Duplex {
    public Boolean authorized;
    public Error authorizationError;
    native public Object getPeerCertificate();
    public GetCipher getCipher;
    public Address address;
    public String remoteAddress;
    public double remotePort;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class GetCipher extends def.js.Object {
        public String name;
        public String version;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Address extends def.js.Object {
        public double port;
        public String family;
        public String address;
    }
}

