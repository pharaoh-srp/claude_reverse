package defpackage;

import com.anthropic.claude.api.account.BannerDismissal;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zc1 implements w28 {
    public static final zc1 a;
    private static final SerialDescriptor descriptor;

    static {
        zc1 zc1Var = new zc1();
        a = zc1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.account.BannerDismissal", zc1Var, 2);
        pluginGeneratedSerialDescriptor.j("banner_id", true);
        pluginGeneratedSerialDescriptor.j("dismissed_at", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(srg.a), d4c.S(bc9.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        Date date = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                date = (Date) ud4VarC.m(serialDescriptor, 1, bc9.a, date);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BannerDismissal(i, str, date, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BannerDismissal bannerDismissal = (BannerDismissal) obj;
        encoder.getClass();
        bannerDismissal.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BannerDismissal.write$Self$api(bannerDismissal, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
