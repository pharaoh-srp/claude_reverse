package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class b57 extends hqb implements r78 {
    public Rect S;

    @Override // defpackage.hqb
    public final void i1() {
        p1(null);
    }

    @Override // defpackage.r78
    public final void o0(m5c m5cVar) {
        l9e l9eVarJ = nai.A(m5cVar).J(m5cVar, true);
        p1(new Rect(mwa.L(l9eVarJ.a), mwa.L(l9eVarJ.b), mwa.L(l9eVarJ.c), mwa.L(l9eVarJ.d)));
    }

    public final void p1(Rect rect) {
        wwb wwbVar = new wwb(0, new Rect[16]);
        wwbVar.e(wwbVar.G, eve.Q(this).getSystemGestureExclusionRects());
        Rect rect2 = this.S;
        if (rect2 != null) {
            wwbVar.l(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            wwbVar.b(rect);
        }
        eve.Q(this).setSystemGestureExclusionRects(wwbVar.g());
        this.S = rect;
    }
}
