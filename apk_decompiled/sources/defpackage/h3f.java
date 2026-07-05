package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class h3f implements Iterable {
    public e3f E;
    public e3f F;
    public final WeakHashMap G = new WeakHashMap();
    public int H = 0;

    public e3f a(Object obj) {
        e3f e3fVar = this.E;
        while (e3fVar != null && !e3fVar.E.equals(obj)) {
            e3fVar = e3fVar.G;
        }
        return e3fVar;
    }

    public Object b(Object obj) {
        e3f e3fVarA = a(obj);
        if (e3fVarA == null) {
            return null;
        }
        this.H--;
        WeakHashMap weakHashMap = this.G;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((g3f) it.next()).a(e3fVarA);
            }
        }
        e3f e3fVar = e3fVarA.H;
        e3f e3fVar2 = e3fVarA.G;
        if (e3fVar != null) {
            e3fVar.G = e3fVar2;
        } else {
            this.E = e3fVar2;
        }
        e3f e3fVar3 = e3fVarA.G;
        if (e3fVar3 != null) {
            e3fVar3.H = e3fVar;
        } else {
            this.F = e3fVar;
        }
        e3fVarA.G = null;
        e3fVarA.H = null;
        return e3fVarA.F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((defpackage.d3f) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.h3f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h3f r6 = (defpackage.h3f) r6
            int r1 = r5.H
            int r3 = r6.H
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            d3f r1 = (defpackage.d3f) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            d3f r3 = (defpackage.d3f) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            d3f r6 = (defpackage.d3f) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h3f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            d3f d3fVar = (d3f) it;
            if (!d3fVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) d3fVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        d3f d3fVar = new d3f(this.E, this.F, 0);
        this.G.put(d3fVar, Boolean.FALSE);
        return d3fVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            d3f d3fVar = (d3f) it;
            if (!d3fVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) d3fVar.next()).toString());
            if (d3fVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
