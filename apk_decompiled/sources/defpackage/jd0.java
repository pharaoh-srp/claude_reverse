package defpackage;

import com.anthropic.claude.analytics.events.AnonymousEvents$UpsellShown;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jd0 implements w28 {
    public static final jd0 a;
    private static final SerialDescriptor descriptor;

    static {
        jd0 jd0Var = new jd0();
        a = jd0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.anonymous.upsell.shown", jd0Var, 2);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("variant", false);
        pluginGeneratedSerialDescriptor.k(new pi(4));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AnonymousEvents$UpsellShown(i, strV, strV2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AnonymousEvents$UpsellShown anonymousEvents$UpsellShown = (AnonymousEvents$UpsellShown) obj;
        encoder.getClass();
        anonymousEvents$UpsellShown.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AnonymousEvents$UpsellShown.write$Self$analytics(anonymousEvents$UpsellShown, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
