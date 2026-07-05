package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class e79 implements KSerializer {
    public static final e79 a = new e79();
    public static final rfd b = new rfd("kotlin.Int", kfd.q);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return Integer.valueOf(decoder.p());
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        encoder.getClass();
        encoder.w(iIntValue);
    }
}
