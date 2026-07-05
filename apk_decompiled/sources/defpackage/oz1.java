package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oz1 implements yg3 {
    public final gfa a;
    public final tqb b;

    public oz1(gfa gfaVar, uqb uqbVar) {
        uqbVar.getClass();
        this.a = gfaVar;
        this.b = uqbVar;
    }

    @Override // defpackage.yg3
    public final qqb a(gh3 gh3Var) {
        gh3Var.getClass();
        if (gh3Var.c || !gh3Var.b.e().d()) {
            return null;
        }
        String strB = gh3Var.h().b();
        if (!bsg.u0(strB, "Function", false)) {
            return null;
        }
        ww7 ww7VarG = gh3Var.g();
        ww7VarG.getClass();
        e08.G.getClass();
        d08 d08VarU = k2e.u(strB, ww7VarG);
        if (d08VarU == null) {
            return null;
        }
        e08 e08VarA = d08VarU.a();
        int iB = d08VarU.b();
        List list = (List) wd6.s0(this.b.a0(ww7VarG).I, d1a.L[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof vz1) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        ij0.x(w44.N0(arrayList2));
        return new c08(this.a, (vz1) w44.L0(arrayList), e08VarA, iB);
    }

    @Override // defpackage.yg3
    public final Collection b(ww7 ww7Var) {
        ww7Var.getClass();
        return um6.E;
    }

    @Override // defpackage.yg3
    public final boolean c(ww7 ww7Var, sxb sxbVar) {
        ww7Var.getClass();
        sxbVar.getClass();
        String strB = sxbVar.b();
        strB.getClass();
        if (isg.q0(strB, "Function", false) || isg.q0(strB, "KFunction", false) || isg.q0(strB, "SuspendFunction", false) || isg.q0(strB, "KSuspendFunction", false)) {
            e08.G.getClass();
            if (k2e.u(strB, ww7Var) != null) {
                return true;
            }
        }
        return false;
    }
}
