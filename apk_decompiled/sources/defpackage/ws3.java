package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$CodeSessionInitBreakdown;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ws3 implements w28 {
    public static final ws3 a;
    private static final SerialDescriptor descriptor;

    static {
        ws3 ws3Var = new ws3();
        a = ws3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.session.init_breakdown", ws3Var, 12);
        pluginGeneratedSerialDescriptor.j("session_id", false);
        pluginGeneratedSerialDescriptor.j("surface", true);
        pluginGeneratedSerialDescriptor.j("session_type", true);
        pluginGeneratedSerialDescriptor.j("session_mode", true);
        pluginGeneratedSerialDescriptor.j("is_new_session", false);
        pluginGeneratedSerialDescriptor.j("ttft_ms", true);
        pluginGeneratedSerialDescriptor.j("provision_ms", true);
        pluginGeneratedSerialDescriptor.j("clone_ms", true);
        pluginGeneratedSerialDescriptor.j("setup_script_ms", true);
        pluginGeneratedSerialDescriptor.j("start_cc_ms", true);
        qy1.z(pluginGeneratedSerialDescriptor, "cc_init_ms", true, "time_in_background_ms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S(srgVar);
        xka xkaVar = xka.a;
        return new KSerializer[]{srgVar, kSerializerS, kSerializerS2, kSerializerS3, zt1.a, d4c.S(xkaVar), d4c.S(xkaVar), d4c.S(xkaVar), d4c.S(xkaVar), d4c.S(xkaVar), d4c.S(xkaVar), d4c.S(xkaVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        boolean z;
        String str;
        boolean z2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        boolean z3 = true;
        Long l4 = null;
        int i = 0;
        String strV = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean zU = false;
        Long l5 = null;
        Long l6 = null;
        Long l7 = null;
        while (z3) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z3 = false;
                    break;
                case 0:
                    z2 = z3;
                    i |= 1;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    z3 = z2;
                    break;
                case 1:
                    z = z3;
                    str = strV;
                    str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                    i |= 2;
                    z3 = z;
                    strV = str;
                    break;
                case 2:
                    z = z3;
                    str = strV;
                    str3 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str3);
                    i |= 4;
                    z3 = z;
                    strV = str;
                    break;
                case 3:
                    z = z3;
                    str = strV;
                    str4 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str4);
                    i |= 8;
                    z3 = z;
                    strV = str;
                    break;
                case 4:
                    z2 = z3;
                    zU = ud4VarC.u(serialDescriptor, 4);
                    i |= 16;
                    z3 = z2;
                    break;
                case 5:
                    z = z3;
                    str = strV;
                    l5 = (Long) ud4VarC.m(serialDescriptor, 5, xka.a, l5);
                    i |= 32;
                    z3 = z;
                    strV = str;
                    break;
                case 6:
                    z = z3;
                    str = strV;
                    l6 = (Long) ud4VarC.m(serialDescriptor, 6, xka.a, l6);
                    i |= 64;
                    z3 = z;
                    strV = str;
                    break;
                case 7:
                    z = z3;
                    str = strV;
                    l7 = (Long) ud4VarC.m(serialDescriptor, 7, xka.a, l7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    z3 = z;
                    strV = str;
                    break;
                case 8:
                    z = z3;
                    str = strV;
                    l4 = (Long) ud4VarC.m(serialDescriptor, 8, xka.a, l4);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    z3 = z;
                    strV = str;
                    break;
                case 9:
                    z = z3;
                    str = strV;
                    l3 = (Long) ud4VarC.m(serialDescriptor, 9, xka.a, l3);
                    i |= 512;
                    z3 = z;
                    strV = str;
                    break;
                case 10:
                    z = z3;
                    str = strV;
                    l2 = (Long) ud4VarC.m(serialDescriptor, 10, xka.a, l2);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    z3 = z;
                    strV = str;
                    break;
                case 11:
                    z = z3;
                    str = strV;
                    l = (Long) ud4VarC.m(serialDescriptor, 11, xka.a, l);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    z3 = z;
                    strV = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$CodeSessionInitBreakdown(i, strV, str2, str3, str4, zU, l5, l6, l7, l4, l3, l2, l, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$CodeSessionInitBreakdown codeEvents$CodeSessionInitBreakdown = (CodeEvents$CodeSessionInitBreakdown) obj;
        encoder.getClass();
        codeEvents$CodeSessionInitBreakdown.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$CodeSessionInitBreakdown.write$Self$analytics(codeEvents$CodeSessionInitBreakdown, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
