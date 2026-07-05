package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ebg extends AbstractMap {
    public static final /* synthetic */ int J = 0;
    public final int E;
    public List F = Collections.EMPTY_LIST;
    public Map G = Collections.EMPTY_MAP;
    public boolean H;
    public volatile m7a I;

    public ebg(int i) {
        this.E = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.F
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.F
            java.lang.Object r2 = r2.get(r1)
            jbg r2 = (defpackage.jbg) r2
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
            java.util.List r3 = r4.F
            java.lang.Object r3 = r3.get(r2)
            jbg r3 = (defpackage.jbg) r3
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebg.a(java.lang.Comparable):int");
    }

    public final void c() {
        if (this.H) {
            mr9.x();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.F.isEmpty()) {
            this.F.clear();
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

    public final Iterable d() {
        return this.G.isEmpty() ? wd6.d : this.G.entrySet();
    }

    public final SortedMap e() {
        c();
        if (this.G.isEmpty() && !(this.G instanceof TreeMap)) {
            this.G = new TreeMap();
        }
        return (SortedMap) this.G;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.I == null) {
            this.I = new m7a(this, 1);
        }
        return this.I;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        c();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((jbg) this.F.get(iA)).setValue(obj);
        }
        c();
        boolean zIsEmpty = this.F.isEmpty();
        int i = this.E;
        if (zIsEmpty && !(this.F instanceof ArrayList)) {
            this.F = new ArrayList(i);
        }
        int i2 = -(iA + 1);
        if (i2 >= i) {
            return e().put(comparable, obj);
        }
        if (this.F.size() == i) {
            jbg jbgVar = (jbg) this.F.remove(i - 1);
            e().put(jbgVar.E, jbgVar.F);
        }
        this.F.add(i2, new jbg(this, comparable, obj));
        return null;
    }

    public final Object g(int i) {
        c();
        Object obj = ((jbg) this.F.remove(i)).F;
        if (!this.G.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.F;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new jbg(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((jbg) this.F.get(iA)).F : this.G.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return g(iA);
        }
        if (this.G.isEmpty()) {
            return null;
        }
        return this.G.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.G.size() + this.F.size();
    }
}
