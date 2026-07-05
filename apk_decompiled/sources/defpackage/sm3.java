package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class sm3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[y3a.values().length];
        try {
            iArr[y3a.ON_STOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y3a.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
