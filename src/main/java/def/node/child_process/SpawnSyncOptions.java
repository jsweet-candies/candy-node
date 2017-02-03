package def.node.child_process;
import def.node.Buffer;
@jsweet.lang.Interface
public abstract class SpawnSyncOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String cwd;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Buffer> input;
    @jsweet.lang.Optional
    public Object stdio;
    @jsweet.lang.Optional
    public Object env;
    @jsweet.lang.Optional
    public double uid;
    @jsweet.lang.Optional
    public double gid;
    @jsweet.lang.Optional
    public double timeout;
    @jsweet.lang.Optional
    public String killSignal;
    @jsweet.lang.Optional
    public double maxBuffer;
    @jsweet.lang.Optional
    public String encoding;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,String> shell;
}

