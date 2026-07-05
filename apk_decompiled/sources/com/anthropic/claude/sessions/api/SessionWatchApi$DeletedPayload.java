package com.anthropic.claude.sessions.api;

import com.anthropic.claude.types.strings.SessionId;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.ovf;
import defpackage.vnf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"com/anthropic/claude/sessions/api/SessionWatchApi$DeletedPayload", "", "Lcom/anthropic/claude/types/strings/SessionId;", "id", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "Lcom/anthropic/claude/sessions/api/SessionWatchApi$DeletedPayload;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/api/SessionWatchApi$DeletedPayload;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-Ocx55TE", "()Ljava/lang/String;", "component1", "copy-45aRAwg", "(Ljava/lang/String;)Lcom/anthropic/claude/sessions/api/SessionWatchApi$DeletedPayload;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId-Ocx55TE", "Companion", "com/anthropic/claude/sessions/api/g", "ovf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
final /* data */ class SessionWatchApi$DeletedPayload {
    public static final ovf Companion = new ovf();
    private final String id;

    private /* synthetic */ SessionWatchApi$DeletedPayload(int i, String str, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.id = str;
        } else {
            gvj.f(i, 1, g.a.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: renamed from: copy-45aRAwg$default, reason: not valid java name */
    public static /* synthetic */ SessionWatchApi$DeletedPayload m818copy45aRAwg$default(SessionWatchApi$DeletedPayload sessionWatchApi$DeletedPayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionWatchApi$DeletedPayload.id;
        }
        return sessionWatchApi$DeletedPayload.m820copy45aRAwg(str);
    }

    /* JADX INFO: renamed from: component1-Ocx55TE, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: copy-45aRAwg, reason: not valid java name */
    public final SessionWatchApi$DeletedPayload m820copy45aRAwg(String id) {
        id.getClass();
        return new SessionWatchApi$DeletedPayload(id, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SessionWatchApi$DeletedPayload) && SessionId.m1117equalsimpl0(this.id, ((SessionWatchApi$DeletedPayload) other).id);
    }

    /* JADX INFO: renamed from: getId-Ocx55TE, reason: not valid java name */
    public final String m821getIdOcx55TE() {
        return this.id;
    }

    public int hashCode() {
        return SessionId.m1118hashCodeimpl(this.id);
    }

    public String toString() {
        return ij0.j("DeletedPayload(id=", SessionId.m1119toStringimpl(this.id), ")");
    }

    public /* synthetic */ SessionWatchApi$DeletedPayload(String str, mq5 mq5Var) {
        this(str);
    }

    public /* synthetic */ SessionWatchApi$DeletedPayload(int i, String str, vnf vnfVar, mq5 mq5Var) {
        this(i, str, vnfVar);
    }

    private SessionWatchApi$DeletedPayload(String str) {
        str.getClass();
        this.id = str;
    }
}
