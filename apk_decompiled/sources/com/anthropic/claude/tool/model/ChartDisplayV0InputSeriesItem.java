package com.anthropic.claude.tool.model;

import defpackage.ek2;
import defpackage.fk2;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.ll1;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.na6;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bBO\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJL\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001bR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b.\u0010\u001e¨\u00062"}, d2 = {"Lcom/anthropic/claude/tool/model/ChartDisplayV0InputSeriesItem;", "", "", "color", "name", "", "Lcom/anthropic/claude/tool/model/ChartDisplayV0InputSeriesItemPointsItem;", "points", "", "values", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/ChartDisplayV0InputSeriesItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/tool/model/ChartDisplayV0InputSeriesItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColor", "getName", "Ljava/util/List;", "getPoints", "getValues", "Companion", "dk2", "ek2", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChartDisplayV0InputSeriesItem {
    private static final kw9[] $childSerializers;
    public static final ek2 Companion = new ek2();
    private final String color;
    private final String name;
    private final List<ChartDisplayV0InputSeriesItemPointsItem> points;
    private final List<Double> values;

    static {
        ll1 ll1Var = new ll1(24);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, yb5.w(w1aVar, ll1Var), yb5.w(w1aVar, new ll1(25))};
    }

    public /* synthetic */ ChartDisplayV0InputSeriesItem(int i, String str, String str2, List list, List list2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.color = null;
        } else {
            this.color = str;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.points = null;
        } else {
            this.points = list;
        }
        if ((i & 8) == 0) {
            this.values = null;
        } else {
            this.values = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(fk2.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(na6.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChartDisplayV0InputSeriesItem copy$default(ChartDisplayV0InputSeriesItem chartDisplayV0InputSeriesItem, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chartDisplayV0InputSeriesItem.color;
        }
        if ((i & 2) != 0) {
            str2 = chartDisplayV0InputSeriesItem.name;
        }
        if ((i & 4) != 0) {
            list = chartDisplayV0InputSeriesItem.points;
        }
        if ((i & 8) != 0) {
            list2 = chartDisplayV0InputSeriesItem.values;
        }
        return chartDisplayV0InputSeriesItem.copy(str, str2, list, list2);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(ChartDisplayV0InputSeriesItem self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.color != null) {
            output.B(serialDesc, 0, srg.a, self.color);
        }
        if (output.E(serialDesc) || self.name != null) {
            output.B(serialDesc, 1, srg.a, self.name);
        }
        if (output.E(serialDesc) || self.points != null) {
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.points);
        }
        if (!output.E(serialDesc) && self.values == null) {
            return;
        }
        output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.values);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<ChartDisplayV0InputSeriesItemPointsItem> component3() {
        return this.points;
    }

    public final List<Double> component4() {
        return this.values;
    }

    public final ChartDisplayV0InputSeriesItem copy(String color, String name, List<ChartDisplayV0InputSeriesItemPointsItem> points, List<Double> values) {
        return new ChartDisplayV0InputSeriesItem(color, name, points, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartDisplayV0InputSeriesItem)) {
            return false;
        }
        ChartDisplayV0InputSeriesItem chartDisplayV0InputSeriesItem = (ChartDisplayV0InputSeriesItem) other;
        return x44.r(this.color, chartDisplayV0InputSeriesItem.color) && x44.r(this.name, chartDisplayV0InputSeriesItem.name) && x44.r(this.points, chartDisplayV0InputSeriesItem.points) && x44.r(this.values, chartDisplayV0InputSeriesItem.values);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getName() {
        return this.name;
    }

    public final List<ChartDisplayV0InputSeriesItemPointsItem> getPoints() {
        return this.points;
    }

    public final List<Double> getValues() {
        return this.values;
    }

    public int hashCode() {
        String str = this.color;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ChartDisplayV0InputSeriesItemPointsItem> list = this.points;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Double> list2 = this.values;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.color;
        String str2 = this.name;
        List<ChartDisplayV0InputSeriesItemPointsItem> list = this.points;
        List<Double> list2 = this.values;
        StringBuilder sbR = kgh.r("ChartDisplayV0InputSeriesItem(color=", str, ", name=", str2, ", points=");
        sbR.append(list);
        sbR.append(", values=");
        sbR.append(list2);
        sbR.append(")");
        return sbR.toString();
    }

    public ChartDisplayV0InputSeriesItem() {
        this((String) null, (String) null, (List) null, (List) null, 15, (mq5) null);
    }

    public ChartDisplayV0InputSeriesItem(String str, String str2, List<ChartDisplayV0InputSeriesItemPointsItem> list, List<Double> list2) {
        this.color = str;
        this.name = str2;
        this.points = list;
        this.values = list2;
    }

    public /* synthetic */ ChartDisplayV0InputSeriesItem(String str, String str2, List list, List list2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
