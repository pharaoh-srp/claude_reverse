package defpackage;

import com.anthropic.claude.sessions.types.SessionStatus;
import com.anthropic.claude.sessions.types.SummaryStatusCategory;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class mp {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SessionStatus.values().length];
        try {
            iArr[SessionStatus.REQUIRES_ACTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SessionStatus.IDLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SessionStatus.RUNNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SessionStatus.PENDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SessionStatus.ARCHIVED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SessionStatus.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[SummaryStatusCategory.values().length];
        try {
            iArr2[SummaryStatusCategory.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SummaryStatusCategory.REVIEW_READY.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[SummaryStatusCategory.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[SummaryStatusCategory.BLOCKED.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[SummaryStatusCategory.NEED_INPUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[SummaryStatusCategory.WAITING.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[SummaryStatusCategory.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        b = iArr2;
        int[] iArr3 = new int[x76.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused16) {
        }
    }
}
