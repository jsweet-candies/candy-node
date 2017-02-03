package def.node.child_process;
@jsweet.lang.Interface
public abstract class SpawnOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String cwd;
    @jsweet.lang.Optional
    public Object env;
    @jsweet.lang.Optional
    public Object stdio;
    @jsweet.lang.Optional
    public Boolean detached;
    @jsweet.lang.Optional
    public double uid;
    @jsweet.lang.Optional
    public double gid;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,String> shell;
}

