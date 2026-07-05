package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class txi extends View {
    public static final e36 O = new e36(3);
    public final td6 E;
    public final jb2 F;
    public final ib2 G;
    public boolean H;
    public Outline I;
    public boolean J;
    public cz5 K;
    public fu9 L;
    public bz7 M;
    public ja8 N;

    public txi(td6 td6Var, jb2 jb2Var, ib2 ib2Var) {
        super(td6Var.getContext());
        this.E = td6Var;
        this.F = jb2Var;
        this.G = ib2Var;
        setOutlineProvider(O);
        this.J = true;
        this.K = nai.f;
        this.L = fu9.E;
        la8.a.getClass();
        this.M = j06.T;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        jb2 jb2Var = this.F;
        iz izVar = jb2Var.a;
        Canvas canvas2 = izVar.a;
        izVar.a = canvas;
        cz5 cz5Var = this.K;
        fu9 fu9Var = this.L;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        ja8 ja8Var = this.N;
        bz7 bz7Var = this.M;
        ib2 ib2Var = this.G;
        cz5 cz5VarS = ib2Var.B0().s();
        fu9 fu9VarU = ib2Var.B0().u();
        fb2 fb2VarP = ib2Var.B0().p();
        long jW = ib2Var.B0().w();
        ja8 ja8Var2 = (ja8) ib2Var.B0().F;
        fj0 fj0VarB0 = ib2Var.B0();
        fj0VarB0.L(cz5Var);
        fj0VarB0.M(fu9Var);
        fj0VarB0.K(izVar);
        fj0VarB0.N(jFloatToRawIntBits);
        fj0VarB0.F = ja8Var;
        izVar.g();
        try {
            bz7Var.invoke(ib2Var);
            izVar.p();
            fj0 fj0VarB02 = ib2Var.B0();
            fj0VarB02.L(cz5VarS);
            fj0VarB02.M(fu9VarU);
            fj0VarB02.K(fb2VarP);
            fj0VarB02.N(jW);
            fj0VarB02.F = ja8Var2;
            jb2Var.a.a = canvas2;
            this.H = false;
        } catch (Throwable th) {
            izVar.p();
            fj0 fj0VarB03 = ib2Var.B0();
            fj0VarB03.L(cz5VarS);
            fj0VarB03.M(fu9VarU);
            fj0VarB03.K(fb2VarP);
            fj0VarB03.N(jW);
            fj0VarB03.F = ja8Var2;
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.J;
    }

    public final jb2 getCanvasHolder() {
        return this.F;
    }

    public final View getOwnerView() {
        return this.E;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.J;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.H) {
            return;
        }
        this.H = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.J != z) {
            this.J = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.H = z;
    }
}
