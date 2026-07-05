package defpackage;

import com.anthropic.claude.api.kyc.KycStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ls9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[KycStatus.values().length];
        try {
            iArr[KycStatus.NOT_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KycStatus.VERIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KycStatus.EXPIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[KycStatus.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[KycStatus.CREATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[KycStatus.IN_PROGRESS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[KycStatus.MANUAL_REVIEW.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[KycStatus.FAILED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[KycStatus.DENIED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
