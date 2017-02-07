package def.node.crypto;
import def.node.Buffer;
@jsweet.lang.Interface
public abstract class ECDH extends def.js.Object {
    native public Buffer generateKeys();
    native public String generateKeys(def.node.StringTypes.latin1 encoding);
    native public String generateKeys(def.node.StringTypes.latin1 encoding, def.node.StringTypes.compressed format);
    native public Buffer computeSecret(Buffer other_public_key);
    native public Buffer computeSecret(String other_public_key, def.node.StringTypes.latin1 input_encoding);
    native public String computeSecret(String other_public_key, def.node.StringTypes.latin1 input_encoding, def.node.StringTypes.latin1 output_encoding);
    native public Buffer getPrivateKey();
    native public String getPrivateKey(def.node.StringTypes.latin1 encoding);
    native public Buffer getPublicKey();
    native public String getPublicKey(def.node.StringTypes.latin1 encoding);
    native public String getPublicKey(def.node.StringTypes.latin1 encoding, def.node.StringTypes.compressed format);
    native public void setPrivateKey(Buffer private_key);
    native public void setPrivateKey(String private_key, def.node.StringTypes.latin1 encoding);
    native public String generateKeys(def.node.StringTypes.base64 encoding);
    native public String generateKeys(def.node.StringTypes.hex encoding);
    native public String generateKeys(def.node.StringTypes.hex encoding, def.node.StringTypes.hybrid format);
    native public String generateKeys(def.node.StringTypes.hex encoding, def.node.StringTypes.uncompressed format);
    native public String generateKeys(def.node.StringTypes.base64 encoding, def.node.StringTypes.uncompressed format);
    native public String generateKeys(def.node.StringTypes.latin1 encoding, def.node.StringTypes.uncompressed format);
    native public String generateKeys(def.node.StringTypes.latin1 encoding, def.node.StringTypes.hybrid format);
    native public String generateKeys(def.node.StringTypes.hex encoding, def.node.StringTypes.compressed format);
    native public String generateKeys(def.node.StringTypes.base64 encoding, def.node.StringTypes.compressed format);
    native public String generateKeys(def.node.StringTypes.base64 encoding, def.node.StringTypes.hybrid format);
    native public Buffer computeSecret(String other_public_key, def.node.StringTypes.base64 input_encoding);
    native public Buffer computeSecret(String other_public_key, def.node.StringTypes.hex input_encoding);
    native public String computeSecret(String other_public_key, def.node.StringTypes.base64 input_encoding, def.node.StringTypes.hex output_encoding);
    native public String computeSecret(String other_public_key, def.node.StringTypes.latin1 input_encoding, def.node.StringTypes.hex output_encoding);
    native public String computeSecret(String other_public_key, def.node.StringTypes.base64 input_encoding, def.node.StringTypes.base64 output_encoding);
    native public String computeSecret(String other_public_key, def.node.StringTypes.hex input_encoding, def.node.StringTypes.hex output_encoding);
    native public String computeSecret(String other_public_key, def.node.StringTypes.latin1 input_encoding, def.node.StringTypes.base64 output_encoding);
    native public String computeSecret(String other_public_key, def.node.StringTypes.hex input_encoding, def.node.StringTypes.base64 output_encoding);
    native public String computeSecret(String other_public_key, def.node.StringTypes.base64 input_encoding, def.node.StringTypes.latin1 output_encoding);
    native public String computeSecret(String other_public_key, def.node.StringTypes.hex input_encoding, def.node.StringTypes.latin1 output_encoding);
    native public String getPrivateKey(def.node.StringTypes.base64 encoding);
    native public String getPrivateKey(def.node.StringTypes.hex encoding);
    native public String getPublicKey(def.node.StringTypes.base64 encoding);
    native public String getPublicKey(def.node.StringTypes.hex encoding);
    native public String getPublicKey(def.node.StringTypes.latin1 encoding, def.node.StringTypes.uncompressed format);
    native public String getPublicKey(def.node.StringTypes.latin1 encoding, def.node.StringTypes.hybrid format);
    native public String getPublicKey(def.node.StringTypes.base64 encoding, def.node.StringTypes.compressed format);
    native public String getPublicKey(def.node.StringTypes.hex encoding, def.node.StringTypes.compressed format);
    native public String getPublicKey(def.node.StringTypes.hex encoding, def.node.StringTypes.hybrid format);
    native public String getPublicKey(def.node.StringTypes.base64 encoding, def.node.StringTypes.hybrid format);
    native public String getPublicKey(def.node.StringTypes.base64 encoding, def.node.StringTypes.uncompressed format);
    native public String getPublicKey(def.node.StringTypes.hex encoding, def.node.StringTypes.uncompressed format);
    native public void setPrivateKey(String private_key, def.node.StringTypes.hex encoding);
    native public void setPrivateKey(String private_key, def.node.StringTypes.base64 encoding);
}
