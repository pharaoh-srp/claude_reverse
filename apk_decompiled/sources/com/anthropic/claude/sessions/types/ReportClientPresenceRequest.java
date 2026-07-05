package com.anthropic.claude.sessions.types;

import defpackage.aie;
import defpackage.bie;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0019¨\u0006)"}, d2 = {"Lcom/anthropic/claude/sessions/types/ReportClientPresenceRequest;", "", "", "client_id", "", "clear", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ReportClientPresenceRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/anthropic/claude/sessions/types/ReportClientPresenceRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClient_id", "Z", "getClear", "Companion", "aie", "bie", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ReportClientPresenceRequest {
    public static final bie Companion = new bie();
    private final boolean clear;
    private final String client_id;

    public /* synthetic */ ReportClientPresenceRequest(int i, String str, boolean z, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, aie.a.getDescriptor());
            throw null;
        }
        this.client_id = str;
        if ((i & 2) == 0) {
            this.clear = false;
        } else {
            this.clear = z;
        }
    }

    public static /* synthetic */ ReportClientPresenceRequest copy$default(ReportClientPresenceRequest reportClientPresenceRequest, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reportClientPresenceRequest.client_id;
        }
        if ((i & 2) != 0) {
            z = reportClientPresenceRequest.clear;
        }
        return reportClientPresenceRequest.copy(str, z);
    }

    public static final /* synthetic */ void write$Self$sessions(ReportClientPresenceRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.client_id);
        if (output.E(serialDesc) || self.clear) {
            output.p(serialDesc, 1, self.clear);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClient_id() {
        return this.client_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getClear() {
        return this.clear;
    }

    public final ReportClientPresenceRequest copy(String client_id, boolean clear) {
        client_id.getClass();
        return new ReportClientPresenceRequest(client_id, clear);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportClientPresenceRequest)) {
            return false;
        }
        ReportClientPresenceRequest reportClientPresenceRequest = (ReportClientPresenceRequest) other;
        return x44.r(this.client_id, reportClientPresenceRequest.client_id) && this.clear == reportClientPresenceRequest.clear;
    }

    public final boolean getClear() {
        return this.clear;
    }

    public final String getClient_id() {
        return this.client_id;
    }

    public int hashCode() {
        return Boolean.hashCode(this.clear) + (this.client_id.hashCode() * 31);
    }

    public String toString() {
        return "ReportClientPresenceRequest(client_id=" + this.client_id + ", clear=" + this.clear + ")";
    }

    public ReportClientPresenceRequest(String str, boolean z) {
        str.getClass();
        this.client_id = str;
        this.clear = z;
    }

    public /* synthetic */ ReportClientPresenceRequest(String str, boolean z, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
