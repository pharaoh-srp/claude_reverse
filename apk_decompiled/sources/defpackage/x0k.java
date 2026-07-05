package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x0k {
    public static final x0k c;
    public static final x0k d;
    public final boolean a;
    public final Throwable b;

    static {
        if (j1k.J) {
            d = null;
            c = null;
        } else {
            d = new x0k(null, false);
            c = new x0k(null, true);
        }
    }

    public x0k(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
