package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class vcj extends ucj {
    public static final bdj x = bdj.c(WindowInsets.CONSUMED, null);

    public vcj(bdj bdjVar, WindowInsets windowInsets) {
        super(bdjVar, windowInsets);
    }

    @Override // defpackage.tcj, defpackage.ocj, defpackage.xcj
    public f59 i(int i) {
        return f59.d(this.c.getInsets(adj.a(i)));
    }

    @Override // defpackage.tcj, defpackage.ocj, defpackage.xcj
    public f59 j(int i) {
        return f59.d(this.c.getInsetsIgnoringVisibility(adj.a(i)));
    }

    @Override // defpackage.ocj, defpackage.xcj
    public void p(View view) {
    }

    @Override // defpackage.tcj, defpackage.ocj, defpackage.xcj
    public boolean u(int i) {
        return this.c.isVisible(adj.a(i));
    }

    public vcj(bdj bdjVar, vcj vcjVar) {
        super(bdjVar, vcjVar);
    }
}
