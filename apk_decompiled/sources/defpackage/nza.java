package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class nza {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[y3a.values().length];
        try {
            iArr[y3a.ON_PAUSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y3a.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
