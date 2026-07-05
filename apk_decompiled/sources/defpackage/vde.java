package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class vde extends nz8 {
    public static final vde I = new vde(0, new Object[0]);
    public final transient Object[] G;
    public final transient int H;

    public vde(int i, Object[] objArr) {
        this.G = objArr;
        this.H = i;
    }

    @Override // defpackage.nz8, defpackage.cz8
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.G;
        int i2 = this.H;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.cz8
    public final Object[] e() {
        return this.G;
    }

    @Override // defpackage.cz8
    public final int g() {
        return this.H;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fd9.G(i, this.H);
        Object obj = this.G[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.cz8
    public final int h() {
        return 0;
    }

    @Override // defpackage.cz8
    public final boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.H;
    }
}
