package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class tcj extends rcj {
    public static final bdj w = bdj.c(WindowInsets.CONSUMED, null);

    public tcj(bdj bdjVar, WindowInsets windowInsets) {
        super(bdjVar, windowInsets);
    }

    @Override // defpackage.ocj, defpackage.xcj
    public final void d(View view) {
    }

    @Override // defpackage.ocj, defpackage.xcj
    public f59 i(int i) {
        return f59.d(this.c.getInsets(zcj.a(i)));
    }

    @Override // defpackage.ocj, defpackage.xcj
    public f59 j(int i) {
        return f59.d(this.c.getInsetsIgnoringVisibility(zcj.a(i)));
    }

    @Override // defpackage.ocj, defpackage.xcj
    public boolean u(int i) {
        return this.c.isVisible(zcj.a(i));
    }

    public tcj(bdj bdjVar, tcj tcjVar) {
        super(bdjVar, tcjVar);
    }
}
