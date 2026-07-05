package defpackage;

import com.anthropic.claude.api.account.AppStartResponse;
import okio.FileSystem;

/* JADX INFO: loaded from: classes.dex */
public final class ok0 {
    public final mn5 a;
    public final tf5 b;
    public final FileSystem c;
    public final bg9 d;
    public final h86 e;
    public final xjc f;
    public final lea g;

    public ok0(mn5 mn5Var, tf5 tf5Var, FileSystem fileSystem, bg9 bg9Var, h86 h86Var, xjc xjcVar, lea leaVar) {
        this.a = mn5Var;
        this.b = tf5Var;
        this.c = fileSystem;
        this.d = bg9Var;
        this.e = h86Var;
        this.f = xjcVar;
        this.g = leaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, defpackage.vp4 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.lk0
            if (r0 == 0) goto L13
            r0 = r9
            lk0 r0 = (defpackage.lk0) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            lk0 r0 = new lk0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L38
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            com.anthropic.claude.api.result.ApiResult r7 = r0.E
            defpackage.sf5.h0(r9)
            return r7
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r5
        L34:
            defpackage.sf5.h0(r9)
            goto L4d
        L38:
            defpackage.sf5.h0(r9)
            jk5 r9 = r7.c(r8)
            mk0 r1 = new mk0
            r1.<init>(r7, r8, r5, r2)
            r0.H = r4
            java.lang.Object r9 = r9.j(r1, r0)
            if (r9 != r6) goto L4d
            goto L99
        L4d:
            com.anthropic.claude.api.result.ApiResult r9 = (com.anthropic.claude.api.result.ApiResult) r9
            boolean r8 = r9 instanceof defpackage.of0
            if (r8 == 0) goto L66
            r8 = r9
            of0 r8 = (defpackage.of0) r8
            java.lang.Object r8 = r8.b
            com.anthropic.claude.api.account.AppStartResponse r8 = (com.anthropic.claude.api.account.AppStartResponse) r8
            java.util.Map r8 = r8.getServer_localizations()
            if (r8 == 0) goto L6a
            lea r1 = r7.g
            defpackage.lea.c(r1, r8)
            goto L6a
        L66:
            boolean r8 = r9 instanceof defpackage.nf0
            if (r8 == 0) goto L9b
        L6a:
            boolean r8 = r9 instanceof defpackage.lf0
            if (r8 == 0) goto L72
            r8 = r9
            lf0 r8 = (defpackage.lf0) r8
            goto L73
        L72:
            r8 = r5
        L73:
            if (r8 == 0) goto L9a
            bj3 r8 = r8.b()
            boolean r8 = defpackage.rkk.h(r8)
            if (r8 != r4) goto L9a
            r0.E = r9
            r0.H = r3
            h86 r8 = r7.e
            e45 r8 = r8.b()
            kk0 r1 = new kk0
            r1.<init>(r7, r5, r2)
            java.lang.Object r7 = defpackage.gb9.c0(r8, r1, r0)
            if (r7 != r6) goto L95
            goto L97
        L95:
            iei r7 = defpackage.iei.a
        L97:
            if (r7 != r6) goto L9a
        L99:
            return r6
        L9a:
            return r9
        L9b:
            defpackage.mr9.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ok0.a(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.nk0
            if (r0 == 0) goto L13
            r0 = r6
            nk0 r0 = (defpackage.nk0) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            nk0 r0 = new nk0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r6)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r6)
            jk5 r5 = r4.c(r5)
            r0.G = r2
            java.lang.Object r6 = r5.k(r0)
            m45 r5 = defpackage.m45.E
            if (r6 != r5) goto L3e
            return r5
        L3e:
            com.anthropic.claude.api.account.AppStartResponse r6 = (com.anthropic.claude.api.account.AppStartResponse) r6
            if (r6 == 0) goto L4d
            java.util.Map r5 = r6.getServer_localizations()
            if (r5 == 0) goto L4d
            lea r4 = r4.g
            defpackage.lea.c(r4, r5)
        L4d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ok0.b(java.lang.String, vp4):java.lang.Object");
    }

    public final jk5 c(String str) {
        return new jk5(this.b.b().e("app_start").e("org_" + str), "AppStartCache", AppStartResponse.Companion.serializer(), this.a, this.c, this.d, this.e, 2332800000L);
    }
}
