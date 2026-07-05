package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.sessions.types.ConnectionStatus;
import com.anthropic.claude.sessions.types.EnvironmentKind;
import com.anthropic.claude.sessions.types.PostTurnSummary;
import com.anthropic.claude.sessions.types.SessionConfigViewV2;
import com.anthropic.claude.sessions.types.SessionExternalMetadata;
import com.anthropic.claude.sessions.types.SessionLifecycleStatusV2;
import com.anthropic.claude.sessions.types.SessionV2;
import com.anthropic.claude.sessions.types.WorkerStatusV2;
import com.anthropic.claude.types.strings.CodeAgentId;
import com.anthropic.claude.types.strings.SessionId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jvf implements w28 {
    public static final jvf a;
    private static final SerialDescriptor descriptor;

    static {
        jvf jvfVar = new jvf();
        a = jvfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SessionV2", jvfVar, 21);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("environment_id", true);
        pluginGeneratedSerialDescriptor.j("environment_kind", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("tags", true);
        pluginGeneratedSerialDescriptor.j("config", true);
        pluginGeneratedSerialDescriptor.j("worker_status", true);
        pluginGeneratedSerialDescriptor.j("connection_status", true);
        pluginGeneratedSerialDescriptor.j("client_presence", true);
        pluginGeneratedSerialDescriptor.j("trigger_id", true);
        pluginGeneratedSerialDescriptor.j("external_metadata", true);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("updated_at", false);
        pluginGeneratedSerialDescriptor.j("last_event_at", true);
        pluginGeneratedSerialDescriptor.j("post_turn_summary", true);
        pluginGeneratedSerialDescriptor.j("task_summary", true);
        pluginGeneratedSerialDescriptor.j("unread", true);
        pluginGeneratedSerialDescriptor.j("agent_id", true);
        pluginGeneratedSerialDescriptor.j("started_by_account_id", true);
        pluginGeneratedSerialDescriptor.j("self_hosted_runner_pool_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = SessionV2.$childSerializers;
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(uq6.a);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S((KSerializer) kw9VarArr[5].getValue());
        KSerializer kSerializerS4 = d4c.S(qpf.a);
        KSerializer kSerializerS5 = d4c.S(ihj.a);
        KSerializer kSerializerS6 = d4c.S(rh4.a);
        KSerializer kSerializerS7 = d4c.S((KSerializer) kw9VarArr[9].getValue());
        KSerializer kSerializerS8 = d4c.S(srgVar);
        KSerializer kSerializerS9 = d4c.S(krf.a);
        g69 g69Var = g69.a;
        return new KSerializer[]{fsf.a, srgVar, kSerializerS, kSerializerS2, usf.a, kSerializerS3, kSerializerS4, kSerializerS5, kSerializerS6, kSerializerS7, kSerializerS8, kSerializerS9, g69Var, g69Var, d4c.S(g69Var), d4c.S(bad.a), d4c.S(srgVar), zt1.a, d4c.S(nq3.a), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        WorkerStatusV2 workerStatusV2;
        SessionConfigViewV2 sessionConfigViewV2;
        int i;
        c69 c69Var;
        SessionConfigViewV2 sessionConfigViewV22;
        c69 c69Var2;
        String str;
        SessionConfigViewV2 sessionConfigViewV23;
        WorkerStatusV2 workerStatusV22;
        WorkerStatusV2 workerStatusV23;
        int i2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SessionV2.$childSerializers;
        c69 c69Var3 = null;
        SessionExternalMetadata sessionExternalMetadata = null;
        String str2 = null;
        List list = null;
        c69 c69Var4 = null;
        WorkerStatusV2 workerStatusV24 = null;
        int i3 = 0;
        c69 c69Var5 = null;
        ConnectionStatus connectionStatus = null;
        PostTurnSummary postTurnSummary = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        SessionConfigViewV2 sessionConfigViewV24 = null;
        boolean z = true;
        String strM1120unboximpl = null;
        EnvironmentKind environmentKind = null;
        String str6 = null;
        SessionLifecycleStatusV2 sessionLifecycleStatusV2 = null;
        List list2 = null;
        String strV = null;
        boolean zU = false;
        String strM998unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    c69Var = c69Var3;
                    sessionConfigViewV22 = sessionConfigViewV24;
                    z = false;
                    sessionConfigViewV24 = sessionConfigViewV22;
                    c69Var3 = c69Var;
                    break;
                case 0:
                    c69Var2 = c69Var3;
                    str = str4;
                    sessionConfigViewV23 = sessionConfigViewV24;
                    workerStatusV22 = workerStatusV24;
                    environmentKind = environmentKind;
                    SessionId sessionId = (SessionId) ud4VarC.l(serialDescriptor, 0, fsf.a, strM1120unboximpl != null ? SessionId.m1114boximpl(strM1120unboximpl) : null);
                    strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
                    i3 |= 1;
                    workerStatusV24 = workerStatusV22;
                    sessionConfigViewV24 = sessionConfigViewV23;
                    c69Var3 = c69Var2;
                    str4 = str;
                    break;
                case 1:
                    c69Var = c69Var3;
                    sessionConfigViewV22 = sessionConfigViewV24;
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i3 |= 2;
                    workerStatusV24 = workerStatusV24;
                    sessionConfigViewV24 = sessionConfigViewV22;
                    c69Var3 = c69Var;
                    break;
                case 2:
                    c69Var2 = c69Var3;
                    str = str4;
                    sessionConfigViewV23 = sessionConfigViewV24;
                    workerStatusV22 = workerStatusV24;
                    environmentKind = (EnvironmentKind) ud4VarC.m(serialDescriptor, 2, uq6.a, environmentKind);
                    i3 |= 4;
                    workerStatusV24 = workerStatusV22;
                    sessionConfigViewV24 = sessionConfigViewV23;
                    c69Var3 = c69Var2;
                    str4 = str;
                    break;
                case 3:
                    c69Var2 = c69Var3;
                    str = str4;
                    sessionConfigViewV23 = sessionConfigViewV24;
                    workerStatusV22 = workerStatusV24;
                    str6 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str6);
                    i3 |= 8;
                    workerStatusV24 = workerStatusV22;
                    sessionConfigViewV24 = sessionConfigViewV23;
                    c69Var3 = c69Var2;
                    str4 = str;
                    break;
                case 4:
                    c69Var2 = c69Var3;
                    str = str4;
                    sessionConfigViewV23 = sessionConfigViewV24;
                    workerStatusV22 = workerStatusV24;
                    sessionLifecycleStatusV2 = (SessionLifecycleStatusV2) ud4VarC.l(serialDescriptor, 4, usf.a, sessionLifecycleStatusV2);
                    i3 |= 16;
                    workerStatusV24 = workerStatusV22;
                    sessionConfigViewV24 = sessionConfigViewV23;
                    c69Var3 = c69Var2;
                    str4 = str;
                    break;
                case 5:
                    c69Var2 = c69Var3;
                    str = str4;
                    SessionConfigViewV2 sessionConfigViewV25 = sessionConfigViewV24;
                    workerStatusV22 = workerStatusV24;
                    sessionConfigViewV23 = sessionConfigViewV25;
                    list2 = (List) ud4VarC.m(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), list2);
                    i3 |= 32;
                    workerStatusV24 = workerStatusV22;
                    sessionConfigViewV24 = sessionConfigViewV23;
                    c69Var3 = c69Var2;
                    str4 = str;
                    break;
                case 6:
                    c69Var = c69Var3;
                    i3 |= 64;
                    workerStatusV24 = workerStatusV24;
                    str4 = str4;
                    sessionConfigViewV24 = (SessionConfigViewV2) ud4VarC.m(serialDescriptor, 6, qpf.a, sessionConfigViewV24);
                    c69Var3 = c69Var;
                    break;
                case 7:
                    str = str4;
                    workerStatusV24 = (WorkerStatusV2) ud4VarC.m(serialDescriptor, 7, ihj.a, workerStatusV24);
                    i3 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    sessionConfigViewV24 = sessionConfigViewV24;
                    str4 = str;
                    break;
                case 8:
                    workerStatusV23 = workerStatusV24;
                    str = str4;
                    connectionStatus = (ConnectionStatus) ud4VarC.m(serialDescriptor, 8, rh4.a, connectionStatus);
                    i3 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    workerStatusV24 = workerStatusV23;
                    str4 = str;
                    break;
                case 9:
                    workerStatusV23 = workerStatusV24;
                    str = str4;
                    list = (List) ud4VarC.m(serialDescriptor, 9, (s06) kw9VarArr[9].getValue(), list);
                    i3 |= 512;
                    workerStatusV24 = workerStatusV23;
                    str4 = str;
                    break;
                case 10:
                    workerStatusV23 = workerStatusV24;
                    str = str4;
                    str2 = (String) ud4VarC.m(serialDescriptor, 10, srg.a, str2);
                    i3 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    workerStatusV24 = workerStatusV23;
                    str4 = str;
                    break;
                case 11:
                    workerStatusV23 = workerStatusV24;
                    str = str4;
                    sessionExternalMetadata = (SessionExternalMetadata) ud4VarC.m(serialDescriptor, 11, krf.a, sessionExternalMetadata);
                    i3 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    workerStatusV24 = workerStatusV23;
                    str4 = str;
                    break;
                case 12:
                    workerStatusV23 = workerStatusV24;
                    str = str4;
                    c69Var3 = (c69) ud4VarC.l(serialDescriptor, 12, g69.a, c69Var3);
                    i3 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    workerStatusV24 = workerStatusV23;
                    str4 = str;
                    break;
                case 13:
                    workerStatusV23 = workerStatusV24;
                    str = str4;
                    c69Var4 = (c69) ud4VarC.l(serialDescriptor, 13, g69.a, c69Var4);
                    i3 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    workerStatusV24 = workerStatusV23;
                    str4 = str;
                    break;
                case 14:
                    workerStatusV23 = workerStatusV24;
                    str = str4;
                    c69Var5 = (c69) ud4VarC.m(serialDescriptor, 14, g69.a, c69Var5);
                    i3 |= 16384;
                    workerStatusV24 = workerStatusV23;
                    str4 = str;
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    workerStatusV23 = workerStatusV24;
                    str = str4;
                    postTurnSummary = (PostTurnSummary) ud4VarC.m(serialDescriptor, 15, bad.a, postTurnSummary);
                    i2 = FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
                    i3 |= i2;
                    workerStatusV24 = workerStatusV23;
                    str4 = str;
                    break;
                case 16:
                    workerStatusV23 = workerStatusV24;
                    str = str4;
                    str3 = (String) ud4VarC.m(serialDescriptor, 16, srg.a, str3);
                    i2 = 65536;
                    i3 |= i2;
                    workerStatusV24 = workerStatusV23;
                    str4 = str;
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    workerStatusV2 = workerStatusV24;
                    zU = ud4VarC.u(serialDescriptor, 17);
                    i3 |= 131072;
                    workerStatusV24 = workerStatusV2;
                    break;
                case g.AVG_FIELD_NUMBER /* 18 */:
                    workerStatusV23 = workerStatusV24;
                    SessionConfigViewV2 sessionConfigViewV26 = sessionConfigViewV24;
                    str = str4;
                    CodeAgentId codeAgentId = (CodeAgentId) ud4VarC.m(serialDescriptor, 18, nq3.a, strM998unboximpl != null ? CodeAgentId.m992boximpl(strM998unboximpl) : null);
                    strM998unboximpl = codeAgentId != null ? codeAgentId.m998unboximpl() : null;
                    i3 |= 262144;
                    sessionConfigViewV24 = sessionConfigViewV26;
                    workerStatusV24 = workerStatusV23;
                    str4 = str;
                    break;
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    workerStatusV2 = workerStatusV24;
                    sessionConfigViewV2 = sessionConfigViewV24;
                    str4 = (String) ud4VarC.m(serialDescriptor, 19, srg.a, str4);
                    i = 524288;
                    i3 |= i;
                    sessionConfigViewV24 = sessionConfigViewV2;
                    workerStatusV24 = workerStatusV2;
                    break;
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    sessionConfigViewV2 = sessionConfigViewV24;
                    workerStatusV2 = workerStatusV24;
                    str5 = (String) ud4VarC.m(serialDescriptor, 20, srg.a, str5);
                    i = FreeTypeConstants.FT_LOAD_COLOR;
                    i3 |= i;
                    sessionConfigViewV24 = sessionConfigViewV2;
                    workerStatusV24 = workerStatusV2;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        SessionConfigViewV2 sessionConfigViewV27 = sessionConfigViewV24;
        WorkerStatusV2 workerStatusV25 = workerStatusV24;
        ud4VarC.b(serialDescriptor);
        return new SessionV2(i3, strM1120unboximpl, strV, environmentKind, str6, sessionLifecycleStatusV2, list2, sessionConfigViewV27, workerStatusV25, connectionStatus, list, str2, sessionExternalMetadata, c69Var3, c69Var4, c69Var5, postTurnSummary, str3, zU, strM998unboximpl, str4, str5, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SessionV2 sessionV2 = (SessionV2) obj;
        encoder.getClass();
        sessionV2.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SessionV2.write$Self$sessions(sessionV2, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
