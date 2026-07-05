package com.anthropic.claude.tool.model;

import defpackage.ebh;
import defpackage.fr4;
import defpackage.gvj;
import defpackage.h05;
import defpackage.i05;
import defpackage.j05;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.uo0;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/tool/model/ConwaySuggestConnectorsOutput;", "", "", "Lcom/anthropic/claude/tool/model/ConwaySuggestConnectorsOutputConnectorsItem;", "connectors", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/ConwaySuggestConnectorsOutput;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/anthropic/claude/tool/model/ConwaySuggestConnectorsOutput;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getConnectors", "Companion", "h05", "i05", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ConwaySuggestConnectorsOutput {
    private final List<ConwaySuggestConnectorsOutputConnectorsItem> connectors;
    public static final i05 Companion = new i05();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new fr4(18))};

    public /* synthetic */ ConwaySuggestConnectorsOutput(int i, List list, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.connectors = list;
        } else {
            gvj.f(i, 1, h05.a.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(j05.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConwaySuggestConnectorsOutput copy$default(ConwaySuggestConnectorsOutput conwaySuggestConnectorsOutput, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = conwaySuggestConnectorsOutput.connectors;
        }
        return conwaySuggestConnectorsOutput.copy(list);
    }

    public final List<ConwaySuggestConnectorsOutputConnectorsItem> component1() {
        return this.connectors;
    }

    public final ConwaySuggestConnectorsOutput copy(List<ConwaySuggestConnectorsOutputConnectorsItem> connectors) {
        connectors.getClass();
        return new ConwaySuggestConnectorsOutput(connectors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConwaySuggestConnectorsOutput) && x44.r(this.connectors, ((ConwaySuggestConnectorsOutput) other).connectors);
    }

    public final List<ConwaySuggestConnectorsOutputConnectorsItem> getConnectors() {
        return this.connectors;
    }

    public int hashCode() {
        return this.connectors.hashCode();
    }

    public String toString() {
        return ebh.n("ConwaySuggestConnectorsOutput(connectors=", ")", this.connectors);
    }

    public ConwaySuggestConnectorsOutput(List<ConwaySuggestConnectorsOutputConnectorsItem> list) {
        list.getClass();
        this.connectors = list;
    }
}
