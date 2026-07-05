package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iqj extends sqj {
    public final transient sqj I;

    public iqj(sqj sqjVar) {
        super(0);
        this.I = sqjVar;
    }

    @Override // defpackage.sqj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.I.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        sqj sqjVar = this.I;
        msk.i(i, sqjVar.size());
        return sqjVar.get((sqjVar.size() - 1) - i);
    }

    @Override // defpackage.sqj, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.I.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r1.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.sqj, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.I.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r1.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // defpackage.sqj
    public final sqj o() {
        return this.I;
    }

    @Override // defpackage.sqj, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final sqj subList(int i, int i2) {
        sqj sqjVar = this.I;
        msk.j(i, i2, sqjVar.size());
        return sqjVar.subList(sqjVar.size() - i2, sqjVar.size() - i).o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.I.size();
    }
}
