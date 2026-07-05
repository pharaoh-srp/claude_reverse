package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ari implements wbj {
    public final String a;
    public final lsc b;

    public ari(o59 o59Var, String str) {
        this.a = str;
        this.b = mpk.P(o59Var);
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

    public final o59 e() {
        return (o59) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ari) {
            return x44.r(e(), ((ari) obj).e());
        }
        return false;
    }

    public final void f(o59 o59Var) {
        this.b.setValue(o59Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return vb7.r(sb, e().d, ')');
    }
}
