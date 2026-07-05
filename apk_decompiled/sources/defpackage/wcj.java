package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wcj extends vcj {
    public wcj(bdj bdjVar, WindowInsets windowInsets) {
        super(bdjVar, windowInsets);
    }

    @Override // defpackage.ocj, defpackage.xcj
    public List<Rect> f(int i) {
        return this.c.getBoundingRects(adj.a(i));
    }

    @Override // defpackage.ocj, defpackage.xcj
    public List<Rect> g(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(adj.a(i));
    }

    @Override // defpackage.ocj, defpackage.xcj
    public void q() {
    }

    public wcj(bdj bdjVar, wcj wcjVar) {
        super(bdjVar, wcjVar);
    }
}
