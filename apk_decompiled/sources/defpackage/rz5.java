package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rz5 implements kl7 {
    public final kl7 a;

    public rz5(kl7 kl7Var) {
        this.a = kl7Var;
    }

    @Override // defpackage.mb0
    public final gsi a(c9i c9iVar) {
        return this.a.a((c9i) new qz5(c9iVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz5)) {
            return false;
        }
        return this.a.equals(((rz5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
