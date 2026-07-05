package defpackage;

import androidx.compose.foundation.layout.b;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Loading;
import coil3.compose.AsyncImagePainter$State$Success;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.RichItem;
import com.anthropic.claude.api.chat.tool.RichLinkDisplayContent;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.sessions.types.GitHubRepo;
import com.anthropic.claude.sessions.types.PermissionMode;
import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;
import com.anthropic.claude.tasks.ui.n;
import com.anthropic.claude.tool.model.KnowledgeSource;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h9a implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ h9a(AsyncImagePainter asyncImagePainter, cz5 cz5Var, e0g e0gVar, String str) {
        this.E = 8;
        this.F = asyncImagePainter;
        this.G = cz5Var;
        this.I = e0gVar;
        this.H = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v49 */
    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r0;
        iei ieiVar;
        String name;
        int i = this.E;
        int i2 = 5;
        fqb fqbVar = fqb.E;
        int i3 = 18;
        lz1 lz1Var = jd4.a;
        iei ieiVar2 = iei.a;
        Object obj4 = this.I;
        Object obj5 = this.H;
        Object obj6 = this.G;
        Object obj7 = this.F;
        int i4 = 1;
        switch (i) {
            case 0:
                zy7 zy7Var = (zy7) obj7;
                bpc bpcVar = (bpc) obj6;
                String str = (String) obj5;
                x0a x0aVar = (x0a) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e0g e0gVar = gm3.b(e18Var).p;
                    long j = gm3.a(e18Var).M;
                    long j2 = gm3.a(e18Var).n;
                    iqb iqbVarE = b.e(fqbVar, 44.0f);
                    Object objN = e18Var.N();
                    if (objN == lz1Var) {
                        objN = new e69(15);
                        e18Var.k0(objN);
                    }
                    zmk.c(zy7Var, tjf.b(iqbVarE, false, (bz7) objN), e0gVar, j, j2, null, fd9.q0(-455052530, new ra7(bpcVar, str, x0aVar, 10), e18Var), e18Var, 12582912, 96);
                } else {
                    e18Var.T();
                }
                return ieiVar2;
            case 1:
                vza vzaVar = (vza) obj7;
                rz7 rz7Var = (rz7) obj6;
                fj0 fj0Var = (fj0) obj5;
                vya vyaVar = (vya) obj4;
                String str2 = (String) obj;
                Integer num = (Integer) obj2;
                String str3 = (String) obj3;
                str2.getClass();
                str3.getClass();
                if (str2.equals("WebViewError") || str2.equals("WebViewHttpError")) {
                    vzaVar.a.post(new yw5(fj0Var, 10, vyaVar));
                }
                if (rz7Var != null) {
                    rz7Var.invoke(str2, num, str3);
                }
                return ieiVar2;
            case 2:
                String str4 = (String) obj5;
                bz7 bz7Var = (bz7) obj7;
                bt7 bt7Var = (bt7) obj6;
                nwb nwbVar = (nwb) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String str5 = (String) nwbVar.getValue();
                    e0g e0gVar2 = gm3.b(e18Var2).u;
                    mp9 mp9Var = new mp9(2, 0, 7, 118);
                    boolean zF = e18Var2.f(str4) | e18Var2.f(bz7Var);
                    Object objN2 = e18Var2.N();
                    if (zF || objN2 == lz1Var) {
                        objN2 = new b4b(str4, bz7Var);
                        e18Var2.k0(objN2);
                    }
                    kp9 kp9Var = new kp9((bz7) objN2, null, 62);
                    iqb iqbVarS = iv1.s(gb9.L(b.c(fqbVar, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), bt7Var);
                    boolean zF2 = e18Var2.f(nwbVar);
                    Object objN3 = e18Var2.N();
                    if (zF2 || objN3 == lz1Var) {
                        objN3 = new ol5(23, nwbVar);
                        e18Var2.k0(objN3);
                    }
                    kxk.d(str5, (bz7) objN3, iqbVarS, false, false, null, null, aqk.a, null, null, null, false, null, mp9Var, kp9Var, true, 0, 0, e0gVar2, null, e18Var2, 12582912, 12779520, 0, 6061944);
                } else {
                    e18Var2.T();
                }
                return ieiVar2;
            case 3:
                u3c u3cVar = (u3c) obj7;
                r4g r4gVar = (r4g) obj6;
                wlg wlgVar = (wlg) obj5;
                nwb nwbVar2 = (nwb) obj4;
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    PermissionMode permissionModeC = u3cVar.c();
                    s71 s71Var = (s71) wlgVar.getValue();
                    boolean zF3 = e18Var3.f(u3cVar) | e18Var3.h(r4gVar);
                    Object objN4 = e18Var3.N();
                    if (zF3 || objN4 == lz1Var) {
                        objN4 = new i3c(u3cVar, r4gVar, i4);
                        e18Var3.k0(objN4);
                    }
                    bz7 bz7Var2 = (bz7) objN4;
                    Object objN5 = e18Var3.N();
                    if (objN5 == lz1Var) {
                        objN5 = new d29(29, nwbVar2);
                        e18Var3.k0(objN5);
                    }
                    etj.g(permissionModeC, s71Var, bz7Var2, (zy7) objN5, i4gVar, e18Var3, ((iIntValue3 << 12) & 57344) | 3072);
                } else {
                    e18Var3.T();
                }
                return ieiVar2;
            case 4:
                dyc dycVar = (dyc) obj6;
                zy7 zy7Var2 = (zy7) obj7;
                zy7 zy7Var3 = (zy7) obj5;
                zy7 zy7Var4 = (zy7) obj4;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    wz5 wz5Var = dycVar.g;
                    wz5 wz5Var2 = dycVar.h;
                    wz5 wz5Var3 = dycVar.i;
                    if (((vxc) wz5Var.getValue()).g) {
                        e18Var4.a0(-1027629603);
                        bpc bpcVarA = a.a(ud0.G0, e18Var4);
                        vxc vxcVar = (vxc) dycVar.g.getValue();
                        boolean zH = e18Var4.h(dycVar);
                        Object objN6 = e18Var4.N();
                        if (zH || objN6 == lz1Var) {
                            objN6 = new mx5(0, dycVar, dyc.class, "openSystemAppSettings", "openSystemAppSettings()V", 0, 16);
                            e18Var4.k0(objN6);
                        }
                        ntj.a(bpcVarA, vxcVar, zy7Var2, (zy7) ((jm9) objN6), b.c(fqbVar, 1.0f), e18Var4, 24584);
                        e18Var4.p(false);
                    } else {
                        e18Var4.a0(-1027196192);
                        e18Var4.p(false);
                    }
                    if (((vxc) wz5Var3.getValue()).g) {
                        e18Var4.a0(-1027128643);
                        bpc bpcVarA2 = a.a(ud0.z, e18Var4);
                        vxc vxcVar2 = (vxc) wz5Var3.getValue();
                        boolean zH2 = e18Var4.h(dycVar);
                        Object objN7 = e18Var4.N();
                        if (zH2 || objN7 == lz1Var) {
                            objN7 = new mx5(0, dycVar, dyc.class, "openSystemAppSettings", "openSystemAppSettings()V", 0, 17);
                            e18Var4.k0(objN7);
                        }
                        ntj.a(bpcVarA2, vxcVar2, zy7Var3, (zy7) ((jm9) objN7), b.c(fqbVar, 1.0f), e18Var4, 24584);
                        r0 = 0;
                        e18Var4.p(false);
                    } else {
                        r0 = 0;
                        e18Var4.a0(-1026695232);
                        e18Var4.p(false);
                    }
                    if (((vxc) wz5Var2.getValue()).g) {
                        e18Var4.a0(-1026629233);
                        bpc bpcVarD = u00.D(R.drawable.health_connect, r0, e18Var4);
                        vxc vxcVar3 = (vxc) wz5Var2.getValue();
                        boolean zH3 = e18Var4.h(dycVar);
                        Object objN8 = e18Var4.N();
                        if (zH3 || objN8 == lz1Var) {
                            objN8 = new mx5(0, dycVar, dyc.class, "openSystemAppSettings", "openSystemAppSettings()V", 0, 18);
                            e18Var4.k0(objN8);
                        }
                        ntj.a(bpcVarD, vxcVar3, zy7Var4, (zy7) ((jm9) objN8), b.c(fqbVar, 1.0f), e18Var4, 24584);
                        e18Var4.p(false);
                    } else {
                        e18Var4.a0(-1026182368);
                        e18Var4.p(r0);
                    }
                } else {
                    e18Var4.T();
                }
                return ieiVar2;
            case 5:
                List list = (List) obj7;
                gnd gndVar = (gnd) obj6;
                bz7 bz7Var3 = (bz7) obj5;
                nwb nwbVar3 = (nwb) obj4;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    e18Var5.T();
                    return ieiVar2;
                }
                int i5 = 0;
                for (Object obj8 : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        x44.n0();
                        throw null;
                    }
                    gnd gndVar2 = (gnd) obj8;
                    if (gndVar2 != gnd.I || i5 <= 0) {
                        ieiVar = ieiVar2;
                        e18Var5.a0(-763119531);
                        e18Var5.p(z);
                    } else {
                        e18Var5.a0(-763301718);
                        ieiVar = ieiVar2;
                        iuj.e(gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 1), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var5).v, e18Var5, 6, 2);
                        e18Var5.p(false);
                    }
                    boolean z = gndVar2 == gndVar;
                    boolean zF4 = e18Var5.f(bz7Var3) | e18Var5.d(gndVar2.ordinal()) | e18Var5.f(nwbVar3);
                    Object objN9 = e18Var5.N();
                    if (zF4 || objN9 == lz1Var) {
                        objN9 = new hya(bz7Var3, gndVar2, nwbVar3, 15);
                        e18Var5.k0(objN9);
                    }
                    kik.b(gndVar2, z, (zy7) objN9, null, e18Var5, 0);
                    i5 = i6;
                    ieiVar2 = ieiVar;
                    z = false;
                }
                return ieiVar2;
            case 6:
                vxc vxcVar4 = (vxc) obj7;
                bz7 bz7Var4 = (bz7) obj6;
                bz7 bz7Var5 = (bz7) obj5;
                bz7 bz7Var6 = (bz7) obj4;
                mnc mncVar = (mnc) obj;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((e18) ld4Var6).f(mncVar) ? 4 : 2;
                }
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    iqb iqbVarL = gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    ho0 ho0Var = new ho0(16.0f, true, new sz6(1));
                    boolean zH4 = e18Var6.h(vxcVar4) | e18Var6.f(bz7Var4) | e18Var6.f(bz7Var5) | e18Var6.f(bz7Var6);
                    Object objN10 = e18Var6.N();
                    if (zH4 || objN10 == lz1Var) {
                        wvc wvcVar = new wvc(vxcVar4, bz7Var6, bz7Var4, bz7Var5, 4);
                        e18Var6.k0(wvcVar);
                        objN10 = wvcVar;
                    }
                    knk.h(iqbVarL, null, mncVar, false, ho0Var, null, null, false, null, (bz7) objN10, e18Var6, ((iIntValue6 << 6) & 896) | 24582, 490);
                } else {
                    e18Var6.T();
                }
                return ieiVar2;
            case 7:
                String str6 = (String) obj5;
                String str7 = (String) obj7;
                String str8 = (String) obj6;
                String str9 = (String) obj4;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    ykk.b(str6, str7, str8, str9, e18Var7, 0);
                } else {
                    e18Var7.T();
                }
                return ieiVar2;
            case 8:
                AsyncImagePainter asyncImagePainter = (AsyncImagePainter) obj7;
                cz5 cz5Var = (cz5) obj6;
                e0g e0gVar3 = (e0g) obj4;
                String str10 = (String) obj5;
                qw1 qw1Var = (qw1) obj;
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                qw1Var.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((e18) ld4Var8).f(qw1Var) ? 4 : 2;
                }
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    nwb nwbVarU = mpk.u(asyncImagePainter.Y, e18Var8);
                    boolean zF5 = e18Var8.f(cz5Var);
                    Object objN11 = e18Var8.N();
                    if (zF5 || objN11 == lz1Var) {
                        objN11 = mpk.w(new hya(qw1Var, cz5Var, nwbVarU, i3));
                        e18Var8.k0(objN11);
                    }
                    knk.e((t01) nwbVarU.getValue(), null, null, "image crossfade", fd9.q0(-1996916456, new h9a(e0gVar3, asyncImagePainter, str10, (wlg) objN11, 9), e18Var8), e18Var8, 27648, 6);
                } else {
                    e18Var8.T();
                }
                return ieiVar2;
            case 9:
                e0g e0gVar4 = (e0g) obj7;
                AsyncImagePainter asyncImagePainter2 = (AsyncImagePainter) obj6;
                String str11 = (String) obj5;
                wlg wlgVar2 = (wlg) obj4;
                t01 t01Var = (t01) obj;
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                t01Var.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= (iIntValue9 & 8) == 0 ? ((e18) ld4Var9).f(t01Var) : ((e18) ld4Var9).h(t01Var) ? 4 : 2;
                }
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    e18Var9.T();
                } else if (t01Var instanceof AsyncImagePainter$State$Loading) {
                    e18Var9.a0(-546023451);
                    tlk.b((iqb) wlgVar2.getValue(), null, rsk.a, e18Var9, 384);
                    e18Var9.p(false);
                } else if (t01Var instanceof AsyncImagePainter$State$Error) {
                    e18Var9.a0(-545673833);
                    tlk.b((iqb) wlgVar2.getValue(), null, rsk.b, e18Var9, 384);
                    e18Var9.p(false);
                } else if (t01Var instanceof r01) {
                    e18Var9.a0(-545168936);
                    tlk.b((iqb) wlgVar2.getValue(), null, rsk.c, e18Var9, 384);
                    e18Var9.p(false);
                } else {
                    if (!(t01Var instanceof AsyncImagePainter$State$Success)) {
                        throw ebh.u(e18Var9, 813669214, false);
                    }
                    e18Var9.a0(-545004915);
                    xn5.N(asyncImagePainter2, str11, xn5.V((iqb) wlgVar2.getValue(), e0gVar4), null, ho4.d, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var9, 0, 104);
                    e18Var9.p(false);
                }
                return ieiVar2;
            case 10:
                List list2 = (List) obj7;
                nwb nwbVar4 = (nwb) obj6;
                wlg wlgVar3 = (wlg) obj5;
                wlg wlgVar4 = (wlg) obj4;
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var10 = (e18) ld4Var10;
                if (e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    int size = ((List) wlgVar3.getValue()).size();
                    int size2 = list2.size();
                    List list3 = (List) wlgVar4.getValue();
                    Set set = (Set) nwbVar4.getValue();
                    boolean zF6 = e18Var10.f(nwbVar4);
                    Object objN12 = e18Var10.N();
                    if (zF6 || objN12 == lz1Var) {
                        objN12 = new shf(i2, nwbVar4);
                        e18Var10.k0(objN12);
                    }
                    p5h.b(size, size2, list3, set, (bz7) objN12, e18Var10, 0);
                } else {
                    e18Var10.T();
                }
                return ieiVar2;
            case 11:
                String str12 = (String) obj5;
                bz7 bz7Var7 = (bz7) obj7;
                List<String> list4 = (List) obj6;
                nwb nwbVar5 = (nwb) obj4;
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var11 = (e18) ld4Var11;
                if (e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    boolean zF7 = e18Var11.f(bz7Var7);
                    Object objN13 = e18Var11.N();
                    if (zF7 || objN13 == lz1Var) {
                        objN13 = new bi(bz7Var7, nwbVar5, i2);
                        e18Var11.k0(objN13);
                    }
                    uuj.a(str12, null, (zy7) objN13, null, null, false, null, null, null, null, 0, 0, e18Var11, 48, 4088);
                    for (String str13 : list4) {
                        boolean zF8 = e18Var11.f(bz7Var7) | e18Var11.f(str13);
                        Object objN14 = e18Var11.N();
                        if (zF8 || objN14 == lz1Var) {
                            objN14 = new ix4(bz7Var7, str13, nwbVar5, 2);
                            e18Var11.k0(objN14);
                        }
                        uuj.a(str13, null, (zy7) objN14, null, null, false, null, null, null, null, 0, 0, e18Var11, 48, 4088);
                    }
                } else {
                    e18Var11.T();
                }
                return ieiVar2;
            case 12:
                TaskResponse taskResponse = (TaskResponse) obj7;
                e8h e8hVar = (e8h) obj6;
                l5h l5hVar = (l5h) obj5;
                TasksBottomSheetDestination tasksBottomSheetDestination = (TasksBottomSheetDestination) obj4;
                i4g i4gVar2 = (i4g) obj;
                ld4 ld4Var12 = (ld4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                i4gVar2.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= ((e18) ld4Var12).f(i4gVar2) ? 4 : 2;
                }
                e18 e18Var12 = (e18) ld4Var12;
                if (e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    boolean zH5 = e18Var12.h(l5hVar) | e18Var12.h(tasksBottomSheetDestination);
                    Object objN15 = e18Var12.N();
                    if (zH5 || objN15 == lz1Var) {
                        objN15 = new n(l5hVar, tasksBottomSheetDestination, null);
                        e18Var12.k0(objN15);
                    }
                    p5h.i(taskResponse, e8hVar, (pz7) objN15, ttj.m(fqbVar, i4gVar2), e18Var12, 0);
                } else {
                    e18Var12.T();
                }
                return ieiVar2;
            case 13:
                rvh rvhVar = (rvh) obj7;
                wk wkVar = (wk) obj6;
                jl3 jl3Var = (jl3) obj5;
                i iVar = (i) obj4;
                ld4 ld4Var13 = (ld4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var13 = (e18) ld4Var13;
                if (e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    String strC = bwh.c(rvhVar, e18Var13);
                    String strD = bwh.d(rvhVar);
                    boolean zF9 = bwh.f(rvhVar);
                    fqb fqbVar2 = fqb.E;
                    iqb iqbVarJ = gb9.J(b.c(fqbVar2, 1.0f), 8.0f);
                    cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var13, 48);
                    int iHashCode = Long.hashCode(e18Var13.T);
                    hyc hycVarL = e18Var13.l();
                    iqb iqbVarE2 = kxk.E(e18Var13, iqbVarJ);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var13.e0();
                    if (e18Var13.S) {
                        e18Var13.k(re4Var);
                    } else {
                        e18Var13.n0();
                    }
                    d4c.i0(e18Var13, cd4.f, cxeVarA);
                    d4c.i0(e18Var13, cd4.e, hycVarL);
                    d4c.i0(e18Var13, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var13, cd4.h);
                    d4c.i0(e18Var13, cd4.d, iqbVarE2);
                    tjh.b(strC, gb9.N(fqbVar2, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 11), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, tkh.b((tkh) wkVar.b, jl3Var.N, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), e18Var13, 48, 24576, 114684);
                    if (strD != null && zF9) {
                        e18Var13.a0(691516341);
                        long j3 = jl3Var.M;
                        long j4 = jl3Var.O;
                        GitHubRepo gitHubRepoZ0 = iVar.z0();
                        if (gitHubRepoZ0 == null || (name = gitHubRepoZ0.getName()) == null) {
                            name = "";
                        }
                        tlk.a(strD, j3, j4, name, e18Var13, 0);
                        e18Var13.p(false);
                    } else if (strD != null) {
                        e18Var13.a0(692013860);
                        tjh.b(strD, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkh.b((tkh) wkVar.i, jl3Var.O, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), e18Var13, 0, 24960, 110590);
                        e18Var13.p(false);
                    } else {
                        e18Var13.a0(692483045);
                        e18Var13.p(false);
                    }
                    e18Var13.p(true);
                } else {
                    e18Var13.T();
                }
                return ieiVar2;
            case 14:
                ToolDisplayContent toolDisplayContent = (ToolDisplayContent) obj7;
                mnc mncVar2 = (mnc) obj6;
                bz7 bz7Var8 = (bz7) obj5;
                bz7 bz7Var9 = (bz7) obj4;
                ld4 ld4Var14 = (ld4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var14 = (e18) ld4Var14;
                if (e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    wq9 wq9Var = KnowledgeSource.Companion;
                    RichItem link = ((RichLinkDisplayContent) toolDisplayContent).getLink();
                    wq9Var.getClass();
                    vtk.c(mncVar2, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-1389854169, new tfe(wq9.c(link, false), bz7Var8, bz7Var9, 20), e18Var14), e18Var14, 384, 2);
                } else {
                    e18Var14.T();
                }
                return ieiVar2;
            default:
                koc kocVar = (koc) obj7;
                List list5 = (List) obj6;
                pz7 pz7Var = (pz7) obj5;
                l45 l45Var = (l45) obj4;
                qw1 qw1Var2 = (qw1) obj;
                ld4 ld4Var15 = (ld4) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                qw1Var2.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= ((e18) ld4Var15).f(qw1Var2) ? 4 : 2;
                }
                e18 e18Var15 = (e18) ld4Var15;
                if (e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    va6 va6Var = new va6((qw1Var2.c() - 164.0f) / 2.0f);
                    va6 va6Var2 = new va6(MTTypesetterKt.kLineSkipLimitMultiplier);
                    if (va6Var.compareTo(va6Var2) < 0) {
                        va6Var = va6Var2;
                    }
                    tnc tncVar = new tnc();
                    float f = b5j.b;
                    float f2 = va6Var.E;
                    wwk.c(16.0f, 1, 221232, 16320, null, null, fd9.q0(671000240, new kw(list5, kocVar, pz7Var, l45Var), e18Var15), e18Var15, b.c, null, new qnc(f2, f, f2, f), tncVar, kocVar, null, null, false);
                } else {
                    e18Var15.T();
                }
                return ieiVar2;
        }
    }

    public /* synthetic */ h9a(dyc dycVar, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3) {
        this.E = 4;
        this.G = dycVar;
        this.F = zy7Var;
        this.H = zy7Var2;
        this.I = zy7Var3;
    }

    public /* synthetic */ h9a(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    public /* synthetic */ h9a(String str, Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.H = str;
        this.F = obj;
        this.G = obj2;
        this.I = obj3;
    }
}
