package com.anthropic.claude.tool.model;

import defpackage.c7h;
import defpackage.crg;
import defpackage.d7h;
import defpackage.fq6;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/anthropic/claude/tool/model/TaskProposeOutputStatus;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "c7h", "PROPOSED", "ACTIVE", "NEEDS_ATTENTION", "PAUSED", "COMPLETED", "FAILED", "REJECTED", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = d7h.class)
public final class TaskProposeOutputStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ TaskProposeOutputStatus[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final c7h Companion;
    private final String loggingName;
    public static final TaskProposeOutputStatus PROPOSED = new TaskProposeOutputStatus("PROPOSED", 0, "proposed");
    public static final TaskProposeOutputStatus ACTIVE = new TaskProposeOutputStatus("ACTIVE", 1, "active");
    public static final TaskProposeOutputStatus NEEDS_ATTENTION = new TaskProposeOutputStatus("NEEDS_ATTENTION", 2, "needs_attention");
    public static final TaskProposeOutputStatus PAUSED = new TaskProposeOutputStatus("PAUSED", 3, "paused");
    public static final TaskProposeOutputStatus COMPLETED = new TaskProposeOutputStatus("COMPLETED", 4, "completed");
    public static final TaskProposeOutputStatus FAILED = new TaskProposeOutputStatus("FAILED", 5, "failed");
    public static final TaskProposeOutputStatus REJECTED = new TaskProposeOutputStatus("REJECTED", 6, "rejected");

    private static final /* synthetic */ TaskProposeOutputStatus[] $values() {
        return new TaskProposeOutputStatus[]{PROPOSED, ACTIVE, NEEDS_ATTENTION, PAUSED, COMPLETED, FAILED, REJECTED};
    }

    static {
        TaskProposeOutputStatus[] taskProposeOutputStatusArr$values = $values();
        $VALUES = taskProposeOutputStatusArr$values;
        $ENTRIES = wd6.n0(taskProposeOutputStatusArr$values);
        Companion = new c7h();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new crg(27));
    }

    private TaskProposeOutputStatus(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.TaskProposeOutputStatus", values(), new String[]{"proposed", "active", "needs_attention", "paused", "completed", "failed", "rejected"}, new Annotation[][]{null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static TaskProposeOutputStatus valueOf(String str) {
        return (TaskProposeOutputStatus) Enum.valueOf(TaskProposeOutputStatus.class, str);
    }

    public static TaskProposeOutputStatus[] values() {
        return (TaskProposeOutputStatus[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
