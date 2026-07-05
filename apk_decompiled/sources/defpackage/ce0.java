package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class ce0 implements KSerializer {
    public static final ce0 a = new ce0();
    public static final vo4 b = (vo4) new rp4(jce.a.b(Object.class), null, new KSerializer[0]).e;

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return "not-implemented";
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        obj.getClass();
        JsonElement jsonElementC = dj9.c(obj);
        bg9.d.getClass();
        encoder.h(jsonElementC, JsonElement.INSTANCE.serializer());
    }
}
