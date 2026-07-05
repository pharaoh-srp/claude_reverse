package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class pc4 extends View.DragShadowBuilder {
    public final fz5 a;
    public final long b;
    public final bz7 c;

    public pc4(fz5 fz5Var, long j, bz7 bz7Var) {
        this.a = fz5Var;
        this.b = j;
        this.c = bz7Var;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        ib2 ib2Var = new ib2();
        iz izVarA = jz.a(canvas);
        hb2 hb2Var = ib2Var.E;
        cz5 cz5Var = hb2Var.a;
        fu9 fu9Var = hb2Var.b;
        fb2 fb2Var = hb2Var.c;
        long j = hb2Var.d;
        hb2Var.a = this.a;
        hb2Var.b = fu9.E;
        hb2Var.c = izVarA;
        hb2Var.d = this.b;
        izVarA.g();
        this.c.invoke(ib2Var);
        izVarA.p();
        hb2Var.a = cz5Var;
        hb2Var.b = fu9Var;
        hb2Var.c = fb2Var;
        hb2Var.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        fz5 fz5Var = this.a;
        point.set(fz5Var.M0(fIntBitsToFloat / fz5Var.getDensity()), fz5Var.M0(Float.intBitsToFloat((int) (j & 4294967295L)) / fz5Var.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
