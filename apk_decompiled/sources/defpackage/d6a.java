package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d6a {
    public static final d6a d = new d6a(a6a.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public d6a(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6a)) {
            return false;
        }
        d6a d6aVar = (d6a) obj;
        float f = d6aVar.a;
        float f2 = a6a.b;
        return Float.compare(this.a, f) == 0 && this.b == d6aVar.b && this.c == d6aVar.c;
    }

    public final int hashCode() {
        float f = a6a.b;
        return Integer.hashCode(this.c) + vb7.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) a6a.b(this.a));
        sb.append(", trim=");
        String str = "Invalid";
        int i = this.b;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
