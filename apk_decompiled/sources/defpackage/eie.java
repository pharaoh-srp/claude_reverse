package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eie implements zy7 {
    public final xy7 E;
    public final zy7 F;
    public final odg G;
    public final n0 H;

    public eie(xy7 xy7Var, zy7 zy7Var) {
        boolean z;
        boolean z2;
        this.E = xy7Var;
        this.F = zy7Var;
        odg odgVar = new odg(new u9e(1));
        odgVar.e();
        this.G = odgVar;
        n0 n0Var = new n0(1, this, eie.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0, 12);
        this.H = n0Var;
        synchronized (xy7Var.c) {
            if (xy7Var.f) {
                z = true;
            } else {
                xy7Var.g.add(this);
                z = false;
            }
        }
        if (z) {
            a();
        }
        synchronized (xy7Var.c) {
            z2 = xy7Var.f;
        }
        if (z2) {
            return;
        }
        synchronized (xy7Var.c) {
            if (!xy7Var.f) {
                xy7Var.d++;
            }
        }
        z9e z9eVar = new z9e();
        odgVar.d(zy7Var, n0Var, new vc8(z9eVar, 20, zy7Var));
        if (z9eVar.E) {
            d();
        }
    }

    @Override // defpackage.zy7
    public final Object a() {
        odg odgVar = this.G;
        odgVar.a();
        cd cdVar = (cd) odgVar.i;
        if (cdVar != null) {
            cdVar.h();
        }
        return iei.a;
    }

    public final void d() {
        boolean z;
        int i;
        this.G.b(this.F);
        xy7 xy7Var = this.E;
        synchronized (xy7Var.c) {
            z = xy7Var.f;
        }
        if (!z) {
            xy7 xy7Var2 = this.E;
            synchronized (xy7Var2.c) {
                if (!xy7Var2.f && (i = xy7Var2.d) > 0) {
                    int i2 = i - 1;
                    xy7Var2.d = i2;
                    if (!xy7Var2.e && i2 == 0) {
                        xy7Var2.e = true;
                        xy7Var2.a.execute(xy7Var2.h);
                    }
                }
            }
        }
        odg odgVar = this.G;
        odgVar.a();
        cd cdVar = (cd) odgVar.i;
        if (cdVar != null) {
            cdVar.h();
        }
    }
}
