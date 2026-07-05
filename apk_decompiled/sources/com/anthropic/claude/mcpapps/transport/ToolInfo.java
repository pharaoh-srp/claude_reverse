package com.anthropic.claude.mcpapps.transport;

import defpackage.gvj;
import defpackage.ixh;
import defpackage.jxh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/ToolInfo;", "", "", "id", "Lkotlinx/serialization/json/JsonObject;", "tool", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/ToolInfo;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/mcpapps/transport/ToolInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lkotlinx/serialization/json/JsonObject;", "getTool", "Companion", "ixh", "jxh", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ToolInfo {
    public static final int $stable = 8;
    public static final jxh Companion = new jxh();
    private final String id;
    private final JsonObject tool;

    public /* synthetic */ ToolInfo(int i, String str, JsonObject jsonObject, vnf vnfVar) {
        if (2 != (i & 2)) {
            gvj.f(i, 2, ixh.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.tool = jsonObject;
    }

    public static /* synthetic */ ToolInfo copy$default(ToolInfo toolInfo, String str, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolInfo.id;
        }
        if ((i & 2) != 0) {
            jsonObject = toolInfo.tool;
        }
        return toolInfo.copy(str, jsonObject);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(ToolInfo self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.id != null) {
            output.B(serialDesc, 0, srg.a, self.id);
        }
        output.r(serialDesc, 1, uh9.a, self.tool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonObject getTool() {
        return this.tool;
    }

    public final ToolInfo copy(String id, JsonObject tool) {
        tool.getClass();
        return new ToolInfo(id, tool);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolInfo)) {
            return false;
        }
        ToolInfo toolInfo = (ToolInfo) other;
        return x44.r(this.id, toolInfo.id) && x44.r(this.tool, toolInfo.tool);
    }

    public final String getId() {
        return this.id;
    }

    public final JsonObject getTool() {
        return this.tool;
    }

    public int hashCode() {
        String str = this.id;
        return this.tool.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "ToolInfo(id=" + this.id + ", tool=" + this.tool + ")";
    }

    public ToolInfo(String str, JsonObject jsonObject) {
        jsonObject.getClass();
        this.id = str;
        this.tool = jsonObject;
    }

    public /* synthetic */ ToolInfo(String str, JsonObject jsonObject, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, jsonObject);
    }
}
