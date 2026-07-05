package com.anthropic.claude.api.chat.tool;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.ivh;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.q49;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/Tool;", "", "<init>", "()V", "Companion", "KnownTool", "CustomTool", "ivh", "Lcom/anthropic/claude/api/chat/tool/Tool$CustomTool;", "Lcom/anthropic/claude/api/chat/tool/Tool$KnownTool;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = e.class)
public abstract class Tool {
    public static final int $stable = 0;
    public static final ivh Companion = new ivh();

    public /* synthetic */ Tool(mq5 mq5Var) {
        this();
    }

    private Tool() {
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/api/chat/tool/Tool$KnownTool;", "Lcom/anthropic/claude/api/chat/tool/Tool;", "", "name", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/Tool$KnownTool;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/tool/Tool$KnownTool;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getType", "Companion", "com/anthropic/claude/api/chat/tool/c", "com/anthropic/claude/api/chat/tool/d", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class KnownTool extends Tool {
        public static final int $stable = 0;
        public static final d Companion = new d();
        private final String name;
        private final String type;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ KnownTool(int i, String str, String str2, vnf vnfVar) {
            mq5 mq5Var = null;
            if (3 != (i & 3)) {
                gvj.f(i, 3, c.a.getDescriptor());
                throw null;
            }
            super(mq5Var);
            this.name = str;
            this.type = str2;
        }

        public static /* synthetic */ KnownTool copy$default(KnownTool knownTool, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = knownTool.name;
            }
            if ((i & 2) != 0) {
                str2 = knownTool.type;
            }
            return knownTool.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$api(KnownTool self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.name);
            output.q(serialDesc, 1, self.type);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final KnownTool copy(String name, String type) {
            name.getClass();
            type.getClass();
            return new KnownTool(name, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KnownTool)) {
                return false;
            }
            KnownTool knownTool = (KnownTool) other;
            return x44.r(this.name, knownTool.name) && x44.r(this.type, knownTool.type);
        }

        public final String getName() {
            return this.name;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            return ij0.l("KnownTool(name=", this.name, ", type=", this.type, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KnownTool(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.name = str;
            this.type = str2;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00061"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/Tool$CustomTool;", "Lcom/anthropic/claude/api/chat/tool/Tool;", "", "name", "title", "description", "Lcom/anthropic/claude/api/chat/tool/InputSchema;", "input_schema", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/InputSchema;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/InputSchema;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/Tool$CustomTool;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/api/chat/tool/InputSchema;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/InputSchema;)Lcom/anthropic/claude/api/chat/tool/Tool$CustomTool;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getTitle", "getDescription", "Lcom/anthropic/claude/api/chat/tool/InputSchema;", "getInput_schema", "Companion", "com/anthropic/claude/api/chat/tool/a", "com/anthropic/claude/api/chat/tool/b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class CustomTool extends Tool {
        public static final int $stable = 0;
        public static final b Companion = new b();
        private final String description;
        private final InputSchema input_schema;
        private final String name;
        private final String title;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ CustomTool(int i, String str, String str2, String str3, InputSchema inputSchema, vnf vnfVar) {
            mq5 mq5Var = null;
            if (15 != (i & 15)) {
                gvj.f(i, 15, a.a.getDescriptor());
                throw null;
            }
            super(mq5Var);
            this.name = str;
            this.title = str2;
            this.description = str3;
            this.input_schema = inputSchema;
        }

        public static /* synthetic */ CustomTool copy$default(CustomTool customTool, String str, String str2, String str3, InputSchema inputSchema, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customTool.name;
            }
            if ((i & 2) != 0) {
                str2 = customTool.title;
            }
            if ((i & 4) != 0) {
                str3 = customTool.description;
            }
            if ((i & 8) != 0) {
                inputSchema = customTool.input_schema;
            }
            return customTool.copy(str, str2, str3, inputSchema);
        }

        public static final /* synthetic */ void write$Self$api(CustomTool self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.name);
            output.q(serialDesc, 1, self.title);
            output.q(serialDesc, 2, self.description);
            output.r(serialDesc, 3, q49.a, self.input_schema);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final InputSchema getInput_schema() {
            return this.input_schema;
        }

        public final CustomTool copy(String name, String title, String description, InputSchema input_schema) {
            name.getClass();
            title.getClass();
            description.getClass();
            input_schema.getClass();
            return new CustomTool(name, title, description, input_schema);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomTool)) {
                return false;
            }
            CustomTool customTool = (CustomTool) other;
            return x44.r(this.name, customTool.name) && x44.r(this.title, customTool.title) && x44.r(this.description, customTool.description) && x44.r(this.input_schema, customTool.input_schema);
        }

        public final String getDescription() {
            return this.description;
        }

        public final InputSchema getInput_schema() {
            return this.input_schema;
        }

        public final String getName() {
            return this.name;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.input_schema.hashCode() + kgh.l(kgh.l(this.name.hashCode() * 31, 31, this.title), 31, this.description);
        }

        public String toString() {
            String str = this.name;
            String str2 = this.title;
            String str3 = this.description;
            InputSchema inputSchema = this.input_schema;
            StringBuilder sbR = kgh.r("CustomTool(name=", str, ", title=", str2, ", description=");
            sbR.append(str3);
            sbR.append(", input_schema=");
            sbR.append(inputSchema);
            sbR.append(")");
            return sbR.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomTool(String str, String str2, String str3, InputSchema inputSchema) {
            super(null);
            str.getClass();
            str2.getClass();
            str3.getClass();
            inputSchema.getClass();
            this.name = str;
            this.title = str2;
            this.description = str3;
            this.input_schema = inputSchema;
        }
    }
}
