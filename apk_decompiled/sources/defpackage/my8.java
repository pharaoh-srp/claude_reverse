package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class my8 {
    public static final Set d = mp0.Z0(new String[]{"image/jpg", "image/jpeg", "image/png", "image/webp"});
    public final oda a;
    public final sda b;
    public final h86 c;

    public my8(oda odaVar, sda sdaVar, h86 h86Var) {
        this.a = odaVar;
        this.b = sdaVar;
        this.c = h86Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.si7 r8, int r9, defpackage.vp4 r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.ly8
            if (r0 == 0) goto L13
            r0 = r10
            ly8 r0 = (defpackage.ly8) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            ly8 r0 = new ly8
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2f
            if (r1 != r4) goto L29
            defpackage.sf5.h0(r10)     // Catch: java.lang.Exception -> L27
            goto L6b
        L27:
            r7 = move-exception
            goto L87
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r3
        L2f:
            defpackage.sf5.h0(r10)
            java.lang.String r10 = r8.b()
            java.util.Set r1 = defpackage.my8.d
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r10 = defpackage.w44.G0(r1, r10)
            if (r10 != 0) goto L43
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L43:
            long r5 = r8.d()
            long r9 = (long) r9
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 <= 0) goto L4f
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L4f:
            sda r7 = r7.b     // Catch: java.lang.Exception -> L27
            android.net.Uri r8 = r8.e()     // Catch: java.lang.Exception -> L27
            r0.G = r4     // Catch: java.lang.Exception -> L27
            h86 r9 = r7.b     // Catch: java.lang.Exception -> L27
            e45 r9 = r9.b()     // Catch: java.lang.Exception -> L27
            rda r10 = new rda     // Catch: java.lang.Exception -> L27
            r10.<init>(r7, r8, r3, r2)     // Catch: java.lang.Exception -> L27
            java.lang.Object r10 = defpackage.gb9.c0(r9, r10, r0)     // Catch: java.lang.Exception -> L27
            m45 r7 = defpackage.m45.E
            if (r10 != r7) goto L6b
            return r7
        L6b:
            android.util.Size r10 = (android.util.Size) r10     // Catch: java.lang.Exception -> L27
            if (r10 != 0) goto L72
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L27
            return r7
        L72:
            int r7 = r10.getWidth()     // Catch: java.lang.Exception -> L27
            r8 = 8000(0x1f40, float:1.121E-41)
            if (r7 >= r8) goto L81
            int r7 = r10.getHeight()     // Catch: java.lang.Exception -> L27
            if (r7 >= r8) goto L81
            goto L82
        L81:
            r4 = r2
        L82:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L27
            return r7
        L87:
            boolean r8 = r7 instanceof java.util.concurrent.CancellationException
            if (r8 != 0) goto L96
            com.anthropic.claude.core.telemetry.SilentException r8 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r9 = "Failed checking if image can skip compression"
            r8.<init>(r9, r7)
            r7 = 3
            com.anthropic.claude.core.telemetry.SilentException.a(r8, r3, r2, r7)
        L96:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my8.a(si7, int, vp4):java.lang.Object");
    }
}
