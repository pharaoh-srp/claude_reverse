package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class zt1 implements KSerializer {
    public static final zt1 a = new zt1();
    public static final rfd b = new rfd("kotlin.Boolean", kfd.l);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return Boolean.valueOf(decoder.f());
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        encoder.getClass();
        encoder.j(zBooleanValue);
    }
}
