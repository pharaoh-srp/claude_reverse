package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$SessionReattestPrompted;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gw3 implements w28 {
    public static final gw3 a;
    private static final SerialDescriptor descriptor;

    static {
        gw3 gw3Var = new gw3();
        a = gw3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_code_session_reattest_prompted", gw3Var, 7);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("kid", true);
        pluginGeneratedSerialDescriptor.j("challenge_id", true);
        pluginGeneratedSerialDescriptor.j("application_state", true);
        pluginGeneratedSerialDescriptor.j("biometry_available", true);
        qy1.z(pluginGeneratedSerialDescriptor, "biometry_error_code", true, "trigger", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(zt1.a), d4c.S(xka.a), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        Long l = null;
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
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 4, zt1.a, bool);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) ud4VarC.m(serialDescriptor, 5, xka.a, l);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str4);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$SessionReattestPrompted(i, strV, str, str2, str3, bool, l, str4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$SessionReattestPrompted codeEvents$SessionReattestPrompted = (CodeEvents$SessionReattestPrompted) obj;
        encoder.getClass();
        codeEvents$SessionReattestPrompted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$SessionReattestPrompted.write$Self$analytics(codeEvents$SessionReattestPrompted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
