package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cp4 {
    public final kdg a = new kdg();

    public static void b(cp4 cp4Var, pz7 pz7Var, ta4 ta4Var, zy7 zy7Var, int i) {
        if ((i & 8) != 0) {
            ta4Var = null;
        }
        cp4Var.a.add(new ta4(-1789283891, true, new bn(pz7Var, cp4Var, ta4Var, zy7Var)));
    }

    public final void a(yo4 yo4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-798501095);
        int i2 = (e18Var.f(yo4Var) ? 4 : 2) | i | (e18Var.f(this) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            kdg kdgVar = this.a;
            int size = kdgVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((rz7) kdgVar.get(i3)).invoke(yo4Var, e18Var, Integer.valueOf(i2 & 14));
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t04(this, yo4Var, i, 15);
        }
    }
}
