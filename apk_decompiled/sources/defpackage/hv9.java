package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hv9 implements p5b {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ bz7 d;
    public final /* synthetic */ iv9 e;
    public final /* synthetic */ nv9 f;
    public final /* synthetic */ bz7 g;

    public hv9(int i, int i2, Map map, bz7 bz7Var, iv9 iv9Var, nv9 nv9Var, bz7 bz7Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = bz7Var;
        this.e = iv9Var;
        this.f = nv9Var;
        this.g = bz7Var2;
    }

    @Override // defpackage.p5b
    public final int a() {
        return this.b;
    }

    @Override // defpackage.p5b
    public final int b() {
        return this.a;
    }

    @Override // defpackage.p5b
    public final Map c() {
        return this.c;
    }

    @Override // defpackage.p5b
    public final void d() {
        y39 y39Var;
        av9 av9Var = this.f.E;
        boolean zN0 = this.e.n0();
        bz7 bz7Var = this.g;
        if (!zN0 || (y39Var = ((z39) av9Var.k0.H).z0) == null) {
            bz7Var.invoke(((z39) av9Var.k0.H).P);
        } else {
            bz7Var.invoke(y39Var.P);
        }
    }

    @Override // defpackage.p5b
    public final bz7 e() {
        return this.d;
    }
}
