package com.anthropic.claude.chat;

import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$MessagePerceivedTTFT;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$ResearchMode;
import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.artifact.model.WiggleArtifactIdentifier;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.tool.model.CreateFileInput;
import com.anthropic.claude.types.strings.ThinkingMode;
import defpackage.b19;
import defpackage.b43;
import defpackage.dae;
import defpackage.dlb;
import defpackage.em2;
import defpackage.ftc;
import defpackage.hxh;
import defpackage.iei;
import defpackage.iuj;
import defpackage.kdg;
import defpackage.lp7;
import defpackage.mn5;
import defpackage.mq5;
import defpackage.mtc;
import defpackage.n30;
import defpackage.nl2;
import defpackage.ol2;
import defpackage.qi3;
import defpackage.sfa;
import defpackage.t53;
import defpackage.tp4;
import defpackage.uhd;
import defpackage.vl2;
import defpackage.whd;
import defpackage.x44;
import defpackage.yc3;
import defpackage.yfa;
import defpackage.zfa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements lp7 {
    public final /* synthetic */ t53 E;
    public final /* synthetic */ dae F;
    public final /* synthetic */ dae G;

    public a(t53 t53Var, dae daeVar, dae daeVar2) {
        this.E = t53Var;
        this.F = daeVar;
        this.G = daeVar2;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        String str;
        ol2 ol2VarA;
        String body;
        String file_text;
        String path;
        List<mtc> list = (List) obj;
        String str2 = (String) this.F.E;
        t53 t53Var = this.E;
        b19 b19VarW0 = t53Var.w0(str2);
        kdg kdgVar = t53Var.X0;
        if (b19VarW0 == null) {
            throw new ChatScreenData$StreamingAssistantMissingException("Streaming assistant message no longer present in messages list");
        }
        int i = b19VarW0.a;
        uhd uhdVar = (uhd) b19VarW0.b;
        kdgVar.set(i, new uhd(uhdVar.a, uhdVar.b, uhdVar.c, uhdVar.d, list, uhdVar.f, (ApiHelpline) this.G.E, uhdVar.h, uhdVar.i, 1536));
        if (!list.isEmpty()) {
            t53Var.z1 = b43.a;
            t53Var.A1.F = null;
        }
        if (t53Var.f1()) {
            for (mtc mtcVar : list) {
                if (mtcVar instanceof ftc) {
                    ftc ftcVar = (ftc) mtcVar;
                    if (x44.r(ftcVar.b, hxh.y)) {
                        dlb dlbVar = ftcVar.h;
                        Object obj2 = dlbVar != null ? dlbVar.a : null;
                        CreateFileInput createFileInput = obj2 instanceof CreateFileInput ? (CreateFileInput) obj2 : null;
                        if (createFileInput != null && (file_text = createFileInput.getFile_text()) != null && (path = createFileInput.getPath()) != null && yc3.a(path, false)) {
                            t53Var.S.d(new WiggleArtifactIdentifier(t53Var.L0, path, null), file_text, path, ftcVar.e);
                        }
                    }
                }
            }
        }
        em2 em2Var = t53Var.h0;
        String strC = ((whd) kdgVar.get(i)).c();
        mn5 mn5Var = em2Var.d;
        list.getClass();
        strC.getClass();
        ol2 ol2Var = em2Var.l;
        if (ol2Var != null) {
            em2Var.l = ol2.a(ol2Var, null, null, null, list, 31);
            if (ol2Var.d == null) {
                List<mtc> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (mtc mtcVar2 : list2) {
                        if ((mtcVar2 instanceof ParsedContentBlock$Thinking) || ((body = mtcVar2.getBody()) != null && body.length() != 0)) {
                            long jA = mn5Var.a();
                            vl2 vl2Var = ol2Var.a;
                            long j = jA - vl2Var.a;
                            long jB = vl2Var.b(em2Var.c);
                            if (j >= em2.C) {
                                zfa.a.getClass();
                                if (yfa.b()) {
                                    String strE = iuj.E(em2Var);
                                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj3 : copyOnWriteArrayList) {
                                        ((n30) ((zfa) obj3)).getClass();
                                        arrayList.add(obj3);
                                    }
                                    if (!arrayList.isEmpty()) {
                                        zfa.a.getClass();
                                        String str3 = "ChatCompletionAnalytics: TTFT too long (" + j + " ms), ignoring";
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            ((n30) ((zfa) it.next())).b(sfa.WARN, strE, str3);
                                        }
                                    }
                                }
                            } else {
                                ol2 ol2Var2 = em2Var.l;
                                if (ol2Var2 != null) {
                                    str = strC;
                                    ol2VarA = ol2.a(ol2Var2, null, Long.valueOf(mn5Var.a()), str, null, 39);
                                } else {
                                    str = strC;
                                    ol2VarA = null;
                                }
                                em2Var.l = ol2VarA;
                                nl2 nl2Var = ol2Var.c;
                                qi3 qi3Var = em2Var.a;
                                String str4 = str;
                                String str5 = nl2Var.b;
                                String str6 = nl2Var.c;
                                String str7 = nl2Var.d;
                                String str8 = str7 == null ? null : str7;
                                int i2 = nl2Var.f;
                                int i3 = nl2Var.g;
                                boolean z = nl2Var.j;
                                boolean z2 = nl2Var.k;
                                boolean z3 = nl2Var.l;
                                String str9 = nl2Var.m;
                                qi3Var.e(new ClaudeAiMessageEvents$MessagePerceivedTTFT(j, str5, str6, str4, str8, i2, i3, z, z2, z3, false, (str9 == null || ThinkingMode.m1147isNonThinkingModeimpl(str9)) ? null : str9, nl2Var.n ? ClaudeAiMessageEvents$ResearchMode.ADVANCED : ClaudeAiMessageEvents$ResearchMode.DISABLED, nl2Var.o, nl2Var.p, nl2Var.r, jB, true, (String) null, 262144, (mq5) null), ClaudeAiMessageEvents$MessagePerceivedTTFT.Companion.serializer());
                            }
                        }
                    }
                }
            }
        }
        return iei.a;
    }
}
