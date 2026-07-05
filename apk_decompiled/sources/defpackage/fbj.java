package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fbj implements udb {
    public final wo1 a;
    public final int b;

    public fbj(wo1 wo1Var, int i) {
        this.a = wo1Var;
        this.b = i;
    }

    @Override // defpackage.udb
    public final int a(c79 c79Var, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        return i >= i2 - (i3 * 2) ? ij0.c(i2 - i, 2.0f, 1.0f) : wd6.e0(this.a.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbj)) {
            return false;
        }
        fbj fbjVar = (fbj) obj;
        return this.a.equals(fbjVar.a) && this.b == fbjVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return vb7.r(sb, this.b, ')');
    }
}
