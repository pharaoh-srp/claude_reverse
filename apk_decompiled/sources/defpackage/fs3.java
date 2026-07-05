package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$CodeMessagePerceivedTTFT;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fs3 implements w28 {
    public static final fs3 a;
    private static final SerialDescriptor descriptor;

    static {
        fs3 fs3Var = new fs3();
        a = fs3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.session.ttft", fs3Var, 8);
        pluginGeneratedSerialDescriptor.j("session_id", false);
        pluginGeneratedSerialDescriptor.j("ttft_ms", false);
        pluginGeneratedSerialDescriptor.j("is_new_session", false);
        pluginGeneratedSerialDescriptor.j("time_to_request_ms", true);
        pluginGeneratedSerialDescriptor.j("surface", true);
        pluginGeneratedSerialDescriptor.j("session_type", true);
        qy1.z(pluginGeneratedSerialDescriptor, "time_in_background_ms", true, "user_message_uuid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        xka xkaVar = xka.a;
        return new KSerializer[]{srgVar, xkaVar, zt1.a, d4c.S(xkaVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(xkaVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        String str = null;
        String strV = null;
        Long l = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        int i = 0;
        boolean zU = false;
        boolean z = true;
        Long l2 = null;
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
                    j = ud4VarC.j(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    zU = ud4VarC.u(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) ud4VarC.m(serialDescriptor, 3, xka.a, l);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str3);
                    i |= 32;
                    break;
                case 6:
                    l2 = (Long) ud4VarC.m(serialDescriptor, 6, xka.a, l2);
                    i |= 64;
                    break;
                case 7:
                    str = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$CodeMessagePerceivedTTFT(i, strV, j, zU, l, str2, str3, l2, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$CodeMessagePerceivedTTFT codeEvents$CodeMessagePerceivedTTFT = (CodeEvents$CodeMessagePerceivedTTFT) obj;
        encoder.getClass();
        codeEvents$CodeMessagePerceivedTTFT.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$CodeMessagePerceivedTTFT.write$Self$analytics(codeEvents$CodeMessagePerceivedTTFT, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
