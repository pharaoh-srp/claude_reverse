package com.anthropic.claude.api.chat.tool;

import defpackage.e79;
import defpackage.kw9;
import defpackage.lrg;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wof;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJR\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001aR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b2\u0010\u001f¨\u00066"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/StringProperty;", "Lcom/anthropic/claude/api/chat/tool/PropertyDefinition;", "", "description", "", "enum", "pattern", "", "minLength", "maxLength", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/StringProperty;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Ljava/lang/Integer;", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/anthropic/claude/api/chat/tool/StringProperty;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "Ljava/util/List;", "getEnum", "getPattern", "Ljava/lang/Integer;", "getMinLength", "getMaxLength", "Companion", "krg", "lrg", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class StringProperty implements PropertyDefinition {
    public static final int $stable = 0;
    private final String description;
    private final List<String> enum;
    private final Integer maxLength;
    private final Integer minLength;
    private final String pattern;
    public static final lrg Companion = new lrg();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new wof(9)), null, null, null};

    public /* synthetic */ StringProperty(int i, String str, List list, String str2, Integer num, Integer num2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        if ((i & 2) == 0) {
            this.enum = null;
        } else {
            this.enum = list;
        }
        if ((i & 4) == 0) {
            this.pattern = null;
        } else {
            this.pattern = str2;
        }
        if ((i & 8) == 0) {
            this.minLength = null;
        } else {
            this.minLength = num;
        }
        if ((i & 16) == 0) {
            this.maxLength = null;
        } else {
            this.maxLength = num2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StringProperty copy$default(StringProperty stringProperty, String str, List list, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringProperty.description;
        }
        if ((i & 2) != 0) {
            list = stringProperty.enum;
        }
        if ((i & 4) != 0) {
            str2 = stringProperty.pattern;
        }
        if ((i & 8) != 0) {
            num = stringProperty.minLength;
        }
        if ((i & 16) != 0) {
            num2 = stringProperty.maxLength;
        }
        Integer num3 = num2;
        String str3 = str2;
        return stringProperty.copy(str, list, str3, num, num3);
    }

    public static final /* synthetic */ void write$Self$api(StringProperty self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.getDescription() != null) {
            output.B(serialDesc, 0, srg.a, self.getDescription());
        }
        if (output.E(serialDesc) || self.enum != null) {
            output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.enum);
        }
        if (output.E(serialDesc) || self.pattern != null) {
            output.B(serialDesc, 2, srg.a, self.pattern);
        }
        if (output.E(serialDesc) || self.minLength != null) {
            output.B(serialDesc, 3, e79.a, self.minLength);
        }
        if (!output.E(serialDesc) && self.maxLength == null) {
            return;
        }
        output.B(serialDesc, 4, e79.a, self.maxLength);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<String> component2() {
        return this.enum;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPattern() {
        return this.pattern;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getMinLength() {
        return this.minLength;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final StringProperty copy(String description, List<String> list, String pattern, Integer minLength, Integer maxLength) {
        return new StringProperty(description, list, pattern, minLength, maxLength);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StringProperty)) {
            return false;
        }
        StringProperty stringProperty = (StringProperty) other;
        return x44.r(this.description, stringProperty.description) && x44.r(this.enum, stringProperty.enum) && x44.r(this.pattern, stringProperty.pattern) && x44.r(this.minLength, stringProperty.minLength) && x44.r(this.maxLength, stringProperty.maxLength);
    }

    @Override // com.anthropic.claude.api.chat.tool.PropertyDefinition
    public String getDescription() {
        return this.description;
    }

    public final List<String> getEnum() {
        return this.enum;
    }

    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final Integer getMinLength() {
        return this.minLength;
    }

    public final String getPattern() {
        return this.pattern;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.enum;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.pattern;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.minLength;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxLength;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "StringProperty(description=" + this.description + ", enum=" + this.enum + ", pattern=" + this.pattern + ", minLength=" + this.minLength + ", maxLength=" + this.maxLength + ")";
    }

    public StringProperty() {
        this((String) null, (List) null, (String) null, (Integer) null, (Integer) null, 31, (mq5) null);
    }

    public StringProperty(String str, List<String> list, String str2, Integer num, Integer num2) {
        this.description = str;
        this.enum = list;
        this.pattern = str2;
        this.minLength = num;
        this.maxLength = num2;
    }

    public /* synthetic */ StringProperty(String str, List list, String str2, Integer num, Integer num2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }
}
