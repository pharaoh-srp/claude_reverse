package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class iwb implements an9, Set, mm9 {
    public final fwb E;
    public final fwb F;

    public iwb(fwb fwbVar) {
        this.E = fwbVar;
        this.F = fwbVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.F.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        fwb fwbVar = this.F;
        int i = fwbVar.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            fwbVar.l(it.next());
        }
        return i != fwbVar.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.F.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.E.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.E.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iwb.class != obj.getClass()) {
            return false;
        }
        return this.E.equals(((iwb) obj).E);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.E.h();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new uvb(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.F.m(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        fwb fwbVar = this.F;
        int i = fwbVar.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            fwbVar.j(it.next());
        }
        return i != fwbVar.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(java.util.Collection r17) {
        /*
            r16 = this;
            r17.getClass()
            r0 = r16
            fwb r0 = r0.F
            java.lang.Object[] r1 = r0.b
            int r2 = r0.d
            long[] r3 = r0.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L56
            r6 = r5
        L14:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L51
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L2e:
            if (r11 >= r9) goto L4f
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L4b
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r17
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r14 = r1[r12]
            boolean r13 = defpackage.w44.G0(r13, r14)
            if (r13 != 0) goto L4b
            r0.n(r12)
        L4b:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L2e
        L4f:
            if (r9 != r10) goto L56
        L51:
            if (r6 == r4) goto L56
            int r6 = r6 + 1
            goto L14
        L56:
            int r0 = r0.d
            if (r2 == r0) goto L5c
            r0 = 1
            return r0
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwb.retainAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.E.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return dch.U(this, objArr);
    }

    public final String toString() {
        return this.E.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return dch.T(this);
    }
}
