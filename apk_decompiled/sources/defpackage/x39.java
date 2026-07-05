package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x39 extends gab {
    public final fab b;

    public x39(fab fabVar) {
        fabVar.getClass();
        this.b = fabVar;
    }

    @Override // defpackage.gab, defpackage.fab
    public final Set a() {
        return this.b.a();
    }

    @Override // defpackage.gab, defpackage.fab
    public final Collection b(c06 c06Var, bz7 bz7Var) {
        Collection collection;
        c06Var.getClass();
        bm4 bm4Var = c06.c;
        c06 c06VarC = c06Var.c(bm4.h());
        if (c06VarC == null) {
            collection = lm6.E;
        } else {
            Collection collectionB = this.b.b(c06VarC, bz7Var);
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionB) {
                if (obj instanceof yh3) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    @Override // defpackage.gab, defpackage.fab
    public final Set c() {
        return this.b.c();
    }

    @Override // defpackage.gab, defpackage.fab
    public final xh3 e(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        xh3 xh3VarE = this.b.e(sxbVar, i);
        if (xh3VarE != null) {
            qqb qqbVar = xh3VarE instanceof qqb ? (qqb) xh3VarE : null;
            if (qqbVar != null) {
                return qqbVar;
            }
            if (xh3VarE instanceof q16) {
                return (q16) xh3VarE;
            }
        }
        return null;
    }

    @Override // defpackage.gab, defpackage.fab
    public final Set f() {
        return this.b.f();
    }

    public final String toString() {
        return "Classes from " + this.b;
    }
}
