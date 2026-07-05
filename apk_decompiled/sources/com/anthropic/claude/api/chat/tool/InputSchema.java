package com.anthropic.claude.api.chat.tool;

import defpackage.ebh;
import defpackage.f7a;
import defpackage.gid;
import defpackage.gvj;
import defpackage.jd7;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nm6;
import defpackage.onf;
import defpackage.q49;
import defpackage.r49;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ@\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/InputSchema;", "", "", "type", "", "Lcom/anthropic/claude/api/chat/tool/PropertyDefinition;", "properties", "", "required", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/InputSchema;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lcom/anthropic/claude/api/chat/tool/InputSchema;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Ljava/util/Map;", "getProperties", "Ljava/util/List;", "getRequired", "Companion", "q49", "r49", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class InputSchema {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final r49 Companion = new r49();
    private final Map<String, PropertyDefinition> properties;
    private final List<String> required;
    private final String type;

    static {
        jd7 jd7Var = new jd7(28);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, jd7Var), yb5.w(w1aVar, new jd7(29))};
    }

    public /* synthetic */ InputSchema(int i, String str, Map map, List list, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, q49.a.getDescriptor());
            throw null;
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.properties = nm6.E;
        } else {
            this.properties = map;
        }
        if ((i & 4) == 0) {
            this.required = lm6.E;
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
    public static /* synthetic */ InputSchema copy$default(InputSchema inputSchema, String str, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputSchema.type;
        }
        if ((i & 2) != 0) {
            map = inputSchema.properties;
        }
        if ((i & 4) != 0) {
            list = inputSchema.required;
        }
        return inputSchema.copy(str, map, list);
    }

    public static final /* synthetic */ void write$Self$api(InputSchema self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.type);
        if (output.E(serialDesc) || !x44.r(self.properties, nm6.E)) {
            output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.properties);
        }
        if (!output.E(serialDesc) && x44.r(self.required, lm6.E)) {
            return;
        }
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.required);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final Map<String, PropertyDefinition> component2() {
        return this.properties;
    }

    public final List<String> component3() {
        return this.required;
    }

    public final InputSchema copy(String type, Map<String, ? extends PropertyDefinition> properties, List<String> required) {
        type.getClass();
        properties.getClass();
        required.getClass();
        return new InputSchema(type, properties, required);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputSchema)) {
            return false;
        }
        InputSchema inputSchema = (InputSchema) other;
        return x44.r(this.type, inputSchema.type) && x44.r(this.properties, inputSchema.properties) && x44.r(this.required, inputSchema.required);
    }

    public final Map<String, PropertyDefinition> getProperties() {
        return this.properties;
    }

    public final List<String> getRequired() {
        return this.required;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.required.hashCode() + ebh.g(this.type.hashCode() * 31, 31, this.properties);
    }

    public String toString() {
        String str = this.type;
        Map<String, PropertyDefinition> map = this.properties;
        List<String> list = this.required;
        StringBuilder sb = new StringBuilder("InputSchema(type=");
        sb.append(str);
        sb.append(", properties=");
        sb.append(map);
        sb.append(", required=");
        return gid.q(sb, list, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputSchema(String str, Map<String, ? extends PropertyDefinition> map, List<String> list) {
        str.getClass();
        map.getClass();
        list.getClass();
        this.type = str;
        this.properties = map;
        this.required = list;
    }

    public /* synthetic */ InputSchema(String str, Map map, List list, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? nm6.E : map, (i & 4) != 0 ? lm6.E : list);
    }
}
