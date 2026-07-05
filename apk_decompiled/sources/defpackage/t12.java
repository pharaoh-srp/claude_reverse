package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class t12 implements KSerializer {
    public static final t12 a = new t12();
    public static final rfd b = new rfd("kotlin.Byte", kfd.m);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return Byte.valueOf(decoder.A());
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        encoder.getClass();
        encoder.i(bByteValue);
    }
}
