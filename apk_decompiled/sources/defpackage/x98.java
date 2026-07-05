package defpackage;

import android.graphics.PointF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x98 extends sp9 {
    public final /* synthetic */ int h;
    public final Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x98(List list, int i) {
        super(list);
        this.h = i;
        switch (i) {
            case 1:
                super(list);
                this.i = new PointF();
                break;
            case 2:
                super(list);
                this.i = new n6f(1.0f, 1.0f);
                break;
            default:
                int iMax = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    w98 w98Var = (w98) ((rp9) list.get(i2)).b;
                    if (w98Var != null) {
                        iMax = Math.max(iMax, w98Var.b.length);
                    }
                }
                this.i = new w98(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // defpackage.ke1
    public final Object e(rp9 rp9Var, float f) {
        Object obj;
        int i = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                w98 w98Var = (w98) obj2;
                w98 w98Var2 = (w98) rp9Var.b;
                w98 w98Var3 = (w98) rp9Var.c;
                int[] iArr = w98Var.b;
                float[] fArr = w98Var.a;
                boolean zEquals = w98Var2.equals(w98Var3);
                int[] iArr2 = w98Var2.b;
                if (zEquals || f <= MTTypesetterKt.kLineSkipLimitMultiplier) {
                    w98Var.a(w98Var2);
                } else if (f >= 1.0f) {
                    w98Var.a(w98Var3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = w98Var3.b;
                    if (length != iArr3.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr2.length);
                        sb.append(" vs ");
                        sz6.p(vb7.l(iArr3.length, ")", sb));
                        return null;
                    }
                    for (int i2 = 0; i2 < iArr2.length; i2++) {
                        fArr[i2] = vkb.e(w98Var2.a[i2], w98Var3.a[i2], f);
                        iArr[i2] = fpk.f(f, iArr2[i2], iArr3[i2]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return w98Var;
            case 1:
                return i(rp9Var, f, f);
            default:
                n6f n6fVar = (n6f) obj2;
                Object obj3 = rp9Var.b;
                if (obj3 == null || (obj = rp9Var.c) == null) {
                    sz6.j("Missing values for keyframe.");
                    return null;
                }
                n6f n6fVar2 = (n6f) obj3;
                n6f n6fVar3 = (n6f) obj;
                float fE = vkb.e(n6fVar2.a, n6fVar3.a, f);
                float fE2 = vkb.e(n6fVar2.b, n6fVar3.b, f);
                n6fVar.a = fE;
                n6fVar.b = fE2;
                return n6fVar;
        }
    }

    @Override // defpackage.ke1
    public /* bridge */ /* synthetic */ Object f(rp9 rp9Var, float f, float f2, float f3) {
        switch (this.h) {
            case 1:
                return i(rp9Var, f2, f3);
            default:
                return super.f(rp9Var, f, f2, f3);
        }
    }

    public PointF i(rp9 rp9Var, float f, float f2) {
        Object obj;
        PointF pointF = (PointF) this.i;
        Object obj2 = rp9Var.b;
        if (obj2 == null || (obj = rp9Var.c) == null) {
            sz6.j("Missing values for keyframe.");
            return null;
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        float f3 = pointF2.x;
        float fK = sq6.k(pointF3.x, f3, f, f3);
        float f4 = pointF2.y;
        pointF.set(fK, sq6.k(pointF3.y, f4, f2, f4));
        return pointF;
    }
}
