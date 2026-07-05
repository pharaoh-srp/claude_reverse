package defpackage;

import com.anthropic.claude.api.events.GrowthBookFeatureEvaluationEventData;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.types.environment.AppEnvironment;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nc8 implements w28 {
    public static final nc8 a;
    private static final SerialDescriptor descriptor;

    static {
        nc8 nc8Var = new nc8();
        a = nc8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.events.GrowthBookFeatureEvaluationEventData", nc8Var, 10);
        pluginGeneratedSerialDescriptor.j("event_id", false);
        pluginGeneratedSerialDescriptor.j("timestamp", false);
        pluginGeneratedSerialDescriptor.j("feature_key", false);
        pluginGeneratedSerialDescriptor.j(ExperienceToggle.DEFAULT_PARAM_KEY, false);
        pluginGeneratedSerialDescriptor.j("reason", false);
        pluginGeneratedSerialDescriptor.j("unit_id", true);
        pluginGeneratedSerialDescriptor.j("environment", true);
        pluginGeneratedSerialDescriptor.j("project_id", true);
        pluginGeneratedSerialDescriptor.j("rule_id", true);
        pluginGeneratedSerialDescriptor.j("user_attributes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = GrowthBookFeatureEvaluationEventData.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, g69.a, srgVar, srgVar, srgVar, d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[6].getValue()), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        kw9[] kw9VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr2 = GrowthBookFeatureEvaluationEventData.$childSerializers;
        String str = null;
        String str2 = null;
        boolean z = true;
        String str3 = null;
        int i = 0;
        String strV = null;
        c69 c69Var = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        String str4 = null;
        AppEnvironment appEnvironment = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    kw9VarArr = kw9VarArr2;
                    z = false;
                    break;
                case 0:
                    kw9VarArr = kw9VarArr2;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    kw9VarArr = kw9VarArr2;
                    c69Var = (c69) ud4VarC.l(serialDescriptor, 1, g69.a, c69Var);
                    i |= 2;
                    break;
                case 2:
                    kw9VarArr = kw9VarArr2;
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    kw9VarArr = kw9VarArr2;
                    strV3 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    kw9VarArr = kw9VarArr2;
                    strV4 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    kw9VarArr = kw9VarArr2;
                    str4 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str4);
                    i |= 32;
                    break;
                case 6:
                    kw9VarArr = kw9VarArr2;
                    appEnvironment = (AppEnvironment) ud4VarC.m(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), appEnvironment);
                    i |= 64;
                    break;
                case 7:
                    kw9VarArr = kw9VarArr2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str3);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    kw9VarArr = kw9VarArr2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str2);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    kw9VarArr = kw9VarArr2;
                    str = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str);
                    i |= 512;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
            kw9VarArr2 = kw9VarArr;
        }
        ud4VarC.b(serialDescriptor);
        return new GrowthBookFeatureEvaluationEventData(i, strV, c69Var, strV2, strV3, strV4, str4, appEnvironment, str3, str2, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GrowthBookFeatureEvaluationEventData growthBookFeatureEvaluationEventData = (GrowthBookFeatureEvaluationEventData) obj;
        encoder.getClass();
        growthBookFeatureEvaluationEventData.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GrowthBookFeatureEvaluationEventData.write$Self$api(growthBookFeatureEvaluationEventData, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
