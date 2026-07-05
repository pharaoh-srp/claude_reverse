package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class h5g implements KSerializer {
    public static final h5g a = new h5g();
    public static final rfd b = new rfd("kotlin.Short", kfd.s);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return Short.valueOf(decoder.B());
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        encoder.getClass();
        encoder.g(sShortValue);
    }
}
