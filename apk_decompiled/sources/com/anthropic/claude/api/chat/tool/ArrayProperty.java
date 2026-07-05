package com.anthropic.claude.api.chat.tool;

import defpackage.e79;
import defpackage.gp0;
import defpackage.j7;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u001c¨\u00065"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/ArrayProperty;", "Lcom/anthropic/claude/api/chat/tool/PropertyDefinition;", "", "description", "items", "", "minItems", "maxItems", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/PropertyDefinition;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/chat/tool/PropertyDefinition;Ljava/lang/Integer;Ljava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/ArrayProperty;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/api/chat/tool/PropertyDefinition;", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/PropertyDefinition;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/anthropic/claude/api/chat/tool/ArrayProperty;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "Lcom/anthropic/claude/api/chat/tool/PropertyDefinition;", "getItems", "Ljava/lang/Integer;", "getMinItems", "getMinItems$annotations", "()V", "getMaxItems", "getMaxItems$annotations", "Companion", "fp0", "gp0", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ArrayProperty implements PropertyDefinition {
    public static final int $stable = 0;
    private final String description;
    private final PropertyDefinition items;
    private final Integer maxItems;
    private final Integer minItems;
    public static final gp0 Companion = new gp0();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new j7(25)), null, null};

    public /* synthetic */ ArrayProperty(int i, String str, PropertyDefinition propertyDefinition, Integer num, Integer num2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        if ((i & 2) == 0) {
            this.items = null;
        } else {
            this.items = propertyDefinition;
        }
        if ((i & 4) == 0) {
            this.minItems = null;
        } else {
            this.minItems = num;
        }
        if ((i & 8) == 0) {
            this.maxItems = null;
        } else {
            this.maxItems = num2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return PropertyDefinition.Companion.serializer();
    }

    public static /* synthetic */ ArrayProperty copy$default(ArrayProperty arrayProperty, String str, PropertyDefinition propertyDefinition, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = arrayProperty.description;
        }
        if ((i & 2) != 0) {
            propertyDefinition = arrayProperty.items;
        }
        if ((i & 4) != 0) {
            num = arrayProperty.minItems;
        }
        if ((i & 8) != 0) {
            num2 = arrayProperty.maxItems;
        }
        return arrayProperty.copy(str, propertyDefinition, num, num2);
    }

    public static /* synthetic */ void getMaxItems$annotations() {
    }

    public static /* synthetic */ void getMinItems$annotations() {
    }

    public static final /* synthetic */ void write$Self$api(ArrayProperty self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.getDescription() != null) {
            output.B(serialDesc, 0, srg.a, self.getDescription());
        }
        if (output.E(serialDesc) || self.items != null) {
            output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.items);
        }
        if (output.E(serialDesc) || self.minItems != null) {
            output.B(serialDesc, 2, e79.a, self.minItems);
        }
        if (!output.E(serialDesc) && self.maxItems == null) {
            return;
        }
        output.B(serialDesc, 3, e79.a, self.maxItems);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PropertyDefinition getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMinItems() {
        return this.minItems;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getMaxItems() {
        return this.maxItems;
    }

    public final ArrayProperty copy(String description, PropertyDefinition items, Integer minItems, Integer maxItems) {
        return new ArrayProperty(description, items, minItems, maxItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArrayProperty)) {
            return false;
        }
        ArrayProperty arrayProperty = (ArrayProperty) other;
        return x44.r(this.description, arrayProperty.description) && x44.r(this.items, arrayProperty.items) && x44.r(this.minItems, arrayProperty.minItems) && x44.r(this.maxItems, arrayProperty.maxItems);
    }

    @Override // com.anthropic.claude.api.chat.tool.PropertyDefinition
    public String getDescription() {
        return this.description;
    }

    public final PropertyDefinition getItems() {
        return this.items;
    }

    public final Integer getMaxItems() {
        return this.maxItems;
    }

    public final Integer getMinItems() {
        return this.minItems;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PropertyDefinition propertyDefinition = this.items;
        int iHashCode2 = (iHashCode + (propertyDefinition == null ? 0 : propertyDefinition.hashCode())) * 31;
        Integer num = this.minItems;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxItems;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "ArrayProperty(description=" + this.description + ", items=" + this.items + ", minItems=" + this.minItems + ", maxItems=" + this.maxItems + ")";
    }

    public ArrayProperty() {
        this((String) null, (PropertyDefinition) null, (Integer) null, (Integer) null, 15, (mq5) null);
    }

    public ArrayProperty(String str, PropertyDefinition propertyDefinition, Integer num, Integer num2) {
        this.description = str;
        this.items = propertyDefinition;
        this.minItems = num;
        this.maxItems = num2;
    }

    public /* synthetic */ ArrayProperty(String str, PropertyDefinition propertyDefinition, Integer num, Integer num2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : propertyDefinition, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }
}
