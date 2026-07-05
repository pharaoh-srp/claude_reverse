package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class jqh {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public nd g = nd.c;

    static {
        ebh.w(0, 1, 2, 3, 4);
    }

    public final long a(int i, int i2) {
        ld ldVarA = this.g.a(i);
        if (ldVarA.a != -1) {
            return ldVarA.f[i2];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        ld ldVarA;
        int i;
        nd ndVar = this.g;
        long j2 = this.d;
        int i2 = ndVar.a;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = 0;
            while (i3 < i2) {
                ndVar.a(i3).getClass();
                ndVar.a(i3).getClass();
                if (0 > j && ((i = (ldVarA = ndVar.a(i3)).a) == -1 || ldVarA.a(-1) < i)) {
                    break;
                }
                i3++;
            }
            if (i3 < i2) {
                if (j2 != -9223372036854775807L) {
                    ndVar.a(i3).getClass();
                    if (0 <= j2) {
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    public final int c(long j) {
        nd ndVar = this.g;
        int i = ndVar.a;
        int i2 = i - 1;
        if (i2 == i - 1) {
            ndVar.a(i2).getClass();
        }
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            ndVar.a(i2).getClass();
            if (j >= 0) {
                break;
            }
            i2--;
        }
        if (i2 >= 0) {
            ld ldVarA = ndVar.a(i2);
            int i3 = ldVarA.a;
            if (i3 != -1) {
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = ldVarA.e[i4];
                    if (i5 != 0 && i5 != 1) {
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    public final long d(int i) {
        this.g.a(i).getClass();
        return 0L;
    }

    public final int e(int i) {
        return this.g.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !jqh.class.equals(obj.getClass())) {
            return false;
        }
        jqh jqhVar = (jqh) obj;
        return Objects.equals(this.a, jqhVar.a) && Objects.equals(this.b, jqhVar.b) && this.c == jqhVar.c && this.d == jqhVar.d && this.e == jqhVar.e && this.f == jqhVar.f && Objects.equals(this.g, jqhVar.g);
    }

    public final boolean f(int i) {
        nd ndVar = this.g;
        int i2 = ndVar.a;
        if (i != i2 - 1 || i != i2 - 1) {
            return false;
        }
        ndVar.a(i).getClass();
        return false;
    }

    public final boolean g(int i) {
        this.g.a(i).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i, long j, long j2, nd ndVar, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.g = ndVar;
        this.f = z;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j = this.d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        return this.g.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
