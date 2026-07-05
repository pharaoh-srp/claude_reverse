package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i6c {
    public final raf a;
    public final pz7 b;
    public cz5 c;
    public boolean d;
    public final i49 e = new i49();

    public i6c(raf rafVar, pz7 pz7Var, cz5 cz5Var) {
        this.a = rafVar;
        this.b = pz7Var;
        this.c = cz5Var;
    }

    public static void a(t7d t7dVar) {
        List list = t7dVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((z7d) list.get(i)).a();
        }
    }

    public final void b(cz5 cz5Var) {
        this.c = cz5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.pz7 r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.h6c
            if (r0 == 0) goto L13
            r0 = r6
            h6c r0 = (defpackage.h6c) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            h6c r0 = new h6c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r6)
            goto L43
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r6)
            r4.d = r3
            kza r6 = new kza
            r1 = 9
            r6.<init>(r4, r5, r2, r1)
            r0.G = r3
            java.lang.Object r5 = defpackage.iuj.N(r6, r0)
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto L43
            return r6
        L43:
            r5 = 0
            r4.d = r5
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i6c.c(pz7, vp4):java.lang.Object");
    }
}
