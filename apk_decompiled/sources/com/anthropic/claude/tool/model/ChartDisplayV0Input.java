package com.anthropic.claude.tool.model;

import defpackage.bk2;
import defpackage.ck2;
import defpackage.dk2;
import defpackage.gvj;
import defpackage.ik2;
import defpackage.jk2;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nk2;
import defpackage.onf;
import defpackage.rc1;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&JN\u0010'\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010\"J\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010&¨\u0006="}, d2 = {"Lcom/anthropic/claude/tool/model/ChartDisplayV0Input;", "", "", "Lcom/anthropic/claude/tool/model/ChartDisplayV0InputSeriesItem;", "series", "Lcom/anthropic/claude/tool/model/ChartDisplayV0InputStyle;", "style", "", "title", "Lcom/anthropic/claude/tool/model/ChartDisplayV0InputXAxis;", "x_axis", "Lcom/anthropic/claude/tool/model/ChartDisplayV0InputYAxis;", "y_axis", "<init>", "(Ljava/util/List;Lcom/anthropic/claude/tool/model/ChartDisplayV0InputStyle;Ljava/lang/String;Lcom/anthropic/claude/tool/model/ChartDisplayV0InputXAxis;Lcom/anthropic/claude/tool/model/ChartDisplayV0InputYAxis;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/anthropic/claude/tool/model/ChartDisplayV0InputStyle;Ljava/lang/String;Lcom/anthropic/claude/tool/model/ChartDisplayV0InputXAxis;Lcom/anthropic/claude/tool/model/ChartDisplayV0InputYAxis;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/ChartDisplayV0Input;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/anthropic/claude/tool/model/ChartDisplayV0InputStyle;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/anthropic/claude/tool/model/ChartDisplayV0InputXAxis;", "component5", "()Lcom/anthropic/claude/tool/model/ChartDisplayV0InputYAxis;", "copy", "(Ljava/util/List;Lcom/anthropic/claude/tool/model/ChartDisplayV0InputStyle;Ljava/lang/String;Lcom/anthropic/claude/tool/model/ChartDisplayV0InputXAxis;Lcom/anthropic/claude/tool/model/ChartDisplayV0InputYAxis;)Lcom/anthropic/claude/tool/model/ChartDisplayV0Input;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSeries", "Lcom/anthropic/claude/tool/model/ChartDisplayV0InputStyle;", "getStyle", "Ljava/lang/String;", "getTitle", "Lcom/anthropic/claude/tool/model/ChartDisplayV0InputXAxis;", "getX_axis", "Lcom/anthropic/claude/tool/model/ChartDisplayV0InputYAxis;", "getY_axis", "Companion", "bk2", "ck2", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChartDisplayV0Input {
    private final List<ChartDisplayV0InputSeriesItem> series;
    private final ChartDisplayV0InputStyle style;
    private final String title;
    private final ChartDisplayV0InputXAxis x_axis;
    private final ChartDisplayV0InputYAxis y_axis;
    public static final ck2 Companion = new ck2();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new rc1(10)), null, null, null, null};

    public /* synthetic */ ChartDisplayV0Input(int i, List list, ChartDisplayV0InputStyle chartDisplayV0InputStyle, String str, ChartDisplayV0InputXAxis chartDisplayV0InputXAxis, ChartDisplayV0InputYAxis chartDisplayV0InputYAxis, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, bk2.a.getDescriptor());
            throw null;
        }
        this.series = list;
        this.style = chartDisplayV0InputStyle;
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 8) == 0) {
            this.x_axis = null;
        } else {
            this.x_axis = chartDisplayV0InputXAxis;
        }
        if ((i & 16) == 0) {
            this.y_axis = null;
        } else {
            this.y_axis = chartDisplayV0InputYAxis;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(dk2.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChartDisplayV0Input copy$default(ChartDisplayV0Input chartDisplayV0Input, List list, ChartDisplayV0InputStyle chartDisplayV0InputStyle, String str, ChartDisplayV0InputXAxis chartDisplayV0InputXAxis, ChartDisplayV0InputYAxis chartDisplayV0InputYAxis, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chartDisplayV0Input.series;
        }
        if ((i & 2) != 0) {
            chartDisplayV0InputStyle = chartDisplayV0Input.style;
        }
        if ((i & 4) != 0) {
            str = chartDisplayV0Input.title;
        }
        if ((i & 8) != 0) {
            chartDisplayV0InputXAxis = chartDisplayV0Input.x_axis;
        }
        if ((i & 16) != 0) {
            chartDisplayV0InputYAxis = chartDisplayV0Input.y_axis;
        }
        ChartDisplayV0InputYAxis chartDisplayV0InputYAxis2 = chartDisplayV0InputYAxis;
        String str2 = str;
        return chartDisplayV0Input.copy(list, chartDisplayV0InputStyle, str2, chartDisplayV0InputXAxis, chartDisplayV0InputYAxis2);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(ChartDisplayV0Input self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.series);
        output.r(serialDesc, 1, ik2.d, self.style);
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 2, srg.a, self.title);
        }
        if (output.E(serialDesc) || self.x_axis != null) {
            output.B(serialDesc, 3, jk2.a, self.x_axis);
        }
        if (!output.E(serialDesc) && self.y_axis == null) {
            return;
        }
        output.B(serialDesc, 4, nk2.a, self.y_axis);
    }

    public final List<ChartDisplayV0InputSeriesItem> component1() {
        return this.series;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChartDisplayV0InputStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChartDisplayV0InputXAxis getX_axis() {
        return this.x_axis;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChartDisplayV0InputYAxis getY_axis() {
        return this.y_axis;
    }

    public final ChartDisplayV0Input copy(List<ChartDisplayV0InputSeriesItem> series, ChartDisplayV0InputStyle style, String title, ChartDisplayV0InputXAxis x_axis, ChartDisplayV0InputYAxis y_axis) {
        series.getClass();
        style.getClass();
        return new ChartDisplayV0Input(series, style, title, x_axis, y_axis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartDisplayV0Input)) {
            return false;
        }
        ChartDisplayV0Input chartDisplayV0Input = (ChartDisplayV0Input) other;
        return x44.r(this.series, chartDisplayV0Input.series) && this.style == chartDisplayV0Input.style && x44.r(this.title, chartDisplayV0Input.title) && x44.r(this.x_axis, chartDisplayV0Input.x_axis) && x44.r(this.y_axis, chartDisplayV0Input.y_axis);
    }

    public final List<ChartDisplayV0InputSeriesItem> getSeries() {
        return this.series;
    }

    public final ChartDisplayV0InputStyle getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ChartDisplayV0InputXAxis getX_axis() {
        return this.x_axis;
    }

    public final ChartDisplayV0InputYAxis getY_axis() {
        return this.y_axis;
    }

    public int hashCode() {
        int iHashCode = (this.style.hashCode() + (this.series.hashCode() * 31)) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ChartDisplayV0InputXAxis chartDisplayV0InputXAxis = this.x_axis;
        int iHashCode3 = (iHashCode2 + (chartDisplayV0InputXAxis == null ? 0 : chartDisplayV0InputXAxis.hashCode())) * 31;
        ChartDisplayV0InputYAxis chartDisplayV0InputYAxis = this.y_axis;
        return iHashCode3 + (chartDisplayV0InputYAxis != null ? chartDisplayV0InputYAxis.hashCode() : 0);
    }

    public String toString() {
        return "ChartDisplayV0Input(series=" + this.series + ", style=" + this.style + ", title=" + this.title + ", x_axis=" + this.x_axis + ", y_axis=" + this.y_axis + ")";
    }

    public ChartDisplayV0Input(List<ChartDisplayV0InputSeriesItem> list, ChartDisplayV0InputStyle chartDisplayV0InputStyle, String str, ChartDisplayV0InputXAxis chartDisplayV0InputXAxis, ChartDisplayV0InputYAxis chartDisplayV0InputYAxis) {
        list.getClass();
        chartDisplayV0InputStyle.getClass();
        this.series = list;
        this.style = chartDisplayV0InputStyle;
        this.title = str;
        this.x_axis = chartDisplayV0InputXAxis;
        this.y_axis = chartDisplayV0InputYAxis;
    }

    public /* synthetic */ ChartDisplayV0Input(List list, ChartDisplayV0InputStyle chartDisplayV0InputStyle, String str, ChartDisplayV0InputXAxis chartDisplayV0InputXAxis, ChartDisplayV0InputYAxis chartDisplayV0InputYAxis, int i, mq5 mq5Var) {
        this(list, chartDisplayV0InputStyle, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : chartDisplayV0InputXAxis, (i & 16) != 0 ? null : chartDisplayV0InputYAxis);
    }
}
