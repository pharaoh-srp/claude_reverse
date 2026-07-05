package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class syc implements Iterator, mm9 {
    public final /* synthetic */ int E = 0;
    public final Iterator F;

    public syc(myc mycVar) {
        mycVar.getClass();
        y6i[] y6iVarArr = new y6i[8];
        for (int i = 0; i < 8; i++) {
            y6iVarArr[i] = new d7i(this);
        }
        this.F = new oyc(mycVar, y6iVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.E) {
            case 0:
                return ((oyc) this.F).G;
            case 1:
                return ((pyc) this.F).G;
            case 2:
                return ((f2) this.F).hasNext();
            default:
                return this.F.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.E) {
            case 0:
                return (Map.Entry) ((oyc) this.F).next();
            case 1:
                return (Map.Entry) ((pyc) this.F).next();
            case 2:
                return ((f2) this.F).next();
            default:
                return (bsi) this.F.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.E) {
            case 0:
                ((oyc) this.F).remove();
                return;
            case 1:
                ((pyc) this.F).remove();
                return;
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public syc(nyc nycVar) {
        z6i[] z6iVarArr = new z6i[8];
        for (int i = 0; i < 8; i++) {
            z6iVarArr[i] = new e7i(this);
        }
        this.F = new pyc(nycVar, z6iVarArr);
    }

    public syc(Object[] objArr) {
        objArr.getClass();
        this.F = new f2(objArr);
    }

    public syc(zri zriVar) {
        this.F = zriVar.N.iterator();
    }
}
