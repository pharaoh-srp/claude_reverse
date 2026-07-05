package defpackage;

import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class bt5 {
    public static final zs5 h = new zs5(0);
    public static final Random i = new Random();
    public q7b d;
    public String f;
    public final kqh a = new kqh();
    public final jqh b = new jqh();
    public final HashMap c = new HashMap();
    public mqh e = mqh.a;
    public long g = -1;

    public final void a(at5 at5Var) {
        long j = at5Var.c;
        if (j != -1 && at5Var.e) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.at5 b(int r19, defpackage.z7b r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto La4
            java.lang.Object r8 = r4.next()
            at5 r8 = (defpackage.at5) r8
            long r9 = r8.c
            z7b r11 = r8.d
            r12 = -1
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L57
            int r9 = r8.b
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            long r9 = r2.d
            bt5 r14 = r8.g
            java.util.HashMap r15 = r14.c
            r16 = r12
            java.lang.String r12 = r14.f
            java.lang.Object r12 = r15.get(r12)
            at5 r12 = (defpackage.at5) r12
            if (r12 == 0) goto L4b
            long r12 = r12.c
            int r15 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r15 == 0) goto L4b
            goto L50
        L4b:
            long r12 = r14.g
            r14 = 1
            long r12 = r12 + r14
        L50:
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L59
            r8.c = r9
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 == 0) goto L84
            long r9 = r2.d
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 != 0) goto L62
            goto L84
        L62:
            if (r11 != 0) goto L71
            boolean r12 = r2.b()
            if (r12 != 0) goto L16
            long r12 = r8.c
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L88
        L71:
            long r12 = r11.d
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            int r9 = r2.b
            int r10 = r11.b
            if (r9 != r10) goto L16
            int r9 = r2.c
            int r10 = r11.c
            if (r9 != r10) goto L16
            goto L88
        L84:
            int r9 = r8.b
            if (r1 != r9) goto L16
        L88:
            long r9 = r8.c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 >= 0) goto L93
            goto La0
        L93:
            if (r12 != 0) goto L16
            java.lang.String r9 = defpackage.tpi.a
            z7b r9 = r5.d
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r5 = r8
            goto L16
        La0:
            r5 = r8
            r6 = r9
            goto L16
        La4:
            if (r5 != 0) goto Lb6
            zs5 r4 = defpackage.bt5.h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            at5 r5 = new at5
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        Lb6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt5.b(int, z7b):at5");
    }

    public final synchronized String c(mqh mqhVar, z7b z7bVar) {
        return b(mqhVar.g(z7bVar.a, this.b).c, z7bVar).a;
    }

    public final void d(kx kxVar) {
        z7b z7bVar;
        mqh mqhVar = kxVar.b;
        int i2 = kxVar.c;
        z7b z7bVar2 = kxVar.d;
        boolean zP = mqhVar.p();
        String str = this.f;
        HashMap map = this.c;
        if (zP) {
            if (str != null) {
                at5 at5Var = (at5) map.get(str);
                at5Var.getClass();
                a(at5Var);
                return;
            }
            return;
        }
        at5 at5Var2 = (at5) map.get(str);
        this.f = b(i2, z7bVar2).a;
        e(kxVar);
        if (z7bVar2 != null) {
            long j = z7bVar2.d;
            if (z7bVar2.b()) {
                if (at5Var2 != null && at5Var2.c == j && (z7bVar = at5Var2.d) != null && z7bVar.b == z7bVar2.b && z7bVar.c == z7bVar2.c) {
                    return;
                }
                b(i2, new z7b(z7bVar2.a, j));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x001c, B:13:0x0028, B:16:0x002f, B:22:0x003a, B:24:0x0046, B:26:0x004c, B:32:0x0057, B:34:0x0063, B:35:0x0067, B:37:0x006c, B:39:0x0072, B:41:0x0089, B:42:0x00b6, B:44:0x00ba, B:45:0x00c1, B:47:0x00cb, B:49:0x00cf, B:51:0x00dc, B:54:0x00e3), top: B:59:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(defpackage.kx r10) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt5.e(kx):void");
    }
}
