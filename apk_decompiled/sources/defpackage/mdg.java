package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mdg implements img, Map, qm9 {
    public ldg E;
    public final zcg F;
    public final zcg G;
    public final zcg H;

    public mdg() {
        jyc jycVar = jyc.G;
        rcg rcgVarJ = ycg.j();
        ldg ldgVar = new ldg(rcgVarJ.g(), jycVar);
        if (!(rcgVarJ instanceof w78)) {
            ldgVar.b = new ldg(1L, jycVar);
        }
        this.E = ldgVar;
        this.F = new zcg(this, 0);
        this.G = new zcg(this, 1);
        this.H = new zcg(this, 2);
    }

    public static final boolean c(mdg mdgVar, ldg ldgVar, int i, jyc jycVar) {
        boolean z;
        synchronized (gb9.b) {
            int i2 = ldgVar.d;
            if (i2 == i) {
                ldgVar.c = jycVar;
                z = true;
                ldgVar.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.img
    public final kmg a() {
        return this.E;
    }

    @Override // java.util.Map
    public final void clear() {
        rcg rcgVarJ;
        ldg ldgVar = this.E;
        ldgVar.getClass();
        ldg ldgVar2 = (ldg) ycg.h(ldgVar);
        jyc jycVar = jyc.G;
        if (jycVar != ldgVar2.c) {
            ldg ldgVar3 = this.E;
            ldgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                ldg ldgVar4 = (ldg) ycg.w(ldgVar3, this, rcgVarJ);
                synchronized (gb9.b) {
                    ldgVar4.c = jycVar;
                    ldgVar4.d++;
                }
            }
            ycg.n(rcgVarJ, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return d().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return d().c.containsValue(obj);
    }

    public final ldg d() {
        ldg ldgVar = this.E;
        ldgVar.getClass();
        return (ldg) ycg.t(ldgVar, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.F;
    }

    @Override // defpackage.img
    public final void g(kmg kmgVar) {
        kmgVar.getClass();
        this.E = (ldg) kmgVar;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return d().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return d().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.G;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        jyc jycVar;
        int i;
        Object objPut;
        rcg rcgVarJ;
        boolean zC;
        do {
            synchronized (gb9.b) {
                ldg ldgVar = this.E;
                ldgVar.getClass();
                ldg ldgVar2 = (ldg) ycg.h(ldgVar);
                jycVar = ldgVar2.c;
                i = ldgVar2.d;
            }
            jycVar.getClass();
            nyc nycVarG = jycVar.g();
            objPut = nycVarG.put(obj, obj2);
            jyc jycVarG = nycVarG.g();
            if (x44.r(jycVarG, jycVar)) {
                break;
            }
            ldg ldgVar3 = this.E;
            ldgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zC = c(this, (ldg) ycg.w(ldgVar3, this, rcgVarJ), i, jycVarG);
            }
            ycg.n(rcgVarJ, this);
        } while (!zC);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        jyc jycVar;
        int i;
        rcg rcgVarJ;
        boolean zC;
        do {
            synchronized (gb9.b) {
                ldg ldgVar = this.E;
                ldgVar.getClass();
                ldg ldgVar2 = (ldg) ycg.h(ldgVar);
                jycVar = ldgVar2.c;
                i = ldgVar2.d;
            }
            jycVar.getClass();
            nyc nycVarG = jycVar.g();
            nycVarG.putAll(map);
            jyc jycVarG = nycVarG.g();
            if (x44.r(jycVarG, jycVar)) {
                return;
            }
            ldg ldgVar3 = this.E;
            ldgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zC = c(this, (ldg) ycg.w(ldgVar3, this, rcgVarJ), i, jycVarG);
            }
            ycg.n(rcgVarJ, this);
        } while (!zC);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        jyc jycVar;
        int i;
        V vRemove;
        rcg rcgVarJ;
        boolean zC;
        do {
            synchronized (gb9.b) {
                ldg ldgVar = this.E;
                ldgVar.getClass();
                ldg ldgVar2 = (ldg) ycg.h(ldgVar);
                jycVar = ldgVar2.c;
                i = ldgVar2.d;
            }
            jycVar.getClass();
            nyc nycVarG = jycVar.g();
            vRemove = nycVarG.remove(obj);
            jyc jycVarG = nycVarG.g();
            if (x44.r(jycVarG, jycVar)) {
                break;
            }
            ldg ldgVar3 = this.E;
            ldgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zC = c(this, (ldg) ycg.w(ldgVar3, this, rcgVarJ), i, jycVarG);
            }
            ycg.n(rcgVarJ, this);
        } while (!zC);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return d().c.size();
    }

    public final String toString() {
        ldg ldgVar = this.E;
        ldgVar.getClass();
        return "SnapshotStateMap(value=" + ((ldg) ycg.h(ldgVar)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.H;
    }
}
