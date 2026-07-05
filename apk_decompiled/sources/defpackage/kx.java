package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class kx {
    public final long a;
    public final mqh b;
    public final int c;
    public final z7b d;
    public final long e;
    public final mqh f;
    public final int g;
    public final z7b h;
    public final long i;
    public final long j;

    public kx(long j, mqh mqhVar, int i, z7b z7bVar, long j2, mqh mqhVar2, int i2, z7b z7bVar2, long j3, long j4) {
        this.a = j;
        this.b = mqhVar;
        this.c = i;
        this.d = z7bVar;
        this.e = j2;
        this.f = mqhVar2;
        this.g = i2;
        this.h = z7bVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kx.class != obj.getClass()) {
            return false;
        }
        kx kxVar = (kx) obj;
        return this.a == kxVar.a && this.c == kxVar.c && this.e == kxVar.e && this.g == kxVar.g && this.i == kxVar.i && this.j == kxVar.j && this.b.equals(kxVar.b) && Objects.equals(this.d, kxVar.d) && Objects.equals(this.f, kxVar.f) && Objects.equals(this.h, kxVar.h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
