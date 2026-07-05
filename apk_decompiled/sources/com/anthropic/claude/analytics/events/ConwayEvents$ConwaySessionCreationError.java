package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.uu4;
import defpackage.vnf;
import defpackage.vu4;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0014\u0010$\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0016¨\u0006("}, d2 = {"com/anthropic/claude/analytics/events/ConwayEvents$ConwaySessionCreationError", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "error_message", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ConwayEvents$ConwaySessionCreationError;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ConwayEvents$ConwaySessionCreationError;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ConwayEvents$ConwaySessionCreationError;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError_message", "getEventName", "eventName", "Companion", "uu4", "vu4", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ConwayEvents$ConwaySessionCreationError implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final vu4 Companion = new vu4();
    private final String error_message;

    public /* synthetic */ ConwayEvents$ConwaySessionCreationError(int i, String str, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.error_message = str;
        } else {
            gvj.f(i, 1, uu4.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ ConwayEvents$ConwaySessionCreationError copy$default(ConwayEvents$ConwaySessionCreationError conwayEvents$ConwaySessionCreationError, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conwayEvents$ConwaySessionCreationError.error_message;
        }
        return conwayEvents$ConwaySessionCreationError.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getError_message() {
        return this.error_message;
    }

    public final ConwayEvents$ConwaySessionCreationError copy(String error_message) {
        error_message.getClass();
        return new ConwayEvents$ConwaySessionCreationError(error_message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConwayEvents$ConwaySessionCreationError) && x44.r(this.error_message, ((ConwayEvents$ConwaySessionCreationError) other).error_message);
    }

    public final String getError_message() {
        return this.error_message;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "conway_session_creation_error";
    }

    public int hashCode() {
        return this.error_message.hashCode();
    }

    public String toString() {
        return ij0.j("ConwaySessionCreationError(error_message=", this.error_message, ")");
    }

    public ConwayEvents$ConwaySessionCreationError(String str) {
        str.getClass();
        this.error_message = str;
    }
}
