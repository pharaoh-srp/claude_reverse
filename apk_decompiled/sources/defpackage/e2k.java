package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e2k extends pzj {
    public static final e2k K = new e2k(0, new Object[0]);
    public final transient Object[] I;
    public final transient int J;

    public e2k(int i, Object[] objArr) {
        super(1);
        this.I = objArr;
        this.J = i;
    }

    @Override // defpackage.pzj, defpackage.upj
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.I;
        int i = this.J;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.upj
    public final int b() {
        return this.J;
    }

    @Override // defpackage.upj
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zok.h(i, this.J);
        Object obj = this.I[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.upj
    public final Object[] l() {
        return this.I;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.J;
    }
}
