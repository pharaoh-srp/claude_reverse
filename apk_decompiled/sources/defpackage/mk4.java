package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$FeedbackType;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.models.organization.configtypes.CoworkStarterChip;
import com.anthropic.claude.project.details.custominstructions.d;
import com.anthropic.claude.ui.demo.app.UiDemoAppDestination;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.FieldBinding;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mk4 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ mk4(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        fxe fxeVar = fxe.a;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        int i2 = 1;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                ((mnc) obj2).getClass();
                j0a.V(j0aVar, null, null, new ta4(-1036797504, true, new lk4((kk4) obj3, i2)), 3);
                return ieiVar;
            case 1:
                m15 m15Var = (m15) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
                    wo1 wo1Var = lja.Q;
                    iqb iqbVarK = gb9.K(fqbVar, 12.0f, 6.0f);
                    cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarK);
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
                    tjd.a(b.o(fqbVar, 14.0f), gm3.a(e18Var).c, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 390, 56);
                    String strN = m15Var.c;
                    if (strN == null) {
                        strN = vb7.n(e18Var, 1374938979, R.string.conway_loading_thinking, e18Var, false);
                    } else {
                        e18Var.a0(1374937460);
                        e18Var.p(false);
                    }
                    tjh.b(strN, b.v(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 220.0f, 1), gm3.a(e18Var).O, 0L, new wu7(1), null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 48, 24960, 110552);
                    e18Var.p(true);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 2:
                ConwayAppScreen.Extension extension = (ConwayAppScreen.Extension) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tjh.b(extension.getName(), null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).b, e18Var2, 0, 24960, 110586);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 3:
                isc iscVar = (isc) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zF = e18Var3.f(iscVar);
                    Object objN = e18Var3.N();
                    if (zF || objN == lz1Var) {
                        objN = new v22(iscVar, 1);
                        e18Var3.k0(objN);
                    }
                    ez1.e((zy7) objN, null, false, null, null, nb4.a, e18Var3, 1572864, 62);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 4:
                upg upgVar = (upg) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tjh.b(upgVar.a, gb9.K(fqbVar, 12.0f, 14.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).g, e18Var4, 48, 0, 131068);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 5:
                ((Integer) obj2).getClass();
                dtk.c((xw4) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 6:
                ((Integer) obj2).getClass();
                dch.m((zhh) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 7:
                CoworkStarterChip coworkStarterChip = (CoworkStarterChip) obj3;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    wo1 wo1Var2 = lja.Q;
                    ho0 ho0Var2 = new ho0(4.0f, true, new sz6(1));
                    iqb iqbVarK2 = gb9.K(b.s(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 32.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 13), 12.0f, 6.0f);
                    cxe cxeVarA2 = axe.a(ho0Var2, wo1Var2, e18Var5, 54);
                    int iHashCode2 = Long.hashCode(e18Var5.T);
                    hyc hycVarL2 = e18Var5.l();
                    iqb iqbVarE2 = kxk.E(e18Var5, iqbVarK2);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var5.e0();
                    if (e18Var5.S) {
                        e18Var5.k(re4Var2);
                    } else {
                        e18Var5.n0();
                    }
                    d4c.i0(e18Var5, cd4.f, cxeVarA2);
                    d4c.i0(e18Var5, cd4.e, hycVarL2);
                    d4c.i0(e18Var5, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var5, cd4.h);
                    d4c.i0(e18Var5, cd4.d, iqbVarE2);
                    ud0 ud0Var = ud0.d;
                    ud0 ud0VarW = v40.w(coworkStarterChip.getIcon());
                    if (ud0VarW == null) {
                        ud0VarW = ud0.K;
                    }
                    cv8.b(a.a(ud0VarW, e18Var5), null, b.o(fqbVar, 16.0f), gm3.a(e18Var5).N, e18Var5, 440, 0);
                    tjh.b(coworkStarterChip.getChip_text(), null, gm3.a(e18Var5).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).i, e18Var5, 0, 0, 131066);
                    iv1.b(ud0.C, null, null, ef2.F, gm3.a(e18Var5).N, e18Var5, 3120, 4);
                    e18Var5.p(true);
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 8:
                ((Integer) obj2).getClass();
                cvk.g((y85) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 9:
                return (yig) obj3;
            case 10:
                c61 c61Var = (c61) obj3;
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String strE = dch.E(R.string.m3c_dialog, e18Var6);
                    iqb iqbVar = (iqb) c61Var.G;
                    qnc qncVar = nt.a;
                    iqb iqbVarS = b.s(iqbVar, 280.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 560.0f, 10);
                    boolean zF2 = e18Var6.f(strE);
                    Object objN2 = e18Var6.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new cm5(strE, 4);
                        e18Var6.k0(objN2);
                    }
                    iqb iqbVarB = iqbVarS.B(tjf.b(fqbVar, false, (bz7) objN2));
                    o5b o5bVarD = dw1.d(lja.G, true);
                    int iHashCode3 = Long.hashCode(e18Var6.T);
                    hyc hycVarL3 = e18Var6.l();
                    iqb iqbVarE3 = kxk.E(e18Var6, iqbVarB);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var6.e0();
                    if (e18Var6.S) {
                        e18Var6.k(re4Var3);
                    } else {
                        e18Var6.n0();
                    }
                    d4c.i0(e18Var6, cd4.f, o5bVarD);
                    d4c.i0(e18Var6, cd4.e, hycVarL3);
                    d4c.i0(e18Var6, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var6, cd4.h);
                    d4c.i0(e18Var6, cd4.d, iqbVarE3);
                    vb7.y(0, (ta4) c61Var.I, e18Var6, true);
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case 11:
                hw1 hw1Var = (hw1) obj3;
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    iqb iqbVarF = tvk.f(b.b(knk.M(b.c(fqbVar, 1.0f), (wbj) hw1Var.G), MTTypesetterKt.kLineSkipLimitMultiplier, ryb.a, 1));
                    ho0 ho0Var3 = new ho0(ryb.b, true, new sz6(1));
                    wo1 wo1Var3 = lja.Q;
                    ta4 ta4Var = (ta4) hw1Var.H;
                    cxe cxeVarA3 = axe.a(ho0Var3, wo1Var3, e18Var7, 54);
                    int iHashCode4 = Long.hashCode(e18Var7.T);
                    hyc hycVarL4 = e18Var7.l();
                    iqb iqbVarE4 = kxk.E(e18Var7, iqbVarF);
                    dd4.e.getClass();
                    re4 re4Var4 = cd4.b;
                    e18Var7.e0();
                    if (e18Var7.S) {
                        e18Var7.k(re4Var4);
                    } else {
                        e18Var7.n0();
                    }
                    d4c.i0(e18Var7, cd4.f, cxeVarA3);
                    d4c.i0(e18Var7, cd4.e, hycVarL4);
                    d4c.i0(e18Var7, cd4.g, Integer.valueOf(iHashCode4));
                    d4c.h0(e18Var7, cd4.h);
                    d4c.i0(e18Var7, cd4.d, iqbVarE4);
                    ta4Var.invoke(fxeVar, e18Var7, 6);
                    e18Var7.p(true);
                } else {
                    e18Var7.T();
                }
                return ieiVar;
            case 12:
                ((Integer) obj2).getClass();
                e18 e18Var8 = (e18) ((ld4) obj);
                e18Var8.a0(666084174);
                String str = ((heh) obj3).b;
                e18Var8.p(false);
                return str;
            case 13:
                b9i b9iVar = (b9i) obj3;
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var8;
                if (e18Var9.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    wo1 wo1Var4 = lja.Q;
                    rz7 rz7Var = b9iVar.j;
                    cxe cxeVarA4 = axe.a(ko0.b, wo1Var4, e18Var9, 54);
                    int iHashCode5 = Long.hashCode(e18Var9.T);
                    hyc hycVarL5 = e18Var9.l();
                    iqb iqbVarE5 = kxk.E(e18Var9, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var5 = cd4.b;
                    e18Var9.e0();
                    if (e18Var9.S) {
                        e18Var9.k(re4Var5);
                    } else {
                        e18Var9.n0();
                    }
                    d4c.i0(e18Var9, cd4.f, cxeVarA4);
                    d4c.i0(e18Var9, cd4.e, hycVarL5);
                    d4c.i0(e18Var9, cd4.g, Integer.valueOf(iHashCode5));
                    d4c.h0(e18Var9, cd4.h);
                    d4c.i0(e18Var9, cd4.d, iqbVarE5);
                    rz7Var.invoke(fxeVar, e18Var9, 6);
                    e18Var9.p(true);
                } else {
                    e18Var9.T();
                }
                return ieiVar;
            case 14:
                d dVar = (d) obj3;
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var9;
                if (e18Var10.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) dVar.g.getValue()).booleanValue();
                    boolean z = !((Boolean) dVar.g.getValue()).booleanValue();
                    qnc qncVar2 = q02.a;
                    n02 n02VarD = q02.d(0L, gm3.a(e18Var10).M, 0L, e18Var10, 13);
                    boolean zF3 = e18Var10.f(dVar);
                    Object objN3 = e18Var10.N();
                    if (zF3 || objN3 == lz1Var) {
                        objN3 = new xi4(12, dVar);
                        e18Var10.k0(objN3);
                    }
                    lnk.b((zy7) objN3, zBooleanValue, null, z, null, n02VarD, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, dlk.a, e18Var10, 0, 4052);
                } else {
                    e18Var10.T();
                }
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                MobileAppFeedbackEvents$FeedbackType mobileAppFeedbackEvents$FeedbackType = (MobileAppFeedbackEvents$FeedbackType) obj3;
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var11 = (e18) ld4Var10;
                if (e18Var11.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    tjh.b(d4c.j0(dlk.n(mobileAppFeedbackEvents$FeedbackType), e18Var11), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var11, 0, 0, 262142);
                } else {
                    e18Var11.T();
                }
                return ieiVar;
            case 16:
                ((Integer) obj2).getClass();
                dlk.g((u2a) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return FieldBinding.getBuilderSetter$lambda$0((WireField) obj3, (Message.Builder) obj, obj2);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return FieldBinding.getBuilderSetter$lambda$1((Method) obj3, (Message.Builder) obj, obj2);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return FieldBinding.getBuilderSetter$lambda$2((Field) obj3, (Message.Builder) obj, obj2);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ld4 ld4Var11 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                e18 e18Var12 = (e18) ld4Var11;
                if (e18Var12.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    throw null;
                }
                e18Var12.T();
                return ieiVar;
            case 21:
                ((Integer) obj2).getClass();
                prk.i((qc8) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                id8 id8Var = (id8) obj3;
                n18 n18Var = (n18) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                n18Var.getClass();
                String str2 = n18Var.a;
                id8Var.getClass();
                str2.getClass();
                id8Var.e.k(str2, zBooleanValue2);
                id8Var.O();
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                n18 n18Var2 = (n18) obj3;
                ld4 ld4Var12 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var13 = (e18) ld4Var12;
                if (e18Var13.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    pd8.d(n18Var2.a, e18Var13, 0);
                } else {
                    e18Var13.T();
                }
                return ieiVar;
            case 24:
                ah8 ah8Var = (ah8) obj3;
                int iIntValue13 = ((Integer) obj).intValue();
                tkh tkhVar = (tkh) obj2;
                tkhVar.getClass();
                switch (iIntValue13) {
                    case 0:
                        return ah8Var.g;
                    case 1:
                        return ah8Var.a;
                    case 2:
                        return ah8Var.b;
                    case 3:
                        return ah8Var.c;
                    case 4:
                        return ah8Var.d;
                    case 5:
                        return ah8Var.e;
                    case 6:
                        return ah8Var.f;
                    default:
                        return tkhVar;
                }
            case BuildConfig.VERSION_CODE /* 25 */:
                UiDemoAppDestination uiDemoAppDestination = (UiDemoAppDestination) obj3;
                ld4 ld4Var13 = (ld4) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                e18 e18Var14 = (e18) ld4Var13;
                if (e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    mwj.a(uiDemoAppDestination.getTitle(), null, null, null, null, 0L, null, 0L, e18Var14, 0, 510);
                } else {
                    e18Var14.T();
                }
                return ieiVar;
            case 26:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                float f = tw8.b;
                ((hsc) obj3).i(fFloatValue);
                return ieiVar;
            case 27:
                ((Integer) obj2).getClass();
                rwk.f((md9) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 28:
                ((dae) obj3).E = (fcc) obj2;
                ((z7d) obj).a();
                return ieiVar;
            default:
                rja rjaVar = (rja) obj3;
                ld4 ld4Var14 = (ld4) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                e18 e18Var15 = (e18) ld4Var14;
                if (e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    String strJ0 = d4c.j0(R.string.button_logout, e18Var15);
                    boolean zBooleanValue3 = ((Boolean) rjaVar.d.getValue()).booleanValue();
                    boolean zF4 = e18Var15.f(rjaVar);
                    Object objN4 = e18Var15.N();
                    if (zF4 || objN4 == lz1Var) {
                        objN4 = new mx5(0, rjaVar, rja.class, "submitLogout", "submitLogout()V", 0, 11);
                        e18Var15.k0(objN4);
                    }
                    oe5.a(0, 0, e18Var15, (zy7) ((jm9) objN4), strJ0, zBooleanValue3);
                } else {
                    e18Var15.T();
                }
                return ieiVar;
        }
    }

    public /* synthetic */ mk4(Object obj, int i, int i2) {
        this.E = i2;
        this.F = obj;
    }
}
