package defpackage;

import com.anthropic.claude.api.experience.Experience;
import com.anthropic.claude.api.experience.ExperienceConfig;
import com.anthropic.claude.api.experience.ExperienceContent;
import com.anthropic.claude.api.experience.ExperiencePlacement;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g87 implements w28 {
    public static final g87 a;
    private static final SerialDescriptor descriptor;

    static {
        g87 g87Var = new g87();
        a = g87Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.experience.Experience", g87Var, 6);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("key", false);
        pluginGeneratedSerialDescriptor.j("placement_key", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("enabled", true);
        pluginGeneratedSerialDescriptor.j("config", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = Experience.$childSerializers;
        KSerializer kSerializerS = d4c.S(aa7.d);
        KSerializer kSerializerS2 = d4c.S((KSerializer) kw9VarArr[3].getValue());
        KSerializer kSerializerS3 = d4c.S(l97.a);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kSerializerS, kSerializerS2, zt1.a, kSerializerS3};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = Experience.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        String strV2 = null;
        ExperiencePlacement experiencePlacement = null;
        ExperienceContent experienceContent = null;
        ExperienceConfig experienceConfig = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    experiencePlacement = (ExperiencePlacement) ud4VarC.m(serialDescriptor, 2, aa7.d, experiencePlacement);
                    i |= 4;
                    break;
                case 3:
                    experienceContent = (ExperienceContent) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), experienceContent);
                    i |= 8;
                    break;
                case 4:
                    zU = ud4VarC.u(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    experienceConfig = (ExperienceConfig) ud4VarC.m(serialDescriptor, 5, l97.a, experienceConfig);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new Experience(i, strV, strV2, experiencePlacement, experienceContent, zU, experienceConfig, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Experience experience = (Experience) obj;
        encoder.getClass();
        experience.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        Experience.write$Self$api(experience, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
