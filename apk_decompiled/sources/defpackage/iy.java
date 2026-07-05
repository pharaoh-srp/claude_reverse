package defpackage;

import androidx.compose.foundation.gestures.FlingCancellationException;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class iy implements h9f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iy(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.h9f
    public final float b(float f) {
        int i = this.a;
        float fH = MTTypesetterKt.kLineSkipLimitMultiplier;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ky kyVar = (ky) obj2;
                float fE = kyVar.n0.e(f);
                float fH2 = fE - kyVar.n0.j.h();
                ((qy) obj).a(fE, MTTypesetterKt.kLineSkipLimitMultiplier);
                return fH2;
            case 1:
                ry ryVar = (ry) ((q28) obj2).F;
                if (!Float.isNaN(ryVar.j.h())) {
                    fH = ryVar.j.h();
                }
                float fD0 = wd6.d0(fH + f, ryVar.c().e(), ryVar.c().d());
                float fH3 = fD0 - ryVar.j.h();
                ((qy) obj).a(fD0, MTTypesetterKt.kLineSkipLimitMultiplier);
                return fH3;
            default:
                raf rafVar = (raf) obj2;
                if (Math.abs(f) == MTTypesetterKt.kLineSkipLimitMultiplier || ((Boolean) rafVar.h.a()).booleanValue()) {
                    return rafVar.d(rafVar.g(((paf) obj).a(2, rafVar.e(rafVar.h(f)))));
                }
                throw new FlingCancellationException("The fling animation was cancelled");
        }
    }
}
