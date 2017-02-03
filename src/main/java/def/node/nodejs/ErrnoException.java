package def.node.nodejs;
import def.js.Error;
@jsweet.lang.Interface
@java.lang.SuppressWarnings("serial")
public abstract class ErrnoException extends Error {
    @jsweet.lang.Optional
    public double errno;
    @jsweet.lang.Optional
    public String code;
    @jsweet.lang.Optional
    public String path;
    @jsweet.lang.Optional
    public String syscall;
    @jsweet.lang.Optional
    public String stack;
}

