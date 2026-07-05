package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 {
    public static final j1 c;
    public static final j1 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (w1.H) {
            d = null;
            c = null;
        } else {
            d = new j1(null, false);
            c = new j1(null, true);
        }
    }

    public j1(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
