package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.api.tasks.ApproveTaskAgentOverrides;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.api.tasks.TaskStatus;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.tasks.ui.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ufe implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ ufe(s2g s2gVar, bz7 bz7Var, int i) {
        this.E = 6;
        this.G = s2gVar;
        this.F = bz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj3 = this.G;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                bz7 bz7Var = (bz7) obj4;
                nwb nwbVar = (nwb) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean zF = e18Var.f(bz7Var);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new bi(bz7Var, nwbVar, 4);
                        e18Var.k0(objN);
                    }
                    csg.j((zy7) objN, null, bsg.k1((String) nwbVar.getValue()).toString().length() > 0, null, null, null, null, ysk.a, e18Var, 805306368, 506);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                pte.a((ote) obj4, (ta4) obj3, (ld4) obj, x44.p0(385));
                break;
            case 2:
                aae aaeVar = (aae) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                float f = aaeVar.E;
                aaeVar.E = ((h9f) obj3).b(fFloatValue - f) + f;
                break;
            case 3:
                ((Integer) obj2).getClass();
                npf.b((zb0) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                xzk.n((l29) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 5:
                eli eliVar = (eli) obj4;
                nwb nwbVar2 = (nwb) obj3;
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str != null && URLUtil.isValidUrl(str)) {
                    if (!x44.r(bool, Boolean.FALSE)) {
                        eliVar.a(str);
                    } else {
                        nwbVar2.setValue(str);
                    }
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                etj.j((s2g) obj3, (bz7) obj4, (ld4) obj, x44.p0(1));
                break;
            case 7:
                zy7 zy7Var = (zy7) obj4;
                ta4 ta4Var = (ta4) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    nai.a(0, 1, e18Var2, zy7Var, false);
                    ta4Var.invoke(e18Var2, 0);
                }
                break;
            case 8:
                bz7 bz7Var2 = (bz7) obj4;
                t3h t3hVar = (t3h) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    dw1.a((iqb) bz7Var2.invoke(t3hVar), e18Var3, 0);
                }
                break;
            case 9:
                iqb iqbVar = (iqb) obj4;
                c3d c3dVar = (c3d) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    dw1.a(b.e(iqbVar, ((cz5) e18Var4.j(ve4.h)).c0(c3dVar.F)), e18Var4, 0);
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                qvj.b((l9g) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 11:
                sbg sbgVar = (sbg) obj4;
                String str2 = (String) obj3;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    boolean zF2 = e18Var5.f(sbgVar);
                    Object objN2 = e18Var5.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new fb4(sbgVar, 2);
                        e18Var5.k0(objN2);
                    }
                    ez1.e((zy7) objN2, null, false, null, null, fd9.q0(1306131274, new ngf(str2, 7), e18Var5), e18Var5, 1572864, 62);
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                tik.b((k4d) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 13:
                o0h o0hVar = (o0h) obj4;
                ta4 ta4Var2 = (ta4) obj3;
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                } else {
                    boolean zF3 = e18Var6.f(o0hVar);
                    Object objN3 = e18Var6.N();
                    if (zF3 || objN3 == lz1Var) {
                        objN3 = new d6d(22, o0hVar);
                        e18Var6.k0(objN3);
                    }
                    iqb iqbVarB = sf5.e((bz7) objN3).B(new wx(o0hVar.a, ukc.F, true, null, null, null));
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var6.T);
                    hyc hycVarL = e18Var6.l();
                    iqb iqbVarE = kxk.E(e18Var6, iqbVarB);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var6.e0();
                    if (e18Var6.S) {
                        e18Var6.k(re4Var);
                    } else {
                        e18Var6.n0();
                    }
                    d4c.i0(e18Var6, cd4.f, o5bVarD);
                    d4c.i0(e18Var6, cd4.e, hycVarL);
                    d4c.i0(e18Var6, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var6, cd4.h);
                    d4c.i0(e18Var6, cd4.d, iqbVarE);
                    vb7.y(0, ta4Var2, e18Var6, true);
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                p5h.e((TaskResponse) obj4, (z7h) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                List list = (List) obj4;
                nwb nwbVar3 = (nwb) obj3;
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    ApproveTaskAgentOverrides approveTaskAgentOverrides = (ApproveTaskAgentOverrides) nwbVar3.getValue();
                    Object objN4 = e18Var7.N();
                    if (objN4 == lz1Var) {
                        objN4 = new shf(6, nwbVar3);
                        e18Var7.k0(objN4);
                    }
                    v6h.b(approveTaskAgentOverrides, (bz7) objN4, list, null, e18Var7, 48, 8);
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                ikk.f((TaskStatus) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).getClass();
                w8h.a((b9h) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ty5 ty5Var = (ty5) obj4;
                nwb nwbVar4 = (nwb) obj3;
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e18Var8.T();
                } else {
                    tqh tqhVar = tqh.T;
                    ud0 ud0Var = ud0.C1;
                    String strJ0 = d4c.j0(R.string.task_detail_delete_button, e18Var8);
                    k4g k4gVar = k4g.a;
                    wu8 wu8VarG = vz8.G(gm3.a(e18Var8).o, gm3.a(e18Var8).y, 0L, e18Var8, 12);
                    boolean z = !ty5Var.D();
                    boolean zF4 = e18Var8.f(nwbVar4);
                    Object objN5 = e18Var8.N();
                    if (zF4 || objN5 == lz1Var) {
                        objN5 = new lxf(20, nwbVar4);
                        e18Var8.k0(objN5);
                    }
                    tqhVar.y(ud0Var, strJ0, wu8VarG, z, (zy7) objN5, e18Var8, 196608, 0);
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                t4g t4gVar = (t4g) obj4;
                TaskResponse taskResponse = (TaskResponse) obj3;
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    e18Var9.T();
                } else {
                    boolean zH = e18Var9.h(t4gVar) | e18Var9.f(taskResponse);
                    Object objN6 = e18Var9.N();
                    if (zH || objN6 == lz1Var) {
                        objN6 = new q9h(t4gVar, taskResponse, 0);
                        e18Var9.k0(objN6);
                    }
                    q.b((zy7) objN6, e18Var9, 0);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                g77 g77Var = (g77) obj4;
                ml3 ml3Var = (ml3) obj3;
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e18Var10.T();
                } else {
                    cok.f(cvk.a, g77Var, null, null, fd9.q0(1724052655, new gl(ml3Var, 13), e18Var10), null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var10, 24582, 236);
                }
                break;
            case 21:
                mnc mncVar = (mnc) obj4;
                rz7 rz7Var = (rz7) obj3;
                ld4 ld4Var11 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    e18Var11.T();
                } else {
                    iqb iqbVarI = gb9.I(fqb.E, mncVar);
                    cxe cxeVarA = axe.a(ko0.e, lja.Q, e18Var11, 54);
                    int iHashCode2 = Long.hashCode(e18Var11.T);
                    hyc hycVarL2 = e18Var11.l();
                    iqb iqbVarE2 = kxk.E(e18Var11, iqbVarI);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var11.e0();
                    if (e18Var11.S) {
                        e18Var11.k(re4Var2);
                    } else {
                        e18Var11.n0();
                    }
                    d4c.i0(e18Var11, cd4.f, cxeVarA);
                    d4c.i0(e18Var11, cd4.e, hycVarL2);
                    d4c.i0(e18Var11, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var11, cd4.h);
                    d4c.i0(e18Var11, cd4.d, iqbVarE2);
                    rz7Var.invoke(fxe.a, e18Var11, 6);
                    e18Var11.p(true);
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                ((c0l) obj4).d((Drawable) obj3, (ld4) obj, x44.p0(49));
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                rz7 rz7Var2 = (rz7) obj4;
                mgh mghVar = (mgh) obj3;
                ld4 ld4Var12 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    e18Var12.T();
                } else {
                    rz7Var2.invoke(mghVar, e18Var12, 6);
                }
                break;
            case 24:
                zhh zhhVar = (zhh) obj4;
                l45 l45Var = (l45) obj3;
                ydh ydhVar = (ydh) obj;
                Context context = (Context) obj2;
                boolean zP = zhhVar.p();
                zb0 zb0VarS = zhhVar.s();
                kkh kkhVar = null;
                String str3 = zb0VarS != null ? zb0VarS.F : null;
                kkh kkhVar2 = zhhVar.x;
                if (kkhVar2 != null) {
                    long j = kkhVar2.a;
                    occ occVar = zhhVar.b;
                    kkhVar = new kkh(mwa.m(occVar.D((int) (j >> 32)), occVar.D((int) (j & 4294967295L))));
                }
                q5d.a(ydhVar, context, zP, str3, kkhVar, zhhVar.j, new f2d(zhhVar, l45Var, context, 21));
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                sih sihVar = (sih) obj4;
                Context context2 = (Context) obj2;
                boolean zR = sihVar.r();
                i5i i5iVar = sihVar.a;
                q5d.a((ydh) obj, context2, zR, i5iVar.d().G, new kkh(i5iVar.d().H), sihVar.g, new f2d(sihVar, (l45) obj3, context2, 24));
                break;
            case 26:
                ((Integer) obj2).getClass();
                urk.a((ParsedContentBlock$Thinking) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 27:
                crh crhVar = (crh) obj4;
                lvh lvhVar = (lvh) obj3;
                ld4 ld4Var13 = (ld4) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    e18Var13.T();
                } else {
                    boolean zH2 = e18Var13.h(crhVar) | e18Var13.h(lvhVar);
                    Object objN7 = e18Var13.N();
                    if (zH2 || objN7 == lz1Var) {
                        objN7 = new ytf(crhVar, 19, lvhVar);
                        e18Var13.k0(objN7);
                    }
                    lnk.d((zy7) objN7, null, false, null, null, null, null, xb5.b, e18Var13, 805306368, 510);
                }
                break;
            case 28:
                ((Integer) obj2).getClass();
                htk.d((ToolDisplayContent) obj4, (iqb) obj3, (ld4) obj, x44.p0(49));
                break;
            default:
                ArrayList arrayList = (ArrayList) obj4;
                i iVar = (i) obj3;
                ld4 ld4Var14 = (ld4) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                e18 e18Var14 = (e18) ld4Var14;
                if (!e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    e18Var14.T();
                } else {
                    jl3 jl3VarA = gm3.a(e18Var14);
                    wk wkVar = (wk) gm3.c(e18Var14).e.F;
                    int iMax = Math.max(arrayList.size() - 2, 0);
                    int size = arrayList.size();
                    while (iMax < size) {
                        e18Var14.X(-1053776242, Integer.valueOf(iMax));
                        wd6.M(iMax == arrayList.size() - 1, null, null, null, null, fd9.q0(-313347879, new h9a((rvh) arrayList.get(iMax), wkVar, jl3VarA, iVar, 13), e18Var14), e18Var14, 196608, 30);
                        e18Var14.p(false);
                        iMax++;
                    }
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ufe(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    public /* synthetic */ ufe(Object obj, Object obj2, int i, int i2) {
        this.E = i2;
        this.F = obj;
        this.G = obj2;
    }
}
