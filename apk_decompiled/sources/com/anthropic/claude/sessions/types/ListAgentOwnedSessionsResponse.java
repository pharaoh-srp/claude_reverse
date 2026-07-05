package com.anthropic.claude.sessions.types;

import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pme;
import defpackage.srg;
import defpackage.v7a;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010\u0018¨\u0006,"}, d2 = {"Lcom/anthropic/claude/sessions/types/ListAgentOwnedSessionsResponse;", "", "", "Lcom/anthropic/claude/sessions/types/AgentOwnedSessionSummary;", "data", "", "next_cursor", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ListAgentOwnedSessionsResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/ListAgentOwnedSessionsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getData", "getData$annotations", "()V", "Ljava/lang/String;", "getNext_cursor", "Lcom/anthropic/claude/sessions/types/SessionResource;", "getSessions", "sessions", "Companion", "u7a", "v7a"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ListAgentOwnedSessionsResponse {
    public static final v7a Companion = new v7a();
    private final List<AgentOwnedSessionSummary> data;
    private final String next_cursor;

    public /* synthetic */ ListAgentOwnedSessionsResponse(int i, List list, String str, vnf vnfVar) {
        this.data = (i & 1) == 0 ? lm6.E : list;
        if ((i & 2) == 0) {
            this.next_cursor = null;
        } else {
            this.next_cursor = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListAgentOwnedSessionsResponse copy$default(ListAgentOwnedSessionsResponse listAgentOwnedSessionsResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = listAgentOwnedSessionsResponse.data;
        }
        if ((i & 2) != 0) {
            str = listAgentOwnedSessionsResponse.next_cursor;
        }
        return listAgentOwnedSessionsResponse.copy(list, str);
    }

    @onf(with = pme.class)
    public static /* synthetic */ void getData$annotations() {
    }

    public static final /* synthetic */ void write$Self$sessions(ListAgentOwnedSessionsResponse self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.data, lm6.E)) {
            output.r(serialDesc, 0, pme.d, self.data);
        }
        if (!output.E(serialDesc) && self.next_cursor == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.next_cursor);
    }

    public final List<AgentOwnedSessionSummary> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public final ListAgentOwnedSessionsResponse copy(List<AgentOwnedSessionSummary> data, String next_cursor) {
        data.getClass();
        return new ListAgentOwnedSessionsResponse(data, next_cursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListAgentOwnedSessionsResponse)) {
            return false;
        }
        ListAgentOwnedSessionsResponse listAgentOwnedSessionsResponse = (ListAgentOwnedSessionsResponse) other;
        return x44.r(this.data, listAgentOwnedSessionsResponse.data) && x44.r(this.next_cursor, listAgentOwnedSessionsResponse.next_cursor);
    }

    public final List<AgentOwnedSessionSummary> getData() {
        return this.data;
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public final List<SessionResource> getSessions() {
        List<AgentOwnedSessionSummary> list = this.data;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AgentOwnedSessionSummary) it.next()).toSessionResource());
        }
        return arrayList;
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        String str = this.next_cursor;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ListAgentOwnedSessionsResponse(data=" + this.data + ", next_cursor=" + this.next_cursor + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListAgentOwnedSessionsResponse() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public ListAgentOwnedSessionsResponse(List<AgentOwnedSessionSummary> list, String str) {
        list.getClass();
        this.data = list;
        this.next_cursor = str;
    }

    public /* synthetic */ ListAgentOwnedSessionsResponse(List list, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? lm6.E : list, (i & 2) != 0 ? null : str);
    }
}
