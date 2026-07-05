package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class h2 extends i2 implements RandomAccess {
    public final i2 E;
    public final int F;
    public final int G;

    public h2(i2 i2Var, int i, int i2) {
        this.E = i2Var;
        this.F = i;
        e2 e2Var = i2.Companion;
        int size = i2Var.size();
        e2Var.getClass();
        e2.d(i, i2, size);
        this.G = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        i2.Companion.getClass();
        e2.b(i, this.G);
        return this.E.get(this.F + i);
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.G;
    }

    @Override // defpackage.i2, java.util.List
    public final List subList(int i, int i2) {
        i2.Companion.getClass();
        e2.d(i, i2, this.G);
        int i3 = this.F;
        return new h2(this.E, i + i3, i3 + i2);
    }
}
