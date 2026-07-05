package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xe3 implements rz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ xe3(int i) {
        this.E = i;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.E;
        int i3 = 18;
        tp4 tp4Var = null;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        switch (i2) {
            case 0:
                vqc vqcVar = (vqc) obj;
                uqc uqcVar = (uqc) obj2;
                uqc uqcVar2 = (uqc) obj3;
                vqcVar.getClass();
                uqcVar.getClass();
                uqcVar2.getClass();
                vqcVar.b.invoke(uqcVar.a, uqcVar2.a);
                break;
            case 1:
                ujg ujgVar = (ujg) obj;
                tjg tjgVar = (tjg) obj2;
                tjg tjgVar2 = (tjg) obj3;
                ujgVar.getClass();
                tjgVar.getClass();
                tjgVar2.getClass();
                ujgVar.b.invoke(tjgVar.a, tjgVar2.a);
                break;
            case 2:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                }
                break;
            case 3:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                }
                break;
            case 4:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                }
                break;
            case 5:
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    e18Var4.T();
                } else {
                    kxk.g(e18Var4, b.t(fqbVar, 2.0f));
                }
                break;
            case 6:
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    e18Var5.T();
                } else {
                    tjh.b(d4c.j0(R.string.incognito_chat, e18Var5), gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 7), gm3.a(e18Var5).O, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).i, e18Var5, 48, 0, 130040);
                }
                break;
            case 7:
                sbg sbgVar = (sbg) obj;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                sbgVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((e18) ld4Var6).f(sbgVar) ? 4 : 2;
                }
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    e18Var6.T();
                } else {
                    vbg vbgVar = (vbg) sbgVar;
                    if (!(vbgVar.b() instanceof ubg)) {
                        e18Var6.a0(669765996);
                        xvj.g(sbgVar, null, null, gm3.a(e18Var6).r, gm3.a(e18Var6).M, gm3.a(e18Var6).c, 0L, gm3.a(e18Var6).M, e18Var6, iIntValue6 & 14, 142);
                        e18Var6.p(false);
                    } else {
                        e18Var6.a0(669017284);
                        fcg fcgVarB = vbgVar.b();
                        fcgVarB.getClass();
                        ubg ubgVar = (ubg) fcgVarB;
                        boolean zF = e18Var6.f(ubgVar);
                        Object objN = e18Var6.N();
                        lz1 lz1Var = jd4.a;
                        if (zF || objN == lz1Var) {
                            objN = new kk0(ubgVar, tp4Var, i3);
                            e18Var6.k0(objN);
                        }
                        int i4 = iIntValue6 & 14;
                        fd9.i(e18Var6, (pz7) objN, sbgVar);
                        vt6 vt6VarD = ubgVar.d();
                        boolean z = i4 == 4;
                        Object objN2 = e18Var6.N();
                        if (z || objN2 == lz1Var) {
                            objN2 = new fb4(sbgVar, 0);
                            e18Var6.k0(objN2);
                        }
                        zhk.b(vt6VarD, (zy7) objN2, gb9.J(fqbVar, 12.0f), e18Var6, 384);
                        e18Var6.p(false);
                    }
                }
                break;
            case 8:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((e18) ld4Var7).g(zBooleanValue) ? 4 : 2;
                }
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    e18Var7.T();
                } else {
                    if (zBooleanValue) {
                        ud0 ud0Var = ud0.d;
                        i = R.drawable.anthropicon_x;
                    } else {
                        ud0 ud0Var2 = ud0.d;
                        i = R.drawable.anthropicon_ghost;
                    }
                    cv8.b(u00.D(i, 0, e18Var7), null, b.o(fqbVar, 24.0f), 0L, e18Var7, 440, 8);
                }
                break;
            case 9:
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    e18Var8.T();
                } else {
                    ho8.c(null, e18Var8, 0);
                }
                break;
            case 10:
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    e18Var9.T();
                } else {
                    ho8.c(null, e18Var9, 0);
                }
                break;
            case 11:
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    e18Var10.T();
                } else {
                    tjh.b(d4c.j0(R.string.loading_app_try_logging_in_again, e18Var10), null, 0L, 0L, null, null, null, 0L, qeh.c, null, 0L, 0, false, 0, 0, null, null, e18Var10, 805306368, 0, 261630);
                }
                break;
            case 12:
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    e18Var11.T();
                } else {
                    zh4.f(d4c.j0(R.string.nav_drawer_section_header_recents, e18Var11), ((jm3) gm3.c(e18Var11).e.E).h, null, new qnc(16.0f, 8.0f, 16.0f, 8.0f), e18Var11, 196608);
                }
                break;
            case 13:
                ld4 ld4Var12 = (ld4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    e18Var12.T();
                } else {
                    iv1.b(ud0.d, null, null, ef2.F, 0L, e18Var12, 3120, 20);
                    kxk.g(e18Var12, b.t(fqbVar, 4.0f));
                    tjh.b(d4c.j0(R.string.chat_new_chat, e18Var12), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var12).e.E).h, e18Var12, 0, 0, 131070);
                }
                break;
            default:
                jie jieVar = (jie) obj;
                String str = (String) obj2;
                String str2 = (String) obj3;
                jieVar.getClass();
                str.getClass();
                str2.getClass();
                jieVar.c.J(str);
                jieVar.a(str, str2);
                break;
        }
        return ieiVar;
    }
}
