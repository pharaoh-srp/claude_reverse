package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes2.dex */
public final class vz extends h5 {
    public final /* synthetic */ AndroidComposeView H;
    public final /* synthetic */ av9 I;
    public final /* synthetic */ AndroidComposeView J;

    public vz(AndroidComposeView androidComposeView, av9 av9Var, AndroidComposeView androidComposeView2) {
        this.H = androidComposeView;
        this.I = av9Var;
        this.J = androidComposeView2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // defpackage.h5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.View r8, defpackage.i6 r9) {
        /*
            r7 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.a
            android.view.View$AccessibilityDelegate r1 = r7.E
            r1.onInitializeAccessibilityNodeInfo(r8, r0)
            androidx.compose.ui.platform.AndroidComposeView r8 = r7.H
            k00 r1 = r8.g0
            boolean r2 = r1.q()
            if (r2 == 0) goto L15
            r2 = 0
            r0.setVisibleToUser(r2)
        L15:
            av9 r2 = r7.I
            av9 r3 = r2.G()
        L1b:
            r4 = 0
            if (r3 == 0) goto L2e
            g5c r5 = r3.k0
            r6 = 8
            boolean r5 = r5.i(r6)
            if (r5 == 0) goto L29
            goto L2f
        L29:
            av9 r3 = r3.G()
            goto L1b
        L2e:
            r3 = r4
        L2f:
            if (r3 == 0) goto L37
            int r3 = r3.F
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L37:
            r3 = -1
            if (r4 == 0) goto L4a
            zjf r5 = r8.getSemanticsOwner()
            wjf r5 = r5.a()
            int r5 = r5.f
            int r6 = r4.intValue()
            if (r6 != r5) goto L4e
        L4a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L4e:
            int r4 = r4.intValue()
            r9.b = r4
            androidx.compose.ui.platform.AndroidComposeView r7 = r7.J
            r0.setParent(r7, r4)
            int r9 = r2.F
            vub r2 = r1.f0
            int r2 = r2.d(r9)
            if (r2 == r3) goto L79
            s70 r4 = r8.getAndroidViewsHandler$ui()
            n70 r4 = defpackage.iuj.L(r4, r2)
            if (r4 == 0) goto L71
            r0.setTraversalBefore(r4)
            goto L74
        L71:
            r0.setTraversalBefore(r7, r2)
        L74:
            java.lang.String r2 = r1.h0
            androidx.compose.ui.platform.AndroidComposeView.b(r8, r9, r0, r2)
        L79:
            vub r2 = r1.g0
            int r2 = r2.d(r9)
            if (r2 == r3) goto L97
            s70 r3 = r8.getAndroidViewsHandler$ui()
            n70 r3 = defpackage.iuj.L(r3, r2)
            if (r3 == 0) goto L8f
            r0.setTraversalAfter(r3)
            goto L92
        L8f:
            r0.setTraversalAfter(r7, r2)
        L92:
            java.lang.String r7 = r1.i0
            androidx.compose.ui.platform.AndroidComposeView.b(r8, r9, r0, r7)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz.c(android.view.View, i6):void");
    }
}
