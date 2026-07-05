package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class c2f extends d2f {
    public final Path f;
    public final /* synthetic */ h2f g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2f(h2f h2fVar, Path path, float f) {
        super(h2fVar, f, MTTypesetterKt.kLineSkipLimitMultiplier);
        this.g = h2fVar;
        this.f = path;
    }

    @Override // defpackage.d2f, defpackage.ktk
    public final void q(String str) {
        h2f h2fVar = this.g;
        if (h2fVar.X()) {
            f2f f2fVar = (f2f) h2fVar.d;
            if (f2fVar.b) {
                ((Canvas) h2fVar.b).drawTextOnPath(str, this.f, this.c, this.d, f2fVar.d);
            }
            f2f f2fVar2 = (f2f) h2fVar.d;
            if (f2fVar2.c) {
                ((Canvas) h2fVar.b).drawTextOnPath(str, this.f, this.c, this.d, f2fVar2.e);
            }
        }
        this.c = ((f2f) h2fVar.d).d.measureText(str) + this.c;
    }
}
