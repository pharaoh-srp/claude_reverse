package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class uak extends qak {
    public static final uak I = new uak(0, new Object[0]);
    public final transient Object[] G;
    public final transient int H;

    public uak(int i, Object[] objArr) {
        this.G = objArr;
        this.H = i;
    }

    @Override // defpackage.dak
    public final Object[] a() {
        return this.G;
    }

    @Override // defpackage.dak
    public final int b() {
        return 0;
    }

    @Override // defpackage.dak
    public final int e() {
        return this.H;
    }

    @Override // defpackage.dak
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        bqk.f(i, this.H);
        Object obj = this.G[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.qak, defpackage.dak
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.G;
        int i = this.H;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.H;
    }
}
