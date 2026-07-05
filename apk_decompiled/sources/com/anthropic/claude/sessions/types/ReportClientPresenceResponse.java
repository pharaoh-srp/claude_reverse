package com.anthropic.claude.sessions.types;

import defpackage.die;
import defpackage.grc;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006$"}, d2 = {"Lcom/anthropic/claude/sessions/types/ReportClientPresenceResponse;", "", "", "refresh_after_seconds", "<init>", "(I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ReportClientPresenceResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "copy", "(I)Lcom/anthropic/claude/sessions/types/ReportClientPresenceResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRefresh_after_seconds", "Companion", "cie", "die", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ReportClientPresenceResponse {
    public static final die Companion = new die();
    private final int refresh_after_seconds;

    public /* synthetic */ ReportClientPresenceResponse(int i, int i2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.refresh_after_seconds = 0;
        } else {
            this.refresh_after_seconds = i2;
        }
    }

    public static /* synthetic */ ReportClientPresenceResponse copy$default(ReportClientPresenceResponse reportClientPresenceResponse, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = reportClientPresenceResponse.refresh_after_seconds;
        }
        return reportClientPresenceResponse.copy(i);
    }

    public static final /* synthetic */ void write$Self$sessions(ReportClientPresenceResponse self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.refresh_after_seconds == 0) {
            return;
        }
        output.l(0, self.refresh_after_seconds, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRefresh_after_seconds() {
        return this.refresh_after_seconds;
    }

    public final ReportClientPresenceResponse copy(int refresh_after_seconds) {
        return new ReportClientPresenceResponse(refresh_after_seconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReportClientPresenceResponse) && this.refresh_after_seconds == ((ReportClientPresenceResponse) other).refresh_after_seconds;
    }

    public final int getRefresh_after_seconds() {
        return this.refresh_after_seconds;
    }

    public int hashCode() {
        return Integer.hashCode(this.refresh_after_seconds);
    }

    public String toString() {
        return grc.u("ReportClientPresenceResponse(refresh_after_seconds=", this.refresh_after_seconds, ")");
    }

    public ReportClientPresenceResponse(int i) {
        this.refresh_after_seconds = i;
    }

    public ReportClientPresenceResponse() {
        this(0, 1, (mq5) null);
    }

    public /* synthetic */ ReportClientPresenceResponse(int i, int i2, mq5 mq5Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
