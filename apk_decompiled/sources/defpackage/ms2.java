package defpackage;

import com.anthropic.claude.api.chat.ChatFeedbackType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ms2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChatFeedbackType.values().length];
        try {
            iArr[ChatFeedbackType.FLAG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChatFeedbackType.FLAG_BUG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChatFeedbackType.FLAG_FACTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChatFeedbackType.FLAG_FILE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChatFeedbackType.FLAG_HARMFUL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ChatFeedbackType.FLAG_INCOMPLETE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ChatFeedbackType.FLAG_MEMORY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ChatFeedbackType.FLAG_INSTRUCTIONS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ChatFeedbackType.FLAG_OTHER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ChatFeedbackType.FLAG_REFUSAL.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ChatFeedbackType.FLAG_SAFETY_CLASSIFIER_FALSE_POSITIVE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[ChatFeedbackType.UPVOTE.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        a = iArr;
    }
}
