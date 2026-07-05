package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes2.dex */
public final class b2e implements KSerializer {
    public static final b2e a = new b2e();
    public static final rfd b = j8.h("RawJsonSerializer", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof zg9)) {
            sz6.j("Decoding only supported with JSON decoders");
            return null;
        }
        JsonElement jsonElementN = ((zg9) decoder).n();
        if (jsonElementN instanceof JsonNull) {
            return null;
        }
        if (jsonElementN instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementN;
            if (jsonPrimitive.isString()) {
                return jsonPrimitive.getContent();
            }
        }
        return jsonElementN.toString();
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        String str = (String) obj;
        encoder.getClass();
        if (encoder instanceof gh9) {
            ((gh9) encoder).u(ch9.c(str));
        } else if (str == null) {
            encoder.e();
        } else {
            encoder.F(str);
        }
    }
}
