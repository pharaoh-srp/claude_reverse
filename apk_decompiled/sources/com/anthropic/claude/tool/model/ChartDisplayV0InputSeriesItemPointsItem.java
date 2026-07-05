package com.anthropic.claude.tool.model;

import defpackage.fk2;
import defpackage.gk2;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Lcom/anthropic/claude/tool/model/ChartDisplayV0InputSeriesItemPointsItem;", "", "", "x", "y", "<init>", "(DD)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IDDLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/ChartDisplayV0InputSeriesItemPointsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()D", "component2", "copy", "(DD)Lcom/anthropic/claude/tool/model/ChartDisplayV0InputSeriesItemPointsItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getX", "getY", "Companion", "fk2", "gk2", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChartDisplayV0InputSeriesItemPointsItem {
    public static final gk2 Companion = new gk2();
    private final double x;
    private final double y;

    public /* synthetic */ ChartDisplayV0InputSeriesItemPointsItem(int i, double d, double d2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, fk2.a.getDescriptor());
            throw null;
        }
        this.x = d;
        this.y = d2;
    }

    public static /* synthetic */ ChartDisplayV0InputSeriesItemPointsItem copy$default(ChartDisplayV0InputSeriesItemPointsItem chartDisplayV0InputSeriesItemPointsItem, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = chartDisplayV0InputSeriesItemPointsItem.x;
        }
        if ((i & 2) != 0) {
            d2 = chartDisplayV0InputSeriesItemPointsItem.y;
        }
        return chartDisplayV0InputSeriesItemPointsItem.copy(d, d2);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(ChartDisplayV0InputSeriesItemPointsItem self, vd4 output, SerialDescriptor serialDesc) {
        output.z(serialDesc, 0, self.x);
        output.z(serialDesc, 1, self.y);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getY() {
        return this.y;
    }

    public final ChartDisplayV0InputSeriesItemPointsItem copy(double x, double y) {
        return new ChartDisplayV0InputSeriesItemPointsItem(x, y);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartDisplayV0InputSeriesItemPointsItem)) {
            return false;
        }
        ChartDisplayV0InputSeriesItemPointsItem chartDisplayV0InputSeriesItemPointsItem = (ChartDisplayV0InputSeriesItemPointsItem) other;
        return Double.compare(this.x, chartDisplayV0InputSeriesItemPointsItem.x) == 0 && Double.compare(this.y, chartDisplayV0InputSeriesItemPointsItem.y) == 0;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        return Double.hashCode(this.y) + (Double.hashCode(this.x) * 31);
    }

    public String toString() {
        return "ChartDisplayV0InputSeriesItemPointsItem(x=" + this.x + ", y=" + this.y + ")";
    }

    public ChartDisplayV0InputSeriesItemPointsItem(double d, double d2) {
        this.x = d;
        this.y = d2;
    }
}
