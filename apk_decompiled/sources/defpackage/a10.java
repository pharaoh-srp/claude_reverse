package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a10 implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public final AndroidComposeView E;
    public final dm F;
    public nn4 G;
    public final ArrayList H = new ArrayList();
    public final long I = 100;
    public x00 J = x00.E;
    public boolean K = true;
    public final zy1 L = wd6.P(1, 6, null);
    public xub M;
    public long N;
    public final xub O;
    public xjf P;
    public boolean Q;
    public final y0 R;

    public a10(AndroidComposeView androidComposeView, dm dmVar) {
        this.E = androidComposeView;
        this.F = dmVar;
        new Handler(Looper.getMainLooper());
        xub xubVar = x69.a;
        xubVar.getClass();
        this.M = xubVar;
        this.O = new xub();
        this.P = new xjf(androidComposeView.getSemanticsOwner().a(), xubVar);
        this.R = new y0(2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:17:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.y00
            if (r0 == 0) goto L13
            r0 = r8
            y00 r0 = (defpackage.y00) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            y00 r0 = new y00
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.F
            int r1 = r0.H
            r2 = 2
            r3 = 1
            m45 r4 = defpackage.m45.E
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            sy1 r1 = r0.E
            defpackage.sf5.h0(r8)
            goto L46
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            r7 = 0
            return r7
        L33:
            sy1 r1 = r0.E
            defpackage.sf5.h0(r8)
            goto L51
        L39:
            defpackage.sf5.h0(r8)
            zy1 r8 = r7.L
            r8.getClass()
            sy1 r1 = new sy1
            r1.<init>(r8)
        L46:
            r0.E = r1
            r0.H = r3
            java.lang.Object r8 = r1.b(r0)
            if (r8 != r4) goto L51
            goto L84
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L85
            r1.c()
            boolean r8 = r7.e()
            if (r8 == 0) goto L65
            r7.f()
        L65:
            androidx.compose.ui.platform.AndroidComposeView r8 = r7.E
            android.os.Handler r8 = r8.getHandler()
            boolean r5 = r7.Q
            if (r5 != 0) goto L78
            if (r8 == 0) goto L78
            r7.Q = r3
            y0 r5 = r7.R
            r8.post(r5)
        L78:
            r0.E = r1
            r0.H = r2
            long r5 = r7.I
            java.lang.Object r8 = defpackage.d4c.K(r5, r0)
            if (r8 != r4) goto L46
        L84:
            return r4
        L85:
            iei r7 = defpackage.iei.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a10.a(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.w69 r34) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a10.b(w69):void");
    }

    public final w69 c() {
        if (this.K) {
            this.K = false;
            this.M = v40.x(this.E.getSemanticsOwner(), ex.I);
            this.N = System.currentTimeMillis();
        }
        return this.M;
    }

    public final boolean e() {
        return this.G != null;
    }

    public final void f() {
        nn4 nn4Var = this.G;
        if (nn4Var != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.H;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ln4 ln4Var = (ln4) arrayList.get(i);
                int iOrdinal = ln4Var.c().ordinal();
                if (iOrdinal == 0) {
                    xzd xzdVarB = ln4Var.b();
                    if (xzdVarB != null) {
                        ((i49) nn4Var).S0(xzdVarB.J());
                    }
                } else {
                    if (iOrdinal != 1) {
                        mr9.b();
                        return;
                    }
                    i49 i49Var = (i49) nn4Var;
                    AutofillId autofillIdP0 = i49Var.P0(ln4Var.a());
                    if (autofillIdP0 != null) {
                        i49Var.T0(autofillIdP0);
                    }
                }
            }
            ((i49) nn4Var).A0();
            arrayList.clear();
        }
    }

    public final void g(wjf wjfVar, xjf xjfVar) {
        int i = 0;
        z00 z00Var = new z00(xjfVar, i, this);
        wjfVar.getClass();
        List listJ = wjf.j(4, wjfVar);
        int size = listJ.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = listJ.get(i3);
            if (c().a(((wjf) obj).f)) {
                z00Var.invoke(Integer.valueOf(i2), obj);
                i2++;
            }
        }
        List listJ2 = wjf.j(4, wjfVar);
        int size2 = listJ2.size();
        while (i < size2) {
            wjf wjfVar2 = (wjf) listJ2.get(i);
            w69 w69VarC = c();
            int i4 = wjfVar2.f;
            if (w69VarC.a(i4)) {
                xub xubVar = this.O;
                if (xubVar.a(i4)) {
                    Object objB = xubVar.b(i4);
                    if (objB == null) {
                        throw sq6.z("node not present in pruned tree before this change");
                    }
                    g(wjfVar2, (xjf) objB);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public final void h(int i, String str) {
        nn4 nn4Var;
        if (Build.VERSION.SDK_INT >= 29 && (nn4Var = this.G) != null) {
            i49 i49Var = (i49) nn4Var;
            AutofillId autofillIdP0 = i49Var.P0(i);
            if (autofillIdP0 == null) {
                throw sq6.z("Invalid content capture ID");
            }
            i49Var.U0(autofillIdP0, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095 A[PHI: r1
      0x0095: PHI (r1v10 android.view.autofill.AutofillId) = (r1v9 android.view.autofill.AutofillId), (r1v22 android.view.autofill.AutofillId) binds: [B:39:0x0086, B:41:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r11, defpackage.wjf r12) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a10.i(int, wjf):void");
    }

    public final void j(wjf wjfVar) {
        if (e()) {
            this.H.add(new ln4(wjfVar.f, this.N, mn4.F, null));
            List listJ = wjf.j(4, wjfVar);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                j((wjf) listJ.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r17 = this;
            r0 = r17
            xub r1 = r0.O
            r1.c()
            w69 r2 = r0.c()
            int[] r3 = r2.b
            java.lang.Object[] r4 = r2.c
            long[] r2 = r2.a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            yjf r13 = (defpackage.yjf) r13
            xjf r15 = new xjf
            wjf r13 = r13.a
            w69 r6 = r0.c()
            r15.<init>(r13, r6)
            r1.i(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            xjf r1 = new xjf
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.E
            zjf r2 = r2.getSemanticsOwner()
            wjf r2 = r2.a()
            w69 r3 = r0.c()
            r1.<init>(r2, r3)
            r0.P = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a10.k():void");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(m4a m4aVar) {
        this.G = (nn4) this.F.a();
        i(-1, this.E.getSemanticsOwner().a());
        f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(m4a m4aVar) {
        j(this.E.getSemanticsOwner().a());
        f();
        this.G = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.E.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.R);
        this.G = null;
    }
}
