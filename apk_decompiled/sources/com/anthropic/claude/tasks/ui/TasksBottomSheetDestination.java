package com.anthropic.claude.tasks.ui;

import com.anthropic.claude.core.logging.EmptyDestination;
import com.anthropic.claude.tool.model.RequestFormInputFromUserInput;
import com.anthropic.claude.types.strings.TaskId;
import com.anthropic.claude.types.strings.ToolUseId;
import defpackage.bga;
import defpackage.c1i;
import defpackage.cc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lje;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wof;
import defpackage.x44;
import defpackage.yb5;
import defpackage.z5h;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "Closed", "TaskList", "TaskDetail", "StepDetail", "EventInspector", "FormInput", "com/anthropic/claude/tasks/ui/a", "Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$Closed;", "Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$EventInspector;", "Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$FormInput;", "Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$StepDetail;", "Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$TaskDetail;", "Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$TaskList;", "Claude:tasks"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface TasksBottomSheetDestination extends bga {
    public static final a Companion = a.a;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004Ê\u0001\u0002\b\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$Closed;", "Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination;", "Lcom/anthropic/claude/core/logging/EmptyDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "Claude:tasks", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Closed implements TasksBottomSheetDestination, EmptyDestination {
        public static final int $stable = 0;
        public static final Closed INSTANCE = new Closed();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new wof(18));

        private Closed() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.tasks.ui.TasksBottomSheetDestination.Closed", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Closed);
        }

        @Override // com.anthropic.claude.tasks.ui.TasksBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 1179126699;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Closed";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$TaskList;", "Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "Claude:tasks", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class TaskList implements TasksBottomSheetDestination {
        public static final int $stable = 0;
        public static final TaskList INSTANCE = new TaskList();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new wof(19));

        private TaskList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.tasks.ui.TasksBottomSheetDestination.TaskList", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TaskList);
        }

        @Override // com.anthropic.claude.tasks.ui.TasksBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 2061149762;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "TaskList";
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Other;
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$EventInspector;", "Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination;", "Lcom/anthropic/claude/types/strings/TaskId;", "taskId", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tasks", "(Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$EventInspector;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-Fx-cw9s", "()Ljava/lang/String;", "component1", "copy-dIH_tvA", "(Ljava/lang/String;)Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$EventInspector;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTaskId-Fx-cw9s", "Companion", "com/anthropic/claude/tasks/ui/b", "com/anthropic/claude/tasks/ui/c", "Claude:tasks"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class EventInspector implements TasksBottomSheetDestination {
        public static final int $stable = 0;
        public static final c Companion = new c();
        private final String taskId;

        private /* synthetic */ EventInspector(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.taskId = str;
            } else {
                gvj.f(i, 1, b.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-dIH_tvA$default, reason: not valid java name */
        public static /* synthetic */ EventInspector m890copydIH_tvA$default(EventInspector eventInspector, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eventInspector.taskId;
            }
            return eventInspector.m892copydIH_tvA(str);
        }

        /* JADX INFO: renamed from: component1-Fx-cw9s, reason: not valid java name and from getter */
        public final String getTaskId() {
            return this.taskId;
        }

        /* JADX INFO: renamed from: copy-dIH_tvA, reason: not valid java name */
        public final EventInspector m892copydIH_tvA(String taskId) {
            taskId.getClass();
            return new EventInspector(taskId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EventInspector) && TaskId.m1131equalsimpl0(this.taskId, ((EventInspector) other).taskId);
        }

        @Override // com.anthropic.claude.tasks.ui.TasksBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getTaskId-Fx-cw9s, reason: not valid java name */
        public final String m893getTaskIdFxcw9s() {
            return this.taskId;
        }

        public int hashCode() {
            return TaskId.m1132hashCodeimpl(this.taskId);
        }

        public String toString() {
            return ij0.j("EventInspector(taskId=", TaskId.m1133toStringimpl(this.taskId), ")");
        }

        public /* synthetic */ EventInspector(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ EventInspector(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private EventInspector(String str) {
            str.getClass();
            this.taskId = str;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$TaskDetail;", "Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination;", "Lcom/anthropic/claude/types/strings/TaskId;", "taskId", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tasks", "(Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$TaskDetail;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-Fx-cw9s", "()Ljava/lang/String;", "component1", "copy-dIH_tvA", "(Ljava/lang/String;)Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$TaskDetail;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTaskId-Fx-cw9s", "Companion", "com/anthropic/claude/tasks/ui/h", "com/anthropic/claude/tasks/ui/i", "Claude:tasks"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class TaskDetail implements TasksBottomSheetDestination {
        public static final int $stable = 0;
        public static final i Companion = new i();
        private final String taskId;

        private /* synthetic */ TaskDetail(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.taskId = str;
            } else {
                gvj.f(i, 1, h.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-dIH_tvA$default, reason: not valid java name */
        public static /* synthetic */ TaskDetail m904copydIH_tvA$default(TaskDetail taskDetail, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taskDetail.taskId;
            }
            return taskDetail.m906copydIH_tvA(str);
        }

        /* JADX INFO: renamed from: component1-Fx-cw9s, reason: not valid java name and from getter */
        public final String getTaskId() {
            return this.taskId;
        }

        /* JADX INFO: renamed from: copy-dIH_tvA, reason: not valid java name */
        public final TaskDetail m906copydIH_tvA(String taskId) {
            taskId.getClass();
            return new TaskDetail(taskId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TaskDetail) && TaskId.m1131equalsimpl0(this.taskId, ((TaskDetail) other).taskId);
        }

        @Override // com.anthropic.claude.tasks.ui.TasksBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getTaskId-Fx-cw9s, reason: not valid java name */
        public final String m907getTaskIdFxcw9s() {
            return this.taskId;
        }

        public int hashCode() {
            return TaskId.m1132hashCodeimpl(this.taskId);
        }

        public String toString() {
            return ij0.j("TaskDetail(taskId=", TaskId.m1133toStringimpl(this.taskId), ")");
        }

        public /* synthetic */ TaskDetail(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ TaskDetail(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private TaskDetail(String str) {
            str.getClass();
            this.taskId = str;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$StepDetail;", "Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination;", "Lcom/anthropic/claude/types/strings/TaskId;", "taskId", "", "stepId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tasks", "(Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$StepDetail;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-Fx-cw9s", "()Ljava/lang/String;", "component1", "component2", "copy-WPZCaV8", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$StepDetail;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTaskId-Fx-cw9s", "getStepId", "Companion", "com/anthropic/claude/tasks/ui/f", "com/anthropic/claude/tasks/ui/g", "Claude:tasks"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class StepDetail implements TasksBottomSheetDestination {
        public static final int $stable = 0;
        public static final g Companion = new g();
        private final String stepId;
        private final String taskId;

        private /* synthetic */ StepDetail(int i, String str, String str2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, f.a.getDescriptor());
                throw null;
            }
            this.taskId = str;
            this.stepId = str2;
        }

        /* JADX INFO: renamed from: copy-WPZCaV8$default, reason: not valid java name */
        public static /* synthetic */ StepDetail m900copyWPZCaV8$default(StepDetail stepDetail, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stepDetail.taskId;
            }
            if ((i & 2) != 0) {
                str2 = stepDetail.stepId;
            }
            return stepDetail.m902copyWPZCaV8(str, str2);
        }

        public static final /* synthetic */ void write$Self$Claude_tasks(StepDetail self, vd4 output, SerialDescriptor serialDesc) {
            output.r(serialDesc, 0, z5h.a, TaskId.m1128boximpl(self.taskId));
            output.q(serialDesc, 1, self.stepId);
        }

        /* JADX INFO: renamed from: component1-Fx-cw9s, reason: not valid java name and from getter */
        public final String getTaskId() {
            return this.taskId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getStepId() {
            return this.stepId;
        }

        /* JADX INFO: renamed from: copy-WPZCaV8, reason: not valid java name */
        public final StepDetail m902copyWPZCaV8(String taskId, String stepId) {
            taskId.getClass();
            stepId.getClass();
            return new StepDetail(taskId, stepId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepDetail)) {
                return false;
            }
            StepDetail stepDetail = (StepDetail) other;
            return TaskId.m1131equalsimpl0(this.taskId, stepDetail.taskId) && x44.r(this.stepId, stepDetail.stepId);
        }

        @Override // com.anthropic.claude.tasks.ui.TasksBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final String getStepId() {
            return this.stepId;
        }

        /* JADX INFO: renamed from: getTaskId-Fx-cw9s, reason: not valid java name */
        public final String m903getTaskIdFxcw9s() {
            return this.taskId;
        }

        public int hashCode() {
            return this.stepId.hashCode() + (TaskId.m1132hashCodeimpl(this.taskId) * 31);
        }

        public String toString() {
            return ij0.l("StepDetail(taskId=", TaskId.m1133toStringimpl(this.taskId), ", stepId=", this.stepId, ")");
        }

        public /* synthetic */ StepDetail(String str, String str2, mq5 mq5Var) {
            this(str, str2);
        }

        public /* synthetic */ StepDetail(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, vnfVar);
        }

        private StepDetail(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.taskId = str;
            this.stepId = str2;
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ.\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b-\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001e¨\u00063"}, d2 = {"Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$FormInput;", "Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination;", "Lcom/anthropic/claude/types/strings/TaskId;", "taskId", "Lcom/anthropic/claude/types/strings/ToolUseId;", "toolUseId", "Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInput;", "input", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInput;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInput;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tasks", "(Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$FormInput;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-Fx-cw9s", "()Ljava/lang/String;", "component1", "component2-ERU6ZeY", "component2", "component3", "()Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInput;", "copy-janyuqc", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInput;)Lcom/anthropic/claude/tasks/ui/TasksBottomSheetDestination$FormInput;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTaskId-Fx-cw9s", "getToolUseId-ERU6ZeY", "Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInput;", "getInput", "Companion", "com/anthropic/claude/tasks/ui/d", "com/anthropic/claude/tasks/ui/e", "Claude:tasks"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class FormInput implements TasksBottomSheetDestination {
        public static final int $stable = 0;
        public static final e Companion = new e();
        private final RequestFormInputFromUserInput input;
        private final String taskId;
        private final String toolUseId;

        private /* synthetic */ FormInput(int i, String str, String str2, RequestFormInputFromUserInput requestFormInputFromUserInput, vnf vnfVar) {
            if (7 != (i & 7)) {
                gvj.f(i, 7, d.a.getDescriptor());
                throw null;
            }
            this.taskId = str;
            this.toolUseId = str2;
            this.input = requestFormInputFromUserInput;
        }

        /* JADX INFO: renamed from: copy-janyuqc$default, reason: not valid java name */
        public static /* synthetic */ FormInput m894copyjanyuqc$default(FormInput formInput, String str, String str2, RequestFormInputFromUserInput requestFormInputFromUserInput, int i, Object obj) {
            if ((i & 1) != 0) {
                str = formInput.taskId;
            }
            if ((i & 2) != 0) {
                str2 = formInput.toolUseId;
            }
            if ((i & 4) != 0) {
                requestFormInputFromUserInput = formInput.input;
            }
            return formInput.m897copyjanyuqc(str, str2, requestFormInputFromUserInput);
        }

        public static final /* synthetic */ void write$Self$Claude_tasks(FormInput self, vd4 output, SerialDescriptor serialDesc) {
            output.r(serialDesc, 0, z5h.a, TaskId.m1128boximpl(self.taskId));
            output.r(serialDesc, 1, c1i.a, ToolUseId.m1157boximpl(self.toolUseId));
            output.r(serialDesc, 2, lje.a, self.input);
        }

        /* JADX INFO: renamed from: component1-Fx-cw9s, reason: not valid java name and from getter */
        public final String getTaskId() {
            return this.taskId;
        }

        /* JADX INFO: renamed from: component2-ERU6ZeY, reason: not valid java name and from getter */
        public final String getToolUseId() {
            return this.toolUseId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final RequestFormInputFromUserInput getInput() {
            return this.input;
        }

        /* JADX INFO: renamed from: copy-janyuqc, reason: not valid java name */
        public final FormInput m897copyjanyuqc(String taskId, String toolUseId, RequestFormInputFromUserInput input) {
            taskId.getClass();
            toolUseId.getClass();
            input.getClass();
            return new FormInput(taskId, toolUseId, input, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormInput)) {
                return false;
            }
            FormInput formInput = (FormInput) other;
            return TaskId.m1131equalsimpl0(this.taskId, formInput.taskId) && ToolUseId.m1160equalsimpl0(this.toolUseId, formInput.toolUseId) && x44.r(this.input, formInput.input);
        }

        @Override // com.anthropic.claude.tasks.ui.TasksBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final RequestFormInputFromUserInput getInput() {
            return this.input;
        }

        /* JADX INFO: renamed from: getTaskId-Fx-cw9s, reason: not valid java name */
        public final String m898getTaskIdFxcw9s() {
            return this.taskId;
        }

        /* JADX INFO: renamed from: getToolUseId-ERU6ZeY, reason: not valid java name */
        public final String m899getToolUseIdERU6ZeY() {
            return this.toolUseId;
        }

        public int hashCode() {
            return this.input.hashCode() + ((ToolUseId.m1161hashCodeimpl(this.toolUseId) + (TaskId.m1132hashCodeimpl(this.taskId) * 31)) * 31);
        }

        public String toString() {
            String strM1133toStringimpl = TaskId.m1133toStringimpl(this.taskId);
            String strM1162toStringimpl = ToolUseId.m1162toStringimpl(this.toolUseId);
            RequestFormInputFromUserInput requestFormInputFromUserInput = this.input;
            StringBuilder sbR = kgh.r("FormInput(taskId=", strM1133toStringimpl, ", toolUseId=", strM1162toStringimpl, ", input=");
            sbR.append(requestFormInputFromUserInput);
            sbR.append(")");
            return sbR.toString();
        }

        public /* synthetic */ FormInput(String str, String str2, RequestFormInputFromUserInput requestFormInputFromUserInput, mq5 mq5Var) {
            this(str, str2, requestFormInputFromUserInput);
        }

        public /* synthetic */ FormInput(int i, String str, String str2, RequestFormInputFromUserInput requestFormInputFromUserInput, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, requestFormInputFromUserInput, vnfVar);
        }

        private FormInput(String str, String str2, RequestFormInputFromUserInput requestFormInputFromUserInput) {
            str.getClass();
            str2.getClass();
            requestFormInputFromUserInput.getClass();
            this.taskId = str;
            this.toolUseId = str2;
            this.input = requestFormInputFromUserInput;
        }
    }
}
