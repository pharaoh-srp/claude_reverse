package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class mij {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.gij a(defpackage.a1 r7, defpackage.hd4 r8, defpackage.ta4 r9) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.x78.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L43
            r0 = 6
            zy1 r0 = defpackage.wd6.P(r2, r0, r3)
            u0h r4 = defpackage.y60.Q
            java.lang.Object r4 = r4.getValue()
            c45 r4 = (defpackage.c45) r4
            mp4 r4 = defpackage.fd9.c(r4)
            cx r5 = new cx
            r6 = 20
            r5.<init>(r0, r3, r6)
            r6 = 3
            defpackage.gb9.D(r4, r3, r3, r5, r6)
            e0 r4 = new e0
            r5 = 16
            r4.<init>(r5, r0)
            java.lang.Object r0 = defpackage.ycg.c
            monitor-enter(r0)
            java.util.List r5 = defpackage.ycg.i     // Catch: java.lang.Throwable -> L40
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r4 = defpackage.w44.b1(r5, r4)     // Catch: java.lang.Throwable -> L40
            defpackage.ycg.i = r4     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)
            defpackage.ycg.a()
            goto L43
        L40:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L43:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L5d
            android.view.View r0 = r7.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r1 == 0) goto L54
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L55
        L54:
            r0 = r3
        L55:
            if (r0 == 0) goto L5b
            r0.setComposeViewContext(r8)
            goto L61
        L5b:
            r0 = r3
            goto L61
        L5d:
            r7.removeAllViews()
            goto L5b
        L61:
            if (r0 != 0) goto L75
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1, r8)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = defpackage.mij.a
            r7.addView(r1, r4)
        L75:
            r0.setComposeViewContext(r8)
            hd4 r7 = r7.getComposeViewContext$ui()
            if (r7 == 0) goto L84
            r8.c()
            r0.setComposeViewContextIncrementedDuringInit$ui(r2)
        L84:
            r7 = 2131362931(0x7f0a0473, float:1.8345657E38)
            java.lang.Object r1 = r0.getTag(r7)
            boolean r2 = r1 instanceof defpackage.gij
            if (r2 == 0) goto L92
            r3 = r1
            gij r3 = (defpackage.gij) r3
        L92:
            if (r3 != 0) goto Lac
            gij r3 = new gij
            cdi r1 = new cdi
            av9 r2 = r0.getRoot()
            r1.<init>(r2)
            ge4 r2 = r8.b
            le4 r4 = new le4
            r4.<init>(r2, r1)
            r3.<init>(r0, r4)
            r0.setTag(r7, r3)
        Lac:
            r3.b(r9)
            ge4 r7 = r8.b
            lij r8 = new lij
            r8.<init>(r7)
            r0.setFrameEndScheduler$ui(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mij.a(a1, hd4, ta4):gij");
    }
}
