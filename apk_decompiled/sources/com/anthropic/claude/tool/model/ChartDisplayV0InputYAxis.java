package com.anthropic.claude.tool.model;

import defpackage.kw9;
import defpackage.ll1;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.na6;
import defpackage.ok2;
import defpackage.onf;
import defpackage.rk2;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BU\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ^\u0010&\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b5\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b8\u0010\u001f¨\u0006<"}, d2 = {"Lcom/anthropic/claude/tool/model/ChartDisplayV0InputYAxis;", "", "", "", "data", "format", "", "max", "min", "Lcom/anthropic/claude/tool/model/ChartDisplayV0InputYAxisScale;", "scale", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/anthropic/claude/tool/model/ChartDisplayV0InputYAxisScale;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/anthropic/claude/tool/model/ChartDisplayV0InputYAxisScale;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/ChartDisplayV0InputYAxis;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Double;", "component4", "component5", "()Lcom/anthropic/claude/tool/model/ChartDisplayV0InputYAxisScale;", "component6", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/anthropic/claude/tool/model/ChartDisplayV0InputYAxisScale;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/ChartDisplayV0InputYAxis;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getData", "Ljava/lang/String;", "getFormat", "Ljava/lang/Double;", "getMax", "getMin", "Lcom/anthropic/claude/tool/model/ChartDisplayV0InputYAxisScale;", "getScale", "getTitle", "Companion", "nk2", "ok2", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChartDisplayV0InputYAxis {
    private final List<String> data;
    private final String format;
    private final Double max;
    private final Double min;
    private final ChartDisplayV0InputYAxisScale scale;
    private final String title;
    public static final ok2 Companion = new ok2();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new ll1(29)), null, null, null, null, null};

    public /* synthetic */ ChartDisplayV0InputYAxis(int i, List list, String str, Double d, Double d2, ChartDisplayV0InputYAxisScale chartDisplayV0InputYAxisScale, String str2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = list;
        }
        if ((i & 2) == 0) {
            this.format = null;
        } else {
            this.format = str;
        }
        if ((i & 4) == 0) {
            this.max = null;
        } else {
            this.max = d;
        }
        if ((i & 8) == 0) {
            this.min = null;
        } else {
            this.min = d2;
        }
        if ((i & 16) == 0) {
            this.scale = null;
        } else {
            this.scale = chartDisplayV0InputYAxisScale;
        }
        if ((i & 32) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChartDisplayV0InputYAxis copy$default(ChartDisplayV0InputYAxis chartDisplayV0InputYAxis, List list, String str, Double d, Double d2, ChartDisplayV0InputYAxisScale chartDisplayV0InputYAxisScale, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chartDisplayV0InputYAxis.data;
        }
        if ((i & 2) != 0) {
            str = chartDisplayV0InputYAxis.format;
        }
        if ((i & 4) != 0) {
            d = chartDisplayV0InputYAxis.max;
        }
        if ((i & 8) != 0) {
            d2 = chartDisplayV0InputYAxis.min;
        }
        if ((i & 16) != 0) {
            chartDisplayV0InputYAxisScale = chartDisplayV0InputYAxis.scale;
        }
        if ((i & 32) != 0) {
            str2 = chartDisplayV0InputYAxis.title;
        }
        ChartDisplayV0InputYAxisScale chartDisplayV0InputYAxisScale2 = chartDisplayV0InputYAxisScale;
        String str3 = str2;
        return chartDisplayV0InputYAxis.copy(list, str, d, d2, chartDisplayV0InputYAxisScale2, str3);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(ChartDisplayV0InputYAxis self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.data != null) {
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.data);
        }
        if (output.E(serialDesc) || self.format != null) {
            output.B(serialDesc, 1, srg.a, self.format);
        }
        if (output.E(serialDesc) || self.max != null) {
            output.B(serialDesc, 2, na6.a, self.max);
        }
        if (output.E(serialDesc) || self.min != null) {
            output.B(serialDesc, 3, na6.a, self.min);
        }
        if (output.E(serialDesc) || self.scale != null) {
            output.B(serialDesc, 4, rk2.d, self.scale);
        }
        if (!output.E(serialDesc) && self.title == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.title);
    }

    public final List<String> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChartDisplayV0InputYAxisScale getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ChartDisplayV0InputYAxis copy(List<String> data, String format, Double max, Double min, ChartDisplayV0InputYAxisScale scale, String title) {
        return new ChartDisplayV0InputYAxis(data, format, max, min, scale, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartDisplayV0InputYAxis)) {
            return false;
        }
        ChartDisplayV0InputYAxis chartDisplayV0InputYAxis = (ChartDisplayV0InputYAxis) other;
        return x44.r(this.data, chartDisplayV0InputYAxis.data) && x44.r(this.format, chartDisplayV0InputYAxis.format) && x44.r(this.max, chartDisplayV0InputYAxis.max) && x44.r(this.min, chartDisplayV0InputYAxis.min) && this.scale == chartDisplayV0InputYAxis.scale && x44.r(this.title, chartDisplayV0InputYAxis.title);
    }

    public final List<String> getData() {
        return this.data;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Double getMax() {
        return this.max;
    }

    public final Double getMin() {
        return this.min;
    }

    public final ChartDisplayV0InputYAxisScale getScale() {
        return this.scale;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        List<String> list = this.data;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.format;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.max;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.min;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        ChartDisplayV0InputYAxisScale chartDisplayV0InputYAxisScale = this.scale;
        int iHashCode5 = (iHashCode4 + (chartDisplayV0InputYAxisScale == null ? 0 : chartDisplayV0InputYAxisScale.hashCode())) * 31;
        String str2 = this.title;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ChartDisplayV0InputYAxis(data=" + this.data + ", format=" + this.format + ", max=" + this.max + ", min=" + this.min + ", scale=" + this.scale + ", title=" + this.title + ")";
    }

    public ChartDisplayV0InputYAxis() {
        this((List) null, (String) null, (Double) null, (Double) null, (ChartDisplayV0InputYAxisScale) null, (String) null, 63, (mq5) null);
    }

    public ChartDisplayV0InputYAxis(List<String> list, String str, Double d, Double d2, ChartDisplayV0InputYAxisScale chartDisplayV0InputYAxisScale, String str2) {
        this.data = list;
        this.format = str;
        this.max = d;
        this.min = d2;
        this.scale = chartDisplayV0InputYAxisScale;
        this.title = str2;
    }

    public /* synthetic */ ChartDisplayV0InputYAxis(List list, String str, Double d, Double d2, ChartDisplayV0InputYAxisScale chartDisplayV0InputYAxisScale, String str2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : chartDisplayV0InputYAxisScale, (i & 32) != 0 ? null : str2);
    }
}
