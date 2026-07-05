package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public final class pei implements KSerializer {
    public final String a;
    public final jnf b;

    public pei(String str) {
        this.a = str;
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (bsg.I0("UnknownContentBlockDelta")) {
            sz6.p("Blank serial names are prohibited");
            throw null;
        }
        oh3 oh3Var = new oh3("UnknownContentBlockDelta");
        srg srgVar = srg.a;
        oh3Var.a("type", srg.b);
        this.b = new jnf("UnknownContentBlockDelta", vsg.l, oh3Var.c.size(), mp0.Y0(serialDescriptorArr), oh3Var);
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        try {
            if (decoder instanceof zg9) {
                ((zg9) decoder).n();
            }
        } catch (Throwable unused) {
        }
        return new qei(this.a);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        ((qei) obj).getClass();
        throw new IllegalStateException("Serialization is not supported");
    }
}
