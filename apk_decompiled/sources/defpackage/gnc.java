package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gnc {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public gnc(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnc)) {
            return false;
        }
        gnc gncVar = (gnc) obj;
        return Float.compare(this.a, gncVar.a) == 0 && Float.compare(this.b, gncVar.b) == 0 && Float.compare(this.c, gncVar.c) == 0 && Float.compare(this.d, gncVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + vb7.b(this.c, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Padding(top=" + this.a + ", end=" + this.b + ", bottom=" + this.c + ", start=" + this.d + ")";
    }
}
