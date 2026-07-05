package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.kyc.KycStatusResponse;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wd implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ wd(bz7 bz7Var, qnc qncVar, bz7 bz7Var2) {
        this.E = 0;
        this.F = bz7Var;
        this.H = qncVar;
        this.G = bz7Var2;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        Long l = (Long) this.F;
        qi3 qi3Var = (qi3) this.G;
        String str = (String) this.H;
        s64 s64Var = (s64) obj;
        ld4 ld4Var = (ld4) obj3;
        int iH = ebh.h((Integer) obj4, s64Var, (mnc) obj2);
        int i = 2;
        if ((iH & 6) == 0) {
            iH |= ((e18) ld4Var).f(s64Var) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iH & 1, (iH & 131) != 130)) {
            float fI = kik.i(8, e18Var);
            fqb fqbVar = fqb.E;
            kxk.g(e18Var, b.e(fqbVar, fI));
            bpc bpcVarD = u00.D(R.drawable.stt_education_prompt_drawing, 0, e18Var);
            iqb iqbVarT = b.t(fqbVar, 90.0f);
            vo1 vo1Var = lja.T;
            xn5.N(bpcVarD, null, s64Var.a(iqbVarT, vo1Var), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 56, 120);
            kxk.g(e18Var, b.e(fqbVar, kik.i(28, e18Var)));
            tjh.b(d4c.j0(R.string.stt_education_title, e18Var), s64Var.a(gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), vo1Var), gm3.a(e18Var).M, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).b, e18Var, 0, 0, 130040);
            kxk.g(e18Var, b.e(fqbVar, kik.i(32, e18Var)));
            kik.d(392, 0L, e18Var, gb9.L(fqbVar, 28.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), u00.D(R.drawable.phosphor_globe_duotone, 0, e18Var), d4c.j0(R.string.stt_education_choose_language, e18Var));
            kxk.g(e18Var, b.e(fqbVar, kik.i(20, e18Var)));
            if (l != null) {
                e18Var.a0(-1374446023);
                kik.d(392, 0L, e18Var, gb9.L(fqbVar, 28.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), u00.D(R.drawable.phosphor_timer_duotone, 0, e18Var), d4c.f0(R.plurals.stt_education_time_limit, (int) l.longValue(), new Object[]{l}, e18Var));
                kxk.g(e18Var, b.e(fqbVar, kik.i(20, e18Var)));
                e18Var.p(false);
            } else {
                e18Var.a0(-1374019339);
                e18Var.p(false);
            }
            kik.d(392, 0L, e18Var, gb9.L(fqbVar, 28.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), u00.D(R.drawable.phosphor_lightning_duotone, 0, e18Var), d4c.j0(R.string.stt_education_chat_quickly, e18Var));
            kxk.g(e18Var, b.e(fqbVar, kik.i(52, e18Var)));
            iqb iqbVarL = gb9.L(fqbVar, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            boolean zH = e18Var.h(qi3Var) | e18Var.f(str);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new m55(qi3Var, str, i);
                e18Var.k0(objN);
            }
            nik.e(390, e18Var, (bz7) objN, iqbVarL);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        cji cjiVar = (cji) this.F;
        r4g r4gVar = (r4g) this.G;
        fji fjiVar = (fji) this.H;
        ld4 ld4Var = (ld4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((s64) obj).getClass();
        ((mnc) obj2).getClass();
        boolean z = (iIntValue & 129) != 128;
        int i = iIntValue & 1;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i, z)) {
            KycStatusResponse kycStatusResponse = (KycStatusResponse) cjiVar.o.getValue();
            lz1 lz1Var = jd4.a;
            if (kycStatusResponse != null) {
                e18Var.a0(487934242);
                String vendor_inquiry_url = kycStatusResponse.getVendor_inquiry_url();
                if (vendor_inquiry_url == null) {
                    vendor_inquiry_url = cjiVar.h;
                }
                String str = vendor_inquiry_url;
                boolean zH = e18Var.h(r4gVar);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new ef1(r4gVar, 13);
                    e18Var.k0(objN);
                }
                ztj.b(0, 4, e18Var, (zy7) objN, null, str);
                e18Var.p(false);
            } else {
                e18Var.a0(488153381);
                oe5.e(cjiVar, fjiVar, null, null, e18Var, 0);
                ovg ovgVar = (ovg) cjiVar.n.getValue();
                if (!((Boolean) cjiVar.p.getValue()).booleanValue() || ovgVar == null) {
                    e18Var.a0(488764267);
                    e18Var.p(false);
                } else {
                    e18Var.a0(488366413);
                    boolean zF = e18Var.f(cjiVar) | e18Var.h(r4gVar);
                    Object objN2 = e18Var.N();
                    if (zF || objN2 == lz1Var) {
                        objN2 = new nif(cjiVar, 18, r4gVar);
                        e18Var.k0(objN2);
                    }
                    oe5.c(ovgVar, (bz7) objN2, e18Var, 0);
                    e18Var.p(false);
                }
                e18Var.p(false);
            }
            kxk.g(e18Var, b.e(fqb.E, 16.0f));
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        final zy7 zy7Var = (zy7) this.F;
        final r4g r4gVar = (r4g) this.G;
        final zy7 zy7Var2 = (zy7) this.H;
        s64 s64Var = (s64) obj;
        mnc mncVar = (mnc) obj2;
        ld4 ld4Var = (ld4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        s64Var.getClass();
        mncVar.getClass();
        if ((iIntValue & 6) == 0) {
            i = (((e18) ld4Var).f(s64Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((e18) ld4Var).f(mncVar) ? 32 : 16;
        }
        final int i2 = 0;
        final int i3 = 1;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 147) != 146)) {
            boolean zF = e18Var.f(zy7Var) | e18Var.h(r4gVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new zy7() { // from class: n1j
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i4 = i2;
                        iei ieiVar = iei.a;
                        r4g r4gVar2 = r4gVar;
                        zy7 zy7Var3 = zy7Var;
                        switch (i4) {
                            case 0:
                                zy7Var3.a();
                                r4gVar2.a();
                                break;
                            default:
                                zy7Var3.a();
                                r4gVar2.a();
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(objN);
            }
            zy7 zy7Var3 = (zy7) objN;
            boolean zF2 = e18Var.f(zy7Var2) | e18Var.h(r4gVar);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = new zy7() { // from class: n1j
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i4 = i3;
                        iei ieiVar = iei.a;
                        r4g r4gVar2 = r4gVar;
                        zy7 zy7Var32 = zy7Var2;
                        switch (i4) {
                            case 0:
                                zy7Var32.a();
                                r4gVar2.a();
                                break;
                            default:
                                zy7Var32.a();
                                r4gVar2.a();
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(objN2);
            }
            xjk.g(s64Var, zy7Var3, (zy7) objN2, mncVar, e18Var, (i & 14) | ((i << 6) & 7168));
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0b6e  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0b78  */
    @Override // defpackage.sz7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Object r45, java.lang.Object r46, java.lang.Object r47, java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 3032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd.i(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ wd(Object obj, bz7 bz7Var, Object obj2, int i) {
        this.E = i;
        this.G = obj;
        this.F = bz7Var;
        this.H = obj2;
    }

    public /* synthetic */ wd(Object obj, Object obj2, bz7 bz7Var, int i) {
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.F = bz7Var;
    }

    public /* synthetic */ wd(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }
}
