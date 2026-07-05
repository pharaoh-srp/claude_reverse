package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ta1 implements is8 {
    public final boolean a;
    public final /* synthetic */ int b;

    public ta1(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.is8
    public final void a(df5 df5Var, jie jieVar, cd cdVar) {
        switch (this.b) {
            case 0:
                ef5 ef5Var = df5Var.G;
                String strB = (this.a || (ef5Var instanceof af5)) ? ef5Var.b() : Long.toHexString(ef5Var.e());
                long j = df5Var.H;
                String strJ0 = this.a ? j8.j0(16, j) : Long.toHexString(j);
                cdVar.k(jieVar, "X-B3-TraceId", strB);
                cdVar.k(jieVar, "X-B3-SpanId", strJ0);
                if (df5Var.f()) {
                    cdVar.k(jieVar, "X-B3-Sampled", df5Var.d().U > 0 ? ua1.a : ua1.b);
                }
                String str = ua1.a;
                break;
            default:
                ef5 ef5Var2 = df5Var.G;
                String strB2 = (this.a || (ef5Var2 instanceof af5)) ? ef5Var2.b() : Long.toHexString(ef5Var2.e());
                long j2 = df5Var.H;
                String strJ02 = this.a ? j8.j0(16, j2) : Long.toHexString(j2);
                StringBuilder sb = new StringBuilder(100);
                sb.append(strB2);
                sb.append('-');
                sb.append(strJ02);
                if (df5Var.f()) {
                    String str2 = df5Var.d().U > 0 ? ua1.a : ua1.b;
                    sb.append('-');
                    sb.append(str2);
                }
                cdVar.k(jieVar, "b3", sb.toString());
                String str3 = ua1.a;
                break;
        }
    }
}
