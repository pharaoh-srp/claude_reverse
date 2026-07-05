package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class e2f extends ktk {
    public final /* synthetic */ int c;
    public float d;
    public final float e;
    public final /* synthetic */ h2f f;
    public final Object g;

    public e2f(h2f h2fVar, float f, float f2) {
        this.c = 1;
        this.f = h2fVar;
        this.g = new RectF();
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.ktk
    public final boolean p(u1f u1fVar) {
        switch (this.c) {
            case 0:
                if (u1fVar instanceof v1f) {
                    Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                }
                break;
            default:
                if (u1fVar instanceof v1f) {
                    v1f v1fVar = (v1f) u1fVar;
                    h1f h1fVarT = u1fVar.a.T(v1fVar.n);
                    if (h1fVarT != null) {
                        t0f t0fVar = (t0f) h1fVarT;
                        b2f b2fVar = new b2f(t0fVar.o);
                        Matrix matrix = t0fVar.n;
                        Path path = b2fVar.a;
                        if (matrix != null) {
                            path.transform(matrix);
                        }
                        RectF rectF = new RectF();
                        path.computeBounds(rectF, true);
                        ((RectF) this.g).union(rectF);
                    } else {
                        h2f.p("TextPath path reference '%s' not found", v1fVar.n);
                    }
                }
                break;
        }
        return true;
    }

    @Override // defpackage.ktk
    public final void q(String str) {
        String str2;
        int i = this.c;
        Object obj = this.g;
        h2f h2fVar = this.f;
        switch (i) {
            case 0:
                if (h2fVar.X()) {
                    Path path = new Path();
                    str2 = str;
                    ((f2f) h2fVar.d).d.getTextPath(str2, 0, str.length(), this.d, this.e, path);
                    ((Path) obj).addPath(path);
                } else {
                    str2 = str;
                }
                this.d = ((f2f) h2fVar.d).d.measureText(str2) + this.d;
                break;
            default:
                if (h2fVar.X()) {
                    Rect rect = new Rect();
                    ((f2f) h2fVar.d).d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.d, this.e);
                    ((RectF) obj).union(rectF);
                }
                this.d = ((f2f) h2fVar.d).d.measureText(str) + this.d;
                break;
        }
    }

    public e2f(h2f h2fVar, float f, float f2, Path path) {
        this.c = 0;
        this.f = h2fVar;
        this.d = f;
        this.e = f2;
        this.g = path;
    }
}
