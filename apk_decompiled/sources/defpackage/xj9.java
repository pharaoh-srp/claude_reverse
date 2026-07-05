package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class xj9 implements zmc {
    public final gfa a;
    public final uqb b;
    public final r06 c;
    public final efa d;

    public xj9(gfa gfaVar, gmf gmfVar, uqb uqbVar, dpf dpfVar, wj9 wj9Var, wj9 wj9Var2, c3c c3cVar, ql8 ql8Var) {
        wj9Var.getClass();
        wj9Var2.getClass();
        c3cVar.getClass();
        this.a = gfaVar;
        this.b = uqbVar;
        this.d = gfaVar.c(new e0(1, this));
        gmf gmfVar2 = new gmf(13, this);
        pz1 pz1Var = pz1.m;
        this.c = new r06(gfaVar, uqbVar, gmfVar2, new nyj(uqbVar, dpfVar, pz1Var), this, du6.i, lz1.K, x44.X(new oz1(gfaVar, uqbVar), new oj9(gfaVar, uqbVar)), dpfVar, wj9Var, wj9Var2, pz1Var.a, c3cVar, ql8Var, null, 786432);
    }

    @Override // defpackage.zmc
    public final boolean a(ww7 ww7Var) {
        ww7Var.getClass();
        efa efaVar = this.d;
        Object obj = efaVar.F.get(ww7Var);
        return ((obj == null || obj == ffa.F) ? c(ww7Var) : (wmc) efaVar.invoke(ww7Var)) == null;
    }

    @Override // defpackage.zmc
    public final void b(ww7 ww7Var, ArrayList arrayList) throws Throwable {
        ww7Var.getClass();
        Object objInvoke = this.d.invoke(ww7Var);
        if (objInvoke != null) {
            arrayList.add(objInvoke);
        }
    }

    public final vz1 c(ww7 ww7Var) {
        InputStream inputStreamA;
        ww7Var.getClass();
        if (ww7Var.h(pkg.i)) {
            pz1.m.getClass();
            inputStreamA = xz1.a(pz1.a(ww7Var));
        } else {
            inputStreamA = null;
        }
        if (inputStreamA != null) {
            return mwa.x(ww7Var, this.a, this.b, inputStreamA);
        }
        return null;
    }

    @Override // defpackage.zmc
    public final Collection g(ww7 ww7Var, bz7 bz7Var) {
        ww7Var.getClass();
        return um6.E;
    }
}
