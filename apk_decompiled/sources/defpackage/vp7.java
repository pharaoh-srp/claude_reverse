package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vp7 extends xzg implements rz7 {
    public d6e E;
    public long F;
    public int G;
    public int H;
    public /* synthetic */ l45 I;
    public /* synthetic */ lp7 J;
    public final /* synthetic */ long K;
    public final /* synthetic */ kp7 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp7(long j, kp7 kp7Var, tp4 tp4Var) {
        super(3, tp4Var);
        this.K = j;
        this.L = kp7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vp7 vp7Var = new vp7(this.K, this.L, (tp4) obj3);
        vp7Var.I = (l45) obj;
        vp7Var.J = (lp7) obj2;
        return vp7Var.invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0089 -> B:20:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            l45 r1 = r0.I
            lp7 r2 = r0.J
            int r3 = r0.H
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L21
            if (r3 != r4) goto L1b
            int r1 = r0.G
            long r6 = r0.F
            d6e r3 = r0.E
            defpackage.sf5.h0(r17)
            r8 = r17
            goto L8c
        L1b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r5
        L21:
            defpackage.sf5.h0(r17)
            r6 = 0
            long r8 = r0.K
            int r3 = defpackage.uh6.d(r8, r6)
            if (r3 <= 0) goto L97
            kp7 r3 = r0.L
            py1 r6 = defpackage.py1.E
            r7 = 0
            kp7 r11 = defpackage.j8.l(r3, r7, r6)
            boolean r3 = r11 instanceof defpackage.lh2
            if (r3 == 0) goto L3f
            r3 = r11
            lh2 r3 = (defpackage.lh2) r3
            goto L40
        L3f:
            r3 = r5
        L40:
            if (r3 != 0) goto L4d
            ph2 r10 = new ph2
            r14 = 0
            r15 = 14
            r12 = 0
            r13 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r3 = r10
        L4d:
            d6e r1 = r3.j(r1)
            r3 = r1
            r1 = r7
            r6 = r8
        L54:
            zff r8 = new zff
            c45 r9 = r0.getContext()
            r8.<init>(r9)
            dpf r9 = r3.k()
            cx r10 = new cx
            r11 = 17
            r10.<init>(r2, r5, r11)
            r8.h(r9, r10)
            up7 r9 = new up7
            r9.<init>(r6, r5)
            long r10 = defpackage.d4c.o0(r6)
            defpackage.csg.E(r8, r10, r9)
            r0.I = r5
            r0.J = r2
            r0.E = r3
            r0.F = r6
            r0.G = r1
            r0.H = r4
            java.lang.Object r8 = r8.e(r0)
            m45 r9 = defpackage.m45.E
            if (r8 != r9) goto L8c
            return r9
        L8c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L54
            iei r0 = defpackage.iei.a
            return r0
        L97:
            kotlinx.coroutines.TimeoutCancellationException r0 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r1 = "Timed out immediately"
            r0.<init>(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
