package com.anthropic.claude.tool.model;

import defpackage.ay6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sj8;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,BI\u0012\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\u0004\b\t\u0010\nB/\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJR\u0010\u001c\u001a\u00020\u00002\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R.\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u001aR.\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemTimeRange;", "", "Ljava/time/OffsetDateTime;", "Lcom/anthropic/claude/tool/model/EventDateTime;", "Lonf;", "with", "Lay6;", "end_time", "start_time", "<init>", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemTimeRange;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/time/OffsetDateTime;", "component2", "copy", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemTimeRange;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/OffsetDateTime;", "getEnd_time", "getStart_time", "Companion", "rj8", "sj8", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectQueryV0InputQueriesItemTimeRange {
    public static final sj8 Companion = new sj8();
    private final OffsetDateTime end_time;
    private final OffsetDateTime start_time;

    public /* synthetic */ HealthConnectQueryV0InputQueriesItemTimeRange(int i, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.end_time = null;
        } else {
            this.end_time = offsetDateTime;
        }
        if ((i & 2) == 0) {
            this.start_time = null;
        } else {
            this.start_time = offsetDateTime2;
        }
    }

    public static /* synthetic */ HealthConnectQueryV0InputQueriesItemTimeRange copy$default(HealthConnectQueryV0InputQueriesItemTimeRange healthConnectQueryV0InputQueriesItemTimeRange, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            offsetDateTime = healthConnectQueryV0InputQueriesItemTimeRange.end_time;
        }
        if ((i & 2) != 0) {
            offsetDateTime2 = healthConnectQueryV0InputQueriesItemTimeRange.start_time;
        }
        return healthConnectQueryV0InputQueriesItemTimeRange.copy(offsetDateTime, offsetDateTime2);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(HealthConnectQueryV0InputQueriesItemTimeRange self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.end_time != null) {
            output.B(serialDesc, 0, ay6.a, self.end_time);
        }
        if (!output.E(serialDesc) && self.start_time == null) {
            return;
        }
        output.B(serialDesc, 1, ay6.a, self.start_time);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OffsetDateTime getEnd_time() {
        return this.end_time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    public final HealthConnectQueryV0InputQueriesItemTimeRange copy(OffsetDateTime end_time, OffsetDateTime start_time) {
        return new HealthConnectQueryV0InputQueriesItemTimeRange(end_time, start_time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectQueryV0InputQueriesItemTimeRange)) {
            return false;
        }
        HealthConnectQueryV0InputQueriesItemTimeRange healthConnectQueryV0InputQueriesItemTimeRange = (HealthConnectQueryV0InputQueriesItemTimeRange) other;
        return x44.r(this.end_time, healthConnectQueryV0InputQueriesItemTimeRange.end_time) && x44.r(this.start_time, healthConnectQueryV0InputQueriesItemTimeRange.start_time);
    }

    public final OffsetDateTime getEnd_time() {
        return this.end_time;
    }

    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    public int hashCode() {
        OffsetDateTime offsetDateTime = this.end_time;
        int iHashCode = (offsetDateTime == null ? 0 : offsetDateTime.hashCode()) * 31;
        OffsetDateTime offsetDateTime2 = this.start_time;
        return iHashCode + (offsetDateTime2 != null ? offsetDateTime2.hashCode() : 0);
    }

    public String toString() {
        return "HealthConnectQueryV0InputQueriesItemTimeRange(end_time=" + this.end_time + ", start_time=" + this.start_time + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthConnectQueryV0InputQueriesItemTimeRange() {
        this((OffsetDateTime) null, (OffsetDateTime) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public HealthConnectQueryV0InputQueriesItemTimeRange(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        this.end_time = offsetDateTime;
        this.start_time = offsetDateTime2;
    }

    public /* synthetic */ HealthConnectQueryV0InputQueriesItemTimeRange(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : offsetDateTime, (i & 2) != 0 ? null : offsetDateTime2);
    }
}
