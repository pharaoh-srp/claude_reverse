package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class t9c implements KSerializer {
    public final KSerializer a;
    public final inf b;

    public t9c(KSerializer kSerializer) {
        kSerializer.getClass();
        this.a = kSerializer;
        this.b = new inf(kSerializer.getDescriptor());
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        if (decoder.w()) {
            return decoder.g(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && t9c.class == obj.getClass() && x44.r(this.a, ((t9c) obj).a);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        if (obj != null) {
            encoder.h(obj, this.a);
        } else {
            encoder.e();
        }
    }
}
