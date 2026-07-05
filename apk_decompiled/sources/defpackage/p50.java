package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p50 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ long G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ p50(long j, boolean z, iqb iqbVar, qcc qccVar) {
        this.G = j;
        this.F = z;
        this.H = iqbVar;
        this.I = qccVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        boolean z = this.F;
        final int i2 = 0;
        final int i3 = 1;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                iqb iqbVar = (iqb) obj4;
                final qcc qccVar = (qcc) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    long j = this.G;
                    lz1 lz1Var = jd4.a;
                    if (j == 9205357640488583168L) {
                        e18Var.a0(4389176);
                        boolean zH = e18Var.h(qccVar);
                        Object objN = e18Var.N();
                        if (zH || objN == lz1Var) {
                            objN = new zy7() { // from class: q50
                                @Override // defpackage.zy7
                                public final Object a() {
                                    int i4 = i3;
                                    qcc qccVar2 = qccVar;
                                    switch (i4) {
                                        case 0:
                                            return Boolean.valueOf((9223372034707292159L & qccVar2.a()) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((9223372034707292159L & qccVar2.a()) != 9205357640488583168L);
                                    }
                                }
                            };
                            e18Var.k0(objN);
                        }
                        rqk.g(0, e18Var, (zy7) objN, iqbVar, z);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(3458246);
                        go0 go0Var = z ? xsc.b : xsc.a;
                        iqb iqbVarL = b.l(iqbVar, za6.d(j), za6.c(j), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12);
                        cxe cxeVarA = axe.a(go0Var, lja.P, e18Var, 0);
                        int iHashCode = Long.hashCode(e18Var.T);
                        hyc hycVarL = e18Var.l();
                        iqb iqbVarE = kxk.E(e18Var, iqbVarL);
                        dd4.e.getClass();
                        re4 re4Var = cd4.b;
                        e18Var.e0();
                        if (e18Var.S) {
                            e18Var.k(re4Var);
                        } else {
                            e18Var.n0();
                        }
                        d4c.i0(e18Var, cd4.f, cxeVarA);
                        d4c.i0(e18Var, cd4.e, hycVarL);
                        d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                        d4c.h0(e18Var, cd4.h);
                        d4c.i0(e18Var, cd4.d, iqbVarE);
                        boolean zH2 = e18Var.h(qccVar);
                        Object objN2 = e18Var.N();
                        if (zH2 || objN2 == lz1Var) {
                            objN2 = new zy7() { // from class: q50
                                @Override // defpackage.zy7
                                public final Object a() {
                                    int i4 = i2;
                                    qcc qccVar2 = qccVar;
                                    switch (i4) {
                                        case 0:
                                            return Boolean.valueOf((9223372034707292159L & qccVar2.a()) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((9223372034707292159L & qccVar2.a()) != 9205357640488583168L);
                                    }
                                }
                            };
                            e18Var.k0(objN2);
                        }
                        rqk.g(6, e18Var, (zy7) objN2, fqbVar, z);
                        e18Var.p(true);
                        e18Var.p(false);
                    }
                }
                break;
            case 1:
                ud0 ud0Var = (ud0) obj4;
                String str = (String) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else if (!z) {
                    e18Var2.a0(-1338566324);
                    ud0 ud0Var2 = ud0.d;
                    iv1.b(ud0Var, str, null, ef2.F, 0L, e18Var2, 3072, 20);
                    e18Var2.p(false);
                } else {
                    e18Var2.a0(-1338743272);
                    tjd.a(b.o(fqbVar, 18.0f), this.G, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 390, 56);
                    e18Var2.p(false);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                itj.a((iqb) obj4, this.G, (tkh) obj3, this.F, (ld4) obj, x44.p0(3073));
                break;
            default:
                ((Integer) obj2).getClass();
                pvj.g(this.F, (iqb) obj4, this.G, (ta4) obj3, (ld4) obj, x44.p0(3073));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ p50(iqb iqbVar, long j, tkh tkhVar, boolean z, int i) {
        this.H = iqbVar;
        this.G = j;
        this.I = tkhVar;
        this.F = z;
    }

    public /* synthetic */ p50(boolean z, long j, ud0 ud0Var, String str) {
        this.F = z;
        this.G = j;
        this.H = ud0Var;
        this.I = str;
    }

    public /* synthetic */ p50(boolean z, iqb iqbVar, long j, ta4 ta4Var, int i) {
        this.F = z;
        this.H = iqbVar;
        this.G = j;
        this.I = ta4Var;
    }
}
