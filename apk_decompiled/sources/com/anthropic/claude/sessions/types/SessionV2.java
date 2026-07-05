package com.anthropic.claude.sessions.types;

import com.anthropic.claude.types.strings.CodeAgentId;
import com.anthropic.claude.types.strings.SessionId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bad;
import defpackage.c69;
import defpackage.fp3;
import defpackage.fsf;
import defpackage.fsh;
import defpackage.g69;
import defpackage.gid;
import defpackage.gvj;
import defpackage.ihj;
import defpackage.ij0;
import defpackage.jvf;
import defpackage.kgh;
import defpackage.krf;
import defpackage.kvf;
import defpackage.kw9;
import defpackage.lvf;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nq3;
import defpackage.onf;
import defpackage.qpf;
import defpackage.rh4;
import defpackage.srg;
import defpackage.uo0;
import defpackage.uq6;
import defpackage.usf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wg6;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.ztf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 \u008a\u00012\u00020\u0001:\u0004\u008b\u0001\u008c\u0001Bû\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&B÷\u0001\b\u0010\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b%\u0010+J\u000f\u0010/\u001a\u00020,H\u0000¢\u0006\u0004\b-\u0010.J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u00102J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b6\u00104J\u0012\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b9\u00104J\u0010\u0010:\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bD\u0010=J\u0012\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bE\u00104J\u0012\u0010F\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\bJ\u0010IJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bK\u0010IJ\u0012\u0010L\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bN\u00104J\u0010\u0010O\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010R\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bQ\u00104J\u0012\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bS\u00104J\u0012\u0010T\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bT\u00104J\u008c\u0002\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\bU\u0010VJ\u0010\u0010X\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bX\u00104J\u0010\u0010Y\u001a\u00020'HÖ\u0001¢\u0006\u0004\bY\u0010ZJ\u001a\u0010\\\u001a\u00020\u001f2\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\\\u0010]J\u0011\u0010_\u001a\u0004\u0018\u00010^H\u0002¢\u0006\u0004\b_\u0010`J'\u0010i\u001a\u00020f2\u0006\u0010a\u001a\u00020\u00002\u0006\u0010c\u001a\u00020b2\u0006\u0010e\u001a\u00020dH\u0001¢\u0006\u0004\bg\u0010hR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010j\u001a\u0004\bk\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010j\u001a\u0004\bl\u00104R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010m\u001a\u0004\bn\u00108R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010j\u001a\u0004\bo\u00104R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010p\u001a\u0004\bq\u0010;R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010r\u001a\u0004\bs\u0010=R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010t\u001a\u0004\bu\u0010?R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010v\u001a\u0004\bw\u0010AR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010x\u001a\u0004\by\u0010CR\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010r\u001a\u0004\bz\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010j\u001a\u0004\b{\u00104R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010|\u001a\u0004\b}\u0010GR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010~\u001a\u0004\b\u007f\u0010IR\u0018\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\r\n\u0004\b\u001a\u0010~\u001a\u0005\b\u0080\u0001\u0010IR\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\r\n\u0004\b\u001b\u0010~\u001a\u0005\b\u0081\u0001\u0010IR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010MR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b\u001e\u0010j\u001a\u0005\b\u0084\u0001\u00104R\u0019\u0010 \u001a\u00020\u001f8\u0006¢\u0006\u000e\n\u0005\b \u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010PR\u001a\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\r\n\u0004\b\"\u0010j\u001a\u0005\b\u0087\u0001\u00104R\u001a\u0010#\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b#\u0010j\u001a\u0005\b\u0088\u0001\u00104R\u001a\u0010$\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b$\u0010j\u001a\u0005\b\u0089\u0001\u00104¨\u0006\u008d\u0001"}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionV2;", "", "Lcom/anthropic/claude/types/strings/SessionId;", "id", "", "environment_id", "Lcom/anthropic/claude/sessions/types/EnvironmentKind;", "environment_kind", "title", "Lcom/anthropic/claude/sessions/types/SessionLifecycleStatusV2;", "status", "", "tags", "Lcom/anthropic/claude/sessions/types/SessionConfigViewV2;", "config", "Lcom/anthropic/claude/sessions/types/WorkerStatusV2;", "worker_status", "Lcom/anthropic/claude/sessions/types/ConnectionStatus;", "connection_status", "Lcom/anthropic/claude/sessions/types/ClientPresenceInfo;", "client_presence", "trigger_id", "Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;", "external_metadata", "Lc69;", "created_at", "updated_at", "last_event_at", "Lcom/anthropic/claude/sessions/types/PostTurnSummary;", "post_turn_summary", "task_summary", "", "unread", "Lcom/anthropic/claude/types/strings/CodeAgentId;", "agent_id", "started_by_account_id", "self_hosted_runner_pool_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentKind;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionLifecycleStatusV2;Ljava/util/List;Lcom/anthropic/claude/sessions/types/SessionConfigViewV2;Lcom/anthropic/claude/sessions/types/WorkerStatusV2;Lcom/anthropic/claude/sessions/types/ConnectionStatus;Ljava/util/List;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;Lc69;Lc69;Lc69;Lcom/anthropic/claude/sessions/types/PostTurnSummary;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentKind;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionLifecycleStatusV2;Ljava/util/List;Lcom/anthropic/claude/sessions/types/SessionConfigViewV2;Lcom/anthropic/claude/sessions/types/WorkerStatusV2;Lcom/anthropic/claude/sessions/types/ConnectionStatus;Ljava/util/List;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;Lc69;Lc69;Lc69;Lcom/anthropic/claude/sessions/types/PostTurnSummary;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "Lcom/anthropic/claude/sessions/types/SessionStatus;", "derivedV1Status$sessions", "()Lcom/anthropic/claude/sessions/types/SessionStatus;", "derivedV1Status", "Lcom/anthropic/claude/sessions/types/SessionResource;", "toSessionResource", "()Lcom/anthropic/claude/sessions/types/SessionResource;", "component1-Ocx55TE", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/anthropic/claude/sessions/types/EnvironmentKind;", "component4", "component5", "()Lcom/anthropic/claude/sessions/types/SessionLifecycleStatusV2;", "component6", "()Ljava/util/List;", "component7", "()Lcom/anthropic/claude/sessions/types/SessionConfigViewV2;", "component8", "()Lcom/anthropic/claude/sessions/types/WorkerStatusV2;", "component9", "()Lcom/anthropic/claude/sessions/types/ConnectionStatus;", "component10", "component11", "component12", "()Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;", "component13", "()Lc69;", "component14", "component15", "component16", "()Lcom/anthropic/claude/sessions/types/PostTurnSummary;", "component17", "component18", "()Z", "component19-kU3PmtI", "component19", "component20", "component21", "copy-2YfoszQ", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentKind;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionLifecycleStatusV2;Ljava/util/List;Lcom/anthropic/claude/sessions/types/SessionConfigViewV2;Lcom/anthropic/claude/sessions/types/WorkerStatusV2;Lcom/anthropic/claude/sessions/types/ConnectionStatus;Ljava/util/List;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;Lc69;Lc69;Lc69;Lcom/anthropic/claude/sessions/types/PostTurnSummary;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/SessionV2;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/sessions/types/WorkerStatus;", "derivedV1WorkerStatus", "()Lcom/anthropic/claude/sessions/types/WorkerStatus;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SessionV2;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId-Ocx55TE", "getEnvironment_id", "Lcom/anthropic/claude/sessions/types/EnvironmentKind;", "getEnvironment_kind", "getTitle", "Lcom/anthropic/claude/sessions/types/SessionLifecycleStatusV2;", "getStatus", "Ljava/util/List;", "getTags", "Lcom/anthropic/claude/sessions/types/SessionConfigViewV2;", "getConfig", "Lcom/anthropic/claude/sessions/types/WorkerStatusV2;", "getWorker_status", "Lcom/anthropic/claude/sessions/types/ConnectionStatus;", "getConnection_status", "getClient_presence", "getTrigger_id", "Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;", "getExternal_metadata", "Lc69;", "getCreated_at", "getUpdated_at", "getLast_event_at", "Lcom/anthropic/claude/sessions/types/PostTurnSummary;", "getPost_turn_summary", "getTask_summary", "Z", "getUnread", "getAgent_id-kU3PmtI", "getStarted_by_account_id", "getSelf_hosted_runner_pool_id", "Companion", "jvf", "kvf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SessionV2 {
    private static final kw9[] $childSerializers;
    public static final kvf Companion = new kvf();
    private final String agent_id;
    private final List<ClientPresenceInfo> client_presence;
    private final SessionConfigViewV2 config;
    private final ConnectionStatus connection_status;
    private final c69 created_at;
    private final String environment_id;
    private final EnvironmentKind environment_kind;
    private final SessionExternalMetadata external_metadata;
    private final String id;
    private final c69 last_event_at;
    private final PostTurnSummary post_turn_summary;
    private final String self_hosted_runner_pool_id;
    private final String started_by_account_id;
    private final SessionLifecycleStatusV2 status;
    private final List<String> tags;
    private final String task_summary;
    private final String title;
    private final String trigger_id;
    private final boolean unread;
    private final c69 updated_at;
    private final WorkerStatusV2 worker_status;

    static {
        ztf ztfVar = new ztf(1);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, yb5.w(w1aVar, ztfVar), null, null, null, yb5.w(w1aVar, new ztf(2)), null, null, null, null, null, null, null, null, null, null, null};
    }

    private /* synthetic */ SessionV2(int i, String str, String str2, EnvironmentKind environmentKind, String str3, SessionLifecycleStatusV2 sessionLifecycleStatusV2, List list, SessionConfigViewV2 sessionConfigViewV2, WorkerStatusV2 workerStatusV2, ConnectionStatus connectionStatus, List list2, String str4, SessionExternalMetadata sessionExternalMetadata, c69 c69Var, c69 c69Var2, c69 c69Var3, PostTurnSummary postTurnSummary, String str5, boolean z, String str6, String str7, String str8, vnf vnfVar) {
        if (12305 != (i & 12305)) {
            gvj.f(i, 12305, jvf.a.getDescriptor());
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
        this.status = sessionLifecycleStatusV2;
        if ((i & 32) == 0) {
            this.tags = null;
        } else {
            this.tags = list;
        }
        if ((i & 64) == 0) {
            this.config = null;
        } else {
            this.config = sessionConfigViewV2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.worker_status = null;
        } else {
            this.worker_status = workerStatusV2;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.connection_status = null;
        } else {
            this.connection_status = connectionStatus;
        }
        if ((i & 512) == 0) {
            this.client_presence = null;
        } else {
            this.client_presence = list2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.trigger_id = null;
        } else {
            this.trigger_id = str4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.external_metadata = null;
        } else {
            this.external_metadata = sessionExternalMetadata;
        }
        this.created_at = c69Var;
        this.updated_at = c69Var2;
        if ((i & 16384) == 0) {
            this.last_event_at = null;
        } else {
            this.last_event_at = c69Var3;
        }
        if ((32768 & i) == 0) {
            this.post_turn_summary = null;
        } else {
            this.post_turn_summary = postTurnSummary;
        }
        if ((65536 & i) == 0) {
            this.task_summary = null;
        } else {
            this.task_summary = str5;
        }
        this.unread = (131072 & i) == 0 ? false : z;
        if ((262144 & i) == 0) {
            this.agent_id = null;
        } else {
            this.agent_id = str6;
        }
        if ((524288 & i) == 0) {
            this.started_by_account_id = null;
        } else {
            this.started_by_account_id = str7;
        }
        if ((i & FreeTypeConstants.FT_LOAD_COLOR) == 0) {
            this.self_hosted_runner_pool_id = null;
        } else {
            this.self_hosted_runner_pool_id = str8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(fp3.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-2YfoszQ$default, reason: not valid java name */
    public static /* synthetic */ SessionV2 m880copy2YfoszQ$default(SessionV2 sessionV2, String str, String str2, EnvironmentKind environmentKind, String str3, SessionLifecycleStatusV2 sessionLifecycleStatusV2, List list, SessionConfigViewV2 sessionConfigViewV2, WorkerStatusV2 workerStatusV2, ConnectionStatus connectionStatus, List list2, String str4, SessionExternalMetadata sessionExternalMetadata, c69 c69Var, c69 c69Var2, c69 c69Var3, PostTurnSummary postTurnSummary, String str5, boolean z, String str6, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        String str11 = (i & 1) != 0 ? sessionV2.id : str;
        String str12 = (i & 2) != 0 ? sessionV2.environment_id : str2;
        EnvironmentKind environmentKind2 = (i & 4) != 0 ? sessionV2.environment_kind : environmentKind;
        String str13 = (i & 8) != 0 ? sessionV2.title : str3;
        SessionLifecycleStatusV2 sessionLifecycleStatusV22 = (i & 16) != 0 ? sessionV2.status : sessionLifecycleStatusV2;
        List list3 = (i & 32) != 0 ? sessionV2.tags : list;
        SessionConfigViewV2 sessionConfigViewV22 = (i & 64) != 0 ? sessionV2.config : sessionConfigViewV2;
        WorkerStatusV2 workerStatusV22 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? sessionV2.worker_status : workerStatusV2;
        ConnectionStatus connectionStatus2 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? sessionV2.connection_status : connectionStatus;
        List list4 = (i & 512) != 0 ? sessionV2.client_presence : list2;
        String str14 = (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? sessionV2.trigger_id : str4;
        SessionExternalMetadata sessionExternalMetadata2 = (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? sessionV2.external_metadata : sessionExternalMetadata;
        c69 c69Var4 = (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? sessionV2.created_at : c69Var;
        c69 c69Var5 = (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? sessionV2.updated_at : c69Var2;
        String str15 = str11;
        c69 c69Var6 = (i & 16384) != 0 ? sessionV2.last_event_at : c69Var3;
        PostTurnSummary postTurnSummary2 = (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? sessionV2.post_turn_summary : postTurnSummary;
        String str16 = (i & 65536) != 0 ? sessionV2.task_summary : str5;
        boolean z2 = (i & 131072) != 0 ? sessionV2.unread : z;
        String str17 = (i & 262144) != 0 ? sessionV2.agent_id : str6;
        String str18 = (i & 524288) != 0 ? sessionV2.started_by_account_id : str7;
        if ((i & FreeTypeConstants.FT_LOAD_COLOR) != 0) {
            str10 = str18;
            str9 = sessionV2.self_hosted_runner_pool_id;
        } else {
            str9 = str8;
            str10 = str18;
        }
        return sessionV2.m883copy2YfoszQ(str15, str12, environmentKind2, str13, sessionLifecycleStatusV22, list3, sessionConfigViewV22, workerStatusV22, connectionStatus2, list4, str14, sessionExternalMetadata2, c69Var4, c69Var5, c69Var6, postTurnSummary2, str16, z2, str17, str10, str9);
    }

    private final WorkerStatus derivedV1WorkerStatus() {
        WorkerStatusV2 workerStatusV2 = this.worker_status;
        int i = workerStatusV2 == null ? -1 : lvf.a[workerStatusV2.ordinal()];
        if (i == -1 || i == 1) {
            return null;
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                return WorkerStatus.PROCESSING;
            }
            wg6.i();
            return null;
        }
        return WorkerStatus.IDLE;
    }

    public static final /* synthetic */ void write$Self$sessions(SessionV2 self, vd4 output, SerialDescriptor serialDesc) {
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
        output.r(serialDesc, 4, usf.a, self.status);
        if (output.E(serialDesc) || self.tags != null) {
            output.B(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.tags);
        }
        if (output.E(serialDesc) || self.config != null) {
            output.B(serialDesc, 6, qpf.a, self.config);
        }
        if (output.E(serialDesc) || self.worker_status != null) {
            output.B(serialDesc, 7, ihj.a, self.worker_status);
        }
        if (output.E(serialDesc) || self.connection_status != null) {
            output.B(serialDesc, 8, rh4.a, self.connection_status);
        }
        if (output.E(serialDesc) || self.client_presence != null) {
            output.B(serialDesc, 9, (znf) kw9VarArr[9].getValue(), self.client_presence);
        }
        if (output.E(serialDesc) || self.trigger_id != null) {
            output.B(serialDesc, 10, srg.a, self.trigger_id);
        }
        if (output.E(serialDesc) || self.external_metadata != null) {
            output.B(serialDesc, 11, krf.a, self.external_metadata);
        }
        g69 g69Var = g69.a;
        output.r(serialDesc, 12, g69Var, self.created_at);
        output.r(serialDesc, 13, g69Var, self.updated_at);
        if (output.E(serialDesc) || self.last_event_at != null) {
            output.B(serialDesc, 14, g69Var, self.last_event_at);
        }
        if (output.E(serialDesc) || self.post_turn_summary != null) {
            output.B(serialDesc, 15, bad.a, self.post_turn_summary);
        }
        if (output.E(serialDesc) || self.task_summary != null) {
            output.B(serialDesc, 16, srg.a, self.task_summary);
        }
        if (output.E(serialDesc) || self.unread) {
            output.p(serialDesc, 17, self.unread);
        }
        if (output.E(serialDesc) || self.agent_id != null) {
            nq3 nq3Var = nq3.a;
            String str = self.agent_id;
            output.B(serialDesc, 18, nq3Var, str != null ? CodeAgentId.m992boximpl(str) : null);
        }
        if (output.E(serialDesc) || self.started_by_account_id != null) {
            output.B(serialDesc, 19, srg.a, self.started_by_account_id);
        }
        if (!output.E(serialDesc) && self.self_hosted_runner_pool_id == null) {
            return;
        }
        output.B(serialDesc, 20, srg.a, self.self_hosted_runner_pool_id);
    }

    /* JADX INFO: renamed from: component1-Ocx55TE, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    public final List<ClientPresenceInfo> component10() {
        return this.client_presence;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTrigger_id() {
        return this.trigger_id;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final SessionExternalMetadata getExternal_metadata() {
        return this.external_metadata;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final c69 getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final c69 getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final c69 getLast_event_at() {
        return this.last_event_at;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final PostTurnSummary getPost_turn_summary() {
        return this.post_turn_summary;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTask_summary() {
        return this.task_summary;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getUnread() {
        return this.unread;
    }

    /* JADX INFO: renamed from: component19-kU3PmtI, reason: not valid java name and from getter */
    public final String getAgent_id() {
        return this.agent_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEnvironment_id() {
        return this.environment_id;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getStarted_by_account_id() {
        return this.started_by_account_id;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSelf_hosted_runner_pool_id() {
        return this.self_hosted_runner_pool_id;
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

    public final List<String> component6() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SessionConfigViewV2 getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final WorkerStatusV2 getWorker_status() {
        return this.worker_status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ConnectionStatus getConnection_status() {
        return this.connection_status;
    }

    /* JADX INFO: renamed from: copy-2YfoszQ, reason: not valid java name */
    public final SessionV2 m883copy2YfoszQ(String id, String environment_id, EnvironmentKind environment_kind, String title, SessionLifecycleStatusV2 status, List<String> tags, SessionConfigViewV2 config, WorkerStatusV2 worker_status, ConnectionStatus connection_status, List<ClientPresenceInfo> client_presence, String trigger_id, SessionExternalMetadata external_metadata, c69 created_at, c69 updated_at, c69 last_event_at, PostTurnSummary post_turn_summary, String task_summary, boolean unread, String agent_id, String started_by_account_id, String self_hosted_runner_pool_id) {
        id.getClass();
        environment_id.getClass();
        status.getClass();
        created_at.getClass();
        updated_at.getClass();
        return new SessionV2(id, environment_id, environment_kind, title, status, tags, config, worker_status, connection_status, client_presence, trigger_id, external_metadata, created_at, updated_at, last_event_at, post_turn_summary, task_summary, unread, agent_id, started_by_account_id, self_hosted_runner_pool_id, null);
    }

    public final SessionStatus derivedV1Status$sessions() {
        int i = lvf.b[this.status.ordinal()];
        if (i == 1) {
            return SessionStatus.UNKNOWN;
        }
        if (i == 2) {
            return SessionStatus.ARCHIVED;
        }
        if (i == 3) {
            return SessionStatus.IDLE;
        }
        if (i != 4) {
            wg6.i();
            return null;
        }
        WorkerStatusV2 workerStatusV2 = this.worker_status;
        int i2 = workerStatusV2 == null ? -1 : lvf.a[workerStatusV2.ordinal()];
        if (i2 == -1 || i2 == 1) {
            return SessionStatus.PENDING;
        }
        if (i2 == 2) {
            return SessionStatus.IDLE;
        }
        if (i2 == 3) {
            return SessionStatus.REQUIRES_ACTION;
        }
        if (i2 == 4) {
            return this.connection_status == ConnectionStatus.DISCONNECTED ? SessionStatus.IDLE : SessionStatus.RUNNING;
        }
        wg6.i();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.types.SessionV2.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getAgent_id-kU3PmtI, reason: not valid java name */
    public final String m884getAgent_idkU3PmtI() {
        return this.agent_id;
    }

    public final List<ClientPresenceInfo> getClient_presence() {
        return this.client_presence;
    }

    public final SessionConfigViewV2 getConfig() {
        return this.config;
    }

    public final ConnectionStatus getConnection_status() {
        return this.connection_status;
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
    public final String m885getIdOcx55TE() {
        return this.id;
    }

    public final c69 getLast_event_at() {
        return this.last_event_at;
    }

    public final PostTurnSummary getPost_turn_summary() {
        return this.post_turn_summary;
    }

    public final String getSelf_hosted_runner_pool_id() {
        return this.self_hosted_runner_pool_id;
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

    public final String getTask_summary() {
        return this.task_summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrigger_id() {
        return this.trigger_id;
    }

    public final boolean getUnread() {
        return this.unread;
    }

    public final c69 getUpdated_at() {
        return this.updated_at;
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
        List<String> list = this.tags;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        SessionConfigViewV2 sessionConfigViewV2 = this.config;
        int iHashCode4 = (iHashCode3 + (sessionConfigViewV2 == null ? 0 : sessionConfigViewV2.hashCode())) * 31;
        WorkerStatusV2 workerStatusV2 = this.worker_status;
        int iHashCode5 = (iHashCode4 + (workerStatusV2 == null ? 0 : workerStatusV2.hashCode())) * 31;
        ConnectionStatus connectionStatus = this.connection_status;
        int iHashCode6 = (iHashCode5 + (connectionStatus == null ? 0 : connectionStatus.hashCode())) * 31;
        List<ClientPresenceInfo> list2 = this.client_presence;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.trigger_id;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SessionExternalMetadata sessionExternalMetadata = this.external_metadata;
        int iHashCode9 = (this.updated_at.hashCode() + ((this.created_at.hashCode() + ((iHashCode8 + (sessionExternalMetadata == null ? 0 : sessionExternalMetadata.hashCode())) * 31)) * 31)) * 31;
        c69 c69Var = this.last_event_at;
        int iHashCode10 = (iHashCode9 + (c69Var == null ? 0 : c69Var.hashCode())) * 31;
        PostTurnSummary postTurnSummary = this.post_turn_summary;
        int iHashCode11 = (iHashCode10 + (postTurnSummary == null ? 0 : postTurnSummary.hashCode())) * 31;
        String str3 = this.task_summary;
        int iP = fsh.p((iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.unread);
        String str4 = this.agent_id;
        int iM996hashCodeimpl = (iP + (str4 == null ? 0 : CodeAgentId.m996hashCodeimpl(str4))) * 31;
        String str5 = this.started_by_account_id;
        int iHashCode12 = (iM996hashCodeimpl + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.self_hosted_runner_pool_id;
        return iHashCode12 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anthropic.claude.sessions.types.SessionResource toSessionResource() {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.types.SessionV2.toSessionResource():com.anthropic.claude.sessions.types.SessionResource");
    }

    public String toString() {
        String strM1119toStringimpl = SessionId.m1119toStringimpl(this.id);
        String str = this.environment_id;
        EnvironmentKind environmentKind = this.environment_kind;
        String str2 = this.title;
        SessionLifecycleStatusV2 sessionLifecycleStatusV2 = this.status;
        List<String> list = this.tags;
        SessionConfigViewV2 sessionConfigViewV2 = this.config;
        WorkerStatusV2 workerStatusV2 = this.worker_status;
        ConnectionStatus connectionStatus = this.connection_status;
        List<ClientPresenceInfo> list2 = this.client_presence;
        String str3 = this.trigger_id;
        SessionExternalMetadata sessionExternalMetadata = this.external_metadata;
        c69 c69Var = this.created_at;
        c69 c69Var2 = this.updated_at;
        c69 c69Var3 = this.last_event_at;
        PostTurnSummary postTurnSummary = this.post_turn_summary;
        String str4 = this.task_summary;
        boolean z = this.unread;
        String str5 = this.agent_id;
        String strM997toStringimpl = str5 == null ? "null" : CodeAgentId.m997toStringimpl(str5);
        String str6 = this.started_by_account_id;
        String str7 = this.self_hosted_runner_pool_id;
        StringBuilder sbR = kgh.r("SessionV2(id=", strM1119toStringimpl, ", environment_id=", str, ", environment_kind=");
        sbR.append(environmentKind);
        sbR.append(", title=");
        sbR.append(str2);
        sbR.append(", status=");
        sbR.append(sessionLifecycleStatusV2);
        sbR.append(", tags=");
        sbR.append(list);
        sbR.append(", config=");
        sbR.append(sessionConfigViewV2);
        sbR.append(", worker_status=");
        sbR.append(workerStatusV2);
        sbR.append(", connection_status=");
        sbR.append(connectionStatus);
        sbR.append(", client_presence=");
        sbR.append(list2);
        sbR.append(", trigger_id=");
        sbR.append(str3);
        sbR.append(", external_metadata=");
        sbR.append(sessionExternalMetadata);
        sbR.append(", created_at=");
        sbR.append(c69Var);
        sbR.append(", updated_at=");
        sbR.append(c69Var2);
        sbR.append(", last_event_at=");
        sbR.append(c69Var3);
        sbR.append(", post_turn_summary=");
        sbR.append(postTurnSummary);
        sbR.append(", task_summary=");
        gid.t(sbR, str4, ", unread=", z, ", agent_id=");
        kgh.u(sbR, strM997toStringimpl, ", started_by_account_id=", str6, ", self_hosted_runner_pool_id=");
        return ij0.m(sbR, str7, ")");
    }

    public /* synthetic */ SessionV2(String str, String str2, EnvironmentKind environmentKind, String str3, SessionLifecycleStatusV2 sessionLifecycleStatusV2, List list, SessionConfigViewV2 sessionConfigViewV2, WorkerStatusV2 workerStatusV2, ConnectionStatus connectionStatus, List list2, String str4, SessionExternalMetadata sessionExternalMetadata, c69 c69Var, c69 c69Var2, c69 c69Var3, PostTurnSummary postTurnSummary, String str5, boolean z, String str6, String str7, String str8, mq5 mq5Var) {
        this(str, str2, environmentKind, str3, sessionLifecycleStatusV2, list, sessionConfigViewV2, workerStatusV2, connectionStatus, list2, str4, sessionExternalMetadata, c69Var, c69Var2, c69Var3, postTurnSummary, str5, z, str6, str7, str8);
    }

    public /* synthetic */ SessionV2(int i, String str, String str2, EnvironmentKind environmentKind, String str3, SessionLifecycleStatusV2 sessionLifecycleStatusV2, List list, SessionConfigViewV2 sessionConfigViewV2, WorkerStatusV2 workerStatusV2, ConnectionStatus connectionStatus, List list2, String str4, SessionExternalMetadata sessionExternalMetadata, c69 c69Var, c69 c69Var2, c69 c69Var3, PostTurnSummary postTurnSummary, String str5, boolean z, String str6, String str7, String str8, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, environmentKind, str3, sessionLifecycleStatusV2, list, sessionConfigViewV2, workerStatusV2, connectionStatus, list2, str4, sessionExternalMetadata, c69Var, c69Var2, c69Var3, postTurnSummary, str5, z, str6, str7, str8, vnfVar);
    }

    private SessionV2(String str, String str2, EnvironmentKind environmentKind, String str3, SessionLifecycleStatusV2 sessionLifecycleStatusV2, List<String> list, SessionConfigViewV2 sessionConfigViewV2, WorkerStatusV2 workerStatusV2, ConnectionStatus connectionStatus, List<ClientPresenceInfo> list2, String str4, SessionExternalMetadata sessionExternalMetadata, c69 c69Var, c69 c69Var2, c69 c69Var3, PostTurnSummary postTurnSummary, String str5, boolean z, String str6, String str7, String str8) {
        str.getClass();
        str2.getClass();
        sessionLifecycleStatusV2.getClass();
        c69Var.getClass();
        c69Var2.getClass();
        this.id = str;
        this.environment_id = str2;
        this.environment_kind = environmentKind;
        this.title = str3;
        this.status = sessionLifecycleStatusV2;
        this.tags = list;
        this.config = sessionConfigViewV2;
        this.worker_status = workerStatusV2;
        this.connection_status = connectionStatus;
        this.client_presence = list2;
        this.trigger_id = str4;
        this.external_metadata = sessionExternalMetadata;
        this.created_at = c69Var;
        this.updated_at = c69Var2;
        this.last_event_at = c69Var3;
        this.post_turn_summary = postTurnSummary;
        this.task_summary = str5;
        this.unread = z;
        this.agent_id = str6;
        this.started_by_account_id = str7;
        this.self_hosted_runner_pool_id = str8;
    }

    public /* synthetic */ SessionV2(String str, String str2, EnvironmentKind environmentKind, String str3, SessionLifecycleStatusV2 sessionLifecycleStatusV2, List list, SessionConfigViewV2 sessionConfigViewV2, WorkerStatusV2 workerStatusV2, ConnectionStatus connectionStatus, List list2, String str4, SessionExternalMetadata sessionExternalMetadata, c69 c69Var, c69 c69Var2, c69 c69Var3, PostTurnSummary postTurnSummary, String str5, boolean z, String str6, String str7, String str8, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : environmentKind, (i & 8) != 0 ? null : str3, sessionLifecycleStatusV2, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : sessionConfigViewV2, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : workerStatusV2, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : connectionStatus, (i & 512) != 0 ? null : list2, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : str4, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : sessionExternalMetadata, c69Var, c69Var2, (i & 16384) != 0 ? null : c69Var3, (32768 & i) != 0 ? null : postTurnSummary, (65536 & i) != 0 ? null : str5, (131072 & i) != 0 ? false : z, (262144 & i) != 0 ? null : str6, (524288 & i) != 0 ? null : str7, (i & FreeTypeConstants.FT_LOAD_COLOR) != 0 ? null : str8, null);
    }
}
