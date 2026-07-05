package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ug2 implements fab {
    public final String b;
    public final fab[] c;

    public ug2(String str, fab[] fabVarArr) {
        this.b = str;
        this.c = fabVarArr;
    }

    @Override // defpackage.fab
    public final Set a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (fab fabVar : this.c) {
            b54.t0(linkedHashSet, fabVar.a());
        }
        return linkedHashSet;
    }

    @Override // defpackage.fab
    public final Collection b(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        fab[] fabVarArr = this.c;
        int length = fabVarArr.length;
        if (length == 0) {
            return lm6.E;
        }
        if (length == 1) {
            return fabVarArr[0].b(c06Var, bz7Var);
        }
        Collection collectionK = null;
        for (fab fabVar : fabVarArr) {
            collectionK = huk.k(collectionK, fabVar.b(c06Var, bz7Var));
        }
        return collectionK == null ? um6.E : collectionK;
    }

    @Override // defpackage.fab
    public final Set c() {
        fab[] fabVarArr = this.c;
        fabVarArr.getClass();
        return ypk.m(fabVarArr.length == 0 ? lm6.E : new op0(0, fabVarArr));
    }

    @Override // defpackage.fab
    public final Collection d(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        fab[] fabVarArr = this.c;
        int length = fabVarArr.length;
        if (length == 0) {
            return lm6.E;
        }
        if (length == 1) {
            return fabVarArr[0].d(sxbVar, i);
        }
        Collection collectionK = null;
        for (fab fabVar : fabVarArr) {
            collectionK = huk.k(collectionK, fabVar.d(sxbVar, i));
        }
        return collectionK == null ? um6.E : collectionK;
    }

    @Override // defpackage.fab
    public final xh3 e(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        xh3 xh3Var = null;
        for (fab fabVar : this.c) {
            xh3 xh3VarE = fabVar.e(sxbVar, i);
            if (xh3VarE != null) {
                if (!(xh3VarE instanceof yh3) || !((yh3) xh3VarE).x()) {
                    return xh3VarE;
                }
                if (xh3Var == null) {
                    xh3Var = xh3VarE;
                }
            }
        }
        return xh3Var;
    }

    @Override // defpackage.fab
    public final Set f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (fab fabVar : this.c) {
            b54.t0(linkedHashSet, fabVar.f());
        }
        return linkedHashSet;
    }

    @Override // defpackage.fab
    public final Collection g(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        fab[] fabVarArr = this.c;
        int length = fabVarArr.length;
        if (length == 0) {
            return lm6.E;
        }
        if (length == 1) {
            return fabVarArr[0].g(sxbVar, i);
        }
        Collection collectionK = null;
        for (fab fabVar : fabVarArr) {
            collectionK = huk.k(collectionK, fabVar.g(sxbVar, i));
        }
        return collectionK == null ? um6.E : collectionK;
    }

    public final String toString() {
        return this.b;
    }
}
