package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.h48;
import defpackage.i48;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/sessions/types/GetSessionV2Response;", "", "Lcom/anthropic/claude/sessions/types/SessionResourceV2;", "session", "<init>", "(Lcom/anthropic/claude/sessions/types/SessionResourceV2;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/sessions/types/SessionResourceV2;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/GetSessionV2Response;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/sessions/types/SessionResourceV2;", "copy", "(Lcom/anthropic/claude/sessions/types/SessionResourceV2;)Lcom/anthropic/claude/sessions/types/GetSessionV2Response;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/sessions/types/SessionResourceV2;", "getSession", "getSession$annotations", "()V", "Companion", "h48", "i48", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GetSessionV2Response {
    public static final i48 Companion = new i48();
    private final SessionResourceV2 session;

    public /* synthetic */ GetSessionV2Response(int i, SessionResourceV2 sessionResourceV2, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.session = sessionResourceV2;
        } else {
            gvj.f(i, 1, h48.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ GetSessionV2Response copy$default(GetSessionV2Response getSessionV2Response, SessionResourceV2 sessionResourceV2, int i, Object obj) {
        if ((i & 1) != 0) {
            sessionResourceV2 = getSessionV2Response.session;
        }
        return getSessionV2Response.copy(sessionResourceV2);
    }

    public static /* synthetic */ void getSession$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SessionResourceV2 getSession() {
        return this.session;
    }

    public final GetSessionV2Response copy(SessionResourceV2 session) {
        session.getClass();
        return new GetSessionV2Response(session);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetSessionV2Response) && x44.r(this.session, ((GetSessionV2Response) other).session);
    }

    public final SessionResourceV2 getSession() {
        return this.session;
    }

    public int hashCode() {
        return this.session.hashCode();
    }

    public String toString() {
        return "GetSessionV2Response(session=" + this.session + ")";
    }

    public GetSessionV2Response(SessionResourceV2 sessionResourceV2) {
        sessionResourceV2.getClass();
        this.session = sessionResourceV2;
    }
}
