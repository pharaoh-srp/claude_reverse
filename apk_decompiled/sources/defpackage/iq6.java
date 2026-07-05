package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class iq6 extends gab {
    public final afa b;
    public final afa c;
    public final dfa d;
    public final /* synthetic */ jq6 e;

    public iq6(jq6 jq6Var, gfa gfaVar) {
        int i = 0;
        if (gfaVar == null) {
            h(0);
            throw null;
        }
        this.e = jq6Var;
        this.b = gfaVar.b(new hq6(this, i));
        this.c = gfaVar.b(new hq6(this, 1));
        this.d = new dfa(gfaVar, new o4(6, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void h(int r13) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iq6.h(int):void");
    }

    @Override // defpackage.gab, defpackage.fab
    public final Set a() {
        Set set = (Set) this.e.M.a();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // defpackage.gab, defpackage.fab
    public final Collection b(c06 c06Var, bz7 bz7Var) {
        if (c06Var == null) {
            h(13);
            throw null;
        }
        Collection collection = (Collection) this.d.a();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    @Override // defpackage.gab, defpackage.fab
    public final Set c() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        h(18);
        throw null;
    }

    @Override // defpackage.gab, defpackage.fab
    public final Collection d(sxb sxbVar, int i) {
        if (sxbVar == null) {
            h(1);
            throw null;
        }
        if (i != 0) {
            return (Collection) this.c.invoke(sxbVar);
        }
        h(2);
        throw null;
    }

    @Override // defpackage.gab, defpackage.fab
    public final Set f() {
        Set set = (Set) this.e.M.a();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    @Override // defpackage.gab, defpackage.fab
    public final Collection g(sxb sxbVar, int i) {
        if (sxbVar == null) {
            h(5);
            throw null;
        }
        if (i != 0) {
            return (Collection) this.b.invoke(sxbVar);
        }
        h(6);
        throw null;
    }

    public final fab i() {
        fab fabVarG = ((yr9) ((m4) this.e.p()).b().iterator().next()).G();
        if (fabVarG != null) {
            return fabVarG;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(sxb sxbVar, Collection collection) {
        if (sxbVar == null) {
            h(10);
            throw null;
        }
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        gmc.c.h(sxbVar, collection, Collections.EMPTY_SET, this.e, new x06(linkedHashSet, 1));
        return linkedHashSet;
    }
}
