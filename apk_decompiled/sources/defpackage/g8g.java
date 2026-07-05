package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g8g extends qz8 {
    public final transient Object H;

    public g8g(Object obj) {
        obj.getClass();
        this.H = obj;
    }

    @Override // defpackage.qz8, defpackage.cz8
    public final nz8 a() {
        return nz8.u(this.H);
    }

    @Override // defpackage.cz8
    public final int b(int i, Object[] objArr) {
        objArr[i] = this.H;
        return i + 1;
    }

    @Override // defpackage.cz8, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.H.equals(obj);
    }

    @Override // defpackage.qz8, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.H.hashCode();
    }

    @Override // defpackage.cz8
    public final boolean k() {
        return false;
    }

    @Override // defpackage.cz8
    /* JADX INFO: renamed from: l */
    public final efi iterator() {
        return new sc9(this.H);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.H.toString() + ']';
    }
}
