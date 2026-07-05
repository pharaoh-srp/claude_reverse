package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.sessions.types.ConnectionStatus;
import com.anthropic.claude.sessions.types.EnvironmentKind;
import com.anthropic.claude.sessions.types.PostTurnSummary;
import com.anthropic.claude.sessions.types.SessionContext;
import com.anthropic.claude.sessions.types.SessionExternalMetadata;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.sessions.types.SessionStatus;
import com.anthropic.claude.sessions.types.WorkerStatus;
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
public final /* synthetic */ class stf implements w28 {
    public static final stf a;
    private static final SerialDescriptor descriptor;

    static {
        stf stfVar = new stf();
        a = stfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SessionResource", stfVar, 23);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("session_status", false);
        pluginGeneratedSerialDescriptor.j("environment_id", false);
        pluginGeneratedSerialDescriptor.j("environment_kind", true);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("updated_at", false);
        pluginGeneratedSerialDescriptor.j("session_context", false);
        pluginGeneratedSerialDescriptor.j("bridge_spawn_path", true);
        pluginGeneratedSerialDescriptor.j("connection_status", true);
        pluginGeneratedSerialDescriptor.j("worker_status", true);
        pluginGeneratedSerialDescriptor.j("client_presence", true);
        pluginGeneratedSerialDescriptor.j("trigger_id", true);
        pluginGeneratedSerialDescriptor.j("origin", true);
        pluginGeneratedSerialDescriptor.j("post_turn_summary", true);
        pluginGeneratedSerialDescriptor.j("task_summary", true);
        pluginGeneratedSerialDescriptor.j("external_metadata", true);
        pluginGeneratedSerialDescriptor.j("unread", true);
        pluginGeneratedSerialDescriptor.j("tags", true);
        pluginGeneratedSerialDescriptor.j("self_hosted_runner_pool_id", true);
        pluginGeneratedSerialDescriptor.j("agent_id", true);
        pluginGeneratedSerialDescriptor.j("started_by_account_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = SessionResource.$childSerializers;
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(uq6.a);
        KSerializer kSerializerS3 = d4c.S(srgVar);
        KSerializer kSerializerS4 = d4c.S(rh4.a);
        KSerializer kSerializerS5 = d4c.S(ghj.a);
        KSerializer kSerializerS6 = d4c.S((KSerializer) kw9VarArr[12].getValue());
        KSerializer kSerializerS7 = d4c.S(srgVar);
        KSerializer kSerializerS8 = d4c.S(srgVar);
        KSerializer kSerializerS9 = d4c.S(bad.a);
        KSerializer kSerializerS10 = d4c.S(srgVar);
        KSerializer kSerializerS11 = d4c.S(krf.a);
        KSerializer kSerializerS12 = d4c.S((KSerializer) kw9VarArr[19].getValue());
        KSerializer kSerializerS13 = d4c.S(srgVar);
        KSerializer kSerializerS14 = d4c.S(nq3.a);
        KSerializer kSerializerS15 = d4c.S(srgVar);
        g69 g69Var = g69.a;
        return new KSerializer[]{srgVar, fsf.a, kSerializerS, cuf.a, srgVar, kSerializerS2, g69Var, g69Var, tpf.a, kSerializerS3, kSerializerS4, kSerializerS5, kSerializerS6, kSerializerS7, kSerializerS8, kSerializerS9, kSerializerS10, kSerializerS11, zt1.a, kSerializerS12, kSerializerS13, kSerializerS14, kSerializerS15};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        SessionContext sessionContext;
        SessionContext sessionContext2;
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SessionResource.$childSerializers;
        String str3 = null;
        List list = null;
        WorkerStatus workerStatus = null;
        ConnectionStatus connectionStatus = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        SessionContext sessionContext3 = null;
        PostTurnSummary postTurnSummary = null;
        String str6 = null;
        SessionExternalMetadata sessionExternalMetadata = null;
        String str7 = null;
        List list2 = null;
        String str8 = null;
        boolean z = true;
        String strM1120unboximpl = null;
        String str9 = null;
        SessionStatus sessionStatus = null;
        EnvironmentKind environmentKind = null;
        c69 c69Var = null;
        c69 c69Var2 = null;
        String strV = null;
        String strV2 = null;
        boolean zU = false;
        String strM998unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    str = str3;
                    str2 = str5;
                    z = false;
                    str3 = str;
                    str5 = str2;
                    break;
                case 0:
                    str = str3;
                    str2 = str5;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i2 |= 1;
                    str3 = str;
                    str5 = str2;
                    break;
                case 1:
                    str = str3;
                    str2 = str5;
                    sessionContext = sessionContext3;
                    String str10 = str9;
                    SessionId sessionId = (SessionId) ud4VarC.l(serialDescriptor, 1, fsf.a, strM1120unboximpl != null ? SessionId.m1114boximpl(strM1120unboximpl) : null);
                    strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
                    i2 |= 2;
                    str9 = str10;
                    sessionContext3 = sessionContext;
                    str3 = str;
                    str5 = str2;
                    break;
                case 2:
                    str = str3;
                    str2 = str5;
                    sessionContext = sessionContext3;
                    str9 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str9);
                    i2 |= 4;
                    sessionContext3 = sessionContext;
                    str3 = str;
                    str5 = str2;
                    break;
                case 3:
                    str = str3;
                    str2 = str5;
                    sessionContext = sessionContext3;
                    sessionStatus = (SessionStatus) ud4VarC.l(serialDescriptor, 3, cuf.a, sessionStatus);
                    i2 |= 8;
                    sessionContext3 = sessionContext;
                    str3 = str;
                    str5 = str2;
                    break;
                case 4:
                    str = str3;
                    str2 = str5;
                    strV2 = ud4VarC.v(serialDescriptor, 4);
                    i2 |= 16;
                    str3 = str;
                    str5 = str2;
                    break;
                case 5:
                    str = str3;
                    str2 = str5;
                    sessionContext = sessionContext3;
                    environmentKind = (EnvironmentKind) ud4VarC.m(serialDescriptor, 5, uq6.a, environmentKind);
                    i2 |= 32;
                    sessionContext3 = sessionContext;
                    str3 = str;
                    str5 = str2;
                    break;
                case 6:
                    str = str3;
                    str2 = str5;
                    sessionContext = sessionContext3;
                    c69Var = (c69) ud4VarC.l(serialDescriptor, 6, g69.a, c69Var);
                    i2 |= 64;
                    sessionContext3 = sessionContext;
                    str3 = str;
                    str5 = str2;
                    break;
                case 7:
                    str = str3;
                    str2 = str5;
                    sessionContext = sessionContext3;
                    c69Var2 = (c69) ud4VarC.l(serialDescriptor, 7, g69.a, c69Var2);
                    i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    sessionContext3 = sessionContext;
                    str3 = str;
                    str5 = str2;
                    break;
                case 8:
                    str2 = str5;
                    str = str3;
                    sessionContext3 = (SessionContext) ud4VarC.l(serialDescriptor, 8, tpf.a, sessionContext3);
                    i2 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    str3 = str;
                    str5 = str2;
                    break;
                case 9:
                    str2 = str5;
                    sessionContext2 = sessionContext3;
                    str7 = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str7);
                    i2 |= 512;
                    sessionContext3 = sessionContext2;
                    str5 = str2;
                    break;
                case 10:
                    str2 = str5;
                    sessionContext2 = sessionContext3;
                    connectionStatus = (ConnectionStatus) ud4VarC.m(serialDescriptor, 10, rh4.a, connectionStatus);
                    i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    sessionContext3 = sessionContext2;
                    str5 = str2;
                    break;
                case 11:
                    str2 = str5;
                    sessionContext2 = sessionContext3;
                    workerStatus = (WorkerStatus) ud4VarC.m(serialDescriptor, 11, ghj.a, workerStatus);
                    i2 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    sessionContext3 = sessionContext2;
                    str5 = str2;
                    break;
                case 12:
                    str2 = str5;
                    sessionContext2 = sessionContext3;
                    list = (List) ud4VarC.m(serialDescriptor, 12, (s06) kw9VarArr[12].getValue(), list);
                    i2 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    sessionContext3 = sessionContext2;
                    str5 = str2;
                    break;
                case 13:
                    str2 = str5;
                    sessionContext2 = sessionContext3;
                    str3 = (String) ud4VarC.m(serialDescriptor, 13, srg.a, str3);
                    i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    sessionContext3 = sessionContext2;
                    str5 = str2;
                    break;
                case 14:
                    str2 = str5;
                    sessionContext2 = sessionContext3;
                    str4 = (String) ud4VarC.m(serialDescriptor, 14, srg.a, str4);
                    i2 |= 16384;
                    sessionContext3 = sessionContext2;
                    str5 = str2;
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    str2 = str5;
                    sessionContext2 = sessionContext3;
                    postTurnSummary = (PostTurnSummary) ud4VarC.m(serialDescriptor, 15, bad.a, postTurnSummary);
                    i = FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
                    i2 |= i;
                    sessionContext3 = sessionContext2;
                    str5 = str2;
                    break;
                case 16:
                    str2 = str5;
                    sessionContext2 = sessionContext3;
                    str6 = (String) ud4VarC.m(serialDescriptor, 16, srg.a, str6);
                    i = 65536;
                    i2 |= i;
                    sessionContext3 = sessionContext2;
                    str5 = str2;
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    str2 = str5;
                    sessionContext2 = sessionContext3;
                    sessionExternalMetadata = (SessionExternalMetadata) ud4VarC.m(serialDescriptor, 17, krf.a, sessionExternalMetadata);
                    i = 131072;
                    i2 |= i;
                    sessionContext3 = sessionContext2;
                    str5 = str2;
                    break;
                case g.AVG_FIELD_NUMBER /* 18 */:
                    str2 = str5;
                    zU = ud4VarC.u(serialDescriptor, 18);
                    i2 |= 262144;
                    str5 = str2;
                    break;
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    str2 = str5;
                    sessionContext2 = sessionContext3;
                    list2 = (List) ud4VarC.m(serialDescriptor, 19, (s06) kw9VarArr[19].getValue(), list2);
                    i = 524288;
                    i2 |= i;
                    sessionContext3 = sessionContext2;
                    str5 = str2;
                    break;
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    str2 = str5;
                    sessionContext2 = sessionContext3;
                    str8 = (String) ud4VarC.m(serialDescriptor, 20, srg.a, str8);
                    i = FreeTypeConstants.FT_LOAD_COLOR;
                    i2 |= i;
                    sessionContext3 = sessionContext2;
                    str5 = str2;
                    break;
                case 21:
                    SessionContext sessionContext4 = sessionContext3;
                    String str11 = str7;
                    str2 = str5;
                    CodeAgentId codeAgentId = (CodeAgentId) ud4VarC.m(serialDescriptor, 21, nq3.a, strM998unboximpl != null ? CodeAgentId.m992boximpl(strM998unboximpl) : null);
                    strM998unboximpl = codeAgentId != null ? codeAgentId.m998unboximpl() : null;
                    i2 |= FreeTypeConstants.FT_LOAD_COMPUTE_METRICS;
                    sessionContext3 = sessionContext4;
                    str7 = str11;
                    str5 = str2;
                    break;
                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    str5 = (String) ud4VarC.m(serialDescriptor, 22, srg.a, str5);
                    i2 |= 4194304;
                    sessionContext3 = sessionContext3;
                    str7 = str7;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        SessionContext sessionContext5 = sessionContext3;
        String str12 = str9;
        ud4VarC.b(serialDescriptor);
        return new SessionResource(i2, strV, strM1120unboximpl, str12, sessionStatus, strV2, environmentKind, c69Var, c69Var2, sessionContext5, str7, connectionStatus, workerStatus, list, str3, str4, postTurnSummary, str6, sessionExternalMetadata, zU, list2, str8, strM998unboximpl, str5, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SessionResource sessionResource = (SessionResource) obj;
        encoder.getClass();
        sessionResource.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SessionResource.write$Self$sessions(sessionResource, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
