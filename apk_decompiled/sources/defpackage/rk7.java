package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rk7 implements pg6, ge1, ym4 {
    public final Path a;
    public final ps9 b;
    public final le1 c;
    public final boolean d;
    public final ArrayList e;
    public final g54 f;
    public final g54 g;
    public final pna h;
    public final g54 i;
    public float j;

    public rk7(pna pnaVar, le1 le1Var, m0g m0gVar) {
        Path path = new Path();
        this.a = path;
        this.b = new ps9(1, 0);
        this.e = new ArrayList();
        this.c = le1Var;
        b80 b80Var = m0gVar.d;
        b80 b80Var2 = m0gVar.c;
        this.d = m0gVar.e;
        this.h = pnaVar;
        if (le1Var.j() != null) {
            g54 g54VarA = ((c80) le1Var.j().F).a();
            this.i = g54VarA;
            g54VarA.a(this);
            le1Var.d(g54VarA);
        }
        if (b80Var2 == null) {
            this.f = null;
            this.g = null;
            return;
        }
        path.setFillType(m0gVar.b);
        ke1 ke1VarA = b80Var2.a();
        this.f = (g54) ke1VarA;
        ke1VarA.a(this);
        le1Var.d(ke1VarA);
        ke1 ke1VarA2 = b80Var.a();
        this.g = (g54) ke1VarA2;
        ke1VarA2.a(this);
        le1Var.d(ke1VarA2);
    }

    @Override // defpackage.ge1
    public final void a() {
        this.h.invalidateSelf();
    }

    @Override // defpackage.ym4
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            ym4 ym4Var = (ym4) list2.get(i);
            if (ym4Var instanceof quc) {
                this.e.add((quc) ym4Var);
            }
        }
    }

    @Override // defpackage.pg6
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((quc) arrayList.get(i)).e(), matrix);
                i++;
            }
        }
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
    @Override // defpackage.pg6
    public final void f(Canvas canvas, Matrix matrix, int i, gh6 gh6Var) {
        MaskFilter maskFilter;
        if (this.d) {
            return;
        }
        g54 g54Var = this.f;
        float fIntValue = ((Integer) this.g.d()).intValue() / 100.0f;
        int iC = (vkb.c((int) (i * fIntValue)) << 24) | (g54Var.k(g54Var.c.k(), g54Var.b()) & 16777215);
        ps9 ps9Var = this.b;
        ps9Var.setColor(iC);
        g54 g54Var2 = this.i;
        if (g54Var2 != null) {
            float fFloatValue = ((Float) g54Var2.d()).floatValue();
            if (fFloatValue == MTTypesetterKt.kLineSkipLimitMultiplier) {
                ps9Var.setMaskFilter(null);
            } else if (fFloatValue != this.j) {
                le1 le1Var = this.c;
                if (le1Var.y == fFloatValue) {
                    maskFilter = le1Var.z;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    le1Var.z = blurMaskFilter;
                    le1Var.y = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                ps9Var.setMaskFilter(maskFilter);
            }
            this.j = fFloatValue;
        }
        if (gh6Var != null) {
            gh6Var.a((int) (fIntValue * 255.0f), ps9Var);
        } else {
            ps9Var.clearShadowLayer();
        }
        Path path = this.a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, ps9Var);
                return;
            } else {
                path.addPath(((quc) arrayList.get(i2)).e(), matrix);
                i2++;
            }
        }
    }
}
