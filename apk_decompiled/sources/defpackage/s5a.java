package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s5a {
    public final u5a a;
    public final float b;
    public final int c;

    public s5a(u5a u5aVar, float f, int i) {
        u5aVar.getClass();
        this.a = u5aVar;
        this.b = f;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5a)) {
            return false;
        }
        s5a s5aVar = (s5a) obj;
        return x44.r(this.a, s5aVar.a) && Float.compare(this.b, s5aVar.b) == 0 && this.c == s5aVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + vb7.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Point(entry=");
        sb.append(this.a);
        sb.append(", canvasY=");
        sb.append(this.b);
        sb.append(", color=");
        return vb7.l(this.c, ")", sb);
    }
}
