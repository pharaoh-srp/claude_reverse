package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class jvg extends gab {
    public final tqb b;
    public final ww7 c;

    public jvg(tqb tqbVar, ww7 ww7Var) {
        tqbVar.getClass();
        ww7Var.getClass();
        this.b = tqbVar;
        this.c = ww7Var;
    }

    @Override // defpackage.gab, defpackage.fab
    public final Collection b(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        bm4 bm4Var = c06.c;
        if (c06Var.a(bm4.k())) {
            ww7 ww7Var = this.c;
            if (!ww7Var.d() || !c06Var.b().contains(zz5.a)) {
                tqb tqbVar = this.b;
                Collection collectionG = tqbVar.g(ww7Var, bz7Var);
                ArrayList arrayList = new ArrayList(collectionG.size());
                Iterator it = collectionG.iterator();
                while (it.hasNext()) {
                    sxb sxbVarF = ((ww7) it.next()).f();
                    sxbVarF.getClass();
                    if (((Boolean) bz7Var.invoke(sxbVarF)).booleanValue()) {
                        d1a d1aVar = null;
                        if (!sxbVarF.F) {
                            d1a d1aVarA0 = tqbVar.a0(ww7Var.c(sxbVarF));
                            if (!((Boolean) wd6.s0(d1aVarA0.J, d1a.L[1])).booleanValue()) {
                                d1aVar = d1aVarA0;
                            }
                        }
                        if (d1aVar != null) {
                            arrayList.add(d1aVar);
                        }
                    }
                }
                return arrayList;
            }
        }
        return lm6.E;
    }

    @Override // defpackage.gab, defpackage.fab
    public final Set c() {
        return um6.E;
    }

    public final String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}
