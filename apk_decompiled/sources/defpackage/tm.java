package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.ChatEvents$AddAttachment;
import com.anthropic.claude.analytics.events.ChatEvents$ConversationLoadSource;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.api.chat.ModelSelection;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.sessions.types.CreatePullRequestRequest;
import com.anthropic.claude.sessions.types.CreatePullRequestResponse;
import com.anthropic.claude.sessions.types.GitHubRepo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.json.JsonObject;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class tm extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(List list, em2 em2Var, String str, ChatEvents$ConversationLoadSource chatEvents$ConversationLoadSource, int i, zc9 zc9Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 9;
        this.H = list;
        this.I = em2Var;
        this.G = str;
        this.J = chatEvents$ConversationLoadSource;
        this.F = i;
        this.K = zc9Var;
    }

    private final Object d(Object obj) {
        String default_branch;
        String str = (String) this.H;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            n58 n58Var = (n58) this.I;
            if (n58Var == null || ((String) this.G) == null) {
                return null;
            }
            String str2 = n58Var.a;
            str2.getClass();
            List listY0 = bsg.Y0(str2, new String[]{"/"}, 2);
            cpc cpcVar = listY0.size() == 2 ? new cpc(listY0.get(0), listY0.get(1)) : new cpc("", str2);
            String str3 = (String) cpcVar.E;
            String str4 = (String) cpcVar.F;
            jwf jwfVar = (jwf) this.J;
            String str5 = (String) this.G;
            GitHubRepo gitHubRepoZ0 = ((i) this.K).z0();
            if (gitHubRepoZ0 == null || (default_branch = gitHubRepoZ0.getDefault_branch()) == null) {
                default_branch = "main";
            }
            this.H = null;
            this.F = 1;
            obj = a.D(jwfVar, str5, str3, str4, str, default_branch, this);
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
        return (String) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r12 == r7) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = r11.K
            com.anthropic.claude.code.remote.c r0 = (com.anthropic.claude.code.remote.c) r0
            java.lang.Object r1 = r11.J
            gtf r1 = (defpackage.gtf) r1
            java.lang.Object r2 = r11.I
            l45 r2 = (defpackage.l45) r2
            int r3 = r11.F
            r4 = 2
            r5 = 1
            r6 = 0
            m45 r7 = defpackage.m45.E
            if (r3 == 0) goto L2f
            if (r3 == r5) goto L27
            if (r3 != r4) goto L21
            java.lang.Object r11 = r11.H
            com.anthropic.claude.api.result.ApiResult r11 = (com.anthropic.claude.api.result.ApiResult) r11
            defpackage.sf5.h0(r12)
            goto L79
        L21:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            return r6
        L27:
            java.lang.Object r0 = r11.G
            zv5 r0 = (defpackage.zv5) r0
            defpackage.sf5.h0(r12)
            goto L61
        L2f:
            defpackage.sf5.h0(r12)
            java.lang.String r12 = r1.a
            r3 = 3
            if (r12 == 0) goto L42
            uz3 r8 = new uz3
            r9 = 0
            r8.<init>(r0, r12, r6, r9)
            zv5 r12 = defpackage.gb9.k(r2, r6, r8, r3)
            goto L43
        L42:
            r12 = r6
        L43:
            java.lang.String r1 = r1.b
            if (r1 == 0) goto L51
            uz3 r8 = new uz3
            r8.<init>(r0, r1, r6, r5)
            zv5 r0 = defpackage.gb9.k(r2, r6, r8, r3)
            goto L52
        L51:
            r0 = r6
        L52:
            if (r12 == 0) goto L64
            r11.I = r6
            r11.G = r0
            r11.F = r5
            java.lang.Object r12 = r12.w(r11)
            if (r12 != r7) goto L61
            goto L75
        L61:
            com.anthropic.claude.api.result.ApiResult r12 = (com.anthropic.claude.api.result.ApiResult) r12
            goto L65
        L64:
            r12 = r6
        L65:
            if (r0 == 0) goto L7d
            r11.I = r6
            r11.G = r6
            r11.H = r12
            r11.F = r4
            java.lang.Object r11 = r0.B0(r11)
            if (r11 != r7) goto L76
        L75:
            return r7
        L76:
            r10 = r12
            r12 = r11
            r11 = r10
        L79:
            r6 = r12
            com.anthropic.claude.api.result.ApiResult r6 = (com.anthropic.claude.api.result.ApiResult) r6
            r12 = r11
        L7d:
            cpc r11 = new cpc
            r11.<init>(r12, r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm.n(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj) {
        hxb hxbVar;
        gtf gtfVar;
        c cVar;
        Throwable th;
        hxb hxbVar2;
        c cVar2 = (c) this.J;
        int i = this.F;
        m45 m45Var = m45.E;
        try {
            try {
                if (i == 0) {
                    sf5.h0(obj);
                    hxbVar = cVar2.N;
                    gtfVar = (gtf) this.K;
                    this.G = hxbVar;
                    this.H = cVar2;
                    this.I = gtfVar;
                    this.F = 1;
                    if (hxbVar.c(this) != m45Var) {
                        cVar = cVar2;
                    }
                    return m45Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hxbVar2 = (hxb) this.G;
                    try {
                        sf5.h0(obj);
                        hxbVar2.d(null);
                        cVar2.g0(htf.a(cVar2.a0(), null, false, false, 0, null, 29));
                        cVar2.U();
                        return iei.a;
                    } catch (Throwable th2) {
                        th = th2;
                        hxbVar2.d(null);
                        throw th;
                    }
                }
                gtfVar = (gtf) this.I;
                cVar = (c) this.H;
                hxb hxbVar3 = (hxb) this.G;
                sf5.h0(obj);
                hxbVar = hxbVar3;
                this.G = hxbVar;
                this.H = null;
                this.I = null;
                this.F = 2;
                if (c.P(cVar, gtfVar, this) != m45Var) {
                    hxbVar2 = hxbVar;
                    hxbVar2.d(null);
                    cVar2.g0(htf.a(cVar2.a0(), null, false, false, 0, null, 29));
                    cVar2.U();
                    return iei.a;
                }
                return m45Var;
            } catch (Throwable th3) {
                hxb hxbVar4 = hxbVar;
                th = th3;
                hxbVar2 = hxbVar4;
                hxbVar2.d(null);
                throw th;
            }
        } catch (Throwable th4) {
            cVar2.g0(htf.a(cVar2.a0(), null, false, false, 0, null, 29));
            throw th4;
        }
    }

    private final Object r(Object obj) {
        String str = (String) this.G;
        c cVar = (c) this.I;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            jwf jwfVar = cVar.c;
            String str2 = (String) this.H;
            String string = cVar.b.getString(R.string.ccr_error_unknown);
            string.getClass();
            l6 l6Var = new l6(cVar, (wt3) this.K, str, (String) this.H, 20);
            b04 b04Var = (b04) this.J;
            this.F = 1;
            Object objQ = rwk.q(jwfVar, str, str2, string, l6Var, b04Var, this);
            m45 m45Var = m45.E;
            if (objQ == m45Var) {
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

    private final Object s(Object obj) {
        Object objM;
        b04 b04Var = (b04) this.K;
        n58 n58Var = (n58) this.I;
        i iVar = (i) this.H;
        lsc lscVar = iVar.m1;
        l45 l45Var = (l45) this.G;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            jwf jwfVar = iVar.c;
            String str = n58Var.a;
            String str2 = n58Var.b;
            this.G = l45Var;
            this.F = 1;
            objM = jwfVar.a.m(jwfVar.b, new CreatePullRequestRequest(str, str2, (String) null, (String) null, (String) null, false, 60, (mq5) null), this);
            m45 m45Var = m45.E;
            if (objM == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
            objM = obj;
        }
        ApiResult apiResult = (ApiResult) objM;
        if (apiResult instanceof of0) {
            CreatePullRequestResponse createPullRequestResponse = (CreatePullRequestResponse) ((of0) apiResult).b;
            String html_url = createPullRequestResponse.getHtml_url();
            b68 b68Var = new b68(html_url, createPullRequestResponse.getNumber());
            String str3 = n58Var.a;
            String str4 = n58Var.b;
            str3.getClass();
            str4.getClass();
            iVar.l1.setValue(new n58(str3, str4, b68Var));
            jtf jtfVar = new jtf(n58Var.a, n58Var.b, createPullRequestResponse.getNumber(), createPullRequestResponse.getTitle(), html_url, 0, 0, "open");
            List<jtf> list = (List) lscVar.getValue();
            if ((list instanceof Collection) && list.isEmpty()) {
                lscVar.setValue(w44.b1((List) lscVar.getValue(), jtfVar));
                ((nl1) this.J).invoke(html_url);
            } else {
                for (jtf jtfVar2 : list) {
                    if (x44.r(jtfVar2.a, jtfVar.a) && jtfVar2.c == jtfVar.c) {
                        break;
                    }
                }
                lscVar.setValue(w44.b1((List) lscVar.getValue(), jtfVar));
                ((nl1) this.J).invoke(html_url);
            }
        } else {
            boolean z = apiResult instanceof lf0;
            sfa sfaVar = sfa.ERROR;
            if (z) {
                bj3 bj3Var = ((lf0) apiResult).b;
                String e = bj3Var.getD();
                if (e == null) {
                    e = bj3Var.toString();
                }
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
                        String strM = ebh.m(zfa.a, "Failed to create PR: ", e);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar, strE, strM);
                        }
                    }
                }
                b04Var.invoke(e);
            } else {
                if (!(apiResult instanceof mf0)) {
                    wg6.i();
                    return null;
                }
                Throwable th = ((mf0) apiResult).a;
                String message = th.getMessage();
                if (message == null) {
                    message = "Failed to create PR";
                }
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE2 = iuj.E(l45Var);
                    CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : copyOnWriteArrayList2) {
                        ((n30) ((zfa) obj3)).getClass();
                        arrayList2.add(obj3);
                    }
                    if (!arrayList2.isEmpty()) {
                        String strS = sq6.s(zfa.a, th, "Failed to create PR: ");
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfaVar, strE2, strS);
                        }
                    }
                }
                b04Var.invoke(message);
            }
        }
        return iei.a;
    }

    private final Object t(Object obj) {
        i iVar = (i) this.I;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            jwf jwfVar = iVar.c;
            String str = (String) this.G;
            String str2 = (String) this.H;
            String string = iVar.o.getString(R.string.ccr_error_unknown);
            string.getClass();
            lj2 lj2Var = new lj2(iVar, 10, (zy7) this.K);
            bz7 bz7Var = (bz7) this.J;
            this.F = 1;
            Object objQ = rwk.q(jwfVar, str, str2, string, lj2Var, bz7Var, this);
            m45 m45Var = m45.E;
            if (objQ == m45Var) {
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0037 -> B:15:0x003a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.I
            ph4 r0 = (defpackage.ph4) r0
            int r1 = r5.F
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 != r3) goto L10
            defpackage.sf5.h0(r6)
            goto L3a
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r2
        L16:
            defpackage.sf5.h0(r6)
            boolean r6 = r0 instanceof defpackage.nh4
            if (r6 != 0) goto L20
            iei r5 = defpackage.iei.a
            return r5
        L20:
            java.lang.Object r6 = r5.J
            ybg r6 = (defpackage.ybg) r6
            java.lang.Object r0 = r5.G
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r5.H
            java.lang.String r1 = (java.lang.String) r1
            r5.I = r2
            r5.F = r3
            r4 = 4
            java.lang.Object r6 = defpackage.ybg.b(r6, r0, r1, r5, r4)
            m45 r0 = defpackage.m45.E
            if (r6 != r0) goto L3a
            return r0
        L3a:
            ecg r6 = (defpackage.ecg) r6
            ecg r0 = defpackage.ecg.F
            if (r6 != r0) goto L20
            java.lang.Object r6 = r5.K
            com.anthropic.claude.code.remote.i r6 = (com.anthropic.claude.code.remote.i) r6
            r6.Y0()
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm.v(java.lang.Object):java.lang.Object");
    }

    private final Object w(Object obj) {
        e8d e8dVar = (e8d) this.H;
        l45 l45Var = (l45) this.G;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            nf4 nf4Var = new nf4((bz7) this.I, new ldd(e8dVar), (rz7) this.J, l45Var, (wvc) this.K, null);
            this.G = null;
            this.F = 1;
            Object objF = pok.f(e8dVar, nf4Var, this);
            m45 m45Var = m45.E;
            if (objF == m45Var) {
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

    private final Object x(Object obj) throws Throwable {
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            Context context = (Context) this.I;
            String str = (String) this.G;
            String str2 = (String) this.H;
            h86 h86Var = (h86) this.J;
            this.F = 1;
            obj = rq0.c(context, str, str2, h86Var, this);
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
        if (!((Boolean) obj).booleanValue()) {
            ((zy7) this.K).a();
        }
        return iei.a;
    }

    private final Object y(Object obj) throws Throwable {
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            String str = (String) this.G;
            if (str != null) {
                Context context = (Context) this.H;
                Uri uri = (Uri) this.I;
                h86 h86Var = (h86) this.J;
                this.F = 1;
                ide ideVar = rq0.a;
                e45 e45VarB = h86Var.b();
                b6c b6cVar = b6c.F;
                e45VarB.getClass();
                obj = gb9.c0(nai.Z(e45VarB, b6cVar), new qq0(context, uri, str, null), this);
                m45 m45Var = m45.E;
                if (obj == m45Var) {
                    return m45Var;
                }
            }
            ((zy7) this.K).a();
            return iei.a;
        }
        if (i != 1) {
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        if (!((Boolean) obj).booleanValue()) {
            ((zy7) this.K).a();
        }
        return iei.a;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.K;
        switch (i) {
            case 0:
                return new tm((String) this.G, (String) this.H, (String) this.I, obj2, (String) this.J, tp4Var, 0);
            case 1:
                tm tmVar = new tm((y5d) this.H, (bz7) this.I, (y20) this.J, (e2a) obj2, tp4Var, 1);
                tmVar.G = obj;
                return tmVar;
            case 2:
                return new tm((xq0) obj2, (String) this.G, tp4Var);
            case 3:
                return new tm((zub) this.G, (pl3) this.H, (View) this.I, (nwb) this.J, (nwb) obj2, tp4Var, 3);
            case 4:
                return new tm(this.H, this.I, this.J, (String) this.G, obj2, tp4Var, 4);
            case 5:
                return new tm((co1) obj2, (String) this.H, (String) this.I, tp4Var, 5);
            case 6:
                tm tmVar2 = new tm((mo1) obj2, tp4Var);
                tmVar2.J = obj;
                return tmVar2;
            case 7:
                return new tm(this.H, this.I, this.J, (String) this.G, obj2, tp4Var, 7);
            case 8:
                return new tm((v70) this.G, (zy1) this.H, (amg) this.I, (i04) this.J, (dqh) obj2, tp4Var, 8);
            case 9:
                return new tm((List) this.H, (em2) this.I, (String) this.G, (ChatEvents$ConversationLoadSource) this.J, this.F, (zc9) obj2, tp4Var);
            case 10:
                return new tm((String) this.G, (String) this.H, (String) this.I, obj2, (String) this.J, tp4Var, 10);
            case 11:
                return new tm((com.anthropic.claude.chat.input.files.a) this.H, (sw2) this.I, (String) this.G, (ChatEvents$AddAttachment) this.J, (pz7) obj2, tp4Var);
            case 12:
                return new tm((t53) obj2, (String) this.G, (String) this.H, (String) this.I, (String) this.J, tp4Var);
            case 13:
                return new tm((t53) obj2, (String) this.H, (String) this.I, tp4Var, 13);
            case 14:
                return new tm((t53) this.J, (String) this.G, (String) this.H, (Project) obj2, (String) this.I, tp4Var);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new tm((t53) this.H, (dgb) this.I, (hw2) this.J, (bt7) obj2, tp4Var, 15);
            case 16:
                return new tm((t53) this.G, (op3) this.H, (qi3) this.I, (ChatMessageActionEvents$ActionSource) this.J, (whd) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new tm((uhd) this.H, (List) this.I, (nwb) this.J, (f93) obj2, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new tm((r93) this.J, (ModelSelection) obj2, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                tm tmVar3 = new tm((n58) this.I, (String) this.G, (jwf) this.J, (i) obj2, tp4Var);
                tmVar3.H = obj;
                return tmVar3;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                tm tmVar4 = new tm((gtf) this.J, (c) obj2, tp4Var, 20);
                tmVar4.I = obj;
                return tmVar4;
            case 21:
                return new tm((c) this.J, (gtf) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new tm(this.I, (String) this.G, (String) this.H, this.J, (zy7) obj2, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                tm tmVar5 = new tm((i) this.H, (n58) this.I, (nl1) this.J, (b04) obj2, tp4Var, 23);
                tmVar5.G = obj;
                return tmVar5;
            case 24:
                return new tm(this.I, (String) this.G, (String) this.H, this.J, (zy7) obj2, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                tm tmVar6 = new tm(tp4Var, (ybg) this.J, (i) obj2, (String) this.G, (String) this.H);
                tmVar6.I = obj;
                return tmVar6;
            case 26:
                tm tmVar7 = new tm((e8d) this.H, (bz7) this.I, (rz7) this.J, (wvc) obj2, tp4Var, 26);
                tmVar7.G = obj;
                return tmVar7;
            case 27:
                return new tm(this.I, (String) this.G, (String) this.H, this.J, (zy7) obj2, tp4Var, 27);
            case 28:
                return new tm((String) this.G, (Context) this.H, (Uri) this.I, (h86) this.J, (zy7) obj2, tp4Var, 28);
            default:
                tm tmVar8 = new tm((f15) this.J, (us4) obj2, tp4Var, 29);
                tmVar8.I = obj;
                return tmVar8;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45.E;
            case 2:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 4:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 5:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 6:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 7:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 8:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 9:
                ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 10:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 11:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 12:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 13:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 14:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 16:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((tm) create((String) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 21:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 24:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case BuildConfig.VERSION_CODE /* 25 */:
                return ((tm) create((ph4) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 26:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 27:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 28:
                return ((tm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((tm) create((JsonObject) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x02d8, code lost:
    
        if (defpackage.zh4.z(r1, 100, r39) != r10) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0512, code lost:
    
        if (r0.b(r39, r1) == r2) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x07bc, code lost:
    
        if (defpackage.co1.a(r2, r1, (java.lang.String) r3, r39) == r0) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015e, code lost:
    
        if (r4 == r10) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0177, code lost:
    
        if (r2.c(r5, r1, r39) == r10) goto L80;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0aa9  */
    /* JADX WARN: Removed duplicated region for block: B:573:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0169  */
    /* JADX WARN: Type inference failed for: r0v27, types: [xq0] */
    /* JADX WARN: Type inference failed for: r0v32, types: [xq0] */
    /* JADX WARN: Type inference failed for: r0v7, types: [y5d] */
    /* JADX WARN: Type inference failed for: r10v4, types: [qm] */
    /* JADX WARN: Type inference failed for: r10v5, types: [qm] */
    /* JADX WARN: Type inference failed for: r1v111, types: [com.anthropic.claude.api.model.ThinkingState] */
    /* JADX WARN: Type inference failed for: r1v114, types: [r93] */
    /* JADX WARN: Type inference failed for: r23v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v0, types: [mq5, tp4] */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Integer] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:348:0x0707 -> B:350:0x070b). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(mo1 mo1Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 6;
        this.K = mo1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(t53 t53Var, String str, String str2, Project project, String str3, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 14;
        this.J = t53Var;
        this.G = str;
        this.H = str2;
        this.K = project;
        this.I = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(t53 t53Var, String str, String str2, String str3, String str4, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 12;
        this.K = t53Var;
        this.G = str;
        this.H = str2;
        this.I = str3;
        this.J = str4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(tp4 tp4Var, ybg ybgVar, i iVar, String str, String str2) {
        super(2, tp4Var);
        this.E = 25;
        this.J = ybgVar;
        this.G = str;
        this.H = str2;
        this.K = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(n58 n58Var, String str, jwf jwfVar, i iVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 19;
        this.I = n58Var;
        this.G = str;
        this.J = jwfVar;
        this.K = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(com.anthropic.claude.chat.input.files.a aVar, sw2 sw2Var, String str, ChatEvents$AddAttachment chatEvents$AddAttachment, pz7 pz7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 11;
        this.H = aVar;
        this.I = sw2Var;
        this.G = str;
        this.J = chatEvents$AddAttachment;
        this.K = pz7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.J = obj;
        this.K = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm(Object obj, Object obj2, Object obj3, Object obj4, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.K = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
        this.K = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm(Object obj, Object obj2, Object obj3, String str, Object obj4, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.G = str;
        this.K = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm(Object obj, String str, String str2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.K = obj;
        this.H = str;
        this.I = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm(Object obj, String str, String str2, Object obj2, zy7 zy7Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
        this.G = str;
        this.H = str2;
        this.J = obj2;
        this.K = zy7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm(String str, String str2, String str3, Object obj, String str4, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = str;
        this.H = str2;
        this.I = str3;
        this.K = obj;
        this.J = str4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(xq0 xq0Var, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 2;
        this.K = xq0Var;
        this.G = str;
    }
}
