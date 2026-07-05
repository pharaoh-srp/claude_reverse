package com.anthropic.claude.models.organization.configtypes;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wk2;
import defpackage.x44;
import defpackage.xk2;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJV\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001b¨\u00066"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayXAxisDescription;", "", "", "description", "data", "format", "max", "min", "scale", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayXAxisDescription;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayXAxisDescription;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "getData", "getFormat", "getMax", "getMin", "getScale", "getTitle", "Companion", "wk2", "xk2", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChartDisplayXAxisDescription {
    public static final int $stable = 0;
    public static final xk2 Companion = new xk2();
    private final String data;
    private final String description;
    private final String format;
    private final String max;
    private final String min;
    private final String scale;
    private final String title;

    public /* synthetic */ ChartDisplayXAxisDescription(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, vnf vnfVar) {
        if (127 != (i & 127)) {
            gvj.f(i, 127, wk2.a.getDescriptor());
            throw null;
        }
        this.description = str;
        this.data = str2;
        this.format = str3;
        this.max = str4;
        this.min = str5;
        this.scale = str6;
        this.title = str7;
    }

    public static /* synthetic */ ChartDisplayXAxisDescription copy$default(ChartDisplayXAxisDescription chartDisplayXAxisDescription, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chartDisplayXAxisDescription.description;
        }
        if ((i & 2) != 0) {
            str2 = chartDisplayXAxisDescription.data;
        }
        if ((i & 4) != 0) {
            str3 = chartDisplayXAxisDescription.format;
        }
        if ((i & 8) != 0) {
            str4 = chartDisplayXAxisDescription.max;
        }
        if ((i & 16) != 0) {
            str5 = chartDisplayXAxisDescription.min;
        }
        if ((i & 32) != 0) {
            str6 = chartDisplayXAxisDescription.scale;
        }
        if ((i & 64) != 0) {
            str7 = chartDisplayXAxisDescription.title;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return chartDisplayXAxisDescription.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$models(ChartDisplayXAxisDescription self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.description);
        output.q(serialDesc, 1, self.data);
        output.q(serialDesc, 2, self.format);
        output.q(serialDesc, 3, self.max);
        output.q(serialDesc, 4, self.min);
        output.q(serialDesc, 5, self.scale);
        output.q(serialDesc, 6, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ChartDisplayXAxisDescription copy(String description, String data, String format, String max, String min, String scale, String title) {
        y6a.s(description, data, format, max, min);
        scale.getClass();
        title.getClass();
        return new ChartDisplayXAxisDescription(description, data, format, max, min, scale, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartDisplayXAxisDescription)) {
            return false;
        }
        ChartDisplayXAxisDescription chartDisplayXAxisDescription = (ChartDisplayXAxisDescription) other;
        return x44.r(this.description, chartDisplayXAxisDescription.description) && x44.r(this.data, chartDisplayXAxisDescription.data) && x44.r(this.format, chartDisplayXAxisDescription.format) && x44.r(this.max, chartDisplayXAxisDescription.max) && x44.r(this.min, chartDisplayXAxisDescription.min) && x44.r(this.scale, chartDisplayXAxisDescription.scale) && x44.r(this.title, chartDisplayXAxisDescription.title);
    }

    public final String getData() {
        return this.data;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getMax() {
        return this.max;
    }

    public final String getMin() {
        return this.min;
    }

    public final String getScale() {
        return this.scale;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(this.description.hashCode() * 31, 31, this.data), 31, this.format), 31, this.max), 31, this.min), 31, this.scale);
    }

    public String toString() {
        String str = this.description;
        String str2 = this.data;
        String str3 = this.format;
        String str4 = this.max;
        String str5 = this.min;
        String str6 = this.scale;
        String str7 = this.title;
        StringBuilder sbR = kgh.r("ChartDisplayXAxisDescription(description=", str, ", data=", str2, ", format=");
        kgh.u(sbR, str3, ", max=", str4, ", min=");
        kgh.u(sbR, str5, ", scale=", str6, ", title=");
        return ij0.m(sbR, str7, ")");
    }

    public ChartDisplayXAxisDescription(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        y6a.s(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.description = str;
        this.data = str2;
        this.format = str3;
        this.max = str4;
        this.min = str5;
        this.scale = str6;
        this.title = str7;
    }
}
