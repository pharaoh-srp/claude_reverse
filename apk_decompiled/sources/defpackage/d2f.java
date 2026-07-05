package defpackage;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes3.dex */
public class d2f extends ktk {
    public float c;
    public float d;
    public final /* synthetic */ h2f e;

    public d2f(h2f h2fVar, float f, float f2) {
        this.e = h2fVar;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.ktk
    public void q(String str) {
        h2f h2fVar = this.e;
        Canvas canvas = (Canvas) h2fVar.b;
        if (h2fVar.X()) {
            f2f f2fVar = (f2f) h2fVar.d;
            if (f2fVar.b) {
                canvas.drawText(str, this.c, this.d, f2fVar.d);
            }
            f2f f2fVar2 = (f2f) h2fVar.d;
            if (f2fVar2.c) {
                canvas.drawText(str, this.c, this.d, f2fVar2.e);
            }
        }
        this.c = ((f2f) h2fVar.d).d.measureText(str) + this.c;
    }
}
