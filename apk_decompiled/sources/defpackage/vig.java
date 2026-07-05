package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vig {
    public final boolean a;
    public final bz7 b;
    public final boolean c;

    public vig(bz7 bz7Var, boolean z, boolean z2) {
        bz7Var.getClass();
        this.a = z;
        this.b = bz7Var;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vig)) {
            return false;
        }
        vig vigVar = (vig) obj;
        return this.a == vigVar.a && x44.r(this.b, vigVar.b) && this.c == vigVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qy1.e(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpotlightToggleState(checked=");
        sb.append(this.a);
        sb.append(", onCheckedChange=");
        sb.append(this.b);
        sb.append(", enabled=");
        return sq6.v(")", sb, this.c);
    }
}
