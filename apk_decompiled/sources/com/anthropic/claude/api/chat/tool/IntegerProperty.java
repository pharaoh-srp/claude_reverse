package com.anthropic.claude.api.chat.tool;

import defpackage.e79;
import defpackage.m79;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0019¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/IntegerProperty;", "Lcom/anthropic/claude/api/chat/tool/PropertyDefinition;", "", "description", "", "minimum", "maximum", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/IntegerProperty;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/anthropic/claude/api/chat/tool/IntegerProperty;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "Ljava/lang/Integer;", "getMinimum", "getMaximum", "Companion", "l79", "m79", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class IntegerProperty implements PropertyDefinition {
    public static final int $stable = 0;
    public static final m79 Companion = new m79();
    private final String description;
    private final Integer maximum;
    private final Integer minimum;

    public /* synthetic */ IntegerProperty(int i, String str, Integer num, Integer num2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        if ((i & 2) == 0) {
            this.minimum = null;
        } else {
            this.minimum = num;
        }
        if ((i & 4) == 0) {
            this.maximum = null;
        } else {
            this.maximum = num2;
        }
    }

    public static /* synthetic */ IntegerProperty copy$default(IntegerProperty integerProperty, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = integerProperty.description;
        }
        if ((i & 2) != 0) {
            num = integerProperty.minimum;
        }
        if ((i & 4) != 0) {
            num2 = integerProperty.maximum;
        }
        return integerProperty.copy(str, num, num2);
    }

    public static final /* synthetic */ void write$Self$api(IntegerProperty self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.getDescription() != null) {
            output.B(serialDesc, 0, srg.a, self.getDescription());
        }
        if (output.E(serialDesc) || self.minimum != null) {
            output.B(serialDesc, 1, e79.a, self.minimum);
        }
        if (!output.E(serialDesc) && self.maximum == null) {
            return;
        }
        output.B(serialDesc, 2, e79.a, self.maximum);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMinimum() {
        return this.minimum;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMaximum() {
        return this.maximum;
    }

    public final IntegerProperty copy(String description, Integer minimum, Integer maximum) {
        return new IntegerProperty(description, minimum, maximum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegerProperty)) {
            return false;
        }
        IntegerProperty integerProperty = (IntegerProperty) other;
        return x44.r(this.description, integerProperty.description) && x44.r(this.minimum, integerProperty.minimum) && x44.r(this.maximum, integerProperty.maximum);
    }

    @Override // com.anthropic.claude.api.chat.tool.PropertyDefinition
    public String getDescription() {
        return this.description;
    }

    public final Integer getMaximum() {
        return this.maximum;
    }

    public final Integer getMinimum() {
        return this.minimum;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.minimum;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maximum;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "IntegerProperty(description=" + this.description + ", minimum=" + this.minimum + ", maximum=" + this.maximum + ")";
    }

    public IntegerProperty() {
        this((String) null, (Integer) null, (Integer) null, 7, (mq5) null);
    }

    public IntegerProperty(String str, Integer num, Integer num2) {
        this.description = str;
        this.minimum = num;
        this.maximum = num2;
    }

    public /* synthetic */ IntegerProperty(String str, Integer num, Integer num2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
