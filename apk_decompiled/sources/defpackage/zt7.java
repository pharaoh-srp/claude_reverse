package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zt7 implements wt7 {
    public final m20 a;
    public final n20 b;
    public final cbf c;
    public final du7 d;
    public final efe e;
    public final a2 f;

    public zt7(m20 m20Var, n20 n20Var) {
        cbf cbfVar = au7.a;
        du7 du7Var = new du7(au7.b);
        efe efeVar = new efe((byte) 0, 22);
        this.a = m20Var;
        this.b = n20Var;
        this.c = cbfVar;
        this.d = du7Var;
        this.e = efeVar;
        this.f = new a2(26, this);
    }

    public final ubi a(rbi rbiVar) {
        cbf cbfVar = this.c;
        vk3 vk3Var = new vk3(this, 6, rbiVar);
        synchronized (((lja) cbfVar.F)) {
            ubi ubiVar = (ubi) ((zna) cbfVar.G).c(rbiVar);
            if (ubiVar != null) {
                if (ubiVar.b()) {
                    return ubiVar;
                }
            }
            try {
                ubi ubiVar2 = (ubi) vk3Var.invoke(new e6f(cbfVar, 15, rbiVar));
                synchronized (((lja) cbfVar.F)) {
                    if (((zna) cbfVar.G).c(rbiVar) == null && ubiVar2.b()) {
                        ((zna) cbfVar.G).d(rbiVar, ubiVar2);
                    }
                }
                return ubiVar2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final ubi b(xt7 xt7Var, dv7 dv7Var, int i, int i2) {
        n20 n20Var = this.b;
        n20Var.getClass();
        int i3 = n20Var.E;
        dv7 dv7Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? dv7Var : new dv7(wd6.e0(dv7Var.E + i3, 1, 1000));
        this.a.getClass();
        return a(new rbi(xt7Var, dv7Var2, i, i2, null));
    }
}
