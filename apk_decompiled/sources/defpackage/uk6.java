package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uk6 implements qk6 {
    public j50 b;
    public irh c;
    public Float d;
    public q68 a = o68.a;
    public int e = 1;

    @Override // defpackage.qk6
    public final qk6 a() {
        uk6 uk6Var = new uk6();
        uk6Var.a = this.a;
        uk6Var.b = this.b;
        uk6Var.c = this.c;
        uk6Var.d = this.d;
        uk6Var.e = this.e;
        return uk6Var;
    }

    @Override // defpackage.qk6
    public final q68 b() {
        return this.a;
    }

    @Override // defpackage.qk6
    public final void c(q68 q68Var) {
        this.a = q68Var;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.a + ", provider=" + this.b + ", colorFilterParams=" + this.c + ", alpha=" + this.d + ", contentScale=" + ((Object) io4.a(this.e)) + ')';
    }
}
