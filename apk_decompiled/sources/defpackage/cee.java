package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cee extends qz8 {
    public static final Object[] M;
    public static final cee N;
    public final transient Object[] H;
    public final transient int I;
    public final transient Object[] J;
    public final transient int K;
    public final transient int L;

    static {
        Object[] objArr = new Object[0];
        M = objArr;
        N = new cee(0, 0, 0, objArr, objArr);
    }

    public cee(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.H = objArr;
        this.I = i;
        this.J = objArr2;
        this.K = i2;
        this.L = i3;
    }

    @Override // defpackage.cz8
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.H;
        int i2 = this.L;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.cz8, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.J;
            if (objArr.length != 0) {
                int i = bsk.i(obj);
                while (true) {
                    int i2 = i & this.K;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    i = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cz8
    public final Object[] e() {
        return this.H;
    }

    @Override // defpackage.cz8
    public final int g() {
        return this.L;
    }

    @Override // defpackage.cz8
    public final int h() {
        return 0;
    }

    @Override // defpackage.qz8, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.I;
    }

    @Override // defpackage.cz8
    public final boolean k() {
        return false;
    }

    @Override // defpackage.cz8
    /* JADX INFO: renamed from: l */
    public final efi iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.qz8
    public final nz8 q() {
        return nz8.m(this.L, this.H);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.L;
    }
}
