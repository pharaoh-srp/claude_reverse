package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a5a implements wbj {
    public final wbj a;
    public final int b;

    public a5a(wbj wbjVar, int i) {
        this.a = wbjVar;
        this.b = i;
    }

    @Override // defpackage.wbj
    public final int a(cz5 cz5Var) {
        if ((this.b & 16) != 0) {
            return this.a.a(cz5Var);
        }
        return 0;
    }

    @Override // defpackage.wbj
    public final int b(cz5 cz5Var, fu9 fu9Var) {
        if (((fu9Var == fu9.E ? 4 : 1) & this.b) != 0) {
            return this.a.b(cz5Var, fu9Var);
        }
        return 0;
    }

    @Override // defpackage.wbj
    public final int c(cz5 cz5Var) {
        if ((this.b & 32) != 0) {
            return this.a.c(cz5Var);
        }
        return 0;
    }

    @Override // defpackage.wbj
    public final int d(cz5 cz5Var, fu9 fu9Var) {
        if (((fu9Var == fu9.E ? 8 : 2) & this.b) != 0) {
            return this.a.d(cz5Var, fu9Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5a)) {
            return false;
        }
        a5a a5aVar = (a5a) obj;
        return x44.r(this.a, a5aVar.a) && this.b == a5aVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        int i2 = mdj.a;
        if ((i & i2) == i2) {
            mdj.b(sb3, "Start");
        }
        int i3 = mdj.c;
        if ((i & i3) == i3) {
            mdj.b(sb3, "Left");
        }
        if ((i & 16) == 16) {
            mdj.b(sb3, "Top");
        }
        int i4 = mdj.b;
        if ((i & i4) == i4) {
            mdj.b(sb3, "End");
        }
        int i5 = mdj.d;
        if ((i & i5) == i5) {
            mdj.b(sb3, "Right");
        }
        if ((i & 32) == 32) {
            mdj.b(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
