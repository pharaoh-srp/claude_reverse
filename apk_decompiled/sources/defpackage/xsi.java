package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.app.verification.VerificationScreens;
import com.anthropic.claude.app.verification.a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xsi implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ iqb H;

    public /* synthetic */ xsi(int i, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar) {
        this.F = zy7Var;
        this.G = zy7Var2;
        this.H = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        iqb iqbVar = this.H;
        zy7 zy7Var = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    Object objN = e18Var.N();
                    lz1 lz1Var = jd4.a;
                    if (objN == lz1Var) {
                        objN = new kdi(27);
                        e18Var.k0(objN);
                    }
                    zy7 zy7Var2 = (zy7) objN;
                    kce kceVar = jce.a;
                    final rwe rweVarP = eve.P(kceVar.b(VerificationScreens.class), oq5.B(kceVar.b(VerificationScreens.class)), true, iv1.M(kceVar.b(VerificationScreens.class)), zy7Var2, e18Var);
                    x44.q0(rweVarP, e18Var);
                    boolean zH = e18Var.h(rweVarP) | e18Var.f(zy7Var);
                    Object objN2 = e18Var.N();
                    if (zH || objN2 == lz1Var) {
                        objN2 = new lld(rweVarP, zy7Var, 4);
                        e18Var.k0(objN2);
                    }
                    final zy7 zy7Var3 = (zy7) objN2;
                    Object objN3 = e18Var.N();
                    if (objN3 == lz1Var) {
                        objN3 = sq6.p(e18Var);
                    }
                    final ybg ybgVar = (ybg) objN3;
                    final long j = ((gwa) e18Var.j(jwa.a)).a.n;
                    iqb iqbVarK0 = mpk.k0(iqbVar, mpk.n);
                    ta4 ta4VarQ0 = fd9.q0(2078945412, new x7i(6, zy7Var3), e18Var);
                    ta4 ta4VarQ02 = fd9.q0(1830977218, new rn(ybgVar, 26), e18Var);
                    final zy7 zy7Var4 = this.G;
                    v40.b(iqbVarK0, null, ta4VarQ0, null, ta4VarQ02, null, 0, j, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(1946722289, new rz7() { // from class: ysi
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            final mnc mncVar = (mnc) obj3;
                            ld4 ld4Var2 = (ld4) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            mncVar.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= ((e18) ld4Var2).f(mncVar) ? 4 : 2;
                            }
                            e18 e18Var2 = (e18) ld4Var2;
                            if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                final rwe rweVar = rweVarP;
                                fu5 fu5VarQ = csg.q(rweVar, e18Var2, 384);
                                final long j2 = j;
                                final zy7 zy7Var5 = zy7Var3;
                                final ybg ybgVar2 = ybgVar;
                                final zy7 zy7Var6 = zy7Var4;
                                mwa.l(rweVar, null, fu5VarQ, fd9.q0(146502970, new sz7() { // from class: zsi
                                    @Override // defpackage.sz7
                                    public final Object i(Object obj6, Object obj7, Object obj8, Object obj9) {
                                        wo8 wo8Var = zni.b;
                                        VerificationScreens verificationScreens = (VerificationScreens) obj7;
                                        ld4 ld4Var3 = (ld4) obj8;
                                        int iIntValue3 = ((Integer) obj9).intValue();
                                        ((ia0) obj6).getClass();
                                        verificationScreens.getClass();
                                        if ((iIntValue3 & 48) == 0) {
                                            iIntValue3 |= (iIntValue3 & 64) == 0 ? ((e18) ld4Var3).f(verificationScreens) : ((e18) ld4Var3).h(verificationScreens) ? 32 : 16;
                                        }
                                        e18 e18Var3 = (e18) ld4Var3;
                                        if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                            boolean z = verificationScreens instanceof VerificationScreens.EnterPhoneStep;
                                            long j3 = j2;
                                            zy7 zy7Var7 = zy7Var5;
                                            ybg ybgVar3 = ybgVar2;
                                            mnc mncVar2 = mncVar;
                                            if (z) {
                                                e18Var3.a0(783355956);
                                                iqb iqbVarP = yfd.p(b.c, j3, wo8Var);
                                                rwe rweVar2 = rweVar;
                                                boolean zH2 = e18Var3.h(rweVar2);
                                                Object objN4 = e18Var3.N();
                                                if (zH2 || objN4 == jd4.a) {
                                                    objN4 = new l99(rweVar2, 6);
                                                    e18Var3.k0(objN4);
                                                }
                                                awj.b((bz7) objN4, zy7Var7, ybgVar3, iqbVarP, null, mncVar2, null, e18Var3, 384);
                                                e18Var3.p(false);
                                            } else {
                                                if (!(verificationScreens instanceof VerificationScreens.VerifyPhoneCodeStep)) {
                                                    throw ebh.u(e18Var3, -944564286, false);
                                                }
                                                e18Var3.a0(784128135);
                                                pvj.h(((VerificationScreens.VerifyPhoneCodeStep) verificationScreens).getPhoneNumber(), zy7Var6, zy7Var7, ybgVar3, yfd.p(b.c, j3, wo8Var), null, null, mncVar2, e18Var3, 3072);
                                                e18Var3.p(false);
                                            }
                                        } else {
                                            e18Var3.T();
                                        }
                                        return iei.a;
                                    }
                                }, e18Var2), e18Var2, 3072, 2);
                            } else {
                                e18Var2.T();
                            }
                            return iei.a;
                        }
                    }, e18Var), e18Var, 24960, 1898);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                a.a(x44.p0(1), (ld4) obj, zy7Var, this.G, iqbVar);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ xsi(zy7 zy7Var, iqb iqbVar, zy7 zy7Var2) {
        this.F = zy7Var;
        this.H = iqbVar;
        this.G = zy7Var2;
    }
}
