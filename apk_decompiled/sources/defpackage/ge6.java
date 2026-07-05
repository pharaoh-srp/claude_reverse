package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.painter.ColorPainter;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.accompanist.drawablepainter.EmptyPainter;

/* JADX INFO: loaded from: classes.dex */
public abstract class ge6 {
    public static final kw9 a = yb5.w(w1a.G, new rk3(21));

    public static final bpc a(Drawable drawable, ld4 ld4Var) {
        Object drawablePainter;
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(1756822313);
        e18Var.a0(289266787);
        boolean zF = e18Var.f(drawable);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            if (drawable == null) {
                objN = EmptyPainter.J;
            } else {
                if (drawable instanceof ColorDrawable) {
                    drawablePainter = new ColorPainter(d4c.m(((ColorDrawable) drawable).getColor()));
                } else {
                    Drawable drawableMutate = drawable.mutate();
                    drawableMutate.getClass();
                    drawablePainter = new DrawablePainter(drawableMutate);
                }
                objN = drawablePainter;
            }
            e18Var.k0(objN);
        }
        bpc bpcVar = (bpc) objN;
        e18Var.p(false);
        e18Var.p(false);
        return bpcVar;
    }
}
