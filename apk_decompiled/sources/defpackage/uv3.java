package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$SessionListLoaded;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uv3 implements w28 {
    public static final uv3 a;
    private static final SerialDescriptor descriptor;

    static {
        uv3 uv3Var = new uv3();
        a = uv3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_code_session_list_loaded", uv3Var, 9);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("session_count", false);
        pluginGeneratedSerialDescriptor.j("has_bridge_sessions", false);
        pluginGeneratedSerialDescriptor.j("error_description", true);
        pluginGeneratedSerialDescriptor.j("need_input_count", true);
        pluginGeneratedSerialDescriptor.j("review_ready_count", true);
        pluginGeneratedSerialDescriptor.j("working_count", true);
        qy1.z(pluginGeneratedSerialDescriptor, "completed_count", true, "archived_count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, e79Var, zt1.a, d4c.S(srgVar), d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        Integer num = null;
        String strV = null;
        String str = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        int i = 0;
        int iR = 0;
        boolean zU = false;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    iR = ud4VarC.r(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    zU = ud4VarC.u(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 4, e79.a, num2);
                    i |= 16;
                    break;
                case 5:
                    num3 = (Integer) ud4VarC.m(serialDescriptor, 5, e79.a, num3);
                    i |= 32;
                    break;
                case 6:
                    num4 = (Integer) ud4VarC.m(serialDescriptor, 6, e79.a, num4);
                    i |= 64;
                    break;
                case 7:
                    num5 = (Integer) ud4VarC.m(serialDescriptor, 7, e79.a, num5);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    num = (Integer) ud4VarC.m(serialDescriptor, 8, e79.a, num);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$SessionListLoaded(i, strV, iR, zU, str, num2, num3, num4, num5, num, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$SessionListLoaded codeEvents$SessionListLoaded = (CodeEvents$SessionListLoaded) obj;
        encoder.getClass();
        codeEvents$SessionListLoaded.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$SessionListLoaded.write$Self$analytics(codeEvents$SessionListLoaded, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
