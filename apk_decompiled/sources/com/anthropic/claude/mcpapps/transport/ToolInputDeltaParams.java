package com.anthropic.claude.mcpapps.transport;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kxh;
import defpackage.lxh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006$"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/ToolInputDeltaParams;", "", "", "delta", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/ToolInputDeltaParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/mcpapps/transport/ToolInputDeltaParams;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDelta", "Companion", "kxh", "lxh", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ToolInputDeltaParams {
    public static final int $stable = 0;
    public static final lxh Companion = new lxh();
    private final String delta;

    public /* synthetic */ ToolInputDeltaParams(int i, String str, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.delta = str;
        } else {
            gvj.f(i, 1, kxh.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ ToolInputDeltaParams copy$default(ToolInputDeltaParams toolInputDeltaParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolInputDeltaParams.delta;
        }
        return toolInputDeltaParams.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDelta() {
        return this.delta;
    }

    public final ToolInputDeltaParams copy(String delta) {
        delta.getClass();
        return new ToolInputDeltaParams(delta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ToolInputDeltaParams) && x44.r(this.delta, ((ToolInputDeltaParams) other).delta);
    }

    public final String getDelta() {
        return this.delta;
    }

    public int hashCode() {
        return this.delta.hashCode();
    }

    public String toString() {
        return ij0.j("ToolInputDeltaParams(delta=", this.delta, ")");
    }

    public ToolInputDeltaParams(String str) {
        str.getClass();
        this.delta = str;
    }
}
