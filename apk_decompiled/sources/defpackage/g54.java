package defpackage;

import android.graphics.PointF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g54 extends sp9 {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g54(List list, int i) {
        super(list);
        this.h = i;
    }

    public static float j(rp9 rp9Var, float f) {
        Object obj = rp9Var.b;
        if (obj == null || rp9Var.c == null) {
            sz6.j("Missing values for keyframe.");
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        if (rp9Var.i == -3987645.8f) {
            rp9Var.i = ((Float) obj).floatValue();
        }
        float f2 = rp9Var.i;
        if (rp9Var.j == -3987645.8f) {
            rp9Var.j = ((Float) rp9Var.c).floatValue();
        }
        return vkb.e(f2, rp9Var.j, f);
    }

    @Override // defpackage.ke1
    public final Object e(rp9 rp9Var, float f) {
        int i;
        Object obj;
        switch (this.h) {
            case 0:
                return Integer.valueOf(k(rp9Var, f));
            case 1:
                return Float.valueOf(j(rp9Var, f));
            case 2:
                Object obj2 = rp9Var.b;
                if (obj2 == null) {
                    sz6.j("Missing values for keyframe.");
                    return null;
                }
                Object obj3 = rp9Var.c;
                if (obj3 == null) {
                    if (rp9Var.k == 784923401) {
                        rp9Var.k = ((Integer) obj2).intValue();
                    }
                    i = rp9Var.k;
                } else {
                    if (rp9Var.l == 784923401) {
                        rp9Var.l = ((Integer) obj3).intValue();
                    }
                    i = rp9Var.l;
                }
                if (rp9Var.k == 784923401) {
                    rp9Var.k = ((Integer) obj2).intValue();
                }
                int i2 = rp9Var.k;
                PointF pointF = vkb.a;
                return Integer.valueOf((int) ((f * (i - i2)) + i2));
            default:
                return (f != 1.0f || (obj = rp9Var.c) == null) ? (w96) rp9Var.b : (w96) obj;
        }
    }

    public float i() {
        return j(this.c.k(), b());
    }

    public int k(rp9 rp9Var, float f) {
        if (rp9Var.b != null && rp9Var.c != null) {
            return fpk.f(vkb.b(f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f), ((Integer) rp9Var.b).intValue(), ((Integer) rp9Var.c).intValue());
        }
        sz6.j("Missing values for keyframe.");
        return 0;
    }
}
