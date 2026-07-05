package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ia {
    public final String a;

    public ia(String str) {
        this.a = str;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.r("id", this.a);
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia) && this.a.equals(((ia) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("ContainerView(id=", this.a, ")");
    }
}
