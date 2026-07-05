package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tn4 {
    public final sx1 a;
    public final ua2 b;

    public tn4(sx1 sx1Var, ua2 ua2Var) {
        this.a = sx1Var;
        this.b = ua2Var;
    }

    public final String toString() {
        ua2 ua2Var = this.b;
        h45 h45Var = (h45) ua2Var.I.x0(h45.G);
        String str = h45Var != null ? h45Var.F : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        gb9.q(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append(str != null ? ij0.j("[", str, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.a.a());
        sb.append(", continuation=");
        sb.append(ua2Var);
        sb.append(')');
        return sb.toString();
    }
}
