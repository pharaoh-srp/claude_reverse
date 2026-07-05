package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u3 {
    public static final u3 c;
    public static final u3 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (z3.H) {
            d = null;
            c = null;
        } else {
            d = new u3(null, false);
            c = new u3(null, true);
        }
    }

    public u3(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
