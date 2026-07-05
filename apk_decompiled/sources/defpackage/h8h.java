package defpackage;

import com.anthropic.claude.api.tasks.TaskStatus;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class h8h {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TaskStatus.values().length];
        try {
            iArr[TaskStatus.NEEDS_ATTENTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaskStatus.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TaskStatus.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TaskStatus.REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TaskStatus.ACTIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TaskStatus.PROPOSED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TaskStatus.PAUSED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
