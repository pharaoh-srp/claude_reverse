package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t45 implements Comparable {
    public final int E;
    public final String F;

    public t45(int i, String str) {
        this.E = i;
        this.F = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        t45 t45Var = (t45) obj;
        t45Var.getClass();
        return x44.z(this.E, t45Var.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t45)) {
            return false;
        }
        t45 t45Var = (t45) obj;
        return this.E == t45Var.E && this.F.equals(t45Var.F);
    }

    public final int hashCode() {
        return this.F.hashCode() + (Integer.hashCode(this.E) * 31);
    }

    public final String toString() {
        return ytk.g(this.F) + " +" + this.E;
    }
}
