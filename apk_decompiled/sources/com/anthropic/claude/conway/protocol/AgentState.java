package com.anthropic.claude.conway.protocol;

import defpackage.b5;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wq;
import defpackage.x44;
import defpackage.xka;
import defpackage.xq;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JJ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\"¨\u00067"}, d2 = {"Lcom/anthropic/claude/conway/protocol/AgentState;", "", "", "id", "label", "status", "", "Lcom/anthropic/claude/conway/protocol/RichMessage;", "messages", "", "oldestSeq", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/AgentState;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Lcom/anthropic/claude/conway/protocol/AgentState;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLabel", "getStatus", "Ljava/util/List;", "getMessages", "Ljava/lang/Long;", "getOldestSeq", "Companion", "wq", "xq", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AgentState {
    public static final int $stable = 8;
    private final String id;
    private final String label;
    private final List<RichMessage> messages;
    private final Long oldestSeq;
    private final String status;
    public static final xq Companion = new xq();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new b5(12)), null};

    public /* synthetic */ AgentState(int i, String str, String str2, String str3, List list, Long l, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, wq.a.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.label = "";
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.status = "idle";
        } else {
            this.status = str3;
        }
        if ((i & 8) == 0) {
            this.messages = lm6.E;
        } else {
            this.messages = list;
        }
        if ((i & 16) == 0) {
            this.oldestSeq = null;
        } else {
            this.oldestSeq = l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(n0.c, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AgentState copy$default(AgentState agentState, String str, String str2, String str3, List list, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agentState.id;
        }
        if ((i & 2) != 0) {
            str2 = agentState.label;
        }
        if ((i & 4) != 0) {
            str3 = agentState.status;
        }
        if ((i & 8) != 0) {
            list = agentState.messages;
        }
        if ((i & 16) != 0) {
            l = agentState.oldestSeq;
        }
        Long l2 = l;
        String str4 = str3;
        return agentState.copy(str, str2, str4, list, l2);
    }

    public static final /* synthetic */ void write$Self$conway(AgentState self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.id);
        if (output.E(serialDesc) || !x44.r(self.label, "")) {
            output.q(serialDesc, 1, self.label);
        }
        if (output.E(serialDesc) || !x44.r(self.status, "idle")) {
            output.q(serialDesc, 2, self.status);
        }
        if (output.E(serialDesc) || !x44.r(self.messages, lm6.E)) {
            output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.messages);
        }
        if (!output.E(serialDesc) && self.oldestSeq == null) {
            return;
        }
        output.B(serialDesc, 4, xka.a, self.oldestSeq);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final List<RichMessage> component4() {
        return this.messages;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getOldestSeq() {
        return this.oldestSeq;
    }

    public final AgentState copy(String id, String label, String status, List<? extends RichMessage> messages, Long oldestSeq) {
        id.getClass();
        label.getClass();
        status.getClass();
        messages.getClass();
        return new AgentState(id, label, status, messages, oldestSeq);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgentState)) {
            return false;
        }
        AgentState agentState = (AgentState) other;
        return x44.r(this.id, agentState.id) && x44.r(this.label, agentState.label) && x44.r(this.status, agentState.status) && x44.r(this.messages, agentState.messages) && x44.r(this.oldestSeq, agentState.oldestSeq);
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<RichMessage> getMessages() {
        return this.messages;
    }

    public final Long getOldestSeq() {
        return this.oldestSeq;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iM = kgh.m(kgh.l(kgh.l(this.id.hashCode() * 31, 31, this.label), 31, this.status), 31, this.messages);
        Long l = this.oldestSeq;
        return iM + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.label;
        String str3 = this.status;
        List<RichMessage> list = this.messages;
        Long l = this.oldestSeq;
        StringBuilder sbR = kgh.r("AgentState(id=", str, ", label=", str2, ", status=");
        qy1.p(str3, ", messages=", ", oldestSeq=", sbR, list);
        sbR.append(l);
        sbR.append(")");
        return sbR.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgentState(String str, String str2, String str3, List<? extends RichMessage> list, Long l) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.id = str;
        this.label = str2;
        this.status = str3;
        this.messages = list;
        this.oldestSeq = l;
    }

    public /* synthetic */ AgentState(String str, String str2, String str3, List list, Long l, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "idle" : str3, (i & 8) != 0 ? lm6.E : list, (i & 16) != 0 ? null : l);
    }
}
