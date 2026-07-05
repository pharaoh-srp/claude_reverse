package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mo6 extends xzg implements pz7 {
    public List E;
    public rjc F;
    public int G;
    public int H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ oo6 K;
    public final /* synthetic */ do6 L;
    public final /* synthetic */ rjc M;
    public final /* synthetic */ List N;
    public final /* synthetic */ rz6 O;
    public final /* synthetic */ kx8 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo6(oo6 oo6Var, do6 do6Var, rjc rjcVar, List list, rz6 rz6Var, kx8 kx8Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = oo6Var;
        this.L = do6Var;
        this.M = rjcVar;
        this.N = list;
        this.O = rz6Var;
        this.P = kx8Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        mo6 mo6Var = new mo6(this.K, this.L, this.M, this.N, this.O, this.P, tp4Var);
        mo6Var.J = obj;
        return mo6Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((mo6) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.I
            r1 = 0
            rz6 r2 = r10.O
            do6 r3 = r10.L
            r4 = 1
            if (r0 == 0) goto L2a
            if (r0 != r4) goto L24
            int r0 = r10.H
            int r5 = r10.G
            rjc r6 = r10.F
            java.util.List r7 = r10.E
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r10.J
            l45 r8 = (defpackage.l45) r8
            defpackage.sf5.h0(r11)
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            defpackage.fd9.S(r8)
            int r5 = r5 + r4
            goto L69
        L24:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            return r1
        L2a:
            defpackage.sf5.h0(r11)
            java.lang.Object r11 = r10.J
            r8 = r11
            l45 r8 = (defpackage.l45) r8
            android.graphics.drawable.Drawable r11 = r3.a
            boolean r0 = r11 instanceof android.graphics.drawable.BitmapDrawable
            rjc r6 = r10.M
            if (r0 == 0) goto L53
            r0 = r11
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r5 = r0.getConfig()
            if (r5 != 0) goto L49
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L49:
            android.graphics.Bitmap$Config[] r7 = defpackage.l.a
            boolean r5 = defpackage.mp0.o0(r5, r7)
            if (r5 == 0) goto L53
            r11 = r0
            goto L5f
        L53:
            android.graphics.Bitmap$Config r0 = r6.b
            i8g r5 = r6.c
            j6f r7 = r6.d
            boolean r9 = r6.e
            android.graphics.Bitmap r11 = defpackage.nuj.l(r11, r0, r5, r7, r9)
        L5f:
            r2.getClass()
            java.util.List r7 = r10.N
            int r0 = r7.size()
            r5 = 0
        L69:
            if (r5 < r0) goto L87
            r2.getClass()
            kx8 r10 = r10.P
            android.content.Context r10 = r10.a
            android.content.res.Resources r10 = r10.getResources()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r10, r11)
            boolean r10 = r3.b
            rg5 r11 = r3.c
            java.lang.String r1 = r3.d
            do6 r2 = new do6
            r2.<init>(r0, r10, r11, r1)
            return r2
        L87:
            java.lang.Object r11 = r7.get(r5)
            if (r11 == 0) goto L91
            defpackage.mr9.o()
            return r1
        L91:
            i8g r11 = r6.c
            r10.J = r8
            java.util.List r7 = (java.util.List) r7
            r10.E = r7
            r10.F = r6
            r10.G = r5
            r10.H = r0
            r10.I = r4
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mo6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
