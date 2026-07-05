package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dda implements Collection, mm9 {
    public final tka E;
    public final LocalDate F;
    public final LocalDate G;

    public dda(LocalDate localDate, LocalDate localDate2) {
        long jM1196toEpochDays = localDate.m1196toEpochDays();
        tka tkaVar = new tka(jM1196toEpochDays, localDate2.m1196toEpochDays(), 1L);
        this.E = tkaVar;
        LocalDate.Companion.getClass();
        this.F = yca.a(jM1196toEpochDays);
        this.G = yca.a(tkaVar.F);
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
        if (!(obj instanceof LocalDate)) {
            return false;
        }
        LocalDate localDate = (LocalDate) obj;
        g gVar = (g) this;
        return gVar.F.compareTo(localDate) <= 0 && localDate.compareTo(gVar.G) <= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof LocalDate) || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof dda) {
            return x44.r(this.E, ((dda) obj).E);
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
        return new eda(new uka(tkaVar.E, tkaVar.F, tkaVar.G), 0);
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
