package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class udc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[y3a.values().length];
        try {
            iArr[y3a.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y3a.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y3a.ON_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
