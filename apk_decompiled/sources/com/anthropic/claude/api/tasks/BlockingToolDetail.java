package com.anthropic.claude.api.tasks;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.ks1;
import defpackage.ls1;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u001b¨\u0006/"}, d2 = {"Lcom/anthropic/claude/api/tasks/BlockingToolDetail;", "", "", "tool_use_id", "name", "Lkotlinx/serialization/json/JsonObject;", "input", "output", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/tasks/BlockingToolDetail;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlinx/serialization/json/JsonObject;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/api/tasks/BlockingToolDetail;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_use_id", "getName", "Lkotlinx/serialization/json/JsonObject;", "getInput", "getOutput", "Companion", "ks1", "ls1", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class BlockingToolDetail {
    public static final int $stable = 0;
    public static final ls1 Companion = new ls1();
    private final JsonObject input;
    private final String name;
    private final JsonObject output;
    private final String tool_use_id;

    public /* synthetic */ BlockingToolDetail(int i, String str, String str2, JsonObject jsonObject, JsonObject jsonObject2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, ks1.a.getDescriptor());
            throw null;
        }
        this.tool_use_id = str;
        this.name = str2;
        if ((i & 4) == 0) {
            this.input = null;
        } else {
            this.input = jsonObject;
        }
        if ((i & 8) == 0) {
            this.output = null;
        } else {
            this.output = jsonObject2;
        }
    }

    public static /* synthetic */ BlockingToolDetail copy$default(BlockingToolDetail blockingToolDetail, String str, String str2, JsonObject jsonObject, JsonObject jsonObject2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blockingToolDetail.tool_use_id;
        }
        if ((i & 2) != 0) {
            str2 = blockingToolDetail.name;
        }
        if ((i & 4) != 0) {
            jsonObject = blockingToolDetail.input;
        }
        if ((i & 8) != 0) {
            jsonObject2 = blockingToolDetail.output;
        }
        return blockingToolDetail.copy(str, str2, jsonObject, jsonObject2);
    }

    public static final /* synthetic */ void write$Self$api(BlockingToolDetail self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.tool_use_id);
        output.q(serialDesc, 1, self.name);
        if (output.E(serialDesc) || self.input != null) {
            output.B(serialDesc, 2, uh9.a, self.input);
        }
        if (!output.E(serialDesc) && self.output == null) {
            return;
        }
        output.B(serialDesc, 3, uh9.a, self.output);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getInput() {
        return this.input;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JsonObject getOutput() {
        return this.output;
    }

    public final BlockingToolDetail copy(String tool_use_id, String name, JsonObject input, JsonObject output) {
        tool_use_id.getClass();
        name.getClass();
        return new BlockingToolDetail(tool_use_id, name, input, output);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockingToolDetail)) {
            return false;
        }
        BlockingToolDetail blockingToolDetail = (BlockingToolDetail) other;
        return x44.r(this.tool_use_id, blockingToolDetail.tool_use_id) && x44.r(this.name, blockingToolDetail.name) && x44.r(this.input, blockingToolDetail.input) && x44.r(this.output, blockingToolDetail.output);
    }

    public final JsonObject getInput() {
        return this.input;
    }

    public final String getName() {
        return this.name;
    }

    public final JsonObject getOutput() {
        return this.output;
    }

    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    public int hashCode() {
        int iL = kgh.l(this.tool_use_id.hashCode() * 31, 31, this.name);
        JsonObject jsonObject = this.input;
        int iHashCode = (iL + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        JsonObject jsonObject2 = this.output;
        return iHashCode + (jsonObject2 != null ? jsonObject2.hashCode() : 0);
    }

    public String toString() {
        String str = this.tool_use_id;
        String str2 = this.name;
        JsonObject jsonObject = this.input;
        JsonObject jsonObject2 = this.output;
        StringBuilder sbR = kgh.r("BlockingToolDetail(tool_use_id=", str, ", name=", str2, ", input=");
        sbR.append(jsonObject);
        sbR.append(", output=");
        sbR.append(jsonObject2);
        sbR.append(")");
        return sbR.toString();
    }

    public BlockingToolDetail(String str, String str2, JsonObject jsonObject, JsonObject jsonObject2) {
        str.getClass();
        str2.getClass();
        this.tool_use_id = str;
        this.name = str2;
        this.input = jsonObject;
        this.output = jsonObject2;
    }

    public /* synthetic */ BlockingToolDetail(String str, String str2, JsonObject jsonObject, JsonObject jsonObject2, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : jsonObject, (i & 8) != 0 ? null : jsonObject2);
    }
}
