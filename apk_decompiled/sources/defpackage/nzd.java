package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nzd implements t35 {
    public final float a;

    public nzd(float f) {
        this.a = f;
    }

    @Override // defpackage.t35
    public final float a(long j, cz5 cz5Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzd) && Float.compare(this.a, ((nzd) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".px)";
    }
}
