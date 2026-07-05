package com.anthropic.claude.tool.model;

import defpackage.gj8;
import defpackage.gvj;
import defpackage.hj8;
import defpackage.jj8;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pj8;
import defpackage.rj8;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J>\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00066"}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItem;", "", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregation;", "aggregation", "", "identifier", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemRecords;", "records", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemTimeRange;", "time_range", "<init>", "(Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregation;Ljava/lang/String;Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemRecords;Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemTimeRange;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregation;Ljava/lang/String;Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemRecords;Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemTimeRange;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregation;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemRecords;", "component4", "()Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemTimeRange;", "copy", "(Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregation;Ljava/lang/String;Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemRecords;Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemTimeRange;)Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregation;", "getAggregation", "Ljava/lang/String;", "getIdentifier", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemRecords;", "getRecords", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemTimeRange;", "getTime_range", "Companion", "gj8", "hj8", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectQueryV0InputQueriesItem {
    public static final hj8 Companion = new hj8();
    private final HealthConnectQueryV0InputQueriesItemAggregation aggregation;
    private final String identifier;
    private final HealthConnectQueryV0InputQueriesItemRecords records;
    private final HealthConnectQueryV0InputQueriesItemTimeRange time_range;

    public /* synthetic */ HealthConnectQueryV0InputQueriesItem(int i, HealthConnectQueryV0InputQueriesItemAggregation healthConnectQueryV0InputQueriesItemAggregation, String str, HealthConnectQueryV0InputQueriesItemRecords healthConnectQueryV0InputQueriesItemRecords, HealthConnectQueryV0InputQueriesItemTimeRange healthConnectQueryV0InputQueriesItemTimeRange, vnf vnfVar) {
        if (2 != (i & 2)) {
            gvj.f(i, 2, gj8.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.aggregation = null;
        } else {
            this.aggregation = healthConnectQueryV0InputQueriesItemAggregation;
        }
        this.identifier = str;
        if ((i & 4) == 0) {
            this.records = null;
        } else {
            this.records = healthConnectQueryV0InputQueriesItemRecords;
        }
        if ((i & 8) == 0) {
            this.time_range = null;
        } else {
            this.time_range = healthConnectQueryV0InputQueriesItemTimeRange;
        }
    }

    public static /* synthetic */ HealthConnectQueryV0InputQueriesItem copy$default(HealthConnectQueryV0InputQueriesItem healthConnectQueryV0InputQueriesItem, HealthConnectQueryV0InputQueriesItemAggregation healthConnectQueryV0InputQueriesItemAggregation, String str, HealthConnectQueryV0InputQueriesItemRecords healthConnectQueryV0InputQueriesItemRecords, HealthConnectQueryV0InputQueriesItemTimeRange healthConnectQueryV0InputQueriesItemTimeRange, int i, Object obj) {
        if ((i & 1) != 0) {
            healthConnectQueryV0InputQueriesItemAggregation = healthConnectQueryV0InputQueriesItem.aggregation;
        }
        if ((i & 2) != 0) {
            str = healthConnectQueryV0InputQueriesItem.identifier;
        }
        if ((i & 4) != 0) {
            healthConnectQueryV0InputQueriesItemRecords = healthConnectQueryV0InputQueriesItem.records;
        }
        if ((i & 8) != 0) {
            healthConnectQueryV0InputQueriesItemTimeRange = healthConnectQueryV0InputQueriesItem.time_range;
        }
        return healthConnectQueryV0InputQueriesItem.copy(healthConnectQueryV0InputQueriesItemAggregation, str, healthConnectQueryV0InputQueriesItemRecords, healthConnectQueryV0InputQueriesItemTimeRange);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(HealthConnectQueryV0InputQueriesItem self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.aggregation != null) {
            output.B(serialDesc, 0, jj8.a, self.aggregation);
        }
        output.q(serialDesc, 1, self.identifier);
        if (output.E(serialDesc) || self.records != null) {
            output.B(serialDesc, 2, pj8.a, self.records);
        }
        if (!output.E(serialDesc) && self.time_range == null) {
            return;
        }
        output.B(serialDesc, 3, rj8.a, self.time_range);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HealthConnectQueryV0InputQueriesItemAggregation getAggregation() {
        return this.aggregation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HealthConnectQueryV0InputQueriesItemRecords getRecords() {
        return this.records;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HealthConnectQueryV0InputQueriesItemTimeRange getTime_range() {
        return this.time_range;
    }

    public final HealthConnectQueryV0InputQueriesItem copy(HealthConnectQueryV0InputQueriesItemAggregation aggregation, String identifier, HealthConnectQueryV0InputQueriesItemRecords records, HealthConnectQueryV0InputQueriesItemTimeRange time_range) {
        identifier.getClass();
        return new HealthConnectQueryV0InputQueriesItem(aggregation, identifier, records, time_range);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectQueryV0InputQueriesItem)) {
            return false;
        }
        HealthConnectQueryV0InputQueriesItem healthConnectQueryV0InputQueriesItem = (HealthConnectQueryV0InputQueriesItem) other;
        return x44.r(this.aggregation, healthConnectQueryV0InputQueriesItem.aggregation) && x44.r(this.identifier, healthConnectQueryV0InputQueriesItem.identifier) && x44.r(this.records, healthConnectQueryV0InputQueriesItem.records) && x44.r(this.time_range, healthConnectQueryV0InputQueriesItem.time_range);
    }

    public final HealthConnectQueryV0InputQueriesItemAggregation getAggregation() {
        return this.aggregation;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final HealthConnectQueryV0InputQueriesItemRecords getRecords() {
        return this.records;
    }

    public final HealthConnectQueryV0InputQueriesItemTimeRange getTime_range() {
        return this.time_range;
    }

    public int hashCode() {
        HealthConnectQueryV0InputQueriesItemAggregation healthConnectQueryV0InputQueriesItemAggregation = this.aggregation;
        int iL = kgh.l((healthConnectQueryV0InputQueriesItemAggregation == null ? 0 : healthConnectQueryV0InputQueriesItemAggregation.hashCode()) * 31, 31, this.identifier);
        HealthConnectQueryV0InputQueriesItemRecords healthConnectQueryV0InputQueriesItemRecords = this.records;
        int iHashCode = (iL + (healthConnectQueryV0InputQueriesItemRecords == null ? 0 : healthConnectQueryV0InputQueriesItemRecords.hashCode())) * 31;
        HealthConnectQueryV0InputQueriesItemTimeRange healthConnectQueryV0InputQueriesItemTimeRange = this.time_range;
        return iHashCode + (healthConnectQueryV0InputQueriesItemTimeRange != null ? healthConnectQueryV0InputQueriesItemTimeRange.hashCode() : 0);
    }

    public String toString() {
        return "HealthConnectQueryV0InputQueriesItem(aggregation=" + this.aggregation + ", identifier=" + this.identifier + ", records=" + this.records + ", time_range=" + this.time_range + ")";
    }

    public HealthConnectQueryV0InputQueriesItem(HealthConnectQueryV0InputQueriesItemAggregation healthConnectQueryV0InputQueriesItemAggregation, String str, HealthConnectQueryV0InputQueriesItemRecords healthConnectQueryV0InputQueriesItemRecords, HealthConnectQueryV0InputQueriesItemTimeRange healthConnectQueryV0InputQueriesItemTimeRange) {
        str.getClass();
        this.aggregation = healthConnectQueryV0InputQueriesItemAggregation;
        this.identifier = str;
        this.records = healthConnectQueryV0InputQueriesItemRecords;
        this.time_range = healthConnectQueryV0InputQueriesItemTimeRange;
    }

    public /* synthetic */ HealthConnectQueryV0InputQueriesItem(HealthConnectQueryV0InputQueriesItemAggregation healthConnectQueryV0InputQueriesItemAggregation, String str, HealthConnectQueryV0InputQueriesItemRecords healthConnectQueryV0InputQueriesItemRecords, HealthConnectQueryV0InputQueriesItemTimeRange healthConnectQueryV0InputQueriesItemTimeRange, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : healthConnectQueryV0InputQueriesItemAggregation, str, (i & 4) != 0 ? null : healthConnectQueryV0InputQueriesItemRecords, (i & 8) != 0 ? null : healthConnectQueryV0InputQueriesItemTimeRange);
    }
}
