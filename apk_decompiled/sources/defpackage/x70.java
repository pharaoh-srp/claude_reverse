package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.View;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.tool.model.SuggestConnectorsOutputConnectorsItem;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x70 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ x70(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        int i2 = 7;
        int i3 = 0;
        tp4 tp4Var = null;
        int i4 = 1;
        iei ieiVar = iei.a;
        Object obj2 = this.I;
        Object obj3 = this.H;
        Object obj4 = this.G;
        Object obj5 = this.F;
        switch (i) {
            case 0:
                a80 a80Var = (a80) obj5;
                nb0 nb0Var = (nb0) obj4;
                bz7 bz7Var = (bz7) obj3;
                z9e z9eVar = (z9e) obj2;
                lb0 lb0Var = (lb0) obj;
                nb0 nb0Var2 = a80Var.c;
                mpk.h0(lb0Var, nb0Var2);
                lsc lscVar = lb0Var.e;
                Object objD = a80Var.d(lscVar.getValue());
                if (!x44.r(objD, lscVar.getValue())) {
                    nb0Var2.F.setValue(objD);
                    nb0Var.F.setValue(objD);
                    if (bz7Var != null) {
                        bz7Var.invoke(a80Var);
                    }
                    lb0Var.a();
                    z9eVar.E = true;
                } else if (bz7Var != null) {
                    bz7Var.invoke(a80Var);
                }
                break;
            case 1:
                wxc wxcVar = (wxc) obj5;
                t53 t53Var = (t53) obj4;
                Context context = (Context) obj3;
                nwb nwbVar = (nwb) obj2;
                zy7 zy7Var = (zy7) obj;
                zy7Var.getClass();
                if (x44.r(wxcVar.e(), yxc.a)) {
                    t53Var.r0();
                    zy7Var.a();
                } else {
                    nwbVar.setValue(zy7Var);
                    oq5.K(context, wxcVar);
                }
                break;
            case 2:
                hi4 hi4Var = (hi4) obj4;
                Context context2 = (Context) obj3;
                nwb nwbVar2 = (nwb) obj2;
                SuggestConnectorsOutputConnectorsItem suggestConnectorsOutputConnectorsItem = (SuggestConnectorsOutputConnectorsItem) obj;
                suggestConnectorsOutputConnectorsItem.getClass();
                nwbVar2.setValue(suggestConnectorsOutputConnectorsItem);
                McpServer mcpServerB = zik.b(((koi) obj5).q, suggestConnectorsOutputConnectorsItem);
                String url = suggestConnectorsOutputConnectorsItem.getUrl();
                boolean zR = x44.r(suggestConnectorsOutputConnectorsItem.isAuthless(), Boolean.TRUE);
                dy2 dy2Var = new dy2(3, nwbVar2);
                si4 si4Var = si4.Suggestion;
                if (mcpServerB != null) {
                    hi4.c(hi4Var, new bi4(mcpServerB.m346getUuidowoRr7k()), context2, si4Var, zR, null, null, dy2Var, 48);
                } else if (url != null) {
                    hi4.a(hi4Var, suggestConnectorsOutputConnectorsItem.getName(), url, context2, si4Var, zR, null, dy2Var, 96);
                } else {
                    dy2Var.a();
                }
                break;
            case 3:
                vgc vgcVar = (vgc) obj4;
                Context context3 = (Context) obj3;
                nwb nwbVar3 = (nwb) obj2;
                r4a r4aVar = (r4a) obj;
                r4aVar.getClass();
                lsc lscVar2 = ((wgc) obj5).a;
                zgc zgcVar = (zgc) lscVar2.getValue();
                lscVar2.setValue(null);
                if (zgcVar != null) {
                    if (((Boolean) vgcVar.a.m("mobile_artifact_deep_link_kill_switch").getValue()).booleanValue()) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(zgcVar.a()));
                        intent.addFlags(268435456);
                        PackageManager packageManager = context3.getPackageManager();
                        packageManager.getClass();
                        intent.setPackage(rkj.i(packageManager));
                        context3.startActivity(intent);
                    } else {
                        ((pz7) nwbVar3.getValue()).invoke(zgcVar.getUuid(), Boolean.valueOf(zgcVar instanceof ygc));
                    }
                }
                break;
            case 4:
                ClaudeAppOverlay claudeAppOverlay = (ClaudeAppOverlay) obj4;
                zqc zqcVar = (zqc) obj3;
                z93 z93Var = (z93) obj2;
                aji ajiVar = (aji) obj;
                ajiVar.getClass();
                ((rwe) obj5).E.m(hr0.R, new tj3(7));
                if (!ajiVar.equals(zii.a)) {
                    if (!ajiVar.equals(yii.a)) {
                        mr9.b();
                    } else {
                        ClaudeAppOverlay.UpgradeToProBottomSheet upgradeToProBottomSheet = (ClaudeAppOverlay.UpgradeToProBottomSheet) claudeAppOverlay;
                        String strM496getModelIdToSelectAfterUpgradea6HIKFk = upgradeToProBottomSheet.m496getModelIdToSelectAfterUpgradea6HIKFk();
                        if (strM496getModelIdToSelectAfterUpgradea6HIKFk != null) {
                            iv1.H(zqcVar, new ClaudeAppDestination.Detail.Chat(z93.b(z93Var, null, upgradeToProBottomSheet.getInitialPromptAfterUpgrade(), strM496getModelIdToSelectAfterUpgradea6HIKFk, 9)));
                        }
                    }
                }
                break;
            case 5:
                m2a m2aVar = (m2a) obj5;
                jjh jjhVar = (jjh) obj4;
                cjh cjhVar = (cjh) obj3;
                xy8 xy8Var = (xy8) obj2;
                if (m2aVar.b()) {
                    epk epkVar = m2aVar.d;
                    u25 u25Var = m2aVar.v;
                    u25 u25Var2 = m2aVar.w;
                    dae daeVar = new dae();
                    f2d f2dVar = new f2d(epkVar, u25Var, daeVar, 19);
                    x5d x5dVar = jjhVar.a;
                    x5dVar.d(cjhVar, xy8Var, f2dVar, u25Var2);
                    njh njhVar = new njh(jjhVar, x5dVar);
                    jjhVar.b.set(njhVar);
                    daeVar.E = njhVar;
                    m2aVar.e = njhVar;
                }
                break;
            case 6:
                b29 b29Var = (b29) obj4;
                aae aaeVar = (aae) obj3;
                l45 l45Var = (l45) obj2;
                long jLongValue = ((Long) obj).longValue();
                wlg wlgVar = (wlg) ((nwb) obj5).getValue();
                long jLongValue2 = wlgVar != null ? ((Number) wlgVar.getValue()).longValue() : jLongValue;
                long j = b29Var.c;
                wwb wwbVar = b29Var.a;
                if (j == Long.MIN_VALUE || aaeVar.E != mpk.I(l45Var.getCoroutineContext())) {
                    b29Var.c = jLongValue;
                    Object[] objArr = wwbVar.E;
                    int i5 = wwbVar.G;
                    for (int i6 = 0; i6 < i5; i6++) {
                        ((z19) objArr[i6]).J = true;
                    }
                    aaeVar.E = mpk.I(l45Var.getCoroutineContext());
                }
                float f = aaeVar.E;
                if (f == MTTypesetterKt.kLineSkipLimitMultiplier) {
                    Object[] objArr2 = wwbVar.E;
                    int i7 = wwbVar.G;
                    while (i3 < i7) {
                        z19 z19Var = (z19) objArr2[i3];
                        z19Var.G.setValue(z19Var.H.c);
                        z19Var.J = true;
                        i3++;
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - b29Var.c) / f);
                    Object[] objArr3 = wwbVar.E;
                    int i8 = wwbVar.G;
                    boolean z = true;
                    for (int i9 = 0; i9 < i8; i9++) {
                        z19 z19Var2 = (z19) objArr3[i9];
                        if (!z19Var2.I) {
                            z19Var2.L.b.setValue(Boolean.FALSE);
                            if (z19Var2.J) {
                                z19Var2.J = false;
                                z19Var2.K = j2;
                            }
                            long j3 = j2 - z19Var2.K;
                            z19Var2.G.setValue(z19Var2.H.f(j3));
                            z19Var2.I = z19Var2.H.e(j3);
                        }
                        if (!z19Var2.I) {
                            z = false;
                        }
                    }
                    b29Var.d.setValue(Boolean.valueOf(!z));
                }
                break;
            case 7:
                xz9 xz9Var = (xz9) obj5;
                xz9Var.c = new bm7((jz9) obj4, (fvg) obj3, (lcd) obj2);
                break;
            case 8:
                pl3 pl3Var = (pl3) obj5;
                View view = (View) obj4;
                zy7 zy7Var2 = (zy7) obj3;
                zy7 zy7Var3 = (zy7) obj2;
                if (((Boolean) obj).booleanValue()) {
                    pl3Var.g(view);
                    zy7Var2.a();
                } else {
                    zy7Var3.a();
                }
                break;
            case 9:
                hp4 hp4Var = (hp4) obj4;
                pz7 pz7Var = (pz7) obj3;
                sih sihVar = (sih) obj2;
                cp4 cp4Var = (cp4) obj;
                int i10 = ((hdb) ((wlg) obj5).getValue()).a;
                yok.d(cp4Var, hp4Var, pz7Var, sihVar, ieh.Cut, (i10 & 4) == 4);
                yok.d(cp4Var, hp4Var, pz7Var, sihVar, ieh.Copy, (i10 & 1) == 1);
                yok.d(cp4Var, hp4Var, pz7Var, sihVar, ieh.Paste, (i10 & 2) == 2);
                yok.d(cp4Var, hp4Var, pz7Var, sihVar, ieh.SelectAll, (i10 & 8) == 8);
                yok.d(cp4Var, hp4Var, pz7Var, sihVar, ieh.Autofill, (i10 & 16) == 16);
                break;
            default:
                nwb nwbVar4 = (nwb) obj5;
                Configuration configuration = (Configuration) obj4;
                l45 l45Var2 = (l45) obj3;
                bt7 bt7Var = (bt7) obj2;
                ft7 ft7Var = (ft7) obj;
                ft7Var.getClass();
                if (!ft7Var.b() && nwbVar4.getValue() != null && !x44.r(nwbVar4.getValue(), configuration)) {
                    i3 = 1;
                }
                if (ft7Var.b()) {
                    nwbVar4.setValue(configuration);
                } else {
                    nwbVar4.setValue(null);
                }
                if (i3 != 0) {
                    ft5 ft5Var = g86.a;
                    gb9.D(l45Var2, tpa.a.J, null, new ql5(bt7Var, tp4Var, i4), 2);
                }
                break;
        }
        return ieiVar;
    }
}
