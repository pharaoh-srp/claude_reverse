package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e5h {
    public final pz7 a;
    public final bz7 b;
    public final pz7 c;

    public e5h(pz7 pz7Var, bz7 bz7Var, pz7 pz7Var2) {
        pz7Var.getClass();
        bz7Var.getClass();
        pz7Var2.getClass();
        this.a = pz7Var;
        this.b = bz7Var;
        this.c = pz7Var2;
    }

    public final pz7 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5h)) {
            return false;
        }
        e5h e5hVar = (e5h) obj;
        return x44.r(this.a, e5hVar.a) && x44.r(this.b, e5hVar.b) && x44.r(this.c, e5hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qy1.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TaskActions(onSendMessage=" + this.a + ", onBrowserTakeOver=" + this.b + ", onOpenFormInput=" + this.c + ")";
    }
}
