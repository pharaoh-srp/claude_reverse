package defpackage;

import com.anthropic.claude.api.experience.ExperienceAsset;
import com.anthropic.claude.api.experience.ExperienceAssetImageVariants;
import com.anthropic.claude.api.experience.ExperienceAssetResizeMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q87 implements w28 {
    public static final q87 a;
    private static final SerialDescriptor descriptor;

    static {
        q87 q87Var = new q87();
        a = q87Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.experience.ExperienceAsset", q87Var, 3);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("resize_mode", true);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(u87.a), x87.d, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        ExperienceAssetImageVariants experienceAssetImageVariants = null;
        ExperienceAssetResizeMode experienceAssetResizeMode = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                experienceAssetImageVariants = (ExperienceAssetImageVariants) ud4VarC.m(serialDescriptor, 0, u87.a, experienceAssetImageVariants);
                i |= 1;
            } else if (iX == 1) {
                experienceAssetResizeMode = (ExperienceAssetResizeMode) ud4VarC.l(serialDescriptor, 1, x87.d, experienceAssetResizeMode);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ExperienceAsset(i, experienceAssetImageVariants, experienceAssetResizeMode, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ExperienceAsset experienceAsset = (ExperienceAsset) obj;
        encoder.getClass();
        experienceAsset.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ExperienceAsset.write$Self$api(experienceAsset, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
