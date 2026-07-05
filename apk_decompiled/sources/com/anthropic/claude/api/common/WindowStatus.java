package com.anthropic.claude.api.common;

import defpackage.fej;
import defpackage.fl5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.na6;
import defpackage.onf;
import defpackage.qdj;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u001e¨\u00068"}, d2 = {"Lcom/anthropic/claude/api/common/WindowStatus;", "", "Lcom/anthropic/claude/api/common/WindowLimitStatus;", "status", "Ljava/util/Date;", "resetsAt", "", "utilization", "surpassedThreshold", "<init>", "(Lcom/anthropic/claude/api/common/WindowLimitStatus;Ljava/util/Date;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/common/WindowLimitStatus;Ljava/util/Date;Ljava/lang/Double;Ljava/lang/Double;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_api_result", "(Lcom/anthropic/claude/api/common/WindowStatus;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/common/WindowLimitStatus;", "component2", "()Ljava/util/Date;", "component3", "()Ljava/lang/Double;", "component4", "copy", "(Lcom/anthropic/claude/api/common/WindowLimitStatus;Ljava/util/Date;Ljava/lang/Double;Ljava/lang/Double;)Lcom/anthropic/claude/api/common/WindowStatus;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/common/WindowLimitStatus;", "getStatus", "Ljava/util/Date;", "getResetsAt", "getResetsAt$annotations", "()V", "Ljava/lang/Double;", "getUtilization", "getSurpassedThreshold", "getSurpassedThreshold$annotations", "Companion", "eej", "fej", "Claude.api:result"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class WindowStatus {
    public static final fej Companion = new fej();
    private final Date resetsAt;
    private final WindowLimitStatus status;
    private final Double surpassedThreshold;
    private final Double utilization;

    public /* synthetic */ WindowStatus(int i, WindowLimitStatus windowLimitStatus, Date date, Double d, Double d2, vnf vnfVar) {
        this.status = (i & 1) == 0 ? WindowLimitStatus.UNKNOWN : windowLimitStatus;
        if ((i & 2) == 0) {
            this.resetsAt = null;
        } else {
            this.resetsAt = date;
        }
        if ((i & 4) == 0) {
            this.utilization = null;
        } else {
            this.utilization = d;
        }
        if ((i & 8) == 0) {
            this.surpassedThreshold = null;
        } else {
            this.surpassedThreshold = d2;
        }
    }

    public static /* synthetic */ WindowStatus copy$default(WindowStatus windowStatus, WindowLimitStatus windowLimitStatus, Date date, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            windowLimitStatus = windowStatus.status;
        }
        if ((i & 2) != 0) {
            date = windowStatus.resetsAt;
        }
        if ((i & 4) != 0) {
            d = windowStatus.utilization;
        }
        if ((i & 8) != 0) {
            d2 = windowStatus.surpassedThreshold;
        }
        return windowStatus.copy(windowLimitStatus, date, d, d2);
    }

    @onf(with = fl5.class)
    public static /* synthetic */ void getResetsAt$annotations() {
    }

    public static /* synthetic */ void getSurpassedThreshold$annotations() {
    }

    public static final /* synthetic */ void write$Self$Claude_api_result(WindowStatus self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.status != WindowLimitStatus.UNKNOWN) {
            output.r(serialDesc, 0, qdj.d, self.status);
        }
        if (output.E(serialDesc) || self.resetsAt != null) {
            output.B(serialDesc, 1, fl5.a, self.resetsAt);
        }
        if (output.E(serialDesc) || self.utilization != null) {
            output.B(serialDesc, 2, na6.a, self.utilization);
        }
        if (!output.E(serialDesc) && self.surpassedThreshold == null) {
            return;
        }
        output.B(serialDesc, 3, na6.a, self.surpassedThreshold);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WindowLimitStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getResetsAt() {
        return this.resetsAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getUtilization() {
        return this.utilization;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getSurpassedThreshold() {
        return this.surpassedThreshold;
    }

    public final WindowStatus copy(WindowLimitStatus status, Date resetsAt, Double utilization, Double surpassedThreshold) {
        status.getClass();
        return new WindowStatus(status, resetsAt, utilization, surpassedThreshold);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WindowStatus)) {
            return false;
        }
        WindowStatus windowStatus = (WindowStatus) other;
        return this.status == windowStatus.status && x44.r(this.resetsAt, windowStatus.resetsAt) && x44.r(this.utilization, windowStatus.utilization) && x44.r(this.surpassedThreshold, windowStatus.surpassedThreshold);
    }

    public final Date getResetsAt() {
        return this.resetsAt;
    }

    public final WindowLimitStatus getStatus() {
        return this.status;
    }

    public final Double getSurpassedThreshold() {
        return this.surpassedThreshold;
    }

    public final Double getUtilization() {
        return this.utilization;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        Date date = this.resetsAt;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Double d = this.utilization;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.surpassedThreshold;
        return iHashCode3 + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        return "WindowStatus(status=" + this.status + ", resetsAt=" + this.resetsAt + ", utilization=" + this.utilization + ", surpassedThreshold=" + this.surpassedThreshold + ")";
    }

    public WindowStatus() {
        this((WindowLimitStatus) null, (Date) null, (Double) null, (Double) null, 15, (mq5) null);
    }

    public WindowStatus(WindowLimitStatus windowLimitStatus, Date date, Double d, Double d2) {
        windowLimitStatus.getClass();
        this.status = windowLimitStatus;
        this.resetsAt = date;
        this.utilization = d;
        this.surpassedThreshold = d2;
    }

    public /* synthetic */ WindowStatus(WindowLimitStatus windowLimitStatus, Date date, Double d, Double d2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? WindowLimitStatus.UNKNOWN : windowLimitStatus, (i & 2) != 0 ? null : date, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2);
    }
}
