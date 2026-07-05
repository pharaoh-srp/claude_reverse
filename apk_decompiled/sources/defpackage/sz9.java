package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sz9 {
    public final Object a;
    public final uz9 b;
    public int d;
    public sz9 e;
    public boolean f;
    public int c = -1;
    public final lsc g = mpk.P(null);

    public sz9(Object obj, uz9 uz9Var) {
        this.a = obj;
        this.b = uz9Var;
    }

    public final sz9 a() {
        if (this.f) {
            e39.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.E.add(this);
            sz9 sz9Var = (sz9) this.g.getValue();
            if (sz9Var != null) {
                sz9Var.a();
            } else {
                sz9Var = null;
            }
            this.e = sz9Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            e39.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.E.remove(this);
            sz9 sz9Var = this.e;
            if (sz9Var != null) {
                sz9Var.b();
            }
            this.e = null;
        }
    }
}
