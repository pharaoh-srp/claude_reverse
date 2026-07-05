package com.anthropic.claude.code.remote;

import defpackage.iei;
import defpackage.l45;
import defpackage.pz7;
import defpackage.tp4;
import defpackage.xzg;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ c G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = cVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        b bVar = new b(this.G, tp4Var);
        bVar.F = obj;
        return bVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r0.W(false, false, r10) == r9) goto L23;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            com.anthropic.claude.code.remote.c r0 = r10.G
            e58 r1 = r0.f
            com.anthropic.claude.code.remote.CodeSessionListScope r2 = r0.q
            java.lang.Object r3 = r10.F
            l45 r3 = (defpackage.l45) r3
            int r4 = r10.E
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            m45 r9 = defpackage.m45.E
            if (r4 == 0) goto L26
            if (r4 == r7) goto L22
            if (r4 != r6) goto L1c
            defpackage.sf5.h0(r11)
            goto L76
        L1c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            return r8
        L22:
            defpackage.sf5.h0(r11)
            goto L6a
        L26:
            defpackage.sf5.h0(r11)
            com.anthropic.claude.code.remote.CodeSessionListScope$Scheduled r11 = com.anthropic.claude.code.remote.CodeSessionListScope.Scheduled.INSTANCE
            boolean r11 = defpackage.x44.r(r2, r11)
            if (r11 != 0) goto L5f
            boolean r11 = r1.b()
            if (r11 == 0) goto L3d
            boolean r11 = r1.d()
            if (r11 != 0) goto L45
        L3d:
            xz3 r11 = new xz3
            r11.<init>(r0, r8, r6)
            defpackage.gb9.D(r3, r8, r8, r11, r5)
        L45:
            xz3 r11 = new xz3
            r11.<init>(r0, r8, r5)
            defpackage.gb9.D(r3, r8, r8, r11, r5)
            xz3 r11 = new xz3
            r1 = 4
            r11.<init>(r0, r8, r1)
            defpackage.gb9.D(r3, r8, r8, r11, r5)
            xz3 r11 = new xz3
            r1 = 5
            r11.<init>(r0, r8, r1)
            defpackage.gb9.D(r3, r8, r8, r11, r5)
        L5f:
            r10.F = r8
            r10.E = r7
            java.lang.Object r11 = com.anthropic.claude.code.remote.c.O(r0, r10)
            if (r11 != r9) goto L6a
            goto L75
        L6a:
            r10.F = r8
            r10.E = r6
            r11 = 0
            java.lang.Object r10 = r0.W(r11, r11, r10)
            if (r10 != r9) goto L76
        L75:
            return r9
        L76:
            com.anthropic.claude.code.remote.c.Q(r0)
            com.anthropic.claude.code.remote.CodeSessionListScope$Scheduled r10 = com.anthropic.claude.code.remote.CodeSessionListScope.Scheduled.INSTANCE
            boolean r10 = defpackage.x44.r(r2, r10)
            if (r10 != 0) goto L9a
            fkg r10 = r0.W
            if (r10 == 0) goto L8c
            boolean r10 = r10.c()
            if (r10 != r7) goto L8c
            goto L9a
        L8c:
            mp4 r10 = r0.a
            xz3 r11 = new xz3
            r1 = 7
            r11.<init>(r0, r8, r1)
            fkg r10 = defpackage.gb9.D(r10, r8, r8, r11, r5)
            r0.W = r10
        L9a:
            iei r10 = defpackage.iei.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
