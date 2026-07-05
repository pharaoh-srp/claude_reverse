package defpackage;

import com.anthropic.claude.sessions.types.SdkWorkflowAgent;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fdf implements w28 {
    public static final fdf a;
    private static final SerialDescriptor descriptor;

    static {
        fdf fdfVar = new fdf();
        a = fdfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SdkWorkflowAgent", fdfVar, 11);
        pluginGeneratedSerialDescriptor.j("index", false);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("state", true);
        pluginGeneratedSerialDescriptor.j("phaseIndex", true);
        pluginGeneratedSerialDescriptor.j("phaseTitle", true);
        pluginGeneratedSerialDescriptor.j("tokens", true);
        pluginGeneratedSerialDescriptor.j("durationMs", true);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j("startedAt", true);
        pluginGeneratedSerialDescriptor.j("lastProgressAt", true);
        pluginGeneratedSerialDescriptor.j("lastToolName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(e79Var);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S(e79Var);
        xka xkaVar = xka.a;
        return new KSerializer[]{e79Var, srgVar, srgVar, kSerializerS, kSerializerS2, kSerializerS3, d4c.S(xkaVar), d4c.S(srgVar), d4c.S(xkaVar), d4c.S(xkaVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        String str = null;
        Long l = null;
        boolean z2 = true;
        Long l2 = null;
        int i = 0;
        int iR = 0;
        String strV = null;
        String strV2 = null;
        Integer num = null;
        String str2 = null;
        Integer num2 = null;
        Long l3 = null;
        String str3 = null;
        while (z2) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    iR = ud4VarC.r(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    continue;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    continue;
                case 3:
                    z = z2;
                    num = (Integer) ud4VarC.m(serialDescriptor, 3, e79.a, num);
                    i |= 8;
                    break;
                case 4:
                    z = z2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                    i |= 16;
                    break;
                case 5:
                    z = z2;
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 5, e79.a, num2);
                    i |= 32;
                    break;
                case 6:
                    z = z2;
                    l3 = (Long) ud4VarC.m(serialDescriptor, 6, xka.a, l3);
                    i |= 64;
                    break;
                case 7:
                    z = z2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str3);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    z = z2;
                    l2 = (Long) ud4VarC.m(serialDescriptor, 8, xka.a, l2);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    z = z2;
                    l = (Long) ud4VarC.m(serialDescriptor, 9, xka.a, l);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    str = (String) ud4VarC.m(serialDescriptor, 10, srg.a, str);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
            z2 = z;
        }
        ud4VarC.b(serialDescriptor);
        return new SdkWorkflowAgent(i, iR, strV, strV2, num, str2, num2, l3, str3, l2, l, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SdkWorkflowAgent sdkWorkflowAgent = (SdkWorkflowAgent) obj;
        encoder.getClass();
        sdkWorkflowAgent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SdkWorkflowAgent.write$Self$sessions(sdkWorkflowAgent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
