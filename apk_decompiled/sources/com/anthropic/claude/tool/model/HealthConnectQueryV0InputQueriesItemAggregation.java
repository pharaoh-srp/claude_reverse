package com.anthropic.claude.tool.model;

import defpackage.e79;
import defpackage.ij8;
import defpackage.kj8;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mj8;
import defpackage.mq5;
import defpackage.oj8;
import defpackage.onf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJF\u0010 \u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b1\u0010\u001e¨\u00065"}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregation;", "", "", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem;", "aggregation_types", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregationBucketBy;", "bucket_by", "", "bucket_duration_minutes", "bucket_period_days", "<init>", "(Ljava/util/List;Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregationBucketBy;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregationBucketBy;Ljava/lang/Integer;Ljava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregation;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregationBucketBy;", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/util/List;Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregationBucketBy;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregation;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAggregation_types", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemAggregationBucketBy;", "getBucket_by", "Ljava/lang/Integer;", "getBucket_duration_minutes", "getBucket_period_days", "Companion", "jj8", "kj8", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectQueryV0InputQueriesItemAggregation {
    private final List<HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem> aggregation_types;
    private final HealthConnectQueryV0InputQueriesItemAggregationBucketBy bucket_by;
    private final Integer bucket_duration_minutes;
    private final Integer bucket_period_days;
    public static final kj8 Companion = new kj8();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new ij8(0)), null, null, null};

    public /* synthetic */ HealthConnectQueryV0InputQueriesItemAggregation(int i, List list, HealthConnectQueryV0InputQueriesItemAggregationBucketBy healthConnectQueryV0InputQueriesItemAggregationBucketBy, Integer num, Integer num2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.aggregation_types = null;
        } else {
            this.aggregation_types = list;
        }
        if ((i & 2) == 0) {
            this.bucket_by = null;
        } else {
            this.bucket_by = healthConnectQueryV0InputQueriesItemAggregationBucketBy;
        }
        if ((i & 4) == 0) {
            this.bucket_duration_minutes = null;
        } else {
            this.bucket_duration_minutes = num;
        }
        if ((i & 8) == 0) {
            this.bucket_period_days = null;
        } else {
            this.bucket_period_days = num2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(mj8.d, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthConnectQueryV0InputQueriesItemAggregation copy$default(HealthConnectQueryV0InputQueriesItemAggregation healthConnectQueryV0InputQueriesItemAggregation, List list, HealthConnectQueryV0InputQueriesItemAggregationBucketBy healthConnectQueryV0InputQueriesItemAggregationBucketBy, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = healthConnectQueryV0InputQueriesItemAggregation.aggregation_types;
        }
        if ((i & 2) != 0) {
            healthConnectQueryV0InputQueriesItemAggregationBucketBy = healthConnectQueryV0InputQueriesItemAggregation.bucket_by;
        }
        if ((i & 4) != 0) {
            num = healthConnectQueryV0InputQueriesItemAggregation.bucket_duration_minutes;
        }
        if ((i & 8) != 0) {
            num2 = healthConnectQueryV0InputQueriesItemAggregation.bucket_period_days;
        }
        return healthConnectQueryV0InputQueriesItemAggregation.copy(list, healthConnectQueryV0InputQueriesItemAggregationBucketBy, num, num2);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(HealthConnectQueryV0InputQueriesItemAggregation self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.aggregation_types != null) {
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.aggregation_types);
        }
        if (output.E(serialDesc) || self.bucket_by != null) {
            output.B(serialDesc, 1, oj8.d, self.bucket_by);
        }
        if (output.E(serialDesc) || self.bucket_duration_minutes != null) {
            output.B(serialDesc, 2, e79.a, self.bucket_duration_minutes);
        }
        if (!output.E(serialDesc) && self.bucket_period_days == null) {
            return;
        }
        output.B(serialDesc, 3, e79.a, self.bucket_period_days);
    }

    public final List<HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem> component1() {
        return this.aggregation_types;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HealthConnectQueryV0InputQueriesItemAggregationBucketBy getBucket_by() {
        return this.bucket_by;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getBucket_duration_minutes() {
        return this.bucket_duration_minutes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getBucket_period_days() {
        return this.bucket_period_days;
    }

    public final HealthConnectQueryV0InputQueriesItemAggregation copy(List<? extends HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem> aggregation_types, HealthConnectQueryV0InputQueriesItemAggregationBucketBy bucket_by, Integer bucket_duration_minutes, Integer bucket_period_days) {
        return new HealthConnectQueryV0InputQueriesItemAggregation(aggregation_types, bucket_by, bucket_duration_minutes, bucket_period_days);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectQueryV0InputQueriesItemAggregation)) {
            return false;
        }
        HealthConnectQueryV0InputQueriesItemAggregation healthConnectQueryV0InputQueriesItemAggregation = (HealthConnectQueryV0InputQueriesItemAggregation) other;
        return x44.r(this.aggregation_types, healthConnectQueryV0InputQueriesItemAggregation.aggregation_types) && this.bucket_by == healthConnectQueryV0InputQueriesItemAggregation.bucket_by && x44.r(this.bucket_duration_minutes, healthConnectQueryV0InputQueriesItemAggregation.bucket_duration_minutes) && x44.r(this.bucket_period_days, healthConnectQueryV0InputQueriesItemAggregation.bucket_period_days);
    }

    public final List<HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem> getAggregation_types() {
        return this.aggregation_types;
    }

    public final HealthConnectQueryV0InputQueriesItemAggregationBucketBy getBucket_by() {
        return this.bucket_by;
    }

    public final Integer getBucket_duration_minutes() {
        return this.bucket_duration_minutes;
    }

    public final Integer getBucket_period_days() {
        return this.bucket_period_days;
    }

    public int hashCode() {
        List<HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem> list = this.aggregation_types;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        HealthConnectQueryV0InputQueriesItemAggregationBucketBy healthConnectQueryV0InputQueriesItemAggregationBucketBy = this.bucket_by;
        int iHashCode2 = (iHashCode + (healthConnectQueryV0InputQueriesItemAggregationBucketBy == null ? 0 : healthConnectQueryV0InputQueriesItemAggregationBucketBy.hashCode())) * 31;
        Integer num = this.bucket_duration_minutes;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bucket_period_days;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "HealthConnectQueryV0InputQueriesItemAggregation(aggregation_types=" + this.aggregation_types + ", bucket_by=" + this.bucket_by + ", bucket_duration_minutes=" + this.bucket_duration_minutes + ", bucket_period_days=" + this.bucket_period_days + ")";
    }

    public HealthConnectQueryV0InputQueriesItemAggregation() {
        this((List) null, (HealthConnectQueryV0InputQueriesItemAggregationBucketBy) null, (Integer) null, (Integer) null, 15, (mq5) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthConnectQueryV0InputQueriesItemAggregation(List<? extends HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem> list, HealthConnectQueryV0InputQueriesItemAggregationBucketBy healthConnectQueryV0InputQueriesItemAggregationBucketBy, Integer num, Integer num2) {
        this.aggregation_types = list;
        this.bucket_by = healthConnectQueryV0InputQueriesItemAggregationBucketBy;
        this.bucket_duration_minutes = num;
        this.bucket_period_days = num2;
    }

    public /* synthetic */ HealthConnectQueryV0InputQueriesItemAggregation(List list, HealthConnectQueryV0InputQueriesItemAggregationBucketBy healthConnectQueryV0InputQueriesItemAggregationBucketBy, Integer num, Integer num2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : healthConnectQueryV0InputQueriesItemAggregationBucketBy, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }
}
