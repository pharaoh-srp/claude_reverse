package com.anthropic.claude.tool.model;

import defpackage.ak8;
import defpackage.bk8;
import defpackage.ck8;
import defpackage.gvj;
import defpackage.ij8;
import defpackage.ik8;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mk8;
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
import defpackage.zt1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<BW\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBc\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJb\u0010(\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b8\u0010%R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b9\u0010\u001f¨\u0006="}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem;", "", "", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem;", "aggregations", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError;", "error", "", "has_more_records", "", "page_token", "record_type", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem;", "records", "<init>", "(Ljava/util/List;Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError;", "component3", "()Ljava/lang/Boolean;", "component4", "()Ljava/lang/String;", "component5", "component6", "copy", "(Ljava/util/List;Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAggregations", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError;", "getError", "Ljava/lang/Boolean;", "getHas_more_records", "Ljava/lang/String;", "getPage_token", "getRecord_type", "getRecords", "Companion", "ak8", "bk8", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem {
    private static final kw9[] $childSerializers;
    public static final bk8 Companion = new bk8();
    private final List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem> aggregations;
    private final HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError error;
    private final Boolean has_more_records;
    private final String page_token;
    private final String record_type;
    private final List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem> records;

    static {
        ij8 ij8Var = new ij8(5);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, ij8Var), null, null, null, null, yb5.w(w1aVar, new ij8(6))};
    }

    public /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem(int i, List list, HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError, Boolean bool, String str, String str2, List list2, vnf vnfVar) {
        if (16 != (i & 16)) {
            gvj.f(i, 16, ak8.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.aggregations = null;
        } else {
            this.aggregations = list;
        }
        if ((i & 2) == 0) {
            this.error = null;
        } else {
            this.error = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError;
        }
        if ((i & 4) == 0) {
            this.has_more_records = null;
        } else {
            this.has_more_records = bool;
        }
        if ((i & 8) == 0) {
            this.page_token = null;
        } else {
            this.page_token = str;
        }
        this.record_type = str2;
        if ((i & 32) == 0) {
            this.records = null;
        } else {
            this.records = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ck8.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(mk8.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem copy$default(HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem, List list, HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError, Boolean bool, String str, String str2, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.aggregations;
        }
        if ((i & 2) != 0) {
            healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.error;
        }
        if ((i & 4) != 0) {
            bool = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.has_more_records;
        }
        if ((i & 8) != 0) {
            str = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.page_token;
        }
        if ((i & 16) != 0) {
            str2 = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.record_type;
        }
        if ((i & 32) != 0) {
            list2 = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.records;
        }
        String str3 = str2;
        List list3 = list2;
        return healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.copy(list, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError, bool, str, str3, list3);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.aggregations != null) {
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.aggregations);
        }
        if (output.E(serialDesc) || self.error != null) {
            output.B(serialDesc, 1, ik8.a, self.error);
        }
        if (output.E(serialDesc) || self.has_more_records != null) {
            output.B(serialDesc, 2, zt1.a, self.has_more_records);
        }
        if (output.E(serialDesc) || self.page_token != null) {
            output.B(serialDesc, 3, srg.a, self.page_token);
        }
        output.q(serialDesc, 4, self.record_type);
        if (!output.E(serialDesc) && self.records == null) {
            return;
        }
        output.B(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.records);
    }

    public final List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem> component1() {
        return this.aggregations;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHas_more_records() {
        return this.has_more_records;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPage_token() {
        return this.page_token;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRecord_type() {
        return this.record_type;
    }

    public final List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem> component6() {
        return this.records;
    }

    public final HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem copy(List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem> aggregations, HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError error, Boolean has_more_records, String page_token, String record_type, List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem> records) {
        record_type.getClass();
        return new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem(aggregations, error, has_more_records, page_token, record_type, records);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem)) {
            return false;
        }
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem = (HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem) other;
        return x44.r(this.aggregations, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.aggregations) && x44.r(this.error, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.error) && x44.r(this.has_more_records, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.has_more_records) && x44.r(this.page_token, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.page_token) && x44.r(this.record_type, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.record_type) && x44.r(this.records, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.records);
    }

    public final List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem> getAggregations() {
        return this.aggregations;
    }

    public final HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError getError() {
        return this.error;
    }

    public final Boolean getHas_more_records() {
        return this.has_more_records;
    }

    public final String getPage_token() {
        return this.page_token;
    }

    public final String getRecord_type() {
        return this.record_type;
    }

    public final List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem> getRecords() {
        return this.records;
    }

    public int hashCode() {
        List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem> list = this.aggregations;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError = this.error;
        int iHashCode2 = (iHashCode + (healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError == null ? 0 : healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError.hashCode())) * 31;
        Boolean bool = this.has_more_records;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.page_token;
        int iL = kgh.l((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.record_type);
        List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem> list2 = this.records;
        return iL + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem(aggregations=" + this.aggregations + ", error=" + this.error + ", has_more_records=" + this.has_more_records + ", page_token=" + this.page_token + ", record_type=" + this.record_type + ", records=" + this.records + ")";
    }

    public HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem(List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem> list, HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError, Boolean bool, String str, String str2, List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem> list2) {
        str2.getClass();
        this.aggregations = list;
        this.error = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError;
        this.has_more_records = bool;
        this.page_token = str;
        this.record_type = str2;
        this.records = list2;
    }

    public /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem(List list, HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError, Boolean bool, String str, String str2, List list2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str, str2, (i & 32) != 0 ? null : list2);
    }
}
