package defpackage;

import com.anthropic.claude.sessions.types.CreateSessionV2Params;
import com.anthropic.claude.sessions.types.SessionConfigV2;
import com.anthropic.claude.types.strings.CodeAgentId;
import com.anthropic.claude.types.strings.SessionGroupingId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q85 implements w28 {
    public static final q85 a;
    private static final SerialDescriptor descriptor;

    static {
        q85 q85Var = new q85();
        a = q85Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.CreateSessionV2Params", q85Var, 6);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("environment_id", true);
        pluginGeneratedSerialDescriptor.j("self_hosted_runner_pool_id", true);
        pluginGeneratedSerialDescriptor.j("config", false);
        pluginGeneratedSerialDescriptor.j("agent_id", true);
        pluginGeneratedSerialDescriptor.j("session_grouping_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), opf.a, d4c.S(nq3.a), d4c.S(xrf.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        SessionConfigV2 sessionConfigV2 = null;
        String strM998unboximpl = null;
        String strM1113unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str3);
                    i |= 4;
                    break;
                case 3:
                    sessionConfigV2 = (SessionConfigV2) ud4VarC.l(serialDescriptor, 3, opf.a, sessionConfigV2);
                    i |= 8;
                    break;
                case 4:
                    CodeAgentId codeAgentId = (CodeAgentId) ud4VarC.m(serialDescriptor, 4, nq3.a, strM998unboximpl != null ? CodeAgentId.m992boximpl(strM998unboximpl) : null);
                    strM998unboximpl = codeAgentId != null ? codeAgentId.m998unboximpl() : null;
                    i |= 16;
                    break;
                case 5:
                    SessionGroupingId sessionGroupingId = (SessionGroupingId) ud4VarC.m(serialDescriptor, 5, xrf.a, strM1113unboximpl != null ? SessionGroupingId.m1107boximpl(strM1113unboximpl) : null);
                    strM1113unboximpl = sessionGroupingId != null ? sessionGroupingId.m1113unboximpl() : null;
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CreateSessionV2Params(i, str, str2, str3, sessionConfigV2, strM998unboximpl, strM1113unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CreateSessionV2Params createSessionV2Params = (CreateSessionV2Params) obj;
        encoder.getClass();
        createSessionV2Params.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CreateSessionV2Params.write$Self$sessions(createSessionV2Params, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
