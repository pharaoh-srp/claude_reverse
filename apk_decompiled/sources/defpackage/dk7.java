package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dk7 {
    public final String a;
    public final tie b;
    public final long c;
    public final p8b d;

    public dk7(String str, tie tieVar, long j, p8b p8bVar) {
        str.getClass();
        p8bVar.getClass();
        this.a = str;
        this.b = tieVar;
        this.c = j;
        this.d = p8bVar;
    }

    public final tie a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final p8b c() {
        return this.d;
    }

    public final long d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk7)) {
            return false;
        }
        dk7 dk7Var = (dk7) obj;
        return x44.r(this.a, dk7Var.a) && this.b.equals(dk7Var.b) && this.c == dk7Var.c && x44.r(this.d, dk7Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + vb7.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "FileUploadInfo(fileName=" + this.a + ", body=" + this.b + ", size=" + this.c + ", mediaType=" + this.d + ")";
    }
}
