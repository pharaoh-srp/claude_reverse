package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e1h {
    public final int a;
    public final int b;
    public final int c;
    public final bz7 d;

    public e1h(int i, int i2, int i3, bz7 bz7Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bz7Var;
    }

    public final int a(boolean z) {
        if (this.c == 0) {
            return 0;
        }
        return z ? this.b : this.a;
    }
}
