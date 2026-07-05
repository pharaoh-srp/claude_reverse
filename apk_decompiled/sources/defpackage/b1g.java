package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b1g implements co4 {
    public final String a;
    public final int b;
    public final b80 c;
    public final boolean d;

    public b1g(String str, int i, b80 b80Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = b80Var;
        this.d = z;
    }

    @Override // defpackage.co4
    public final ym4 a(pna pnaVar, bna bnaVar, le1 le1Var) {
        return new i0g(pnaVar, le1Var, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        return vb7.r(sb, this.b, '}');
    }
}
