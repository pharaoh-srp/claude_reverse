package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import defpackage.ah0;
import defpackage.gyi;
import defpackage.hb;
import defpackage.kb;
import defpackage.qg0;
import defpackage.r1i;
import defpackage.rn4;
import defpackage.vcb;

/* JADX INFO: loaded from: classes2.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue E;
    public TypedValue F;
    public TypedValue G;
    public TypedValue H;
    public TypedValue I;
    public TypedValue J;
    public final Rect K;
    public rn4 L;

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.K = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.I == null) {
            this.I = new TypedValue();
        }
        return this.I;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.J == null) {
            this.J = new TypedValue();
        }
        return this.J;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.G == null) {
            this.G = new TypedValue();
        }
        return this.G;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.H == null) {
            this.H = new TypedValue();
        }
        return this.H;
    }

    public TypedValue getMinWidthMajor() {
        if (this.E == null) {
            this.E = new TypedValue();
        }
        return this.E;
    }

    public TypedValue getMinWidthMinor() {
        if (this.F == null) {
            this.F = new TypedValue();
        }
        return this.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rn4 rn4Var = this.L;
        if (rn4Var != null) {
            rn4Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        kb kbVar;
        super.onDetachedFromWindow();
        rn4 rn4Var = this.L;
        if (rn4Var != null) {
            ah0 ah0Var = ((qg0) rn4Var).E;
            ActionBarOverlayLayout actionBarOverlayLayout = ah0Var.N;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((r1i) actionBarOverlayLayout.I).a.E;
                if (actionMenuView != null && (kbVar = actionMenuView.a0) != null) {
                    kbVar.g();
                    hb hbVar = kbVar.X;
                    if (hbVar != null && hbVar.b()) {
                        hbVar.i.dismiss();
                    }
                }
            }
            if (ah0Var.S != null) {
                ah0Var.J.getDecorView().removeCallbacks(ah0Var.T);
                if (ah0Var.S.isShowing()) {
                    try {
                        ah0Var.S.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                ah0Var.S = null;
            }
            gyi gyiVar = ah0Var.U;
            if (gyiVar != null) {
                gyiVar.b();
            }
            vcb vcbVar = ah0Var.p(0).h;
            if (vcbVar != null) {
                vcbVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(rn4 rn4Var) {
        this.L = rn4Var;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }
}
