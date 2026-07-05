package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yde extends qz8 {
    public final transient aee H;
    public final transient zde I;

    public yde(aee aeeVar, zde zdeVar) {
        this.H = aeeVar;
        this.I = zdeVar;
    }

    @Override // defpackage.qz8, defpackage.cz8
    public final nz8 a() {
        return this.I;
    }

    @Override // defpackage.cz8
    public final int b(int i, Object[] objArr) {
        return this.I.b(i, objArr);
    }

    @Override // defpackage.cz8, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.H.get(obj) != null;
    }

    @Override // defpackage.cz8
    public final boolean k() {
        return true;
    }

    @Override // defpackage.cz8
    /* JADX INFO: renamed from: l */
    public final efi iterator() {
        return this.I.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.H.J;
    }
}
