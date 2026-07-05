package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h4a {
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
            iArr[y3a.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[y3a.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
