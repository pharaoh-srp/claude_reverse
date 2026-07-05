package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0k extends b0k implements NavigableSet, Iterable {
    public final transient Comparator J;
    public transient r0k K;

    public r0k(Comparator comparator) {
        super(1);
        this.J = comparator;
    }

    public static o2k u(Comparator comparator) {
        if (w1k.F == comparator) {
            return o2k.M;
        }
        fyj fyjVar = pzj.H;
        return new o2k(e2k.K, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.J;
    }

    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        o2k o2kVar = (o2k) this;
        return o2kVar.y(0, o2kVar.v(obj, false));
    }

    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final r0k descendingSet() {
        r0k r0kVarU = this.K;
        if (r0kVarU == null) {
            o2k o2kVar = (o2k) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(o2kVar.J);
            r0kVarU = o2kVar.isEmpty() ? u(comparatorReverseOrder) : new o2k(o2kVar.L.o(), comparatorReverseOrder);
            this.K = r0kVarU;
            r0kVarU.K = this;
        }
        return r0kVarU;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final o2k subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.J.compare(obj, obj2) > 0) {
            mr9.y();
            return null;
        }
        o2k o2kVar = (o2k) this;
        o2k o2kVarY = o2kVar.y(o2kVar.w(obj, z), o2kVar.L.size());
        return o2kVarY.y(0, o2kVarY.v(obj2, z2));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        o2k o2kVar = (o2k) this;
        return o2kVar.y(o2kVar.w(obj, true), o2kVar.L.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        o2k o2kVar = (o2k) this;
        return o2kVar.y(0, o2kVar.v(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        o2k o2kVar = (o2k) this;
        return o2kVar.y(o2kVar.w(obj, z), o2kVar.L.size());
    }
}
