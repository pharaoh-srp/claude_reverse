package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mk9 implements fab {
    public static final /* synthetic */ wn9[] f;
    public final el5 b;
    public final by9 c;
    public final hy9 d;
    public final dfa e;

    static {
        kce kceVar = jce.a;
        f = new wn9[]{kceVar.g(new mrd(kceVar.b(mk9.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public mk9(el5 el5Var, ube ubeVar, by9 by9Var) {
        this.b = el5Var;
        this.c = by9Var;
        this.d = new hy9(el5Var, ubeVar, by9Var);
        gfa gfaVar = ((ke9) el5Var.E).a;
        l4 l4Var = new l4(20, this);
        gfaVar.getClass();
        this.e = new dfa(gfaVar, l4Var);
    }

    @Override // defpackage.fab
    public final Set a() {
        fab[] fabVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (fab fabVar : fabVarArrH) {
            b54.t0(linkedHashSet, fabVar.a());
        }
        linkedHashSet.addAll(this.d.a());
        return linkedHashSet;
    }

    @Override // defpackage.fab
    public final Collection b(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        fab[] fabVarArrH = h();
        Collection collectionB = this.d.b(c06Var, bz7Var);
        for (fab fabVar : fabVarArrH) {
            collectionB = huk.k(collectionB, fabVar.b(c06Var, bz7Var));
        }
        return collectionB == null ? um6.E : collectionB;
    }

    @Override // defpackage.fab
    public final Set c() {
        fab[] fabVarArrH = h();
        fabVarArrH.getClass();
        HashSet hashSetM = ypk.m(fabVarArrH.length == 0 ? lm6.E : new op0(0, fabVarArrH));
        if (hashSetM == null) {
            return null;
        }
        hashSetM.addAll(this.d.c());
        return hashSetM;
    }

    @Override // defpackage.fab
    public final Collection d(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        i(sxbVar, i);
        fab[] fabVarArrH = h();
        this.d.getClass();
        sq6.a(i);
        Collection collectionK = lm6.E;
        for (fab fabVar : fabVarArrH) {
            collectionK = huk.k(collectionK, fabVar.d(sxbVar, i));
        }
        return collectionK == null ? um6.E : collectionK;
    }

    @Override // defpackage.fab
    public final xh3 e(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        i(sxbVar, i);
        hy9 hy9Var = this.d;
        hy9Var.getClass();
        xh3 xh3Var = null;
        qqb qqbVarV = hy9Var.v(sxbVar, null);
        if (qqbVarV != null) {
            return qqbVarV;
        }
        for (fab fabVar : h()) {
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
        fab[] fabVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (fab fabVar : fabVarArrH) {
            b54.t0(linkedHashSet, fabVar.f());
        }
        linkedHashSet.addAll(this.d.f());
        return linkedHashSet;
    }

    @Override // defpackage.fab
    public final Collection g(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        i(sxbVar, i);
        fab[] fabVarArrH = h();
        Collection collectionG = this.d.g(sxbVar, i);
        for (fab fabVar : fabVarArrH) {
            collectionG = huk.k(collectionG, fabVar.g(sxbVar, i));
        }
        return collectionG == null ? um6.E : collectionG;
    }

    public final fab[] h() {
        return (fab[]) wd6.s0(this.e, f[0]);
    }

    public final void i(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        zni.T(((ke9) this.b.E).n, i, this.c, sxbVar);
    }

    public final String toString() {
        return "scope for " + this.c;
    }
}
