package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class nyc extends g3 implements Map, qm9 {
    public jyc E;
    public vz8 F = new vz8(21);
    public x6i G;
    public Object H;
    public int I;
    public int J;

    public nyc(jyc jycVar) {
        this.E = jycVar;
        this.G = jycVar.E;
        this.J = jycVar.F;
    }

    @Override // defpackage.g3
    public final Set a() {
        return new ryc(0, this);
    }

    @Override // defpackage.g3
    public final Set c() {
        return new ryc(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.G = x6i.e;
        h(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.G.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.g3
    public final int d() {
        return this.J;
    }

    @Override // defpackage.g3
    public final Collection e() {
        return new vyc(this, 1);
    }

    /* JADX INFO: renamed from: f */
    public jyc g() {
        x6i x6iVar = this.G;
        jyc jycVar = this.E;
        if (x6iVar != jycVar.E) {
            this.F = new vz8(21);
            jycVar = new jyc(this.G, d());
        }
        this.E = jycVar;
        return jycVar;
    }

    public /* bridge */ jyc g() {
        return g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.G.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final void h(int i) {
        this.J = i;
        this.I++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.H = null;
        this.G = this.G.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.H;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        jyc jycVarG = null;
        jyc jycVar = map instanceof jyc ? (jyc) map : null;
        if (jycVar == null) {
            nyc nycVar = map instanceof nyc ? (nyc) map : null;
            if (nycVar != null) {
                jycVarG = nycVar.g();
            }
        } else {
            jycVarG = jycVar;
        }
        if (jycVarG == null) {
            super.putAll(map);
            return;
        }
        bz5 bz5Var = new bz5();
        bz5Var.a = 0;
        int i = this.J;
        x6i x6iVar = this.G;
        x6i x6iVar2 = jycVarG.E;
        x6iVar2.getClass();
        this.G = x6iVar.m(x6iVar2, 0, bz5Var, this);
        int i2 = (jycVarG.F + i) - bz5Var.a;
        if (i != i2) {
            h(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iD = d();
        x6i x6iVarO = this.G.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (x6iVarO == null) {
            x6iVarO = x6i.e;
        }
        this.G = x6iVarO;
        return iD != d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.H = null;
        x6i x6iVarN = this.G.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (x6iVarN == null) {
            x6iVarN = x6i.e;
        }
        this.G = x6iVarN;
        return this.H;
    }
}
