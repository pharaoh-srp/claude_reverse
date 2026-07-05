package defpackage;

import com.anthropic.claude.api.tasks.TaskStepStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class v9h {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TaskStepStatus.values().length];
        try {
            iArr[TaskStepStatus.NEEDS_ATTENTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaskStepStatus.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TaskStepStatus.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TaskStepStatus.SKIPPED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TaskStepStatus.NOT_STARTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
