package def.node.crypto;
import def.node.Buffer;
public class Certificate extends def.js.Object {
    native public Buffer exportChallenge(String spkac);
    native public Buffer exportPublicKey(String spkac);
    native public Boolean verifySpkac(Buffer spkac);
    public Certificate(){}
    native public static Certificate applyStatic();
    native public Buffer exportChallenge(Buffer spkac);
    native public Buffer exportPublicKey(Buffer spkac);
}

