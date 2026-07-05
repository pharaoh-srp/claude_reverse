package com.anthropic.claude.tool.model;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rxh;
import defpackage.sxh;
import defpackage.uxh;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"com/anthropic/claude/tool/model/ToolInvocationResult$Report", "Luxh;", "", "response", "", "success", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ZLvnf;)V", "Lcom/anthropic/claude/tool/model/ToolInvocationResult$Report;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/ToolInvocationResult$Report;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/anthropic/claude/tool/model/ToolInvocationResult$Report;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getResponse", "Z", "getSuccess", "Companion", "rxh", "sxh", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ToolInvocationResult$Report implements uxh {
    public static final sxh Companion = new sxh();
    private final String response;
    private final boolean success;

    public /* synthetic */ ToolInvocationResult$Report(int i, String str, boolean z, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, rxh.a.getDescriptor());
            throw null;
        }
        this.response = str;
        this.success = z;
    }

    public static /* synthetic */ ToolInvocationResult$Report copy$default(ToolInvocationResult$Report toolInvocationResult$Report, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolInvocationResult$Report.response;
        }
        if ((i & 2) != 0) {
            z = toolInvocationResult$Report.success;
        }
        return toolInvocationResult$Report.copy(str, z);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(ToolInvocationResult$Report self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.response);
        output.p(serialDesc, 1, self.success);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final ToolInvocationResult$Report copy(String response, boolean success) {
        response.getClass();
        return new ToolInvocationResult$Report(response, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolInvocationResult$Report)) {
            return false;
        }
        ToolInvocationResult$Report toolInvocationResult$Report = (ToolInvocationResult$Report) other;
        return x44.r(this.response, toolInvocationResult$Report.response) && this.success == toolInvocationResult$Report.success;
    }

    public final String getResponse() {
        return this.response;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return Boolean.hashCode(this.success) + (this.response.hashCode() * 31);
    }

    public String toString() {
        return "Report(response=" + this.response + ", success=" + this.success + ")";
    }

    public ToolInvocationResult$Report(String str, boolean z) {
        str.getClass();
        this.response = str;
        this.success = z;
    }
}
