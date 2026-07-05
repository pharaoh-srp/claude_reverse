package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class myc extends g3 {
    public iyc E;
    public ql8 F;
    public w6i G;
    public Object H;
    public int I;
    public int J;

    public myc(iyc iycVar) {
        iycVar.getClass();
        this.E = iycVar;
        this.F = new ql8(21);
        this.G = iycVar.E;
        this.J = iycVar.d();
    }

    @Override // defpackage.g3
    public final Set a() {
        return new qyc(0, this);
    }

    @Override // defpackage.g3
    public final Set c() {
        return new qyc(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        w6i w6iVar = w6i.e;
        w6iVar.getClass();
        j(w6iVar);
        l(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.G.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.g3
    public final int d() {
        return this.J;
    }

    @Override // defpackage.g3
    public final Collection e() {
        return new vyc(this, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.J == map.size()) {
                    if (map instanceof iyc) {
                        return this.G.g(((iyc) obj).E, bw9.d0);
                    }
                    if (map instanceof myc) {
                        return this.G.g(((myc) obj).G, bw9.e0);
                    }
                    if (map instanceof dzc) {
                        mr9.o();
                        return false;
                    }
                    if (map instanceof ezc) {
                        mr9.o();
                        return false;
                    }
                    if (d() != map.size()) {
                        sz6.p("Failed requirement.");
                        return false;
                    }
                    if (!map.isEmpty()) {
                        for (Map.Entry entry : map.entrySet()) {
                            entry.getClass();
                            Object obj2 = get(entry.getKey());
                            if (!(obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && containsKey(entry.getKey()))) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int f() {
        return this.I;
    }

    public final w6i g() {
        return this.G;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return this.G.h(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final ql8 h() {
        return this.F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    public final void i(int i) {
        this.I = i;
    }

    public final void j(w6i w6iVar) {
        w6iVar.getClass();
        if (w6iVar != this.G) {
            this.G = w6iVar;
            this.E = null;
        }
    }

    public final void k(Object obj) {
        this.H = obj;
    }

    public final void l(int i) {
        this.J = i;
        this.I++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.H = null;
        j(this.G.m(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this));
        return this.H;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        iyc iycVar = null;
        iyc iycVar2 = map instanceof iyc ? (iyc) map : null;
        if (iycVar2 == null) {
            myc mycVar = map instanceof myc ? (myc) map : null;
            if (mycVar != null && (iycVar = mycVar.E) == null) {
                iycVar = new iyc(mycVar.G, mycVar.d());
                mycVar.E = iycVar;
                mycVar.F = new ql8(21);
            }
        } else {
            iycVar = iycVar2;
        }
        if (iycVar == null) {
            super.putAll(map);
            return;
        }
        az5 az5Var = new az5();
        az5Var.a = 0;
        int i = this.J;
        w6i w6iVar = this.G;
        w6i w6iVar2 = iycVar.E;
        w6iVar2.getClass();
        j(w6iVar.n(w6iVar2, 0, az5Var, this));
        int i2 = (iycVar.F + i) - az5Var.a;
        if (i != i2) {
            l(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iD = d();
        w6i w6iVarP = this.G.p(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (w6iVarP == null) {
            w6iVarP = w6i.e;
            w6iVarP.getClass();
        }
        j(w6iVarP);
        return iD != d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        this.H = null;
        w6i w6iVarO = this.G.o(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (w6iVarO == null) {
            w6iVarO = w6i.e;
            w6iVarO.getClass();
        }
        j(w6iVarO);
        return this.H;
    }
}
