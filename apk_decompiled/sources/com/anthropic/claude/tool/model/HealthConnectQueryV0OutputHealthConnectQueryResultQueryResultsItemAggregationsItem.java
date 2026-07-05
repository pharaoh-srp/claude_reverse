package com.anthropic.claude.tool.model;

import defpackage.ay6;
import defpackage.ck8;
import defpackage.dk8;
import defpackage.ek8;
import defpackage.gvj;
import defpackage.ij8;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.time.OffsetDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267BW\u0012\u0019\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0019\u0010\b\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fBI\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$Jf\u0010%\u001a\u00020\u00002\u001b\b\u0002\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u001b\b\u0002\u0010\b\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R*\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001fR*\u0010\b\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u0010$¨\u00068"}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem;", "", "Ljava/time/OffsetDateTime;", "Lcom/anthropic/claude/tool/model/EventDateTime;", "Lonf;", "with", "Lay6;", "period_end", "period_start", "", "unit", "", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem;", "values", "<init>", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/time/OffsetDateTime;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/OffsetDateTime;", "getPeriod_end", "getPeriod_start", "Ljava/lang/String;", "getUnit", "Ljava/util/List;", "getValues", "Companion", "ck8", "dk8", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem {
    private final OffsetDateTime period_end;
    private final OffsetDateTime period_start;
    private final String unit;
    private final List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem> values;
    public static final dk8 Companion = new dk8();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new ij8(7))};

    public /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem(int i, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str, List list, vnf vnfVar) {
        if (11 != (i & 11)) {
            gvj.f(i, 11, ck8.a.getDescriptor());
            throw null;
        }
        this.period_end = offsetDateTime;
        this.period_start = offsetDateTime2;
        if ((i & 4) == 0) {
            this.unit = null;
        } else {
            this.unit = str;
        }
        this.values = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ek8.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem copy$default(HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            offsetDateTime = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem.period_end;
        }
        if ((i & 2) != 0) {
            offsetDateTime2 = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem.period_start;
        }
        if ((i & 4) != 0) {
            str = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem.unit;
        }
        if ((i & 8) != 0) {
            list = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem.values;
        }
        return healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem.copy(offsetDateTime, offsetDateTime2, str, list);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        ay6 ay6Var = ay6.a;
        output.r(serialDesc, 0, ay6Var, self.period_end);
        output.r(serialDesc, 1, ay6Var, self.period_start);
        if (output.E(serialDesc) || self.unit != null) {
            output.B(serialDesc, 2, srg.a, self.unit);
        }
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.values);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OffsetDateTime getPeriod_end() {
        return this.period_end;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OffsetDateTime getPeriod_start() {
        return this.period_start;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public final List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem> component4() {
        return this.values;
    }

    public final HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem copy(OffsetDateTime period_end, OffsetDateTime period_start, String unit, List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem> values) {
        period_end.getClass();
        period_start.getClass();
        values.getClass();
        return new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem(period_end, period_start, unit, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem)) {
            return false;
        }
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem = (HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem) other;
        return x44.r(this.period_end, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem.period_end) && x44.r(this.period_start, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem.period_start) && x44.r(this.unit, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem.unit) && x44.r(this.values, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem.values);
    }

    public final OffsetDateTime getPeriod_end() {
        return this.period_end;
    }

    public final OffsetDateTime getPeriod_start() {
        return this.period_start;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem> getValues() {
        return this.values;
    }

    public int hashCode() {
        int iHashCode = (this.period_start.hashCode() + (this.period_end.hashCode() * 31)) * 31;
        String str = this.unit;
        return this.values.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem(period_end=" + this.period_end + ", period_start=" + this.period_start + ", unit=" + this.unit + ", values=" + this.values + ")";
    }

    public HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str, List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem> list) {
        offsetDateTime.getClass();
        offsetDateTime2.getClass();
        list.getClass();
        this.period_end = offsetDateTime;
        this.period_start = offsetDateTime2;
        this.unit = str;
        this.values = list;
    }

    public /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str, List list, int i, mq5 mq5Var) {
        this(offsetDateTime, offsetDateTime2, (i & 4) != 0 ? null : str, list);
    }
}
