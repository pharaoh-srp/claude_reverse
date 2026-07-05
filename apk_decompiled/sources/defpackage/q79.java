package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class q79 implements uja {
    public final mp4 a;
    public final hlj b;
    public final amg c;

    public q79(Context context, h86 h86Var, b4e b4eVar) {
        cbi cbiVar;
        this.a = fd9.c(h86Var.b());
        synchronized (fd9.class) {
            try {
                if (fd9.j == null) {
                    Context applicationContext = context.getApplicationContext();
                    fd9.j = new cbi(applicationContext != null ? applicationContext : context);
                }
                cbiVar = fd9.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        hlj hljVar = (hlj) ((nlj) cbiVar.E).d();
        hljVar.getClass();
        this.b = hljVar;
        this.c = bmg.a(g01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.q79 r11, java.lang.String r12, defpackage.vp4 r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q79.b(q79, java.lang.String, vp4):java.lang.Object");
    }

    @Override // defpackage.uja
    public final void a() {
        amg amgVar = this.c;
        amgVar.getClass();
        amgVar.n(null, g01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.o79
            if (r0 == 0) goto L13
            r0 = r5
            o79 r0 = (defpackage.o79) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            o79 r0 = new o79
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r5)
            goto L50
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r5)
            amg r4 = r4.c
            java.lang.Object r5 = r4.getValue()
            boolean r5 = r5 instanceof defpackage.g01
            if (r5 == 0) goto L3f
            java.lang.String r4 = "Integrity token not requested before calling await."
            defpackage.ij0.y(r4, r2, r3, r3)
            return r2
        L3f:
            bj r5 = new bj
            r1 = 7
            r5.<init>(r1)
            r0.G = r3
            java.lang.Object r5 = defpackage.j8.H(r4, r5, r0)
            m45 r4 = defpackage.m45.E
            if (r5 != r4) goto L50
            return r4
        L50:
            h01 r5 = (defpackage.h01) r5
            java.lang.Object r4 = r5.getValue()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q79.c(vp4):java.lang.Object");
    }

    public final void d(String str) {
        amg amgVar = this.c;
        if ((amgVar.getValue() instanceof f01) || (amgVar.getValue() instanceof e01)) {
            return;
        }
        amgVar.n(null, new e01());
        gb9.D(this.a, null, null, new t74(this, str, (tp4) null, 27), 3);
    }
}
