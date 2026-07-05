package com.anthropic.claude.sessions.types;

import com.anthropic.claude.types.strings.SessionId;
import defpackage.bsg;
import defpackage.g65;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.isg;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0003'()B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015R\u0011\u0010%\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001a¨\u0006*"}, d2 = {"Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionResponse;", "", "Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionResponse$CoworkRemoteSessionRef;", "session", "<init>", "(Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionResponse$CoworkRemoteSessionRef;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionResponse$CoworkRemoteSessionRef;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionResponse$CoworkRemoteSessionRef;", "copy", "(Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionResponse$CoworkRemoteSessionRef;)Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionResponse$CoworkRemoteSessionRef;", "getSession", "Lcom/anthropic/claude/types/strings/SessionId;", "getSessionId-Ocx55TE", "sessionId", "Companion", "CoworkRemoteSessionRef", "com/anthropic/claude/sessions/types/a0", "g65", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreateCoworkRemoteSessionResponse {
    public static final g65 Companion = new g65();
    private final CoworkRemoteSessionRef session;

    public /* synthetic */ CreateCoworkRemoteSessionResponse(int i, CoworkRemoteSessionRef coworkRemoteSessionRef, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.session = coworkRemoteSessionRef;
        } else {
            gvj.f(i, 1, a0.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ CreateCoworkRemoteSessionResponse copy$default(CreateCoworkRemoteSessionResponse createCoworkRemoteSessionResponse, CoworkRemoteSessionRef coworkRemoteSessionRef, int i, Object obj) {
        if ((i & 1) != 0) {
            coworkRemoteSessionRef = createCoworkRemoteSessionResponse.session;
        }
        return createCoworkRemoteSessionResponse.copy(coworkRemoteSessionRef);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CoworkRemoteSessionRef getSession() {
        return this.session;
    }

    public final CreateCoworkRemoteSessionResponse copy(CoworkRemoteSessionRef session) {
        session.getClass();
        return new CreateCoworkRemoteSessionResponse(session);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateCoworkRemoteSessionResponse) && x44.r(this.session, ((CreateCoworkRemoteSessionResponse) other).session);
    }

    public final CoworkRemoteSessionRef getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: getSessionId-Ocx55TE, reason: not valid java name */
    public final String m834getSessionIdOcx55TE() {
        String strM838getIdOcx55TE = this.session.m838getIdOcx55TE();
        if (!isg.q0(strM838getIdOcx55TE, "cse_", false)) {
            strM838getIdOcx55TE = null;
        }
        return strM838getIdOcx55TE != null ? SessionId.m1115constructorimpl("session_".concat(bsg.R0(strM838getIdOcx55TE, "cse_"))) : this.session.m838getIdOcx55TE();
    }

    public int hashCode() {
        return this.session.hashCode();
    }

    public String toString() {
        return "CreateCoworkRemoteSessionResponse(session=" + this.session + ")";
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionResponse$CoworkRemoteSessionRef;", "", "Lcom/anthropic/claude/types/strings/SessionId;", "id", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionResponse$CoworkRemoteSessionRef;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-Ocx55TE", "()Ljava/lang/String;", "component1", "copy-45aRAwg", "(Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionResponse$CoworkRemoteSessionRef;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId-Ocx55TE", "Companion", "com/anthropic/claude/sessions/types/b0", "com/anthropic/claude/sessions/types/c0", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class CoworkRemoteSessionRef {
        public static final c0 Companion = new c0();
        private final String id;

        private /* synthetic */ CoworkRemoteSessionRef(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.id = str;
            } else {
                gvj.f(i, 1, b0.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-45aRAwg$default, reason: not valid java name */
        public static /* synthetic */ CoworkRemoteSessionRef m835copy45aRAwg$default(CoworkRemoteSessionRef coworkRemoteSessionRef, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = coworkRemoteSessionRef.id;
            }
            return coworkRemoteSessionRef.m837copy45aRAwg(str);
        }

        /* JADX INFO: renamed from: component1-Ocx55TE, reason: not valid java name and from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: copy-45aRAwg, reason: not valid java name */
        public final CoworkRemoteSessionRef m837copy45aRAwg(String id) {
            id.getClass();
            return new CoworkRemoteSessionRef(id, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CoworkRemoteSessionRef) && SessionId.m1117equalsimpl0(this.id, ((CoworkRemoteSessionRef) other).id);
        }

        /* JADX INFO: renamed from: getId-Ocx55TE, reason: not valid java name */
        public final String m838getIdOcx55TE() {
            return this.id;
        }

        public int hashCode() {
            return SessionId.m1118hashCodeimpl(this.id);
        }

        public String toString() {
            return ij0.j("CoworkRemoteSessionRef(id=", SessionId.m1119toStringimpl(this.id), ")");
        }

        public /* synthetic */ CoworkRemoteSessionRef(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ CoworkRemoteSessionRef(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private CoworkRemoteSessionRef(String str) {
            str.getClass();
            this.id = str;
        }
    }

    public CreateCoworkRemoteSessionResponse(CoworkRemoteSessionRef coworkRemoteSessionRef) {
        coworkRemoteSessionRef.getClass();
        this.session = coworkRemoteSessionRef;
    }
}
