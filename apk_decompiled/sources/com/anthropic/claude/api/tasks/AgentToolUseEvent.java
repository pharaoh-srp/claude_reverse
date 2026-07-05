package com.anthropic.claude.api.tasks;

import defpackage.gr;
import defpackage.gvj;
import defpackage.hr;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nm6;
import defpackage.onf;
import defpackage.s7h;
import defpackage.srg;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000234B9\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JF\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b-\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b.\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b/\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010 ¨\u00065"}, d2 = {"Lcom/anthropic/claude/api/tasks/AgentToolUseEvent;", "Lcom/anthropic/claude/api/tasks/TaskSessionEvent;", "Ls7h;", "", "id", "step_id", "tool_use_id", "tool_name", "Lkotlinx/serialization/json/JsonObject;", "input", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/tasks/AgentToolUseEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/api/tasks/AgentToolUseEvent;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getStep_id", "getTool_use_id", "getTool_name", "Lkotlinx/serialization/json/JsonObject;", "getInput", "Companion", "gr", "hr", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AgentToolUseEvent implements TaskSessionEvent, s7h {
    public static final int $stable = 0;
    public static final hr Companion = new hr();
    private final String id;
    private final JsonObject input;
    private final String step_id;
    private final String tool_name;
    private final String tool_use_id;

    public /* synthetic */ AgentToolUseEvent(int i, String str, String str2, String str3, String str4, JsonObject jsonObject, vnf vnfVar) {
        if (12 != (i & 12)) {
            gvj.f(i, 12, gr.a.getDescriptor());
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
        this.tool_name = str4;
        if ((i & 16) == 0) {
            this.input = new JsonObject(nm6.E);
        } else {
            this.input = jsonObject;
        }
    }

    public static /* synthetic */ AgentToolUseEvent copy$default(AgentToolUseEvent agentToolUseEvent, String str, String str2, String str3, String str4, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agentToolUseEvent.id;
        }
        if ((i & 2) != 0) {
            str2 = agentToolUseEvent.step_id;
        }
        if ((i & 4) != 0) {
            str3 = agentToolUseEvent.tool_use_id;
        }
        if ((i & 8) != 0) {
            str4 = agentToolUseEvent.tool_name;
        }
        if ((i & 16) != 0) {
            jsonObject = agentToolUseEvent.input;
        }
        JsonObject jsonObject2 = jsonObject;
        String str5 = str3;
        return agentToolUseEvent.copy(str, str2, str5, str4, jsonObject2);
    }

    public static final /* synthetic */ void write$Self$api(AgentToolUseEvent self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.getId() != null) {
            output.B(serialDesc, 0, srg.a, self.getId());
        }
        if (output.E(serialDesc) || self.getStep_id() != null) {
            output.B(serialDesc, 1, srg.a, self.getStep_id());
        }
        output.q(serialDesc, 2, self.getTool_use_id());
        output.q(serialDesc, 3, self.getTool_name());
        if (!output.E(serialDesc) && x44.r(self.getInput(), new JsonObject(nm6.E))) {
            return;
        }
        output.r(serialDesc, 4, uh9.a, self.getInput());
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTool_name() {
        return this.tool_name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final JsonObject getInput() {
        return this.input;
    }

    public final AgentToolUseEvent copy(String id, String step_id, String tool_use_id, String tool_name, JsonObject input) {
        tool_use_id.getClass();
        tool_name.getClass();
        input.getClass();
        return new AgentToolUseEvent(id, step_id, tool_use_id, tool_name, input);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgentToolUseEvent)) {
            return false;
        }
        AgentToolUseEvent agentToolUseEvent = (AgentToolUseEvent) other;
        return x44.r(this.id, agentToolUseEvent.id) && x44.r(this.step_id, agentToolUseEvent.step_id) && x44.r(this.tool_use_id, agentToolUseEvent.tool_use_id) && x44.r(this.tool_name, agentToolUseEvent.tool_name) && x44.r(this.input, agentToolUseEvent.input);
    }

    @Override // com.anthropic.claude.api.tasks.TaskSessionEvent
    public String getId() {
        return this.id;
    }

    @Override // defpackage.s7h
    public JsonObject getInput() {
        return this.input;
    }

    @Override // com.anthropic.claude.api.tasks.TaskSessionEvent
    public String getStep_id() {
        return this.step_id;
    }

    @Override // defpackage.s7h
    public String getTool_name() {
        return this.tool_name;
    }

    @Override // defpackage.s7h
    public String getTool_use_id() {
        return this.tool_use_id;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.step_id;
        return this.input.hashCode() + kgh.l(kgh.l((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.tool_use_id), 31, this.tool_name);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.step_id;
        String str3 = this.tool_use_id;
        String str4 = this.tool_name;
        JsonObject jsonObject = this.input;
        StringBuilder sbR = kgh.r("AgentToolUseEvent(id=", str, ", step_id=", str2, ", tool_use_id=");
        kgh.u(sbR, str3, ", tool_name=", str4, ", input=");
        sbR.append(jsonObject);
        sbR.append(")");
        return sbR.toString();
    }

    public AgentToolUseEvent(String str, String str2, String str3, String str4, JsonObject jsonObject) {
        str3.getClass();
        str4.getClass();
        jsonObject.getClass();
        this.id = str;
        this.step_id = str2;
        this.tool_use_id = str3;
        this.tool_name = str4;
        this.input = jsonObject;
    }

    public /* synthetic */ AgentToolUseEvent(String str, String str2, String str3, String str4, JsonObject jsonObject, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, str4, (i & 16) != 0 ? new JsonObject(nm6.E) : jsonObject);
    }
}
