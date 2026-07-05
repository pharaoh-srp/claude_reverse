package com.anthropic.claude.tool.model;

import defpackage.gvj;
import defpackage.kw9;
import defpackage.lxg;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mxg;
import defpackage.nxg;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wof;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u001e¨\u00060"}, d2 = {"Lcom/anthropic/claude/tool/model/SuggestConnectorsOutput;", "", "", "Lcom/anthropic/claude/tool/model/SuggestConnectorsOutputConnectorsItem;", "connectors", "", "message", "", "opt_in_required", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/SuggestConnectorsOutput;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/tool/model/SuggestConnectorsOutput;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getConnectors", "Ljava/lang/String;", "getMessage", "Ljava/lang/Boolean;", "getOpt_in_required", "Companion", "lxg", "mxg", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SuggestConnectorsOutput {
    private final List<SuggestConnectorsOutputConnectorsItem> connectors;
    private final String message;
    private final Boolean opt_in_required;
    public static final mxg Companion = new mxg();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new wof(12)), null, null};

    public /* synthetic */ SuggestConnectorsOutput(int i, List list, String str, Boolean bool, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, lxg.a.getDescriptor());
            throw null;
        }
        this.connectors = list;
        if ((i & 2) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        if ((i & 4) == 0) {
            this.opt_in_required = null;
        } else {
            this.opt_in_required = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(nxg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuggestConnectorsOutput copy$default(SuggestConnectorsOutput suggestConnectorsOutput, List list, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = suggestConnectorsOutput.connectors;
        }
        if ((i & 2) != 0) {
            str = suggestConnectorsOutput.message;
        }
        if ((i & 4) != 0) {
            bool = suggestConnectorsOutput.opt_in_required;
        }
        return suggestConnectorsOutput.copy(list, str, bool);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(SuggestConnectorsOutput self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.connectors);
        if (output.E(serialDesc) || self.message != null) {
            output.B(serialDesc, 1, srg.a, self.message);
        }
        if (!output.E(serialDesc) && self.opt_in_required == null) {
            return;
        }
        output.B(serialDesc, 2, zt1.a, self.opt_in_required);
    }

    public final List<SuggestConnectorsOutputConnectorsItem> component1() {
        return this.connectors;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getOpt_in_required() {
        return this.opt_in_required;
    }

    public final SuggestConnectorsOutput copy(List<SuggestConnectorsOutputConnectorsItem> connectors, String message, Boolean opt_in_required) {
        connectors.getClass();
        return new SuggestConnectorsOutput(connectors, message, opt_in_required);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestConnectorsOutput)) {
            return false;
        }
        SuggestConnectorsOutput suggestConnectorsOutput = (SuggestConnectorsOutput) other;
        return x44.r(this.connectors, suggestConnectorsOutput.connectors) && x44.r(this.message, suggestConnectorsOutput.message) && x44.r(this.opt_in_required, suggestConnectorsOutput.opt_in_required);
    }

    public final List<SuggestConnectorsOutputConnectorsItem> getConnectors() {
        return this.connectors;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Boolean getOpt_in_required() {
        return this.opt_in_required;
    }

    public int hashCode() {
        int iHashCode = this.connectors.hashCode() * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.opt_in_required;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        List<SuggestConnectorsOutputConnectorsItem> list = this.connectors;
        String str = this.message;
        Boolean bool = this.opt_in_required;
        StringBuilder sb = new StringBuilder("SuggestConnectorsOutput(connectors=");
        sb.append(list);
        sb.append(", message=");
        sb.append(str);
        sb.append(", opt_in_required=");
        return qy1.h(sb, bool, ")");
    }

    public SuggestConnectorsOutput(List<SuggestConnectorsOutputConnectorsItem> list, String str, Boolean bool) {
        list.getClass();
        this.connectors = list;
        this.message = str;
        this.opt_in_required = bool;
    }

    public /* synthetic */ SuggestConnectorsOutput(List list, String str, Boolean bool, int i, mq5 mq5Var) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool);
    }
}
