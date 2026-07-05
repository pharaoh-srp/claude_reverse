package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class h0k extends txj {
    public final transient Object[] G;
    public final transient int H;
    public final transient int I;

    public h0k(Object[] objArr, int i, int i2) {
        this.G = objArr;
        this.H = i;
        this.I = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yvj.b(i, this.I);
        Object obj = this.G[i + i + this.H];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.hxj
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.I;
    }
}
