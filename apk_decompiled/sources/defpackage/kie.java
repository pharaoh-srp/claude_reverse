package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kie {
    public final vs8 a;
    public final String b;
    public final wg8 c;
    public final tie d;
    public final j8 e;
    public y42 f;

    public kie(jie jieVar) {
        jieVar.getClass();
        vs8 vs8Var = jieVar.a;
        if (vs8Var == null) {
            sz6.j("url == null");
            throw null;
        }
        this.a = vs8Var;
        this.b = jieVar.b;
        this.c = jieVar.c.v();
        this.d = jieVar.d;
        this.e = jieVar.e;
    }

    public final y42 a() {
        y42 y42Var = this.f;
        if (y42Var != null) {
            return y42Var;
        }
        y42 y42Var2 = y42.n;
        y42 y42VarO0 = fd9.o0(this.c);
        this.f = y42VarO0;
        return y42VarO0;
    }

    public final jie b() {
        jie jieVar = new jie();
        jieVar.a = this.a;
        jieVar.b = this.b;
        jieVar.d = this.d;
        jieVar.e = this.e;
        jieVar.c = this.c.g();
        return jieVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        wg8 wg8Var = this.c;
        if (wg8Var.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : wg8Var) {
                int i2 = i + 1;
                if (i < 0) {
                    x44.n0();
                    throw null;
                }
                cpc cpcVar = (cpc) obj;
                String str = (String) cpcVar.E;
                String str2 = (String) cpcVar.F;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (zkj.k(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        zm6 zm6Var = zm6.j;
        j8 j8Var = this.e;
        if (!x44.r(j8Var, zm6Var)) {
            sb.append(", tags=");
            sb.append(j8Var);
        }
        sb.append('}');
        return sb.toString();
    }
}
