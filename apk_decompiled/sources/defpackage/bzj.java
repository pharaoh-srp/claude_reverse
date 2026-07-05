package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bzj extends pzj {
    public final transient pzj I;

    public bzj(pzj pzjVar) {
        super(1);
        this.I = pzjVar;
    }

    @Override // defpackage.pzj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.I.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        pzj pzjVar = this.I;
        zok.h(i, pzjVar.size());
        return pzjVar.get((pzjVar.size() - 1) - i);
    }

    @Override // defpackage.pzj, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.I.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r1.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.pzj, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.I.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r1.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // defpackage.pzj
    public final pzj o() {
        return this.I;
    }

    @Override // defpackage.pzj, java.util.List
    /* JADX INFO: renamed from: p */
    public final pzj subList(int i, int i2) {
        pzj pzjVar = this.I;
        zok.i(i, i2, pzjVar.size());
        return pzjVar.subList(pzjVar.size() - i2, pzjVar.size() - i).o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.I.size();
    }
}
