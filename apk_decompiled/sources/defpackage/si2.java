package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class si2 implements KSerializer {
    public static final si2 a = new si2();
    public static final rfd b = new rfd("kotlin.Char", kfd.n);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return Character.valueOf(decoder.h());
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        encoder.getClass();
        encoder.o(cCharValue);
    }
}
