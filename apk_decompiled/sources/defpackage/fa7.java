package defpackage;

import com.anthropic.claude.api.experience.ExperienceRuleSet;
import com.anthropic.claude.api.experience.ExperienceRules;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fa7 implements w28 {
    public static final fa7 a;
    private static final SerialDescriptor descriptor;

    static {
        fa7 fa7Var = new fa7();
        a = fa7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.experience.ExperienceRules", fa7Var, 2);
        pluginGeneratedSerialDescriptor.j("global", true);
        pluginGeneratedSerialDescriptor.j("placements", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(da7.a), ExperienceRules.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ExperienceRules.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        ExperienceRuleSet experienceRuleSet = null;
        Map map = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                experienceRuleSet = (ExperienceRuleSet) ud4VarC.m(serialDescriptor, 0, da7.a, experienceRuleSet);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                map = (Map) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), map);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ExperienceRules(i, experienceRuleSet, map, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ExperienceRules experienceRules = (ExperienceRules) obj;
        encoder.getClass();
        experienceRules.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ExperienceRules.write$Self$api(experienceRules, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
