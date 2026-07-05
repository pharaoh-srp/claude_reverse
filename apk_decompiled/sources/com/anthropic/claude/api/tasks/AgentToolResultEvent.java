package com.anthropic.claude.api.tasks;

import defpackage.er;
import defpackage.fr;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J2\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/tasks/AgentToolResultEvent;", "Lcom/anthropic/claude/api/tasks/TaskSessionEvent;", "", "id", "step_id", "tool_use_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/tasks/AgentToolResultEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/tasks/AgentToolResultEvent;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getStep_id", "getTool_use_id", "Companion", "er", "fr", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AgentToolResultEvent implements TaskSessionEvent {
    public static final int $stable = 0;
    public static final fr Companion = new fr();
    private final String id;
    private final String step_id;
    private final String tool_use_id;

    public /* synthetic */ AgentToolResultEvent(int i, String str, String str2, String str3, vnf vnfVar) {
        if (4 != (i & 4)) {
            gvj.f(i, 4, er.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.step_id = null;
        } else {
            this.step_id = str2;
        }
        this.tool_use_id = str3;
    }

    public static /* synthetic */ AgentToolResultEvent copy$default(AgentToolResultEvent agentToolResultEvent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agentToolResultEvent.id;
        }
        if ((i & 2) != 0) {
            str2 = agentToolResultEvent.step_id;
        }
        if ((i & 4) != 0) {
            str3 = agentToolResultEvent.tool_use_id;
        }
        return agentToolResultEvent.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$api(AgentToolResultEvent self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.getId() != null) {
            output.B(serialDesc, 0, srg.a, self.getId());
        }
        if (output.E(serialDesc) || self.getStep_id() != null) {
            output.B(serialDesc, 1, srg.a, self.getStep_id());
        }
        output.q(serialDesc, 2, self.getTool_use_id());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStep_id() {
        return this.step_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    public final AgentToolResultEvent copy(String id, String step_id, String tool_use_id) {
        tool_use_id.getClass();
        return new AgentToolResultEvent(id, step_id, tool_use_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgentToolResultEvent)) {
            return false;
        }
        AgentToolResultEvent agentToolResultEvent = (AgentToolResultEvent) other;
        return x44.r(this.id, agentToolResultEvent.id) && x44.r(this.step_id, agentToolResultEvent.step_id) && x44.r(this.tool_use_id, agentToolResultEvent.tool_use_id);
    }

    @Override // com.anthropic.claude.api.tasks.TaskSessionEvent
    public String getId() {
        return this.id;
    }

    @Override // com.anthropic.claude.api.tasks.TaskSessionEvent
    public String getStep_id() {
        return this.step_id;
    }

    public String getTool_use_id() {
        return this.tool_use_id;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.step_id;
        return this.tool_use_id.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.step_id;
        return ij0.m(kgh.r("AgentToolResultEvent(id=", str, ", step_id=", str2, ", tool_use_id="), this.tool_use_id, ")");
    }

    public AgentToolResultEvent(String str, String str2, String str3) {
        str3.getClass();
        this.id = str;
        this.step_id = str2;
        this.tool_use_id = str3;
    }

    public /* synthetic */ AgentToolResultEvent(String str, String str2, String str3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3);
    }
}
