package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class xtj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[lxj.values().length];
        a = iArr;
        try {
            iArr[lxj.BITWISE_AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[lxj.BITWISE_LEFT_SHIFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[lxj.BITWISE_NOT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[lxj.BITWISE_OR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[lxj.BITWISE_RIGHT_SHIFT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[lxj.BITWISE_UNSIGNED_RIGHT_SHIFT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[lxj.BITWISE_XOR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
