package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zcg implements Set, an9 {
    public final mdg E;
    public final /* synthetic */ int F;

    public zcg(mdg mdgVar, int i) {
        this.F = i;
        this.E = mdgVar;
    }

    private final boolean a(Collection collection) {
        jyc jycVar;
        int i;
        rcg rcgVarJ;
        boolean zC;
        Set setT1 = w44.t1(collection);
        mdg mdgVar = this.E;
        boolean z = false;
        do {
            synchronized (gb9.b) {
                ldg ldgVar = mdgVar.E;
                ldgVar.getClass();
                ldg ldgVar2 = (ldg) ycg.h(ldgVar);
                jycVar = ldgVar2.c;
                i = ldgVar2.d;
            }
            jycVar.getClass();
            nyc nycVarG = jycVar.g();
            Iterator it = mdgVar.F.iterator();
            while (((hmg) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((hmg) it).next();
                if (!setT1.contains(entry.getKey())) {
                    nycVarG.remove(entry.getKey());
                    z = true;
                }
            }
            jyc jycVarG = nycVarG.g();
            if (x44.r(jycVarG, jycVar)) {
                break;
            }
            ldg ldgVar3 = mdgVar.E;
            ldgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zC = mdg.c(mdgVar, (ldg) ycg.w(ldgVar3, mdgVar, rcgVarJ), i, jycVarG);
            }
            ycg.n(rcgVarJ, mdgVar);
        } while (!zC);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.F) {
            case 0:
                gb9.b0();
                throw null;
            case 1:
                gb9.b0();
                throw null;
            default:
                gb9.b0();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.F) {
            case 0:
                gb9.b0();
                throw null;
            case 1:
                gb9.b0();
                throw null;
            default:
                gb9.b0();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.E.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.F;
        mdg mdgVar = this.E;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof mm9) && !(obj instanceof pm9))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return x44.r(mdgVar.get(entry.getKey()), entry.getValue());
            case 1:
                return mdgVar.containsKey(obj);
            default:
                return mdgVar.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.F;
        mdg mdgVar = this.E;
        switch (i) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!mdgVar.containsKey(it2.next())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!mdgVar.containsValue(it3.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.E.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.F;
        mdg mdgVar = this.E;
        switch (i) {
            case 0:
                return new hmg(mdgVar, ((sz8) mdgVar.d().c.entrySet()).iterator(), 0);
            case 1:
                return new hmg(mdgVar, ((sz8) mdgVar.d().c.entrySet()).iterator(), 1);
            default:
                return new hmg(mdgVar, ((sz8) mdgVar.d().c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        int i = this.F;
        mdg mdgVar = this.E;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    if ((!(obj instanceof mm9) || (obj instanceof pm9)) && mdgVar.remove(((Map.Entry) obj).getKey()) != null) {
                    }
                }
                break;
            case 1:
                if (mdgVar.remove(obj) != null) {
                }
                break;
            default:
                Iterator it = mdgVar.F.iterator();
                while (true) {
                    if (((hmg) it).hasNext()) {
                        next = ((hmg) it).next();
                        if (x44.r(((Map.Entry) next).getValue(), obj)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    mdgVar.remove(entry.getKey());
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        jyc jycVar;
        int i;
        rcg rcgVarJ;
        boolean zC;
        boolean z = false;
        switch (this.F) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.E.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.E.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
                break;
            default:
                Set setT1 = w44.t1(collection);
                mdg mdgVar = this.E;
                do {
                    synchronized (gb9.b) {
                        ldg ldgVar = mdgVar.E;
                        ldgVar.getClass();
                        ldg ldgVar2 = (ldg) ycg.h(ldgVar);
                        jycVar = ldgVar2.c;
                        i = ldgVar2.d;
                    }
                    jycVar.getClass();
                    nyc nycVarG = jycVar.g();
                    Iterator it3 = mdgVar.F.iterator();
                    while (((hmg) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((hmg) it3).next();
                        if (setT1.contains(entry.getValue())) {
                            nycVarG.remove(entry.getKey());
                            z = true;
                        }
                    }
                    jyc jycVarG = nycVarG.g();
                    if (!x44.r(jycVarG, jycVar)) {
                        ldg ldgVar3 = mdgVar.E;
                        ldgVar3.getClass();
                        synchronized (ycg.c) {
                            rcgVarJ = ycg.j();
                            zC = mdg.c(mdgVar, (ldg) ycg.w(ldgVar3, mdgVar, rcgVarJ), i, jycVarG);
                        }
                        ycg.n(rcgVarJ, mdgVar);
                    }
                    return z;
                } while (!zC);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        jyc jycVar;
        int i;
        rcg rcgVarJ;
        boolean zC;
        jyc jycVar2;
        int i2;
        rcg rcgVarJ2;
        boolean zC2;
        boolean z = false;
        switch (this.F) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iD0 = tta.d0(x44.y(collection2, 10));
                if (iD0 < 16) {
                    iD0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                mdg mdgVar = this.E;
                do {
                    synchronized (gb9.b) {
                        ldg ldgVar = mdgVar.E;
                        ldgVar.getClass();
                        ldg ldgVar2 = (ldg) ycg.h(ldgVar);
                        jycVar = ldgVar2.c;
                        i = ldgVar2.d;
                    }
                    jycVar.getClass();
                    nyc nycVarG = jycVar.g();
                    Iterator it = mdgVar.F.iterator();
                    while (((hmg) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((hmg) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !x44.r(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            nycVarG.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    jyc jycVarG = nycVarG.g();
                    if (!x44.r(jycVarG, jycVar)) {
                        ldg ldgVar3 = mdgVar.E;
                        ldgVar3.getClass();
                        synchronized (ycg.c) {
                            rcgVarJ = ycg.j();
                            zC = mdg.c(mdgVar, (ldg) ycg.w(ldgVar3, mdgVar, rcgVarJ), i, jycVarG);
                        }
                        ycg.n(rcgVarJ, mdgVar);
                    }
                    return z;
                } while (!zC);
                return z;
            case 1:
                return a(collection);
            default:
                Set setT1 = w44.t1(collection);
                mdg mdgVar2 = this.E;
                do {
                    synchronized (gb9.b) {
                        ldg ldgVar4 = mdgVar2.E;
                        ldgVar4.getClass();
                        ldg ldgVar5 = (ldg) ycg.h(ldgVar4);
                        jycVar2 = ldgVar5.c;
                        i2 = ldgVar5.d;
                    }
                    jycVar2.getClass();
                    nyc nycVarG2 = jycVar2.g();
                    Iterator it2 = mdgVar2.F.iterator();
                    while (((hmg) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((hmg) it2).next();
                        if (!setT1.contains(entry3.getValue())) {
                            nycVarG2.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    jyc jycVarG2 = nycVarG2.g();
                    if (!x44.r(jycVarG2, jycVar2)) {
                        ldg ldgVar6 = mdgVar2.E;
                        ldgVar6.getClass();
                        synchronized (ycg.c) {
                            rcgVarJ2 = ycg.j();
                            zC2 = mdg.c(mdgVar2, (ldg) ycg.w(ldgVar6, mdgVar2, rcgVarJ2), i2, jycVarG2);
                        }
                        ycg.n(rcgVarJ2, mdgVar2);
                    }
                    return z;
                } while (!zC2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.E.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return dch.T(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return dch.U(this, objArr);
    }
}
