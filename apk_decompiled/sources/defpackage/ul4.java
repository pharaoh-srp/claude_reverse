package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ul4 implements x8g, mu9 {
    public long E;
    public ArrayList F;

    @Override // defpackage.mu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        f(j);
        c3d c3dVarU = h5bVar.u(j);
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new b1(c3dVarU, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.x8g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.tp4 r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.tl4
            if (r0 == 0) goto L13
            r0 = r7
            tl4 r0 = (defpackage.tl4) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L1a
        L13:
            tl4 r0 = new tl4
            vp4 r7 = (defpackage.vp4) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.F
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            dae r0 = r0.E
            defpackage.sf5.h0(r7)     // Catch: java.lang.Throwable -> L29
            goto L63
        L29:
            r7 = move-exception
            goto L73
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            r6 = 0
            return r6
        L32:
            defpackage.sf5.h0(r7)
            long r3 = r6.E
            boolean r7 = defpackage.rl4.k(r3)
            if (r7 == 0) goto L7f
            dae r7 = new dae
            r7.<init>()
            r0.E = r7     // Catch: java.lang.Throwable -> L6f
            r0.H = r2     // Catch: java.lang.Throwable -> L6f
            ua2 r1 = new ua2     // Catch: java.lang.Throwable -> L6f
            tp4 r0 = defpackage.zni.I(r0)     // Catch: java.lang.Throwable -> L6f
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6f
            r1.t()     // Catch: java.lang.Throwable -> L6f
            r7.E = r1     // Catch: java.lang.Throwable -> L6f
            java.util.ArrayList r0 = r6.F     // Catch: java.lang.Throwable -> L6f
            r0.add(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r1.r()     // Catch: java.lang.Throwable -> L6f
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L62
            return r1
        L62:
            r0 = r7
        L63:
            java.util.ArrayList r7 = r6.F
            java.lang.Object r0 = r0.E
            java.util.Collection r7 = defpackage.nai.j(r7)
            r7.remove(r0)
            goto L7f
        L6f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L73:
            java.util.ArrayList r6 = r6.F
            java.lang.Object r0 = r0.E
            java.util.Collection r6 = defpackage.nai.j(r6)
            r6.remove(r0)
            throw r7
        L7f:
            long r6 = r6.E
            j8g r0 = new j8g
            int r1 = defpackage.rl4.h(r6)
            s46 r2 = defpackage.s46.a
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r3) goto L97
            defpackage.q46.a(r1)
            q46 r4 = new q46
            r4.<init>(r1)
            goto L98
        L97:
            r4 = r2
        L98:
            int r6 = defpackage.rl4.g(r6)
            if (r6 == r3) goto La6
            defpackage.q46.a(r6)
            q46 r2 = new q46
            r2.<init>(r6)
        La6:
            r0.<init>(r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul4.c(tp4):java.lang.Object");
    }

    public final void f(long j) {
        this.E = j;
        if (rl4.k(j)) {
            return;
        }
        ArrayList arrayList = this.F;
        if (arrayList.isEmpty()) {
            return;
        }
        this.F = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((tp4) it.next()).resumeWith(iei.a);
        }
    }
}
