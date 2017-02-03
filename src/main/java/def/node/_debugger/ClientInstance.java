package def.node._debugger;
@jsweet.lang.Interface
public abstract class ClientInstance extends def.node.nodejs.EventEmitter {
    public Protocol protocol;
    public ScriptDesc[] scripts;
    public ScriptDesc[] handles;
    public Breakpoint[] breakpoints;
    public double currentSourceLine;
    public double currentSourceColumn;
    public String currentSourceLineText;
    public double currentFrame;
    public String currentScript;
    native public void connect(double port, String host);
    native public void req(Object req, RequestHandler cb);
    native public void reqFrameEval(String code, double frame, RequestHandler cb);
    native public void mirrorObject(Object obj, double depth, ResponseBodyHandler cb);
    native public void setBreakpoint(BreakpointMessageBody rq, RequestHandler cb);
    native public void clearBreakpoint(Request rq, RequestHandler cb);
    native public void listbreakpoints(RequestHandler cb);
    native public void reqSource(double from, double to, RequestHandler cb);
    native public void reqScripts(Object cb);
    native public void reqContinue(RequestHandler cb);
}

