package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class kei implements KSerializer {
    public static final kei b = new kei();
    public final /* synthetic */ lq6 a = new lq6("kotlin.Unit", iei.a);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        this.a.deserialize(decoder);
        return iei.a;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        iei ieiVar = (iei) obj;
        encoder.getClass();
        ieiVar.getClass();
        this.a.serialize(encoder, ieiVar);
    }
}
