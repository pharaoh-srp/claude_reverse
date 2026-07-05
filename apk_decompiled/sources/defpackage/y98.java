package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class y98 implements co4 {
    public final int a;
    public final Path.FillType b;
    public final b80 c;
    public final b80 d;
    public final b80 e;
    public final b80 f;
    public final boolean g;

    public y98(String str, int i, Path.FillType fillType, b80 b80Var, b80 b80Var2, b80 b80Var3, b80 b80Var4, boolean z) {
        this.a = i;
        this.b = fillType;
        this.c = b80Var;
        this.d = b80Var2;
        this.e = b80Var3;
        this.f = b80Var4;
        this.g = z;
    }

    @Override // defpackage.co4
    public final ym4 a(pna pnaVar, bna bnaVar, le1 le1Var) {
        return new z98(pnaVar, bnaVar, le1Var, this);
    }
}
