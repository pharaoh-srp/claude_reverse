package defpackage;

import com.anthropic.claude.sessions.types.AgentOwnedSessionSummary;
import com.anthropic.claude.sessions.types.EnvironmentKind;
import com.anthropic.claude.sessions.types.SessionConfigViewV2;
import com.anthropic.claude.sessions.types.SessionExternalMetadata;
import com.anthropic.claude.sessions.types.SessionLifecycleStatusV2;
import com.anthropic.claude.sessions.types.WorkerStatusV2;
import com.anthropic.claude.types.strings.CodeAgentId;
import com.anthropic.claude.types.strings.SessionGroupingId;
import com.anthropic.claude.types.strings.SessionId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lq implements w28 {
    public static final lq a;
    private static final SerialDescriptor descriptor;

    static {
        lq lqVar = new lq();
        a = lqVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.AgentOwnedSessionSummary", lqVar, 15);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("environment_id", true);
        pluginGeneratedSerialDescriptor.j("environment_kind", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("worker_status", true);
        pluginGeneratedSerialDescriptor.j("tags", true);
        pluginGeneratedSerialDescriptor.j("config", true);
        pluginGeneratedSerialDescriptor.j("created_at", true);
        pluginGeneratedSerialDescriptor.j("last_event_at", true);
        pluginGeneratedSerialDescriptor.j("external_metadata", true);
        pluginGeneratedSerialDescriptor.j("unread", true);
        pluginGeneratedSerialDescriptor.j("agent_id", true);
        pluginGeneratedSerialDescriptor.j("started_by_account_id", true);
        pluginGeneratedSerialDescriptor.j("session_grouping_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = AgentOwnedSessionSummary.$childSerializers;
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(uq6.a);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S(ihj.a);
        KSerializer kSerializerS4 = d4c.S((KSerializer) kw9VarArr[6].getValue());
        KSerializer kSerializerS5 = d4c.S(qpf.a);
        g69 g69Var = g69.a;
        return new KSerializer[]{fsf.a, srgVar, kSerializerS, kSerializerS2, usf.a, kSerializerS3, kSerializerS4, kSerializerS5, d4c.S(g69Var), d4c.S(g69Var), d4c.S(krf.a), zt1.a, d4c.S(nq3.a), d4c.S(srgVar), d4c.S(xrf.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        kw9[] kw9VarArr;
        boolean z;
        String str;
        SessionGroupingId sessionGroupingIdM1107boximpl;
        kw9[] kw9VarArr2;
        kw9[] kw9VarArr3;
        boolean z2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr4 = AgentOwnedSessionSummary.$childSerializers;
        String str2 = null;
        SessionExternalMetadata sessionExternalMetadata = null;
        c69 c69Var = null;
        boolean z3 = true;
        SessionConfigViewV2 sessionConfigViewV2 = null;
        int i = 0;
        String strM1120unboximpl = null;
        c69 c69Var2 = null;
        EnvironmentKind environmentKind = null;
        String str3 = null;
        SessionLifecycleStatusV2 sessionLifecycleStatusV2 = null;
        WorkerStatusV2 workerStatusV2 = null;
        List list = null;
        String strV = null;
        boolean zU = false;
        String strM998unboximpl = null;
        String strM1113unboximpl = null;
        while (z3) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    kw9VarArr2 = kw9VarArr4;
                    z3 = false;
                    kw9VarArr4 = kw9VarArr2;
                    break;
                case 0:
                    kw9VarArr3 = kw9VarArr4;
                    z2 = z3;
                    String str4 = strM1120unboximpl;
                    SessionId sessionId = (SessionId) ud4VarC.l(serialDescriptor, 0, fsf.a, str4 != null ? SessionId.m1114boximpl(str4) : null);
                    strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
                    i |= 1;
                    kw9VarArr4 = kw9VarArr3;
                    z3 = z2;
                    break;
                case 1:
                    kw9VarArr2 = kw9VarArr4;
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    kw9VarArr4 = kw9VarArr2;
                    break;
                case 2:
                    kw9VarArr3 = kw9VarArr4;
                    z2 = z3;
                    environmentKind = (EnvironmentKind) ud4VarC.m(serialDescriptor, 2, uq6.a, environmentKind);
                    i |= 4;
                    kw9VarArr4 = kw9VarArr3;
                    z3 = z2;
                    break;
                case 3:
                    kw9VarArr3 = kw9VarArr4;
                    z2 = z3;
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    kw9VarArr4 = kw9VarArr3;
                    z3 = z2;
                    break;
                case 4:
                    kw9VarArr3 = kw9VarArr4;
                    z2 = z3;
                    sessionLifecycleStatusV2 = (SessionLifecycleStatusV2) ud4VarC.l(serialDescriptor, 4, usf.a, sessionLifecycleStatusV2);
                    i |= 16;
                    kw9VarArr4 = kw9VarArr3;
                    z3 = z2;
                    break;
                case 5:
                    kw9VarArr3 = kw9VarArr4;
                    z2 = z3;
                    workerStatusV2 = (WorkerStatusV2) ud4VarC.m(serialDescriptor, 5, ihj.a, workerStatusV2);
                    i |= 32;
                    kw9VarArr4 = kw9VarArr3;
                    z3 = z2;
                    break;
                case 6:
                    kw9VarArr3 = kw9VarArr4;
                    z2 = z3;
                    list = (List) ud4VarC.m(serialDescriptor, 6, (s06) kw9VarArr3[6].getValue(), list);
                    i |= 64;
                    kw9VarArr4 = kw9VarArr3;
                    z3 = z2;
                    break;
                case 7:
                    kw9VarArr3 = kw9VarArr4;
                    z2 = z3;
                    sessionConfigViewV2 = (SessionConfigViewV2) ud4VarC.m(serialDescriptor, 7, qpf.a, sessionConfigViewV2);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    kw9VarArr4 = kw9VarArr3;
                    z3 = z2;
                    break;
                case 8:
                    kw9VarArr3 = kw9VarArr4;
                    z2 = z3;
                    c69Var2 = (c69) ud4VarC.m(serialDescriptor, 8, g69.a, c69Var2);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    kw9VarArr4 = kw9VarArr3;
                    z3 = z2;
                    break;
                case 9:
                    kw9VarArr3 = kw9VarArr4;
                    z2 = z3;
                    c69Var = (c69) ud4VarC.m(serialDescriptor, 9, g69.a, c69Var);
                    i |= 512;
                    kw9VarArr4 = kw9VarArr3;
                    z3 = z2;
                    break;
                case 10:
                    kw9VarArr3 = kw9VarArr4;
                    z2 = z3;
                    sessionExternalMetadata = (SessionExternalMetadata) ud4VarC.m(serialDescriptor, 10, krf.a, sessionExternalMetadata);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    kw9VarArr4 = kw9VarArr3;
                    z3 = z2;
                    break;
                case 11:
                    kw9VarArr2 = kw9VarArr4;
                    zU = ud4VarC.u(serialDescriptor, 11);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    kw9VarArr4 = kw9VarArr2;
                    break;
                case 12:
                    kw9VarArr = kw9VarArr4;
                    z = z3;
                    str = strM1120unboximpl;
                    CodeAgentId codeAgentId = (CodeAgentId) ud4VarC.m(serialDescriptor, 12, nq3.a, strM998unboximpl != null ? CodeAgentId.m992boximpl(strM998unboximpl) : null);
                    strM998unboximpl = codeAgentId != null ? codeAgentId.m998unboximpl() : null;
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    kw9VarArr4 = kw9VarArr;
                    z3 = z;
                    strM1120unboximpl = str;
                    break;
                case 13:
                    kw9VarArr3 = kw9VarArr4;
                    z2 = z3;
                    str2 = (String) ud4VarC.m(serialDescriptor, 13, srg.a, str2);
                    i |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    kw9VarArr4 = kw9VarArr3;
                    z3 = z2;
                    break;
                case 14:
                    kw9VarArr = kw9VarArr4;
                    xrf xrfVar = xrf.a;
                    if (strM1113unboximpl != null) {
                        z = z3;
                        sessionGroupingIdM1107boximpl = SessionGroupingId.m1107boximpl(strM1113unboximpl);
                    } else {
                        z = z3;
                        sessionGroupingIdM1107boximpl = null;
                    }
                    str = strM1120unboximpl;
                    SessionGroupingId sessionGroupingId = (SessionGroupingId) ud4VarC.m(serialDescriptor, 14, xrfVar, sessionGroupingIdM1107boximpl);
                    strM1113unboximpl = sessionGroupingId != null ? sessionGroupingId.m1113unboximpl() : null;
                    i |= 16384;
                    kw9VarArr4 = kw9VarArr;
                    z3 = z;
                    strM1120unboximpl = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AgentOwnedSessionSummary(i, strM1120unboximpl, strV, environmentKind, str3, sessionLifecycleStatusV2, workerStatusV2, list, sessionConfigViewV2, c69Var2, c69Var, sessionExternalMetadata, zU, strM998unboximpl, str2, strM1113unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AgentOwnedSessionSummary agentOwnedSessionSummary = (AgentOwnedSessionSummary) obj;
        encoder.getClass();
        agentOwnedSessionSummary.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AgentOwnedSessionSummary.write$Self$sessions(agentOwnedSessionSummary, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
