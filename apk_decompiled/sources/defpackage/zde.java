package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zde extends nz8 {
    public final transient Object[] G;
    public final transient int H;
    public final transient int I;

    public zde(Object[] objArr, int i, int i2) {
        this.G = objArr;
        this.H = i;
        this.I = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fd9.G(i, this.I);
        Object obj = this.G[(i * 2) + this.H];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.cz8
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.I;
    }
}
