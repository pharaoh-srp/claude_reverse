package defpackage;

import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.sessions.types.SessionStatus;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ep extends iwe {
    public final jwf b;
    public final tvf c;
    public final mn5 d;
    public final lsc e;
    public final lsc f;
    public final lsc g;
    public final lsc h;
    public final lsc i;
    public final lsc j;
    public final wz5 k;
    public final wz5 l;
    public boolean m;

    public ep(jwf jwfVar, tvf tvfVar, h86 h86Var, mn5 mn5Var) {
        super(h86Var);
        this.b = jwfVar;
        this.c = tvfVar;
        this.d = mn5Var;
        this.e = mpk.P(lm6.E);
        Boolean bool = Boolean.FALSE;
        this.f = mpk.P(bool);
        this.g = mpk.P(bool);
        this.h = mpk.P(bool);
        this.i = mpk.P(mn5Var.e());
        this.j = mpk.P(um6.E);
        final int i = 0;
        this.k = mpk.w(new zy7(this) { // from class: xo
            public final /* synthetic */ ep F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                ep epVar = this.F;
                switch (i2) {
                    case 0:
                        List listP = epVar.P();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listP) {
                            if (((SessionResource) obj).getSession_status() != SessionStatus.ARCHIVED) {
                                arrayList.add(obj);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            SessionResource sessionResource = (SessionResource) obj2;
                            if (epVar.Q().isEmpty() || epVar.Q().contains(gok.f(sessionResource))) {
                                arrayList2.add(obj2);
                            }
                        }
                        return w44.i1(arrayList2, new mt7(8));
                    default:
                        long jB = ((c69) epVar.i.getValue()).b();
                        List list = (List) epVar.k.getValue();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj3 : list) {
                            n6e n6eVarB = bm4.b(n6e.F, ((SessionResource) obj3).getUpdated_at().b(), jB);
                            Object arrayList3 = linkedHashMap.get(n6eVarB);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                linkedHashMap.put(n6eVarB, arrayList3);
                            }
                            ((List) arrayList3).add(obj3);
                        }
                        return sta.o0(linkedHashMap);
                }
            }
        });
        final int i2 = 1;
        this.l = mpk.w(new zy7(this) { // from class: xo
            public final /* synthetic */ ep F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                ep epVar = this.F;
                switch (i22) {
                    case 0:
                        List listP = epVar.P();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listP) {
                            if (((SessionResource) obj).getSession_status() != SessionStatus.ARCHIVED) {
                                arrayList.add(obj);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            SessionResource sessionResource = (SessionResource) obj2;
                            if (epVar.Q().isEmpty() || epVar.Q().contains(gok.f(sessionResource))) {
                                arrayList2.add(obj2);
                            }
                        }
                        return w44.i1(arrayList2, new mt7(8));
                    default:
                        long jB = ((c69) epVar.i.getValue()).b();
                        List list = (List) epVar.k.getValue();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj3 : list) {
                            n6e n6eVarB = bm4.b(n6e.F, ((SessionResource) obj3).getUpdated_at().b(), jB);
                            Object arrayList3 = linkedHashMap.get(n6eVarB);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                linkedHashMap.put(n6eVarB, arrayList3);
                            }
                            ((List) arrayList3).add(obj3);
                        }
                        return sta.o0(linkedHashMap);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        if (defpackage.d4c.L(r9, r0) != r7) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[PHI: r1 r8
      0x007a: PHI (r1v3 cae) = (r1v4 cae), (r1v4 cae), (r1v6 cae) binds: [B:22:0x006b, B:24:0x0077, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x007a: PHI (r8v4 z9e) = (r8v5 z9e), (r8v5 z9e), (r8v7 z9e) binds: [B:22:0x006b, B:24:0x0077, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d A[PHI: r1 r8
      0x009d: PHI (r1v2 cae) = (r1v3 cae), (r1v7 cae) binds: [B:27:0x009a, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r8v3 z9e) = (r8v4 z9e), (r8v8 z9e) binds: [B:27:0x009a, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a9 -> B:32:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.ep r12, defpackage.vp4 r13) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep.O(ep, vp4):java.lang.Object");
    }

    public final List P() {
        return (List) this.e.getValue();
    }

    public final Set Q() {
        return (Set) this.j.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(defpackage.vp4 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ap
            if (r0 == 0) goto L13
            r0 = r7
            ap r0 = (defpackage.ap) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            ap r0 = new ap
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.G
            r2 = 0
            lsc r3 = r6.f
            iei r4 = defpackage.iei.a
            r5 = 1
            if (r1 == 0) goto L32
            if (r1 != r5) goto L2c
            defpackage.sf5.h0(r7)     // Catch: java.lang.Throwable -> L2a
            goto L5b
        L2a:
            r6 = move-exception
            goto L68
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r2
        L32:
            defpackage.sf5.h0(r7)
            java.lang.Object r7 = r3.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L42
            return r4
        L42:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r3.setValue(r7)
            r0.G = r5     // Catch: java.lang.Throwable -> L2a
            zo r7 = new zo     // Catch: java.lang.Throwable -> L2a
            r7.<init>(r6, r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = defpackage.fd9.N(r7, r0)     // Catch: java.lang.Throwable -> L2a
            m45 r0 = defpackage.m45.E
            if (r7 != r0) goto L57
            goto L58
        L57:
            r7 = r4
        L58:
            if (r7 != r0) goto L5b
            return r0
        L5b:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r3.setValue(r7)
            lsc r6 = r6.g
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.setValue(r7)
            return r4
        L68:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r3.setValue(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep.R(vp4):java.lang.Object");
    }
}
