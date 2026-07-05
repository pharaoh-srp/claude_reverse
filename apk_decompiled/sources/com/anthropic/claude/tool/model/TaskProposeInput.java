package com.anthropic.claude.tool.model;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.w6h;
import defpackage.wof;
import defpackage.x44;
import defpackage.x6h;
import defpackage.y6h;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J6\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b*\u0010\u0019¨\u0006."}, d2 = {"Lcom/anthropic/claude/tool/model/TaskProposeInput;", "", "", "context", "", "Lcom/anthropic/claude/tool/model/TaskProposeInputStepsItem;", "steps", "title", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/TaskProposeInput;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/TaskProposeInput;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContext", "Ljava/util/List;", "getSteps", "getTitle", "Companion", "w6h", "x6h", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TaskProposeInput {
    private final String context;
    private final List<TaskProposeInputStepsItem> steps;
    private final String title;
    public static final x6h Companion = new x6h();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new wof(16)), null};

    public /* synthetic */ TaskProposeInput(int i, String str, List list, String str2, vnf vnfVar) {
        if (6 != (i & 6)) {
            gvj.f(i, 6, w6h.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.context = null;
        } else {
            this.context = str;
        }
        this.steps = list;
        this.title = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(y6h.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskProposeInput copy$default(TaskProposeInput taskProposeInput, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskProposeInput.context;
        }
        if ((i & 2) != 0) {
            list = taskProposeInput.steps;
        }
        if ((i & 4) != 0) {
            str2 = taskProposeInput.title;
        }
        return taskProposeInput.copy(str, list, str2);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(TaskProposeInput self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.context != null) {
            output.B(serialDesc, 0, srg.a, self.context);
        }
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.steps);
        output.q(serialDesc, 2, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final List<TaskProposeInputStepsItem> component2() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final TaskProposeInput copy(String context, List<TaskProposeInputStepsItem> steps, String title) {
        steps.getClass();
        title.getClass();
        return new TaskProposeInput(context, steps, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskProposeInput)) {
            return false;
        }
        TaskProposeInput taskProposeInput = (TaskProposeInput) other;
        return x44.r(this.context, taskProposeInput.context) && x44.r(this.steps, taskProposeInput.steps) && x44.r(this.title, taskProposeInput.title);
    }

    public final String getContext() {
        return this.context;
    }

    public final List<TaskProposeInputStepsItem> getSteps() {
        return this.steps;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.context;
        return this.title.hashCode() + kgh.m((str == null ? 0 : str.hashCode()) * 31, 31, this.steps);
    }

    public String toString() {
        String str = this.context;
        List<TaskProposeInputStepsItem> list = this.steps;
        String str2 = this.title;
        StringBuilder sb = new StringBuilder("TaskProposeInput(context=");
        sb.append(str);
        sb.append(", steps=");
        sb.append(list);
        sb.append(", title=");
        return ij0.m(sb, str2, ")");
    }

    public TaskProposeInput(String str, List<TaskProposeInputStepsItem> list, String str2) {
        list.getClass();
        str2.getClass();
        this.context = str;
        this.steps = list;
        this.title = str2;
    }

    public /* synthetic */ TaskProposeInput(String str, List list, String str2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, list, str2);
    }
}
