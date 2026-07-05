package com.anthropic.claude.api.tasks;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.fq6;
import defpackage.h9h;
import defpackage.i9h;
import defpackage.j9h;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.n7h;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wg6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/anthropic/claude/api/tasks/TaskStepStatus;", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "", "isTerminal", "()Z", "Companion", "h9h", "NOT_STARTED", "IN_PROGRESS", "NEEDS_ATTENTION", "COMPLETED", "SKIPPED", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = j9h.class)
public final class TaskStepStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ TaskStepStatus[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final h9h Companion;
    private final String value;
    public static final TaskStepStatus NOT_STARTED = new TaskStepStatus("NOT_STARTED", 0, "not_started");
    public static final TaskStepStatus IN_PROGRESS = new TaskStepStatus("IN_PROGRESS", 1, "in_progress");
    public static final TaskStepStatus NEEDS_ATTENTION = new TaskStepStatus("NEEDS_ATTENTION", 2, "needs_attention");
    public static final TaskStepStatus COMPLETED = new TaskStepStatus("COMPLETED", 3, "completed");
    public static final TaskStepStatus SKIPPED = new TaskStepStatus("SKIPPED", 4, "skipped");

    private static final /* synthetic */ TaskStepStatus[] $values() {
        return new TaskStepStatus[]{NOT_STARTED, IN_PROGRESS, NEEDS_ATTENTION, COMPLETED, SKIPPED};
    }

    static {
        TaskStepStatus[] taskStepStatusArr$values = $values();
        $VALUES = taskStepStatusArr$values;
        $ENTRIES = wd6.n0(taskStepStatusArr$values);
        Companion = new h9h();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new n7h(5));
    }

    private TaskStepStatus(String str, int i, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.tasks.TaskStepStatus", values(), new String[]{"not_started", "in_progress", "needs_attention", "completed", "skipped"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static TaskStepStatus valueOf(String str) {
        return (TaskStepStatus) Enum.valueOf(TaskStepStatus.class, str);
    }

    public static TaskStepStatus[] values() {
        return (TaskStepStatus[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isTerminal() {
        int i = i9h.a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4 || i == 5) {
            return false;
        }
        wg6.i();
        return false;
    }
}
