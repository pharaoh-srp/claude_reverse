package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class m0g implements co4 {
    public final boolean a;
    public final Path.FillType b;
    public final b80 c;
    public final b80 d;
    public final boolean e;

    public m0g(String str, boolean z, Path.FillType fillType, b80 b80Var, b80 b80Var2, boolean z2) {
        this.a = z;
        this.b = fillType;
        this.c = b80Var;
        this.d = b80Var2;
        this.e = z2;
    }

    @Override // defpackage.co4
    public final ym4 a(pna pnaVar, bna bnaVar, le1 le1Var) {
        return new rk7(pnaVar, le1Var, this);
    }

    public final String toString() {
        return y6a.p(new StringBuilder("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
