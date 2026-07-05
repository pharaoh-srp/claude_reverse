package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.project.knowledge.l;
import com.anthropic.claude.tasks.ui.q;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sxa implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;

    public /* synthetic */ sxa(int i, zy7 zy7Var) {
        this.E = 28;
        this.F = zy7Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        zy7 zy7Var = this.F;
        iei ieiVar = iei.a;
        int i2 = 2;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    trk.a(0, 2, e18Var, this.F, d4c.j0(R.string.generic_button_close, e18Var), false);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    quj.d(null, null, null, null, fd9.q0(-417476142, new sxa(zy7Var, i2, z ? (byte) 1 : (byte) 0), e18Var2), null, e18Var2, 24576, 47);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    tqh.T.w(null, null, this.F, e18Var3, 3072, 3);
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    qnc qncVar = q02.a;
                    csg.j(this.F, null, false, null, q02.d(0L, gm3.a(e18Var4).M, 0L, e18Var4, 13), null, null, cpk.a, e18Var4, 805306368, 494);
                }
                break;
            case 4:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    trk.a(0, 6, e18Var5, this.F, null, false);
                }
                break;
            case 5:
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                } else {
                    tjh.b(d4c.j0(R.string.generic_error_something_went_wrong, e18Var6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var6, 0, 0, 262142);
                    lnk.d(this.F, null, false, null, null, null, null, kpk.b, e18Var6, 805306368, 510);
                }
                break;
            case 6:
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    tjh.b(d4c.j0(R.string.generic_error_something_went_wrong, e18Var7), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var7, 0, 0, 262142);
                    lnk.d(this.F, null, false, null, null, null, null, npk.b, e18Var7, 805306368, 510);
                }
                break;
            case 7:
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e18Var8.T();
                } else {
                    zni.e(null, bqk.a, fd9.q0(-1751314880, new sxa(zy7Var, 8, z ? (byte) 1 : (byte) 0), e18Var8), null, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var8, 432, 249);
                }
                break;
            case 8:
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    e18Var9.T();
                } else {
                    dgj.b(this.F, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var9, 0, 14);
                }
                break;
            case 9:
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e18Var10.T();
                } else {
                    Object objN = e18Var10.N();
                    lz1 lz1Var = jd4.a;
                    if (objN == lz1Var) {
                        objN = vb7.f(e18Var10);
                    }
                    zub zubVar = (zub) objN;
                    FillElement fillElement = b.c;
                    if (zy7Var == null) {
                        e18Var10.a0(1878448194);
                        Object objN2 = e18Var10.N();
                        if (objN2 == lz1Var) {
                            objN2 = new oob(19);
                            e18Var10.k0(objN2);
                        }
                        zy7Var = (zy7) objN2;
                    } else {
                        e18Var10.a0(1168973419);
                    }
                    e18Var10.p(false);
                    dw1.a(androidx.compose.foundation.b.b(fillElement, zubVar, null, false, null, null, zy7Var, 28), e18Var10, 0);
                }
                break;
            case 10:
                ld4 ld4Var11 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    e18Var11.T();
                } else {
                    wo1 wo1Var = lja.Q;
                    iqb iqbVarG = b.g(gb9.M(fqbVar, 16.0f, 6.0f, 12.0f, 6.0f), 48.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    cxe cxeVarA = axe.a(ko0.g, wo1Var, e18Var11, 54);
                    int iHashCode = Long.hashCode(e18Var11.T);
                    hyc hycVarL = e18Var11.l();
                    iqb iqbVarE = kxk.E(e18Var11, iqbVarG);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var11.e0();
                    if (e18Var11.S) {
                        e18Var11.k(re4Var);
                    } else {
                        e18Var11.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var11, z80Var, cxeVarA);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var11, z80Var2, hycVarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var11, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var11, bxVar);
                    z80 z80Var4 = cd4.d;
                    hw9 hw9VarN = kgh.n(e18Var11, iqbVarE, z80Var4, 1.0f, true);
                    cxe cxeVarA2 = axe.a(ko0.a, wo1Var, e18Var11, 48);
                    int iHashCode2 = Long.hashCode(e18Var11.T);
                    hyc hycVarL2 = e18Var11.l();
                    iqb iqbVarE2 = kxk.E(e18Var11, hw9VarN);
                    e18Var11.e0();
                    if (e18Var11.S) {
                        e18Var11.k(re4Var);
                    } else {
                        e18Var11.n0();
                    }
                    d4c.i0(e18Var11, z80Var, cxeVarA2);
                    d4c.i0(e18Var11, z80Var2, hycVarL2);
                    ij0.t(iHashCode2, e18Var11, z80Var3, e18Var11, bxVar);
                    d4c.i0(e18Var11, z80Var4, iqbVarE2);
                    cv8.b(a.a(ud0.C0, e18Var11), null, b.o(fqbVar, csg.A(20, e18Var11)), gm3.a(e18Var11).N, e18Var11, 56, 0);
                    kxk.g(e18Var11, b.t(fqbVar, 12.0f));
                    tjh.b(d4c.j0(R.string.chat_response_incomplete, e18Var11), null, gm3.a(e18Var11).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var11).e.E).g, e18Var11, 0, 0, 131066);
                    e18Var11.p(true);
                    kxk.g(e18Var11, b.t(fqbVar, 12.0f));
                    dtj.a(d4c.j0(R.string.generic_retry, e18Var11), null, false, null, f12.a, y02.a, gm3.a(e18Var11).o, this.F, e18Var11, 221184, 14);
                    e18Var11.p(true);
                }
                break;
            case 11:
                ld4 ld4Var12 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    e18Var12.T();
                } else {
                    lnk.d(this.F, null, false, null, null, null, null, nrk.a, e18Var12, 805306368, 510);
                }
                break;
            case 12:
                ld4 ld4Var13 = (ld4) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    e18Var13.T();
                } else {
                    lnk.d(this.F, null, false, null, null, null, null, nrk.b, e18Var13, 805306368, 510);
                }
                break;
            case 13:
                ld4 ld4Var14 = (ld4) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                e18 e18Var14 = (e18) ld4Var14;
                if (!e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    e18Var14.T();
                } else {
                    lnk.d(this.F, null, false, null, null, null, null, nrk.d, e18Var14, 805306368, 510);
                }
                break;
            case 14:
                ld4 ld4Var15 = (ld4) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                e18 e18Var15 = (e18) ld4Var15;
                if (!e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    e18Var15.T();
                } else {
                    csg.j(this.F, null, false, null, null, null, null, trk.a, e18Var15, 805306368, 510);
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ld4 ld4Var16 = (ld4) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                e18 e18Var16 = (e18) ld4Var16;
                if (!e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    e18Var16.T();
                } else {
                    trk.a(0, 6, e18Var16, this.F, null, false);
                }
                break;
            case 16:
                ld4 ld4Var17 = (ld4) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                e18 e18Var17 = (e18) ld4Var17;
                if (!e18Var17.Q(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    e18Var17.T();
                } else {
                    csg.j(this.F, b.c(fqbVar, 1.0f), false, null, null, null, null, urk.a, e18Var17, 805306416, 508);
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ld4 ld4Var18 = (ld4) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                e18 e18Var18 = (e18) ld4Var18;
                if (!e18Var18.Q(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    e18Var18.T();
                } else {
                    dgj.b(this.F, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var18, 0, 14);
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ld4 ld4Var19 = (ld4) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                e18 e18Var19 = (e18) ld4Var19;
                if (!e18Var19.Q(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    e18Var19.T();
                } else {
                    l.c(zy7Var, null, e18Var19, 0);
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ld4 ld4Var20 = (ld4) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                e18 e18Var20 = (e18) ld4Var20;
                if (!e18Var20.Q(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    e18Var20.T();
                } else {
                    csg.j(this.F, null, false, null, null, null, null, ssk.a, e18Var20, 805306368, 510);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ld4 ld4Var21 = (ld4) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                e18 e18Var21 = (e18) ld4Var21;
                if (!e18Var21.Q(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    e18Var21.T();
                } else {
                    trk.a(0, 6, e18Var21, this.F, null, false);
                }
                break;
            case 21:
                ld4 ld4Var22 = (ld4) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                e18 e18Var22 = (e18) ld4Var22;
                if (!e18Var22.Q(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    e18Var22.T();
                } else {
                    trk.a(0, 6, e18Var22, this.F, null, false);
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ld4 ld4Var23 = (ld4) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                e18 e18Var23 = (e18) ld4Var23;
                if (!e18Var23.Q(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    e18Var23.T();
                } else {
                    trk.a(0, 6, e18Var23, this.F, null, false);
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ld4 ld4Var24 = (ld4) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                e18 e18Var24 = (e18) ld4Var24;
                if (!e18Var24.Q(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    e18Var24.T();
                } else {
                    csg.j(this.F, null, false, null, null, null, null, ysk.b, e18Var24, 805306368, 510);
                }
                break;
            case 24:
                ld4 ld4Var25 = (ld4) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                e18 e18Var25 = (e18) ld4Var25;
                if (!e18Var25.Q(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    e18Var25.T();
                } else {
                    dgj.b(this.F, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var25, 0, 14);
                }
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ld4 ld4Var26 = (ld4) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                e18 e18Var26 = (e18) ld4Var26;
                if (!e18Var26.Q(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    e18Var26.T();
                } else {
                    dgj.b(this.F, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var26, 0, 14);
                }
                break;
            case 26:
                ld4 ld4Var27 = (ld4) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                e18 e18Var27 = (e18) ld4Var27;
                if (!e18Var27.Q(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    e18Var27.T();
                } else {
                    oe5.a(0, 4, e18Var27, this.F, d4c.j0(R.string.research_stop_dialog_confirm, e18Var27), false);
                }
                break;
            case 27:
                ld4 ld4Var28 = (ld4) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                e18 e18Var28 = (e18) ld4Var28;
                if (!e18Var28.Q(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    e18Var28.T();
                } else {
                    trk.a(0, 2, e18Var28, this.F, d4c.j0(R.string.research_stop_dialog_cancel, e18Var28), false);
                }
                break;
            case 28:
                ((Integer) obj2).getClass();
                q.b(zy7Var, (ld4) obj, x44.p0(1));
                break;
            default:
                ld4 ld4Var29 = (ld4) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                e18 e18Var29 = (e18) ld4Var29;
                if (!e18Var29.Q(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    e18Var29.T();
                } else {
                    csg.j(this.F, null, false, null, null, null, null, kvk.a, e18Var29, 805306368, 510);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ sxa(zy7 zy7Var) {
        this.E = 9;
        this.F = zy7Var;
    }

    public /* synthetic */ sxa(zy7 zy7Var, int i, byte b) {
        this.E = i;
        this.F = zy7Var;
    }
}
