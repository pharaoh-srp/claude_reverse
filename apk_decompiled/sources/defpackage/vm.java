package defpackage;

import android.content.Context;
import com.anthropic.claude.sessions.api.b;
import com.anthropic.claude.sessions.types.SessionResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vm implements sl {
    public final jxb A;
    public final lsc B;
    public final isc C;
    public final lsc D;
    public final lsc E;
    public final lsc F;
    public final n2g G;
    public final y3e H;
    public final kdg I;
    public final lsc J;
    public fkg K;
    public fkg L;
    public fkg M;
    public fkg N;
    public String O;
    public final LinkedHashMap P;
    public String Q;
    public String R;
    public String S;
    public final kdg T;
    public final LinkedHashMap U;
    public final kk V;
    public final jwf a;
    public final b b;
    public final qzb c;
    public final pl d;
    public final koi e;
    public final fq f;
    public final oda g;
    public final qi3 h;
    public final rc8 i;
    public final wlg j;
    public final mp4 k;
    public final ik6 l;
    public final lsc m;
    public final kdg n;
    public final lsc o;
    public final lsc p;
    public String q;
    public final kdg r;
    public final lsc s;
    public final wk t;
    public final rl u;
    public final dpf v;
    public final wk w;
    public final lsc x;
    public final lsc y;
    public final lsc z;

    public vm(jwf jwfVar, b bVar, qzb qzbVar, i8c i8cVar, pl plVar, Context context, ze0 ze0Var, koi koiVar, i25 i25Var, hdc hdcVar, fq fqVar, oda odaVar, h86 h86Var, qi3 qi3Var, z8c z8cVar, j8i j8iVar, rc8 rc8Var) {
        this.a = jwfVar;
        this.b = bVar;
        this.c = qzbVar;
        this.d = plVar;
        this.e = koiVar;
        this.f = fqVar;
        this.g = odaVar;
        this.h = qi3Var;
        this.i = rc8Var;
        this.j = rc8Var.m("sessions_elevated_auth_enforcement");
        mp4 mp4VarG = mwa.G(h86Var);
        this.k = mp4VarG;
        this.l = new ik6(j8iVar, mp4VarG);
        Boolean bool = Boolean.FALSE;
        this.m = mpk.P(bool);
        this.n = new kdg();
        this.o = mpk.P(bool);
        this.p = mpk.P(null);
        this.r = new kdg();
        this.s = mpk.P(bool);
        this.t = new wk(mp4VarG, plVar, i8cVar, koiVar, z8cVar, new vl(this, 0));
        im imVar = new im(0, this);
        rl rlVar = new rl();
        rlVar.F = mp4VarG;
        rlVar.G = jwfVar;
        rlVar.H = i8cVar;
        rlVar.I = imVar;
        rlVar.E = vb7.i();
        this.u = rlVar;
        this.v = new dpf(mp4VarG, jwfVar);
        this.w = new wk(jwfVar, qzbVar, plVar, new vl(this, 1), new dm(0, this, vm.class, "onAgentSessionsFound", "onAgentSessionsFound()V", 0, 0), new wl(this, 0));
        this.x = mpk.P(bool);
        this.y = mpk.P(bool);
        this.z = mpk.P(null);
        this.A = new jxb();
        this.B = mpk.P(null);
        this.C = new isc(0);
        this.D = mpk.P(rk.E);
        this.E = mpk.P(null);
        this.F = mpk.P(kj.E);
        n2g n2gVarB = o2g.b(1, 5, null);
        this.G = n2gVarB;
        this.H = new y3e(n2gVarB);
        this.I = new kdg();
        this.J = mpk.P(null);
        this.P = new LinkedHashMap();
        this.T = new kdg();
        this.U = new LinkedHashMap();
        this.V = new kk(mp4VarG, context, ze0Var, koiVar, i25Var, hdcVar, h86Var, new wl(this, 1), new vl(this, 2));
    }

    public static final void a(vm vmVar, yk ykVar) {
        c8a c8aVar;
        Object next;
        LinkedHashMap linkedHashMap = vmVar.P;
        kdg kdgVar = vmVar.n;
        sfa sfaVar = sfa.DEBUG;
        if (kdgVar == null || !kdgVar.isEmpty()) {
            ListIterator listIterator = kdgVar.listIterator();
            do {
                c8aVar = (c8a) listIterator;
                if (c8aVar.hasNext()) {
                }
            } while (!x44.r(((yk) c8aVar.next()).c(), ykVar.c()));
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                zfa.a.getClass();
                String str = "handleNew: DEDUP " + ykVar.d() + " id=" + ykVar.c();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "AgentChat", str);
                }
                return;
            }
            return;
        }
        String str2 = (String) linkedHashMap.get(ykVar.c());
        if (str2 == null) {
            str2 = vmVar.O;
        }
        kdg kdgVar2 = ykVar.e() == null ? kdgVar : null;
        if (kdgVar2 != null) {
            ListIterator listIterator2 = kdgVar2.listIterator();
            while (true) {
                c8a c8aVar2 = (c8a) listIterator2;
                if (!c8aVar2.hasNext()) {
                    next = null;
                    break;
                }
                next = c8aVar2.next();
                yk ykVar2 = (yk) next;
                if (!x44.r(ykVar2.c(), str2) && x44.r(ykVar2.b(), ykVar.b()) && ykVar2.d() == ykVar.d()) {
                    break;
                }
            }
            yk ykVar3 = (yk) next;
            if (ykVar3 != null) {
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : copyOnWriteArrayList2) {
                        ((n30) ((zfa) obj2)).getClass();
                        arrayList2.add(obj2);
                    }
                    if (!arrayList2.isEmpty()) {
                        zfa.a.getClass();
                        String strC = ykVar.c();
                        String strC2 = ykVar3.c();
                        xm xmVarD = ykVar.d();
                        String strJ1 = bsg.j1(40, ykVar.b());
                        StringBuilder sbR = kgh.r("handleNew: CONTENT TWIN incoming id=", strC, " matches existing id=", strC2, " role=");
                        sbR.append(xmVarD);
                        sbR.append(" text='");
                        sbR.append(strJ1);
                        sbR.append("' — will append (different ids)");
                        String string = sbR.toString();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfa.WARN, "AgentChat", string);
                        }
                    }
                }
            }
        }
        String str3 = (String) linkedHashMap.get(ykVar.c());
        String str4 = vmVar.O;
        if (str3 != null) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList3 = yfa.b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : copyOnWriteArrayList3) {
                    ((n30) ((zfa) obj3)).getClass();
                    arrayList3.add(obj3);
                }
                if (!arrayList3.isEmpty()) {
                    zfa.a.getClass();
                    String strK = ij0.k("handleNew: echo (mapped) server=", ykVar.c(), " → optimistic=", str3);
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        ((n30) ((zfa) it3.next())).b(sfaVar, "AgentChat", strK);
                    }
                }
            }
            vmVar.k(str3, ykVar);
            if (x44.r(str4, str3)) {
                vmVar.O = null;
                return;
            }
            return;
        }
        if (str4 != null && ykVar.d() == xm.E) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList4 = yfa.b;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : copyOnWriteArrayList4) {
                    ((n30) ((zfa) obj4)).getClass();
                    arrayList4.add(obj4);
                }
                if (!arrayList4.isEmpty()) {
                    zfa.a.getClass();
                    String strK2 = ij0.k("handleNew: echo (role-matched) server=", ykVar.c(), " → pending=", str4);
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        ((n30) ((zfa) it4.next())).b(sfaVar, "AgentChat", strK2);
                    }
                }
            }
            linkedHashMap.put(ykVar.c(), str4);
            vmVar.k(str4, ykVar);
            vmVar.O = null;
            return;
        }
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList5 = yfa.b;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : copyOnWriteArrayList5) {
                ((n30) ((zfa) obj5)).getClass();
                arrayList5.add(obj5);
            }
            if (!arrayList5.isEmpty()) {
                zfa.a.getClass();
                String str5 = "handleNew: append " + ykVar.d() + " id=" + ykVar.c() + " at index=" + kdgVar.size();
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    ((n30) ((zfa) it5.next())).b(sfaVar, "AgentChat", str5);
                }
            }
        }
        kdgVar.add(ykVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ca, code lost:
    
        if (r2 == r15) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public static final java.lang.Object b(defpackage.vm r20, java.lang.String r21, defpackage.tp4 r22) {
        /*
            Method dump skipped, instruction units count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm.b(vm, java.lang.String, tp4):java.lang.Object");
    }

    public final rk c() {
        return (rk) this.D.getValue();
    }

    public final SessionResource d() {
        return (SessionResource) this.p.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.s.getValue()).booleanValue();
    }

    public final SessionResource f() {
        return (SessionResource) this.z.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032e A[PHI: r4 r18
      0x032e: PHI (r4v28 java.util.List) = 
      (r4v19 java.util.List)
      (r4v19 java.util.List)
      (r4v19 java.util.List)
      (r4v19 java.util.List)
      (r4v19 java.util.List)
      (r4v30 java.util.List)
     binds: [B:123:0x0298, B:125:0x02a6, B:160:0x032a, B:144:0x02ea, B:286:0x032e, B:18:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x032e: PHI (r18v8 ik6) = (r18v5 ik6), (r18v5 ik6), (r18v5 ik6), (r18v5 ik6), (r18v5 ik6), (r18v9 ik6) binds: [B:123:0x0298, B:125:0x02a6, B:160:0x032a, B:144:0x02ea, B:286:0x032e, B:18:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ae A[PHI: r18
      0x01ae: PHI (r18v3 ik6) = (r18v1 ik6), (r18v4 ik6) binds: [B:83:0x01aa, B:20:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.vp4 r20) {
        /*
            Method dump skipped, instruction units count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm.h(vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r1 == r9) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #1 {all -> 0x004a, blocks: (B:22:0x0045, B:51:0x00af, B:52:0x00b1, B:54:0x00b5, B:70:0x00f0, B:72:0x00f4, B:75:0x0104, B:76:0x010f, B:78:0x0115, B:79:0x0125, B:81:0x012b, B:82:0x0145, B:84:0x014b, B:88:0x015b, B:89:0x0160, B:27:0x0050, B:43:0x0091), top: B:95:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d2 A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:15:0x0035, B:58:0x00ce, B:60:0x00d2, B:63:0x00d8, B:65:0x00de, B:67:0x00e9), top: B:96:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d8 A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:15:0x0035, B:58:0x00ce, B:60:0x00d2, B:63:0x00d8, B:65:0x00de, B:67:0x00e9), top: B:96:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e9 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #2 {all -> 0x003a, blocks: (B:15:0x0035, B:58:0x00ce, B:60:0x00d2, B:63:0x00d8, B:65:0x00de, B:67:0x00e9), top: B:96:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #1 {all -> 0x004a, blocks: (B:22:0x0045, B:51:0x00af, B:52:0x00b1, B:54:0x00b5, B:70:0x00f0, B:72:0x00f4, B:75:0x0104, B:76:0x010f, B:78:0x0115, B:79:0x0125, B:81:0x012b, B:82:0x0145, B:84:0x014b, B:88:0x015b, B:89:0x0160, B:27:0x0050, B:43:0x0091), top: B:95:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [hxb] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [hxb] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [hxb] */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v3, types: [hxb] */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [hxb] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.vp4 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm.i(vp4):java.lang.Object");
    }

    public final void j() {
        this.s.setValue(Boolean.TRUE);
        this.t.f();
    }

    public final void k(String str, yk ykVar) {
        Object next;
        kdg kdgVar = this.n;
        ListIterator listIterator = kdgVar.listIterator();
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (c8aVar.hasNext()) {
                next = c8aVar.next();
                if (x44.r(((yk) next).c(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        yk ykVar2 = (yk) next;
        if (ykVar.f() == null) {
            if ((ykVar2 != null ? ykVar2.f() : null) != null) {
                ykVar = yk.a(ykVar, null, ykVar2.f(), null, 95);
            }
        }
        boolean zW0 = b54.w0(new o8(str, 8), kdgVar);
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String str2 = "replaceOrAdd: target=" + str + " removed=" + zW0 + " → append " + ykVar.d() + " id=" + ykVar.c();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, "AgentChat", str2);
                }
            }
        }
        kdgVar.add(ykVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r18, boolean r19, boolean r20, defpackage.vp4 r21) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm.l(java.lang.String, boolean, boolean, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.vp4 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.mm
            if (r0 == 0) goto L13
            r0 = r6
            mm r0 = (defpackage.mm) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            mm r0 = new mm
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 2
            r3 = 1
            m45 r4 = defpackage.m45.E
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.sf5.h0(r6)
            return r6
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L31:
            defpackage.sf5.h0(r6)
            goto L49
        L35:
            defpackage.sf5.h0(r6)
            r5.q(r3)
            kdg r6 = r5.n
            r6.clear()
            r0.G = r3
            java.lang.Object r6 = r5.i(r0)
            if (r6 != r4) goto L49
            goto L5b
        L49:
            com.anthropic.claude.sessions.types.SessionResource r6 = r5.f()
            if (r6 == 0) goto L5d
            java.lang.String r6 = r6.m875getIdOcx55TE()
            r0.G = r2
            java.lang.Object r5 = r5.n(r6, r0)
            if (r5 != r4) goto L5c
        L5b:
            return r4
        L5c:
            return r5
        L5d:
            r6 = 0
            r5.q(r6)
            xk r6 = defpackage.xk.E
            r5.p(r6)
            iei r5 = defpackage.iei.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm.m(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r9, defpackage.vp4 r10) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm.n(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r23, defpackage.vp4 r24) {
        /*
            Method dump skipped, instruction units count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm.o(java.lang.String, vp4):java.lang.Object");
    }

    public final void p(xk xkVar) {
        this.B.setValue(xkVar);
    }

    public final void q(boolean z) {
        this.m.setValue(Boolean.valueOf(z));
    }

    public final void r(boolean z) {
        this.o.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm.s(java.lang.String, boolean):void");
    }

    public final void t() {
        fkg fkgVar = this.K;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.K = null;
        fkg fkgVar2 = this.L;
        if (fkgVar2 != null) {
            fkgVar2.d(null);
        }
        this.L = null;
        fkg fkgVar3 = this.N;
        if (fkgVar3 != null) {
            fkgVar3.d(null);
        }
        this.N = null;
        fkg fkgVar4 = this.M;
        if (fkgVar4 != null) {
            fkgVar4.d(null);
        }
        this.M = null;
        ik6 ik6Var = this.l;
        fkg fkgVar5 = ik6Var.c;
        if (fkgVar5 != null) {
            fkgVar5.d(null);
        }
        ik6Var.c = null;
    }
}
