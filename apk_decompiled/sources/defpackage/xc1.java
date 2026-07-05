package defpackage;

import com.anthropic.claude.api.experience.BannerContent;
import com.anthropic.claude.api.experience.ExperienceAsset;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xc1 implements w28 {
    public static final xc1 a;
    private static final SerialDescriptor descriptor;

    static {
        xc1 xc1Var = new xc1();
        a = xc1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("android-banner", xc1Var, 5);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("asset", true);
        pluginGeneratedSerialDescriptor.j("buttons", true);
        pluginGeneratedSerialDescriptor.j("inline_buttons", true);
        pluginGeneratedSerialDescriptor.k(new gl0(6));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = BannerContent.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), d4c.S(q87.a), kw9VarArr[3].getValue(), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = BannerContent.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        String str = null;
        ExperienceAsset experienceAsset = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else if (iX == 2) {
                experienceAsset = (ExperienceAsset) ud4VarC.m(serialDescriptor, 2, q87.a, experienceAsset);
                i |= 4;
            } else if (iX == 3) {
                list = (List) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 4);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BannerContent(i, strV, str, experienceAsset, list, zU, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BannerContent bannerContent = (BannerContent) obj;
        encoder.getClass();
        bannerContent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BannerContent.write$Self$api(bannerContent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
