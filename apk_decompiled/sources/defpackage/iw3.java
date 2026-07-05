package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$SessionReattestResult;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iw3 implements w28 {
    public static final iw3 a;
    private static final SerialDescriptor descriptor;

    static {
        iw3 iw3Var = new iw3();
        a = iw3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_code_session_reattest_result", iw3Var, 7);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("success", false);
        pluginGeneratedSerialDescriptor.j("outcome", false);
        pluginGeneratedSerialDescriptor.j("kid", true);
        pluginGeneratedSerialDescriptor.j("challenge_id", true);
        qy1.z(pluginGeneratedSerialDescriptor, "os_error_code", true, "application_state", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, zt1.a, srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(xka.a), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        String strV2 = null;
        String str = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
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
                    zU = ud4VarC.u(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) ud4VarC.m(serialDescriptor, 5, xka.a, l);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str3);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$SessionReattestResult(i, strV, zU, strV2, str, str2, l, str3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$SessionReattestResult codeEvents$SessionReattestResult = (CodeEvents$SessionReattestResult) obj;
        encoder.getClass();
        codeEvents$SessionReattestResult.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$SessionReattestResult.write$Self$analytics(codeEvents$SessionReattestResult, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
