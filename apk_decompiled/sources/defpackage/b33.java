package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.citation.Citation;
import com.anthropic.claude.api.mcp.CaiMcpFlag;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.api.notice.Notice;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.project.ProjectActorAccount;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.tool.model.AnalysisToolInvocation;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ResearchTaskId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import com.anthropic.claude.types.strings.ToolUseId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b33 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t53 F;

    public /* synthetic */ b33(t53 t53Var, int i) {
        this.E = i;
        this.F = t53Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        uhd uhdVarM0;
        Object obj;
        Object o33Var;
        ihf ihfVarH;
        ModelSelectorEntry modelSelectorEntry;
        String noticeFingerprint;
        uv7 uv7Var;
        ProjectActorAccount creator;
        int i = this.E;
        Project projectB = null;
        t53 t53Var = this.F;
        switch (i) {
            case 0:
                if (t53Var.L0() != null || (!(t53Var.U0() instanceof x03) && (t53Var.b1() || t53Var.U0().b() || (uhdVarM0 = t53Var.M0()) == null || !uhdVarM0.j))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                kdg kdgVar = t53Var.X0;
                int size = kdgVar.size() - 1;
                int iE = oq5.E(kdgVar);
                while (true) {
                    if (!(size >= 0)) {
                        obj = null;
                    } else if (oq5.E(kdgVar) == iE) {
                        oq5.o(size, kdgVar.size());
                        obj = kdgVar.get(size);
                        size--;
                        whd whdVar = (whd) obj;
                        if (!(whdVar instanceof uhd) || ((uhd) whdVar).j) {
                        }
                    } else {
                        sz6.c();
                    }
                }
                if (obj instanceof uhd) {
                    return (uhd) obj;
                }
                return null;
            case 2:
                return Boolean.valueOf(t53Var.d.h());
            case 3:
                return Boolean.valueOf(!((List) t53Var.i1.getValue()).isEmpty());
            case 4:
                kdg kdgVar2 = t53Var.X0;
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = kdgVar2.listIterator();
                while (true) {
                    c8a c8aVar = (c8a) listIterator;
                    if (!c8aVar.hasNext()) {
                        return arrayList;
                    }
                    whd whdVar2 = (whd) c8aVar.next();
                    uhd uhdVar = whdVar2 instanceof uhd ? (uhd) whdVar2 : null;
                    List list = uhdVar != null ? uhdVar.e : null;
                    if (list == null) {
                        list = lm6.E;
                    }
                    ArrayList<zsc> arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof zsc) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(x44.y(arrayList2, 10));
                    for (zsc zscVar : arrayList2) {
                        arrayList3.add(new tp0(new jq0(zscVar.a), zscVar.c, zscVar.b));
                    }
                    b54.t0(arrayList, arrayList3);
                }
                break;
            case 5:
                return Boolean.valueOf((t53Var.I0() || t53Var.G0()) ? false : true);
            case 6:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (tp0 tp0Var : (List) t53Var.j1.getValue()) {
                    ArtifactIdentifier artifactIdentifierM964boximpl = ArtifactIdentifier.m964boximpl(tp0Var.b.m537getIdentifiereX_QYXY());
                    Object arrayList4 = linkedHashMap.get(artifactIdentifierM964boximpl);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap.put(artifactIdentifierM964boximpl, arrayList4);
                    }
                    ((List) arrayList4).add(tp0Var);
                }
                return linkedHashMap;
            case 7:
                lqa lqaVar = new lqa();
                Iterator it = ((Map) t53Var.n1.getValue()).entrySet().iterator();
                while (it.hasNext()) {
                    int i2 = 0;
                    for (Object obj3 : (List) ((Map.Entry) it.next()).getValue()) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            x44.n0();
                            throw null;
                        }
                        lqaVar.put(((tp0) obj3).b.getUuid(), Boolean.valueOf(i2 > 0));
                        i2 = i3;
                    }
                }
                return lqaVar.c();
            case 8:
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                mq5 mq5Var = null;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                ListIterator listIterator2 = t53Var.X0.listIterator();
                while (true) {
                    c8a c8aVar2 = (c8a) listIterator2;
                    if (c8aVar2.hasNext()) {
                        whd whdVar3 = (whd) c8aVar2.next();
                        if (whdVar3 instanceof uhd) {
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                            uhd uhdVar2 = (uhd) whdVar3;
                            String str = uhdVar2.a;
                            for (mtc mtcVar : uhdVar2.e) {
                                if (mtcVar instanceof ysc) {
                                    ysc yscVar = (ysc) mtcVar;
                                    ToolUseId toolUseIdM1157boximpl = ToolUseId.m1157boximpl(yscVar.a);
                                    str.getClass();
                                    linkedHashMap4.put(toolUseIdM1157boximpl, new AnalysisToolInvocation(str, yscVar.e, yscVar.d, mq5Var));
                                } else if (mtcVar instanceof ParsedContentBlock$McpToolInvocation) {
                                    linkedHashMap5.put(((ParsedContentBlock$McpToolInvocation) mtcVar).getId(), mtcVar);
                                } else if (mtcVar instanceof ParsedContentBlock$Thinking) {
                                    linkedHashMap6.put(((ParsedContentBlock$Thinking) mtcVar).getId(), mtcVar);
                                } else if (mtcVar instanceof gtc) {
                                    String str2 = ((gtc) mtcVar).a;
                                    if (str2 != null) {
                                        linkedHashMap7.put(ResearchTaskId.m1100boximpl(ResearchTaskId.m1100boximpl(str2).m1106unboximpl()), mtcVar);
                                    }
                                } else if (mtcVar instanceof zsc) {
                                    zsc zscVar2 = (zsc) mtcVar;
                                    ArtifactMetadata artifactMetadata = zscVar2.c;
                                    linkedHashMap3.put(artifactMetadata.getUuid(), MessageId.m1051boximpl(str));
                                    linkedHashMap9.put(ArtifactIdentifier.m964boximpl(artifactMetadata.m537getIdentifiereX_QYXY()), artifactMetadata.getUuid());
                                    for (Citation citation : zscVar2.d) {
                                        String uuid = citation.getUuid();
                                        if (uuid != null) {
                                            linkedHashMap8.put(uuid, citation);
                                        }
                                    }
                                } else if (mtcVar instanceof itc) {
                                    for (Citation citation2 : ((itc) mtcVar).c) {
                                        String uuid2 = citation2.getUuid();
                                        if (uuid2 != null) {
                                            linkedHashMap8.put(uuid2, citation2);
                                        }
                                    }
                                } else if (!(mtcVar instanceof htc) && !(mtcVar instanceof ctc) && !(mtcVar instanceof btc) && !(mtcVar instanceof atc) && !(mtcVar instanceof ftc) && !(mtcVar instanceof ltc)) {
                                    wg6.i();
                                    o33Var = mq5Var;
                                }
                            }
                            linkedHashMap2.put(MessageId.m1051boximpl(str), linkedHashMap9);
                        }
                    } else {
                        o33Var = new o33(linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6, linkedHashMap7, linkedHashMap8);
                    }
                }
                return o33Var;
            case 9:
                d8a d8aVarE = x44.E();
                Iterator it2 = ((Map) t53Var.n1.getValue()).values().iterator();
                while (it2.hasNext()) {
                    tp0 tp0Var2 = (tp0) w44.V0((List) it2.next());
                    if (tp0Var2 != null) {
                        d8aVarE.add(tp0Var2.b);
                    }
                }
                return x44.v(d8aVarE);
            case 10:
                pwf pwfVar = new pwf();
                ListIterator listIterator3 = t53Var.d.q.listIterator();
                while (true) {
                    c8a c8aVar3 = (c8a) listIterator3;
                    if (!c8aVar3.hasNext()) {
                        return sf5.k(pwfVar);
                    }
                    McpServer mcpServer = (McpServer) c8aVar3.next();
                    if (mcpServer.getCai_flags().contains(CaiMcpFlag.HIDE_TOOL_CHROME_IN_CHAT)) {
                        pwfVar.add(mcpServer.getName());
                    }
                }
                break;
            case 11:
                r93 r93Var = t53Var.g0;
                String strE = r93Var.e();
                if (strE == null || (ihfVarH = r93Var.h()) == null || (noticeFingerprint = (modelSelectorEntry = ihfVarH.a).getNoticeFingerprint()) == null) {
                    return null;
                }
                Notice notice = modelSelectorEntry.getNotice();
                gob gobVar = t53Var.J;
                gobVar.getClass();
                mdg mdgVar = gobVar.d;
                ModelId modelIdM1058boximpl = ModelId.m1058boximpl(strE);
                Object objValueOf = mdgVar.get(modelIdM1058boximpl);
                if (objValueOf == null) {
                    objValueOf = Integer.valueOf(gobVar.a.getInt("notice_".concat(strE), 0));
                    mdgVar.put(modelIdM1058boximpl, objValueOf);
                }
                int iIntValue = ((Number) objValueOf).intValue();
                if (iIntValue != 0 && iIntValue == noticeFingerprint.hashCode()) {
                    return null;
                }
                return notice;
            case 12:
                return Boolean.valueOf(!t53Var.d1() && t53Var.I0());
            case 13:
                iwc iwcVar = (iwc) t53Var.w0.getValue();
                if (iwcVar == null) {
                    return null;
                }
                McpServer mcpServerL = t53Var.d.l(iwcVar.a);
                return new zza(iwcVar, mcpServerL != null ? mcpServerL.getName() : null, mcpServerL != null ? mcpServerL.getIconUrl() : null, ((Boolean) t53Var.x0.getValue()).booleanValue());
            case 14:
                b13 b13VarU0 = t53Var.U0();
                f1c f1cVar = t53Var.b0;
                boolean z = b13VarU0 instanceof w03;
                fm3 fm3Var = z ? fm3.F : ((b13VarU0 instanceof y03) && ((y03) b13VarU0).e) ? fm3.G : (fm3) t53Var.A0.getValue();
                if (z && !f1cVar.b()) {
                    uv7Var = uv7.H;
                } else if (z) {
                    uv7Var = uv7.G;
                } else {
                    boolean z2 = b13VarU0 instanceof y03;
                    uv7Var = (!z2 || f1cVar.b()) ? (z2 && ((y03) b13VarU0).e) ? uv7.I : ((Boolean) t53Var.C0.getValue()).booleanValue() ? uv7.F : !b13VarU0.b() ? uv7.E : uv7.K : uv7.J;
                }
                return new tv7(fm3Var, uv7Var, t53Var.E0(), (List) t53Var.D0.getValue());
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return Long.valueOf(t53Var.h.a());
            case 16:
                return Integer.valueOf(t53Var.Q0() != null ? R.string.chat_options_change_project : R.string.chat_options_add_to_project);
            case g.MAX_FIELD_NUMBER /* 17 */:
                String strM593getProjectIdvfJkQ = t53Var.b.m593getProjectIdvfJkQ();
                if (strM593getProjectIdvfJkQ != null) {
                    wqd wqdVar = t53Var.n;
                    wqdVar.getClass();
                    projectB = wqdVar.h.b(strM593getProjectIdvfJkQ);
                }
                return Boolean.valueOf((projectB == null || (creator = projectB.getCreator()) == null || !(AccountId.m946equalsimpl0(creator.m408getUuidislZJdo(), t53Var.d.d) ^ true)) ? false : true);
            case g.AVG_FIELD_NUMBER /* 18 */:
                t53Var.i0.r(d63.a);
                return iei.a;
            default:
                r93 r93Var2 = t53Var.g0;
                String strE2 = r93Var2.e();
                ModelId modelIdM1058boximpl2 = strE2 != null ? ModelId.m1058boximpl(strE2) : null;
                String strG = r93Var2.g();
                ThinkingEffort thinkingEffortM1135boximpl = strG != null ? ThinkingEffort.m1135boximpl(strG) : null;
                String strD = r93Var2.d();
                return new r7i(modelIdM1058boximpl2, thinkingEffortM1135boximpl, strD != null ? ThinkingMode.m1142boximpl(strD) : null);
        }
    }
}
