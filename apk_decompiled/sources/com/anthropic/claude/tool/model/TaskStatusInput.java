package com.anthropic.claude.tool.model;

import defpackage.gvj;
import defpackage.i8h;
import defpackage.ij0;
import defpackage.j8h;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006$"}, d2 = {"Lcom/anthropic/claude/tool/model/TaskStatusInput;", "", "", "task_uuid", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/TaskStatusInput;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/tool/model/TaskStatusInput;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTask_uuid", "Companion", "i8h", "j8h", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TaskStatusInput {
    public static final j8h Companion = new j8h();
    private final String task_uuid;

    public /* synthetic */ TaskStatusInput(int i, String str, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.task_uuid = str;
        } else {
            gvj.f(i, 1, i8h.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ TaskStatusInput copy$default(TaskStatusInput taskStatusInput, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskStatusInput.task_uuid;
        }
        return taskStatusInput.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTask_uuid() {
        return this.task_uuid;
    }

    public final TaskStatusInput copy(String task_uuid) {
        task_uuid.getClass();
        return new TaskStatusInput(task_uuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TaskStatusInput) && x44.r(this.task_uuid, ((TaskStatusInput) other).task_uuid);
    }

    public final String getTask_uuid() {
        return this.task_uuid;
    }

    public int hashCode() {
        return this.task_uuid.hashCode();
    }

    public String toString() {
        return ij0.j("TaskStatusInput(task_uuid=", this.task_uuid, ")");
    }

    public TaskStatusInput(String str) {
        str.getClass();
        this.task_uuid = str;
    }
}
