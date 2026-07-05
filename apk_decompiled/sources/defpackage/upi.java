package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class upi {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[vfd.values().length];
        try {
            iArr[vfd.BOOLEAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vfd.CHAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vfd.BYTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vfd.SHORT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[vfd.INT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[vfd.FLOAT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[vfd.LONG.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[vfd.DOUBLE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
