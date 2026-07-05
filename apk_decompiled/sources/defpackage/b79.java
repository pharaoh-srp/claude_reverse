package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b79 extends z69 implements hq3 {
    public static final b79 H = new b79(1, 0, 1);

    @Override // defpackage.hq3
    public final Comparable e() {
        return Integer.valueOf(this.E);
    }

    @Override // defpackage.z69
    public final boolean equals(Object obj) {
        if (!(obj instanceof b79)) {
            return false;
        }
        if (isEmpty() && ((b79) obj).isEmpty()) {
            return true;
        }
        b79 b79Var = (b79) obj;
        return this.E == b79Var.E && this.F == b79Var.F;
    }

    @Override // defpackage.hq3
    public final Comparable g() {
        return Integer.valueOf(this.F);
    }

    public final boolean h(int i) {
        return this.E <= i && i <= this.F;
    }

    @Override // defpackage.z69
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.E * 31) + this.F;
    }

    @Override // defpackage.z69, defpackage.hq3
    public final boolean isEmpty() {
        return this.E > this.F;
    }

    @Override // defpackage.z69
    public final String toString() {
        return this.E + ".." + this.F;
    }
}
