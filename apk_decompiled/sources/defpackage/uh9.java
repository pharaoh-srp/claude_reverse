package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class uh9 implements KSerializer {
    public static final uh9 a = new uh9();
    public static final th9 b = th9.b;

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        yb5.h(decoder);
        return new JsonObject((Map) d4c.u(srg.a, eh9.a).deserialize(decoder));
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        JsonObject jsonObject = (JsonObject) obj;
        encoder.getClass();
        jsonObject.getClass();
        yb5.i(encoder);
        d4c.u(srg.a, eh9.a).serialize(encoder, jsonObject);
    }
}
