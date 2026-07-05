package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u35 {
    public final x35 a;
    public final int b;

    static {
        x35.g.getClass();
        w35 w35Var = w35.a;
        new u35(100, w35.b);
    }

    public u35(int i, x35 x35Var) {
        x35Var.getClass();
        this.a = x35Var;
        this.b = i;
        if (i < 0 || i >= 101) {
            sz6.p("`sizePercent` must be in [0, 100].");
            throw null;
        }
    }

    public final float a(float f, float f2) {
        return (f / 100.0f) * this.b;
    }
}
