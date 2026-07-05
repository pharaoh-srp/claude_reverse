package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class jci implements KSerializer {
    public static final jci a = new jci();
    public static final x29 b = x44.c("kotlin.UByte", t12.a);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return new eci(decoder.y(b).A());
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        byte b2 = ((eci) obj).E;
        encoder.getClass();
        encoder.x(b).i(b2);
    }
}
