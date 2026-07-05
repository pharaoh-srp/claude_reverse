package com.anthropic.claude.sessions.types;

import com.anthropic.claude.types.strings.SessionId;
import defpackage.bsg;
import defpackage.c48;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.isg;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0003,-.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u0011\u0010*\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001e¨\u0006/"}, d2 = {"Lcom/anthropic/claude/sessions/types/GetOrCreateDispatchSessionResponse;", "", "Lcom/anthropic/claude/sessions/types/GetOrCreateDispatchSessionResponse$DispatchSessionRef;", "session", "", "created", "<init>", "(Lcom/anthropic/claude/sessions/types/GetOrCreateDispatchSessionResponse$DispatchSessionRef;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/sessions/types/GetOrCreateDispatchSessionResponse$DispatchSessionRef;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/GetOrCreateDispatchSessionResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/sessions/types/GetOrCreateDispatchSessionResponse$DispatchSessionRef;", "component2", "()Z", "copy", "(Lcom/anthropic/claude/sessions/types/GetOrCreateDispatchSessionResponse$DispatchSessionRef;Z)Lcom/anthropic/claude/sessions/types/GetOrCreateDispatchSessionResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/sessions/types/GetOrCreateDispatchSessionResponse$DispatchSessionRef;", "getSession", "Z", "getCreated", "Lcom/anthropic/claude/types/strings/SessionId;", "getSessionId-Ocx55TE", "sessionId", "Companion", "DispatchSessionRef", "com/anthropic/claude/sessions/types/k0", "c48", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GetOrCreateDispatchSessionResponse {
    public static final c48 Companion = new c48();
    private final boolean created;
    private final DispatchSessionRef session;

    public /* synthetic */ GetOrCreateDispatchSessionResponse(int i, DispatchSessionRef dispatchSessionRef, boolean z, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, k0.a.getDescriptor());
            throw null;
        }
        this.session = dispatchSessionRef;
        this.created = z;
    }

    public static /* synthetic */ GetOrCreateDispatchSessionResponse copy$default(GetOrCreateDispatchSessionResponse getOrCreateDispatchSessionResponse, DispatchSessionRef dispatchSessionRef, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dispatchSessionRef = getOrCreateDispatchSessionResponse.session;
        }
        if ((i & 2) != 0) {
            z = getOrCreateDispatchSessionResponse.created;
        }
        return getOrCreateDispatchSessionResponse.copy(dispatchSessionRef, z);
    }

    public static final /* synthetic */ void write$Self$sessions(GetOrCreateDispatchSessionResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, l0.a, self.session);
        output.p(serialDesc, 1, self.created);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DispatchSessionRef getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCreated() {
        return this.created;
    }

    public final GetOrCreateDispatchSessionResponse copy(DispatchSessionRef session, boolean created) {
        session.getClass();
        return new GetOrCreateDispatchSessionResponse(session, created);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetOrCreateDispatchSessionResponse)) {
            return false;
        }
        GetOrCreateDispatchSessionResponse getOrCreateDispatchSessionResponse = (GetOrCreateDispatchSessionResponse) other;
        return x44.r(this.session, getOrCreateDispatchSessionResponse.session) && this.created == getOrCreateDispatchSessionResponse.created;
    }

    public final boolean getCreated() {
        return this.created;
    }

    public final DispatchSessionRef getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: getSessionId-Ocx55TE, reason: not valid java name */
    public final String m851getSessionIdOcx55TE() {
        String strM855getIdOcx55TE = this.session.m855getIdOcx55TE();
        if (!isg.q0(strM855getIdOcx55TE, "cse_", false)) {
            strM855getIdOcx55TE = null;
        }
        return strM855getIdOcx55TE != null ? SessionId.m1115constructorimpl("session_".concat(bsg.R0(strM855getIdOcx55TE, "cse_"))) : this.session.m855getIdOcx55TE();
    }

    public int hashCode() {
        return Boolean.hashCode(this.created) + (this.session.hashCode() * 31);
    }

    public String toString() {
        return "GetOrCreateDispatchSessionResponse(session=" + this.session + ", created=" + this.created + ")";
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/sessions/types/GetOrCreateDispatchSessionResponse$DispatchSessionRef;", "", "Lcom/anthropic/claude/types/strings/SessionId;", "id", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/GetOrCreateDispatchSessionResponse$DispatchSessionRef;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-Ocx55TE", "()Ljava/lang/String;", "component1", "copy-45aRAwg", "(Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/GetOrCreateDispatchSessionResponse$DispatchSessionRef;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId-Ocx55TE", "Companion", "com/anthropic/claude/sessions/types/l0", "com/anthropic/claude/sessions/types/m0", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class DispatchSessionRef {
        public static final m0 Companion = new m0();
        private final String id;

        private /* synthetic */ DispatchSessionRef(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.id = str;
            } else {
                gvj.f(i, 1, l0.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-45aRAwg$default, reason: not valid java name */
        public static /* synthetic */ DispatchSessionRef m852copy45aRAwg$default(DispatchSessionRef dispatchSessionRef, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dispatchSessionRef.id;
            }
            return dispatchSessionRef.m854copy45aRAwg(str);
        }

        /* JADX INFO: renamed from: component1-Ocx55TE, reason: not valid java name and from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: copy-45aRAwg, reason: not valid java name */
        public final DispatchSessionRef m854copy45aRAwg(String id) {
            id.getClass();
            return new DispatchSessionRef(id, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DispatchSessionRef) && SessionId.m1117equalsimpl0(this.id, ((DispatchSessionRef) other).id);
        }

        /* JADX INFO: renamed from: getId-Ocx55TE, reason: not valid java name */
        public final String m855getIdOcx55TE() {
            return this.id;
        }

        public int hashCode() {
            return SessionId.m1118hashCodeimpl(this.id);
        }

        public String toString() {
            return ij0.j("DispatchSessionRef(id=", SessionId.m1119toStringimpl(this.id), ")");
        }

        public /* synthetic */ DispatchSessionRef(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ DispatchSessionRef(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private DispatchSessionRef(String str) {
            str.getClass();
            this.id = str;
        }
    }

    public GetOrCreateDispatchSessionResponse(DispatchSessionRef dispatchSessionRef, boolean z) {
        dispatchSessionRef.getClass();
        this.session = dispatchSessionRef;
        this.created = z;
    }
}
