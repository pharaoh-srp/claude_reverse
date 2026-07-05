package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class uof {
    public static final xbd c = new xbd("server_time_ms");
    public static final xbd d = new xbd("observed_at_elapsed_ms");
    public static final xbd e = new xbd("boot_count");
    public final Context a;
    public final tbd b;

    public uof(Context context, v4d v4dVar) {
        tbd tbdVarA = v4dVar.a("server_clock");
        this.a = context;
        this.b = tbdVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.rof
            if (r0 == 0) goto L13
            r0 = r12
            rof r0 = (defpackage.rof) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            rof r0 = new rof
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.sf5.h0(r12)
            goto L42
        L26:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            return r3
        L2c:
            defpackage.sf5.h0(r12)
            tbd r11 = r11.b
            vg5 r11 = r11.a
            kp7 r11 = r11.getData()
            r0.G = r2
            java.lang.Object r12 = defpackage.j8.G(r11, r0)
            m45 r11 = defpackage.m45.E
            if (r12 != r11) goto L42
            return r11
        L42:
            yvb r12 = (defpackage.yvb) r12
            xbd r11 = defpackage.uof.c
            java.lang.Object r11 = r12.c(r11)
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 == 0) goto L74
            long r5 = r11.longValue()
            xbd r11 = defpackage.uof.d
            java.lang.Object r11 = r12.c(r11)
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 == 0) goto L74
            long r7 = r11.longValue()
            xbd r11 = defpackage.uof.e
            java.lang.Object r11 = r12.c(r11)
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 == 0) goto L74
            long r9 = r11.longValue()
            qof r4 = new qof
            r4.<init>(r5, r7, r9)
            return r4
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uof.a(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r11, long r13, defpackage.vp4 r15) {
        /*
            r10 = this;
            boolean r1 = r15 instanceof defpackage.sof
            if (r1 == 0) goto L14
            r1 = r15
            sof r1 = (defpackage.sof) r1
            int r2 = r1.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.G = r2
        L12:
            r7 = r1
            goto L1a
        L14:
            sof r1 = new sof
            r1.<init>(r10, r15)
            goto L12
        L1a:
            java.lang.Object r0 = r7.E
            int r1 = r7.G
            r8 = 0
            r9 = 1
            if (r1 == 0) goto L2e
            if (r1 != r9) goto L28
            defpackage.sf5.h0(r0)
            goto L4e
        L28:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r8
        L2e:
            defpackage.sf5.h0(r0)
            tof r0 = new tof
            r6 = 0
            r5 = r10
            r1 = r11
            r3 = r13
            r0.<init>(r1, r3, r5, r6)
            r7.G = r9
            cx r1 = new cx
            r2 = 27
            r1.<init>(r0, r8, r2)
            tbd r0 = r10.b
            java.lang.Object r0 = r0.a(r1, r7)
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L4e
            return r1
        L4e:
            iei r0 = defpackage.iei.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uof.b(long, long, vp4):java.lang.Object");
    }
}
