package defpackage;

import com.anthropic.claude.sessions.types.PermissionMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class f34 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PermissionMode.values().length];
        try {
            iArr[PermissionMode.Plan.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PermissionMode.Default.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PermissionMode.Auto.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[nj6.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[kh2.values().length];
        try {
            iArr3[1] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[0] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr3;
        int[] iArr4 = new int[jmh.values().length];
        try {
            iArr4[0] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[1] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[2] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[3] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[4] = 5;
        } catch (NoSuchFieldError unused13) {
        }
    }
}
