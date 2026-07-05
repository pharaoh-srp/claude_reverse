package defpackage;

import android.view.View;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatEvents$NewChatButtonPressed;
import com.anthropic.claude.analytics.events.ChatEvents$NewChatButtonPressedSource;
import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource;
import com.anthropic.claude.api.feature.Feature;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.app.i0;
import com.anthropic.claude.app.main.loggedin.LoggedInScreens;
import com.anthropic.claude.app.main.loggedin.j;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination;
import com.anthropic.claude.chat.bottomsheet.x0;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.tool.model.KnowledgeSource;
import java.util.List;
import java.util.Map;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ ka1(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i;
        Object obj;
        boolean z = false;
        z = false;
        tp4 tp4Var = null;
        int i2 = 1;
        switch (this.E) {
            case 0:
                la1 la1Var = (la1) this.F;
                el5 el5Var = (el5) this.G;
                bae baeVar = (bae) this.H;
                la1Var.a();
                t11 t11Var = (t11) el5Var.G;
                int i3 = baeVar.E;
                do {
                    i = t11Var.get();
                } while (!t11Var.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return iei.a;
            case 1:
                ux1 ux1Var = (ux1) this.F;
                l9e l9eVarP1 = ux1.p1(ux1Var, (m5c) this.G, (mx1) this.H);
                if (l9eVarP1 == null) {
                    return null;
                }
                wn4 wn4Var = ux1Var.S;
                if (g79.b(wn4Var.Z, -1L)) {
                    e39.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return l9eVarP1.m(wn4Var.t1(l9eVarP1, wn4Var.q1(), 0L) ^ (-9223372034707292160L));
            case 2:
                h86 h86Var = (h86) this.F;
                ml3 ml3Var = (ml3) this.G;
                gb9.D(mwa.G(h86Var), null, null, new zv2((hw2) this.H, tp4Var, 2), 3);
                ml3Var.c.a();
                return iei.a;
            case 3:
                t53 t53Var = (t53) this.F;
                rwe rweVar = (rwe) this.G;
                rwe rweVar2 = (rwe) this.H;
                if (t53Var.f1()) {
                    iaj iajVar = (iaj) w44.N0((List) t53Var.i1.getValue());
                    if (iajVar != null && !yc3.c(iajVar.a(), t53Var, rweVar, rweVar2)) {
                        t53Var.B1(MessageFileEvents$DownloadSource.WIGGLE_PRESENT_FILES, iajVar.a());
                    }
                } else {
                    ArtifactMetadata artifactMetadata = (ArtifactMetadata) w44.N0((List) t53Var.q1.getValue());
                    if (artifactMetadata != null) {
                        zsk.g(rweVar2, new ChatScreenArtifactSheetDestination.ViewArtifact(t53Var.x0(artifactMetadata)));
                    }
                }
                return iei.a;
            case 4:
                fk0 fk0Var = (fk0) this.F;
                hw2 hw2Var = (hw2) this.G;
                nwb nwbVar = (nwb) this.H;
                if (fk0Var.g()) {
                    ((zy7) nwbVar.getValue()).a();
                } else {
                    hw2Var.m0(true);
                }
                return iei.a;
            case 5:
                x0.c((op3) this.F, (KnowledgeSource) this.G, (l45) this.H);
                return iei.a;
            case 6:
                ps7 ps7Var = (ps7) this.F;
                zqc zqcVar = (zqc) this.G;
                ClaudeAppDestination claudeAppDestination = (ClaudeAppDestination) this.H;
                ps7Var.b(false);
                if (((te3) zqcVar.F.getValue()).b.size() + ((te3) zqcVar.F.getValue()).a.size() == 1) {
                    zqcVar.E.m(new qj3(ClaudeAppDestination.List.AllChatsList.INSTANCE, zqcVar, z ? 1 : 0), pj3.F);
                } else {
                    i0.c(zqcVar, claudeAppDestination);
                }
                return iei.a;
            case 7:
                iv1.F((zqc) this.F, new ClaudeAppDestination.Detail.Chat(z93.b((z93) this.G, ((ProjectDetailsScreenParams) this.H).m789getProjectId5pmjbU(), null, null, 14)));
                return iei.a;
            case 8:
                zy7 zy7Var = (zy7) this.F;
                l45 l45Var = (l45) this.G;
                of6 of6Var = (of6) this.H;
                zy7Var.a();
                gb9.D(l45Var, null, null, new nj3(of6Var, tp4Var, z ? 1 : 0), 3);
                return iei.a;
            case 9:
                iv1.H((zqc) this.F, new ClaudeAppDestination.Detail.Chat(z93.b((z93) this.G, ((ClaudeAppDestination.Detail.Chat) ((ClaudeAppDestination) this.H)).getParams().m593getProjectIdvfJkQ(), null, null, 14)));
                return iei.a;
            case 10:
                l45 l45Var2 = (l45) this.F;
                zqc zqcVar2 = (zqc) this.G;
                gb9.D(l45Var2, null, null, new nj3((of6) this.H, tp4Var, i2), 3);
                zqcVar2.E.m(new qj3(ClaudeAppDestination.List.CoworkRemote.INSTANCE, zqcVar2, 7), pj3.S);
                return iei.a;
            case 11:
                nwb nwbVar2 = (nwb) this.F;
                nwb nwbVar3 = (nwb) this.G;
                nwb nwbVar4 = (nwb) this.H;
                nwbVar2.setValue(Boolean.FALSE);
                if (!((Boolean) ((zy7) nwbVar3.getValue()).a()).booleanValue()) {
                    nwbVar4.setValue(Boolean.TRUE);
                }
                return iei.a;
            case 12:
                gb9.D((l45) this.F, null, o45.H, new t74((nwb) this.G, (zhh) this.H, tp4Var, z ? 1 : 0), 1);
                return iei.a;
            case 13:
                gb9.D((l45) this.F, null, o45.H, new t74((nwb) this.G, (sih) this.H, tp4Var, i2), 1);
                return iei.a;
            case 14:
                jg2 jg2Var = (jg2) this.F;
                cf8 cf8Var = (cf8) this.G;
                cf cfVar = (cf) this.H;
                zh4 zh4Var = jg2Var.b;
                zh4Var.getClass();
                return zh4Var.l(cfVar.h.d, cf8Var.a());
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return nyj.V((String) ((nyj) this.F).G, (String) this.G, this.H);
            case 16:
                return nyj.V((String) ((nyj) this.F).G, "Finished span ({}): {}", (mwc) this.G, (cf5) this.H);
            case g.MAX_FIELD_NUMBER /* 17 */:
                ib0 ib0Var = (ib0) this.F;
                Object obj2 = this.G;
                nwb nwbVar5 = (nwb) this.H;
                if (zni.K(ib0Var.b)) {
                    nwbVar5.setValue(sta.i0(obj2, (Map) nwbVar5.getValue()));
                } else {
                    Map map = (Map) nwbVar5.getValue();
                    ie3 ie3Var = ib0Var.a;
                    d56 d56Var = ib0Var.b;
                    rok rokVar = ib0Var.c;
                    ie3Var.getClass();
                    rokVar.getClass();
                    nwbVar5.setValue(sta.m0(map, new cpc(obj2, new ib0(ie3Var, d56Var, rokVar, null))));
                }
                return iei.a;
            case g.AVG_FIELD_NUMBER /* 18 */:
                pl3 pl3Var = (pl3) this.F;
                gf8 gf8Var = (gf8) this.G;
                ((nwb) this.H).setValue(Boolean.valueOf(!((Boolean) r11.getValue()).booleanValue()));
                pl3Var.d(gf8Var);
                return iei.a;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                pl3 pl3Var2 = (pl3) this.F;
                View view = (View) this.G;
                zy7 zy7Var2 = (zy7) this.H;
                pl3Var2.b(view);
                zy7Var2.a();
                return iei.a;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                qi3 qi3Var = (qi3) this.F;
                un8 un8Var = (un8) this.G;
                zy7 zy7Var3 = (zy7) this.H;
                qi3Var.e(new ChatEvents$NewChatButtonPressed(un8Var.m(), ChatEvents$NewChatButtonPressedSource.DRAWER_FOOTER, (String) null, 4, (mq5) null), ChatEvents$NewChatButtonPressed.Companion.serializer());
                zy7Var3.a();
                return iei.a;
            case 21:
                wz5 wz5Var = (wz5) this.F;
                x0a x0aVar = (x0a) this.G;
                px9 px9Var = (px9) this.H;
                j0a j0aVar = (j0a) wz5Var.getValue();
                return new k0a(x0aVar, j0aVar, px9Var, new l94((b79) ((pz9) x0aVar.e.e).getValue(), j0aVar));
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                rwe rweVar3 = (rwe) this.F;
                koi koiVar = (koi) this.G;
                jj jjVar = (jj) this.H;
                LoggedInScreens.Companion.getClass();
                rweVar3.E.m(new jga(i2, new LoggedInScreens[]{j.a(koiVar, jjVar)}), new ae5(16));
                return iei.a;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                bz7 bz7Var = (bz7) this.F;
                w1i w1iVar = (w1i) this.G;
                ((nwb) this.H).setValue(Boolean.FALSE);
                bz7Var.invoke(w1iVar);
                return iei.a;
            case 24:
                gb9.D(((lw5) this.F).G.d1(), null, null, new kza((vpc) this.G, (mpc) this.H, tp4Var, 12), 3);
                return Boolean.TRUE;
            case BuildConfig.VERSION_CODE /* 25 */:
                b1i b1iVar = (b1i) this.F;
                String str = (String) this.G;
                Feature feature = (Feature) this.H;
                if (((Boolean) b1iVar.a.m(str).getValue()).booleanValue() && ((Boolean) b1iVar.b.c(feature).getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                dae daeVar = (dae) this.F;
                bm7 bm7Var = (bm7) this.G;
                b73 b73Var = (b73) this.H;
                synchronized (((efk) bm7Var.b)) {
                    if (!((Map) bm7Var.d).containsKey(b73Var)) {
                        bm7Var.d = sta.m0((Map) bm7Var.d, new cpc(b73Var, Boolean.FALSE));
                        while (true) {
                            synchronized (((efk) bm7Var.b)) {
                                obj = bm7Var.c;
                            }
                            b73Var.invoke(obj);
                            synchronized (((efk) bm7Var.b)) {
                                if (((Map) bm7Var.d).containsKey(b73Var)) {
                                    if (obj == bm7Var.c) {
                                        bm7Var.d = sta.m0((Map) bm7Var.d, new cpc(b73Var, Boolean.TRUE));
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                daeVar.E = new uwb(bm7Var, b73Var, z ? 1 : 0);
                return iei.a;
        }
    }
}
