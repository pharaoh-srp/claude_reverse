package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class na6 implements KSerializer {
    public static final na6 a = new na6();
    public static final rfd b = new rfd("kotlin.Double", kfd.o);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return Double.valueOf(decoder.E());
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        encoder.getClass();
        encoder.f(dDoubleValue);
    }
}
