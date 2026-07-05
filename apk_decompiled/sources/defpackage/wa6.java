package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wa6 implements t35 {
    public final float a;

    public wa6(float f) {
        this.a = f;
    }

    @Override // defpackage.t35
    public final float a(long j, cz5 cz5Var) {
        return cz5Var.q0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wa6) && va6.b(this.a, ((wa6) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
