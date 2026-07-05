package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gs9 implements Comparable {
    public static final gs9 I = new gs9(2, 4, 0);
    public final int E;
    public final int F;
    public final int G;
    public final int H;

    public gs9(int i, int i2, int i3) {
        this.E = i;
        this.F = i2;
        this.G = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.H = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        gs9 gs9Var = (gs9) obj;
        gs9Var.getClass();
        return this.H - gs9Var.H;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        gs9 gs9Var = obj instanceof gs9 ? (gs9) obj : null;
        return gs9Var != null && this.H == gs9Var.H;
    }

    public final int hashCode() {
        return this.H;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.E);
        sb.append('.');
        sb.append(this.F);
        sb.append('.');
        sb.append(this.G);
        return sb.toString();
    }
}
