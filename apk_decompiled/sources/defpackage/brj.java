package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class brj extends sqj {
    public static final brj K = new brj(0, new Object[0]);
    public final transient Object[] I;
    public final transient int J;

    public brj(int i, Object[] objArr) {
        super(0);
        this.I = objArr;
        this.J = i;
    }

    @Override // defpackage.upj
    public final Object[] e() {
        return this.I;
    }

    @Override // defpackage.upj
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        msk.i(i, this.J);
        Object obj = this.I[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.upj
    public final int h() {
        return this.J;
    }

    @Override // defpackage.sqj, defpackage.upj
    public final int m(Object[] objArr) {
        Object[] objArr2 = this.I;
        int i = this.J;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.J;
    }
}
