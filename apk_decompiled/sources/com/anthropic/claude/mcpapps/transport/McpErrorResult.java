package com.anthropic.claude.mcpapps.transport;

import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mia;
import defpackage.mq5;
import defpackage.o0b;
import defpackage.onf;
import defpackage.q0b;
import defpackage.r0b;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b\u0006\u0010\u001a¨\u0006+"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/McpErrorResult;", "", "", "Lcom/anthropic/claude/mcpapps/transport/McpErrorContent;", "content", "", "isError", "<init>", "(Ljava/util/List;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/McpErrorResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/anthropic/claude/mcpapps/transport/McpErrorResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getContent", "Z", "Companion", "q0b", "r0b", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpErrorResult {
    public static final int $stable = 8;
    private final List<McpErrorContent> content;
    private final boolean isError;
    public static final r0b Companion = new r0b();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new mia(13)), null};

    public /* synthetic */ McpErrorResult(int i, List list, boolean z, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, q0b.a.getDescriptor());
            throw null;
        }
        this.content = list;
        if ((i & 2) == 0) {
            this.isError = true;
        } else {
            this.isError = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(o0b.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ McpErrorResult copy$default(McpErrorResult mcpErrorResult, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mcpErrorResult.content;
        }
        if ((i & 2) != 0) {
            z = mcpErrorResult.isError;
        }
        return mcpErrorResult.copy(list, z);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(McpErrorResult self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.content);
        if (!output.E(serialDesc) && self.isError) {
            return;
        }
        output.p(serialDesc, 1, self.isError);
    }

    public final List<McpErrorContent> component1() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public final McpErrorResult copy(List<McpErrorContent> content, boolean isError) {
        content.getClass();
        return new McpErrorResult(content, isError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpErrorResult)) {
            return false;
        }
        McpErrorResult mcpErrorResult = (McpErrorResult) other;
        return x44.r(this.content, mcpErrorResult.content) && this.isError == mcpErrorResult.isError;
    }

    public final List<McpErrorContent> getContent() {
        return this.content;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isError) + (this.content.hashCode() * 31);
    }

    public final boolean isError() {
        return this.isError;
    }

    public String toString() {
        return "McpErrorResult(content=" + this.content + ", isError=" + this.isError + ")";
    }

    public McpErrorResult(List<McpErrorContent> list, boolean z) {
        list.getClass();
        this.content = list;
        this.isError = z;
    }

    public /* synthetic */ McpErrorResult(List list, boolean z, int i, mq5 mq5Var) {
        this(list, (i & 2) != 0 ? true : z);
    }
}
