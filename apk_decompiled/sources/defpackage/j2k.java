package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class j2k extends b0k {
    public static final Object[] O;
    public static final j2k P;
    public final transient Object[] J;
    public final transient int K;
    public final transient Object[] L;
    public final transient int M;
    public final transient int N;

    static {
        Object[] objArr = new Object[0];
        O = objArr;
        P = new j2k(0, 0, 0, objArr, objArr);
    }

    public j2k(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(1);
        this.J = objArr;
        this.K = i;
        this.L = objArr2;
        this.M = i2;
        this.N = i3;
    }

    @Override // defpackage.upj
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.J;
        int i = this.N;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.upj
    public final int b() {
        return this.N;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.L;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i = iRotateLeft & this.M;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i + 1;
        }
    }

    @Override // defpackage.upj
    public final int g() {
        return 0;
    }

    @Override // defpackage.b0k, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.K;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return q().listIterator(0);
    }

    @Override // defpackage.upj
    public final efi k() {
        return q().listIterator(0);
    }

    @Override // defpackage.upj
    public final Object[] l() {
        return this.J;
    }

    @Override // defpackage.b0k
    public final pzj r() {
        return pzj.q(this.N, this.J);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.N;
    }
}
