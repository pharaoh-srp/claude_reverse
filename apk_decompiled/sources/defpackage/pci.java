package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class pci implements KSerializer {
    public static final pci a = new pci();
    public static final x29 b = x44.c("kotlin.UInt", e79.a);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return new lci(decoder.y(b).p());
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        int i = ((lci) obj).E;
        encoder.getClass();
        encoder.x(b).w(i);
    }
}
