package defpackage;

import android.graphics.Paint;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class i5a {
    public final u7g a;
    public final k5a b;
    public final m5a c;
    public final rl7 d;
    public final Paint e;

    public i5a(u7g u7gVar, m5a m5aVar, int i) {
        k5a k5aVar = new k5a(Paint.Cap.BUTT);
        m5aVar = (i & 8) != 0 ? null : m5aVar;
        rl7 rl7Var = c0l.O;
        je2 je2Var = ke2.a;
        DecimalFormat decimalFormat = new DecimalFormat("#.##;−#.##");
        je2Var.getClass();
        new ie2(decimalFormat);
        rl7Var.getClass();
        y9d.E.getClass();
        this.a = u7gVar;
        this.b = k5aVar;
        this.c = m5aVar;
        this.d = rl7Var;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.e = paint;
    }
}
