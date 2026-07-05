package com.anthropic.claude.models.organization.configtypes;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.ti8;
import defpackage.ui8;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u00060"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemAggregationDescription;", "", "", "description", "aggregation_types", "bucket_by", "bucket_duration_minutes", "bucket_period_days", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemAggregationDescription;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemAggregationDescription;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "getAggregation_types", "getBucket_by", "getBucket_duration_minutes", "getBucket_period_days", "Companion", "ti8", "ui8", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectQueryQueriesItemAggregationDescription {
    public static final int $stable = 0;
    public static final ui8 Companion = new ui8();
    private final String aggregation_types;
    private final String bucket_by;
    private final String bucket_duration_minutes;
    private final String bucket_period_days;
    private final String description;

    public /* synthetic */ HealthConnectQueryQueriesItemAggregationDescription(int i, String str, String str2, String str3, String str4, String str5, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, ti8.a.getDescriptor());
            throw null;
        }
        this.description = str;
        this.aggregation_types = str2;
        this.bucket_by = str3;
        this.bucket_duration_minutes = str4;
        this.bucket_period_days = str5;
    }

    public static /* synthetic */ HealthConnectQueryQueriesItemAggregationDescription copy$default(HealthConnectQueryQueriesItemAggregationDescription healthConnectQueryQueriesItemAggregationDescription, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthConnectQueryQueriesItemAggregationDescription.description;
        }
        if ((i & 2) != 0) {
            str2 = healthConnectQueryQueriesItemAggregationDescription.aggregation_types;
        }
        if ((i & 4) != 0) {
            str3 = healthConnectQueryQueriesItemAggregationDescription.bucket_by;
        }
        if ((i & 8) != 0) {
            str4 = healthConnectQueryQueriesItemAggregationDescription.bucket_duration_minutes;
        }
        if ((i & 16) != 0) {
            str5 = healthConnectQueryQueriesItemAggregationDescription.bucket_period_days;
        }
        String str6 = str5;
        String str7 = str3;
        return healthConnectQueryQueriesItemAggregationDescription.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$models(HealthConnectQueryQueriesItemAggregationDescription self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.description);
        output.q(serialDesc, 1, self.aggregation_types);
        output.q(serialDesc, 2, self.bucket_by);
        output.q(serialDesc, 3, self.bucket_duration_minutes);
        output.q(serialDesc, 4, self.bucket_period_days);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAggregation_types() {
        return this.aggregation_types;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBucket_by() {
        return this.bucket_by;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBucket_duration_minutes() {
        return this.bucket_duration_minutes;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBucket_period_days() {
        return this.bucket_period_days;
    }

    public final HealthConnectQueryQueriesItemAggregationDescription copy(String description, String aggregation_types, String bucket_by, String bucket_duration_minutes, String bucket_period_days) {
        description.getClass();
        aggregation_types.getClass();
        bucket_by.getClass();
        bucket_duration_minutes.getClass();
        bucket_period_days.getClass();
        return new HealthConnectQueryQueriesItemAggregationDescription(description, aggregation_types, bucket_by, bucket_duration_minutes, bucket_period_days);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectQueryQueriesItemAggregationDescription)) {
            return false;
        }
        HealthConnectQueryQueriesItemAggregationDescription healthConnectQueryQueriesItemAggregationDescription = (HealthConnectQueryQueriesItemAggregationDescription) other;
        return x44.r(this.description, healthConnectQueryQueriesItemAggregationDescription.description) && x44.r(this.aggregation_types, healthConnectQueryQueriesItemAggregationDescription.aggregation_types) && x44.r(this.bucket_by, healthConnectQueryQueriesItemAggregationDescription.bucket_by) && x44.r(this.bucket_duration_minutes, healthConnectQueryQueriesItemAggregationDescription.bucket_duration_minutes) && x44.r(this.bucket_period_days, healthConnectQueryQueriesItemAggregationDescription.bucket_period_days);
    }

    public final String getAggregation_types() {
        return this.aggregation_types;
    }

    public final String getBucket_by() {
        return this.bucket_by;
    }

    public final String getBucket_duration_minutes() {
        return this.bucket_duration_minutes;
    }

    public final String getBucket_period_days() {
        return this.bucket_period_days;
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return this.bucket_period_days.hashCode() + kgh.l(kgh.l(kgh.l(this.description.hashCode() * 31, 31, this.aggregation_types), 31, this.bucket_by), 31, this.bucket_duration_minutes);
    }

    public String toString() {
        String str = this.description;
        String str2 = this.aggregation_types;
        String str3 = this.bucket_by;
        String str4 = this.bucket_duration_minutes;
        String str5 = this.bucket_period_days;
        StringBuilder sbR = kgh.r("HealthConnectQueryQueriesItemAggregationDescription(description=", str, ", aggregation_types=", str2, ", bucket_by=");
        kgh.u(sbR, str3, ", bucket_duration_minutes=", str4, ", bucket_period_days=");
        return ij0.m(sbR, str5, ")");
    }

    public HealthConnectQueryQueriesItemAggregationDescription(String str, String str2, String str3, String str4, String str5) {
        y6a.s(str, str2, str3, str4, str5);
        this.description = str;
        this.aggregation_types = str2;
        this.bucket_by = str3;
        this.bucket_duration_minutes = str4;
        this.bucket_period_days = str5;
    }
}
