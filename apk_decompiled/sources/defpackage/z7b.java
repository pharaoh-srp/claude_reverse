package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z7b {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public z7b(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final z7b a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new z7b(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7b)) {
            return false;
        }
        z7b z7bVar = (z7b) obj;
        return this.a.equals(z7bVar.a) && this.b == z7bVar.b && this.c == z7bVar.c && this.d == z7bVar.d && this.e == z7bVar.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public z7b(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public z7b(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public z7b(Object obj) {
        this(obj, -1L);
    }
}
