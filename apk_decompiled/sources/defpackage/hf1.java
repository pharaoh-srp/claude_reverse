package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hf1 implements jeh {
    public final ta4 a;
    public final fxb b = new fxb();
    public final lsc c = mpk.P(null);

    public hf1(ta4 ta4Var) {
        this.a = ta4Var;
    }

    @Override // defpackage.jeh
    public final Object a(beh behVar, xzg xzgVar) {
        Object objB = this.b.b(zwb.E, new ny(this, new gf1(behVar), null, 3), xzgVar);
        return objB == m45.E ? objB : iei.a;
    }

    public final void b(final zy7 zy7Var, ld4 ld4Var, final int i) {
        final zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(723898654);
        int i2 = (e18Var.f(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            gf1 gf1Var = (gf1) this.c.getValue();
            if (gf1Var == null) {
                r7e r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    r7eVarS.d = new pz7(this, zy7Var, i, i3) { // from class: ff1
                        public final /* synthetic */ int E;
                        public final /* synthetic */ hf1 F;
                        public final /* synthetic */ zy7 G;

                        {
                            this.E = i3;
                            this.F = this;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.E;
                            iei ieiVar = iei.a;
                            zy7 zy7Var3 = this.G;
                            hf1 hf1Var = this.F;
                            ld4 ld4Var2 = (ld4) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    hf1Var.b(zy7Var3, ld4Var2, x44.p0(7));
                                    break;
                                default:
                                    hf1Var.b(zy7Var3, ld4Var2, x44.p0(7));
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    return;
                }
                return;
            }
            zy7Var2 = zy7Var;
            this.a.m(gf1Var, gf1Var.a, zy7Var2, e18Var, 384);
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS2 = e18Var.s();
        if (r7eVarS2 != null) {
            r7eVarS2.d = new pz7(this, zy7Var2, i, i4) { // from class: ff1
                public final /* synthetic */ int E;
                public final /* synthetic */ hf1 F;
                public final /* synthetic */ zy7 G;

                {
                    this.E = i4;
                    this.F = this;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.E;
                    iei ieiVar = iei.a;
                    zy7 zy7Var3 = this.G;
                    hf1 hf1Var = this.F;
                    ld4 ld4Var2 = (ld4) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            hf1Var.b(zy7Var3, ld4Var2, x44.p0(7));
                            break;
                        default:
                            hf1Var.b(zy7Var3, ld4Var2, x44.p0(7));
                            break;
                    }
                    return ieiVar;
                }
            };
        }
    }
}
