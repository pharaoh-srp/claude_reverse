package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ssa {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[y3a.values().length];
        try {
            iArr[y3a.ON_DESTROY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y3a.ON_CREATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y3a.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[y3a.ON_RESUME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[y3a.ON_PAUSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[y3a.ON_STOP.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
