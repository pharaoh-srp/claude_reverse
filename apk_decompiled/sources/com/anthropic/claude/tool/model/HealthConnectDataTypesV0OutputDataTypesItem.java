package com.anthropic.claude.tool.model;

import defpackage.bi8;
import defpackage.c97;
import defpackage.ci8;
import defpackage.ei8;
import defpackage.gi8;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
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
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJL\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b3\u0010\u001c¨\u00067"}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectDataTypesV0OutputDataTypesItem;", "", "", "display_name", "identifier", "Lcom/anthropic/claude/tool/model/HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType;", "record_base_type", "", "Lcom/anthropic/claude/tool/model/HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem;", "supported_aggregation_types", "unit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType;Ljava/util/List;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/HealthConnectDataTypesV0OutputDataTypesItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/tool/model/HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType;", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType;Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/HealthConnectDataTypesV0OutputDataTypesItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplay_name", "getIdentifier", "Lcom/anthropic/claude/tool/model/HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType;", "getRecord_base_type", "Ljava/util/List;", "getSupported_aggregation_types", "getUnit", "Companion", "bi8", "ci8", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectDataTypesV0OutputDataTypesItem {
    private final String display_name;
    private final String identifier;
    private final HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType record_base_type;
    private final List<HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem> supported_aggregation_types;
    private final String unit;
    public static final ci8 Companion = new ci8();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new c97(26)), null};

    public /* synthetic */ HealthConnectDataTypesV0OutputDataTypesItem(int i, String str, String str2, HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType healthConnectDataTypesV0OutputDataTypesItemRecordBaseType, List list, String str3, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, bi8.a.getDescriptor());
            throw null;
        }
        this.display_name = str;
        this.identifier = str2;
        this.record_base_type = healthConnectDataTypesV0OutputDataTypesItemRecordBaseType;
        if ((i & 8) == 0) {
            this.supported_aggregation_types = null;
        } else {
            this.supported_aggregation_types = list;
        }
        if ((i & 16) == 0) {
            this.unit = null;
        } else {
            this.unit = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(gi8.d, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthConnectDataTypesV0OutputDataTypesItem copy$default(HealthConnectDataTypesV0OutputDataTypesItem healthConnectDataTypesV0OutputDataTypesItem, String str, String str2, HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType healthConnectDataTypesV0OutputDataTypesItemRecordBaseType, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthConnectDataTypesV0OutputDataTypesItem.display_name;
        }
        if ((i & 2) != 0) {
            str2 = healthConnectDataTypesV0OutputDataTypesItem.identifier;
        }
        if ((i & 4) != 0) {
            healthConnectDataTypesV0OutputDataTypesItemRecordBaseType = healthConnectDataTypesV0OutputDataTypesItem.record_base_type;
        }
        if ((i & 8) != 0) {
            list = healthConnectDataTypesV0OutputDataTypesItem.supported_aggregation_types;
        }
        if ((i & 16) != 0) {
            str3 = healthConnectDataTypesV0OutputDataTypesItem.unit;
        }
        String str4 = str3;
        HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType healthConnectDataTypesV0OutputDataTypesItemRecordBaseType2 = healthConnectDataTypesV0OutputDataTypesItemRecordBaseType;
        return healthConnectDataTypesV0OutputDataTypesItem.copy(str, str2, healthConnectDataTypesV0OutputDataTypesItemRecordBaseType2, list, str4);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(HealthConnectDataTypesV0OutputDataTypesItem self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.display_name);
        output.q(serialDesc, 1, self.identifier);
        output.r(serialDesc, 2, ei8.d, self.record_base_type);
        if (output.E(serialDesc) || self.supported_aggregation_types != null) {
            output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.supported_aggregation_types);
        }
        if (!output.E(serialDesc) && self.unit == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.unit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplay_name() {
        return this.display_name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType getRecord_base_type() {
        return this.record_base_type;
    }

    public final List<HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem> component4() {
        return this.supported_aggregation_types;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public final HealthConnectDataTypesV0OutputDataTypesItem copy(String display_name, String identifier, HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType record_base_type, List<? extends HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem> supported_aggregation_types, String unit) {
        display_name.getClass();
        identifier.getClass();
        record_base_type.getClass();
        return new HealthConnectDataTypesV0OutputDataTypesItem(display_name, identifier, record_base_type, supported_aggregation_types, unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectDataTypesV0OutputDataTypesItem)) {
            return false;
        }
        HealthConnectDataTypesV0OutputDataTypesItem healthConnectDataTypesV0OutputDataTypesItem = (HealthConnectDataTypesV0OutputDataTypesItem) other;
        return x44.r(this.display_name, healthConnectDataTypesV0OutputDataTypesItem.display_name) && x44.r(this.identifier, healthConnectDataTypesV0OutputDataTypesItem.identifier) && this.record_base_type == healthConnectDataTypesV0OutputDataTypesItem.record_base_type && x44.r(this.supported_aggregation_types, healthConnectDataTypesV0OutputDataTypesItem.supported_aggregation_types) && x44.r(this.unit, healthConnectDataTypesV0OutputDataTypesItem.unit);
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType getRecord_base_type() {
        return this.record_base_type;
    }

    public final List<HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem> getSupported_aggregation_types() {
        return this.supported_aggregation_types;
    }

    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        int iHashCode = (this.record_base_type.hashCode() + kgh.l(this.display_name.hashCode() * 31, 31, this.identifier)) * 31;
        List<HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem> list = this.supported_aggregation_types;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.unit;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.display_name;
        String str2 = this.identifier;
        HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType healthConnectDataTypesV0OutputDataTypesItemRecordBaseType = this.record_base_type;
        List<HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem> list = this.supported_aggregation_types;
        String str3 = this.unit;
        StringBuilder sbR = kgh.r("HealthConnectDataTypesV0OutputDataTypesItem(display_name=", str, ", identifier=", str2, ", record_base_type=");
        sbR.append(healthConnectDataTypesV0OutputDataTypesItemRecordBaseType);
        sbR.append(", supported_aggregation_types=");
        sbR.append(list);
        sbR.append(", unit=");
        return ij0.m(sbR, str3, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthConnectDataTypesV0OutputDataTypesItem(String str, String str2, HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType healthConnectDataTypesV0OutputDataTypesItemRecordBaseType, List<? extends HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem> list, String str3) {
        str.getClass();
        str2.getClass();
        healthConnectDataTypesV0OutputDataTypesItemRecordBaseType.getClass();
        this.display_name = str;
        this.identifier = str2;
        this.record_base_type = healthConnectDataTypesV0OutputDataTypesItemRecordBaseType;
        this.supported_aggregation_types = list;
        this.unit = str3;
    }

    public /* synthetic */ HealthConnectDataTypesV0OutputDataTypesItem(String str, String str2, HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType healthConnectDataTypesV0OutputDataTypesItemRecordBaseType, List list, String str3, int i, mq5 mq5Var) {
        this(str, str2, healthConnectDataTypesV0OutputDataTypesItemRecordBaseType, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str3);
    }
}
