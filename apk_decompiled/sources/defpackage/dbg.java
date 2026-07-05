package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class dbg extends AbstractMap {
    public static final /* synthetic */ int J = 0;
    public List E;
    public Map F;
    public boolean G;
    public volatile vo0 H;
    public Map I;

    public static dbg g() {
        dbg dbgVar = new dbg();
        dbgVar.E = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        dbgVar.F = map;
        dbgVar.I = map;
        return dbgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.E
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.E
            java.lang.Object r2 = r2.get(r1)
            ibg r2 = (defpackage.ibg) r2
            java.lang.Comparable r2 = r2.E
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r4 = -r0
            return r4
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.E
            java.lang.Object r3 = r3.get(r2)
            ibg r3 = (defpackage.ibg) r3
            java.lang.Comparable r3 = r3.E
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbg.a(java.lang.Comparable):int");
    }

    public final void c() {
        if (this.G) {
            mr9.x();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.E.isEmpty()) {
            this.E.clear();
        }
        if (this.F.isEmpty()) {
            return;
        }
        this.F.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.F.containsKey(comparable);
    }

    public final Map.Entry d(int i) {
        return (Map.Entry) this.E.get(i);
    }

    public final Set e() {
        return this.F.isEmpty() ? Collections.EMPTY_SET : this.F.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.H == null) {
            this.H = new vo0(2, this);
        }
        return this.H;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbg)) {
            return super.equals(obj);
        }
        dbg dbgVar = (dbg) obj;
        int size = size();
        if (size == dbgVar.size()) {
            int size2 = this.E.size();
            if (size2 != dbgVar.E.size()) {
                return ((AbstractSet) entrySet()).equals(dbgVar.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (d(i).equals(dbgVar.d(i))) {
                }
            }
            if (size2 != size) {
                return this.F.equals(dbgVar.F);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        c();
        if (this.F.isEmpty() && !(this.F instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.F = treeMap;
            this.I = treeMap.descendingMap();
        }
        return (SortedMap) this.F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((ibg) this.E.get(iA)).F : this.F.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        c();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((ibg) this.E.get(iA)).setValue(obj);
        }
        c();
        if (this.E.isEmpty() && !(this.E instanceof ArrayList)) {
            this.E = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return f().put(comparable, obj);
        }
        if (this.E.size() == 16) {
            ibg ibgVar = (ibg) this.E.remove(15);
            f().put(ibgVar.E, ibgVar.F);
        }
        this.E.add(i, new ibg(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.E.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((ibg) this.E.get(i)).hashCode();
        }
        return this.F.size() > 0 ? this.F.hashCode() + iHashCode : iHashCode;
    }

    public final Object i(int i) {
        c();
        Object obj = ((ibg) this.E.remove(i)).F;
        if (!this.F.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.E;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new ibg(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return i(iA);
        }
        if (this.F.isEmpty()) {
            return null;
        }
        return this.F.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.F.size() + this.E.size();
    }
}
