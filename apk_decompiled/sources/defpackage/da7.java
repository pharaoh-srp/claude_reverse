package defpackage;

import com.anthropic.claude.api.experience.ExperienceCooldown;
import com.anthropic.claude.api.experience.ExperienceRateLimit;
import com.anthropic.claude.api.experience.ExperienceRuleSet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da7 implements w28 {
    public static final da7 a;
    private static final SerialDescriptor descriptor;

    static {
        da7 da7Var = new da7();
        a = da7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.experience.ExperienceRuleSet", da7Var, 2);
        pluginGeneratedSerialDescriptor.j("rate_limit", true);
        pluginGeneratedSerialDescriptor.j("cooldown", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(ba7.a), d4c.S(o97.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        ExperienceRateLimit experienceRateLimit = null;
        ExperienceCooldown experienceCooldown = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                experienceRateLimit = (ExperienceRateLimit) ud4VarC.m(serialDescriptor, 0, ba7.a, experienceRateLimit);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                experienceCooldown = (ExperienceCooldown) ud4VarC.m(serialDescriptor, 1, o97.a, experienceCooldown);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ExperienceRuleSet(i, experienceRateLimit, experienceCooldown, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ExperienceRuleSet experienceRuleSet = (ExperienceRuleSet) obj;
        encoder.getClass();
        experienceRuleSet.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ExperienceRuleSet.write$Self$api(experienceRuleSet, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
