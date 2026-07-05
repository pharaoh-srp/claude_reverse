package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yk6 implements qk6 {
    public skh b;
    public String a = "";
    public int c = Integer.MAX_VALUE;
    public q68 d = o68.a;

    @Override // defpackage.qk6
    public final qk6 a() {
        yk6 yk6Var = new yk6();
        yk6Var.d = this.d;
        yk6Var.a = this.a;
        yk6Var.b = this.b;
        yk6Var.c = this.c;
        return yk6Var;
    }

    @Override // defpackage.qk6
    public final q68 b() {
        return this.d;
    }

    @Override // defpackage.qk6
    public final void c(q68 q68Var) {
        this.d = q68Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmittableText(");
        sb.append(this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", modifier=");
        sb.append(this.d);
        sb.append(", maxLines=");
        return vb7.r(sb, this.c, ')');
    }
}
