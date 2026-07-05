package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class jhe implements pg6, quc, ta8, ge1, ym4 {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final pna c;
    public final le1 d;
    public final boolean e;
    public final g54 f;
    public final g54 g;
    public final c5i h;
    public sn4 i;

    public jhe(pna pnaVar, le1 le1Var, p9e p9eVar) {
        this.c = pnaVar;
        this.d = le1Var;
        this.e = p9eVar.c;
        g54 g54VarA = p9eVar.b.a();
        this.f = g54VarA;
        le1Var.d(g54VarA);
        g54VarA.a(this);
        g54 g54VarA2 = ((c80) p9eVar.d).a();
        this.g = g54VarA2;
        le1Var.d(g54VarA2);
        g54VarA2.a(this);
        i80 i80Var = (i80) p9eVar.e;
        i80Var.getClass();
        c5i c5iVar = new c5i(i80Var);
        this.h = c5iVar;
        c5iVar.a(le1Var);
        c5iVar.b(this);
    }

    @Override // defpackage.ge1
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.ym4
    public final void b(List list, List list2) {
        this.i.b(list, list2);
    }

    @Override // defpackage.pg6
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.i.c(rectF, matrix, z);
    }

    @Override // defpackage.ta8
    public final void d(ListIterator listIterator) {
        if (this.i != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((ym4) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.i = new sn4(this.c, this.d, this.e, arrayList, null);
    }

    @Override // defpackage.quc
    public final Path e() {
        Path pathE = this.i.e();
        Path path = this.b;
        path.reset();
        float fFloatValue = ((Float) this.f.d()).floatValue();
        float fFloatValue2 = ((Float) this.g.d()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixE = this.h.e(i + fFloatValue2);
            Matrix matrix = this.a;
            matrix.set(matrixE);
            path.addPath(pathE, matrix);
        }
        return path;
    }

    @Override // defpackage.pg6
    public final void f(Canvas canvas, Matrix matrix, int i, gh6 gh6Var) {
        float fFloatValue = ((Float) this.f.d()).floatValue();
        float fFloatValue2 = ((Float) this.g.d()).floatValue();
        c5i c5iVar = this.h;
        float fFloatValue3 = ((Float) c5iVar.v.d()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) c5iVar.w.d()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(c5iVar.e(f + fFloatValue2));
            this.i.f(canvas, matrix2, (int) (vkb.e(fFloatValue3, fFloatValue4, f / fFloatValue) * i), gh6Var);
        }
    }
}
