package com.anthropic.claude.mcpapps.transport;

import defpackage.azh;
import defpackage.bzh;
import defpackage.eh9;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.n7h;
import defpackage.onf;
import defpackage.uh9;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJD\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b\u0006\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001fR\u001f\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001f¨\u00066"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/ToolResultParams;", "", "", "Lkotlinx/serialization/json/JsonElement;", "content", "", "isError", "Lkotlinx/serialization/json/JsonObject;", "structuredContent", "_meta", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/ToolResultParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lkotlinx/serialization/json/JsonObject;", "component4", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/mcpapps/transport/ToolResultParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getContent", "Ljava/lang/Boolean;", "Lkotlinx/serialization/json/JsonObject;", "getStructuredContent", "get_meta", "get_meta$annotations", "()V", "Companion", "azh", "bzh", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ToolResultParams {
    public static final int $stable = 8;
    private final JsonObject _meta;
    private final List<JsonElement> content;
    private final Boolean isError;
    private final JsonObject structuredContent;
    public static final bzh Companion = new bzh();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new n7h(21)), null, null, null};

    public /* synthetic */ ToolResultParams(int i, List list, Boolean bool, JsonObject jsonObject, JsonObject jsonObject2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, azh.a.getDescriptor());
            throw null;
        }
        this.content = list;
        if ((i & 2) == 0) {
            this.isError = null;
        } else {
            this.isError = bool;
        }
        if ((i & 4) == 0) {
            this.structuredContent = null;
        } else {
            this.structuredContent = jsonObject;
        }
        if ((i & 8) == 0) {
            this._meta = null;
        } else {
            this._meta = jsonObject2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(eh9.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToolResultParams copy$default(ToolResultParams toolResultParams, List list, Boolean bool, JsonObject jsonObject, JsonObject jsonObject2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = toolResultParams.content;
        }
        if ((i & 2) != 0) {
            bool = toolResultParams.isError;
        }
        if ((i & 4) != 0) {
            jsonObject = toolResultParams.structuredContent;
        }
        if ((i & 8) != 0) {
            jsonObject2 = toolResultParams._meta;
        }
        return toolResultParams.copy(list, bool, jsonObject, jsonObject2);
    }

    public static /* synthetic */ void get_meta$annotations() {
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(ToolResultParams self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.content);
        if (output.E(serialDesc) || self.isError != null) {
            output.B(serialDesc, 1, zt1.a, self.isError);
        }
        if (output.E(serialDesc) || self.structuredContent != null) {
            output.B(serialDesc, 2, uh9.a, self.structuredContent);
        }
        if (!output.E(serialDesc) && self._meta == null) {
            return;
        }
        output.B(serialDesc, 3, uh9.a, self._meta);
    }

    public final List<JsonElement> component1() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getStructuredContent() {
        return this.structuredContent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JsonObject get_meta() {
        return this._meta;
    }

    public final ToolResultParams copy(List<? extends JsonElement> content, Boolean isError, JsonObject structuredContent, JsonObject _meta) {
        content.getClass();
        return new ToolResultParams(content, isError, structuredContent, _meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolResultParams)) {
            return false;
        }
        ToolResultParams toolResultParams = (ToolResultParams) other;
        return x44.r(this.content, toolResultParams.content) && x44.r(this.isError, toolResultParams.isError) && x44.r(this.structuredContent, toolResultParams.structuredContent) && x44.r(this._meta, toolResultParams._meta);
    }

    public final List<JsonElement> getContent() {
        return this.content;
    }

    public final JsonObject getStructuredContent() {
        return this.structuredContent;
    }

    public final JsonObject get_meta() {
        return this._meta;
    }

    public int hashCode() {
        int iHashCode = this.content.hashCode() * 31;
        Boolean bool = this.isError;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        JsonObject jsonObject = this.structuredContent;
        int iHashCode3 = (iHashCode2 + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        JsonObject jsonObject2 = this._meta;
        return iHashCode3 + (jsonObject2 != null ? jsonObject2.hashCode() : 0);
    }

    public final Boolean isError() {
        return this.isError;
    }

    public String toString() {
        return "ToolResultParams(content=" + this.content + ", isError=" + this.isError + ", structuredContent=" + this.structuredContent + ", _meta=" + this._meta + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToolResultParams(List<? extends JsonElement> list, Boolean bool, JsonObject jsonObject, JsonObject jsonObject2) {
        list.getClass();
        this.content = list;
        this.isError = bool;
        this.structuredContent = jsonObject;
        this._meta = jsonObject2;
    }

    public /* synthetic */ ToolResultParams(List list, Boolean bool, JsonObject jsonObject, JsonObject jsonObject2, int i, mq5 mq5Var) {
        this(list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : jsonObject, (i & 8) != 0 ? null : jsonObject2);
    }
}
