package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tx implements tdb {
    public final vo1 a;
    public final vo1 b;
    public final int c;

    public tx(vo1 vo1Var, vo1 vo1Var2, int i) {
        this.a = vo1Var;
        this.b = vo1Var2;
        this.c = i;
    }

    @Override // defpackage.tdb
    public final int a(c79 c79Var, long j, int i, fu9 fu9Var) {
        int iA = this.b.a(0, c79Var.f(), fu9Var);
        int i2 = -this.a.a(0, i, fu9Var);
        fu9 fu9Var2 = fu9.E;
        int i3 = this.c;
        if (fu9Var != fu9Var2) {
            i3 = -i3;
        }
        return c79Var.a + iA + i2 + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx)) {
            return false;
        }
        tx txVar = (tx) obj;
        return this.a.equals(txVar.a) && this.b.equals(txVar.b) && this.c == txVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + vb7.b(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return vb7.r(sb, this.c, ')');
    }
}
