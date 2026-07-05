package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class eh9 implements KSerializer {
    public static final eh9 a = new eh9();
    public static final jnf b = j8.n("kotlinx.serialization.json.JsonElement", t8d.l, new SerialDescriptor[0], new fg7(23));

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return yb5.h(decoder).n();
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        encoder.getClass();
        jsonElement.getClass();
        yb5.i(encoder);
        if (jsonElement instanceof JsonPrimitive) {
            encoder.h(jsonElement, yh9.a);
            return;
        }
        if (jsonElement instanceof JsonObject) {
            encoder.h(jsonElement, uh9.a);
        } else if (jsonElement instanceof JsonArray) {
            encoder.h(jsonElement, lg9.a);
        } else {
            mr9.b();
        }
    }
}
