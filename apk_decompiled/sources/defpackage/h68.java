package defpackage;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class h68 extends xzg implements pz7 {
    public boolean E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ Context H;
    public final /* synthetic */ nm0 I;
    public final /* synthetic */ ive J;
    public final /* synthetic */ Bundle K;
    public final /* synthetic */ sz7 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h68(Context context, nm0 nm0Var, ive iveVar, Bundle bundle, sz7 sz7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = context;
        this.I = nm0Var;
        this.J = iveVar;
        this.K = bundle;
        this.L = sz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        h68 h68Var = new h68(this.H, this.I, this.J, this.K, this.L, tp4Var);
        h68Var.G = obj;
        return h68Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((h68) create((atf) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[RETURN] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.F
            r1 = 0
            nm0 r2 = r11.I
            android.content.Context r3 = r11.H
            r4 = 3
            r5 = 2
            r6 = 1
            m45 r7 = defpackage.m45.E
            if (r0 == 0) goto L30
            if (r0 == r6) goto L28
            if (r0 == r5) goto L1e
            if (r0 != r4) goto L18
            defpackage.sf5.h0(r12)
            return r12
        L18:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            return r1
        L1e:
            boolean r0 = r11.E
            java.lang.Object r3 = r11.G
            atf r3 = (defpackage.atf) r3
            defpackage.sf5.h0(r12)
            goto L6b
        L28:
            java.lang.Object r0 = r11.G
            atf r0 = (defpackage.atf) r0
            defpackage.sf5.h0(r12)
            goto L4b
        L30:
            defpackage.sf5.h0(r12)
            java.lang.Object r12 = r11.G
            atf r12 = (defpackage.atf) r12
            int r0 = r2.a
            java.lang.String r0 = defpackage.msk.d(r0)
            r11.G = r12
            r11.F = r6
            java.lang.Object r0 = r12.a(r3, r0, r11)
            if (r0 != r7) goto L48
            goto L8e
        L48:
            r10 = r0
            r0 = r12
            r12 = r10
        L4b:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L6d
            wm0 r6 = new wm0
            ive r8 = r11.J
            android.os.Bundle r9 = r11.K
            r6.<init>(r8, r2, r9)
            r11.G = r0
            r11.E = r12
            r11.F = r5
            java.lang.Object r3 = r0.b(r3, r6, r11)
            if (r3 != r7) goto L69
            goto L8e
        L69:
            r3 = r0
            r0 = r12
        L6b:
            r12 = r0
            r0 = r3
        L6d:
            int r2 = r2.a
            java.lang.String r2 = defpackage.msk.d(r2)
            java.util.LinkedHashMap r3 = r0.a
            java.lang.Object r2 = r3.get(r2)
            wm0 r2 = (defpackage.wm0) r2
            r2.getClass()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r11.G = r1
            r11.F = r4
            sz7 r1 = r11.L
            java.lang.Object r11 = r1.i(r0, r2, r12, r11)
            if (r11 != r7) goto L8f
        L8e:
            return r7
        L8f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h68.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
