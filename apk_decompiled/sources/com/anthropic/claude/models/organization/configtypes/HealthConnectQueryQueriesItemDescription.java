package com.anthropic.claude.models.organization.configtypes;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.ti8;
import defpackage.vd4;
import defpackage.vi8;
import defpackage.vnf;
import defpackage.wi8;
import defpackage.x44;
import defpackage.xi8;
import defpackage.zi8;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JB\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#¨\u00069"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemDescription;", "", "", "description", "Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemAggregationDescription;", "aggregation", "identifier", "Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemRecordsDescription;", "records", "Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemTimeRangeDescription;", "time_range", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemAggregationDescription;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemRecordsDescription;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemTimeRangeDescription;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemAggregationDescription;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemRecordsDescription;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemTimeRangeDescription;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemDescription;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemAggregationDescription;", "component3", "component4", "()Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemRecordsDescription;", "component5", "()Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemTimeRangeDescription;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemAggregationDescription;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemRecordsDescription;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemTimeRangeDescription;)Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemDescription;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemAggregationDescription;", "getAggregation", "getIdentifier", "Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemRecordsDescription;", "getRecords", "Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemTimeRangeDescription;", "getTime_range", "Companion", "vi8", "wi8", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectQueryQueriesItemDescription {
    public static final int $stable = 0;
    public static final wi8 Companion = new wi8();
    private final HealthConnectQueryQueriesItemAggregationDescription aggregation;
    private final String description;
    private final String identifier;
    private final HealthConnectQueryQueriesItemRecordsDescription records;
    private final HealthConnectQueryQueriesItemTimeRangeDescription time_range;

    public /* synthetic */ HealthConnectQueryQueriesItemDescription(int i, String str, HealthConnectQueryQueriesItemAggregationDescription healthConnectQueryQueriesItemAggregationDescription, String str2, HealthConnectQueryQueriesItemRecordsDescription healthConnectQueryQueriesItemRecordsDescription, HealthConnectQueryQueriesItemTimeRangeDescription healthConnectQueryQueriesItemTimeRangeDescription, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, vi8.a.getDescriptor());
            throw null;
        }
        this.description = str;
        this.aggregation = healthConnectQueryQueriesItemAggregationDescription;
        this.identifier = str2;
        this.records = healthConnectQueryQueriesItemRecordsDescription;
        this.time_range = healthConnectQueryQueriesItemTimeRangeDescription;
    }

    public static /* synthetic */ HealthConnectQueryQueriesItemDescription copy$default(HealthConnectQueryQueriesItemDescription healthConnectQueryQueriesItemDescription, String str, HealthConnectQueryQueriesItemAggregationDescription healthConnectQueryQueriesItemAggregationDescription, String str2, HealthConnectQueryQueriesItemRecordsDescription healthConnectQueryQueriesItemRecordsDescription, HealthConnectQueryQueriesItemTimeRangeDescription healthConnectQueryQueriesItemTimeRangeDescription, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthConnectQueryQueriesItemDescription.description;
        }
        if ((i & 2) != 0) {
            healthConnectQueryQueriesItemAggregationDescription = healthConnectQueryQueriesItemDescription.aggregation;
        }
        if ((i & 4) != 0) {
            str2 = healthConnectQueryQueriesItemDescription.identifier;
        }
        if ((i & 8) != 0) {
            healthConnectQueryQueriesItemRecordsDescription = healthConnectQueryQueriesItemDescription.records;
        }
        if ((i & 16) != 0) {
            healthConnectQueryQueriesItemTimeRangeDescription = healthConnectQueryQueriesItemDescription.time_range;
        }
        HealthConnectQueryQueriesItemTimeRangeDescription healthConnectQueryQueriesItemTimeRangeDescription2 = healthConnectQueryQueriesItemTimeRangeDescription;
        String str3 = str2;
        return healthConnectQueryQueriesItemDescription.copy(str, healthConnectQueryQueriesItemAggregationDescription, str3, healthConnectQueryQueriesItemRecordsDescription, healthConnectQueryQueriesItemTimeRangeDescription2);
    }

    public static final /* synthetic */ void write$Self$models(HealthConnectQueryQueriesItemDescription self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.description);
        output.r(serialDesc, 1, ti8.a, self.aggregation);
        output.q(serialDesc, 2, self.identifier);
        output.r(serialDesc, 3, xi8.a, self.records);
        output.r(serialDesc, 4, zi8.a, self.time_range);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HealthConnectQueryQueriesItemAggregationDescription getAggregation() {
        return this.aggregation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HealthConnectQueryQueriesItemRecordsDescription getRecords() {
        return this.records;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HealthConnectQueryQueriesItemTimeRangeDescription getTime_range() {
        return this.time_range;
    }

    public final HealthConnectQueryQueriesItemDescription copy(String description, HealthConnectQueryQueriesItemAggregationDescription aggregation, String identifier, HealthConnectQueryQueriesItemRecordsDescription records, HealthConnectQueryQueriesItemTimeRangeDescription time_range) {
        description.getClass();
        aggregation.getClass();
        identifier.getClass();
        records.getClass();
        time_range.getClass();
        return new HealthConnectQueryQueriesItemDescription(description, aggregation, identifier, records, time_range);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectQueryQueriesItemDescription)) {
            return false;
        }
        HealthConnectQueryQueriesItemDescription healthConnectQueryQueriesItemDescription = (HealthConnectQueryQueriesItemDescription) other;
        return x44.r(this.description, healthConnectQueryQueriesItemDescription.description) && x44.r(this.aggregation, healthConnectQueryQueriesItemDescription.aggregation) && x44.r(this.identifier, healthConnectQueryQueriesItemDescription.identifier) && x44.r(this.records, healthConnectQueryQueriesItemDescription.records) && x44.r(this.time_range, healthConnectQueryQueriesItemDescription.time_range);
    }

    public final HealthConnectQueryQueriesItemAggregationDescription getAggregation() {
        return this.aggregation;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final HealthConnectQueryQueriesItemRecordsDescription getRecords() {
        return this.records;
    }

    public final HealthConnectQueryQueriesItemTimeRangeDescription getTime_range() {
        return this.time_range;
    }

    public int hashCode() {
        return this.time_range.hashCode() + ((this.records.hashCode() + kgh.l((this.aggregation.hashCode() + (this.description.hashCode() * 31)) * 31, 31, this.identifier)) * 31);
    }

    public String toString() {
        return "HealthConnectQueryQueriesItemDescription(description=" + this.description + ", aggregation=" + this.aggregation + ", identifier=" + this.identifier + ", records=" + this.records + ", time_range=" + this.time_range + ")";
    }

    public HealthConnectQueryQueriesItemDescription(String str, HealthConnectQueryQueriesItemAggregationDescription healthConnectQueryQueriesItemAggregationDescription, String str2, HealthConnectQueryQueriesItemRecordsDescription healthConnectQueryQueriesItemRecordsDescription, HealthConnectQueryQueriesItemTimeRangeDescription healthConnectQueryQueriesItemTimeRangeDescription) {
        str.getClass();
        healthConnectQueryQueriesItemAggregationDescription.getClass();
        str2.getClass();
        healthConnectQueryQueriesItemRecordsDescription.getClass();
        healthConnectQueryQueriesItemTimeRangeDescription.getClass();
        this.description = str;
        this.aggregation = healthConnectQueryQueriesItemAggregationDescription;
        this.identifier = str2;
        this.records = healthConnectQueryQueriesItemRecordsDescription;
        this.time_range = healthConnectQueryQueriesItemTimeRangeDescription;
    }
}
