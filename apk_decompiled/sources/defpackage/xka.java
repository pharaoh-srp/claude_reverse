package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class xka implements KSerializer {
    public static final xka a = new xka();
    public static final rfd b = new rfd("kotlin.Long", kfd.r);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return Long.valueOf(decoder.t());
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        encoder.getClass();
        encoder.A(jLongValue);
    }
}
