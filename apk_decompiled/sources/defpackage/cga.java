package defpackage;

import android.content.Context;
import com.anthropic.claude.app.main.loggedin.i;
import com.anthropic.claude.types.strings.AccountId;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cga implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ koi F;
    public final /* synthetic */ bz7 G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ ta4 I;

    public /* synthetic */ cga(koi koiVar, bz7 bz7Var, bz7 bz7Var2, ta4 ta4Var) {
        this.F = koiVar;
        this.G = bz7Var;
        this.H = bz7Var2;
        this.I = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                    boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                    Object objN = e18Var.N();
                    lz1 lz1Var = jd4.a;
                    if (zF || objN == lz1Var) {
                        objN = m7fVarN.a(jce.a.b(fk0.class), null, null);
                        e18Var.k0(objN);
                    }
                    e18Var.p(false);
                    e18Var.p(false);
                    final fk0 fk0Var = (fk0) objN;
                    final koi koiVar = this.F;
                    AccountId accountIdM943boximpl = AccountId.m943boximpl(koiVar.d);
                    boolean zH = e18Var.h(fk0Var) | e18Var.f(koiVar);
                    Object objN2 = e18Var.N();
                    if (zH || objN2 == lz1Var) {
                        objN2 = new ab0(fk0Var, koiVar, null, 12);
                        e18Var.k0(objN2);
                    }
                    oqb oqbVar = fk0.K;
                    fd9.j(fk0Var, accountIdM943boximpl, (pz7) objN2, e18Var);
                    fk0Var.r(false);
                    r7f r7fVar = new r7f(koiVar.d, koiVar.e);
                    final bz7 bz7Var = this.G;
                    final bz7 bz7Var2 = this.H;
                    final ta4 ta4Var = this.I;
                    ta4 ta4VarQ0 = fd9.q0(-403003595, new rz7() { // from class: ega
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            Object n63Var;
                            int i2;
                            tp4 tp4Var;
                            zy7 zy7Var = (zy7) obj3;
                            ld4 ld4Var2 = (ld4) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            zy7Var.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= ((e18) ld4Var2).h(zy7Var) ? 4 : 2;
                            }
                            e18 e18Var2 = (e18) ld4Var2;
                            if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                i.e(null, e18Var2, 0);
                                eve.a(null, e18Var2, 0);
                                i.a(null, null, e18Var2, 0);
                                m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                                boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
                                Object objN3 = e18Var2.N();
                                lz1 lz1Var2 = jd4.a;
                                if (zF2 || objN3 == lz1Var2) {
                                    objN3 = m7fVarN2.a(jce.a.b(rc8.class), null, null);
                                    e18Var2.k0(objN3);
                                }
                                e18Var2.p(false);
                                e18Var2.p(false);
                                rc8 rc8Var = (rc8) objN3;
                                m7f m7fVarN3 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                                boolean zF3 = e18Var2.f(null) | e18Var2.f(m7fVarN3);
                                Object objN4 = e18Var2.N();
                                if (zF3 || objN4 == lz1Var2) {
                                    objN4 = m7fVarN3.a(jce.a.b(ul7.class), null, null);
                                    e18Var2.k0(objN4);
                                }
                                e18Var2.p(false);
                                e18Var2.p(false);
                                ul7 ul7Var = (ul7) objN4;
                                int i3 = iIntValue2;
                                fk0 fk0Var2 = fk0Var;
                                boolean zH2 = e18Var2.h(fk0Var2);
                                koi koiVar2 = koiVar;
                                boolean zF4 = zH2 | e18Var2.f(koiVar2) | e18Var2.h(ul7Var);
                                int i4 = i3 & 14;
                                boolean z = i4 == 4;
                                bz7 bz7Var3 = bz7Var;
                                boolean zF5 = zF4 | z | e18Var2.f(bz7Var3);
                                Object objN5 = e18Var2.N();
                                if (zF5 || objN5 == lz1Var2) {
                                    i2 = i4;
                                    n63Var = new n63(fk0Var2, koiVar2, ul7Var, zy7Var, bz7Var3, 2);
                                    e18Var2.k0(n63Var);
                                } else {
                                    i2 = i4;
                                    n63Var = objN5;
                                }
                                sf5.d((zy7) n63Var, koiVar2, e18Var2, 0);
                                boolean zF6 = (i2 == 4) | e18Var2.f(bz7Var3);
                                Object objN6 = e18Var2.N();
                                if (zF6 || objN6 == lz1Var2) {
                                    objN6 = new vk3(zy7Var, bz7Var3, 13);
                                    e18Var2.k0(objN6);
                                }
                                int i5 = i2;
                                tp4 tp4Var2 = null;
                                i.b(false, null, null, null, null, null, null, (bz7) objN6, e18Var2, 0, 127);
                                Context context = (Context) e18Var2.j(w00.b);
                                eli eliVarA = kd7.a(e18Var2);
                                boolean zF7 = e18Var2.f(eliVarA) | e18Var2.f(context) | e18Var2.f(rc8Var);
                                Object objN7 = e18Var2.N();
                                if (zF7 || objN7 == lz1Var2) {
                                    objN7 = new lm3(eliVarA, context, new eg7(rc8Var, 1));
                                    e18Var2.k0(objN7);
                                }
                                j8.c(ve4.t.a((lm3) objN7), fd9.q0(-2014032907, new tu2(ta4Var, 5), e18Var2), e18Var2, 48);
                                m7f m7fVarN4 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                                boolean zF8 = e18Var2.f(null) | e18Var2.f(m7fVarN4);
                                Object objN8 = e18Var2.N();
                                if (zF8 || objN8 == lz1Var2) {
                                    objN8 = m7fVarN4.a(jce.a.b(dkc.class), null, null);
                                    e18Var2.k0(objN8);
                                }
                                e18Var2.p(false);
                                e18Var2.p(false);
                                zy1 zy1Var = ((dkc) objN8).c;
                                bz7 bz7Var4 = bz7Var2;
                                int i6 = 4;
                                boolean zF9 = e18Var2.f(bz7Var4) | (i5 == 4);
                                Object objN9 = e18Var2.N();
                                if (zF9 || objN9 == lz1Var2) {
                                    objN9 = new f23(bz7Var4, zy7Var, tp4Var2, i6);
                                    e18Var2.k0(objN9);
                                }
                                x44.b(zy1Var, (pz7) objN9, e18Var2, 0);
                                m7f m7fVarN5 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                                boolean zF10 = e18Var2.f(null) | e18Var2.f(m7fVarN5);
                                Object objN10 = e18Var2.N();
                                if (zF10 || objN10 == lz1Var2) {
                                    objN10 = m7fVarN5.a(jce.a.b(f8.class), null, null);
                                    e18Var2.k0(objN10);
                                }
                                e18Var2.p(false);
                                e18Var2.p(false);
                                f8 f8Var = (f8) objN10;
                                m7f m7fVarN6 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                                boolean zF11 = e18Var2.f(null) | e18Var2.f(m7fVarN6);
                                Object objN11 = e18Var2.N();
                                if (zF11 || objN11 == lz1Var2) {
                                    objN11 = m7fVarN6.a(jce.a.b(q7.class), null, null);
                                    e18Var2.k0(objN11);
                                }
                                e18Var2.p(false);
                                e18Var2.p(false);
                                q7 q7Var = (q7) objN11;
                                String strM105getEmail_addressZiuLfiY = q7Var.a().m105getEmail_addressZiuLfiY();
                                boolean zH3 = e18Var2.h(f8Var) | e18Var2.f(koiVar2) | e18Var2.f(q7Var);
                                Object objN12 = e18Var2.N();
                                if (zH3 || objN12 == lz1Var2) {
                                    tp4Var = null;
                                    f23 f23Var = new f23(f8Var, koiVar2, q7Var, tp4Var, 5);
                                    e18Var2.k0(f23Var);
                                    objN12 = f23Var;
                                } else {
                                    tp4Var = null;
                                }
                                fd9.j(koiVar2, strM105getEmail_addressZiuLfiY, (pz7) objN12, e18Var2);
                                AccountId accountIdM943boximpl2 = AccountId.m943boximpl(koiVar2.d);
                                boolean zH4 = e18Var2.h(rc8Var) | e18Var2.h(fk0Var2) | e18Var2.f(koiVar2);
                                Object objN13 = e18Var2.N();
                                if (zH4 || objN13 == lz1Var2) {
                                    f23 f23Var2 = new f23(rc8Var, fk0Var2, koiVar2, tp4Var, 6);
                                    e18Var2.k0(f23Var2);
                                    objN13 = f23Var2;
                                }
                                oqb oqbVar2 = fk0.K;
                                fd9.j(fk0Var2, accountIdM943boximpl2, (pz7) objN13, e18Var2);
                            } else {
                                e18Var2.T();
                            }
                            return iei.a;
                        }
                    }, e18Var);
                    m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                    boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                    Object objN3 = e18Var.N();
                    if (zF2 || objN3 == lz1Var) {
                        objN3 = m7fVarN2.a(jce.a.b(ql3.class), null, null);
                        e18Var.k0(objN3);
                    }
                    e18Var.p(false);
                    e18Var.p(false);
                    ql3 ql3Var = (ql3) objN3;
                    boolean zF3 = e18Var.f(r7fVar);
                    Object objN4 = e18Var.N();
                    if (zF3 || objN4 == lz1Var) {
                        objN4 = new o7f(ql3Var.b(r7fVar, koiVar));
                        e18Var.k0(objN4);
                    }
                    m7f m7fVar = ((o7f) objN4).a;
                    boolean zH2 = e18Var.h(ql3Var) | e18Var.h(r7fVar);
                    Object objN5 = e18Var.N();
                    if (zH2 || objN5 == lz1Var) {
                        objN5 = new vc8(ql3Var, 6, r7fVar);
                        e18Var.k0(objN5);
                    }
                    x44.h(m7fVar, (zy7) objN5, ta4VarQ0, e18Var, 384);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                i.f(this.F, this.G, this.H, this.I, (ld4) obj, x44.p0(3073));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ cga(koi koiVar, bz7 bz7Var, bz7 bz7Var2, ta4 ta4Var, int i) {
        this.F = koiVar;
        this.G = bz7Var;
        this.H = bz7Var2;
        this.I = ta4Var;
    }
}
