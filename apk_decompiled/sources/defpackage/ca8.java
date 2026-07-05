package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes2.dex */
public final class ca8 extends te1 {
    public final boolean p;
    public final zka q;
    public final zka r;
    public final RectF s;
    public final int t;
    public final int u;
    public final x98 v;
    public final x98 w;
    public final x98 x;

    /* JADX WARN: Illegal instructions before constructor call */
    public ca8(pna pnaVar, le1 le1Var, ba8 ba8Var) {
        Paint.Join join;
        Paint.Join join2;
        int iF = sq6.F(ba8Var.g);
        Paint.Cap cap = iF != 0 ? iF != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iF2 = sq6.F(ba8Var.h);
        if (iF2 == 0) {
            join = Paint.Join.MITER;
        } else if (iF2 == 1) {
            join = Paint.Join.ROUND;
        } else {
            if (iF2 != 2) {
                join2 = null;
                super(pnaVar, le1Var, cap, join2, ba8Var.i, ba8Var.c, ba8Var.f, ba8Var.j, ba8Var.k);
                this.q = new zka((Object) null);
                this.r = new zka((Object) null);
                this.s = new RectF();
                this.t = ba8Var.a;
                this.p = ba8Var.l;
                this.u = (int) (pnaVar.E.b() / 32.0f);
                ke1 ke1VarA = ba8Var.b.a();
                this.v = (x98) ke1VarA;
                ke1VarA.a(this);
                le1Var.d(ke1VarA);
                ke1 ke1VarA2 = ba8Var.d.a();
                this.w = (x98) ke1VarA2;
                ke1VarA2.a(this);
                le1Var.d(ke1VarA2);
                ke1 ke1VarA3 = ba8Var.e.a();
                this.x = (x98) ke1VarA3;
                ke1VarA3.a(this);
                le1Var.d(ke1VarA3);
            }
            join = Paint.Join.BEVEL;
        }
        join2 = join;
        super(pnaVar, le1Var, cap, join2, ba8Var.i, ba8Var.c, ba8Var.f, ba8Var.j, ba8Var.k);
        this.q = new zka((Object) null);
        this.r = new zka((Object) null);
        this.s = new RectF();
        this.t = ba8Var.a;
        this.p = ba8Var.l;
        this.u = (int) (pnaVar.E.b() / 32.0f);
        ke1 ke1VarA4 = ba8Var.b.a();
        this.v = (x98) ke1VarA4;
        ke1VarA4.a(this);
        le1Var.d(ke1VarA4);
        ke1 ke1VarA22 = ba8Var.d.a();
        this.w = (x98) ke1VarA22;
        ke1VarA22.a(this);
        le1Var.d(ke1VarA22);
        ke1 ke1VarA32 = ba8Var.e.a();
        this.x = (x98) ke1VarA32;
        ke1VarA32.a(this);
        le1Var.d(ke1VarA32);
    }

    public final int d() {
        float f = this.w.d;
        float f2 = this.u;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.x.d * f2);
        int iRound3 = Math.round(this.v.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.te1, defpackage.pg6
    public final void f(Canvas canvas, Matrix matrix, int i, gh6 gh6Var) {
        Shader radialGradient;
        if (this.p) {
            return;
        }
        c(this.s, matrix, false);
        int i2 = this.t;
        x98 x98Var = this.v;
        x98 x98Var2 = this.x;
        x98 x98Var3 = this.w;
        if (i2 == 1) {
            long jD = d();
            zka zkaVar = this.q;
            radialGradient = (LinearGradient) zkaVar.b(jD);
            if (radialGradient == null) {
                PointF pointF = (PointF) x98Var3.d();
                PointF pointF2 = (PointF) x98Var2.d();
                w98 w98Var = (w98) x98Var.d();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, w98Var.b, w98Var.a, Shader.TileMode.CLAMP);
                zkaVar.f(jD, radialGradient);
            }
        } else {
            long jD2 = d();
            zka zkaVar2 = this.r;
            radialGradient = (RadialGradient) zkaVar2.b(jD2);
            if (radialGradient == null) {
                PointF pointF3 = (PointF) x98Var3.d();
                PointF pointF4 = (PointF) x98Var2.d();
                w98 w98Var2 = (w98) x98Var.d();
                int[] iArr = w98Var2.b;
                float[] fArr = w98Var2.a;
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r9, pointF4.y - r10), iArr, fArr, Shader.TileMode.CLAMP);
                zkaVar2.f(jD2, radialGradient);
            }
        }
        this.i.setShader(radialGradient);
        super.f(canvas, matrix, i, gh6Var);
    }
}
