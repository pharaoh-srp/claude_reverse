package com.anthropic.claude.mcpapps.transport;

import defpackage.kdi;
import defpackage.kw9;
import defpackage.mdi;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J4\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0017R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010\u0017¨\u0006)"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/UiResourceCsp;", "", "", "", "connectDomains", "resourceDomains", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/UiResourceCsp;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/mcpapps/transport/UiResourceCsp;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getConnectDomains", "getResourceDomains", "Companion", "ldi", "mdi", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UiResourceCsp {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final mdi Companion = new mdi();
    private final List<String> connectDomains;
    private final List<String> resourceDomains;

    static {
        kdi kdiVar = new kdi(0);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, kdiVar), yb5.w(w1aVar, new kdi(1))};
    }

    public /* synthetic */ UiResourceCsp(int i, List list, List list2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.connectDomains = null;
        } else {
            this.connectDomains = list;
        }
        if ((i & 2) == 0) {
            this.resourceDomains = null;
        } else {
            this.resourceDomains = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UiResourceCsp copy$default(UiResourceCsp uiResourceCsp, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = uiResourceCsp.connectDomains;
        }
        if ((i & 2) != 0) {
            list2 = uiResourceCsp.resourceDomains;
        }
        return uiResourceCsp.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(UiResourceCsp self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.connectDomains != null) {
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.connectDomains);
        }
        if (!output.E(serialDesc) && self.resourceDomains == null) {
            return;
        }
        output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.resourceDomains);
    }

    public final List<String> component1() {
        return this.connectDomains;
    }

    public final List<String> component2() {
        return this.resourceDomains;
    }

    public final UiResourceCsp copy(List<String> connectDomains, List<String> resourceDomains) {
        return new UiResourceCsp(connectDomains, resourceDomains);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiResourceCsp)) {
            return false;
        }
        UiResourceCsp uiResourceCsp = (UiResourceCsp) other;
        return x44.r(this.connectDomains, uiResourceCsp.connectDomains) && x44.r(this.resourceDomains, uiResourceCsp.resourceDomains);
    }

    public final List<String> getConnectDomains() {
        return this.connectDomains;
    }

    public final List<String> getResourceDomains() {
        return this.resourceDomains;
    }

    public int hashCode() {
        List<String> list = this.connectDomains;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.resourceDomains;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "UiResourceCsp(connectDomains=" + this.connectDomains + ", resourceDomains=" + this.resourceDomains + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiResourceCsp() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public UiResourceCsp(List<String> list, List<String> list2) {
        this.connectDomains = list;
        this.resourceDomains = list2;
    }

    public /* synthetic */ UiResourceCsp(List list, List list2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
