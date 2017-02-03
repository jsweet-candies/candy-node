package def.node.stream;
public class internal extends def.node.events.EventEmitter {
    native public <T extends def.node.nodejs.WritableStream> T pipe(T destination, Options options);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        @jsweet.lang.Optional
        public Boolean end;
    }
    native public <T extends def.node.nodejs.WritableStream> T pipe(T destination);
}

