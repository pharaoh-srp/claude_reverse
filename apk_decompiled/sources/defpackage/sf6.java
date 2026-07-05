package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sf6 {
    public final int a;
    public final int b;

    public sf6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf6)) {
            return false;
        }
        sf6 sf6Var = (sf6) obj;
        return this.a == sf6Var.a && this.b == sf6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return vb7.q("DrawerTabPosition(index=", ", count=", this.a, this.b, ")");
    }
}
