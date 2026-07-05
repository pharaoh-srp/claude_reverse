package com.anthropic.claude.api.chat.tool;

import defpackage.f7a;
import defpackage.gid;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.oob;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zac;
import defpackage.znf;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBK\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJF\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00061"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/ObjectProperty;", "Lcom/anthropic/claude/api/chat/tool/PropertyDefinition;", "", "description", "", "properties", "", "required", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/ObjectProperty;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lcom/anthropic/claude/api/chat/tool/ObjectProperty;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "Ljava/util/Map;", "getProperties", "Ljava/util/List;", "getRequired", "Companion", "yac", "zac", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ObjectProperty implements PropertyDefinition {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final zac Companion = new zac();
    private final String description;
    private final Map<String, PropertyDefinition> properties;
    private final List<String> required;

    static {
        oob oobVar = new oob(13);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, oobVar), yb5.w(w1aVar, new oob(14))};
    }

    public /* synthetic */ ObjectProperty(int i, String str, Map map, List list, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        if ((i & 2) == 0) {
            this.properties = null;
        } else {
            this.properties = map;
        }
        if ((i & 4) == 0) {
            this.required = null;
        } else {
            this.required = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f7a(srg.a, PropertyDefinition.Companion.serializer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ObjectProperty copy$default(ObjectProperty objectProperty, String str, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = objectProperty.description;
        }
        if ((i & 2) != 0) {
            map = objectProperty.properties;
        }
        if ((i & 4) != 0) {
            list = objectProperty.required;
        }
        return objectProperty.copy(str, map, list);
    }

    public static final /* synthetic */ void write$Self$api(ObjectProperty self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.getDescription() != null) {
            output.B(serialDesc, 0, srg.a, self.getDescription());
        }
        if (output.E(serialDesc) || self.properties != null) {
            output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.properties);
        }
        if (!output.E(serialDesc) && self.required == null) {
            return;
        }
        output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.required);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Map<String, PropertyDefinition> component2() {
        return this.properties;
    }

    public final List<String> component3() {
        return this.required;
    }

    public final ObjectProperty copy(String description, Map<String, ? extends PropertyDefinition> properties, List<String> required) {
        return new ObjectProperty(description, properties, required);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ObjectProperty)) {
            return false;
        }
        ObjectProperty objectProperty = (ObjectProperty) other;
        return x44.r(this.description, objectProperty.description) && x44.r(this.properties, objectProperty.properties) && x44.r(this.required, objectProperty.required);
    }

    @Override // com.anthropic.claude.api.chat.tool.PropertyDefinition
    public String getDescription() {
        return this.description;
    }

    public final Map<String, PropertyDefinition> getProperties() {
        return this.properties;
    }

    public final List<String> getRequired() {
        return this.required;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, PropertyDefinition> map = this.properties;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<String> list = this.required;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.description;
        Map<String, PropertyDefinition> map = this.properties;
        List<String> list = this.required;
        StringBuilder sb = new StringBuilder("ObjectProperty(description=");
        sb.append(str);
        sb.append(", properties=");
        sb.append(map);
        sb.append(", required=");
        return gid.q(sb, list, ")");
    }

    public ObjectProperty() {
        this((String) null, (Map) null, (List) null, 7, (mq5) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectProperty(String str, Map<String, ? extends PropertyDefinition> map, List<String> list) {
        this.description = str;
        this.properties = map;
        this.required = list;
    }

    public /* synthetic */ ObjectProperty(String str, Map map, List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : list);
    }
}
