package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w70 implements wbj {
    public final int a;
    public final String b;
    public final lsc c = mpk.P(f59.e);
    public final lsc d = mpk.P(Boolean.TRUE);

    public w70(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.wbj
    public final int a(cz5 cz5Var) {
        return e().b;
    }

    @Override // defpackage.wbj
    public final int b(cz5 cz5Var, fu9 fu9Var) {
        return e().c;
    }

    @Override // defpackage.wbj
    public final int c(cz5 cz5Var) {
        return e().d;
    }

    @Override // defpackage.wbj
    public final int d(cz5 cz5Var, fu9 fu9Var) {
        return e().a;
    }

    public final f59 e() {
        return (f59) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w70) {
            return this.a == ((w70) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(bdj bdjVar, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(bdjVar.a.i(i2));
            f(bdjVar.a.u(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return vb7.r(sb, e().d, ')');
    }
}
