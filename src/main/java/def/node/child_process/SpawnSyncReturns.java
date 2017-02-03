package def.node.child_process;
import def.js.Error;
@jsweet.lang.Interface
public abstract class SpawnSyncReturns<T> extends def.js.Object {
    public double pid;
    public String[] output;
    public T stdout;
    public T stderr;
    public double status;
    public String signal;
    public Error error;
}

