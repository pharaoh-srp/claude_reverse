package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryOutcome;
import com.anthropic.claude.api.chat.MessageSender;
import com.anthropic.claude.api.chat.messages.CompactionStatus;
import com.anthropic.claude.api.experience.ExperienceTooltipLocation;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class e43 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[vba.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[MessageSender.values().length];
        try {
            iArr2[MessageSender.HUMAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[MessageSender.ASSISTANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr2;
        int[] iArr3 = new int[ChatEvents$PollingRecoveryOutcome.values().length];
        try {
            iArr3[ChatEvents$PollingRecoveryOutcome.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[ChatEvents$PollingRecoveryOutcome.EXHAUSTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[ChatEvents$PollingRecoveryOutcome.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[ChatEvents$PollingRecoveryOutcome.SKIPPED.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[ChatEvents$PollingRecoveryOutcome.SUPERSEDED.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[ChatEvents$PollingRecoveryOutcome.UNSPECIFIED.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        b = iArr3;
        int[] iArr4 = new int[CompactionStatus.Status.values().length];
        try {
            iArr4[CompactionStatus.Status.COMPACTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[CompactionStatus.Status.COMPLETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[CompactionStatus.Status.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        c = iArr4;
        int[] iArr5 = new int[ExperienceTooltipLocation.values().length];
        try {
            iArr5[ExperienceTooltipLocation.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[ExperienceTooltipLocation.MODEL_SELECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        d = iArr5;
    }
}
