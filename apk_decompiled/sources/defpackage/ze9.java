package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ze9 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final Set e;
    public final j7g f;

    public /* synthetic */ ze9(int i, boolean z, boolean z2, Set set, int i2) {
        this(i, 1, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : set, null);
    }

    public static ze9 a(ze9 ze9Var, int i, boolean z, Set set, j7g j7gVar, int i2) {
        int i3 = ze9Var.a;
        if ((i2 & 2) != 0) {
            i = ze9Var.b;
        }
        int i4 = i;
        if ((i2 & 4) != 0) {
            z = ze9Var.c;
        }
        boolean z2 = z;
        boolean z3 = ze9Var.d;
        if ((i2 & 16) != 0) {
            set = ze9Var.e;
        }
        Set set2 = set;
        if ((i2 & 32) != 0) {
            j7gVar = ze9Var.f;
        }
        j7g j7gVar2 = j7gVar;
        if (i3 == 0 || i4 == 0) {
            throw null;
        }
        return new ze9(i3, i4, z2, z3, set2, j7gVar2);
    }

    public final j7g b() {
        return this.f;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public final Set e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ze9)) {
            return false;
        }
        ze9 ze9Var = (ze9) obj;
        return x44.r(ze9Var.f, this.f) && ze9Var.a == this.a && ze9Var.b == this.b && ze9Var.c == this.c && ze9Var.d == this.d;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.c;
    }

    public final ze9 h(boolean z) {
        return a(this, 0, z, null, null, 59);
    }

    public final int hashCode() {
        j7g j7gVar = this.f;
        int iHashCode = j7gVar != null ? j7gVar.hashCode() : 0;
        int iF = sq6.F(this.a) + (iHashCode * 31) + iHashCode;
        int iF2 = sq6.F(this.b) + (iF * 31) + iF;
        int i = (iF2 * 31) + (this.c ? 1 : 0) + iF2;
        return (i * 31) + (this.d ? 1 : 0) + i;
    }

    public final ze9 i(int i) {
        if (i != 0) {
            return a(this, i, false, null, null, 61);
        }
        throw null;
    }

    public final ze9 j(qai qaiVar) {
        Set set = this.e;
        return a(this, 0, false, set != null ? dxf.q0(set, qaiVar) : sf5.f0(qaiVar), null, 47);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeAttributes(howThisTypeIsUsed=");
        String str = "null";
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? "null" : "COMMON" : "SUPERTYPE");
        sb.append(", flexibility=");
        int i2 = this.b;
        if (i2 == 1) {
            str = "INFLEXIBLE";
        } else if (i2 == 2) {
            str = "FLEXIBLE_UPPER_BOUND";
        } else if (i2 == 3) {
            str = "FLEXIBLE_LOWER_BOUND";
        }
        sb.append(str);
        sb.append(", isRaw=");
        sb.append(this.c);
        sb.append(", isForAnnotationParameter=");
        sb.append(this.d);
        sb.append(", visitedTypeParameters=");
        sb.append(this.e);
        sb.append(", defaultType=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }

    public ze9(int i, int i2, boolean z, boolean z2, Set set, j7g j7gVar) {
        if (i != 0 && i2 != 0) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = z2;
            this.e = set;
            this.f = j7gVar;
            return;
        }
        throw null;
    }
}
