package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryOutcome;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class wl2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChatEvents$PollingRecoveryOutcome.values().length];
        try {
            iArr[ChatEvents$PollingRecoveryOutcome.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChatEvents$PollingRecoveryOutcome.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChatEvents$PollingRecoveryOutcome.SUPERSEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChatEvents$PollingRecoveryOutcome.EXHAUSTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChatEvents$PollingRecoveryOutcome.SKIPPED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ChatEvents$PollingRecoveryOutcome.UNSPECIFIED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
