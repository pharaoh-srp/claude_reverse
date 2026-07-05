package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class fai extends b4 {
    public final fab b;

    public fai(fab fabVar) {
        this.b = fabVar;
    }

    @Override // defpackage.b4, defpackage.fab
    public final Collection b(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        Collection collectionB = super.b(c06Var, bz7Var);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionB) {
            if (((bo5) obj) instanceof c92) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return w44.a1(nwk.k(arrayList, pgg.L), arrayList2);
    }

    @Override // defpackage.b4, defpackage.fab
    public final Collection d(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i != 0) {
            return nwk.k(super.d(sxbVar, i), pgg.N);
        }
        throw null;
    }

    @Override // defpackage.b4, defpackage.fab
    public final Collection g(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i != 0) {
            return nwk.k(super.g(sxbVar, i), pgg.M);
        }
        throw null;
    }

    @Override // defpackage.b4
    public final fab i() {
        return this.b;
    }
}
