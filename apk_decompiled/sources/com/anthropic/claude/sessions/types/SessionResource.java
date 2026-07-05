package com.anthropic.claude.sessions.types;

import com.anthropic.claude.types.strings.CodeAgentId;
import com.anthropic.claude.types.strings.SessionId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bad;
import defpackage.c69;
import defpackage.cuf;
import defpackage.fp3;
import defpackage.fsf;
import defpackage.fsh;
import defpackage.g69;
import defpackage.ghj;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.krf;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ms6;
import defpackage.nq3;
import defpackage.onf;
import defpackage.rh4;
import defpackage.srg;
import defpackage.stf;
import defpackage.tpf;
import defpackage.ttf;
import defpackage.ucf;
import defpackage.uo0;
import defpackage.uq6;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u008b\u00012\u00020\u0001:\u0004\u008c\u0001\u008d\u0001B\u0089\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(B\u008b\u0002\b\u0010\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b'\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010/J\u0010\u00103\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010/J\u0012\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b:\u00109J\u0010\u0010;\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010/J\u0012\u0010>\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0018\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010/J\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u0010/J\u0012\u0010F\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u0010/J\u0012\u0010I\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020 HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bM\u0010CJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u0010/J\u0012\u0010P\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bO\u0010/J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u0010/J \u0002\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00162\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bR\u0010SJ\u0010\u0010U\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bU\u0010/J\u0010\u0010V\u001a\u00020)HÖ\u0001¢\u0006\u0004\bV\u0010WJ\u001a\u0010Y\u001a\u00020 2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bY\u0010ZJ'\u0010c\u001a\u00020`2\u0006\u0010[\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^H\u0001¢\u0006\u0004\ba\u0010bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010d\u001a\u0004\be\u0010/R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010d\u001a\u0004\bf\u0010/R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010d\u001a\u0004\bg\u0010/R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010h\u001a\u0004\bi\u00104R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010d\u001a\u0004\bj\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010k\u001a\u0004\bl\u00107R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010m\u001a\u0004\bn\u00109R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010m\u001a\u0004\bo\u00109R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010p\u001a\u0004\bq\u0010<R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010d\u001a\u0004\br\u0010/R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010s\u001a\u0004\bt\u0010?R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010u\u001a\u0004\bv\u0010AR\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010w\u001a\u0004\bx\u0010CR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010d\u001a\u0004\by\u0010/R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010d\u001a\u0004\bz\u0010/R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010{\u001a\u0004\b|\u0010GR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010d\u001a\u0004\b}\u0010/R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010~\u001a\u0004\b\u007f\u0010JR\u0019\u0010!\u001a\u00020 8\u0006¢\u0006\u000e\n\u0005\b!\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010LR \u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0006¢\u0006\r\n\u0004\b\"\u0010w\u001a\u0005\b\u0082\u0001\u0010CR\u001a\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b#\u0010d\u001a\u0005\b\u0083\u0001\u0010/R\u001a\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\r\n\u0004\b%\u0010d\u001a\u0005\b\u0084\u0001\u0010/R\u001a\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b&\u0010d\u001a\u0005\b\u0085\u0001\u0010/R\u0017\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0086\u00018F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0013\u0010\u008a\u0001\u001a\u00020 8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010L¨\u0006\u008e\u0001"}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionResource;", "", "", "type", "Lcom/anthropic/claude/types/strings/SessionId;", "id", "title", "Lcom/anthropic/claude/sessions/types/SessionStatus;", "session_status", "environment_id", "Lcom/anthropic/claude/sessions/types/EnvironmentKind;", "environment_kind", "Lc69;", "created_at", "updated_at", "Lcom/anthropic/claude/sessions/types/SessionContext;", "session_context", "bridge_spawn_path", "Lcom/anthropic/claude/sessions/types/ConnectionStatus;", "connection_status", "Lcom/anthropic/claude/sessions/types/WorkerStatus;", "worker_status", "", "Lcom/anthropic/claude/sessions/types/ClientPresenceInfo;", "client_presence", "trigger_id", "origin", "Lcom/anthropic/claude/sessions/types/PostTurnSummary;", "post_turn_summary", "task_summary", "Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;", "external_metadata", "", "unread", "tags", "self_hosted_runner_pool_id", "Lcom/anthropic/claude/types/strings/CodeAgentId;", "agent_id", "started_by_account_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionStatus;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentKind;Lc69;Lc69;Lcom/anthropic/claude/sessions/types/SessionContext;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ConnectionStatus;Lcom/anthropic/claude/sessions/types/WorkerStatus;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/PostTurnSummary;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionStatus;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentKind;Lc69;Lc69;Lcom/anthropic/claude/sessions/types/SessionContext;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ConnectionStatus;Lcom/anthropic/claude/sessions/types/WorkerStatus;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/PostTurnSummary;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "component1", "()Ljava/lang/String;", "component2-Ocx55TE", "component2", "component3", "component4", "()Lcom/anthropic/claude/sessions/types/SessionStatus;", "component5", "component6", "()Lcom/anthropic/claude/sessions/types/EnvironmentKind;", "component7", "()Lc69;", "component8", "component9", "()Lcom/anthropic/claude/sessions/types/SessionContext;", "component10", "component11", "()Lcom/anthropic/claude/sessions/types/ConnectionStatus;", "component12", "()Lcom/anthropic/claude/sessions/types/WorkerStatus;", "component13", "()Ljava/util/List;", "component14", "component15", "component16", "()Lcom/anthropic/claude/sessions/types/PostTurnSummary;", "component17", "component18", "()Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;", "component19", "()Z", "component20", "component21", "component22-kU3PmtI", "component22", "component23", "copy-3s6jSc4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionStatus;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentKind;Lc69;Lc69;Lcom/anthropic/claude/sessions/types/SessionContext;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ConnectionStatus;Lcom/anthropic/claude/sessions/types/WorkerStatus;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/PostTurnSummary;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/SessionResource;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SessionResource;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "getId-Ocx55TE", "getTitle", "Lcom/anthropic/claude/sessions/types/SessionStatus;", "getSession_status", "getEnvironment_id", "Lcom/anthropic/claude/sessions/types/EnvironmentKind;", "getEnvironment_kind", "Lc69;", "getCreated_at", "getUpdated_at", "Lcom/anthropic/claude/sessions/types/SessionContext;", "getSession_context", "getBridge_spawn_path", "Lcom/anthropic/claude/sessions/types/ConnectionStatus;", "getConnection_status", "Lcom/anthropic/claude/sessions/types/WorkerStatus;", "getWorker_status", "Ljava/util/List;", "getClient_presence", "getTrigger_id", "getOrigin", "Lcom/anthropic/claude/sessions/types/PostTurnSummary;", "getPost_turn_summary", "getTask_summary", "Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;", "getExternal_metadata", "Z", "getUnread", "getTags", "getSelf_hosted_runner_pool_id", "getAgent_id-kU3PmtI", "getStarted_by_account_id", "Lcom/anthropic/claude/sessions/types/RequiresActionDetails;", "getPending_action", "()Lcom/anthropic/claude/sessions/types/RequiresActionDetails;", "pending_action", "isAgentOwned", "Companion", "stf", "ttf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SessionResource {
    private static final kw9[] $childSerializers;
    public static final ttf Companion = new ttf();
    private final String agent_id;
    private final String bridge_spawn_path;
    private final List<ClientPresenceInfo> client_presence;
    private final ConnectionStatus connection_status;
    private final c69 created_at;
    private final String environment_id;
    private final EnvironmentKind environment_kind;
    private final SessionExternalMetadata external_metadata;
    private final String id;
    private final String origin;
    private final PostTurnSummary post_turn_summary;
    private final String self_hosted_runner_pool_id;
    private final SessionContext session_context;
    private final SessionStatus session_status;
    private final String started_by_account_id;
    private final List<String> tags;
    private final String task_summary;
    private final String title;
    private final String trigger_id;
    private final String type;
    private final boolean unread;
    private final c69 updated_at;
    private final WorkerStatus worker_status;

    static {
        ucf ucfVar = new ucf(28);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, null, null, null, null, null, null, null, yb5.w(w1aVar, ucfVar), null, null, null, null, null, null, yb5.w(w1aVar, new ucf(29)), null, null, null};
    }

    private /* synthetic */ SessionResource(int i, String str, String str2, String str3, SessionStatus sessionStatus, String str4, EnvironmentKind environmentKind, c69 c69Var, c69 c69Var2, SessionContext sessionContext, String str5, ConnectionStatus connectionStatus, WorkerStatus workerStatus, List list, String str6, String str7, PostTurnSummary postTurnSummary, String str8, SessionExternalMetadata sessionExternalMetadata, boolean z, List list2, String str9, String str10, String str11, vnf vnfVar) {
        if (475 != (i & 475)) {
            gvj.f(i, 475, stf.a.getDescriptor());
            throw null;
        }
        this.type = str;
        this.id = str2;
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        this.session_status = sessionStatus;
        this.environment_id = str4;
        if ((i & 32) == 0) {
            this.environment_kind = null;
        } else {
            this.environment_kind = environmentKind;
        }
        this.created_at = c69Var;
        this.updated_at = c69Var2;
        this.session_context = sessionContext;
        if ((i & 512) == 0) {
            this.bridge_spawn_path = null;
        } else {
            this.bridge_spawn_path = str5;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.connection_status = null;
        } else {
            this.connection_status = connectionStatus;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.worker_status = null;
        } else {
            this.worker_status = workerStatus;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.client_presence = null;
        } else {
            this.client_presence = list;
        }
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) {
            this.trigger_id = null;
        } else {
            this.trigger_id = str6;
        }
        if ((i & 16384) == 0) {
            this.origin = null;
        } else {
            this.origin = str7;
        }
        if ((32768 & i) == 0) {
            this.post_turn_summary = null;
        } else {
            this.post_turn_summary = postTurnSummary;
        }
        if ((65536 & i) == 0) {
            this.task_summary = null;
        } else {
            this.task_summary = str8;
        }
        if ((131072 & i) == 0) {
            this.external_metadata = null;
        } else {
            this.external_metadata = sessionExternalMetadata;
        }
        this.unread = (262144 & i) == 0 ? false : z;
        if ((524288 & i) == 0) {
            this.tags = null;
        } else {
            this.tags = list2;
        }
        if ((1048576 & i) == 0) {
            this.self_hosted_runner_pool_id = null;
        } else {
            this.self_hosted_runner_pool_id = str9;
        }
        if ((2097152 & i) == 0) {
            this.agent_id = null;
        } else {
            this.agent_id = str10;
        }
        if ((i & 4194304) == 0) {
            this.started_by_account_id = null;
        } else {
            this.started_by_account_id = str11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(fp3.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-3s6jSc4$default, reason: not valid java name */
    public static /* synthetic */ SessionResource m870copy3s6jSc4$default(SessionResource sessionResource, String str, String str2, String str3, SessionStatus sessionStatus, String str4, EnvironmentKind environmentKind, c69 c69Var, c69 c69Var2, SessionContext sessionContext, String str5, ConnectionStatus connectionStatus, WorkerStatus workerStatus, List list, String str6, String str7, PostTurnSummary postTurnSummary, String str8, SessionExternalMetadata sessionExternalMetadata, boolean z, List list2, String str9, String str10, String str11, int i, Object obj) {
        String str12;
        String str13;
        String str14 = (i & 1) != 0 ? sessionResource.type : str;
        String str15 = (i & 2) != 0 ? sessionResource.id : str2;
        String str16 = (i & 4) != 0 ? sessionResource.title : str3;
        SessionStatus sessionStatus2 = (i & 8) != 0 ? sessionResource.session_status : sessionStatus;
        String str17 = (i & 16) != 0 ? sessionResource.environment_id : str4;
        EnvironmentKind environmentKind2 = (i & 32) != 0 ? sessionResource.environment_kind : environmentKind;
        c69 c69Var3 = (i & 64) != 0 ? sessionResource.created_at : c69Var;
        c69 c69Var4 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? sessionResource.updated_at : c69Var2;
        SessionContext sessionContext2 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? sessionResource.session_context : sessionContext;
        String str18 = (i & 512) != 0 ? sessionResource.bridge_spawn_path : str5;
        ConnectionStatus connectionStatus2 = (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? sessionResource.connection_status : connectionStatus;
        WorkerStatus workerStatus2 = (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? sessionResource.worker_status : workerStatus;
        List list3 = (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? sessionResource.client_presence : list;
        String str19 = (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? sessionResource.trigger_id : str6;
        String str20 = str14;
        String str21 = (i & 16384) != 0 ? sessionResource.origin : str7;
        PostTurnSummary postTurnSummary2 = (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? sessionResource.post_turn_summary : postTurnSummary;
        String str22 = (i & 65536) != 0 ? sessionResource.task_summary : str8;
        SessionExternalMetadata sessionExternalMetadata2 = (i & 131072) != 0 ? sessionResource.external_metadata : sessionExternalMetadata;
        boolean z2 = (i & 262144) != 0 ? sessionResource.unread : z;
        List list4 = (i & 524288) != 0 ? sessionResource.tags : list2;
        String str23 = (i & FreeTypeConstants.FT_LOAD_COLOR) != 0 ? sessionResource.self_hosted_runner_pool_id : str9;
        String str24 = (i & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0 ? sessionResource.agent_id : str10;
        if ((i & 4194304) != 0) {
            str13 = str24;
            str12 = sessionResource.started_by_account_id;
        } else {
            str12 = str11;
            str13 = str24;
        }
        return sessionResource.m873copy3s6jSc4(str20, str15, str16, sessionStatus2, str17, environmentKind2, c69Var3, c69Var4, sessionContext2, str18, connectionStatus2, workerStatus2, list3, str19, str21, postTurnSummary2, str22, sessionExternalMetadata2, z2, list4, str23, str13, str12);
    }

    public static final /* synthetic */ void write$Self$sessions(SessionResource self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.type);
        output.r(serialDesc, 1, fsf.a, SessionId.m1114boximpl(self.id));
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 2, srg.a, self.title);
        }
        output.r(serialDesc, 3, cuf.a, self.session_status);
        output.q(serialDesc, 4, self.environment_id);
        if (output.E(serialDesc) || self.environment_kind != null) {
            output.B(serialDesc, 5, uq6.a, self.environment_kind);
        }
        g69 g69Var = g69.a;
        output.r(serialDesc, 6, g69Var, self.created_at);
        output.r(serialDesc, 7, g69Var, self.updated_at);
        output.r(serialDesc, 8, tpf.a, self.session_context);
        if (output.E(serialDesc) || self.bridge_spawn_path != null) {
            output.B(serialDesc, 9, srg.a, self.bridge_spawn_path);
        }
        if (output.E(serialDesc) || self.connection_status != null) {
            output.B(serialDesc, 10, rh4.a, self.connection_status);
        }
        if (output.E(serialDesc) || self.worker_status != null) {
            output.B(serialDesc, 11, ghj.a, self.worker_status);
        }
        if (output.E(serialDesc) || self.client_presence != null) {
            output.B(serialDesc, 12, (znf) kw9VarArr[12].getValue(), self.client_presence);
        }
        if (output.E(serialDesc) || self.trigger_id != null) {
            output.B(serialDesc, 13, srg.a, self.trigger_id);
        }
        if (output.E(serialDesc) || self.origin != null) {
            output.B(serialDesc, 14, srg.a, self.origin);
        }
        if (output.E(serialDesc) || self.post_turn_summary != null) {
            output.B(serialDesc, 15, bad.a, self.post_turn_summary);
        }
        if (output.E(serialDesc) || self.task_summary != null) {
            output.B(serialDesc, 16, srg.a, self.task_summary);
        }
        if (output.E(serialDesc) || self.external_metadata != null) {
            output.B(serialDesc, 17, krf.a, self.external_metadata);
        }
        if (output.E(serialDesc) || self.unread) {
            output.p(serialDesc, 18, self.unread);
        }
        if (output.E(serialDesc) || self.tags != null) {
            output.B(serialDesc, 19, (znf) kw9VarArr[19].getValue(), self.tags);
        }
        if (output.E(serialDesc) || self.self_hosted_runner_pool_id != null) {
            output.B(serialDesc, 20, srg.a, self.self_hosted_runner_pool_id);
        }
        if (output.E(serialDesc) || self.agent_id != null) {
            nq3 nq3Var = nq3.a;
            String str = self.agent_id;
            output.B(serialDesc, 21, nq3Var, str != null ? CodeAgentId.m992boximpl(str) : null);
        }
        if (!output.E(serialDesc) && self.started_by_account_id == null) {
            return;
        }
        output.B(serialDesc, 22, srg.a, self.started_by_account_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBridge_spawn_path() {
        return this.bridge_spawn_path;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ConnectionStatus getConnection_status() {
        return this.connection_status;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final WorkerStatus getWorker_status() {
        return this.worker_status;
    }

    public final List<ClientPresenceInfo> component13() {
        return this.client_presence;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTrigger_id() {
        return this.trigger_id;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getOrigin() {
        return this.origin;
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
    public final SessionExternalMetadata getExternal_metadata() {
        return this.external_metadata;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getUnread() {
        return this.unread;
    }

    /* JADX INFO: renamed from: component2-Ocx55TE, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component20() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSelf_hosted_runner_pool_id() {
        return this.self_hosted_runner_pool_id;
    }

    /* JADX INFO: renamed from: component22-kU3PmtI, reason: not valid java name and from getter */
    public final String getAgent_id() {
        return this.agent_id;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getStarted_by_account_id() {
        return this.started_by_account_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SessionStatus getSession_status() {
        return this.session_status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEnvironment_id() {
        return this.environment_id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EnvironmentKind getEnvironment_kind() {
        return this.environment_kind;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final c69 getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final c69 getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SessionContext getSession_context() {
        return this.session_context;
    }

    /* JADX INFO: renamed from: copy-3s6jSc4, reason: not valid java name */
    public final SessionResource m873copy3s6jSc4(String type, String id, String title, SessionStatus session_status, String environment_id, EnvironmentKind environment_kind, c69 created_at, c69 updated_at, SessionContext session_context, String bridge_spawn_path, ConnectionStatus connection_status, WorkerStatus worker_status, List<ClientPresenceInfo> client_presence, String trigger_id, String origin, PostTurnSummary post_turn_summary, String task_summary, SessionExternalMetadata external_metadata, boolean unread, List<String> tags, String self_hosted_runner_pool_id, String agent_id, String started_by_account_id) {
        type.getClass();
        id.getClass();
        session_status.getClass();
        environment_id.getClass();
        created_at.getClass();
        updated_at.getClass();
        session_context.getClass();
        return new SessionResource(type, id, title, session_status, environment_id, environment_kind, created_at, updated_at, session_context, bridge_spawn_path, connection_status, worker_status, client_presence, trigger_id, origin, post_turn_summary, task_summary, external_metadata, unread, tags, self_hosted_runner_pool_id, agent_id, started_by_account_id, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.types.SessionResource.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getAgent_id-kU3PmtI, reason: not valid java name */
    public final String m874getAgent_idkU3PmtI() {
        return this.agent_id;
    }

    public final String getBridge_spawn_path() {
        return this.bridge_spawn_path;
    }

    public final List<ClientPresenceInfo> getClient_presence() {
        return this.client_presence;
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
    public final String m875getIdOcx55TE() {
        return this.id;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final RequiresActionDetails getPending_action() {
        SessionExternalMetadata sessionExternalMetadata = this.external_metadata;
        if (sessionExternalMetadata != null) {
            return sessionExternalMetadata.getPending_action();
        }
        return null;
    }

    public final PostTurnSummary getPost_turn_summary() {
        return this.post_turn_summary;
    }

    public final String getSelf_hosted_runner_pool_id() {
        return this.self_hosted_runner_pool_id;
    }

    public final SessionContext getSession_context() {
        return this.session_context;
    }

    public final SessionStatus getSession_status() {
        return this.session_status;
    }

    public final String getStarted_by_account_id() {
        return this.started_by_account_id;
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

    public final String getType() {
        return this.type;
    }

    public final boolean getUnread() {
        return this.unread;
    }

    public final c69 getUpdated_at() {
        return this.updated_at;
    }

    public final WorkerStatus getWorker_status() {
        return this.worker_status;
    }

    public int hashCode() {
        int iM1118hashCodeimpl = (SessionId.m1118hashCodeimpl(this.id) + (this.type.hashCode() * 31)) * 31;
        String str = this.title;
        int iL = kgh.l((this.session_status.hashCode() + ((iM1118hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.environment_id);
        EnvironmentKind environmentKind = this.environment_kind;
        int iHashCode = (this.session_context.hashCode() + ((this.updated_at.hashCode() + ((this.created_at.hashCode() + ((iL + (environmentKind == null ? 0 : environmentKind.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str2 = this.bridge_spawn_path;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConnectionStatus connectionStatus = this.connection_status;
        int iHashCode3 = (iHashCode2 + (connectionStatus == null ? 0 : connectionStatus.hashCode())) * 31;
        WorkerStatus workerStatus = this.worker_status;
        int iHashCode4 = (iHashCode3 + (workerStatus == null ? 0 : workerStatus.hashCode())) * 31;
        List<ClientPresenceInfo> list = this.client_presence;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.trigger_id;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.origin;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PostTurnSummary postTurnSummary = this.post_turn_summary;
        int iHashCode8 = (iHashCode7 + (postTurnSummary == null ? 0 : postTurnSummary.hashCode())) * 31;
        String str5 = this.task_summary;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        SessionExternalMetadata sessionExternalMetadata = this.external_metadata;
        int iP = fsh.p((iHashCode9 + (sessionExternalMetadata == null ? 0 : sessionExternalMetadata.hashCode())) * 31, 31, this.unread);
        List<String> list2 = this.tags;
        int iHashCode10 = (iP + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.self_hosted_runner_pool_id;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.agent_id;
        int iM996hashCodeimpl = (iHashCode11 + (str7 == null ? 0 : CodeAgentId.m996hashCodeimpl(str7))) * 31;
        String str8 = this.started_by_account_id;
        return iM996hashCodeimpl + (str8 != null ? str8.hashCode() : 0);
    }

    public final boolean isAgentOwned() {
        String str = this.agent_id;
        if (str == null) {
            str = null;
        }
        return !(str == null || str.length() == 0);
    }

    public String toString() {
        String str = this.type;
        String strM1119toStringimpl = SessionId.m1119toStringimpl(this.id);
        String str2 = this.title;
        SessionStatus sessionStatus = this.session_status;
        String str3 = this.environment_id;
        EnvironmentKind environmentKind = this.environment_kind;
        c69 c69Var = this.created_at;
        c69 c69Var2 = this.updated_at;
        SessionContext sessionContext = this.session_context;
        String str4 = this.bridge_spawn_path;
        ConnectionStatus connectionStatus = this.connection_status;
        WorkerStatus workerStatus = this.worker_status;
        List<ClientPresenceInfo> list = this.client_presence;
        String str5 = this.trigger_id;
        String str6 = this.origin;
        PostTurnSummary postTurnSummary = this.post_turn_summary;
        String str7 = this.task_summary;
        SessionExternalMetadata sessionExternalMetadata = this.external_metadata;
        boolean z = this.unread;
        List<String> list2 = this.tags;
        String str8 = this.self_hosted_runner_pool_id;
        String str9 = this.agent_id;
        String strM997toStringimpl = str9 == null ? "null" : CodeAgentId.m997toStringimpl(str9);
        String str10 = this.started_by_account_id;
        StringBuilder sbR = kgh.r("SessionResource(type=", str, ", id=", strM1119toStringimpl, ", title=");
        sbR.append(str2);
        sbR.append(", session_status=");
        sbR.append(sessionStatus);
        sbR.append(", environment_id=");
        sbR.append(str3);
        sbR.append(", environment_kind=");
        sbR.append(environmentKind);
        sbR.append(", created_at=");
        sbR.append(c69Var);
        sbR.append(", updated_at=");
        sbR.append(c69Var2);
        sbR.append(", session_context=");
        sbR.append(sessionContext);
        sbR.append(", bridge_spawn_path=");
        sbR.append(str4);
        sbR.append(", connection_status=");
        sbR.append(connectionStatus);
        sbR.append(", worker_status=");
        sbR.append(workerStatus);
        sbR.append(", client_presence=");
        ms6.x(", trigger_id=", str5, ", origin=", sbR, list);
        sbR.append(str6);
        sbR.append(", post_turn_summary=");
        sbR.append(postTurnSummary);
        sbR.append(", task_summary=");
        sbR.append(str7);
        sbR.append(", external_metadata=");
        sbR.append(sessionExternalMetadata);
        sbR.append(", unread=");
        sbR.append(z);
        sbR.append(", tags=");
        sbR.append(list2);
        sbR.append(", self_hosted_runner_pool_id=");
        kgh.u(sbR, str8, ", agent_id=", strM997toStringimpl, ", started_by_account_id=");
        return ij0.m(sbR, str10, ")");
    }

    public /* synthetic */ SessionResource(String str, String str2, String str3, SessionStatus sessionStatus, String str4, EnvironmentKind environmentKind, c69 c69Var, c69 c69Var2, SessionContext sessionContext, String str5, ConnectionStatus connectionStatus, WorkerStatus workerStatus, List list, String str6, String str7, PostTurnSummary postTurnSummary, String str8, SessionExternalMetadata sessionExternalMetadata, boolean z, List list2, String str9, String str10, String str11, mq5 mq5Var) {
        this(str, str2, str3, sessionStatus, str4, environmentKind, c69Var, c69Var2, sessionContext, str5, connectionStatus, workerStatus, list, str6, str7, postTurnSummary, str8, sessionExternalMetadata, z, list2, str9, str10, str11);
    }

    public /* synthetic */ SessionResource(int i, String str, String str2, String str3, SessionStatus sessionStatus, String str4, EnvironmentKind environmentKind, c69 c69Var, c69 c69Var2, SessionContext sessionContext, String str5, ConnectionStatus connectionStatus, WorkerStatus workerStatus, List list, String str6, String str7, PostTurnSummary postTurnSummary, String str8, SessionExternalMetadata sessionExternalMetadata, boolean z, List list2, String str9, String str10, String str11, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, sessionStatus, str4, environmentKind, c69Var, c69Var2, sessionContext, str5, connectionStatus, workerStatus, list, str6, str7, postTurnSummary, str8, sessionExternalMetadata, z, list2, str9, str10, str11, vnfVar);
    }

    private SessionResource(String str, String str2, String str3, SessionStatus sessionStatus, String str4, EnvironmentKind environmentKind, c69 c69Var, c69 c69Var2, SessionContext sessionContext, String str5, ConnectionStatus connectionStatus, WorkerStatus workerStatus, List<ClientPresenceInfo> list, String str6, String str7, PostTurnSummary postTurnSummary, String str8, SessionExternalMetadata sessionExternalMetadata, boolean z, List<String> list2, String str9, String str10, String str11) {
        str.getClass();
        str2.getClass();
        sessionStatus.getClass();
        str4.getClass();
        c69Var.getClass();
        c69Var2.getClass();
        sessionContext.getClass();
        this.type = str;
        this.id = str2;
        this.title = str3;
        this.session_status = sessionStatus;
        this.environment_id = str4;
        this.environment_kind = environmentKind;
        this.created_at = c69Var;
        this.updated_at = c69Var2;
        this.session_context = sessionContext;
        this.bridge_spawn_path = str5;
        this.connection_status = connectionStatus;
        this.worker_status = workerStatus;
        this.client_presence = list;
        this.trigger_id = str6;
        this.origin = str7;
        this.post_turn_summary = postTurnSummary;
        this.task_summary = str8;
        this.external_metadata = sessionExternalMetadata;
        this.unread = z;
        this.tags = list2;
        this.self_hosted_runner_pool_id = str9;
        this.agent_id = str10;
        this.started_by_account_id = str11;
    }

    public /* synthetic */ SessionResource(String str, String str2, String str3, SessionStatus sessionStatus, String str4, EnvironmentKind environmentKind, c69 c69Var, c69 c69Var2, SessionContext sessionContext, String str5, ConnectionStatus connectionStatus, WorkerStatus workerStatus, List list, String str6, String str7, PostTurnSummary postTurnSummary, String str8, SessionExternalMetadata sessionExternalMetadata, boolean z, List list2, String str9, String str10, String str11, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, sessionStatus, str4, (i & 32) != 0 ? null : environmentKind, c69Var, c69Var2, sessionContext, (i & 512) != 0 ? null : str5, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : connectionStatus, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : workerStatus, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : list, (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : str6, (i & 16384) != 0 ? null : str7, (32768 & i) != 0 ? null : postTurnSummary, (65536 & i) != 0 ? null : str8, (131072 & i) != 0 ? null : sessionExternalMetadata, (262144 & i) != 0 ? false : z, (524288 & i) != 0 ? null : list2, (1048576 & i) != 0 ? null : str9, (2097152 & i) != 0 ? null : str10, (i & 4194304) != 0 ? null : str11, null);
    }
}
