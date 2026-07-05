package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ux implements udb {
    public final wo1 a;
    public final wo1 b;
    public final int c;

    public ux(wo1 wo1Var, wo1 wo1Var2, int i) {
        this.a = wo1Var;
        this.b = wo1Var2;
        this.c = i;
    }

    @Override // defpackage.udb
    public final int a(c79 c79Var, long j, int i) {
        int iA = this.b.a(0, c79Var.c());
        return c79Var.b + iA + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux)) {
            return false;
        }
        ux uxVar = (ux) obj;
        return this.a.equals(uxVar.a) && this.b.equals(uxVar.b) && this.c == uxVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + vb7.b(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return vb7.r(sb, this.c, ')');
    }
}
