package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lz8 extends i2 {
    public final l3 E;
    public final int F;
    public final int G;

    public lz8(l3 l3Var, int i, int i2) {
        this.E = l3Var;
        this.F = i;
        zni.n(i, i2, l3Var.size());
        this.G = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zni.k(i, this.G);
        return this.E.get(this.F + i);
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.G;
    }

    @Override // defpackage.i2, java.util.List
    public final List subList(int i, int i2) {
        zni.n(i, i2, this.G);
        int i3 = this.F;
        return new lz8(this.E, i + i3, i3 + i2);
    }
}
