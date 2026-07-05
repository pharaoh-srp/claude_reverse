package defpackage;

import androidx.compose.ui.graphics.shadow.DropShadowPainter;

/* JADX INFO: loaded from: classes.dex */
public final class b7g extends hqb implements vd6, lbc {
    public e0g S;
    public tzf T;
    public DropShadowPainter U;

    @Override // defpackage.lbc
    public final void F0() {
        this.U = null;
        wd6.t0(this);
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        DropShadowPainter dropShadowPainter;
        DropShadowPainter dropShadowPainter2 = this.U;
        if (dropShadowPainter2 == null) {
            xv8 xv8VarB = yfd.X(this).getGraphicsContext().b();
            e0g e0gVar = this.S;
            tzf tzfVar = this.T;
            xv8VarB.getClass();
            DropShadowPainter dropShadowPainter3 = new DropShadowPainter(e0gVar, tzfVar, xv8VarB);
            this.U = dropShadowPainter3;
            dropShadowPainter = dropShadowPainter3;
        } else {
            dropShadowPainter = dropShadowPainter2;
        }
        bpc.h(dropShadowPainter, cv9Var, cv9Var.E.g(), null, 6);
        cv9Var.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b7g)) {
            return false;
        }
        b7g b7gVar = (b7g) obj;
        return x44.r(this.S, b7gVar.S) && x44.r(this.T, b7gVar.T);
    }

    public final int hashCode() {
        return this.T.hashCode() + (this.S.hashCode() * 31);
    }
}
