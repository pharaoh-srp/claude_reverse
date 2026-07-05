package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class fbg extends AbstractMap {
    public static final /* synthetic */ int K = 0;
    public Object[] E;
    public int F;
    public Map G;
    public boolean H;
    public volatile vo0 I;
    public Map J;

    public static fbg g() {
        fbg fbgVar = new fbg();
        Map map = Collections.EMPTY_MAP;
        fbgVar.G = map;
        fbgVar.J = map;
        return fbgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            int r0 = r4.F
            int r1 = r0 + (-1)
            if (r1 < 0) goto L1d
            java.lang.Object[] r2 = r4.E
            r2 = r2[r1]
            kbg r2 = (defpackage.kbg) r2
            java.lang.Comparable r2 = r2.a()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1a
            int r0 = r0 + 1
        L18:
            int r4 = -r0
            return r4
        L1a:
            if (r2 != 0) goto L1d
            return r1
        L1d:
            r0 = 0
        L1e:
            if (r0 > r1) goto L3f
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.lang.Object[] r3 = r4.E
            r3 = r3[r2]
            kbg r3 = (defpackage.kbg) r3
            java.lang.Comparable r3 = r3.a()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L38
            int r2 = r2 + (-1)
            r1 = r2
            goto L1e
        L38:
            if (r3 <= 0) goto L3e
            int r2 = r2 + 1
            r0 = r2
            goto L1e
        L3e:
            return r2
        L3f:
            int r0 = r0 + 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbg.a(java.lang.Comparable):int");
    }

    public final void c() {
        if (this.H) {
            mr9.x();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (this.F != 0) {
            this.E = null;
            this.F = 0;
        }
        if (this.G.isEmpty()) {
            return;
        }
        this.G.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.G.containsKey(comparable);
    }

    public final kbg d(int i) {
        if (i < this.F) {
            return (kbg) this.E[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set e() {
        return this.G.isEmpty() ? Collections.EMPTY_SET : this.G.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.I == null) {
            this.I = new vo0(3, this);
        }
        return this.I;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbg)) {
            return super.equals(obj);
        }
        fbg fbgVar = (fbg) obj;
        int size = size();
        if (size == fbgVar.size()) {
            int i = this.F;
            if (i != fbgVar.F) {
                return ((AbstractSet) entrySet()).equals(fbgVar.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (d(i2).equals(fbgVar.d(i2))) {
                }
            }
            if (i != size) {
                return this.G.equals(fbgVar.G);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        c();
        if (this.G.isEmpty() && !(this.G instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.G = treeMap;
            this.J = treeMap.descendingMap();
        }
        return (SortedMap) this.G;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((kbg) this.E[iA]).getValue() : this.G.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        c();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((kbg) this.E[iA]).setValue(obj);
        }
        c();
        if (this.E == null) {
            this.E = new Object[16];
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return f().put(comparable, obj);
        }
        int i2 = this.F;
        if (i2 == 16) {
            kbg kbgVar = (kbg) this.E[15];
            this.F = i2 - 1;
            f().put(kbgVar.a(), kbgVar.getValue());
        }
        Object[] objArr = this.E;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.E[i] = new kbg(this, comparable, obj);
        this.F++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.F;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.E[i2].hashCode();
        }
        return this.G.size() > 0 ? this.G.hashCode() + iHashCode : iHashCode;
    }

    public final Object i(int i) {
        c();
        Object value = ((kbg) this.E[i]).getValue();
        Object[] objArr = this.E;
        System.arraycopy(objArr, i + 1, objArr, i, (this.F - i) - 1);
        this.F--;
        if (!this.G.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            this.E[this.F] = new kbg(this, (Map.Entry) it.next());
            this.F++;
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return i(iA);
        }
        if (this.G.isEmpty()) {
            return null;
        }
        return this.G.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.G.size() + this.F;
    }
}
