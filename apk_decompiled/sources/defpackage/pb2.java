package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.api.chat.messages.MessageFlag;
import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.chat.input.files.a;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.tool.model.ChartDisplayV0InputStyle;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.SessionId;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class pb2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pb2(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
    }

    private final Object A(Object obj) throws Throwable {
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            i iVar = (i) this.G;
            this.F = 1;
            obj = iVar.j.h("https://claude.ai/connect/github/callback", this);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        String str = (String) obj;
        if (str != null) {
            ((t4g) this.H).a();
            ((Context) this.I).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
        return iei.a;
    }

    private final Object B(Object obj) throws Throwable {
        int i = this.F;
        if (i != 0) {
            if (i == 1) {
                throw sq6.y(obj);
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        i iVar = (i) this.G;
        y3e y3eVar = iVar.c0;
        c34 c34Var = new c34(iVar, (t4g) this.H, (zy7) this.I);
        this.F = 1;
        y3eVar.E.a(c34Var, this);
        return m45.E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r8.b(r11, r12) == r10) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
    
        if (r8.b(r11, r12) == r10) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.I
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r11.G
            t53 r0 = (defpackage.t53) r0
            zy1 r8 = r0.j0
            int r1 = r11.F
            r9 = 3
            r2 = 1
            r4 = 2
            m45 r10 = defpackage.m45.E
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            if (r1 == r4) goto L22
            if (r1 != r9) goto L1b
            goto L22
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            r11 = 0
            return r11
        L22:
            defpackage.sf5.h0(r12)
            goto Lac
        L27:
            defpackage.sf5.h0(r12)
            goto L53
        L2b:
            defpackage.sf5.h0(r12)
            lgb r12 = r0.O
            java.lang.Object r1 = r11.H
            com.anthropic.claude.api.chat.MessageImageAsset r1 = (com.anthropic.claude.api.chat.MessageImageAsset) r1
            r11.F = r2
            ze0 r2 = r12.c
            java.lang.String r2 = r2.a()
            java.lang.String r5 = r1.getUrl()
            java.lang.String r2 = defpackage.kgh.o(r2, r5)
            java.lang.String r1 = r1.getUrl()
            java.lang.String r1 = defpackage.lgb.b(r1)
            java.lang.Object r12 = r12.c(r2, r1, r11)
            if (r12 != r10) goto L53
            goto Lab
        L53:
            pa6 r12 = (defpackage.pa6) r12
            if (r12 == 0) goto L81
            sa6 r1 = r0.P
            long r5 = r12.a
            dwc r12 = new dwc
            com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource r2 = com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource.IMAGE_PREVIEW
            java.lang.String r0 = r0.L0
            r7 = 0
            r12.<init>(r7, r2, r3, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r1.c
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0.put(r1, r12)
            pt6 r12 = new pt6
            r0 = 2131888899(0x7f120b03, float:1.9412446E38)
            st6 r1 = defpackage.st6.G
            r12.<init>(r0, r1)
            r11.F = r4
            java.lang.Object r11 = r8.b(r11, r12)
            if (r11 != r10) goto Lac
            goto Lab
        L81:
            qi3 r12 = r0.w
            com.anthropic.claude.analytics.events.MessageFileEvents$FileDownloadResult r1 = new com.anthropic.claude.analytics.events.MessageFileEvents$FileDownloadResult
            com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource r2 = com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource.IMAGE_PREVIEW
            com.anthropic.claude.analytics.events.MessageFileEvents$DownloadOutcome r4 = com.anthropic.claude.analytics.events.MessageFileEvents$DownloadOutcome.ENQUEUE_FAILED
            r6 = 8
            r7 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            rgb r0 = com.anthropic.claude.analytics.events.MessageFileEvents$FileDownloadResult.Companion
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            znf r0 = (defpackage.znf) r0
            r12.e(r1, r0)
            pt6 r12 = new pt6
            r0 = 2131888898(0x7f120b02, float:1.9412444E38)
            r12.<init>(r0)
            r11.F = r9
            java.lang.Object r11 = r8.b(r11, r12)
            if (r11 != r10) goto Lac
        Lab:
            return r10
        Lac:
            iei r11 = defpackage.iei.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb2.d(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj) {
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            l5h l5hVar = (l5h) this.G;
            String str = (String) this.H;
            String str2 = (String) this.I;
            this.F = 1;
            Object objO = l5hVar.O(str, str2, this);
            m45 m45Var = m45.E;
            if (objO == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }

    private final Object p(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        if (i == 0) {
            sf5.h0(obj);
            gmf gmfVar = (gmf) ((w3c) this.G).G;
            String str = (String) this.H;
            this.F = 1;
            Object objInvoke = ((rz7) gmfVar.F).invoke(ChatId.m978boximpl(str), this.I, this);
            m45 m45Var = m45.E;
            if (objInvoke != m45Var) {
                objInvoke = ieiVar;
            }
            if (objInvoke == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return ieiVar;
    }

    private final Object r(Object obj) {
        dae daeVar = (dae) this.H;
        xc3 xc3Var = (xc3) this.I;
        fn1 fn1Var = (fn1) this.G;
        int i = this.F;
        tp4 tp4Var = null;
        if (i == 0) {
            sf5.h0(obj);
            Object obj2 = daeVar.E;
            if (obj2 != null && obj2 != fn1Var) {
                xc3Var.j = xc3Var.b.size();
                xc3Var.k.clear();
                xc3Var.i.clear();
            }
            daeVar.E = fn1Var;
            zn znVar = new zn(fn1Var, xc3Var, tp4Var, 6);
            this.G = null;
            this.F = 1;
            Object objN = fd9.N(znVar, this);
            m45 m45Var = m45.E;
            if (objN == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.H
            uma r0 = (defpackage.uma) r0
            java.lang.Object r1 = r13.I
            nwb r1 = (defpackage.nwb) r1
            int r2 = r13.F
            r3 = 0
            iei r6 = defpackage.iei.a
            r5 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L31
            if (r2 == r9) goto L2d
            if (r2 == r8) goto L29
            if (r2 == r7) goto L25
            if (r2 != r5) goto L1f
            defpackage.sf5.h0(r14)
            return r6
        L1f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r3
        L25:
            defpackage.sf5.h0(r14)
            return r6
        L29:
            defpackage.sf5.h0(r14)
            return r6
        L2d:
            defpackage.sf5.h0(r14)
            return r6
        L31:
            defpackage.sf5.h0(r14)
            java.lang.Object r2 = r13.G
            bna r2 = (defpackage.bna) r2
            if (r2 != 0) goto L3c
            goto Lba
        L3c:
            java.lang.Object r10 = r1.getValue()
            rn3 r10 = (defpackage.rn3) r10
            boolean r11 = r10 instanceof defpackage.pn3
            m45 r12 = defpackage.m45.E
            if (r11 == 0) goto L60
            dy2 r3 = new dy2
            r7 = 5
            r3.<init>(r7, r1)
            b3f r1 = defpackage.mpk.d0(r3)
            um r3 = new um
            r3.<init>(r0, r5, r2)
            r13.F = r9
            java.lang.Object r0 = r1.a(r3, r13)
            if (r0 != r12) goto Lba
            goto Lb9
        L60:
            on3 r1 = defpackage.on3.a
            boolean r1 = defpackage.x44.r(r10, r1)
            if (r1 == 0) goto L85
            ana r3 = new ana
            float r0 = r0.g()
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r0, r1)
            java.lang.Object r0 = r13.H
            uma r0 = (defpackage.uma) r0
            r13.F = r8
            r1 = r2
            r2 = 1
            r5 = 2010(0x7da, float:2.817E-42)
            r4 = r13
            java.lang.Object r0 = defpackage.ikk.k(r0, r1, r2, r3, r4, r5)
            if (r0 != r12) goto Lba
            goto Lb9
        L85:
            r1 = r2
            boolean r2 = r10 instanceof defpackage.nn3
            if (r2 == 0) goto La8
            ana r3 = new ana
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r2 = 1063675494(0x3f666666, float:0.9)
            r3.<init>(r0, r2)
            java.lang.Object r0 = r13.H
            uma r0 = (defpackage.uma) r0
            r13.F = r7
            r2 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2010(0x7da, float:2.817E-42)
            r4 = r13
            java.lang.Object r0 = defpackage.ikk.k(r0, r1, r2, r3, r4, r5)
            if (r0 != r12) goto Lba
            goto Lb9
        La8:
            qn3 r2 = defpackage.qn3.a
            boolean r2 = defpackage.x44.r(r10, r2)
            if (r2 == 0) goto Lbb
            r13.F = r5
            r2 = 0
            java.lang.Object r0 = defpackage.ikk.n(r0, r1, r2, r13)
            if (r0 != r12) goto Lba
        Lb9:
            return r12
        Lba:
            return r6
        Lbb:
            defpackage.wg6.i()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb2.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj) {
        c cVar = (c) this.H;
        SessionResource sessionResource = (SessionResource) this.I;
        l45 l45Var = (l45) this.G;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            jwf jwfVar = cVar.c;
            String strM875getIdOcx55TE = sessionResource.m875getIdOcx55TE();
            this.G = l45Var;
            this.F = 1;
            obj = jwfVar.k(strM875getIdOcx55TE, null, this);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        ApiResult apiResult = (ApiResult) obj;
        boolean z = apiResult instanceof of0;
        if (z) {
            cVar.j.a(sessionResource.m875getIdOcx55TE(), "");
        } else if (!(apiResult instanceof nf0)) {
            wg6.i();
            return null;
        }
        if (!z) {
            if (!(apiResult instanceof nf0)) {
                wg6.i();
                return null;
            }
            nf0 nf0Var = (nf0) apiResult;
            zfa.a.getClass();
            if (yfa.b()) {
                String strE = iuj.E(l45Var);
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList.add(obj2);
                }
                if (!arrayList.isEmpty()) {
                    zfa.a.getClass();
                    String str = "markSessionRead(head) failed for " + SessionId.m1119toStringimpl(sessionResource.m875getIdOcx55TE()) + ": " + nf0Var;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.WARN, strE, str);
                    }
                }
            }
        }
        return iei.a;
    }

    private final Object v(Object obj) throws Throwable {
        o32 o32Var;
        int i = this.F;
        tp4 tp4Var = null;
        if (i == 0) {
            sf5.h0(obj);
            o32 o32Var2 = (o32) this.H;
            oda odaVar = ((i) this.I).n;
            Uri uri = o32Var2.b;
            this.G = o32Var2;
            this.F = 1;
            Object objC0 = gb9.c0(odaVar.b.b(), new zn(odaVar, uri, tp4Var, 18), this);
            m45 m45Var = m45.E;
            if (objC0 == m45Var) {
                return m45Var;
            }
            obj = objC0;
            o32Var = o32Var2;
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o32Var = (o32) this.G;
            sf5.h0(obj);
        }
        o32Var.f.setValue((Long) obj);
        return iei.a;
    }

    private final Object w(Object obj) {
        i iVar = (i) this.H;
        l45 l45Var = (l45) this.G;
        int i = this.F;
        Object obj2 = this.I;
        if (i == 0) {
            sf5.h0(obj);
            this.G = l45Var;
            this.F = 1;
            Set set = jrf.B;
            obj = iVar.d.y((String) obj2, false, nm6.E, false, this);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        ylf ylfVar = (ylf) obj;
        if (ylfVar instanceof wlf) {
            String str = (String) obj2;
            zfa.a.getClass();
            if (yfa.b()) {
                String strE = iuj.E(l45Var);
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj3)).getClass();
                    arrayList.add(obj3);
                }
                if (!arrayList.isEmpty()) {
                    String strM = ebh.m(zfa.a, "Failed to deny tool call: ", str);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, strM);
                    }
                }
            }
            n2g n2gVar = iVar.g1;
            String message = ((wlf) ylfVar).a.getMessage();
            if (message == null) {
                message = iVar.o.getString(R.string.ccr_error_failed_to_deny_tool_call);
                message.getClass();
            }
            n2gVar.f(message);
        }
        return iei.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb2.x(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.G
            com.anthropic.claude.code.remote.i r0 = (com.anthropic.claude.code.remote.i) r0
            int r1 = r6.F
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            if (r1 != r2) goto L10
            defpackage.sf5.h0(r7)
            goto L38
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r3
        L16:
            defpackage.sf5.h0(r7)
            java.lang.String r7 = r0.E0()
            if (r7 == 0) goto L3b
            psf r1 = r0.z
            r6.F = r2
            h86 r2 = r1.b
            e45 r2 = r2.b()
            lsf r4 = new lsf
            r5 = 0
            r4.<init>(r1, r7, r3, r5)
            java.lang.Object r7 = defpackage.gb9.c0(r2, r4, r6)
            m45 r1 = defpackage.m45.E
            if (r7 != r1) goto L38
            return r1
        L38:
            com.anthropic.claude.code.ui.SessionInputData r7 = (com.anthropic.claude.code.ui.SessionInputData) r7
            goto L3c
        L3b:
            r7 = r3
        L3c:
            if (r7 == 0) goto L42
            com.anthropic.claude.code.ui.PendingAskUserQuestionSelections r3 = r7.getPendingAskUserQuestionSelections()
        L42:
            if (r3 == 0) goto L6b
            java.lang.String r7 = r3.getToolUseId()
            java.lang.Object r1 = r6.H
            rvh r1 = (defpackage.rvh) r1
            java.lang.String r1 = r1.a
            boolean r7 = defpackage.x44.r(r7, r1)
            if (r7 == 0) goto L6b
            java.lang.Object r6 = r6.I
            awc r6 = (defpackage.awc) r6
            int r7 = r3.getCurrentQuestionIndex()
            java.util.Map r1 = r3.getSelectedAnswers()
            java.util.LinkedHashMap r1 = com.anthropic.claude.code.remote.i.e0(r1)
            java.util.Map r2 = r3.getOtherTexts()
            r0.A1(r6, r7, r1, r2)
        L6b:
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb2.y(java.lang.Object):java.lang.Object");
    }

    private final Object z(Object obj) {
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            jrf jrfVar = ((i) this.G).d;
            String str = (String) this.H;
            String str2 = (String) this.I;
            this.F = 1;
            Object objD = jrf.D(jrfVar, str, false, null, null, str2, this, 28);
            m45 m45Var = m45.E;
            if (objD == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                return new pb2((qb2) obj2, tp4Var);
            case 1:
                return new pb2((dui) this.G, (ed2) this.H, (ed2) obj2, tp4Var, 1);
            case 2:
                return new pb2((id2) this.G, (List) this.H, (uub) obj2, tp4Var, 2);
            case 3:
                return new pb2((ah2) this.H, (Project) obj2, tp4Var, 3);
            case 4:
                pb2 pb2Var = new pb2((mkf) this.H, obj2, tp4Var, 4);
                pb2Var.G = obj;
                return pb2Var;
            case 5:
                return new pb2((od2) this.G, (ChartDisplayV0InputStyle) this.H, (List) obj2, tp4Var, 5);
            case 6:
                return new pb2((ja8) this.G, (Context) this.H, (qi3) obj2, tp4Var, 6);
            case 7:
                return new pb2((hw2) this.G, (List) this.H, (ChatEvents$AttachmentSource) obj2, tp4Var, 7);
            case 8:
                return new pb2((hw2) this.G, (File) this.H, (ChatEvents$AttachmentSource) obj2, tp4Var, 8);
            case 9:
                return new pb2((hw2) this.G, (Collection) this.H, (ChatEvents$AttachmentSource) obj2, tp4Var, 9);
            case 10:
                return new pb2((a) this.G, (String) this.H, (MessageFile) obj2, tp4Var, 10);
            case 11:
                return new pb2((pr1) this.G, (ny2) this.H, (String) obj2, tp4Var, 11);
            case 12:
                pb2 pb2Var2 = new pb2((x0a) this.H, (nwb) obj2, tp4Var, 12);
                pb2Var2.G = obj;
                return pb2Var2;
            case 13:
                return new pb2((lf9) this.G, (t53) this.H, (ne7) obj2, tp4Var, 13);
            case 14:
                return new pb2((t53) this.G, (String) this.H, (MessageFlag) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new pb2((ToolUseBlock) this.G, (t53) this.H, (String) obj2, tp4Var, 15);
            case 16:
                return new pb2((t53) this.G, (MessageImageAsset) this.H, (String) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new pb2((l5h) this.G, (String) this.H, (String) obj2, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new pb2((w3c) this.G, (String) this.H, this.I, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                pb2 pb2Var3 = new pb2((dae) this.H, (xc3) obj2, tp4Var, 19);
                pb2Var3.G = obj;
                return pb2Var3;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new pb2((bna) this.G, (uma) this.H, (nwb) obj2, tp4Var, 20);
            case 21:
                pb2 pb2Var4 = new pb2((c) this.H, (SessionResource) obj2, tp4Var, 21);
                pb2Var4.G = obj;
                return pb2Var4;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new pb2((o32) this.H, (i) obj2, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                pb2 pb2Var5 = new pb2((i) this.H, (String) obj2, tp4Var, 23);
                pb2Var5.G = obj;
                return pb2Var5;
            case 24:
                return new pb2((i) this.H, (String) obj2, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new pb2((i) this.G, (rvh) this.H, (awc) obj2, tp4Var, 25);
            case 26:
                return new pb2((i) this.G, (String) this.H, (String) obj2, tp4Var, 26);
            case 27:
                return new pb2((i) this.G, (t4g) this.H, (Context) obj2, tp4Var, 27);
            case 28:
                return new pb2((i) this.G, (t4g) this.H, (zy7) obj2, tp4Var, 28);
            default:
                return new pb2((i) this.G, (x0a) this.H, (nwb) obj2, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 4:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 5:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 6:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 7:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 8:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 9:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 10:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 11:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 12:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 13:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 14:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 16:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((pb2) create((fn1) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 21:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 24:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case BuildConfig.VERSION_CODE /* 25 */:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 26:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 27:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 28:
                ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45.E;
            default:
                return ((pb2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x029c, code lost:
    
        if (r0 == r11) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0343, code lost:
    
        if (r0 != r11) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0796, code lost:
    
        if (r4.b(r26, defpackage.bh2.a) == r11) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ef, code lost:
    
        if (r3 == r11) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x087b A[Catch: all -> 0x0816, TryCatch #3 {all -> 0x0816, blocks: (B:416:0x080e, B:435:0x0875, B:437:0x087b, B:440:0x08ab, B:442:0x08af, B:444:0x08b3, B:445:0x08c6, B:446:0x08cb, B:447:0x08cc, B:455:0x08f9, B:457:0x08fd, B:459:0x0901, B:460:0x0914, B:461:0x0919, B:462:0x091a, B:438:0x08a7, B:448:0x08d3, B:449:0x08d8, B:421:0x081f, B:427:0x0835, B:429:0x083c, B:431:0x085f, B:450:0x08d9, B:452:0x08f1, B:453:0x08f5, B:465:0x0923, B:466:0x0928, B:424:0x0828), top: B:477:0x0800 }] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x08a7 A[Catch: all -> 0x0816, TryCatch #3 {all -> 0x0816, blocks: (B:416:0x080e, B:435:0x0875, B:437:0x087b, B:440:0x08ab, B:442:0x08af, B:444:0x08b3, B:445:0x08c6, B:446:0x08cb, B:447:0x08cc, B:455:0x08f9, B:457:0x08fd, B:459:0x0901, B:460:0x0914, B:461:0x0919, B:462:0x091a, B:438:0x08a7, B:448:0x08d3, B:449:0x08d8, B:421:0x081f, B:427:0x0835, B:429:0x083c, B:431:0x085f, B:450:0x08d9, B:452:0x08f1, B:453:0x08f5, B:465:0x0923, B:466:0x0928, B:424:0x0828), top: B:477:0x0800 }] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x08af A[Catch: all -> 0x0816, TryCatch #3 {all -> 0x0816, blocks: (B:416:0x080e, B:435:0x0875, B:437:0x087b, B:440:0x08ab, B:442:0x08af, B:444:0x08b3, B:445:0x08c6, B:446:0x08cb, B:447:0x08cc, B:455:0x08f9, B:457:0x08fd, B:459:0x0901, B:460:0x0914, B:461:0x0919, B:462:0x091a, B:438:0x08a7, B:448:0x08d3, B:449:0x08d8, B:421:0x081f, B:427:0x0835, B:429:0x083c, B:431:0x085f, B:450:0x08d9, B:452:0x08f1, B:453:0x08f5, B:465:0x0923, B:466:0x0928, B:424:0x0828), top: B:477:0x0800 }] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x08fd A[Catch: all -> 0x0816, TryCatch #3 {all -> 0x0816, blocks: (B:416:0x080e, B:435:0x0875, B:437:0x087b, B:440:0x08ab, B:442:0x08af, B:444:0x08b3, B:445:0x08c6, B:446:0x08cb, B:447:0x08cc, B:455:0x08f9, B:457:0x08fd, B:459:0x0901, B:460:0x0914, B:461:0x0919, B:462:0x091a, B:438:0x08a7, B:448:0x08d3, B:449:0x08d8, B:421:0x081f, B:427:0x0835, B:429:0x083c, B:431:0x085f, B:450:0x08d9, B:452:0x08f1, B:453:0x08f5, B:465:0x0923, B:466:0x0928, B:424:0x0828), top: B:477:0x0800 }] */
    /* JADX WARN: Removed duplicated region for block: B:505:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:513:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0128  */
    /* JADX WARN: Type inference failed for: r12v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r5v21, types: [mtc] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24, types: [itc] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Long] */
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
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pb2(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb2(qb2 qb2Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 0;
        this.I = qb2Var;
    }
}
