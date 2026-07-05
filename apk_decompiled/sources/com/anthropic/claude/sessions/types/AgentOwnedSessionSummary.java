package com.anthropic.claude.sessions.types;

import com.anthropic.claude.types.strings.CodeAgentId;
import com.anthropic.claude.types.strings.SessionGroupingId;
import com.anthropic.claude.types.strings.SessionId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.b5;
import defpackage.bsg;
import defpackage.c69;
import defpackage.d4c;
import defpackage.fsf;
import defpackage.fsh;
import defpackage.g69;
import defpackage.gvj;
import defpackage.ihj;
import defpackage.ij0;
import defpackage.isg;
import defpackage.kgh;
import defpackage.krf;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.lq;
import defpackage.mdj;
import defpackage.mq;
import defpackage.mq5;
import defpackage.nq;
import defpackage.nq3;
import defpackage.onf;
import defpackage.qpf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.uq6;
import defpackage.usf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wg6;
import defpackage.x44;
import defpackage.xrf;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 o2\u00020\u0001:\u0002pqB·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eBµ\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001d\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010(J\u0010\u0010.\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b8\u00107J\u0012\u00109\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010>\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b=\u0010(J\u0012\u0010?\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b?\u0010(J\u0012\u0010A\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b@\u0010(JÂ\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010E\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bE\u0010(J\u0010\u0010F\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010I\u001a\u00020\u00162\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ'\u0010V\u001a\u00020S2\u0006\u0010N\u001a\u00020\u00002\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020QH\u0001¢\u0006\u0004\bT\u0010UR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010W\u001a\u0004\bX\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010W\u001a\u0004\bY\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010Z\u001a\u0004\b[\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010W\u001a\u0004\b\\\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010]\u001a\u0004\b^\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010_\u001a\u0004\b`\u00101R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010a\u001a\u0004\bb\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010c\u001a\u0004\bd\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010e\u001a\u0004\bf\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010e\u001a\u0004\bg\u00107R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010h\u001a\u0004\bi\u0010:R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010j\u001a\u0004\bk\u0010<R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010W\u001a\u0004\bl\u0010(R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010W\u001a\u0004\bm\u0010(R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010W\u001a\u0004\bn\u0010(¨\u0006r"}, d2 = {"Lcom/anthropic/claude/sessions/types/AgentOwnedSessionSummary;", "", "Lcom/anthropic/claude/types/strings/SessionId;", "id", "", "environment_id", "Lcom/anthropic/claude/sessions/types/EnvironmentKind;", "environment_kind", "title", "Lcom/anthropic/claude/sessions/types/SessionLifecycleStatusV2;", "status", "Lcom/anthropic/claude/sessions/types/WorkerStatusV2;", "worker_status", "", "tags", "Lcom/anthropic/claude/sessions/types/SessionConfigViewV2;", "config", "Lc69;", "created_at", "last_event_at", "Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;", "external_metadata", "", "unread", "Lcom/anthropic/claude/types/strings/CodeAgentId;", "agent_id", "started_by_account_id", "Lcom/anthropic/claude/types/strings/SessionGroupingId;", "session_grouping_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentKind;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionLifecycleStatusV2;Lcom/anthropic/claude/sessions/types/WorkerStatusV2;Ljava/util/List;Lcom/anthropic/claude/sessions/types/SessionConfigViewV2;Lc69;Lc69;Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentKind;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionLifecycleStatusV2;Lcom/anthropic/claude/sessions/types/WorkerStatusV2;Ljava/util/List;Lcom/anthropic/claude/sessions/types/SessionConfigViewV2;Lc69;Lc69;Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "Lcom/anthropic/claude/sessions/types/SessionResource;", "toSessionResource", "()Lcom/anthropic/claude/sessions/types/SessionResource;", "component1-Ocx55TE", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/anthropic/claude/sessions/types/EnvironmentKind;", "component4", "component5", "()Lcom/anthropic/claude/sessions/types/SessionLifecycleStatusV2;", "component6", "()Lcom/anthropic/claude/sessions/types/WorkerStatusV2;", "component7", "()Ljava/util/List;", "component8", "()Lcom/anthropic/claude/sessions/types/SessionConfigViewV2;", "component9", "()Lc69;", "component10", "component11", "()Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;", "component12", "()Z", "component13-kU3PmtI", "component13", "component14", "component15-n6q-b3o", "component15", "copy-lwWZvdA", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentKind;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionLifecycleStatusV2;Lcom/anthropic/claude/sessions/types/WorkerStatusV2;Ljava/util/List;Lcom/anthropic/claude/sessions/types/SessionConfigViewV2;Lc69;Lc69;Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/AgentOwnedSessionSummary;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/sessions/types/SessionStatus;", "derivedV1Status", "()Lcom/anthropic/claude/sessions/types/SessionStatus;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/AgentOwnedSessionSummary;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId-Ocx55TE", "getEnvironment_id", "Lcom/anthropic/claude/sessions/types/EnvironmentKind;", "getEnvironment_kind", "getTitle", "Lcom/anthropic/claude/sessions/types/SessionLifecycleStatusV2;", "getStatus", "Lcom/anthropic/claude/sessions/types/WorkerStatusV2;", "getWorker_status", "Ljava/util/List;", "getTags", "Lcom/anthropic/claude/sessions/types/SessionConfigViewV2;", "getConfig", "Lc69;", "getCreated_at", "getLast_event_at", "Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;", "getExternal_metadata", "Z", "getUnread", "getAgent_id-kU3PmtI", "getStarted_by_account_id", "getSession_grouping_id-n6q-b3o", "Companion", "lq", "mq", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AgentOwnedSessionSummary {
    private final String agent_id;
    private final SessionConfigViewV2 config;
    private final c69 created_at;
    private final String environment_id;
    private final EnvironmentKind environment_kind;
    private final SessionExternalMetadata external_metadata;
    private final String id;
    private final c69 last_event_at;
    private final String session_grouping_id;
    private final String started_by_account_id;
    private final SessionLifecycleStatusV2 status;
    private final List<String> tags;
    private final String title;
    private final boolean unread;
    private final WorkerStatusV2 worker_status;
    public static final mq Companion = new mq();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, yb5.w(w1a.F, new b5(11)), null, null, null, null, null, null, null, null};

    private /* synthetic */ AgentOwnedSessionSummary(int i, String str, String str2, EnvironmentKind environmentKind, String str3, SessionLifecycleStatusV2 sessionLifecycleStatusV2, WorkerStatusV2 workerStatusV2, List list, SessionConfigViewV2 sessionConfigViewV2, c69 c69Var, c69 c69Var2, SessionExternalMetadata sessionExternalMetadata, boolean z, String str4, String str5, String str6, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, lq.a.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.environment_id = "";
        } else {
            this.environment_id = str2;
        }
        if ((i & 4) == 0) {
            this.environment_kind = null;
        } else {
            this.environment_kind = environmentKind;
        }
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 16) == 0) {
            this.status = SessionLifecycleStatusV2.UNKNOWN;
        } else {
            this.status = sessionLifecycleStatusV2;
        }
        if ((i & 32) == 0) {
            this.worker_status = null;
        } else {
            this.worker_status = workerStatusV2;
        }
        if ((i & 64) == 0) {
            this.tags = null;
        } else {
            this.tags = list;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.config = null;
        } else {
            this.config = sessionConfigViewV2;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.created_at = null;
        } else {
            this.created_at = c69Var;
        }
        if ((i & 512) == 0) {
            this.last_event_at = null;
        } else {
            this.last_event_at = c69Var2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.external_metadata = null;
        } else {
            this.external_metadata = sessionExternalMetadata;
        }
        this.unread = (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0 ? false : z;
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.agent_id = null;
        } else {
            this.agent_id = str4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) {
            this.started_by_account_id = null;
        } else {
            this.started_by_account_id = str5;
        }
        if ((i & 16384) == 0) {
            this.session_grouping_id = null;
        } else {
            this.session_grouping_id = str6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    private final SessionStatus derivedV1Status() {
        int i = nq.b[this.status.ordinal()];
        if (i == 1) {
            return SessionStatus.ARCHIVED;
        }
        if (i != 2 && i != 3 && i != 4) {
            wg6.i();
            return null;
        }
        WorkerStatusV2 workerStatusV2 = this.worker_status;
        int i2 = workerStatusV2 == null ? -1 : nq.a[workerStatusV2.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                return SessionStatus.RUNNING;
            }
            if (i2 == 2) {
                return SessionStatus.REQUIRES_ACTION;
            }
            if (i2 != 3 && i2 != 4) {
                wg6.i();
                return null;
            }
        }
        return SessionStatus.IDLE;
    }

    public static final /* synthetic */ void write$Self$sessions(AgentOwnedSessionSummary self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, fsf.a, SessionId.m1114boximpl(self.id));
        if (output.E(serialDesc) || !x44.r(self.environment_id, "")) {
            output.q(serialDesc, 1, self.environment_id);
        }
        if (output.E(serialDesc) || self.environment_kind != null) {
            output.B(serialDesc, 2, uq6.a, self.environment_kind);
        }
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 3, srg.a, self.title);
        }
        if (output.E(serialDesc) || self.status != SessionLifecycleStatusV2.UNKNOWN) {
            output.r(serialDesc, 4, usf.a, self.status);
        }
        if (output.E(serialDesc) || self.worker_status != null) {
            output.B(serialDesc, 5, ihj.a, self.worker_status);
        }
        if (output.E(serialDesc) || self.tags != null) {
            output.B(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.tags);
        }
        if (output.E(serialDesc) || self.config != null) {
            output.B(serialDesc, 7, qpf.a, self.config);
        }
        if (output.E(serialDesc) || self.created_at != null) {
            output.B(serialDesc, 8, g69.a, self.created_at);
        }
        if (output.E(serialDesc) || self.last_event_at != null) {
            output.B(serialDesc, 9, g69.a, self.last_event_at);
        }
        if (output.E(serialDesc) || self.external_metadata != null) {
            output.B(serialDesc, 10, krf.a, self.external_metadata);
        }
        if (output.E(serialDesc) || self.unread) {
            output.p(serialDesc, 11, self.unread);
        }
        if (output.E(serialDesc) || self.agent_id != null) {
            nq3 nq3Var = nq3.a;
            String str = self.agent_id;
            output.B(serialDesc, 12, nq3Var, str != null ? CodeAgentId.m992boximpl(str) : null);
        }
        if (output.E(serialDesc) || self.started_by_account_id != null) {
            output.B(serialDesc, 13, srg.a, self.started_by_account_id);
        }
        if (!output.E(serialDesc) && self.session_grouping_id == null) {
            return;
        }
        xrf xrfVar = xrf.a;
        String str2 = self.session_grouping_id;
        output.B(serialDesc, 14, xrfVar, str2 != null ? SessionGroupingId.m1107boximpl(str2) : null);
    }

    /* JADX INFO: renamed from: component1-Ocx55TE, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final c69 getLast_event_at() {
        return this.last_event_at;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final SessionExternalMetadata getExternal_metadata() {
        return this.external_metadata;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getUnread() {
        return this.unread;
    }

    /* JADX INFO: renamed from: component13-kU3PmtI, reason: not valid java name and from getter */
    public final String getAgent_id() {
        return this.agent_id;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getStarted_by_account_id() {
        return this.started_by_account_id;
    }

    /* JADX INFO: renamed from: component15-n6q-b3o, reason: not valid java name and from getter */
    public final String getSession_grouping_id() {
        return this.session_grouping_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEnvironment_id() {
        return this.environment_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnvironmentKind getEnvironment_kind() {
        return this.environment_kind;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SessionLifecycleStatusV2 getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final WorkerStatusV2 getWorker_status() {
        return this.worker_status;
    }

    public final List<String> component7() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SessionConfigViewV2 getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final c69 getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: copy-lwWZvdA, reason: not valid java name */
    public final AgentOwnedSessionSummary m826copylwWZvdA(String id, String environment_id, EnvironmentKind environment_kind, String title, SessionLifecycleStatusV2 status, WorkerStatusV2 worker_status, List<String> tags, SessionConfigViewV2 config, c69 created_at, c69 last_event_at, SessionExternalMetadata external_metadata, boolean unread, String agent_id, String started_by_account_id, String session_grouping_id) {
        id.getClass();
        environment_id.getClass();
        status.getClass();
        return new AgentOwnedSessionSummary(id, environment_id, environment_kind, title, status, worker_status, tags, config, created_at, last_event_at, external_metadata, unread, agent_id, started_by_account_id, session_grouping_id, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.anthropic.claude.sessions.types.AgentOwnedSessionSummary
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.sessions.types.AgentOwnedSessionSummary r5 = (com.anthropic.claude.sessions.types.AgentOwnedSessionSummary) r5
            java.lang.String r1 = r4.id
            java.lang.String r3 = r5.id
            boolean r1 = com.anthropic.claude.types.strings.SessionId.m1117equalsimpl0(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.environment_id
            java.lang.String r3 = r5.environment_id
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            com.anthropic.claude.sessions.types.EnvironmentKind r1 = r4.environment_kind
            com.anthropic.claude.sessions.types.EnvironmentKind r3 = r5.environment_kind
            if (r1 == r3) goto L29
            return r2
        L29:
            java.lang.String r1 = r4.title
            java.lang.String r3 = r5.title
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            com.anthropic.claude.sessions.types.SessionLifecycleStatusV2 r1 = r4.status
            com.anthropic.claude.sessions.types.SessionLifecycleStatusV2 r3 = r5.status
            if (r1 == r3) goto L3b
            return r2
        L3b:
            com.anthropic.claude.sessions.types.WorkerStatusV2 r1 = r4.worker_status
            com.anthropic.claude.sessions.types.WorkerStatusV2 r3 = r5.worker_status
            if (r1 == r3) goto L42
            return r2
        L42:
            java.util.List<java.lang.String> r1 = r4.tags
            java.util.List<java.lang.String> r3 = r5.tags
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L4d
            return r2
        L4d:
            com.anthropic.claude.sessions.types.SessionConfigViewV2 r1 = r4.config
            com.anthropic.claude.sessions.types.SessionConfigViewV2 r3 = r5.config
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L58
            return r2
        L58:
            c69 r1 = r4.created_at
            c69 r3 = r5.created_at
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L63
            return r2
        L63:
            c69 r1 = r4.last_event_at
            c69 r3 = r5.last_event_at
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L6e
            return r2
        L6e:
            com.anthropic.claude.sessions.types.SessionExternalMetadata r1 = r4.external_metadata
            com.anthropic.claude.sessions.types.SessionExternalMetadata r3 = r5.external_metadata
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L79
            return r2
        L79:
            boolean r1 = r4.unread
            boolean r3 = r5.unread
            if (r1 == r3) goto L80
            return r2
        L80:
            java.lang.String r1 = r4.agent_id
            java.lang.String r3 = r5.agent_id
            if (r1 != 0) goto L8c
            if (r3 != 0) goto L8a
            r1 = r0
            goto L93
        L8a:
            r1 = r2
            goto L93
        L8c:
            if (r3 != 0) goto L8f
            goto L8a
        L8f:
            boolean r1 = com.anthropic.claude.types.strings.CodeAgentId.m995equalsimpl0(r1, r3)
        L93:
            if (r1 != 0) goto L96
            return r2
        L96:
            java.lang.String r1 = r4.started_by_account_id
            java.lang.String r3 = r5.started_by_account_id
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto La1
            return r2
        La1:
            java.lang.String r4 = r4.session_grouping_id
            java.lang.String r5 = r5.session_grouping_id
            if (r4 != 0) goto Lad
            if (r5 != 0) goto Lab
            r4 = r0
            goto Lb4
        Lab:
            r4 = r2
            goto Lb4
        Lad:
            if (r5 != 0) goto Lb0
            goto Lab
        Lb0:
            boolean r4 = com.anthropic.claude.types.strings.SessionGroupingId.m1110equalsimpl0(r4, r5)
        Lb4:
            if (r4 != 0) goto Lb7
            return r2
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.types.AgentOwnedSessionSummary.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getAgent_id-kU3PmtI, reason: not valid java name */
    public final String m827getAgent_idkU3PmtI() {
        return this.agent_id;
    }

    public final SessionConfigViewV2 getConfig() {
        return this.config;
    }

    public final c69 getCreated_at() {
        return this.created_at;
    }

    public final String getEnvironment_id() {
        return this.environment_id;
    }

    public final EnvironmentKind getEnvironment_kind() {
        return this.environment_kind;
    }

    public final SessionExternalMetadata getExternal_metadata() {
        return this.external_metadata;
    }

    /* JADX INFO: renamed from: getId-Ocx55TE, reason: not valid java name */
    public final String m828getIdOcx55TE() {
        return this.id;
    }

    public final c69 getLast_event_at() {
        return this.last_event_at;
    }

    /* JADX INFO: renamed from: getSession_grouping_id-n6q-b3o, reason: not valid java name */
    public final String m829getSession_grouping_idn6qb3o() {
        return this.session_grouping_id;
    }

    public final String getStarted_by_account_id() {
        return this.started_by_account_id;
    }

    public final SessionLifecycleStatusV2 getStatus() {
        return this.status;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getUnread() {
        return this.unread;
    }

    public final WorkerStatusV2 getWorker_status() {
        return this.worker_status;
    }

    public int hashCode() {
        int iL = kgh.l(SessionId.m1118hashCodeimpl(this.id) * 31, 31, this.environment_id);
        EnvironmentKind environmentKind = this.environment_kind;
        int iHashCode = (iL + (environmentKind == null ? 0 : environmentKind.hashCode())) * 31;
        String str = this.title;
        int iHashCode2 = (this.status.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        WorkerStatusV2 workerStatusV2 = this.worker_status;
        int iHashCode3 = (iHashCode2 + (workerStatusV2 == null ? 0 : workerStatusV2.hashCode())) * 31;
        List<String> list = this.tags;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        SessionConfigViewV2 sessionConfigViewV2 = this.config;
        int iHashCode5 = (iHashCode4 + (sessionConfigViewV2 == null ? 0 : sessionConfigViewV2.hashCode())) * 31;
        c69 c69Var = this.created_at;
        int iHashCode6 = (iHashCode5 + (c69Var == null ? 0 : c69Var.hashCode())) * 31;
        c69 c69Var2 = this.last_event_at;
        int iHashCode7 = (iHashCode6 + (c69Var2 == null ? 0 : c69Var2.hashCode())) * 31;
        SessionExternalMetadata sessionExternalMetadata = this.external_metadata;
        int iP = fsh.p((iHashCode7 + (sessionExternalMetadata == null ? 0 : sessionExternalMetadata.hashCode())) * 31, 31, this.unread);
        String str2 = this.agent_id;
        int iM996hashCodeimpl = (iP + (str2 == null ? 0 : CodeAgentId.m996hashCodeimpl(str2))) * 31;
        String str3 = this.started_by_account_id;
        int iHashCode8 = (iM996hashCodeimpl + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.session_grouping_id;
        return iHashCode8 + (str4 != null ? SessionGroupingId.m1111hashCodeimpl(str4) : 0);
    }

    public final SessionResource toSessionResource() {
        String str = this.id;
        if (!isg.q0(str, "cse_", false)) {
            str = null;
        }
        String strM1115constructorimpl = str != null ? SessionId.m1115constructorimpl("session_".concat(bsg.R0(str, "cse_"))) : this.id;
        String str2 = this.title;
        SessionStatus sessionStatusDerivedV1Status = derivedV1Status();
        String str3 = this.environment_id;
        EnvironmentKind environmentKind = this.environment_kind;
        EnvironmentKind environmentKind2 = (environmentKind == null || environmentKind == EnvironmentKind.UNKNOWN) ? null : environmentKind;
        c69 c69VarP = this.created_at;
        if (c69VarP == null) {
            c69 c69Var = c69.G;
            c69VarP = d4c.P(999999999, -3217862419201L);
        }
        c69 c69Var2 = c69VarP;
        c69 c69VarP2 = this.last_event_at;
        if (c69VarP2 == null && (c69VarP2 = this.created_at) == null) {
            c69 c69Var3 = c69.G;
            c69VarP2 = d4c.P(999999999, -3217862419201L);
        }
        c69 c69Var4 = c69VarP2;
        SessionConfigViewV2 sessionConfigViewV2 = this.config;
        List<SessionContextSource> sources = sessionConfigViewV2 != null ? sessionConfigViewV2.getSources() : null;
        if (sources == null) {
            sources = lm6.E;
        }
        SessionContext sessionContext = new SessionContext(sources, (String) null, (List) null, (String) null, (String) null, (String) null, 62, (mq5) null);
        SessionExternalMetadata sessionExternalMetadata = this.external_metadata;
        PostTurnSummary post_turn_summary = sessionExternalMetadata != null ? sessionExternalMetadata.getPost_turn_summary() : null;
        SessionExternalMetadata sessionExternalMetadata2 = this.external_metadata;
        return new SessionResource("internal_session", strM1115constructorimpl, str2, sessionStatusDerivedV1Status, str3, environmentKind2, c69Var2, c69Var4, sessionContext, (String) null, (ConnectionStatus) null, (WorkerStatus) null, (List) null, (String) null, (String) null, post_turn_summary, sessionExternalMetadata2 != null ? sessionExternalMetadata2.getTask_summary() : null, this.external_metadata, this.unread, this.tags, (String) null, this.agent_id, this.started_by_account_id, 1080832, (mq5) null);
    }

    public String toString() {
        String strM1119toStringimpl = SessionId.m1119toStringimpl(this.id);
        String str = this.environment_id;
        EnvironmentKind environmentKind = this.environment_kind;
        String str2 = this.title;
        SessionLifecycleStatusV2 sessionLifecycleStatusV2 = this.status;
        WorkerStatusV2 workerStatusV2 = this.worker_status;
        List<String> list = this.tags;
        SessionConfigViewV2 sessionConfigViewV2 = this.config;
        c69 c69Var = this.created_at;
        c69 c69Var2 = this.last_event_at;
        SessionExternalMetadata sessionExternalMetadata = this.external_metadata;
        boolean z = this.unread;
        String str3 = this.agent_id;
        String strM997toStringimpl = str3 == null ? "null" : CodeAgentId.m997toStringimpl(str3);
        String str4 = this.started_by_account_id;
        String str5 = this.session_grouping_id;
        String strM1112toStringimpl = str5 != null ? SessionGroupingId.m1112toStringimpl(str5) : "null";
        StringBuilder sbR = kgh.r("AgentOwnedSessionSummary(id=", strM1119toStringimpl, ", environment_id=", str, ", environment_kind=");
        sbR.append(environmentKind);
        sbR.append(", title=");
        sbR.append(str2);
        sbR.append(", status=");
        sbR.append(sessionLifecycleStatusV2);
        sbR.append(", worker_status=");
        sbR.append(workerStatusV2);
        sbR.append(", tags=");
        sbR.append(list);
        sbR.append(", config=");
        sbR.append(sessionConfigViewV2);
        sbR.append(", created_at=");
        sbR.append(c69Var);
        sbR.append(", last_event_at=");
        sbR.append(c69Var2);
        sbR.append(", external_metadata=");
        sbR.append(sessionExternalMetadata);
        sbR.append(", unread=");
        sbR.append(z);
        sbR.append(", agent_id=");
        kgh.u(sbR, strM997toStringimpl, ", started_by_account_id=", str4, ", session_grouping_id=");
        return ij0.m(sbR, strM1112toStringimpl, ")");
    }

    public /* synthetic */ AgentOwnedSessionSummary(String str, String str2, EnvironmentKind environmentKind, String str3, SessionLifecycleStatusV2 sessionLifecycleStatusV2, WorkerStatusV2 workerStatusV2, List list, SessionConfigViewV2 sessionConfigViewV2, c69 c69Var, c69 c69Var2, SessionExternalMetadata sessionExternalMetadata, boolean z, String str4, String str5, String str6, mq5 mq5Var) {
        this(str, str2, environmentKind, str3, sessionLifecycleStatusV2, workerStatusV2, list, sessionConfigViewV2, c69Var, c69Var2, sessionExternalMetadata, z, str4, str5, str6);
    }

    public /* synthetic */ AgentOwnedSessionSummary(int i, String str, String str2, EnvironmentKind environmentKind, String str3, SessionLifecycleStatusV2 sessionLifecycleStatusV2, WorkerStatusV2 workerStatusV2, List list, SessionConfigViewV2 sessionConfigViewV2, c69 c69Var, c69 c69Var2, SessionExternalMetadata sessionExternalMetadata, boolean z, String str4, String str5, String str6, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, environmentKind, str3, sessionLifecycleStatusV2, workerStatusV2, list, sessionConfigViewV2, c69Var, c69Var2, sessionExternalMetadata, z, str4, str5, str6, vnfVar);
    }

    private AgentOwnedSessionSummary(String str, String str2, EnvironmentKind environmentKind, String str3, SessionLifecycleStatusV2 sessionLifecycleStatusV2, WorkerStatusV2 workerStatusV2, List<String> list, SessionConfigViewV2 sessionConfigViewV2, c69 c69Var, c69 c69Var2, SessionExternalMetadata sessionExternalMetadata, boolean z, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        sessionLifecycleStatusV2.getClass();
        this.id = str;
        this.environment_id = str2;
        this.environment_kind = environmentKind;
        this.title = str3;
        this.status = sessionLifecycleStatusV2;
        this.worker_status = workerStatusV2;
        this.tags = list;
        this.config = sessionConfigViewV2;
        this.created_at = c69Var;
        this.last_event_at = c69Var2;
        this.external_metadata = sessionExternalMetadata;
        this.unread = z;
        this.agent_id = str4;
        this.started_by_account_id = str5;
        this.session_grouping_id = str6;
    }

    public /* synthetic */ AgentOwnedSessionSummary(String str, String str2, EnvironmentKind environmentKind, String str3, SessionLifecycleStatusV2 sessionLifecycleStatusV2, WorkerStatusV2 workerStatusV2, List list, SessionConfigViewV2 sessionConfigViewV2, c69 c69Var, c69 c69Var2, SessionExternalMetadata sessionExternalMetadata, boolean z, String str4, String str5, String str6, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : environmentKind, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? SessionLifecycleStatusV2.UNKNOWN : sessionLifecycleStatusV2, (i & 32) != 0 ? null : workerStatusV2, (i & 64) != 0 ? null : list, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : sessionConfigViewV2, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : c69Var, (i & 512) != 0 ? null : c69Var2, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : sessionExternalMetadata, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? false : z, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : str4, (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : str5, (i & 16384) != 0 ? null : str6, null);
    }
}
