package com.anthropic.claude.api.tasks;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qy1;
import defpackage.ulf;
import defpackage.vlf;
import defpackage.vnf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/api/tasks/SendTaskMessageResponse;", "", "", "ok", "<init>", "(Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/tasks/SendTaskMessageResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "copy", "(Z)Lcom/anthropic/claude/api/tasks/SendTaskMessageResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getOk", "Companion", "ulf", "vlf", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SendTaskMessageResponse {
    public static final int $stable = 0;
    public static final vlf Companion = new vlf();
    private final boolean ok;

    public /* synthetic */ SendTaskMessageResponse(int i, boolean z, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.ok = z;
        } else {
            gvj.f(i, 1, ulf.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ SendTaskMessageResponse copy$default(SendTaskMessageResponse sendTaskMessageResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sendTaskMessageResponse.ok;
        }
        return sendTaskMessageResponse.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getOk() {
        return this.ok;
    }

    public final SendTaskMessageResponse copy(boolean ok) {
        return new SendTaskMessageResponse(ok);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SendTaskMessageResponse) && this.ok == ((SendTaskMessageResponse) other).ok;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public int hashCode() {
        return Boolean.hashCode(this.ok);
    }

    public String toString() {
        return qy1.g("SendTaskMessageResponse(ok=", ")", this.ok);
    }

    public SendTaskMessageResponse(boolean z) {
        this.ok = z;
    }
}
