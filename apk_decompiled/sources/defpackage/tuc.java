package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class tuc extends sp9 {
    public final PointF h;
    public final float[] i;
    public final float[] j;
    public final PathMeasure k;
    public suc l;

    public tuc(ArrayList arrayList) {
        super(arrayList);
        this.h = new PointF();
        this.i = new float[2];
        this.j = new float[2];
        this.k = new PathMeasure();
    }

    @Override // defpackage.ke1
    public final Object e(rp9 rp9Var, float f) {
        suc sucVar = (suc) rp9Var;
        Path path = sucVar.q;
        if (path == null) {
            return (PointF) rp9Var.b;
        }
        suc sucVar2 = this.l;
        PathMeasure pathMeasure = this.k;
        if (sucVar2 != sucVar) {
            pathMeasure.setPath(path, false);
            this.l = sucVar;
        }
        float length = pathMeasure.getLength();
        float f2 = f * length;
        float[] fArr = this.i;
        float[] fArr2 = this.j;
        pathMeasure.getPosTan(f2, fArr, fArr2);
        float f3 = fArr[0];
        float f4 = fArr[1];
        PointF pointF = this.h;
        pointF.set(f3, f4);
        if (f2 < MTTypesetterKt.kLineSkipLimitMultiplier) {
            pointF.offset(fArr2[0] * f2, fArr2[1] * f2);
            return pointF;
        }
        if (f2 > length) {
            float f5 = f2 - length;
            pointF.offset(fArr2[0] * f5, fArr2[1] * f5);
        }
        return pointF;
    }
}
