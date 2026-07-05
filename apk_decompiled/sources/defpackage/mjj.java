package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlinx.datetime.YearMonth;
import kotlinx.datetime.h;
import kotlinx.datetime.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mjj implements Collection, mm9 {
    public final tka E;
    public final YearMonth F;
    public final YearMonth G;

    public mjj(YearMonth yearMonth, YearMonth yearMonth2) {
        long jB = h.b(yearMonth);
        tka tkaVar = new tka(jB, h.b(yearMonth2), 1L);
        this.E = tkaVar;
        djj djjVar = YearMonth.Companion;
        this.F = h.a(djjVar, jB);
        this.G = h.a(djjVar, tkaVar.F);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof YearMonth)) {
            return false;
        }
        YearMonth yearMonth = (YearMonth) obj;
        i iVar = (i) this;
        return iVar.F.compareTo(yearMonth) <= 0 && yearMonth.compareTo(iVar.G) <= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof YearMonth) || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof mjj) {
            return x44.r(this.E, ((mjj) obj).E);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        tka tkaVar = this.E;
        return new eda(new uka(tkaVar.E, tkaVar.F, tkaVar.G), 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return etj.n(this.E);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return dch.U(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return dch.T(this);
    }
}
