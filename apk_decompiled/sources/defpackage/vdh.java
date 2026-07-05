package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class vdh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[x9d.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[y9d.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[2] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[1] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[Layout.Alignment.values().length];
        try {
            iArr3[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr3;
    }
}
