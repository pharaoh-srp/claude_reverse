package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bo0 extends iv1 {
    public static volatile bo0 g;
    public static final ao0 h = new ao0(0);
    public final mu5 f = new mu5();

    public static bo0 T() {
        if (g != null) {
            return g;
        }
        synchronized (bo0.class) {
            try {
                if (g == null) {
                    g = new bo0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g;
    }
}
