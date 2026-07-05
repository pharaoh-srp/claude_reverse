package com.anthropic.claude.api.tasks;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.fq6;
import defpackage.g8h;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.n7h;
import defpackage.onf;
import defpackage.oq5;
import defpackage.s8h;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/anthropic/claude/api/tasks/TaskStatus;", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "", "isActive", "()Z", "Companion", "g8h", "PROPOSED", "ACTIVE", "NEEDS_ATTENTION", "PAUSED", "COMPLETED", "FAILED", "REJECTED", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = s8h.class)
public final class TaskStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ TaskStatus[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final g8h Companion;
    private final String value;
    public static final TaskStatus PROPOSED = new TaskStatus("PROPOSED", 0, "proposed");
    public static final TaskStatus ACTIVE = new TaskStatus("ACTIVE", 1, "active");
    public static final TaskStatus NEEDS_ATTENTION = new TaskStatus("NEEDS_ATTENTION", 2, "needs_attention");
    public static final TaskStatus PAUSED = new TaskStatus("PAUSED", 3, "paused");
    public static final TaskStatus COMPLETED = new TaskStatus("COMPLETED", 4, "completed");
    public static final TaskStatus FAILED = new TaskStatus("FAILED", 5, "failed");
    public static final TaskStatus REJECTED = new TaskStatus("REJECTED", 6, "rejected");

    private static final /* synthetic */ TaskStatus[] $values() {
        return new TaskStatus[]{PROPOSED, ACTIVE, NEEDS_ATTENTION, PAUSED, COMPLETED, FAILED, REJECTED};
    }

    static {
        TaskStatus[] taskStatusArr$values = $values();
        $VALUES = taskStatusArr$values;
        $ENTRIES = wd6.n0(taskStatusArr$values);
        Companion = new g8h();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new n7h(1));
    }

    private TaskStatus(String str, int i, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.tasks.TaskStatus", values(), new String[]{"proposed", "active", "needs_attention", "paused", "completed", "failed", "rejected"}, new Annotation[][]{null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static TaskStatus valueOf(String str) {
        return (TaskStatus) Enum.valueOf(TaskStatus.class, str);
    }

    public static TaskStatus[] values() {
        return (TaskStatus[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isActive() {
        return this == ACTIVE || this == NEEDS_ATTENTION;
    }
}
