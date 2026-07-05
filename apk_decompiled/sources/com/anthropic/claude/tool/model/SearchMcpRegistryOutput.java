package com.anthropic.claude.tool.model;

import defpackage.gef;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0019¨\u0006)"}, d2 = {"Lcom/anthropic/claude/tool/model/SearchMcpRegistryOutput;", "", "", "message", "", "opt_in_required", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/SearchMcpRegistryOutput;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/tool/model/SearchMcpRegistryOutput;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Ljava/lang/Boolean;", "getOpt_in_required", "Companion", "fef", "gef", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SearchMcpRegistryOutput {
    public static final gef Companion = new gef();
    private final String message;
    private final Boolean opt_in_required;

    public /* synthetic */ SearchMcpRegistryOutput(int i, String str, Boolean bool, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        if ((i & 2) == 0) {
            this.opt_in_required = null;
        } else {
            this.opt_in_required = bool;
        }
    }

    public static /* synthetic */ SearchMcpRegistryOutput copy$default(SearchMcpRegistryOutput searchMcpRegistryOutput, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchMcpRegistryOutput.message;
        }
        if ((i & 2) != 0) {
            bool = searchMcpRegistryOutput.opt_in_required;
        }
        return searchMcpRegistryOutput.copy(str, bool);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(SearchMcpRegistryOutput self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.message != null) {
            output.B(serialDesc, 0, srg.a, self.message);
        }
        if (!output.E(serialDesc) && self.opt_in_required == null) {
            return;
        }
        output.B(serialDesc, 1, zt1.a, self.opt_in_required);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getOpt_in_required() {
        return this.opt_in_required;
    }

    public final SearchMcpRegistryOutput copy(String message, Boolean opt_in_required) {
        return new SearchMcpRegistryOutput(message, opt_in_required);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchMcpRegistryOutput)) {
            return false;
        }
        SearchMcpRegistryOutput searchMcpRegistryOutput = (SearchMcpRegistryOutput) other;
        return x44.r(this.message, searchMcpRegistryOutput.message) && x44.r(this.opt_in_required, searchMcpRegistryOutput.opt_in_required);
    }

    public final String getMessage() {
        return this.message;
    }

    public final Boolean getOpt_in_required() {
        return this.opt_in_required;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.opt_in_required;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "SearchMcpRegistryOutput(message=" + this.message + ", opt_in_required=" + this.opt_in_required + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchMcpRegistryOutput() {
        this((String) null, (Boolean) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public SearchMcpRegistryOutput(String str, Boolean bool) {
        this.message = str;
        this.opt_in_required = bool;
    }

    public /* synthetic */ SearchMcpRegistryOutput(String str, Boolean bool, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
    }
}
