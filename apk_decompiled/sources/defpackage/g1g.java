package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g1g implements co4 {
    public final int a;
    public final c80 b;
    public final c80 c;
    public final c80 d;
    public final boolean e;

    public g1g(String str, int i, c80 c80Var, c80 c80Var2, c80 c80Var3, boolean z) {
        this.a = i;
        this.b = c80Var;
        this.c = c80Var2;
        this.d = c80Var3;
        this.e = z;
    }

    @Override // defpackage.co4
    public final ym4 a(pna pnaVar, bna bnaVar, le1 le1Var) {
        return new p7i(le1Var, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
