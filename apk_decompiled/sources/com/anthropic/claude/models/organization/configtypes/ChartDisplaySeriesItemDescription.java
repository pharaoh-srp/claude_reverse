package com.anthropic.claude.models.organization.configtypes;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.uj2;
import defpackage.vd4;
import defpackage.vj2;
import defpackage.vnf;
import defpackage.wj2;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00063"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/ChartDisplaySeriesItemDescription;", "", "", "description", "color", "name", "Lcom/anthropic/claude/models/organization/configtypes/ChartDisplaySeriesItemPointsArrayDescription;", "points", "values", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/ChartDisplaySeriesItemPointsArrayDescription;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/ChartDisplaySeriesItemPointsArrayDescription;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/ChartDisplaySeriesItemDescription;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/models/organization/configtypes/ChartDisplaySeriesItemPointsArrayDescription;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/ChartDisplaySeriesItemPointsArrayDescription;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/ChartDisplaySeriesItemDescription;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "getColor", "getName", "Lcom/anthropic/claude/models/organization/configtypes/ChartDisplaySeriesItemPointsArrayDescription;", "getPoints", "getValues", "Companion", "uj2", "vj2", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChartDisplaySeriesItemDescription {
    public static final int $stable = 0;
    public static final vj2 Companion = new vj2();
    private final String color;
    private final String description;
    private final String name;
    private final ChartDisplaySeriesItemPointsArrayDescription points;
    private final String values;

    public /* synthetic */ ChartDisplaySeriesItemDescription(int i, String str, String str2, String str3, ChartDisplaySeriesItemPointsArrayDescription chartDisplaySeriesItemPointsArrayDescription, String str4, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, uj2.a.getDescriptor());
            throw null;
        }
        this.description = str;
        this.color = str2;
        this.name = str3;
        this.points = chartDisplaySeriesItemPointsArrayDescription;
        this.values = str4;
    }

    public static /* synthetic */ ChartDisplaySeriesItemDescription copy$default(ChartDisplaySeriesItemDescription chartDisplaySeriesItemDescription, String str, String str2, String str3, ChartDisplaySeriesItemPointsArrayDescription chartDisplaySeriesItemPointsArrayDescription, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chartDisplaySeriesItemDescription.description;
        }
        if ((i & 2) != 0) {
            str2 = chartDisplaySeriesItemDescription.color;
        }
        if ((i & 4) != 0) {
            str3 = chartDisplaySeriesItemDescription.name;
        }
        if ((i & 8) != 0) {
            chartDisplaySeriesItemPointsArrayDescription = chartDisplaySeriesItemDescription.points;
        }
        if ((i & 16) != 0) {
            str4 = chartDisplaySeriesItemDescription.values;
        }
        String str5 = str4;
        String str6 = str3;
        return chartDisplaySeriesItemDescription.copy(str, str2, str6, chartDisplaySeriesItemPointsArrayDescription, str5);
    }

    public static final /* synthetic */ void write$Self$models(ChartDisplaySeriesItemDescription self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.description);
        output.q(serialDesc, 1, self.color);
        output.q(serialDesc, 2, self.name);
        output.r(serialDesc, 3, wj2.a, self.points);
        output.q(serialDesc, 4, self.values);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChartDisplaySeriesItemPointsArrayDescription getPoints() {
        return this.points;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValues() {
        return this.values;
    }

    public final ChartDisplaySeriesItemDescription copy(String description, String color, String name, ChartDisplaySeriesItemPointsArrayDescription points, String values) {
        description.getClass();
        color.getClass();
        name.getClass();
        points.getClass();
        values.getClass();
        return new ChartDisplaySeriesItemDescription(description, color, name, points, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartDisplaySeriesItemDescription)) {
            return false;
        }
        ChartDisplaySeriesItemDescription chartDisplaySeriesItemDescription = (ChartDisplaySeriesItemDescription) other;
        return x44.r(this.description, chartDisplaySeriesItemDescription.description) && x44.r(this.color, chartDisplaySeriesItemDescription.color) && x44.r(this.name, chartDisplaySeriesItemDescription.name) && x44.r(this.points, chartDisplaySeriesItemDescription.points) && x44.r(this.values, chartDisplaySeriesItemDescription.values);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final ChartDisplaySeriesItemPointsArrayDescription getPoints() {
        return this.points;
    }

    public final String getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() + ((this.points.hashCode() + kgh.l(kgh.l(this.description.hashCode() * 31, 31, this.color), 31, this.name)) * 31);
    }

    public String toString() {
        String str = this.description;
        String str2 = this.color;
        String str3 = this.name;
        ChartDisplaySeriesItemPointsArrayDescription chartDisplaySeriesItemPointsArrayDescription = this.points;
        String str4 = this.values;
        StringBuilder sbR = kgh.r("ChartDisplaySeriesItemDescription(description=", str, ", color=", str2, ", name=");
        sbR.append(str3);
        sbR.append(", points=");
        sbR.append(chartDisplaySeriesItemPointsArrayDescription);
        sbR.append(", values=");
        return ij0.m(sbR, str4, ")");
    }

    public ChartDisplaySeriesItemDescription(String str, String str2, String str3, ChartDisplaySeriesItemPointsArrayDescription chartDisplaySeriesItemPointsArrayDescription, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        chartDisplaySeriesItemPointsArrayDescription.getClass();
        str4.getClass();
        this.description = str;
        this.color = str2;
        this.name = str3;
        this.points = chartDisplaySeriesItemPointsArrayDescription;
        this.values = str4;
    }
}
