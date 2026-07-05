package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.experience.ExperienceAssetScaledImage;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y87 implements w28 {
    public static final y87 a;
    private static final SerialDescriptor descriptor;

    static {
        y87 y87Var = new y87();
        a = y87Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.experience.ExperienceAssetScaledImage", y87Var, 2);
        pluginGeneratedSerialDescriptor.j("url", false);
        pluginGeneratedSerialDescriptor.j("scale", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, uo7.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        float fD = MTTypesetterKt.kLineSkipLimitMultiplier;
        boolean z = true;
        int i = 0;
        String strV = null;
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
                fD = ud4VarC.D(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ExperienceAssetScaledImage(i, strV, fD, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ExperienceAssetScaledImage experienceAssetScaledImage = (ExperienceAssetScaledImage) obj;
        encoder.getClass();
        experienceAssetScaledImage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ExperienceAssetScaledImage.write$Self$api(experienceAssetScaledImage, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
