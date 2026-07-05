package defpackage;

import com.anthropic.claude.api.events.GrowthBookExperimentEventData;
import com.anthropic.claude.types.environment.AppEnvironment;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fc8 implements w28 {
    public static final fc8 a;
    private static final SerialDescriptor descriptor;

    static {
        fc8 fc8Var = new fc8();
        a = fc8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.events.GrowthBookExperimentEventData", fc8Var, 9);
        pluginGeneratedSerialDescriptor.j("event_id", false);
        pluginGeneratedSerialDescriptor.j("timestamp", false);
        pluginGeneratedSerialDescriptor.j("experiment_id", false);
        pluginGeneratedSerialDescriptor.j("variation_id", false);
        pluginGeneratedSerialDescriptor.j("environment", true);
        pluginGeneratedSerialDescriptor.j("experiment_metadata", true);
        pluginGeneratedSerialDescriptor.j("device_id", true);
        pluginGeneratedSerialDescriptor.j("session_id", true);
        pluginGeneratedSerialDescriptor.j("user_attributes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = GrowthBookExperimentEventData.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, g69.a, srgVar, e79.a, d4c.S((KSerializer) kw9VarArr[4].getValue()), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = GrowthBookExperimentEventData.$childSerializers;
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        String strV = null;
        c69 c69Var = null;
        String strV2 = null;
        int iR = 0;
        AppEnvironment appEnvironment = null;
        String str3 = null;
        String str4 = null;
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
                    c69Var = (c69) ud4VarC.l(serialDescriptor, 1, g69.a, c69Var);
                    i |= 2;
                    break;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iR = ud4VarC.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    appEnvironment = (AppEnvironment) ud4VarC.m(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), appEnvironment);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str3);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str4);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str2);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    str = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GrowthBookExperimentEventData(i, strV, c69Var, strV2, iR, appEnvironment, str3, str4, str2, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GrowthBookExperimentEventData growthBookExperimentEventData = (GrowthBookExperimentEventData) obj;
        encoder.getClass();
        growthBookExperimentEventData.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GrowthBookExperimentEventData.write$Self$api(growthBookExperimentEventData, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
