package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class lba extends e5i implements ListIterator {
    public final /* synthetic */ int F;
    public final /* synthetic */ AbstractList G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lba(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.F = i;
        this.G = abstractList;
    }

    @Override // defpackage.e5i
    public final Object a(Object obj) {
        int i = this.F;
        AbstractList abstractList = this.G;
        switch (i) {
            case 0:
                return ((mba) abstractList).F.apply(obj);
            default:
                return ((nba) abstractList).F.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.E).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.E).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.E).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.E).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
