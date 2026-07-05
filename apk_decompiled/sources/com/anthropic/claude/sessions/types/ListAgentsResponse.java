package com.anthropic.claude.sessions.types;

import defpackage.ebh;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qme;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.x7a;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016¨\u0006)"}, d2 = {"Lcom/anthropic/claude/sessions/types/ListAgentsResponse;", "", "", "Lcom/anthropic/claude/sessions/types/CodeAgent;", "agents", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ListAgentsResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/anthropic/claude/sessions/types/ListAgentsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAgents", "getAgents$annotations", "()V", "Companion", "w7a", "x7a", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ListAgentsResponse {
    public static final x7a Companion = new x7a();
    private final List<CodeAgent> agents;

    public /* synthetic */ ListAgentsResponse(int i, List list, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.agents = lm6.E;
        } else {
            this.agents = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListAgentsResponse copy$default(ListAgentsResponse listAgentsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = listAgentsResponse.agents;
        }
        return listAgentsResponse.copy(list);
    }

    @onf(with = qme.class)
    public static /* synthetic */ void getAgents$annotations() {
    }

    public static final /* synthetic */ void write$Self$sessions(ListAgentsResponse self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && x44.r(self.agents, lm6.E)) {
            return;
        }
        output.r(serialDesc, 0, qme.d, self.agents);
    }

    public final List<CodeAgent> component1() {
        return this.agents;
    }

    public final ListAgentsResponse copy(List<CodeAgent> agents) {
        agents.getClass();
        return new ListAgentsResponse(agents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ListAgentsResponse) && x44.r(this.agents, ((ListAgentsResponse) other).agents);
    }

    public final List<CodeAgent> getAgents() {
        return this.agents;
    }

    public int hashCode() {
        return this.agents.hashCode();
    }

    public String toString() {
        return ebh.n("ListAgentsResponse(agents=", ")", this.agents);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListAgentsResponse() {
        this((List) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public ListAgentsResponse(List<CodeAgent> list) {
        list.getClass();
        this.agents = list;
    }

    public /* synthetic */ ListAgentsResponse(List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? lm6.E : list);
    }
}
