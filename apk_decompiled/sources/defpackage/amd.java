package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class amd {
    public final wqd a;
    public final oda b;
    public final bi7 c;
    public final k21 d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final zy1 h;
    public final ProjectsEvents$ProjectUploadSource i;
    public final long j;
    public final d8a k;

    public amd(wqd wqdVar, oda odaVar, bi7 bi7Var, k21 k21Var, boolean z, boolean z2, String str, zy1 zy1Var, ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource, long j) {
        str.getClass();
        projectsEvents$ProjectUploadSource.getClass();
        this.a = wqdVar;
        this.b = odaVar;
        this.c = bi7Var;
        this.d = k21Var;
        this.e = z;
        this.f = z2;
        this.g = str;
        this.h = zy1Var;
        this.i = projectsEvents$ProjectUploadSource;
        this.j = j;
        d8a d8aVarE = x44.E();
        j31.a.getClass();
        d8aVarE.addAll(d31.d);
        d8aVarE.remove("image/*");
        if (z2) {
            yw2.a.getClass();
            d8aVarE.addAll(xw2.b);
            d8aVarE.addAll(xw2.c);
        }
        this.k = x44.v(d8aVarE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r13 == r9) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        if (r13 == r9) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        if (r13 == r9) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d9, code lost:
    
        if (r10.h.b(r8, r11) == r9) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.si7 r11, defpackage.j31 r12, defpackage.vp4 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amd.a(si7, j31, vp4):java.lang.Object");
    }

    public final boolean b(String str) {
        d8a d8aVar;
        c8a c8aVar;
        String strL = xb5.l(str);
        if (strL != null && ((d8aVar = this.k) == null || !d8aVar.isEmpty())) {
            ListIterator listIterator = d8aVar.listIterator(0);
            do {
                c8aVar = (c8a) listIterator;
                if (c8aVar.hasNext()) {
                }
            } while (!fsk.e(strL.split("/"), ((String) c8aVar.next()).split("/")));
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dk7 r10, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource r11, boolean r12, defpackage.vp4 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.yld
            if (r0 == 0) goto L14
            r0 = r13
            yld r0 = (defpackage.yld) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.G = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            yld r0 = new yld
            r0.<init>(r9, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r8.E
            int r0 = r8.G
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L27
            defpackage.sf5.h0(r13)
            goto L51
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            r9 = 0
            return r9
        L2e:
            defpackage.sf5.h0(r13)
            java.lang.String r13 = r10.a
            tie r0 = r10.b
            java.lang.String r2 = "file"
            gub r3 = defpackage.htk.g(r2, r13, r0)
            long r4 = r10.c
            int r4 = (int) r4
            r8.G = r1
            wqd r1 = r9.a
            java.lang.String r2 = r9.g
            com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource r7 = r9.i
            r5 = r11
            r6 = r12
            java.lang.Object r13 = r1.y(r2, r3, r4, r5, r6, r7, r8)
            m45 r9 = defpackage.m45.E
            if (r13 != r9) goto L51
            return r9
        L51:
            boolean r9 = r13 instanceof defpackage.of0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amd.c(dk7, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource, boolean, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.net.Uri r20, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource r21, defpackage.vp4 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amd.d(android.net.Uri, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource, vp4):java.lang.Object");
    }
}
