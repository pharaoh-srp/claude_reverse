package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Loading;
import coil3.compose.AsyncImagePainter$State$Success;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.design.icon.a;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ic4 implements rz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ ic4(int i) {
        this.E = i;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        bpc bpcVarD;
        int i;
        int i2;
        cpc cpcVar;
        long jO;
        int i3 = this.E;
        lz1 lz1Var = jd4.a;
        int i4 = 18;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        switch (i3) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    xo1 xo1Var = lja.K;
                    iqb iqbVarL = gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
                    o5b o5bVarD = dw1.d(xo1Var, false);
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
                    d4c.i0(e18Var, cd4.f, o5bVarD);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    ez1.a(null, vf2.H, 0L, e18Var, 48, 5);
                    e18Var.p(true);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    kxk.g(e18Var2, b.e(fqbVar, 20.0f));
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 2:
                px9 px9Var = (px9) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                px9Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(px9Var) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    xo1 xo1Var2 = lja.K;
                    iqb iqbVarA = px9.a(px9Var, b.g(b.c(fqbVar, 1.0f), 120.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), null, null, 2);
                    o5b o5bVarD2 = dw1.d(xo1Var2, false);
                    int iHashCode2 = Long.hashCode(e18Var3.T);
                    hyc hycVarL2 = e18Var3.l();
                    iqb iqbVarE2 = kxk.E(e18Var3, iqbVarA);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var2);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, o5bVarD2);
                    d4c.i0(e18Var3, cd4.e, hycVarL2);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE2);
                    ez1.a(null, vf2.I, 0L, e18Var3, 48, 5);
                    e18Var3.p(true);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 3:
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.timer_creator_see_timers, e18Var4), null, 0L, 0L, null, dv7.M, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 1572864, 0, 262078);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 4:
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.ccr_tool_inputs, e18Var5), null, gm3.a(e18Var5).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).j, e18Var5, 0, 0, 131066);
                    kxk.g(e18Var5, b.e(fqbVar, 8.0f));
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 5:
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    kxk.g(e18Var6, b.e(fqbVar, 8.0f));
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case 6:
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.ccr_tool_output, e18Var7), null, gm3.a(e18Var7).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var7).e.E).j, e18Var7, 0, 0, 131066);
                    kxk.g(e18Var7, b.e(fqbVar, 8.0f));
                } else {
                    e18Var7.T();
                }
                return ieiVar;
            case 7:
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    tjh.b(d4c.j0(android.R.string.ok, e18Var8), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var8).e.E).h, e18Var8, 0, 0, 131070);
                } else {
                    e18Var8.T();
                }
                return ieiVar;
            case 8:
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var9 = (e18) ld4Var9;
                if (e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    prk.k(d4c.j0(R.string.permission_upsell_open_settings, e18Var9), null, null, a.a(ud0.l, e18Var9), dv8.F, 0L, 4.0f, 0L, 0, 0, e18Var9, 1601536, 1958);
                } else {
                    e18Var9.T();
                }
                return ieiVar;
            case 9:
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var10 = (e18) ld4Var10;
                if (e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.trusted_device_manage_button, e18Var10), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var10, 0, 0, 262142);
                } else {
                    e18Var10.T();
                }
                return ieiVar;
            case 10:
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var11 = (e18) ld4Var11;
                if (e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.trusted_device_cancel, e18Var11), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var11, 0, 0, 262142);
                } else {
                    e18Var11.T();
                }
                return ieiVar;
            case 11:
                ld4 ld4Var12 = (ld4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var12 = (e18) ld4Var12;
                if (e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.trusted_device_sign_in_button, e18Var12), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var12, 0, 0, 262142);
                } else {
                    e18Var12.T();
                }
                return ieiVar;
            case 12:
                ld4 ld4Var13 = (ld4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var13 = (e18) ld4Var13;
                if (e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.trusted_device_not_now, e18Var13), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var13, 0, 0, 262142);
                } else {
                    e18Var13.T();
                }
                return ieiVar;
            case 13:
                ld4 ld4Var14 = (ld4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((mnc) obj).getClass();
                e18 e18Var14 = (e18) ld4Var14;
                if (e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    qnc qncVar = qf2.a;
                    kxk.g(e18Var14, b.e(fqbVar, 12.0f));
                } else {
                    e18Var14.T();
                }
                return ieiVar;
            case 14:
                ld4 ld4Var15 = (ld4) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var15 = (e18) ld4Var15;
                if (e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.voice_microphone_off, e18Var15), b.c(fqbVar, 1.0f), gm3.a(e18Var15).z, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var15).e.E).i, e18Var15, 48, 0, 130040);
                } else {
                    e18Var15.T();
                }
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ld4 ld4Var16 = (ld4) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var16 = (e18) ld4Var16;
                if (e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    tjh.b(d4c.j0(R.string.generic_button_okay, e18Var16), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var16, 0, 0, 262142);
                } else {
                    e18Var16.T();
                }
                return ieiVar;
            case 16:
                McpServer mcpServer = (McpServer) obj;
                ((Integer) obj3).intValue();
                mcpServer.getClass();
                e18 e18Var17 = (e18) ((ld4) obj2);
                e18Var17.a0(-1460564609);
                String name = mcpServer.getName();
                e18Var17.p(false);
                return name;
            case g.MAX_FIELD_NUMBER /* 17 */:
                McpServer mcpServer2 = (McpServer) obj;
                ((Integer) obj3).getClass();
                mcpServer2.getClass();
                e18 e18Var18 = (e18) ((ld4) obj2);
                e18Var18.a0(769906289);
                String strK0 = d4c.k0(R.string.chat_options_add_from_connector, new Object[]{mcpServer2.getName()}, e18Var18);
                e18Var18.p(false);
                return strK0;
            case g.AVG_FIELD_NUMBER /* 18 */:
                q5b q5bVar = (q5b) obj;
                h5b h5bVar = (h5b) obj2;
                q5bVar.getClass();
                h5bVar.getClass();
                c3d c3dVarU = h5bVar.u(((rl4) obj3).a);
                return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new qy4(i4));
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                dk0 dk0Var = (dk0) obj;
                ((Integer) obj3).getClass();
                dk0Var.getClass();
                e18 e18Var19 = (e18) ((ld4) obj2);
                e18Var19.a0(-1798868859);
                int iOrdinal = dk0Var.ordinal();
                if (iOrdinal == 0) {
                    e18Var19.a0(400735121);
                    bpcVarD = u00.D(R.drawable.logo_anthropic, 0, e18Var19);
                    e18Var19.p(false);
                } else {
                    if (iOrdinal != 1) {
                        throw ebh.u(e18Var19, 400733539, false);
                    }
                    e18Var19.a0(400738249);
                    bpcVarD = a.a(ud0.W0, e18Var19);
                    e18Var19.p(false);
                }
                e18Var19.p(false);
                return bpcVarD;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                dk0 dk0Var2 = (dk0) obj;
                ((Integer) obj3).getClass();
                dk0Var2.getClass();
                e18 e18Var20 = (e18) ((ld4) obj2);
                e18Var20.a0(122503962);
                int iOrdinal2 = dk0Var2.ordinal();
                if (iOrdinal2 == 0) {
                    i = 1660736957;
                    i2 = R.string.font_style_setting_default;
                } else {
                    if (iOrdinal2 != 1) {
                        throw ebh.u(e18Var20, 1660735400, false);
                    }
                    i = 1660739676;
                    i2 = R.string.font_style_setting_system;
                }
                String strN = vb7.n(e18Var20, i, i2, e18Var20, false);
                e18Var20.p(false);
                return strN;
            case 21:
                ((Throwable) obj).getClass();
                ((c45) obj3).getClass();
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                iqb iqbVar = (iqb) obj;
                ((Integer) obj3).getClass();
                iqbVar.getClass();
                e18 e18Var21 = (e18) ((ld4) obj2);
                e18Var21.a0(-2110574184);
                iqb iqbVarV = xn5.V(iqbVar, gm3.b(e18Var21).h);
                e18Var21.p(false);
                return iqbVarV;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                h29 h29Var = (h29) obj;
                ((Integer) obj3).getClass();
                h29Var.getClass();
                e18 e18Var22 = (e18) ((ld4) obj2);
                e18Var22.a0(-1998730632);
                Object objN = e18Var22.N();
                if (objN == lz1Var) {
                    int iOrdinal3 = h29Var.ordinal();
                    if (iOrdinal3 == 0) {
                        cpcVar = new cpc(new d54(d4c.o(4290304767L)), new d54(d4c.o(4291618303L)));
                    } else if (iOrdinal3 == 1) {
                        cpcVar = new cpc(new d54(d4c.o(4292270299L)), new d54(d4c.o(4293059557L)));
                    } else if (iOrdinal3 == 2) {
                        cpcVar = new cpc(new d54(d4c.o(4291028683L)), new d54(d4c.o(4292144602L)));
                    } else if (iOrdinal3 == 3) {
                        cpcVar = new cpc(new d54(d4c.o(4294297291L)), new d54(d4c.o(4294498266L)));
                    } else {
                        if (iOrdinal3 != 4) {
                            wg6.i();
                            return null;
                        }
                        cpcVar = new cpc(new d54(d4c.o(4294962874L)), new d54(d4c.o(4294964173L)));
                    }
                    objN = yfd.p(ez1.t(fqbVar, 1.0f, ((d54) cpcVar.E).a, xve.b(4.0f)), ((d54) cpcVar.F).a, xve.b(4.0f));
                    e18Var22.k0(objN);
                }
                iqb iqbVar2 = (iqb) objN;
                e18Var22.p(false);
                return iqbVar2;
            case 24:
                h29 h29Var2 = (h29) obj;
                ((Integer) obj3).getClass();
                h29Var2.getClass();
                e18 e18Var23 = (e18) ((ld4) obj2);
                e18Var23.a0(818489191);
                Object objN2 = e18Var23.N();
                if (objN2 == lz1Var) {
                    int iOrdinal4 = h29Var2.ordinal();
                    if (iOrdinal4 == 0) {
                        jO = d4c.o(4278206597L);
                    } else if (iOrdinal4 == 1) {
                        jO = d4c.o(4281875777L);
                    } else if (iOrdinal4 == 2) {
                        jO = d4c.o(4279588644L);
                    } else if (iOrdinal4 == 3) {
                        jO = d4c.o(4285668388L);
                    } else {
                        if (iOrdinal4 != 4) {
                            wg6.i();
                            return null;
                        }
                        jO = d4c.o(4286931972L);
                    }
                    objN2 = new tkh(jO, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, 16777214);
                    e18Var23.k0(objN2);
                }
                tkh tkhVar = (tkh) objN2;
                e18Var23.p(false);
                return tkhVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                McpServer mcpServer3 = (McpServer) obj;
                ((Integer) obj3).intValue();
                mcpServer3.getClass();
                e18 e18Var24 = (e18) ((ld4) obj2);
                e18Var24.a0(-1704208897);
                String name2 = mcpServer3.getName();
                e18Var24.p(false);
                return name2;
            case 26:
                ((Integer) obj).intValue();
                ((Integer) obj3).intValue();
                e18 e18Var25 = (e18) ((ld4) obj2);
                e18Var25.a0(-1965511827);
                e18Var25.p(false);
                return null;
            case 27:
                ld4 ld4Var17 = (ld4) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var26 = (e18) ld4Var17;
                if (e18Var26.Q(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    String strJ0 = d4c.j0(R.string.ccr_select_repository, e18Var26);
                    tkh tkhVar2 = ((jm3) gm3.c(e18Var26).e.E).g;
                    e18Var26.a0(2089760140);
                    long j = gm3.a(e18Var26).N;
                    e18Var26.p(false);
                    tjh.b(strJ0, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar2, e18Var26, 0, 0, 131066);
                } else {
                    e18Var26.T();
                }
                return ieiVar;
            default:
                h5e h5eVar = (h5e) obj;
                ld4 ld4Var18 = (ld4) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= ((e18) ld4Var18).f(h5eVar) ? 4 : 2;
                }
                e18 e18Var27 = (e18) ld4Var18;
                if (e18Var27.Q(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    t01 t01Var = (t01) mpk.u(h5eVar.b.Y, e18Var27).getValue();
                    if (t01Var instanceof AsyncImagePainter$State$Loading) {
                        e18Var27.a0(1576397282);
                        vkc.a.i(h5eVar, t01Var, e18Var27, Integer.valueOf(iIntValue18 & 14));
                        e18Var27.p(false);
                    } else {
                        if (t01Var instanceof AsyncImagePainter$State$Success) {
                            e18Var27.a0(1623788917);
                            e18Var27.p(false);
                        } else if (t01Var instanceof AsyncImagePainter$State$Error) {
                            e18Var27.a0(1576403106);
                            vkc.b.i(h5eVar, t01Var, e18Var27, Integer.valueOf(iIntValue18 & 14));
                            e18Var27.p(false);
                        } else if (!(t01Var instanceof r01)) {
                            wg6.i();
                            return null;
                        }
                        e18Var27.a0(1576407562);
                        sik.b(h5eVar, null, null, null, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, false, e18Var27, iIntValue18 & 14);
                        e18Var27.p(false);
                    }
                    e18Var27.a0(1624022037);
                    e18Var27.p(false);
                } else {
                    e18Var27.T();
                }
                return ieiVar;
        }
    }
}
