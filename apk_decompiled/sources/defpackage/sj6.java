package defpackage;

import com.anthropic.claude.analytics.events.ElectionBannerEvents$ElectionBannerView;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sj6 implements w28 {
    public static final sj6 a;
    private static final SerialDescriptor descriptor;

    static {
        sj6 sj6Var = new sj6();
        a = sj6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("election_banner_view", sj6Var, 2);
        pluginGeneratedSerialDescriptor.j("message_id", false);
        pluginGeneratedSerialDescriptor.j("surface", true);
        pluginGeneratedSerialDescriptor.k(new pi(20));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar)};
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
        String str = null;
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
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ElectionBannerEvents$ElectionBannerView(i, strV, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ElectionBannerEvents$ElectionBannerView electionBannerEvents$ElectionBannerView = (ElectionBannerEvents$ElectionBannerView) obj;
        encoder.getClass();
        electionBannerEvents$ElectionBannerView.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ElectionBannerEvents$ElectionBannerView.write$Self$analytics(electionBannerEvents$ElectionBannerView, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
