package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.types.strings.ChatId;
import java.io.File;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
public final class jk5 implements tzb, rzh {
    public final Object E;
    public Object F;
    public final Object G;
    public Object H;
    public Object I;
    public final Object J;
    public Object K;
    public Object L;

    public jk5(fj0 fj0Var, pz7 pz7Var, pz7 pz7Var2, bu2 bu2Var, rz7 rz7Var, bz7 bz7Var) {
        bz7Var.getClass();
        this.E = fj0Var;
        this.F = pz7Var;
        this.G = pz7Var2;
        this.H = bu2Var;
        this.I = rz7Var;
        this.J = bz7Var;
        Object objInvoke = pz7Var.invoke((jyb) fj0Var.F, fj0Var.q());
        objInvoke.getClass();
        this.K = new bm7(objInvoke);
        zy7 zy7Var = (zy7) bz7Var.invoke((jyb) fj0Var.F);
        this.L = zy7Var;
        bu2Var.invoke((jyb) fj0Var.F, null, Boolean.valueOf(zy7Var != null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.jk5 r6, java.lang.Object r7, defpackage.vp4 r8) throws java.lang.Exception {
        /*
            boolean r0 = r8 instanceof defpackage.xqe
            if (r0 == 0) goto L13
            r0 = r8
            xqe r0 = (defpackage.xqe) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            xqe r0 = new xqe
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.F
            int r1 = r0.H
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            io.sentry.p1 r6 = r0.E
            defpackage.sf5.h0(r8)     // Catch: java.lang.Exception -> L28
            goto L7d
        L28:
            r7 = move-exception
            goto L91
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r3
        L30:
            defpackage.sf5.h0(r8)
            java.lang.Object r8 = r6.I
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r1 = ".saveCached"
            java.lang.String r8 = r8.concat(r1)
            java.lang.Object r1 = r6.E
            okio.Path r1 = (okio.Path) r1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Save cache to "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            io.sentry.p1 r8 = defpackage.k2e.v(r8, r1, r3)
            com.anthropic.claude.app.appstart.CachedData r1 = new com.anthropic.claude.app.appstart.CachedData     // Catch: java.lang.Exception -> L8b
            java.lang.Object r4 = r6.G     // Catch: java.lang.Exception -> L8e
            mn5 r4 = (defpackage.mn5) r4     // Catch: java.lang.Exception -> L8e
            long r4 = r4.a()     // Catch: java.lang.Exception -> L8b
            r1.<init>(r7, r4)     // Catch: java.lang.Exception -> L8b
            java.lang.Object r7 = r6.K     // Catch: java.lang.Exception -> L8e
            h86 r7 = (defpackage.h86) r7     // Catch: java.lang.Exception -> L8e
            e45 r7 = r7.b()     // Catch: java.lang.Exception -> L8b
            ab0 r4 = new ab0     // Catch: java.lang.Exception -> L8b
            r5 = 16
            r4.<init>(r6, r1, r3, r5)     // Catch: java.lang.Exception -> L8b
            r0.E = r8     // Catch: java.lang.Exception -> L8b
            r0.H = r2     // Catch: java.lang.Exception -> L8b
            java.lang.Object r6 = defpackage.gb9.c0(r7, r4, r0)     // Catch: java.lang.Exception -> L8b
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L7c
            return r7
        L7c:
            r6 = r8
        L7d:
            iei r7 = defpackage.iei.a     // Catch: java.lang.Exception -> L28
            io.sentry.n7 r8 = r6.e()     // Catch: java.lang.Exception -> L28
            if (r8 != 0) goto L87
            io.sentry.n7 r8 = io.sentry.n7.OK     // Catch: java.lang.Exception -> L28
        L87:
            r6.m(r8)     // Catch: java.lang.Exception -> L28
            return r7
        L8b:
            r7 = move-exception
        L8c:
            r6 = r8
            goto L91
        L8e:
            r6 = move-exception
            r7 = r6
            goto L8c
        L91:
            io.sentry.n7 r8 = io.sentry.n7.INTERNAL_ERROR
            r6.m(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk5.b(jk5, java.lang.Object, vp4):java.lang.Object");
    }

    @Override // defpackage.rzh
    public boolean c(String str, znb znbVar) {
        znbVar.getClass();
        return ((Boolean) (str != null ? ((bz7) this.J).invoke(ChatId.m978boximpl(str)) : ((zy7) this.K).a())).booleanValue();
    }

    public r4e d() {
        na4 na4Var;
        Context context = (Context) this.E;
        hx8 hx8Var = (hx8) this.F;
        ae7 ae7Var = (ae7) this.L;
        ae7Var.getClass();
        hx8 hx8VarA = hx8.a(hx8Var, null, null, null, new be7(mwa.V(ae7Var.a)), 8191);
        kw9 u0hVar = (kw9) this.G;
        if (u0hVar == null) {
            u0hVar = new u0h(new jd7(23));
        }
        kw9 u0hVar2 = (kw9) this.H;
        if (u0hVar2 == null) {
            u0hVar2 = new u0h(new dg8(5, this));
        }
        kw9 u0hVar3 = (kw9) this.I;
        if (u0hVar3 == null) {
            u0hVar3 = new u0h(new jd7(24));
        }
        sz6 sz6Var = (sz6) this.J;
        if (sz6Var == null) {
            sz6Var = sz6.F;
        }
        na4 na4Var2 = (na4) this.K;
        if (na4Var2 == null) {
            lm6 lm6Var = lm6.E;
            na4Var = new na4(lm6Var, lm6Var, lm6Var, lm6Var, lm6Var);
        } else {
            na4Var = na4Var2;
        }
        return new r4e(new n4e(context, hx8VarA, u0hVar, u0hVar2, u0hVar3, sz6Var, na4Var));
    }

    @Override // defpackage.rzh
    public int e(String str, znb znbVar) {
        int i = str != null ? R.string.tool_setting_cant_change_for_chat : 0;
        if (i != 0) {
            return i;
        }
        return ((Number) ((pz7) this.I).invoke(str != null ? ChatId.m978boximpl(str) : null, znbVar)).intValue();
    }

    @Override // defpackage.tzb
    public void f(qj5 qj5Var) {
        v40.p((ob1) this.E, "NDK crash report ", (h99) this.G, new j01(this, 9, qj5Var));
    }

    @Override // defpackage.rzh
    public boolean g() {
        return ((Boolean) ((zy7) this.H).a()).booleanValue();
    }

    public void i() {
        File file = (File) this.J;
        Object obj = this.G;
        h99 h99Var = (h99) obj;
        if (fd9.T(file, h99Var)) {
            try {
                File[] fileArrJ0 = fd9.j0(file, h99Var);
                if (fileArrJ0 != null) {
                    for (File file2 : fileArrJ0) {
                        nk7.l0(file2);
                    }
                }
            } catch (Throwable th) {
                dch.I((h99) obj, 5, x44.X(g99.F, g99.G), new v01(9, this), th, 48);
            }
        }
    }

    @Override // defpackage.rzh
    public boolean isVisible() {
        return ((Boolean) ((zy7) this.G).a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6 A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:42:0x00b0, B:44:0x00b6, B:45:0x00b8, B:39:0x0095, B:20:0x003f, B:29:0x0073, B:31:0x0079, B:40:0x00ac, B:47:0x00bc, B:48:0x00c1), top: B:55:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v0, types: [bz7] */
    /* JADX WARN: Type inference failed for: r11v1, types: [io.sentry.p1] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(defpackage.bz7 r11, defpackage.vp4 r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk5.j(bz7, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(defpackage.vp4 r8) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.wqe
            if (r0 == 0) goto L13
            r0 = r8
            wqe r0 = (defpackage.wqe) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            wqe r0 = new wqe
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.F
            int r1 = r0.H
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            io.sentry.p1 r7 = r0.E
            defpackage.sf5.h0(r8)     // Catch: java.lang.Exception -> L28
            goto L72
        L28:
            r8 = move-exception
            goto L82
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r3
        L30:
            defpackage.sf5.h0(r8)
            java.lang.Object r8 = r7.I
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r1 = ".getCached"
            java.lang.String r8 = r8.concat(r1)
            java.lang.Object r1 = r7.E
            okio.Path r1 = (okio.Path) r1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Load cache from "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            io.sentry.p1 r8 = defpackage.k2e.v(r8, r1, r3)
            java.lang.Object r1 = r7.K     // Catch: java.lang.Exception -> L7e
            h86 r1 = (defpackage.h86) r1     // Catch: java.lang.Exception -> L7e
            e45 r1 = r1.b()     // Catch: java.lang.Exception -> L7e
            fj r4 = new fj     // Catch: java.lang.Exception -> L7e
            r5 = 22
            r4.<init>(r7, r3, r5)     // Catch: java.lang.Exception -> L7e
            r0.E = r8     // Catch: java.lang.Exception -> L7e
            r0.H = r2     // Catch: java.lang.Exception -> L7e
            java.lang.Object r7 = defpackage.gb9.c0(r1, r4, r0)     // Catch: java.lang.Exception -> L7e
            m45 r0 = defpackage.m45.E
            if (r7 != r0) goto L6f
            return r0
        L6f:
            r6 = r8
            r8 = r7
            r7 = r6
        L72:
            io.sentry.n7 r0 = r7.e()     // Catch: java.lang.Exception -> L28
            if (r0 != 0) goto L7a
            io.sentry.n7 r0 = io.sentry.n7.OK     // Catch: java.lang.Exception -> L28
        L7a:
            r7.m(r0)     // Catch: java.lang.Exception -> L28
            return r8
        L7e:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L82:
            io.sentry.n7 r0 = io.sentry.n7.INTERNAL_ERROR
            r7.m(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk5.k(vp4):java.lang.Object");
    }

    public void l(jyb jybVar, jyb jybVar2) {
        Object obj;
        Map map;
        this.L = (zy7) ((bz7) this.J).invoke(jybVar);
        bm7 bm7Var = (bm7) this.K;
        Object objInvoke = ((pz7) this.F).invoke(jybVar, ((fj0) this.E).q());
        bm7Var.getClass();
        objInvoke.getClass();
        synchronized (((efk) bm7Var.b)) {
            bm7Var.c = objInvoke;
            if (!bm7Var.a) {
                bm7Var.a = true;
                while (true) {
                    synchronized (((efk) bm7Var.b)) {
                        obj = bm7Var.c;
                        map = (Map) bm7Var.d;
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        bz7 bz7Var = (bz7) entry.getKey();
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            bz7Var.invoke(obj);
                        }
                    }
                    synchronized (((efk) bm7Var.b)) {
                        if (obj == bm7Var.c) {
                            break;
                        }
                    }
                }
                bm7Var.a = false;
            }
        }
        ((bu2) this.H).invoke(jybVar, jybVar2, Boolean.valueOf(((zy7) this.L) != null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(defpackage.bz7 r7, defpackage.vp4 r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.yqe
            if (r0 == 0) goto L13
            r0 = r8
            yqe r0 = (defpackage.yqe) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            yqe r0 = new yqe
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.F
            int r1 = r0.H
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            io.sentry.p1 r6 = r0.E
            defpackage.sf5.h0(r8)     // Catch: java.lang.Exception -> L28
            goto L6f
        L28:
            r7 = move-exception
            goto L83
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r3
        L30:
            defpackage.sf5.h0(r8)
            java.lang.Object r8 = r6.I
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r1 = ".updateCached"
            java.lang.String r8 = r8.concat(r1)
            java.lang.Object r1 = r6.E
            okio.Path r1 = (okio.Path) r1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Update cache at "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            io.sentry.p1 r8 = defpackage.k2e.v(r8, r1, r3)
            java.lang.Object r1 = r6.K     // Catch: java.lang.Exception -> L80
            h86 r1 = (defpackage.h86) r1     // Catch: java.lang.Exception -> L80
            e45 r1 = r1.b()     // Catch: java.lang.Exception -> L7d
            x1d r4 = new x1d     // Catch: java.lang.Exception -> L7d
            r5 = 3
            r4.<init>(r6, r7, r3, r5)     // Catch: java.lang.Exception -> L7d
            r0.E = r8     // Catch: java.lang.Exception -> L7d
            r0.H = r2     // Catch: java.lang.Exception -> L7d
            java.lang.Object r6 = defpackage.gb9.c0(r1, r4, r0)     // Catch: java.lang.Exception -> L7d
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L6e
            return r7
        L6e:
            r6 = r8
        L6f:
            iei r7 = defpackage.iei.a     // Catch: java.lang.Exception -> L28
            io.sentry.n7 r8 = r6.e()     // Catch: java.lang.Exception -> L28
            if (r8 != 0) goto L79
            io.sentry.n7 r8 = io.sentry.n7.OK     // Catch: java.lang.Exception -> L28
        L79:
            r6.m(r8)     // Catch: java.lang.Exception -> L28
            return r7
        L7d:
            r7 = move-exception
        L7e:
            r6 = r8
            goto L83
        L80:
            r6 = move-exception
            r7 = r6
            goto L7e
        L83:
            io.sentry.n7 r8 = io.sentry.n7.INTERNAL_ERROR
            r6.m(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk5.m(bz7, vp4):java.lang.Object");
    }

    public jk5(Path path, String str, KSerializer kSerializer, mn5 mn5Var, FileSystem fileSystem, bg9 bg9Var, h86 h86Var, Long l) {
        kSerializer.getClass();
        this.E = path;
        this.I = str;
        this.F = kSerializer;
        this.G = mn5Var;
        this.H = fileSystem;
        this.J = bg9Var;
        this.K = h86Var;
        this.L = l;
    }

    public jk5(cbf cbfVar, zy7 zy7Var, zy7 zy7Var2, pz7 pz7Var, bz7 bz7Var, zy7 zy7Var3, bz7 bz7Var2) {
        this.F = cbfVar;
        this.G = zy7Var;
        this.H = zy7Var2;
        this.I = pz7Var;
        this.J = bz7Var;
        this.K = zy7Var3;
        this.L = bz7Var2;
        this.E = cbfVar;
    }

    public jk5(Context context) {
        this.E = context.getApplicationContext();
        this.F = hx8.o;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = new ae7();
    }

    public jk5(n4e n4eVar) {
        this.E = n4eVar.a;
        hx8 hx8Var = n4eVar.b;
        this.F = hx8Var;
        this.G = n4eVar.c;
        this.H = n4eVar.d;
        this.I = n4eVar.e;
        this.J = n4eVar.f;
        this.K = n4eVar.g;
        be7 be7Var = hx8Var.n;
        be7Var.getClass();
        this.L = new ae7(be7Var);
    }

    public jk5(File file, ob1 ob1Var, rga rgaVar, h99 h99Var, n25 n25Var, String str) {
        h99Var.getClass();
        this.E = ob1Var;
        this.F = rgaVar;
        this.G = h99Var;
        this.H = n25Var;
        this.I = str;
        this.J = new File(file, "ndk_crash_reports_v2");
    }
}
