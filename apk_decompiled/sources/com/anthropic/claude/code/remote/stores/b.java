package com.anthropic.claude.code.remote.stores;

import android.content.SharedPreferences;
import com.anthropic.claude.analytics.events.CodeEvents$EnvironmentListingFailed;
import com.anthropic.claude.code.remote.stores.SessionTarget;
import com.anthropic.claude.sessions.types.EnvironmentResource;
import defpackage.f1c;
import defpackage.gwj;
import defpackage.h86;
import defpackage.iuj;
import defpackage.jwf;
import defpackage.lsc;
import defpackage.ltk;
import defpackage.n30;
import defpackage.qi3;
import defpackage.rc8;
import defpackage.sfa;
import defpackage.yfa;
import defpackage.zfa;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final jwf a;
    public final a b;
    public final h86 c;
    public final qi3 d;
    public final String e;
    public final rc8 f;
    public final f1c g;
    public final lsc h;
    public final lsc i;
    public final lsc j;
    public final lsc k;
    public final lsc l;
    public final lsc m;
    public final lsc n;
    public final lsc o;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(defpackage.jwf r5, com.anthropic.claude.code.remote.stores.a r6, defpackage.h86 r7, defpackage.qi3 r8, java.lang.String r9, defpackage.rc8 r10, defpackage.f1c r11) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.stores.b.<init>(jwf, com.anthropic.claude.code.remote.stores.a, h86, qi3, java.lang.String, rc8, f1c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (r1 == r10) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023e A[PHI: r2 r3 r7 r9
      0x023e: PHI (r2v3 fr6) = (r2v4 fr6), (r2v5 fr6) binds: [B:25:0x0092, B:20:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r3v1 int) = (r3v2 int), (r3v4 int) binds: [B:25:0x0092, B:20:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r7v1 int) = (r7v2 int), (r7v3 int) binds: [B:25:0x0092, B:20:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r9v1 ??) = (r9v27 ??), (r9v28 ??) binds: [B:25:0x0092, B:20:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0264  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.anthropic.claude.code.remote.stores.SessionTarget, com.anthropic.claude.sessions.types.EnvironmentResource, dae, java.util.Iterator, java.util.List] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.anthropic.claude.code.remote.stores.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.anthropic.claude.sessions.types.EnvironmentResource, java.util.Iterator, java.util.List, tp4] */
    /* JADX WARN: Type inference failed for: r9v4, types: [tp4] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:27:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ce -> B:33:0x00d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r23) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.stores.b.a(vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (j(r0) == r7) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, java.lang.String r10, defpackage.vp4 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.stores.b.b(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, defpackage.vp4 r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.stores.b.c(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, defpackage.vp4 r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.stores.b.d(java.lang.String, vp4):java.lang.Object");
    }

    public final SessionTarget e() {
        return (SessionTarget) this.m.getValue();
    }

    public final List f() {
        return (List) this.h.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final boolean h(EnvironmentResource environmentResource) {
        Integer num = (Integer) ((Map) this.n.getValue()).get(environmentResource.getEnvironment_id());
        return (num != null ? num.intValue() : 0) >= gwj.h(environmentResource);
    }

    public final boolean i() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c6, code lost:
    
        if (l(r0) == r10) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bc A[PHI: r1
      0x01bc: PHI (r1v19 boolean) = (r1v18 boolean), (r1v18 boolean), (r1v20 boolean) binds: [B:81:0x01af, B:83:0x01b9, B:24:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01be A[Catch: all -> 0x0037, Exception -> 0x003a, CancellationException -> 0x003d, TryCatch #3 {CancellationException -> 0x003d, Exception -> 0x003a, blocks: (B:13:0x0032, B:89:0x01c9, B:24:0x0048, B:86:0x01be, B:25:0x004d, B:34:0x0079, B:36:0x007f, B:51:0x010a, B:54:0x011c, B:55:0x011f, B:57:0x0125, B:59:0x0131, B:60:0x013b, B:62:0x0141, B:65:0x014f, B:67:0x0153, B:69:0x0158, B:70:0x015b, B:71:0x016a, B:73:0x0170, B:75:0x017d, B:76:0x0181, B:77:0x0190, B:79:0x0196, B:80:0x01a4, B:82:0x01b1, B:39:0x00a1, B:40:0x00b2, B:42:0x00b8, B:44:0x00c7, B:45:0x00cb, B:47:0x00d1, B:48:0x00f8, B:50:0x00fe, B:90:0x01ce, B:93:0x01d4, B:95:0x01e1, B:96:0x01ec, B:111:0x0263, B:99:0x0203, B:100:0x0214, B:102:0x021a, B:104:0x0229, B:105:0x022d, B:107:0x0233, B:108:0x0251, B:110:0x0257, B:112:0x0279, B:114:0x027d, B:129:0x02fb, B:117:0x0296, B:118:0x02a7, B:120:0x02ad, B:122:0x02bc, B:123:0x02c0, B:125:0x02c6, B:126:0x02e9, B:128:0x02ef, B:132:0x030a, B:133:0x030f, B:31:0x0063), top: B:153:0x002a, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.vp4 r15) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.stores.b.j(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.Set r10, defpackage.vp4 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.stores.b.k(java.util.Set, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.vp4 r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.stores.b.l(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r8, defpackage.vp4 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.pr6
            if (r0 == 0) goto L13
            r0 = r9
            pr6 r0 = (defpackage.pr6) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            pr6 r0 = new pr6
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.F
            int r1 = r0.H
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            com.anthropic.claude.sessions.types.EnvironmentResource r7 = r0.E
            defpackage.sf5.h0(r9)
            return r7
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r4
        L33:
            defpackage.sf5.h0(r9)
            goto L6d
        L37:
            defpackage.sf5.h0(r9)
            java.util.List r9 = r7.f()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L44:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r9.next()
            r6 = r1
            com.anthropic.claude.sessions.types.EnvironmentResource r6 = (com.anthropic.claude.sessions.types.EnvironmentResource) r6
            java.lang.String r6 = r6.getEnvironment_id()
            boolean r6 = defpackage.x44.r(r6, r8)
            if (r6 == 0) goto L44
            r4 = r1
        L5c:
            com.anthropic.claude.sessions.types.EnvironmentResource r4 = (com.anthropic.claude.sessions.types.EnvironmentResource) r4
            if (r4 == 0) goto L64
            r7.p(r4)
            return r4
        L64:
            r0.H = r3
            java.lang.Object r9 = r7.d(r8, r0)
            if (r9 != r5) goto L6d
            goto L8c
        L6d:
            com.anthropic.claude.sessions.types.EnvironmentResource r9 = (com.anthropic.claude.sessions.types.EnvironmentResource) r9
            if (r9 == 0) goto L8d
            r7.p(r9)
            boolean r8 = defpackage.gwj.j(r9)
            if (r8 == 0) goto L8d
            java.lang.String r8 = r9.getEnvironment_id()
            java.util.Set r8 = defpackage.sf5.f0(r8)
            r0.E = r9
            r0.H = r2
            java.lang.Object r7 = r7.k(r8, r0)
            if (r7 != r5) goto L8d
        L8c:
            return r5
        L8d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.stores.b.m(java.lang.String, vp4):java.lang.Object");
    }

    public final void n() {
        this.k.setValue(Boolean.TRUE);
    }

    public final void o(Throwable th) {
        if (this.g.b() && !(th instanceof UnknownHostException)) {
            this.d.e(new CodeEvents$EnvironmentListingFailed(this.e, ltk.n(th)), CodeEvents$EnvironmentListingFailed.Companion.serializer());
            return;
        }
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
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
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.WARN, strE, "Environment listing failed while offline; skipping *_listing_failed telemetry");
            }
        }
    }

    public final void p(EnvironmentResource environmentResource) {
        q(environmentResource != null ? new SessionTarget.Environment(environmentResource) : null);
    }

    public final void q(SessionTarget sessionTarget) {
        this.m.setValue(sessionTarget);
        a aVar = this.b;
        SharedPreferences.Editor editorEdit = aVar.a.edit();
        if (sessionTarget != null) {
            editorEdit.putString("default_session_target", aVar.b.d(sessionTarget, SessionTarget.Companion.serializer()));
        } else {
            editorEdit.remove("default_session_target");
        }
        editorEdit.remove("default_environment");
        editorEdit.apply();
    }
}
