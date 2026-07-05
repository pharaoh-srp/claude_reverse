package com.anthropic.claude.tool.model;

import defpackage.crg;
import defpackage.fq6;
import defpackage.g7h;
import defpackage.h7h;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/anthropic/claude/tool/model/TaskProposeOutputStepsItemStatus;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "g7h", "NOT_STARTED", "IN_PROGRESS", "NEEDS_ATTENTION", "COMPLETED", "SKIPPED", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = h7h.class)
public final class TaskProposeOutputStepsItemStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ TaskProposeOutputStepsItemStatus[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final g7h Companion;
    private final String loggingName;
    public static final TaskProposeOutputStepsItemStatus NOT_STARTED = new TaskProposeOutputStepsItemStatus("NOT_STARTED", 0, "not_started");
    public static final TaskProposeOutputStepsItemStatus IN_PROGRESS = new TaskProposeOutputStepsItemStatus("IN_PROGRESS", 1, "in_progress");
    public static final TaskProposeOutputStepsItemStatus NEEDS_ATTENTION = new TaskProposeOutputStepsItemStatus("NEEDS_ATTENTION", 2, "needs_attention");
    public static final TaskProposeOutputStepsItemStatus COMPLETED = new TaskProposeOutputStepsItemStatus("COMPLETED", 3, "completed");
    public static final TaskProposeOutputStepsItemStatus SKIPPED = new TaskProposeOutputStepsItemStatus("SKIPPED", 4, "skipped");

    private static final /* synthetic */ TaskProposeOutputStepsItemStatus[] $values() {
        return new TaskProposeOutputStepsItemStatus[]{NOT_STARTED, IN_PROGRESS, NEEDS_ATTENTION, COMPLETED, SKIPPED};
    }

    static {
        TaskProposeOutputStepsItemStatus[] taskProposeOutputStepsItemStatusArr$values = $values();
        $VALUES = taskProposeOutputStepsItemStatusArr$values;
        $ENTRIES = wd6.n0(taskProposeOutputStepsItemStatusArr$values);
        Companion = new g7h();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new crg(28));
    }

    private TaskProposeOutputStepsItemStatus(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.TaskProposeOutputStepsItemStatus", values(), new String[]{"not_started", "in_progress", "needs_attention", "completed", "skipped"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static TaskProposeOutputStepsItemStatus valueOf(String str) {
        return (TaskProposeOutputStepsItemStatus) Enum.valueOf(TaskProposeOutputStepsItemStatus.class, str);
    }

    public static TaskProposeOutputStepsItemStatus[] values() {
        return (TaskProposeOutputStepsItemStatus[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
