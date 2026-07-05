package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: loaded from: classes.dex */
public final class ph9 implements KSerializer {
    public static final ph9 a = new ph9();
    public static final jnf b = j8.o("kotlinx.serialization.json.JsonNull", mnf.l, new SerialDescriptor[0]);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        yb5.h(decoder);
        if (decoder.w()) {
            throw new JsonDecodingException(j8.L("Expected 'null' literal", null, -1, null, null));
        }
        return JsonNull.INSTANCE;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        ((JsonNull) obj).getClass();
        yb5.i(encoder);
        encoder.e();
    }
}
