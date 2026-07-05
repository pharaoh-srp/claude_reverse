package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class v6d {
    public final Object a;
    public final int b;
    public final j7b c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        ebh.w(0, 1, 2, 3, 4);
        tpi.w(5);
        tpi.w(6);
    }

    public v6d(Object obj, int i, j7b j7bVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        fd9.E(i >= 0);
        fd9.E(i2 >= 0);
        this.a = obj;
        this.b = i;
        this.c = j7bVar;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v6d.class == obj.getClass()) {
            v6d v6dVar = (v6d) obj;
            if (this.b == v6dVar.b && this.e == v6dVar.e && this.f == v6dVar.f && this.g == v6dVar.g && this.h == v6dVar.h && this.i == v6dVar.i && Objects.equals(this.c, v6dVar.c) && Objects.equals(this.a, v6dVar.a) && Objects.equals(this.d, v6dVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int i = this.h;
        if (i == -1) {
            return str;
        }
        return str + ", contentPos=" + this.g + ", adGroup=" + i + ", ad=" + this.i;
    }
}
