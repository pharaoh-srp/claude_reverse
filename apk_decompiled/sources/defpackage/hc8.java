package defpackage;

import com.anthropic.claude.api.account.GrowthBookExperimentResult;
import com.anthropic.claude.api.experience.ExperienceToggle;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hc8 implements w28 {
    public static final hc8 a;
    private static final SerialDescriptor descriptor;

    static {
        hc8 hc8Var = new hc8();
        a = hc8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.account.GrowthBookExperimentResult", hc8Var, 4);
        pluginGeneratedSerialDescriptor.j("inExperiment", true);
        pluginGeneratedSerialDescriptor.j("variationId", true);
        pluginGeneratedSerialDescriptor.j(ExperienceToggle.DEFAULT_PARAM_KEY, true);
        pluginGeneratedSerialDescriptor.j("hashUsed", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{d4c.S(zt1Var), d4c.S(e79.a), d4c.S(eh9.a), d4c.S(zt1Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Integer num = null;
        JsonElement jsonElement = null;
        Boolean bool2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                bool = (Boolean) ud4VarC.m(serialDescriptor, 0, zt1.a, bool);
                i |= 1;
            } else if (iX == 1) {
                num = (Integer) ud4VarC.m(serialDescriptor, 1, e79.a, num);
                i |= 2;
            } else if (iX == 2) {
                jsonElement = (JsonElement) ud4VarC.m(serialDescriptor, 2, eh9.a, jsonElement);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                bool2 = (Boolean) ud4VarC.m(serialDescriptor, 3, zt1.a, bool2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GrowthBookExperimentResult(i, bool, num, jsonElement, bool2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GrowthBookExperimentResult growthBookExperimentResult = (GrowthBookExperimentResult) obj;
        encoder.getClass();
        growthBookExperimentResult.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GrowthBookExperimentResult.write$Self$api(growthBookExperimentResult, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
