package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class y29 implements w28 {
    public final /* synthetic */ KSerializer a;

    public y29(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{this.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        throw new IllegalStateException("unsupported");
    }
}
