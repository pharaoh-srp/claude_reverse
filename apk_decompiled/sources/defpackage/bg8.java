package defpackage;

import android.view.WindowId;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class bg8 {
    public WindowId d;
    public boolean g;
    public final lsc a = mpk.P(new fcc(9205357640488583168L));
    public final lsc b = mpk.P(new k8g(9205357640488583168L));
    public final hsc c = new hsc(MTTypesetterKt.kLineSkipLimitMultiplier);
    public final pdg e = new pdg();
    public final lsc f = mpk.P(null);

    public final ja8 a() {
        return (ja8) this.f.getValue();
    }

    public final long b() {
        return ((fcc) this.a.getValue()).a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HazeArea(");
        sb.append("positionOnScreen=" + fcc.k(b()) + ", ");
        sb.append("size=" + k8g.h(((k8g) this.b.getValue()).a) + ", ");
        sb.append("zIndex=" + this.c.h() + ", ");
        sb.append("contentLayer=" + a() + ", ");
        sb.append("contentDrawing=" + this.g);
        sb.append(")");
        return sb.toString();
    }
}
