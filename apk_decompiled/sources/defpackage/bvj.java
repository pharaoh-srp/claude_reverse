package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class bvj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[lxj.values().length];
        a = iArr;
        try {
            iArr[lxj.EQUALS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[lxj.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[lxj.GREATER_THAN_EQUALS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[lxj.IDENTITY_EQUALS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[lxj.IDENTITY_NOT_EQUALS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[lxj.LESS_THAN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[lxj.LESS_THAN_EQUALS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[lxj.NOT_EQUALS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
