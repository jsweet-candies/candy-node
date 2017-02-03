package def.node.tty;
@jsweet.lang.Interface
public abstract class ReadStream extends def.node.net.Socket {
    public Boolean isRaw;
    native public void setRawMode(Boolean mode);
    public Boolean isTTY;
}

