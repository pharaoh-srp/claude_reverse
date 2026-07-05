package com.anthropic.claude.api.tasks;

import defpackage.mdj;
import defpackage.onf;
import defpackage.qg9;
import defpackage.r7h;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \n2\u00020\u0001:\u0003\u000b\f\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0007\f\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/tasks/TaskSessionEvent;", "", "", "getId", "()Ljava/lang/String;", "id", "getStep_id", "getStep_id$annotations", "()V", "step_id", "Companion", "s7h", "com/anthropic/claude/api/tasks/AgentToolResultEvent", "r7h", "Lcom/anthropic/claude/api/tasks/AgentToolUseEvent;", "Lcom/anthropic/claude/api/tasks/AssistantTextEvent;", "Lcom/anthropic/claude/api/tasks/CustomToolUseEvent;", "Lcom/anthropic/claude/api/tasks/McpToolUseEvent;", "Lcom/anthropic/claude/api/tasks/StepStatusEvent;", "Lcfi;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public interface TaskSessionEvent {
    public static final r7h Companion = r7h.a;
    public static final String REPLAY_FROM_START = "0";

    String getId();

    String getStep_id();
}
