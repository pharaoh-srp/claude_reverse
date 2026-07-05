package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class f2f {
    public final b1f a;
    public boolean b;
    public boolean c;
    public final Paint d;
    public final Paint e;
    public sp0 f;
    public sp0 g;
    public boolean h;

    public f2f(f2f f2fVar) {
        this.b = f2fVar.b;
        this.c = f2fVar.c;
        this.d = new Paint(f2fVar.d);
        this.e = new Paint(f2fVar.e);
        sp0 sp0Var = f2fVar.f;
        if (sp0Var != null) {
            this.f = new sp0(sp0Var);
        }
        sp0 sp0Var2 = f2fVar.g;
        if (sp0Var2 != null) {
            this.g = new sp0(sp0Var2);
        }
        this.h = f2fVar.h;
        try {
            this.a = (b1f) f2fVar.a.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.a = b1f.a();
        }
    }

    public f2f() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.a = b1f.a();
    }
}
