package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ksg extends yd6 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final ruc e;

    public ksg(float f, float f2, int i, int i2, d40 d40Var, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        d40Var = (i3 & 16) != 0 ? null : d40Var;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = d40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksg)) {
            return false;
        }
        ksg ksgVar = (ksg) obj;
        return this.a == ksgVar.a && this.b == ksgVar.b && this.c == ksgVar.c && this.d == ksgVar.d && x44.r(this.e, ksgVar.e);
    }

    public final int hashCode() {
        int iC = vb7.c(this.d, vb7.c(this.c, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
        ruc rucVar = this.e;
        return iC + (rucVar != null ? rucVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.c;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
