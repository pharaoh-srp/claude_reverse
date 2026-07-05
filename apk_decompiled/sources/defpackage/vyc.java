package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class vyc extends e3 {
    public final /* synthetic */ int E;
    public final g3 F;

    public /* synthetic */ vyc(g3 g3Var, int i) {
        this.E = i;
        this.F = g3Var;
    }

    @Override // defpackage.e3
    public final int a() {
        switch (this.E) {
            case 0:
                return ((myc) this.F).d();
            default:
                return ((nyc) this.F).d();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.E) {
            case 0:
                ((myc) this.F).clear();
                break;
            default:
                ((nyc) this.F).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.E) {
            case 0:
                return ((myc) this.F).containsValue(obj);
            default:
                return ((nyc) this.F).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.E;
        int i2 = 0;
        g3 g3Var = this.F;
        switch (i) {
            case 0:
                myc mycVar = (myc) g3Var;
                mycVar.getClass();
                y6i[] y6iVarArr = new y6i[8];
                while (i2 < 8) {
                    y6iVarArr[i2] = new a7i(2);
                    i2++;
                }
                return new tyc(mycVar, y6iVarArr);
            default:
                nyc nycVar = (nyc) g3Var;
                z6i[] z6iVarArr = new z6i[8];
                while (i2 < 8) {
                    z6iVarArr[i2] = new b7i(1);
                    i2++;
                }
                return new uyc(nycVar, z6iVarArr);
        }
    }
}
