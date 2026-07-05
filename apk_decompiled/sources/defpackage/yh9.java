package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class yh9 implements KSerializer {
    public static final yh9 a = new yh9();
    public static final jnf b = j8.o("kotlinx.serialization.json.JsonPrimitive", kfd.t, new SerialDescriptor[0]);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        zg9 zg9VarH = yb5.h(decoder);
        JsonElement jsonElementN = zg9VarH.n();
        if (jsonElementN instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementN;
        }
        throw new JsonDecodingException(j8.L(sq6.t(jce.a, jsonElementN.getClass(), new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ")), null, -1, null, zg9VarH.d().a.k ? j8.V(-1, jsonElementN.toString()).toString() : null));
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        encoder.getClass();
        jsonPrimitive.getClass();
        yb5.i(encoder);
        if (jsonPrimitive instanceof JsonNull) {
            encoder.h(JsonNull.INSTANCE, ph9.a);
        } else {
            encoder.h((jh9) jsonPrimitive, kh9.a);
        }
    }
}
