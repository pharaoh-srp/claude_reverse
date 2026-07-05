package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f3d {
    public final long a;
    public final long b;
    public final int c;

    public f3d(long j, int i, long j2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        dlh[] dlhVarArr = clh.b;
        if ((j & 1095216660480L) == 0) {
            c39.a("width cannot be TextUnit.Unspecified");
        }
        if ((j2 & 1095216660480L) == 0) {
            c39.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3d)) {
            return false;
        }
        f3d f3dVar = (f3d) obj;
        return clh.a(this.a, f3dVar.a) && clh.a(this.b, f3dVar.b) && this.c == f3dVar.c;
    }

    public final int hashCode() {
        dlh[] dlhVarArr = clh.b;
        return Integer.hashCode(this.c) + vb7.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Placeholder(width=");
        sb.append((Object) clh.d(this.a));
        sb.append(", height=");
        sb.append((Object) clh.d(this.b));
        sb.append(", placeholderVerticalAlign=");
        int i = this.c;
        sb.append((Object) (i == 1 ? "AboveBaseline" : i == 2 ? "Top" : i == 3 ? "Bottom" : i == 4 ? "Center" : i == 5 ? "TextTop" : i == 6 ? "TextBottom" : i == 7 ? "TextCenter" : "Invalid"));
        sb.append(')');
        return sb.toString();
    }
}
