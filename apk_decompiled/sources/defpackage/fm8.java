package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fm8 implements wd7 {
    public final wd7 a;
    public final boolean b;

    public fm8(int i) {
        boolean z = (i & 1) != 0;
        this.b = z;
        if (z) {
            this.a = new b8g(-1, -1, "image/heif");
        } else {
            this.a = new em8();
        }
    }

    @Override // defpackage.wd7
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.wd7
    public final int b(xd7 xd7Var, xm7 xm7Var) {
        return this.a.b(xd7Var, xm7Var);
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) {
        return this.b ? osk.t((fr5) xd7Var, false) : this.a.c(xd7Var);
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        this.a.d(j, j2);
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        this.a.f(yd7Var);
    }
}
