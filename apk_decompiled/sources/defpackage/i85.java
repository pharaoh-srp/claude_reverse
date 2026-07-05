package defpackage;

import com.anthropic.claude.sessions.types.CreateSessionParams;
import com.anthropic.claude.sessions.types.SessionContext;
import com.anthropic.claude.types.strings.CodeAgentId;
import com.anthropic.claude.types.strings.SessionGroupingId;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i85 implements w28 {
    public static final i85 a;
    private static final SerialDescriptor descriptor;

    static {
        i85 i85Var = new i85();
        a = i85Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.CreateSessionParams", i85Var, 7);
        pluginGeneratedSerialDescriptor.j("events", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("environment_id", true);
        pluginGeneratedSerialDescriptor.j("self_hosted_runner_pool_id", true);
        pluginGeneratedSerialDescriptor.j("session_context", false);
        pluginGeneratedSerialDescriptor.j("agent_id", true);
        pluginGeneratedSerialDescriptor.j("session_grouping_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{CreateSessionParams.$childSerializers[0].getValue(), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), tpf.a, d4c.S(nq3.a), d4c.S(xrf.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CreateSessionParams.$childSerializers;
        SessionGroupingId sessionGroupingId = null;
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        SessionContext sessionContext = null;
        String strM998unboximpl = null;
        String strM1113unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
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
                    sessionContext = (SessionContext) ud4VarC.l(serialDescriptor, 4, tpf.a, sessionContext);
                    i |= 16;
                    break;
                case 5:
                    CodeAgentId codeAgentId = (CodeAgentId) ud4VarC.m(serialDescriptor, 5, nq3.a, strM998unboximpl != null ? CodeAgentId.m992boximpl(strM998unboximpl) : null);
                    strM998unboximpl = codeAgentId != null ? codeAgentId.m998unboximpl() : null;
                    i |= 32;
                    break;
                case 6:
                    SessionGroupingId sessionGroupingId2 = (SessionGroupingId) ud4VarC.m(serialDescriptor, 6, xrf.a, strM1113unboximpl != null ? SessionGroupingId.m1107boximpl(strM1113unboximpl) : sessionGroupingId);
                    strM1113unboximpl = sessionGroupingId2 != null ? sessionGroupingId2.m1113unboximpl() : null;
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return sessionGroupingId;
            }
            sessionGroupingId = null;
        }
        ud4VarC.b(serialDescriptor);
        return new CreateSessionParams(i, list, str, str2, str3, sessionContext, strM998unboximpl, strM1113unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CreateSessionParams createSessionParams = (CreateSessionParams) obj;
        encoder.getClass();
        createSessionParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CreateSessionParams.write$Self$sessions(createSessionParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
