package com.anthropic.claude.tool.model;

import defpackage.g05;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006$"}, d2 = {"Lcom/anthropic/claude/tool/model/ConwaySuggestConnectorsInput;", "", "", "query", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/ConwaySuggestConnectorsInput;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/tool/model/ConwaySuggestConnectorsInput;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuery", "Companion", "f05", "g05", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ConwaySuggestConnectorsInput {
    public static final g05 Companion = new g05();
    private final String query;

    public /* synthetic */ ConwaySuggestConnectorsInput(int i, String str, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.query = null;
        } else {
            this.query = str;
        }
    }

    public static /* synthetic */ ConwaySuggestConnectorsInput copy$default(ConwaySuggestConnectorsInput conwaySuggestConnectorsInput, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conwaySuggestConnectorsInput.query;
        }
        return conwaySuggestConnectorsInput.copy(str);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(ConwaySuggestConnectorsInput self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.query == null) {
            return;
        }
        output.B(serialDesc, 0, srg.a, self.query);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final ConwaySuggestConnectorsInput copy(String query) {
        return new ConwaySuggestConnectorsInput(query);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConwaySuggestConnectorsInput) && x44.r(this.query, ((ConwaySuggestConnectorsInput) other).query);
    }

    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        String str = this.query;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return ij0.j("ConwaySuggestConnectorsInput(query=", this.query, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConwaySuggestConnectorsInput() {
        this((String) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public ConwaySuggestConnectorsInput(String str) {
        this.query = str;
    }

    public /* synthetic */ ConwaySuggestConnectorsInput(String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str);
    }
}
