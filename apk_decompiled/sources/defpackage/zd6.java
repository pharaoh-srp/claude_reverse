package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes2.dex */
public final class zd6 extends CharacterStyle implements UpdateAppearance {
    public final yd6 E;

    public zd6(yd6 yd6Var) {
        this.E = yd6Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            qk7 qk7Var = qk7.a;
            yd6 yd6Var = this.E;
            if (x44.r(yd6Var, qk7Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(yd6Var instanceof ksg)) {
                wg6.i();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            ksg ksgVar = (ksg) yd6Var;
            textPaint.setStrokeWidth(ksgVar.a);
            textPaint.setStrokeMiter(ksgVar.b);
            int i = ksgVar.d;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = ksgVar.c;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            ruc rucVar = ksgVar.e;
            textPaint.setPathEffect(rucVar != null ? ((d40) rucVar).a : null);
        }
    }
}
