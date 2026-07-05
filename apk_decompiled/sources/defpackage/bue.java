package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class bue extends View {
    public static final int[] J = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] K = new int[0];
    public nfi E;
    public Boolean F;
    public Long G;
    public pya H;
    public d7 I;

    private final void setRippleState(boolean z) throws IOException {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.H;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.G;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? J : K;
            nfi nfiVar = this.E;
            if (nfiVar != null) {
                nfiVar.setState(iArr);
            }
        } else {
            pya pyaVar = new pya(5, this);
            this.H = pyaVar;
            postDelayed(pyaVar, 50L);
        }
        this.G = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(bue bueVar) {
        nfi nfiVar = bueVar.E;
        if (nfiVar != null) {
            nfiVar.setState(K);
        }
        bueVar.H = null;
    }

    public final void b(odd oddVar, boolean z, long j, int i, long j2, float f, d7 d7Var) throws IOException {
        if (this.E == null || !Boolean.valueOf(z).equals(this.F)) {
            nfi nfiVar = new nfi(z);
            setBackground(nfiVar);
            this.E = nfiVar;
            this.F = Boolean.valueOf(z);
        }
        nfi nfiVar2 = this.E;
        nfiVar2.getClass();
        this.I = d7Var;
        e(j, i, j2, f);
        if (z) {
            nfiVar2.setHotspot(Float.intBitsToFloat((int) (oddVar.a >> 32)), Float.intBitsToFloat((int) (oddVar.a & 4294967295L)));
        } else {
            nfiVar2.setHotspot(nfiVar2.getBounds().centerX(), nfiVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() throws IOException {
        this.I = null;
        pya pyaVar = this.H;
        if (pyaVar != null) {
            removeCallbacks(pyaVar);
            pya pyaVar2 = this.H;
            pyaVar2.getClass();
            pyaVar2.run();
        } else {
            nfi nfiVar = this.E;
            if (nfiVar != null) {
                nfiVar.setState(K);
            }
        }
        nfi nfiVar2 = this.E;
        if (nfiVar2 == null) {
            return;
        }
        nfiVar2.setVisible(false, false);
        unscheduleDrawable(nfiVar2);
    }

    public final void d() throws IOException {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) throws IOException {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j, int i, long j2, float f) {
        nfi nfiVar = this.E;
        if (nfiVar == null) {
            return;
        }
        if (nfiVar.getRadius() != i) {
            nfiVar.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jB = d54.b(f, j2);
        d54 d54Var = nfiVar.F;
        if (!(d54Var == null ? false : d54.c(d54Var.a, jB))) {
            nfiVar.F = new d54(jB);
            nfiVar.setColor(ColorStateList.valueOf(d4c.n0(jB)));
        }
        Rect rect = new Rect(0, 0, mwa.L(Float.intBitsToFloat((int) (j >> 32))), mwa.L(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        nfiVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        d7 d7Var = this.I;
        if (d7Var != null) {
            d7Var.a();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
