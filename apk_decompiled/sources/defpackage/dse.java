package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class dse implements ListIterator, mm9 {
    public final /* synthetic */ int E = 1;
    public final Object F;
    public final /* synthetic */ Object G;

    public dse(ese eseVar, int i) {
        this.G = eseVar;
        this.F = eseVar.E.listIterator(w44.C0(i, eseVar));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.E) {
            case 0:
                ListIterator listIterator = (ListIterator) this.F;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((bae) obj).E < ((wug) this.G).H - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasNext();
            default:
                return ((bae) obj).E >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            default:
                bae baeVar = (bae) obj;
                int i2 = baeVar.E + 1;
                wug wugVar = (wug) this.G;
                oq5.o(i2, wugVar.H);
                baeVar.E = i2;
                return wugVar.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                ese eseVar = (ese) this.G;
                return (eseVar.size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((bae) obj).E + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            default:
                bae baeVar = (bae) obj;
                int i2 = baeVar.E;
                wug wugVar = (wug) this.G;
                oq5.o(i2, wugVar.H);
                baeVar.E = i2 - 1;
                return wugVar.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                ese eseVar = (ese) this.G;
                return (eseVar.size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((bae) obj).E;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.E) {
            case 0:
                ((ListIterator) this.F).remove();
                return;
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.E) {
            case 0:
                ((ListIterator) this.F).set(obj);
                return;
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public dse(bae baeVar, wug wugVar) {
        this.F = baeVar;
        this.G = wugVar;
    }
}
