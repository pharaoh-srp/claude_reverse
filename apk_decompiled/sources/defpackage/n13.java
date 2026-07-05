package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class n13 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Context H;
    public final /* synthetic */ h86 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ zy7 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n13(boolean z, boolean z2, Context context, h86 h86Var, boolean z3, zy7 zy7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = z;
        this.G = z2;
        this.H = context;
        this.I = h86Var;
        this.J = z3;
        this.K = zy7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new n13(this.F, this.G, this.H, this.I, this.J, this.K, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((n13) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (defpackage.j8.O(getContext()).b0(r7, r8) == r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r8.y(r7.H, r0, r7.J, r7) != r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.E
            iei r1 = defpackage.iei.a
            r2 = 2
            r3 = 1
            m45 r4 = defpackage.m45.E
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L13
            defpackage.sf5.h0(r8)
            goto Lb2
        L13:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            r7 = 0
            return r7
        L1a:
            defpackage.sf5.h0(r8)
            goto L43
        L1e:
            defpackage.sf5.h0(r8)
            boolean r8 = r7.F
            if (r8 == 0) goto L28
            java.lang.String r8 = "sheet_open"
            goto L45
        L28:
            boolean r8 = r7.G
            if (r8 == 0) goto Lb7
            xga r8 = new xga
            r0 = 3
            r8.<init>(r0)
            r7.E = r3
            c45 r0 = r7.getContext()
            arb r0 = defpackage.j8.O(r0)
            java.lang.Object r8 = r0.b0(r7, r8)
            if (r8 != r4) goto L43
            goto Lb1
        L43:
            java.lang.String r8 = "has_artifacts"
        L45:
            yfa r0 = defpackage.zfa.a
            r0.getClass()
            boolean r0 = defpackage.yfa.b()
            if (r0 != 0) goto L51
            goto L9d
        L51:
            java.util.concurrent.CopyOnWriteArrayList r0 = defpackage.yfa.b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L5c:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L72
            java.lang.Object r5 = r0.next()
            r6 = r5
            zfa r6 = (defpackage.zfa) r6
            n30 r6 = (defpackage.n30) r6
            r6.getClass()
            r3.add(r5)
            goto L5c
        L72:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L9d
            yfa r0 = defpackage.zfa.a
            r0.getClass()
            java.lang.String r0 = "creating SandboxWebView, trigger="
            java.lang.String r8 = r0.concat(r8)
            java.util.Iterator r0 = r3.iterator()
        L87:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r0.next()
            zfa r3 = (defpackage.zfa) r3
            n30 r3 = (defpackage.n30) r3
            sfa r5 = defpackage.sfa.DEBUG
            java.lang.String r6 = "SandboxWebViewPrewarm"
            r3.b(r5, r6, r8)
            goto L87
        L9d:
            ql8 r8 = defpackage.ql8.N
            h86 r0 = r7.I
            e45 r0 = r0.b()
            r7.E = r2
            android.content.Context r2 = r7.H
            boolean r3 = r7.J
            java.lang.Object r8 = r8.y(r2, r0, r3, r7)
            if (r8 != r4) goto Lb2
        Lb1:
            return r4
        Lb2:
            zy7 r7 = r7.K
            r7.a()
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n13.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
