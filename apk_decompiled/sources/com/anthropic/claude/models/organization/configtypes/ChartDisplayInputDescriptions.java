package com.anthropic.claude.models.organization.configtypes;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qj2;
import defpackage.rj2;
import defpackage.sj2;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wk2;
import defpackage.x44;
import defpackage.yk2;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%JL\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%¨\u0006<"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayInputDescriptions;", "", "", "tool_description", "Lcom/anthropic/claude/models/organization/configtypes/ChartDisplaySeriesArrayDescription;", "series", "style", "title", "Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayXAxisDescription;", "x_axis", "Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayYAxisDescription;", "y_axis", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/ChartDisplaySeriesArrayDescription;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayXAxisDescription;Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayYAxisDescription;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/ChartDisplaySeriesArrayDescription;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayXAxisDescription;Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayYAxisDescription;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayInputDescriptions;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/models/organization/configtypes/ChartDisplaySeriesArrayDescription;", "component3", "component4", "component5", "()Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayXAxisDescription;", "component6", "()Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayYAxisDescription;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/ChartDisplaySeriesArrayDescription;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayXAxisDescription;Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayYAxisDescription;)Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayInputDescriptions;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_description", "Lcom/anthropic/claude/models/organization/configtypes/ChartDisplaySeriesArrayDescription;", "getSeries", "getStyle", "getTitle", "Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayXAxisDescription;", "getX_axis", "Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayYAxisDescription;", "getY_axis", "Companion", "qj2", "rj2", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChartDisplayInputDescriptions {
    public static final int $stable = 0;
    public static final rj2 Companion = new rj2();
    private final ChartDisplaySeriesArrayDescription series;
    private final String style;
    private final String title;
    private final String tool_description;
    private final ChartDisplayXAxisDescription x_axis;
    private final ChartDisplayYAxisDescription y_axis;

    public ChartDisplayInputDescriptions(String str, ChartDisplaySeriesArrayDescription chartDisplaySeriesArrayDescription, String str2, String str3, ChartDisplayXAxisDescription chartDisplayXAxisDescription, ChartDisplayYAxisDescription chartDisplayYAxisDescription) {
        str.getClass();
        chartDisplaySeriesArrayDescription.getClass();
        str2.getClass();
        str3.getClass();
        chartDisplayXAxisDescription.getClass();
        chartDisplayYAxisDescription.getClass();
        this.tool_description = str;
        this.series = chartDisplaySeriesArrayDescription;
        this.style = str2;
        this.title = str3;
        this.x_axis = chartDisplayXAxisDescription;
        this.y_axis = chartDisplayYAxisDescription;
    }

    public static /* synthetic */ ChartDisplayInputDescriptions copy$default(ChartDisplayInputDescriptions chartDisplayInputDescriptions, String str, ChartDisplaySeriesArrayDescription chartDisplaySeriesArrayDescription, String str2, String str3, ChartDisplayXAxisDescription chartDisplayXAxisDescription, ChartDisplayYAxisDescription chartDisplayYAxisDescription, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chartDisplayInputDescriptions.tool_description;
        }
        if ((i & 2) != 0) {
            chartDisplaySeriesArrayDescription = chartDisplayInputDescriptions.series;
        }
        if ((i & 4) != 0) {
            str2 = chartDisplayInputDescriptions.style;
        }
        if ((i & 8) != 0) {
            str3 = chartDisplayInputDescriptions.title;
        }
        if ((i & 16) != 0) {
            chartDisplayXAxisDescription = chartDisplayInputDescriptions.x_axis;
        }
        if ((i & 32) != 0) {
            chartDisplayYAxisDescription = chartDisplayInputDescriptions.y_axis;
        }
        ChartDisplayXAxisDescription chartDisplayXAxisDescription2 = chartDisplayXAxisDescription;
        ChartDisplayYAxisDescription chartDisplayYAxisDescription2 = chartDisplayYAxisDescription;
        return chartDisplayInputDescriptions.copy(str, chartDisplaySeriesArrayDescription, str2, str3, chartDisplayXAxisDescription2, chartDisplayYAxisDescription2);
    }

    public static final /* synthetic */ void write$Self$models(ChartDisplayInputDescriptions self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.tool_description);
        output.r(serialDesc, 1, sj2.a, self.series);
        output.q(serialDesc, 2, self.style);
        output.q(serialDesc, 3, self.title);
        output.r(serialDesc, 4, wk2.a, self.x_axis);
        output.r(serialDesc, 5, yk2.a, self.y_axis);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTool_description() {
        return this.tool_description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChartDisplaySeriesArrayDescription getSeries() {
        return this.series;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChartDisplayXAxisDescription getX_axis() {
        return this.x_axis;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ChartDisplayYAxisDescription getY_axis() {
        return this.y_axis;
    }

    public final ChartDisplayInputDescriptions copy(String tool_description, ChartDisplaySeriesArrayDescription series, String style, String title, ChartDisplayXAxisDescription x_axis, ChartDisplayYAxisDescription y_axis) {
        tool_description.getClass();
        series.getClass();
        style.getClass();
        title.getClass();
        x_axis.getClass();
        y_axis.getClass();
        return new ChartDisplayInputDescriptions(tool_description, series, style, title, x_axis, y_axis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartDisplayInputDescriptions)) {
            return false;
        }
        ChartDisplayInputDescriptions chartDisplayInputDescriptions = (ChartDisplayInputDescriptions) other;
        return x44.r(this.tool_description, chartDisplayInputDescriptions.tool_description) && x44.r(this.series, chartDisplayInputDescriptions.series) && x44.r(this.style, chartDisplayInputDescriptions.style) && x44.r(this.title, chartDisplayInputDescriptions.title) && x44.r(this.x_axis, chartDisplayInputDescriptions.x_axis) && x44.r(this.y_axis, chartDisplayInputDescriptions.y_axis);
    }

    public final ChartDisplaySeriesArrayDescription getSeries() {
        return this.series;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTool_description() {
        return this.tool_description;
    }

    public final ChartDisplayXAxisDescription getX_axis() {
        return this.x_axis;
    }

    public final ChartDisplayYAxisDescription getY_axis() {
        return this.y_axis;
    }

    public int hashCode() {
        return this.y_axis.hashCode() + ((this.x_axis.hashCode() + kgh.l(kgh.l((this.series.hashCode() + (this.tool_description.hashCode() * 31)) * 31, 31, this.style), 31, this.title)) * 31);
    }

    public String toString() {
        String str = this.tool_description;
        ChartDisplaySeriesArrayDescription chartDisplaySeriesArrayDescription = this.series;
        String str2 = this.style;
        String str3 = this.title;
        ChartDisplayXAxisDescription chartDisplayXAxisDescription = this.x_axis;
        ChartDisplayYAxisDescription chartDisplayYAxisDescription = this.y_axis;
        StringBuilder sb = new StringBuilder("ChartDisplayInputDescriptions(tool_description=");
        sb.append(str);
        sb.append(", series=");
        sb.append(chartDisplaySeriesArrayDescription);
        sb.append(", style=");
        kgh.u(sb, str2, ", title=", str3, ", x_axis=");
        sb.append(chartDisplayXAxisDescription);
        sb.append(", y_axis=");
        sb.append(chartDisplayYAxisDescription);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ChartDisplayInputDescriptions(int i, String str, ChartDisplaySeriesArrayDescription chartDisplaySeriesArrayDescription, String str2, String str3, ChartDisplayXAxisDescription chartDisplayXAxisDescription, ChartDisplayYAxisDescription chartDisplayYAxisDescription, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, qj2.a.getDescriptor());
            throw null;
        }
        this.tool_description = str;
        this.series = chartDisplaySeriesArrayDescription;
        this.style = str2;
        this.title = str3;
        this.x_axis = chartDisplayXAxisDescription;
        this.y_axis = chartDisplayYAxisDescription;
    }
}
