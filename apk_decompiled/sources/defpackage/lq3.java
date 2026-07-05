package defpackage;

import com.anthropic.claude.sessions.types.CodeAgent;
import com.anthropic.claude.types.strings.CodeAgentId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lq3 implements w28 {
    public static final lq3 a;
    private static final SerialDescriptor descriptor;

    static {
        lq3 lq3Var = new lq3();
        a = lq3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.CodeAgent", lq3Var, 7);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("slug", false);
        pluginGeneratedSerialDescriptor.j("display_name", false);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("slack_alias", true);
        pluginGeneratedSerialDescriptor.j("is_silo", true);
        pluginGeneratedSerialDescriptor.j("is_virtual", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{nq3.a, srgVar, srgVar, kSerializerS, kSerializerS2, zt1Var, zt1Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        boolean zU2 = false;
        String strM998unboximpl = null;
        String strV = null;
        String strV2 = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    CodeAgentId codeAgentId = (CodeAgentId) ud4VarC.l(serialDescriptor, 0, nq3.a, strM998unboximpl != null ? CodeAgentId.m992boximpl(strM998unboximpl) : null);
                    strM998unboximpl = codeAgentId != null ? codeAgentId.m998unboximpl() : null;
                    i |= 1;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
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
                    zU = ud4VarC.u(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    zU2 = ud4VarC.u(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeAgent(i, strM998unboximpl, strV, strV2, str, str2, zU, zU2, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeAgent codeAgent = (CodeAgent) obj;
        encoder.getClass();
        codeAgent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeAgent.write$Self$sessions(codeAgent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
