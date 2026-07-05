package com.anthropic.claude.api.usage;

import defpackage.bc9;
import defpackage.cmi;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.na6;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B4\u0012\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB/\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010\u001e\u001a\u00020\u00002\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R.\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/api/usage/UsageWindow;", "", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "resets_at", "", "utilization", "<init>", "(Ljava/util/Date;Ljava/lang/Double;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Date;Ljava/lang/Double;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/usage/UsageWindow;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Date;", "component2", "()Ljava/lang/Double;", "copy", "(Ljava/util/Date;Ljava/lang/Double;)Lcom/anthropic/claude/api/usage/UsageWindow;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Date;", "getResets_at", "Ljava/lang/Double;", "getUtilization", "Companion", "bmi", "cmi", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UsageWindow {
    public static final int $stable = 0;
    public static final cmi Companion = new cmi();
    private final Date resets_at;
    private final Double utilization;

    public /* synthetic */ UsageWindow(int i, Date date, Double d, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.resets_at = null;
        } else {
            this.resets_at = date;
        }
        if ((i & 2) == 0) {
            this.utilization = null;
        } else {
            this.utilization = d;
        }
    }

    public static /* synthetic */ UsageWindow copy$default(UsageWindow usageWindow, Date date, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            date = usageWindow.resets_at;
        }
        if ((i & 2) != 0) {
            d = usageWindow.utilization;
        }
        return usageWindow.copy(date, d);
    }

    public static final /* synthetic */ void write$Self$api(UsageWindow self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.resets_at != null) {
            output.B(serialDesc, 0, bc9.a, self.resets_at);
        }
        if (!output.E(serialDesc) && self.utilization == null) {
            return;
        }
        output.B(serialDesc, 1, na6.a, self.utilization);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getResets_at() {
        return this.resets_at;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getUtilization() {
        return this.utilization;
    }

    public final UsageWindow copy(Date resets_at, Double utilization) {
        return new UsageWindow(resets_at, utilization);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsageWindow)) {
            return false;
        }
        UsageWindow usageWindow = (UsageWindow) other;
        return x44.r(this.resets_at, usageWindow.resets_at) && x44.r(this.utilization, usageWindow.utilization);
    }

    public final Date getResets_at() {
        return this.resets_at;
    }

    public final Double getUtilization() {
        return this.utilization;
    }

    public int hashCode() {
        Date date = this.resets_at;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Double d = this.utilization;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        return "UsageWindow(resets_at=" + this.resets_at + ", utilization=" + this.utilization + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UsageWindow() {
        this((Date) null, (Double) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public UsageWindow(Date date, Double d) {
        this.resets_at = date;
        this.utilization = d;
    }

    public /* synthetic */ UsageWindow(Date date, Double d, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : date, (i & 2) != 0 ? null : d);
    }
}
