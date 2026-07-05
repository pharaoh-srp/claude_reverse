package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class rcj extends qcj {
    public f59 t;
    public f59 u;
    public f59 v;

    public rcj(bdj bdjVar, WindowInsets windowInsets) {
        super(bdjVar, windowInsets);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.xcj
    public f59 k() {
        if (this.u == null) {
            this.u = f59.d(this.c.getMandatorySystemGestureInsets());
        }
        return this.u;
    }

    @Override // defpackage.xcj
    public f59 m() {
        if (this.t == null) {
            this.t = f59.d(this.c.getSystemGestureInsets());
        }
        return this.t;
    }

    @Override // defpackage.xcj
    public f59 o() {
        if (this.v == null) {
            this.v = f59.d(this.c.getTappableElementInsets());
        }
        return this.v;
    }

    @Override // defpackage.ocj, defpackage.xcj
    public bdj r(int i, int i2, int i3, int i4) {
        return bdj.c(this.c.inset(i, i2, i3, i4), null);
    }

    @Override // defpackage.pcj, defpackage.xcj
    public void z(f59 f59Var) {
    }

    public rcj(bdj bdjVar, rcj rcjVar) {
        super(bdjVar, rcjVar);
        this.t = null;
        this.u = null;
        this.v = null;
    }
}
