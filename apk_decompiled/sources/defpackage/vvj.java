package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class vvj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[lxj.values().length];
        a = iArr;
        try {
            iArr[lxj.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[lxj.NOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[lxj.OR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
