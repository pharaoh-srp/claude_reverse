package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zbj implements View.OnApplyWindowInsetsListener {
    public final s34 a;
    public bdj b;

    public zbj(View view, s34 s34Var) {
        bdj bdjVarB;
        this.a = s34Var;
        WeakHashMap weakHashMap = mvi.a;
        bdj bdjVarA = gvi.a(view);
        if (bdjVarA != null) {
            int i = Build.VERSION.SDK_INT;
            bdjVarB = (i >= 36 ? new mcj(bdjVarA) : i >= 35 ? new lcj(bdjVarA) : i >= 34 ? new kcj(bdjVarA) : i >= 31 ? new jcj(bdjVarA) : i >= 30 ? new icj(bdjVarA) : i >= 29 ? new hcj(bdjVarA) : new fcj(bdjVarA)).b();
        } else {
            bdjVarB = null;
        }
        this.b = bdjVarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = bdj.c(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        bdj bdjVarC = bdj.c(windowInsets, view);
        xcj xcjVar = bdjVarC.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = mvi.a;
            this.b = gvi.a(view);
        }
        if (this.b == null) {
            this.b = bdjVarC;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            s34 s34VarJ = acj.j(view);
            if (s34VarJ == null || !Objects.equals((bdj) s34VarJ.F, bdjVarC)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                bdj bdjVar = this.b;
                int i = 1;
                while (i <= 512) {
                    f59 f59VarI = xcjVar.i(i);
                    f59 f59VarI2 = bdjVar.a.i(i);
                    int i2 = f59VarI.a;
                    int i3 = f59VarI.d;
                    int i4 = f59VarI.c;
                    int i5 = f59VarI.b;
                    int i6 = f59VarI2.a;
                    int i7 = f59VarI2.d;
                    int[] iArr4 = iArr2;
                    int i8 = f59VarI2.c;
                    int i9 = f59VarI2.b;
                    if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i;
                        } else {
                            iArr[0] = iArr[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i10 = iArr2[0];
                int i11 = iArr3[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = bdjVarC;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    bdj bdjVar2 = this.b;
                    ecj ecjVar = new ecj(i12, (i10 & 8) != 0 ? acj.e : (i11 & 8) != 0 ? acj.f : (i10 & 519) != 0 ? acj.g : (i11 & 519) != 0 ? acj.h : null, (i12 & 8) != 0 ? 160L : 250L);
                    ecjVar.a.e(MTTypesetterKt.kLineSkipLimitMultiplier);
                    ValueAnimator duration = ValueAnimator.ofFloat(MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f).setDuration(ecjVar.a.b());
                    f59 f59VarI3 = xcjVar.i(i12);
                    f59 f59VarI4 = bdjVar2.a.i(i12);
                    int iMin = Math.min(f59VarI3.a, f59VarI4.a);
                    int i13 = f59VarI3.b;
                    int i14 = f59VarI4.b;
                    int iMin2 = Math.min(i13, i14);
                    int i15 = f59VarI3.c;
                    int i16 = f59VarI4.c;
                    int iMin3 = Math.min(i15, i16);
                    int i17 = f59VarI3.d;
                    int i18 = f59VarI4.d;
                    cbf cbfVar = new cbf(f59.c(iMin, iMin2, iMin3, Math.min(i17, i18)), 19, f59.c(Math.max(f59VarI3.a, f59VarI4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
                    acj.g(view, ecjVar, bdjVarC, false);
                    duration.addUpdateListener(new xbj(ecjVar, bdjVarC, bdjVar2, i12, view));
                    duration.addListener(new ybj(ecjVar, view));
                    sgc.a(view, new me2(view, ecjVar, cbfVar, duration, 1, false));
                    this.b = bdjVarC;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
