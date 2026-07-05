package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s0g extends le1 {
    public final sn4 B;
    public final me4 C;
    public final ih6 D;

    public s0g(pna pnaVar, rt9 rt9Var, me4 me4Var, bna bnaVar) {
        super(pnaVar, rt9Var);
        this.C = me4Var;
        sn4 sn4Var = new sn4(pnaVar, this, new o0g("__container", rt9Var.a, false), bnaVar);
        this.B = sn4Var;
        List list = Collections.EMPTY_LIST;
        sn4Var.b(list, list);
        h80 h80Var = this.p.x;
        if (h80Var != null) {
            this.D = new ih6(this, this, h80Var);
        }
    }

    @Override // defpackage.le1, defpackage.pg6
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.B.c(rectF, this.n, z);
    }

    @Override // defpackage.le1
    public final void i(Canvas canvas, Matrix matrix, int i, gh6 gh6Var) {
        ih6 ih6Var = this.D;
        if (ih6Var != null) {
            gh6Var = ih6Var.b(matrix, i);
        }
        this.B.f(canvas, matrix, i, gh6Var);
    }

    @Override // defpackage.le1
    public final ive j() {
        ive iveVar = this.p.w;
        return iveVar != null ? iveVar : this.C.p.w;
    }
}
