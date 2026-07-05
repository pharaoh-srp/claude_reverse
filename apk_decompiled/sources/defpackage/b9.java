package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource;
import com.anthropic.claude.api.account.MemoryMode;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.mcpapps.transport.HostContext;
import com.anthropic.claude.sessions.types.RequiresActionDetails;
import com.anthropic.claude.sessions.types.SessionResource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes2.dex */
public final class b9 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;
    public /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
        this.K = obj5;
        this.L = obj6;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b9.d(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b9.n(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj) {
        ChatConversationWithProjectReference chatConversationWithProjectReference;
        String str = (String) this.I;
        kq4 kq4Var = (kq4) this.H;
        int i = this.F;
        iei ieiVar = iei.a;
        tp4 tp4Var = null;
        m45 m45Var = m45.E;
        if (i == 0) {
            sf5.h0(obj);
            ChatConversationWithProjectReference chatConversationWithProjectReferenceT = kq4Var.b.t(str);
            if (chatConversationWithProjectReferenceT != null && !chatConversationWithProjectReferenceT.is_temporary()) {
                ChatConversationWithProjectReference chatConversationWithProjectReferenceM200copyu2nbJzk$default = ChatConversationWithProjectReference.m200copyu2nbJzk$default(chatConversationWithProjectReferenceT, null, null, new Date(), null, null, null, null, false, null, null, false, (String) this.J, 2043, null);
                s52 s52VarJ = knk.J(chatConversationWithProjectReferenceM200copyu2nbJzk$default, ((bj5) this.K).a);
                qi5 qi5Var = new qi5(str, 0);
                ri5 ri5Var = new ri5(kq4Var, (List) this.L, s52VarJ, tp4Var, 0);
                this.H = kq4Var;
                this.G = chatConversationWithProjectReferenceM200copyu2nbJzk$default;
                this.F = 1;
                if (kq4Var.a(qi5Var, ri5Var, this) != m45Var) {
                    chatConversationWithProjectReference = chatConversationWithProjectReferenceM200copyu2nbJzk$default;
                }
            }
        }
        if (i != 1) {
            if (i == 2) {
                sf5.h0(obj);
                return ieiVar;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        chatConversationWithProjectReference = (ChatConversationWithProjectReference) this.G;
        sf5.h0(obj);
        xz8 xz8Var = kq4Var.b;
        this.H = null;
        this.G = null;
        this.F = 2;
        return xz8Var.g(chatConversationWithProjectReference, true, this) == m45Var ? m45Var : ieiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b9.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c4, code lost:
    
        if (r5 == r14) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d0 A[EDGE_INSN: B:88:0x01d0->B:80:0x01d0 BREAK  A[LOOP:1: B:75:0x01b8->B:90:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, tp4] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v6 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b9.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj) throws Throwable {
        fe4 fe4Var;
        kta ktaVar = (kta) this.H;
        int i = this.F;
        int i2 = 1;
        m45 m45Var = m45.E;
        if (i == 0) {
            sf5.h0(obj);
            this.G = ktaVar;
            this.F = 1;
            a3f a3fVar = new a3f(zni.I(this), m45.F);
            r88 r88Var = new r88(a3fVar);
            ktaVar.getClass();
            dgj.r("getMapAsync() must be called on the main thread");
            x7b x7bVar = ktaVar.E;
            lrb lrbVar = (lrb) x7bVar.a;
            if (lrbVar != null) {
                lrbVar.I(r88Var);
            } else {
                ((ArrayList) x7bVar.i).add(r88Var);
            }
            obj = a3fVar.a();
            if (obj == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fe4Var = (fe4) this.G;
                try {
                    sf5.h0(obj);
                    throw new KotlinNothingValueException();
                } catch (Throwable th) {
                    th = th;
                    fe4Var.a();
                    throw th;
                }
            }
            sf5.h0(obj);
        }
        le4 le4Var = new le4((c18) this.J, new hqa((n88) obj, ktaVar, (pqa) this.I));
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            le4Var.A(new ta4(704030801, true, new gz3((jta) this.K, i2, (pz7) this.L)));
            this.G = le4Var;
            this.F = 2;
            d4c.E(this);
            return m45Var;
        } catch (Throwable th3) {
            th = th3;
            fe4Var = le4Var;
            fe4Var.a();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b9.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r11 == r9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r11) throws java.lang.Exception {
        /*
            r10 = this;
            java.lang.Object r0 = r10.K
            dae r0 = (defpackage.dae) r0
            java.lang.Object r1 = r10.I
            dae r1 = (defpackage.dae) r1
            java.lang.Object r2 = r10.J
            x0c r2 = (defpackage.x0c) r2
            java.lang.Object r3 = r10.H
            m1c r3 = (defpackage.m1c) r3
            int r4 = r10.F
            sg5 r5 = defpackage.sg5.H
            r6 = 2
            r7 = 1
            r8 = 0
            m45 r9 = defpackage.m45.E
            if (r4 == 0) goto L32
            if (r4 == r7) goto L2a
            if (r4 != r6) goto L24
            defpackage.sf5.h0(r11)
            goto L95
        L24:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            return r8
        L2a:
            java.lang.Object r4 = r10.G
            dae r4 = (defpackage.dae) r4
            defpackage.sf5.h0(r11)
            goto L4b
        L32:
            defpackage.sf5.h0(r11)
            java.lang.Object r11 = r1.E
            i4e r11 = (defpackage.i4e) r11
            java.lang.Object r4 = r0.E
            m1c r4 = (defpackage.m1c) r4
            r10.H = r3
            r10.G = r1
            r10.F = r7
            java.lang.Object r11 = defpackage.x0c.d(r2, r11, r4, r3, r10)
            if (r11 != r9) goto L4a
            goto L94
        L4a:
            r4 = r1
        L4b:
            r4.E = r11
            r2.getClass()
            defpackage.x0c.h(r3)
            java.lang.Object r11 = r1.E
            if (r11 == 0) goto L84
            i4e r11 = (defpackage.i4e) r11
            m1c r10 = r2.j(r11)
            r0.E = r10
            oeg r10 = new oeg
            java.lang.Object r11 = r1.E
            r11.getClass()
            i4e r11 = (defpackage.i4e) r11
            qi7 r11 = r2.i(r11)
            java.lang.String r1 = r2.a
            java.lang.Object r0 = r0.E
            m1c r0 = (defpackage.m1c) r0
            if (r0 == 0) goto L7c
            z0c r0 = r0.d
            if (r0 == 0) goto L7c
            java.lang.String r8 = r0.a()
        L7c:
            java.lang.String r0 = defpackage.x0c.f(r1, r8)
            r10.<init>(r11, r0, r5)
            return r10
        L84:
            afg r11 = r3.e
            if (r11 == 0) goto Lbb
            r10.H = r3
            r10.G = r8
            r10.F = r6
            java.lang.Object r11 = defpackage.tuj.k(r11, r10)
            if (r11 != r9) goto L95
        L94:
            return r9
        L95:
            okio.Buffer r11 = (okio.Buffer) r11
            long r0 = r11.F
            r6 = 0
            int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r10 <= 0) goto Lba
            oeg r10 = new oeg
            okio.FileSystem r0 = r2.e()
            peg r1 = new peg
            r1.<init>(r11, r0, r8)
            java.lang.String r11 = r2.a
            z0c r0 = r3.d
            java.lang.String r0 = r0.a()
            java.lang.String r11 = defpackage.x0c.f(r11, r0)
            r10.<init>(r1, r11, r5)
            return r10
        Lba:
            return r8
        Lbb:
            java.lang.String r10 = "body == null"
            defpackage.sz6.j(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b9.w(java.lang.Object):java.lang.Object");
    }

    private final Object x(Object obj) throws Throwable {
        ProjectsEvents$ProjectFileSource projectsEvents$ProjectFileSource;
        wmd wmdVar;
        Iterator it;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            List list = (List) this.J;
            wmd wmdVar2 = (wmd) this.K;
            projectsEvents$ProjectFileSource = (ProjectsEvents$ProjectFileSource) this.L;
            wmdVar = wmdVar2;
            it = list.iterator();
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.I;
            projectsEvents$ProjectFileSource = (ProjectsEvents$ProjectFileSource) this.H;
            wmdVar = (wmd) this.G;
            sf5.h0(obj);
        }
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            amd amdVar = wmdVar.j;
            this.G = wmdVar;
            this.H = projectsEvents$ProjectFileSource;
            this.I = it;
            this.F = 1;
            Object objD = amdVar.d(uri, projectsEvents$ProjectFileSource, this);
            m45 m45Var = m45.E;
            if (objD == m45Var) {
                return m45Var;
            }
        }
        return iei.a;
    }

    private final Object y(Object obj) throws Throwable {
        ProjectsEvents$ProjectFileSource projectsEvents$ProjectFileSource;
        lod lodVar;
        Iterator it;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            List list = (List) this.J;
            lod lodVar2 = (lod) this.K;
            projectsEvents$ProjectFileSource = (ProjectsEvents$ProjectFileSource) this.L;
            lodVar = lodVar2;
            it = list.iterator();
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.I;
            projectsEvents$ProjectFileSource = (ProjectsEvents$ProjectFileSource) this.H;
            lodVar = (lod) this.G;
            sf5.h0(obj);
        }
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            amd amdVar = lodVar.q;
            this.G = lodVar;
            this.H = projectsEvents$ProjectFileSource;
            this.I = it;
            this.F = 1;
            Object objD = amdVar.d(uri, projectsEvents$ProjectFileSource, this);
            m45 m45Var = m45.E;
            if (objD == m45Var) {
                return m45Var;
            }
        }
        return iei.a;
    }

    private final Object z(Object obj) throws Throwable {
        Throwable th;
        Context context = (Context) this.J;
        wm0 wm0Var = (wm0) this.I;
        int i = this.F;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        try {
        } catch (CancellationException unused) {
        } catch (Throwable th2) {
            this.G = th2;
            this.F = 2;
            wm0Var.a(context, th2);
            if (ieiVar != m45Var) {
                th = th2;
            }
        }
        if (i == 0) {
            sf5.h0(obj);
            le4 le4Var = (le4) this.H;
            wm0Var.getClass();
            le4Var.A(new ta4(-650544734, true, new um0(context, wm0Var)));
            x7e x7eVar = (x7e) this.K;
            this.F = 1;
            return x7eVar.M(this) == m45Var ? m45Var : ieiVar;
        }
        if (i == 1) {
            sf5.h0(obj);
            return ieiVar;
        }
        if (i != 2) {
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        th = (Throwable) this.G;
        sf5.h0(obj);
        fd9.z((drh) this.L, gjk.b("Error in recomposition coroutine", th));
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                return new b9((f9) this.G, (ApiResult) this.H, (hcb) this.I, (MemoryMode) this.J, (Boolean) this.K, (Boolean) obj2, tp4Var, 0);
            case 1:
                b9 b9Var = new b9((uv) obj2, tp4Var, 1);
                b9Var.K = obj;
                return b9Var;
            case 2:
                b9 b9Var2 = new b9((String) this.H, (co1) this.I, (String) this.J, (String) this.K, (String) obj2, tp4Var, 2);
                b9Var2.G = obj;
                return b9Var2;
            case 3:
                return new b9((String) this.G, (String) this.H, (Map) this.I, (hw2) this.J, (String) this.K, (zy7) obj2, tp4Var, 3);
            case 4:
                b9 b9Var3 = new b9((t53) obj2, tp4Var, 4);
                b9Var3.K = obj;
                return b9Var3;
            case 5:
                return new b9((op3) this.G, (qi3) this.H, (t53) this.I, (ChatMessageActionEvents$ActionSource) this.J, (String) this.K, (String) obj2, tp4Var, 5);
            case 6:
                b9 b9Var4 = new b9((c) this.I, (SessionResource) this.J, (RequiresActionDetails) this.K, (bz7) obj2, tp4Var, 6);
                b9Var4.H = obj;
                return b9Var4;
            case 7:
                b9 b9Var5 = new b9((LinkedHashMap) this.K, (c) obj2, tp4Var, 7);
                b9Var5.J = obj;
                return b9Var5;
            case 8:
                return new b9((i) this.I, (String) this.J, (leb) this.K, (List) obj2, tp4Var, 8);
            case 9:
                return new b9((xm8) this.H, (String) this.I, (String) this.J, (om8) this.K, (nwb) obj2, tp4Var, 9);
            case 10:
                return new b9((hi4) this.H, (DirectoryServer) this.I, (Context) this.J, (gh2) this.K, (d44) obj2, tp4Var, 10);
            case 11:
                b9 b9Var6 = new b9((f15) this.K, (us4) obj2, tp4Var, 11);
                b9Var6.J = obj;
                return b9Var6;
            case 12:
                return new b9((c61) this.H, (String) this.I, (String) this.J, (h6j) this.K, (j15) obj2, tp4Var, 12);
            case 13:
                return new b9((i55) this.G, (d55) this.H, (String) this.I, (String) this.J, (String) this.K, (List) obj2, tp4Var, 13);
            case 14:
                b9 b9Var7 = new b9((k75) obj2, tp4Var, 14);
                b9Var7.K = obj;
                return b9Var7;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                b9 b9Var8 = new b9((y85) obj2, tp4Var, 15);
                b9Var8.K = obj;
                return b9Var8;
            case 16:
                b9 b9Var9 = new b9((String) this.I, (String) this.J, (bj5) this.K, (List) obj2, tp4Var, 16);
                b9Var9.H = obj;
                return b9Var9;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new b9((z36) this.H, (String) this.I, (String) this.J, (String) this.K, (String) obj2, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                b9 b9Var10 = new b9((rp6) this.J, (z9e) this.K, (String) obj2, tp4Var, 18);
                b9Var10.I = obj;
                return b9Var10;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new b9((kta) this.H, (pqa) this.I, (c18) this.J, (jta) this.K, (pz7) obj2, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new b9((bz7) this.G, (vza) this.H, (bg9) this.I, (vya) this.J, (pz7) this.K, (HostContext) obj2, tp4Var, 20);
            case 21:
                b9 b9Var11 = new b9((dae) this.I, (x0c) this.J, (dae) this.K, (j1c) obj2, tp4Var, 21);
                b9Var11.H = obj;
                return b9Var11;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new b9((List) this.J, (wmd) this.K, (ProjectsEvents$ProjectFileSource) obj2, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new b9((List) this.J, (lod) this.K, (ProjectsEvents$ProjectFileSource) obj2, tp4Var, 23);
            case 24:
                return new b9((le4) this.H, (wm0) this.I, (Context) this.J, (x7e) this.K, (drh) obj2, tp4Var, 24);
            default:
                b9 b9Var12 = new b9((e8d) this.H, (bz7) this.I, (bz7) this.J, (rz7) this.K, (bz7) obj2, tp4Var, 25);
                b9Var12.G = obj;
                return b9Var12;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((b9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ((b9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:154|(1:(1:(4:158|212|(1:214)(4:215|(0)(1:231)|160|232)|(4:218|(5:220|(1:222)(2:223|(1:225)(1:229))|(1:227)|228|587)(1:230)|160|232)(1:586))(3:159|160|232))(5:161|535|162|(2:164|165)(1:170)|166))(2:171|(12:173|539|174|(1:176)(1:177)|178|179|529|180|181|(1:184)|211|585)(4:205|206|(1:208)|209))|531|185|(2:187|583)(4:188|206|(0)|209)) */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0361, code lost:
    
        if (r0 == r11) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03f0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x044a, code lost:
    
        if (r0 != r11) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x060c, code lost:
    
        if (r3 == r11) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0611, code lost:
    
        if (r3 == null) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x061d, code lost:
    
        if (r2 == r11) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x085b, code lost:
    
        if (r0 != r11) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0a16, code lost:
    
        if (r0 == r11) goto L448;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0b8f  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0b95  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0b9c  */
    /* JADX WARN: Removed duplicated region for block: B:588:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:599:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:613:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v100, types: [i55] */
    /* JADX WARN: Type inference failed for: r0v48, types: [pt2] */
    /* JADX WARN: Type inference failed for: r1v142 */
    /* JADX WARN: Type inference failed for: r1v143 */
    /* JADX WARN: Type inference failed for: r1v144 */
    /* JADX WARN: Type inference failed for: r1v145 */
    /* JADX WARN: Type inference failed for: r1v146 */
    /* JADX WARN: Type inference failed for: r1v43, types: [int] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v46, types: [com.anthropic.claude.api.chat.UpdateChatModelFallbackResponse] */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r2v135 */
    /* JADX WARN: Type inference failed for: r2v136 */
    /* JADX WARN: Type inference failed for: r2v137 */
    /* JADX WARN: Type inference failed for: r2v138 */
    /* JADX WARN: Type inference failed for: r2v139 */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v59, types: [t53] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.List] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:247:0x0519 -> B:249:0x051e). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.K = obj;
        this.L = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(Object obj, Object obj2, Object obj3, Object obj4, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
        this.J = obj2;
        this.K = obj3;
        this.L = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.K = obj4;
        this.L = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(iwe iweVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.L = iweVar;
    }
}
