package com.anthropic.claude.api.tasks;

import defpackage.gvj;
import defpackage.ing;
import defpackage.j9h;
import defpackage.jng;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006."}, d2 = {"Lcom/anthropic/claude/api/tasks/StepStatusEvent;", "Lcom/anthropic/claude/api/tasks/TaskSessionEvent;", "", "id", "step_id", "Lcom/anthropic/claude/api/tasks/TaskStepStatus;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/tasks/TaskStepStatus;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/tasks/TaskStepStatus;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/tasks/StepStatusEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/api/tasks/TaskStepStatus;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/tasks/TaskStepStatus;)Lcom/anthropic/claude/api/tasks/StepStatusEvent;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getStep_id", "Lcom/anthropic/claude/api/tasks/TaskStepStatus;", "getStatus", "Companion", "ing", "jng", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class StepStatusEvent implements TaskSessionEvent {
    public static final int $stable = 0;
    public static final jng Companion = new jng();
    private final String id;
    private final TaskStepStatus status;
    private final String step_id;

    public /* synthetic */ StepStatusEvent(int i, String str, String str2, TaskStepStatus taskStepStatus, vnf vnfVar) {
        if (4 != (i & 4)) {
            gvj.f(i, 4, ing.a.getDescriptor());
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
        this.status = taskStepStatus;
    }

    public static /* synthetic */ StepStatusEvent copy$default(StepStatusEvent stepStatusEvent, String str, String str2, TaskStepStatus taskStepStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stepStatusEvent.id;
        }
        if ((i & 2) != 0) {
            str2 = stepStatusEvent.step_id;
        }
        if ((i & 4) != 0) {
            taskStepStatus = stepStatusEvent.status;
        }
        return stepStatusEvent.copy(str, str2, taskStepStatus);
    }

    public static final /* synthetic */ void write$Self$api(StepStatusEvent self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.getId() != null) {
            output.B(serialDesc, 0, srg.a, self.getId());
        }
        if (output.E(serialDesc) || self.getStep_id() != null) {
            output.B(serialDesc, 1, srg.a, self.getStep_id());
        }
        output.r(serialDesc, 2, j9h.d, self.status);
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
    public final TaskStepStatus getStatus() {
        return this.status;
    }

    public final StepStatusEvent copy(String id, String step_id, TaskStepStatus status) {
        status.getClass();
        return new StepStatusEvent(id, step_id, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepStatusEvent)) {
            return false;
        }
        StepStatusEvent stepStatusEvent = (StepStatusEvent) other;
        return x44.r(this.id, stepStatusEvent.id) && x44.r(this.step_id, stepStatusEvent.step_id) && this.status == stepStatusEvent.status;
    }

    @Override // com.anthropic.claude.api.tasks.TaskSessionEvent
    public String getId() {
        return this.id;
    }

    public final TaskStepStatus getStatus() {
        return this.status;
    }

    @Override // com.anthropic.claude.api.tasks.TaskSessionEvent
    public String getStep_id() {
        return this.step_id;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.step_id;
        return this.status.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.step_id;
        TaskStepStatus taskStepStatus = this.status;
        StringBuilder sbR = kgh.r("StepStatusEvent(id=", str, ", step_id=", str2, ", status=");
        sbR.append(taskStepStatus);
        sbR.append(")");
        return sbR.toString();
    }

    public StepStatusEvent(String str, String str2, TaskStepStatus taskStepStatus) {
        taskStepStatus.getClass();
        this.id = str;
        this.step_id = str2;
        this.status = taskStepStatus;
    }

    public /* synthetic */ StepStatusEvent(String str, String str2, TaskStepStatus taskStepStatus, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, taskStepStatus);
    }
}
