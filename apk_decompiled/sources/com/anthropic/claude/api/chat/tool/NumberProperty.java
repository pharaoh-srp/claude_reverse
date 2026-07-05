package com.anthropic.claude.api.chat.tool;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.na6;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.z9c;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lcom/anthropic/claude/api/chat/tool/NumberProperty;", "Lcom/anthropic/claude/api/chat/tool/PropertyDefinition;", "", "description", "", "minimum", "maximum", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/NumberProperty;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Double;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/anthropic/claude/api/chat/tool/NumberProperty;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "Ljava/lang/Double;", "getMinimum", "getMaximum", "Companion", "y9c", "z9c", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class NumberProperty implements PropertyDefinition {
    public static final int $stable = 0;
    public static final z9c Companion = new z9c();
    private final String description;
    private final Double maximum;
    private final Double minimum;

    public /* synthetic */ NumberProperty(int i, String str, Double d, Double d2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        if ((i & 2) == 0) {
            this.minimum = null;
        } else {
            this.minimum = d;
        }
        if ((i & 4) == 0) {
            this.maximum = null;
        } else {
            this.maximum = d2;
        }
    }

    public static /* synthetic */ NumberProperty copy$default(NumberProperty numberProperty, String str, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = numberProperty.description;
        }
        if ((i & 2) != 0) {
            d = numberProperty.minimum;
        }
        if ((i & 4) != 0) {
            d2 = numberProperty.maximum;
        }
        return numberProperty.copy(str, d, d2);
    }

    public static final /* synthetic */ void write$Self$api(NumberProperty self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.getDescription() != null) {
            output.B(serialDesc, 0, srg.a, self.getDescription());
        }
        if (output.E(serialDesc) || self.minimum != null) {
            output.B(serialDesc, 1, na6.a, self.minimum);
        }
        if (!output.E(serialDesc) && self.maximum == null) {
            return;
        }
        output.B(serialDesc, 2, na6.a, self.maximum);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getMinimum() {
        return this.minimum;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getMaximum() {
        return this.maximum;
    }

    public final NumberProperty copy(String description, Double minimum, Double maximum) {
        return new NumberProperty(description, minimum, maximum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NumberProperty)) {
            return false;
        }
        NumberProperty numberProperty = (NumberProperty) other;
        return x44.r(this.description, numberProperty.description) && x44.r(this.minimum, numberProperty.minimum) && x44.r(this.maximum, numberProperty.maximum);
    }

    @Override // com.anthropic.claude.api.chat.tool.PropertyDefinition
    public String getDescription() {
        return this.description;
    }

    public final Double getMaximum() {
        return this.maximum;
    }

    public final Double getMinimum() {
        return this.minimum;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.minimum;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.maximum;
        return iHashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        return "NumberProperty(description=" + this.description + ", minimum=" + this.minimum + ", maximum=" + this.maximum + ")";
    }

    public NumberProperty() {
        this((String) null, (Double) null, (Double) null, 7, (mq5) null);
    }

    public NumberProperty(String str, Double d, Double d2) {
        this.description = str;
        this.minimum = d;
        this.maximum = d2;
    }

    public /* synthetic */ NumberProperty(String str, Double d, Double d2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2);
    }
}
