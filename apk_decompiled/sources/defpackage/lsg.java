package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes2.dex */
public final class lsg extends te1 {
    public final boolean p;
    public final g54 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public lsg(pna pnaVar, le1 le1Var, d1g d1gVar) {
        int iF = sq6.F(d1gVar.f);
        Paint.Cap cap = iF != 0 ? iF != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iF2 = sq6.F(d1gVar.g);
        super(pnaVar, le1Var, cap, iF2 != 0 ? iF2 != 1 ? iF2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, d1gVar.h, d1gVar.d, d1gVar.e, d1gVar.b, d1gVar.a);
        this.p = d1gVar.i;
        ke1 ke1VarA = d1gVar.c.a();
        this.q = (g54) ke1VarA;
        ke1VarA.a(this);
        le1Var.d(ke1VarA);
    }

    @Override // defpackage.te1, defpackage.pg6
    public final void f(Canvas canvas, Matrix matrix, int i, gh6 gh6Var) {
        if (this.p) {
            return;
        }
        g54 g54Var = this.q;
        this.i.setColor(g54Var.k(g54Var.c.k(), g54Var.b()));
        super.f(canvas, matrix, i, gh6Var);
    }
}
