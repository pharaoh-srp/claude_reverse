package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class szj extends txj {
    public static final szj I = new szj(0, new Object[0]);
    public final transient Object[] G;
    public final transient int H;

    public szj(int i, Object[] objArr) {
        this.G = objArr;
        this.H = i;
    }

    @Override // defpackage.txj, defpackage.hxj
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.G;
        int i = this.H;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.hxj
    public final int b() {
        return this.H;
    }

    @Override // defpackage.hxj
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yvj.b(i, this.H);
        Object obj = this.G[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.hxj
    public final boolean h() {
        return false;
    }

    @Override // defpackage.hxj
    public final Object[] k() {
        return this.G;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.H;
    }
}
