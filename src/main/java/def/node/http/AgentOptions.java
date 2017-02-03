package def.node.http;
@jsweet.lang.Interface
public abstract class AgentOptions extends def.js.Object {
    /**
         * Keep sockets around in a pool to be used by other requests in the future. Default = false
         */
    @jsweet.lang.Optional
    public Boolean keepAlive;
    /**
         * When using HTTP KeepAlive, how often to send TCP KeepAlive packets over sockets being kept alive. Default = 1000.
         * Only relevant if keepAlive is set to true.
         */
    @jsweet.lang.Optional
    public double keepAliveMsecs;
    /**
         * Maximum number of sockets to allow per host. Default for Node 0.10 is 5, default for Node 0.12 is Infinity
         */
    @jsweet.lang.Optional
    public double maxSockets;
    /**
         * Maximum number of sockets to leave open in a free state. Only relevant if keepAlive is set to true. Default = 256.
         */
    @jsweet.lang.Optional
    public double maxFreeSockets;
}

