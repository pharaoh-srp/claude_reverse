package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kz8 extends i2 implements mz8 {
    public final mz8 E;
    public final int F;
    public final int G;

    public kz8(mz8 mz8Var, int i, int i2) {
        mz8Var.getClass();
        this.E = mz8Var;
        this.F = i;
        jwj.e(i, i2, mz8Var.size());
        this.G = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jwj.c(i, this.G);
        return this.E.get(this.F + i);
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.G;
    }

    @Override // defpackage.i2, java.util.List
    public final List subList(int i, int i2) {
        jwj.e(i, i2, this.G);
        int i3 = this.F;
        return new kz8(this.E, i + i3, i3 + i2);
    }
}
