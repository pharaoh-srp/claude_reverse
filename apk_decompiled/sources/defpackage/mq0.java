package defpackage;

import android.content.Context;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.artifact.model.ArtifactType;
import com.anthropic.claude.chat.parse.MemoryToolSummary;
import com.anthropic.claude.login.MagicLinkSentConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mq0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ mq0(String str, zy7 zy7Var, zy7 zy7Var2, ybg ybgVar, iqb iqbVar, fti ftiVar, q1d q1dVar, mnc mncVar, int i) {
        this.E = 9;
        this.J = str;
        this.K = zy7Var;
        this.L = zy7Var2;
        this.F = ybgVar;
        this.G = iqbVar;
        this.H = ftiVar;
        this.I = q1dVar;
        this.M = mncVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        String strA = null;
        byte b = 0;
        int i2 = 1;
        iei ieiVar = iei.a;
        Object obj3 = this.M;
        Object obj4 = this.I;
        Object obj5 = this.H;
        Object obj6 = this.G;
        Object obj7 = this.F;
        Object obj8 = this.L;
        Object obj9 = this.K;
        Object obj10 = this.J;
        switch (i) {
            case 0:
                tp0 tp0Var = (tp0) obj7;
                iqb iqbVar = (iqb) obj6;
                kg3 kg3Var = (kg3) obj5;
                yt0 yt0Var = (yt0) obj4;
                String str = (String) obj10;
                zy7 zy7Var = (zy7) obj9;
                zy7 zy7Var2 = (zy7) obj8;
                zy7 zy7Var3 = (zy7) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ArtifactMetadata artifactMetadata = tp0Var.b;
                    ctk ctkVar = tp0Var.a;
                    ArtifactType type = artifactMetadata.getType();
                    if (x44.r(type, ArtifactType.Text.INSTANCE)) {
                        e18Var.a0(-678542375);
                        wtk.a(ctkVar.g(), iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 0);
                        e18Var.p(false);
                    } else if (x44.r(type, ArtifactType.Markdown.INSTANCE)) {
                        e18Var.a0(-678537534);
                        ktk.a(ctkVar.g(), tp0Var.c, kg3Var, iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 512);
                        e18Var.p(false);
                    } else if (x44.r(type, ArtifactType.Svg.INSTANCE)) {
                        e18Var.a0(440427004);
                        int iOrdinal = yt0Var.ordinal();
                        if (iOrdinal == 0) {
                            e18Var.a0(-678527708);
                            vtk.a(ctkVar.g(), iqbVar, null, e18Var, 0);
                            e18Var.p(false);
                        } else {
                            if (iOrdinal != 1) {
                                throw ebh.u(e18Var, -678529338, false);
                            }
                            e18Var.a0(440642795);
                            zlk.a(ctkVar.g(), artifactMetadata.getLanguage(), iqbVar, false, artifactMetadata.isComplete(), null, e18Var, 0, 40);
                            e18Var = e18Var;
                            e18Var.p(false);
                        }
                        e18Var.p(false);
                    } else if (x44.r(type, ArtifactType.Mermaid.INSTANCE) || x44.r(type, ArtifactType.React.INSTANCE) || x44.r(type, ArtifactType.Html.INSTANCE)) {
                        e18Var.a0(440980509);
                        int iOrdinal2 = yt0Var.ordinal();
                        if (iOrdinal2 == 0) {
                            e18Var.a0(-678509908);
                            ltk.a(tp0Var, str, iqbVar, zy7Var, zy7Var2, zy7Var3, null, e18Var, 0);
                            e18Var.p(false);
                        } else {
                            if (iOrdinal2 != 1) {
                                throw ebh.u(e18Var, -678511483, false);
                            }
                            e18Var.a0(-678499314);
                            zlk.a(ctkVar.g(), artifactMetadata.getLanguage(), iqbVar, v40.F(e18Var), artifactMetadata.isComplete(), null, e18Var, 0, 32);
                            e18Var = e18Var;
                            e18Var.p(false);
                        }
                        e18Var.p(false);
                    } else if (type instanceof ArtifactType.BinaryDocument) {
                        e18Var.a0(441900248);
                        int iOrdinal3 = yt0Var.ordinal();
                        if (iOrdinal3 == 0) {
                            e18Var.a0(-678480088);
                            ltk.a(tp0Var, str, iqbVar, zy7Var, zy7Var2, zy7Var3, null, e18Var, 0);
                            e18Var.p(false);
                        } else {
                            if (iOrdinal3 != 1) {
                                throw ebh.u(e18Var, -678481814, false);
                            }
                            e18Var.a0(442311959);
                            zlk.a(ctkVar.g(), artifactMetadata.getLanguage(), iqbVar, false, artifactMetadata.isComplete(), null, e18Var, 0, 40);
                            e18Var = e18Var;
                            e18Var.p(false);
                        }
                        e18Var.p(false);
                    } else {
                        if (!x44.r(type, ArtifactType.Code.INSTANCE) && !x44.r(type, ArtifactType.Repl.INSTANCE) && type != null) {
                            throw ebh.u(e18Var, -678541624, false);
                        }
                        e18Var.a0(442654943);
                        zlk.a(ctkVar.g(), artifactMetadata.getLanguage(), iqbVar, false, artifactMetadata.isComplete(), null, e18Var, 0, 40);
                        e18Var.p(false);
                    }
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                kk4 kk4Var = (kk4) obj7;
                List list = (List) obj6;
                pl3 pl3Var = (pl3) obj5;
                bz7 bz7Var = (bz7) obj10;
                hi4 hi4Var = (hi4) obj9;
                Context context = (Context) obj8;
                nwb nwbVar = (nwb) obj3;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                ((mnc) obj2).getClass();
                di4 di4Var = (di4) ((wlg) obj4).getValue();
                if (di4Var != null) {
                    if (!(di4Var instanceof bi4)) {
                        mr9.b();
                        return null;
                    }
                    strA = ((bi4) di4Var).a();
                }
                cqk.g(j0aVar, list, new l6(bz7Var, hi4Var, context), pl3Var, null, null, strA, new ww9(new ub2(1, kk4Var, kk4.class, "mcpServerBadgeCount", "mcpServerBadgeCount(Lcom/anthropic/claude/api/mcp/McpServer;)I", 0, 24), i2, b), new x40(21, nwbVar), kk4Var.c.j(), 24);
                return ieiVar;
            case 2:
                ((Integer) obj2).getClass();
                rl5.a((Long) obj7, (bz7) obj6, (o72) obj5, (b79) obj4, (am5) obj10, (xl5) obj9, (wl5) obj8, (bt7) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 3:
                ((Integer) obj2).getClass();
                zl5.a((zy7) obj9, (ta4) obj7, (iqb) obj6, (pz7) obj5, (e0g) obj4, (wl5) obj10, (c36) obj8, (ta4) obj3, (ld4) obj, x44.p0(100666417));
                return ieiVar;
            case 4:
                ((Integer) obj2).getClass();
                zoa.a((MagicLinkSentConfig) obj7, (rz7) obj5, (zy7) obj9, (zy7) obj8, (ybg) obj4, (iqb) obj6, (poa) obj10, (mnc) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 5:
                eqc[] eqcVarArr = (eqc[]) obj7;
                bae baeVar = (bae) obj4;
                bae baeVar2 = (bae) obj10;
                ArrayList arrayList = (ArrayList) obj9;
                bae baeVar3 = (bae) obj8;
                bae baeVar4 = (bae) obj3;
                int iIntValue2 = ((Integer) obj).intValue();
                ooh oohVar = (ooh) obj2;
                ipc ipcVarA = ((toh) obj6).a(oohVar);
                ipc ipcVarA2 = ((toh) obj5).a(oohVar);
                ipc ipcVar = lja.b0;
                boolean z = ipcVarA == ipcVar;
                boolean z2 = ipcVarA2 == ipcVar;
                if (!z && !z2) {
                    b = 3;
                } else if (!z || !z2) {
                    if (!z && z2) {
                        b = 1;
                    } else if (z && !z2) {
                        b = 2;
                    }
                }
                eqcVarArr[iIntValue2] = new eqc(b);
                if (b == 3) {
                    baeVar.E = Math.min(baeVar.E, iIntValue2);
                    baeVar2.E = Math.max(baeVar2.E, iIntValue2);
                    arrayList.set(iIntValue2, zp3.M);
                } else if (b == 2) {
                    baeVar3.E = Math.min(baeVar3.E, iIntValue2);
                    baeVar4.E = Math.max(baeVar4.E, iIntValue2);
                }
                return ieiVar;
            case 6:
                bae baeVar5 = (bae) obj6;
                bae baeVar6 = (bae) obj5;
                bae baeVar7 = (bae) obj4;
                eqc[] eqcVarArr2 = (eqc[]) obj10;
                ArrayList arrayList2 = (ArrayList) obj9;
                z9e z9eVar = (z9e) obj8;
                z9e z9eVar2 = (z9e) obj3;
                int iIntValue3 = ((Integer) obj).intValue();
                boolean z3 = ((bae) obj7).E < iIntValue3;
                boolean z4 = baeVar5.E > iIntValue3;
                boolean z5 = baeVar6.E < iIntValue3;
                boolean z6 = (z4 || (baeVar7.E > iIntValue3)) ? false : true;
                if (!z3 && !z5) {
                    b = 1;
                }
                if (eqcVarArr2[iIntValue3].a == 2) {
                    arrayList2.set(iIntValue3, (!z6 || z9eVar.E) ? (b == 0 || z9eVar2.E) ? z6 ? zp3.Q : b != 0 ? zp3.P : zp3.T : zp3.N : zp3.O);
                }
                return ieiVar;
            case 7:
                ((Integer) obj2).getClass();
                jik.a((Project) obj7, (zy7) obj9, (zy7) obj8, (bz7) obj5, (zy7) obj3, (Date) obj4, (iqb) obj6, (pl3) obj10, (ld4) obj, x44.p0(1597441));
                return ieiVar;
            case 8:
                ((Integer) obj2).getClass();
                stk.d((String) obj10, (ToolDisplayContent) obj7, (ToolDisplayContent) obj6, (String) obj5, (zy7) obj9, (bz7) obj4, (bz7) obj8, (MemoryToolSummary) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            default:
                ((Integer) obj2).getClass();
                pvj.h((String) obj10, (zy7) obj9, (zy7) obj8, (ybg) obj7, (iqb) obj6, (fti) obj5, (q1d) obj4, (mnc) obj3, (ld4) obj, x44.p0(3073));
                return ieiVar;
        }
    }

    public /* synthetic */ mq0(Project project, zy7 zy7Var, zy7 zy7Var2, bz7 bz7Var, zy7 zy7Var3, Date date, iqb iqbVar, pl3 pl3Var, int i) {
        this.E = 7;
        this.F = project;
        this.K = zy7Var;
        this.L = zy7Var2;
        this.H = bz7Var;
        this.M = zy7Var3;
        this.I = date;
        this.G = iqbVar;
        this.J = pl3Var;
    }

    public /* synthetic */ mq0(MagicLinkSentConfig magicLinkSentConfig, rz7 rz7Var, zy7 zy7Var, zy7 zy7Var2, ybg ybgVar, iqb iqbVar, poa poaVar, mnc mncVar, int i) {
        this.E = 4;
        this.F = magicLinkSentConfig;
        this.H = rz7Var;
        this.K = zy7Var;
        this.L = zy7Var2;
        this.I = ybgVar;
        this.G = iqbVar;
        this.J = poaVar;
        this.M = mncVar;
    }

    public /* synthetic */ mq0(Long l, bz7 bz7Var, o72 o72Var, b79 b79Var, am5 am5Var, xl5 xl5Var, wl5 wl5Var, bt7 bt7Var, int i) {
        this.E = 2;
        this.F = l;
        this.G = bz7Var;
        this.H = o72Var;
        this.I = b79Var;
        this.J = am5Var;
        this.K = xl5Var;
        this.L = wl5Var;
        this.M = bt7Var;
    }

    public /* synthetic */ mq0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
        this.K = obj6;
        this.L = obj7;
        this.M = obj8;
    }

    public /* synthetic */ mq0(zy7 zy7Var, ta4 ta4Var, iqb iqbVar, pz7 pz7Var, e0g e0gVar, wl5 wl5Var, c36 c36Var, ta4 ta4Var2, int i) {
        this.E = 3;
        this.K = zy7Var;
        this.F = ta4Var;
        this.G = iqbVar;
        this.H = pz7Var;
        this.I = e0gVar;
        this.J = wl5Var;
        this.L = c36Var;
        this.M = ta4Var2;
    }

    public /* synthetic */ mq0(String str, ToolDisplayContent toolDisplayContent, ToolDisplayContent toolDisplayContent2, String str2, zy7 zy7Var, bz7 bz7Var, bz7 bz7Var2, MemoryToolSummary memoryToolSummary, int i) {
        this.E = 8;
        this.J = str;
        this.F = toolDisplayContent;
        this.G = toolDisplayContent2;
        this.H = str2;
        this.K = zy7Var;
        this.I = bz7Var;
        this.L = bz7Var2;
        this.M = memoryToolSummary;
    }
}
