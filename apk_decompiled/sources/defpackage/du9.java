package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class du9 {
    public final float a;
    public final boolean b;

    public du9(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du9)) {
            return false;
        }
        du9 du9Var = (du9) obj;
        return va6.b(this.a, du9Var.a) && this.b == du9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutCorner(radius=");
        ebh.v(this.a, sb, ", isFixed=");
        return y6a.p(sb, this.b, ')');
    }

    public du9() {
        this(16.0f, false);
    }
}
