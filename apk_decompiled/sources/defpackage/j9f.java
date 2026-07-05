package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j9f implements aaf {
    public static final y5f j = new y5f(new a6f(16), new z5f(18));
    public final isc a;
    public float f;
    public final wz5 h;
    public final wz5 i;
    public final isc b = new isc(0);
    public final isc c = new isc(0);
    public final zub d = new zub();
    public final isc e = new isc(Integer.MAX_VALUE);
    public final it5 g = new it5(new tz9(22, this));

    public j9f(int i) {
        this.a = new isc(i);
        final int i2 = 0;
        this.h = mpk.w(new zy7(this) { // from class: i9f
            public final /* synthetic */ j9f F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i3 = i2;
                j9f j9fVar = this.F;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(j9fVar.a.h() < j9fVar.e.h());
                    default:
                        return Boolean.valueOf(j9fVar.a.h() > 0);
                }
            }
        });
        final int i3 = 1;
        this.i = mpk.w(new zy7(this) { // from class: i9f
            public final /* synthetic */ j9f F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i32 = i3;
                j9f j9fVar = this.F;
                switch (i32) {
                    case 0:
                        return Boolean.valueOf(j9fVar.a.h() < j9fVar.e.h());
                    default:
                        return Boolean.valueOf(j9fVar.a.h() > 0);
                }
            }
        });
    }

    public static Object f(j9f j9fVar, int i, xzg xzgVar) {
        Object objK = eve.k(j9fVar, i - j9fVar.a.h(), new yig(7, null), xzgVar);
        return objK == m45.E ? objK : iei.a;
    }

    @Override // defpackage.aaf
    public final boolean a() {
        return this.g.a();
    }

    @Override // defpackage.aaf
    public final boolean b() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.aaf
    public final Object c(zwb zwbVar, pz7 pz7Var, tp4 tp4Var) {
        Object objC = this.g.c(zwbVar, pz7Var, tp4Var);
        return objC == m45.E ? objC : iei.a;
    }

    @Override // defpackage.aaf
    public final boolean d() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.aaf
    public final float e(float f) {
        return this.g.e(f);
    }

    public final void g(int i) {
        isc iscVar = this.a;
        this.e.i(i);
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            if (iscVar.h() > i) {
                iscVar.i(i);
            }
        } finally {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
        }
    }
}
