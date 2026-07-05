package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class uo7 implements KSerializer {
    public static final uo7 a = new uo7();
    public static final rfd b = new rfd("kotlin.Float", kfd.p);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return Float.valueOf(decoder.C());
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        encoder.getClass();
        encoder.m(fFloatValue);
    }
}
