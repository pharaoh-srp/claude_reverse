package com.anthropic.claude.sessions.types;

import defpackage.esf;
import defpackage.f85;
import defpackage.g85;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/sessions/types/CreateSessionGroupingRequest;", "", "", "name", "Lcom/anthropic/claude/sessions/types/SessionGroupingVisibility;", "visibility", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionGroupingVisibility;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/sessions/types/SessionGroupingVisibility;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/CreateSessionGroupingRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/sessions/types/SessionGroupingVisibility;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionGroupingVisibility;)Lcom/anthropic/claude/sessions/types/CreateSessionGroupingRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/anthropic/claude/sessions/types/SessionGroupingVisibility;", "getVisibility", "Companion", "f85", "g85", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreateSessionGroupingRequest {
    public static final g85 Companion = new g85();
    private final String name;
    private final SessionGroupingVisibility visibility;

    public /* synthetic */ CreateSessionGroupingRequest(int i, String str, SessionGroupingVisibility sessionGroupingVisibility, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, f85.a.getDescriptor());
            throw null;
        }
        this.name = str;
        this.visibility = sessionGroupingVisibility;
    }

    public static /* synthetic */ CreateSessionGroupingRequest copy$default(CreateSessionGroupingRequest createSessionGroupingRequest, String str, SessionGroupingVisibility sessionGroupingVisibility, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createSessionGroupingRequest.name;
        }
        if ((i & 2) != 0) {
            sessionGroupingVisibility = createSessionGroupingRequest.visibility;
        }
        return createSessionGroupingRequest.copy(str, sessionGroupingVisibility);
    }

    public static final /* synthetic */ void write$Self$sessions(CreateSessionGroupingRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.name);
        output.r(serialDesc, 1, esf.d, self.visibility);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SessionGroupingVisibility getVisibility() {
        return this.visibility;
    }

    public final CreateSessionGroupingRequest copy(String name, SessionGroupingVisibility visibility) {
        name.getClass();
        visibility.getClass();
        return new CreateSessionGroupingRequest(name, visibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateSessionGroupingRequest)) {
            return false;
        }
        CreateSessionGroupingRequest createSessionGroupingRequest = (CreateSessionGroupingRequest) other;
        return x44.r(this.name, createSessionGroupingRequest.name) && this.visibility == createSessionGroupingRequest.visibility;
    }

    public final String getName() {
        return this.name;
    }

    public final SessionGroupingVisibility getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        return this.visibility.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return "CreateSessionGroupingRequest(name=" + this.name + ", visibility=" + this.visibility + ")";
    }

    public CreateSessionGroupingRequest(String str, SessionGroupingVisibility sessionGroupingVisibility) {
        str.getClass();
        sessionGroupingVisibility.getClass();
        this.name = str;
        this.visibility = sessionGroupingVisibility;
    }
}
