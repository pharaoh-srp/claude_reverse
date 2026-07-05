package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import androidx.core.content.FileProvider;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.CodeEvents$PullRequestOpenEntryPoint;
import com.anthropic.claude.analytics.events.CodeEvents$SessionArchived;
import com.anthropic.claude.analytics.events.DispatchEvents$StarterChipTapped;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.model.ModelOption;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.code.remote.NewCodeSessionPrefill;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.models.organization.configtypes.CoworkStarterChip;
import com.anthropic.claude.sessions.types.GitHubRepo;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.types.strings.McpServerId;
import com.anthropic.claude.types.strings.SessionId;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l6 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ l6(bz7 bz7Var, hi4 hi4Var, Context context) {
        this.E = 24;
        this.G = bz7Var;
        this.F = hi4Var;
        this.H = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        long jFloatToRawIntBits;
        int iIntValue;
        int iIntValue2;
        int i = this.E;
        int i2 = 10;
        int i3 = 6;
        int i4 = 4;
        tp4 tp4Var = null;
        int i5 = 3;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z2 = false;
        objArr = 0;
        Object[] objArr = 0;
        z = false;
        z = false;
        int i6 = 1;
        iei ieiVar = iei.a;
        Object obj2 = this.H;
        Object obj3 = this.G;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                m4a m4aVar = (m4a) obj4;
                n6 n6Var = new n6(z ? 1 : 0, (bz7) obj3);
                m4aVar.a().a(n6Var);
                return new o6((zy7) obj2, m4aVar, n6Var, z ? 1 : 0);
            case 1:
                Context context = (Context) obj4;
                q2d q2dVar = (q2d) obj3;
                nwb nwbVar = (nwb) obj2;
                ((Map) obj).getClass();
                context.getClass();
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 34 ? !(i7 < 33 ? x44.x(context, "android.permission.READ_EXTERNAL_STORAGE") != 0 : x44.x(context, "android.permission.READ_MEDIA_IMAGES") != 0) : !(x44.x(context, "android.permission.READ_MEDIA_IMAGES") != 0 && x44.x(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") != 0)) {
                    z = true;
                }
                nwbVar.setValue(Boolean.valueOf(z));
                q2dVar.a();
                return ieiVar;
            case 2:
                Context context2 = (Context) obj4;
                bz7 bz7Var = (bz7) obj3;
                zy7 zy7Var = (zy7) obj2;
                File file = (File) obj;
                if (file != null) {
                    bz7Var.invoke(x44.W(FileProvider.d(context2, context2.getPackageName() + ".provider", file)));
                }
                zy7Var.a();
                return ieiVar;
            case 3:
                iaj iajVar = (iaj) obj;
                iajVar.getClass();
                gb9.D((l45) obj4, null, null, new o0((jw) obj3, iajVar, (ybg) obj2, null, 7), 3);
                return ieiVar;
            case 4:
                p80 p80Var = (p80) obj4;
                c79 c79Var = (c79) obj3;
                c3d c3dVar = (c3d) obj2;
                b3d b3dVar = (b3d) obj;
                if (b3dVar.c() != null) {
                    long j = ((y69) p80Var.T.invoke(new y69(c79Var.e()))).a;
                    cu9 cu9VarJ = p80Var.U.j(b3dVar);
                    cu9 cu9VarC = b3dVar.c();
                    cu9VarC.getClass();
                    b3d.j(b3dVar, c3dVar, y69.c(j, yfd.a0(cu9VarJ.G(cu9VarC, 0L))));
                }
                return ieiVar;
            case 5:
                aae aaeVar = (aae) obj4;
                s2i s2iVar = (s2i) obj3;
                lb0 lb0Var = (lb0) obj;
                float fFloatValue = ((Number) lb0Var.e.getValue()).floatValue() - aaeVar.E;
                float fH = s2iVar.c.h();
                s2iVar.d(fH + fFloatValue);
                float fAbs = Math.abs(fH - s2iVar.c.h());
                aaeVar.E = ((Number) lb0Var.e.getValue()).floatValue();
                ((aae) obj2).E = ((Number) lb0Var.b()).floatValue();
                if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                    lb0Var.a();
                }
                return ieiVar;
            case 6:
                xp0 xp0Var = (xp0) obj4;
                zy7 zy7Var2 = (zy7) obj2;
                tp0 tp0Var = (tp0) obj;
                tp0Var.getClass();
                zy7Var2.getClass();
                gb9.D(xp0Var.a, null, null, new cm((Activity) obj3, tp0Var, xp0Var, zy7Var2, null, 6), 3);
                return ieiVar;
            case 7:
                gb9.D((l45) obj4, null, null, new o0((ft7) obj, (nwb) obj3, (l2i) obj2, null, 18), 3);
                return ieiVar;
            case 8:
                ckf.j((ekf) obj, (String) obj4, new k6((l45) obj3, 29, (l2i) obj2));
                return ieiVar;
            case 9:
                ModelOption modelOption = (ModelOption) obj;
                modelOption.getClass();
                ((pl3) obj4).c((View) obj3);
                ((mj1) obj2).V(modelOption.m356getModeli4oh0I());
                return ieiVar;
            case 10:
                Context context3 = (Context) obj4;
                l45 l45Var = (l45) obj3;
                zy7 zy7Var3 = (zy7) obj;
                zy7Var3.getClass();
                boolean zBooleanValue = ((Boolean) ((gj1) obj2).x.getValue()).booleanValue();
                l45Var.getClass();
                return zBooleanValue ? new meg(context3, l45Var, zy7Var3) : new x7b(context3, zy7Var3);
            case 11:
                h2f h2fVar = (h2f) obj4;
                glc glcVar = (glc) obj3;
                eeg eegVar = (eeg) obj2;
                xd6 xd6Var = (xd6) obj;
                zy7 zy7Var4 = (zy7) h2fVar.c;
                zy7Var4.getClass();
                float fCeil = va6.b(((va6) zy7Var4.a()).E, MTTypesetterKt.kLineSkipLimitMultiplier) ? 1.0f : (float) Math.ceil(xd6Var.q0(r2));
                float fD = k8g.d(xd6Var.g());
                ((zy7) h2fVar.d).getClass();
                float fMin = Math.min(fCeil, (float) Math.ceil((fD - (((float) Math.ceil(xd6Var.q0(((va6) r4.a()).E))) * 2.0f)) / 2.0f));
                float f = fMin < MTTypesetterKt.kLineSkipLimitMultiplier ? MTTypesetterKt.kLineSkipLimitMultiplier : fMin;
                ((zy7) h2fVar.d).getClass();
                float fCeil2 = (float) Math.ceil(xd6Var.q0(((va6) r0.a()).E));
                float f2 = f / 2.0f;
                float f3 = f2 + fCeil2;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                float f4 = fCeil2 * 2.0f;
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (xd6Var.g() >> 32)) - f) - f4)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L)) - f) - f4)) & 4294967295L);
                if (fCeil2 == MTTypesetterKt.kLineSkipLimitMultiplier && f * 2.0f > k8g.d(xd6Var.g())) {
                    objArr = 1;
                }
                long jM = rta.m(fCeil2, glcVar.k.e);
                ksg ksgVar = new ksg(f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, 30);
                if (objArr != 0) {
                    xd6.r0(xd6Var, eegVar, 0L, 0L, jM, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0, 246);
                } else if (Float.intBitsToFloat((int) (jM >> 32)) < f2) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (xd6Var.g() >> 32)) - f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L)) - f;
                    fj0 fj0VarB0 = xd6Var.B0();
                    long jW = fj0VarB0.w();
                    fj0VarB0.p().g();
                    try {
                        ((efe) fj0VarB0.E).k(f, f, fIntBitsToFloat, fIntBitsToFloat2, 0);
                        xd6.r0(xd6Var, eegVar, 0L, 0L, jM, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0, 246);
                    } finally {
                        grc.y(fj0VarB0, jW);
                    }
                } else {
                    xd6.r0(xd6Var, eegVar, jFloatToRawIntBits2, jFloatToRawIntBits3, rta.m(f2, jM), MTTypesetterKt.kLineSkipLimitMultiplier, ksgVar, null, 0, 208);
                }
                return ieiVar;
            case 12:
                l9e l9eVar = (l9e) obj3;
                float f5 = l9eVar.b;
                float f6 = l9eVar.d;
                float f7 = l9eVar.a;
                float f8 = l9eVar.c;
                jy1 jy1Var = (jy1) obj2;
                xd6 xd6Var2 = (xd6) obj;
                mug mugVar = (mug) ((h80) obj4).F;
                mugVar.getClass();
                float fFloatValue2 = Float.valueOf(mugVar.E).floatValue();
                float f9 = fFloatValue2 < MTTypesetterKt.kLineSkipLimitMultiplier ? 0.0f : fFloatValue2;
                Object[] objArr2 = f9 * 2.0f > Math.min(Math.abs(f8 - f7), Math.abs(f6 - f5)) ? 1 : 0;
                if (objArr2 != 0) {
                    jFloatToRawIntBits = l9eVar.h();
                } else {
                    float f10 = f9 / 2.0f;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f7 + f10)) << 32) | (((long) Float.floatToRawIntBits(f10 + f5)) & 4294967295L);
                }
                xd6.S0(xd6Var2, jy1Var, jFloatToRawIntBits, objArr2 != 0 ? l9eVar.g() : (((long) Float.floatToRawIntBits((f8 - f7) - f9)) << 32) | (((long) Float.floatToRawIntBits((f6 - f5) - f9)) & 4294967295L), MTTypesetterKt.kLineSkipLimitMultiplier, objArr2 != 0 ? qk7.a : new ksg(f9, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, 30), null, 0, 104);
                return ieiVar;
            case 13:
                hcb hcbVar = (hcb) obj4;
                bz7 bz7Var2 = (bz7) obj3;
                nwb nwbVar2 = (nwb) obj2;
                hcb hcbVar2 = (hcb) obj;
                hcbVar2.getClass();
                if (hcbVar2 != hcbVar) {
                    if (hcbVar2 == hcb.H) {
                        nwbVar2.setValue(Boolean.TRUE);
                    } else {
                        bz7Var2.invoke(hcbVar2);
                    }
                }
                return ieiVar;
            case 14:
                l45 l45Var2 = (l45) obj4;
                nwb nwbVar3 = (nwb) obj2;
                ((cz5) obj).getClass();
                y69 y69Var = (y69) ((nwb) obj3).getValue();
                if (y69Var == null) {
                    return new y69(0L);
                }
                long j2 = y69Var.a;
                a80 a80Var = (a80) nwbVar3.getValue();
                tp4 tp4Var2 = null;
                if (a80Var == null) {
                    a80Var = new a80(new y69(j2), dgj.l, tp4Var2, 12);
                    nwbVar3.setValue(a80Var);
                }
                a80 a80Var2 = a80Var;
                if (!y69.b(((y69) a80Var2.e.getValue()).a, j2)) {
                    gb9.D(l45Var2, null, null, new mf2(a80Var2, j2, tp4Var2, 0), 3);
                }
                return new y69(y69.c(((y69) a80Var2.e()).a, j2));
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                qi3 qi3Var = (qi3) obj4;
                zqc zqcVar = (zqc) obj3;
                nwb nwbVar4 = (nwb) obj2;
                CoworkStarterChip coworkStarterChip = (CoworkStarterChip) obj;
                coworkStarterChip.getClass();
                if (((ClaudeAppDestination.Detail.CodeRemoteSession) nwbVar4.getValue()) == null) {
                    qi3Var.e(new DispatchEvents$StarterChipTapped(coworkStarterChip.getId()), DispatchEvents$StarterChipTapped.Companion.serializer());
                    ClaudeAppDestination.Detail.CodeRemoteSession codeRemoteSession = new ClaudeAppDestination.Detail.CodeRemoteSession(new CodeRemoteSessionScreenParams((String) null, false, new NewCodeSessionPrefill(coworkStarterChip.getPrompt(), null, null, null, null, null, null, false, true, null, null, null, false, false, 16126, null), (fwc) null, (CodeSessionListScope) CodeSessionListScope.DramaticShrimp.INSTANCE, 10, (mq5) null));
                    nwbVar4.setValue(codeRemoteSession);
                    iv1.F(zqcVar, codeRemoteSession);
                }
                return ieiVar;
            case 16:
                m4a m4aVar2 = (m4a) obj4;
                ((w86) obj).getClass();
                pm3 pm3Var = new pm3((nwb) obj3, z ? 1 : 0, (v77) obj2);
                m4aVar2.a().a(pm3Var);
                return new rm3(m4aVar2, z ? 1 : 0, pm3Var);
            case g.MAX_FIELD_NUMBER /* 17 */:
                c44 c44Var = (c44) obj4;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                j0a.X(j0aVar, c44Var.d.size(), null, new ta4(404538561, true, new wd(c44Var, (t4g) obj3, (String) obj2, i4)), 6);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                List list = (List) obj4;
                j0a j0aVar2 = (j0a) obj;
                j0aVar2.getClass();
                j0a.X(j0aVar2, list.size(), new hj2(list, 5), new ta4(1381055805, true, new wd(list, (i) obj3, (t4g) obj2, i5)), 4);
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                String str = (String) obj;
                str.getClass();
                ((i) obj4).B1(CodeEvents$PullRequestOpenEntryPoint.LIST);
                ((eli) obj3).a(str);
                ((t4g) obj2).a();
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                c cVar = (c) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                List<SessionResource> listX = cVar.X();
                ArrayList arrayList = new ArrayList(x44.y(listX, 10));
                for (SessionResource sessionResourceM870copy3s6jSc4$default : listX) {
                    if (SessionId.m1117equalsimpl0(sessionResourceM870copy3s6jSc4$default.m875getIdOcx55TE(), str2)) {
                        sessionResourceM870copy3s6jSc4$default = SessionResource.m870copy3s6jSc4$default(sessionResourceM870copy3s6jSc4$default, null, null, str3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388603, null);
                    }
                    arrayList.add(sessionResourceM870copy3s6jSc4$default);
                }
                cVar.f0(arrayList);
                ad9 ad9Var = e.a;
                return ieiVar;
            case 21:
                i iVar = (i) obj4;
                iVar.x1(ne5.h((SessionResource) obj, iVar.D0()));
                iVar.l.e(new CodeEvents$SessionArchived(iVar.m, (String) obj3), CodeEvents$SessionArchived.Companion.serializer());
                ((kl1) obj2).a();
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                Context context4 = (Context) obj4;
                String str4 = (String) obj;
                str4.getClass();
                Object systemService = context4.getSystemService("clipboard");
                systemService.getClass();
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Share URL", str4));
                gb9.D((l45) obj3, null, null, new b34((ybg) obj2, context4, tp4Var, i6), 3);
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                i iVar2 = (i) obj4;
                Integer num = (Integer) obj;
                int iIntValue3 = num.intValue();
                iVar2.V0.setValue(num);
                GitHubRepo gitHubRepo = ((lhf) iVar2.T0.get(iIntValue3)).a;
                iVar2.i.h(new xw1(gitHubRepo.getOwner().getLogin(), gitHubRepo.getName(), gitHubRepo.getGheConfigurationId()));
                gb9.D((l45) obj3, null, null, new o14(iVar2, tp4Var, 28), 3);
                ((t4g) obj2).d(CodeRemoteBottomSheetDestination.BranchSelection.a);
                return ieiVar;
            case 24:
                bz7 bz7Var3 = (bz7) obj3;
                hi4 hi4Var = (hi4) obj4;
                Context context5 = (Context) obj2;
                McpServer mcpServer = (McpServer) obj;
                mcpServer.getClass();
                if (x44.r(mcpServer.getConnected(), Boolean.TRUE)) {
                    bz7Var3.invoke(McpServerId.m1029boximpl(mcpServer.m346getUuidowoRr7k()));
                } else {
                    hi4.c(hi4Var, new bi4(mcpServer.m346getUuidowoRr7k()), context5, si4.Custom, false, null, null, null, 120);
                }
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                wn4 wn4Var = (wn4) obj4;
                lf9 lf9Var = (lf9) obj3;
                paf pafVar = (paf) obj2;
                float fFloatValue3 = ((Float) obj).floatValue();
                float f11 = wn4Var.U ? 1.0f : -1.0f;
                raf rafVar = wn4Var.T;
                long jE = rafVar.e(rafVar.h(f11 * fFloatValue3));
                raf rafVar2 = pafVar.a;
                float fG = rafVar.g(rafVar.e(rafVar2.c(rafVar2.k, jE, 1))) * f11;
                if (Math.abs(fG) < Math.abs(fFloatValue3)) {
                    lf9Var.d(gjk.b("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue3 + ')', null));
                }
                return ieiVar;
            case 26:
                List list2 = (List) obj4;
                ConwayAppScreen.Extension extension = (ConwayAppScreen.Extension) obj2;
                bz7 bz7Var4 = (bz7) obj3;
                j0a j0aVar3 = (j0a) obj;
                j0aVar3.getClass();
                j0a.V(j0aVar3, "title", null, mb4.a, 2);
                if (list2.isEmpty()) {
                    j0a.V(j0aVar3, "empty", null, mb4.b, 2);
                } else {
                    j0aVar3.W(list2.size(), new z04(new fc4(16), i3, list2), new tq(list2, i2), new ta4(802480018, true, new lp(list2, extension, bz7Var4, i5)));
                }
                return ieiVar;
            case 27:
                List list3 = (List) obj4;
                j0a j0aVar4 = (j0a) obj;
                j0aVar4.getClass();
                j0a.V(j0aVar4, "title", null, hjk.a, 2);
                j0aVar4.W(list3.size(), new z04(new fc4(23), 9, list3), new tq(list3, 13), new ta4(802480018, true, new lp(list3, (bz7) obj3, (qz7) obj2, i4)));
                return ieiVar;
            case 28:
                hi6 hi6Var = (hi6) obj4;
                ((Handler) hi6Var.E).post(new fw4((iw4) obj3, hi6Var, (String) obj2, ((Integer) obj).intValue()));
                return ieiVar;
            default:
                HashMap map = (HashMap) obj3;
                HashMap map2 = (HashMap) obj2;
                wpg wpgVar = (wpg) obj;
                Set set = f.j1;
                wpgVar.getClass();
                if (!((LinkedHashSet) obj4).contains(Long.valueOf(wpgVar.a()))) {
                    if (wpgVar instanceof upg) {
                        String str5 = ((upg) wpgVar).a;
                        Integer num2 = (Integer) map.get(str5);
                        if (num2 != null && (iIntValue2 = num2.intValue()) > 0) {
                            map.put(str5, Integer.valueOf(iIntValue2 - 1));
                            z2 = true;
                        }
                    } else if (wpgVar instanceof tpg) {
                        String str6 = ((tpg) wpgVar).a;
                        Integer num3 = (Integer) map2.get(str6);
                        if (num3 != null && (iIntValue = num3.intValue()) > 0) {
                            map2.put(str6, Integer.valueOf(iIntValue - 1));
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
        }
    }

    public /* synthetic */ l6(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    public /* synthetic */ l6(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj3;
        this.H = obj4;
    }

    public /* synthetic */ l6(List list, ConwayAppScreen.Extension extension, bz7 bz7Var) {
        this.E = 26;
        this.F = list;
        this.H = extension;
        this.G = bz7Var;
    }
}
