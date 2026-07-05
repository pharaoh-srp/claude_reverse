package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gp implements pz7 {
    public final /* synthetic */ int E = 4;
    public final /* synthetic */ Object F;
    public final /* synthetic */ long G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ gp(int i, long j, iqb iqbVar, bpc bpcVar, String str) {
        this.H = bpcVar;
        this.F = str;
        this.I = iqbVar;
        this.G = j;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        Object obj4 = this.H;
        Object obj5 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                gok.c((String) obj5, this.G, (mnc) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 1:
                pz7 pz7Var = (pz7) obj4;
                String str = (String) obj5;
                tkh tkhVar = (tkh) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    long j = this.G;
                    if (pz7Var == null) {
                        e18Var.a0(-844627961);
                        tjh.b(str, null, j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkhVar, e18Var, 0, 24960, 110586);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-844759587);
                        nrk.b(str, pz7Var, null, tkh.b(tkhVar, j, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 0, 52);
                        e18Var.p(false);
                    }
                }
                break;
            case 2:
                pz7 pz7Var2 = (pz7) obj5;
                zb0 zb0Var = (zb0) obj4;
                tkh tkhVar2 = (tkh) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    long j2 = this.G;
                    if (pz7Var2 == null) {
                        e18Var2.a0(-21360105);
                        tjh.c(zb0Var, null, j2, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, tkhVar2, e18Var2, 0, 24960, 241658);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-21503387);
                        nrk.a(zb0Var, pz7Var2, null, tkh.b(tkhVar2, j2, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 0);
                        e18Var2.p(false);
                    }
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                kkc.b((iqb) obj3, this.G, (rc8) obj5, (jkc) obj4, (ld4) obj, x44.p0(1));
                break;
            case 4:
                iqb iqbVar = (iqb) obj3;
                ((Integer) obj2).getClass();
                kik.d(x44.p0(393), this.G, (ld4) obj, iqbVar, (bpc) obj4, (String) obj5);
                break;
            default:
                tkh tkhVar3 = (tkh) obj5;
                mnc mncVar = (mnc) obj4;
                rz7 rz7Var = (rz7) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    xe4 xe4Var = tjh.a;
                    j8.d(new hvd[]{sq6.m(this.G, on4.a), xe4Var.a(((tkh) e18Var3.j(xe4Var)).f(tkhVar3))}, fd9.q0(977687163, new ufe(mncVar, 21, rz7Var), e18Var3), e18Var3, 48);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ gp(pz7 pz7Var, zb0 zb0Var, tkh tkhVar, long j) {
        this.F = pz7Var;
        this.H = zb0Var;
        this.I = tkhVar;
        this.G = j;
    }

    public /* synthetic */ gp(pz7 pz7Var, String str, tkh tkhVar, long j) {
        this.H = pz7Var;
        this.F = str;
        this.I = tkhVar;
        this.G = j;
    }

    public /* synthetic */ gp(iqb iqbVar, long j, rc8 rc8Var, jkc jkcVar, int i) {
        this.I = iqbVar;
        this.G = j;
        this.F = rc8Var;
        this.H = jkcVar;
    }

    public /* synthetic */ gp(tkh tkhVar, long j, mnc mncVar, rz7 rz7Var) {
        this.F = tkhVar;
        this.G = j;
        this.H = mncVar;
        this.I = rz7Var;
    }

    public /* synthetic */ gp(String str, long j, mnc mncVar, iqb iqbVar, int i) {
        this.F = str;
        this.G = j;
        this.H = mncVar;
        this.I = iqbVar;
    }
}
