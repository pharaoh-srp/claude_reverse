package defpackage;

import com.anthropic.claude.api.tasks.AgentToolResultEvent;
import com.anthropic.claude.api.tasks.AgentToolUseEvent;
import com.anthropic.claude.api.tasks.AssistantTextEvent;
import com.anthropic.claude.api.tasks.CustomToolUseEvent;
import com.anthropic.claude.api.tasks.McpToolUseEvent;
import com.anthropic.claude.api.tasks.StepStatusEvent;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import com.anthropic.claude.api.tasks.f;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final class u7h {
    public final long a;
    public final a8h b;
    public final TaskSessionEvent c;
    public final long d;
    public final u0h e;

    public u7h(long j, a8h a8hVar, TaskSessionEvent taskSessionEvent, long j2) {
        taskSessionEvent.getClass();
        this.a = j;
        this.b = a8hVar;
        this.c = taskSessionEvent;
        this.d = j2;
        this.e = new u0h(new g2h(1, this));
    }

    public final String a() {
        JsonObject jsonObject = f.a;
        TaskSessionEvent taskSessionEvent = this.c;
        taskSessionEvent.getClass();
        if (taskSessionEvent instanceof CustomToolUseEvent) {
            return "tool_use";
        }
        if (taskSessionEvent instanceof AgentToolUseEvent) {
            return "agent_tool_use";
        }
        if (taskSessionEvent instanceof AgentToolResultEvent) {
            return "agent_tool_result";
        }
        if (taskSessionEvent instanceof McpToolUseEvent) {
            return "mcp_tool_use";
        }
        if (taskSessionEvent instanceof AssistantTextEvent) {
            return "agent";
        }
        if (taskSessionEvent instanceof StepStatusEvent) {
            return "step_status";
        }
        if (taskSessionEvent instanceof cfi) {
            return ((cfi) taskSessionEvent).a;
        }
        wg6.i();
        return null;
    }

    public final String b() {
        return (String) this.e.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7h)) {
            return false;
        }
        u7h u7hVar = (u7h) obj;
        return this.a == u7hVar.a && this.b == u7hVar.b && x44.r(this.c, u7hVar.c) && this.d == u7hVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Entry(id=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", event=");
        sb.append(this.c);
        sb.append(", receivedAt=");
        return grc.r(this.d, ")", sb);
    }
}
