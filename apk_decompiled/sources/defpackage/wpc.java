package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wpc {
    public final isc a;
    public final hsc b;
    public final isc c;
    public final lsc d;

    public wpc(int i, float f, int i2, mpc mpcVar) {
        this.a = new isc(i);
        this.b = new hsc(f);
        this.c = new isc(i2);
        this.d = mpk.P(mpcVar);
    }

    public final mpc a() {
        return (mpc) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        if (this == obj) {
            return true;
        }
        try {
            if (!(obj instanceof wpc)) {
                return false;
            }
            if (this.a.h() != ((wpc) obj).a.h()) {
                return false;
            }
            if (this.b.h() != ((wpc) obj).b.h()) {
                return false;
            }
            if (this.c.h() != ((wpc) obj).c.h()) {
                return false;
            }
            return x44.r(a(), ((wpc) obj).a());
        } finally {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
        }
    }

    public final int hashCode() {
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            int iH = ((((this.a.h() * 31) + Float.hashCode(this.b.h())) * 31) + this.c.h()) * 31;
            mpc mpcVarA = a();
            return iH + (mpcVarA != null ? mpcVarA.hashCode() : 0);
        } finally {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
        }
    }

    public /* synthetic */ wpc(mpc mpcVar, int i) {
        this(-1, Float.NaN, -1, (i & 8) != 0 ? null : mpcVar);
    }
}
