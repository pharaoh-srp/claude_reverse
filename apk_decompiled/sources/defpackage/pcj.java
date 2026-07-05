package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class pcj extends ocj {
    public f59 s;

    public pcj(bdj bdjVar, pcj pcjVar) {
        super(bdjVar, pcjVar);
        this.s = null;
        this.s = pcjVar.s;
    }

    @Override // defpackage.xcj
    public bdj b() {
        return bdj.c(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.xcj
    public bdj c() {
        return bdj.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.xcj
    public final f59 l() {
        if (this.s == null) {
            WindowInsets windowInsets = this.c;
            this.s = f59.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.s;
    }

    @Override // defpackage.xcj
    public boolean s() {
        return this.c.isConsumed();
    }

    @Override // defpackage.xcj
    public void z(f59 f59Var) {
        this.s = f59Var;
    }

    public pcj(bdj bdjVar, WindowInsets windowInsets) {
        super(bdjVar, windowInsets);
        this.s = null;
    }
}
