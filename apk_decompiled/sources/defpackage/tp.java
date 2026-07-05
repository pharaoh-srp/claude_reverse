package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tp implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;

    public /* synthetic */ tp(boolean z, int i) {
        this.E = i;
        this.F = z;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        long j3;
        ud0 ud0Var;
        int i;
        int i2;
        bpc bpcVarA;
        int i3 = this.E;
        iqb iqbVarP = fqb.E;
        boolean z = this.F;
        iei ieiVar = iei.a;
        switch (i3) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    bpc bpcVarA2 = a.a(ud0.o, e18Var);
                    String strL = gik.l((nrg) drg.T.getValue(), e18Var);
                    if (z) {
                        e18Var.a0(1032657784);
                        j = gm3.a(e18Var).n;
                    } else {
                        e18Var.a0(1032658746);
                        j = gm3.a(e18Var).O;
                    }
                    e18Var.p(false);
                    long j4 = j;
                    iqb iqbVarV = xn5.V(b.o(iqbVarP, 28.0f), xve.a);
                    if (z) {
                        e18Var.a0(1032666783);
                        iqbVarP = yfd.p(iqbVarP, gm3.a(e18Var).b, zni.b);
                    } else {
                        e18Var.a0(1032668347);
                    }
                    e18Var.p(false);
                    cv8.b(bpcVarA2, strL, gb9.J(iqbVarV.B(iqbVarP), 4.0f), j4, e18Var, 8, 0);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    bpc bpcVarA3 = a.a(ud0.e1, e18Var2);
                    String strJ0 = d4c.j0(R.string.chat_list_move_selected, e18Var2);
                    if (z) {
                        e18Var2.a0(-991372240);
                        j2 = gm3.a(e18Var2).M;
                    } else {
                        e18Var2.a0(-991371216);
                        j2 = gm3.a(e18Var2).O;
                    }
                    e18Var2.p(false);
                    cv8.b(bpcVarA3, strJ0, null, j2, e18Var2, 8, 4);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    bpc bpcVarA4 = a.a(ud0.C1, e18Var3);
                    String strJ02 = d4c.j0(R.string.chat_menu_delete, e18Var3);
                    if (z) {
                        e18Var3.a0(185633481);
                        j3 = gm3.a(e18Var3).y;
                    } else {
                        e18Var3.a0(185634567);
                        j3 = gm3.a(e18Var3).O;
                    }
                    e18Var3.p(false);
                    cv8.b(bpcVarA4, strJ02, null, j3, e18Var3, 8, 4);
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    cv8.b(a.a(z ? ud0.O0 : ud0.N0, e18Var4), d4c.j0(z ? R.string.button_unmute_content_description : R.string.button_mute_content_description, e18Var4), b.o(iqbVarP, 20.0f), 0L, e18Var4, 392, 8);
                }
                break;
            case 4:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    iv1.b(z ? ud0.B : ud0.D, d4c.j0(z ? R.string.browser_takeover_hide_keyboard : R.string.browser_takeover_show_keyboard, e18Var5), null, ef2.F, gm3.a(e18Var5).M, e18Var5, 3072, 4);
                }
                break;
            case 5:
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                } else {
                    iv1.b(ud0.t1, d4c.j0(R.string.chat_input_stop_button_content_description, e18Var6), b.o(iqbVarP, 20.0f), null, 0L, e18Var6, 384, 24);
                    if (!z) {
                        e18Var6.a0(-914437610);
                        e18Var6.p(false);
                    } else {
                        e18Var6.a0(-914670482);
                        tjd.a(b.o(iqbVarP, 32.0f), ((d54) e18Var6.j(on4.a)).a, 1.0f, 0L, 1, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var6, 390, 40);
                        e18Var6.p(false);
                    }
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                pmk.c(z, (ld4) obj, x44.p0(1));
                break;
            case 7:
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var7.T);
                    hyc hycVarL = e18Var7.l();
                    iqb iqbVarE = kxk.E(e18Var7, iqbVarP);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var7.e0();
                    if (e18Var7.S) {
                        e18Var7.k(re4Var);
                    } else {
                        e18Var7.n0();
                    }
                    d4c.i0(e18Var7, cd4.f, o5bVarD);
                    d4c.i0(e18Var7, cd4.e, hycVarL);
                    d4c.i0(e18Var7, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var7, cd4.h);
                    d4c.i0(e18Var7, cd4.d, iqbVarE);
                    cv8.b(a.a(ud0.p0, e18Var7), d4c.j0(R.string.connector_directory_sort_action, e18Var7), null, 0L, e18Var7, 8, 12);
                    if (z) {
                        e18Var7.a0(535144359);
                        dw1.a(yfd.p(b.o(sf5.M(nw1.a.a(iqbVarP, lja.I), 2.0f, -2.0f), 8.0f), gm3.a(e18Var7).k, xve.a), e18Var7, 0);
                        e18Var7.p(false);
                    } else {
                        e18Var7.a0(535484553);
                        e18Var7.p(false);
                    }
                    e18Var7.p(true);
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                eve.d(z, (ld4) obj, x44.p0(7));
                break;
            case 9:
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e18Var8.T();
                } else if (!z) {
                    e18Var8.a0(-1763686199);
                    cv8.b(a.a(ud0.m, e18Var8), d4c.j0(R.string.login_welcome_email_submit_a11y, e18Var8), b.o(iqbVarP, q02.f), 0L, e18Var8, 8, 8);
                    e18Var8.p(false);
                } else {
                    e18Var8.a0(-1763895666);
                    tjd.a(b.o(iqbVarP, q02.f), ((d54) e18Var8.j(on4.a)).a, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var8, 384, 56);
                    e18Var8.p(false);
                }
                break;
            case 10:
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    e18Var9.T();
                } else if (!z) {
                    e18Var9.a0(-934453475);
                    fhk.b(d4c.j0(R.string.research_making_plan, e18Var9), null, ((jm3) gm3.c(e18Var9).e.E).i, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, false, e18Var9, 0, 0, 2042);
                    e18Var9.p(false);
                } else {
                    e18Var9.a0(-934719548);
                    tjh.b(d4c.j0(R.string.research_making_plan, e18Var9), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var9).e.E).i, e18Var9, 0, 0, 131070);
                    e18Var9.p(false);
                }
                break;
            case 11:
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e18Var10.T();
                } else if (!z) {
                    e18Var10.a0(-1909504293);
                    kxk.g(e18Var10, b.o(iqbVarP, 20.0f));
                    e18Var10.p(false);
                } else {
                    e18Var10.a0(-1909864203);
                    cv8.b(a.a(ud0.L, e18Var10), null, b.o(gb9.L(iqbVarP, MTTypesetterKt.kLineSkipLimitMultiplier, 2.0f, 1), 20.0f), gm3.a(e18Var10).b0, e18Var10, 440, 0);
                    e18Var10.p(false);
                }
                break;
            case 12:
                ld4 ld4Var11 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    e18Var11.T();
                } else {
                    if (z) {
                        e18Var11.a0(1096747149);
                        ud0Var = ud0.L;
                    } else {
                        e18Var11.a0(1096748109);
                        ud0Var = ud0.Y;
                    }
                    bpc bpcVarA5 = a.a(ud0Var, e18Var11);
                    e18Var11.p(false);
                    if (z) {
                        i = -360489358;
                        i2 = R.string.code_block_copied;
                    } else {
                        i = -360409843;
                        i2 = R.string.code_block_copy_button;
                    }
                    cv8.b(bpcVarA5, vb7.n(e18Var11, i, i2, e18Var11, false), b.o(iqbVarP, 20.0f), 0L, e18Var11, 392, 8);
                }
                break;
            case 13:
                ld4 ld4Var12 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    e18Var12.T();
                } else {
                    cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var12, 0);
                    int iHashCode2 = Long.hashCode(e18Var12.T);
                    hyc hycVarL2 = e18Var12.l();
                    iqb iqbVarE2 = kxk.E(e18Var12, iqbVarP);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var12.e0();
                    if (e18Var12.S) {
                        e18Var12.k(re4Var2);
                    } else {
                        e18Var12.n0();
                    }
                    d4c.i0(e18Var12, cd4.f, cxeVarA);
                    d4c.i0(e18Var12, cd4.e, hycVarL2);
                    d4c.i0(e18Var12, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var12, cd4.h);
                    d4c.i0(e18Var12, cd4.d, iqbVarE2);
                    kxk.g(e18Var12, b.t(iqbVarP, 12.0f));
                    if (z) {
                        e18Var12.a0(832761940);
                        bpcVarA = a.a(ud0.H0, e18Var12);
                        e18Var12.p(false);
                    } else {
                        e18Var12.a0(832847500);
                        bpcVarA = a.a(ud0.T0, e18Var12);
                        e18Var12.p(false);
                    }
                    cv8.b(bpcVarA, null, null, 0L, e18Var12, 56, 12);
                    e18Var12.p(true);
                }
                break;
            default:
                ld4 ld4Var13 = (ld4) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    e18Var13.T();
                } else {
                    zsk.d(this.F, gb9.N(fqb.E, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), true, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var13, 1572912, 56);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ tp(boolean z, int i, int i2) {
        this.E = i2;
        this.F = z;
    }
}
