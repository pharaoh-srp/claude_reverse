package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class pg0 implements ldc, vdb {
    public final /* synthetic */ ah0 E;

    public /* synthetic */ pg0(ah0 ah0Var) {
        this.E = ah0Var;
    }

    @Override // defpackage.vdb
    public void a(vcb vcbVar, boolean z) {
        this.E.h(vcbVar);
    }

    @Override // defpackage.ldc
    public bdj j(View view, bdj bdjVar) {
        int i;
        boolean z;
        boolean z2;
        bdj bdjVarB = bdjVar;
        xcj xcjVar = bdjVarB.a;
        int i2 = xcjVar.n().b;
        ah0 ah0Var = this.E;
        Context context = ah0Var.I;
        int i3 = xcjVar.n().b;
        ActionBarContextView actionBarContextView = ah0Var.R;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ah0Var.R.getLayoutParams();
            if (ah0Var.R.isShown()) {
                if (ah0Var.z0 == null) {
                    ah0Var.z0 = new Rect();
                    ah0Var.A0 = new Rect();
                }
                Rect rect = ah0Var.z0;
                Rect rect2 = ah0Var.A0;
                rect.set(xcjVar.n().a, xcjVar.n().b, xcjVar.n().c, xcjVar.n().d);
                ViewGroup viewGroup = ah0Var.X;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = wyi.a;
                    vyi.a(viewGroup, rect, rect2);
                } else {
                    if (!wyi.a) {
                        wyi.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            wyi.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                wyi.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = wyi.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i4 = rect.top;
                int i5 = rect.left;
                int i6 = rect.right;
                ViewGroup viewGroup2 = ah0Var.X;
                WeakHashMap weakHashMap = mvi.a;
                bdj bdjVarA = gvi.a(viewGroup2);
                int i7 = bdjVarA == null ? 0 : bdjVarA.a.n().a;
                int i8 = bdjVarA == null ? 0 : bdjVarA.a.n().c;
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z2 = true;
                }
                if (i4 <= 0 || ah0Var.Z != null) {
                    View view2 = ah0Var.Z;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i9 = marginLayoutParams2.height;
                        int i10 = marginLayoutParams.topMargin;
                        if (i9 != i10 || marginLayoutParams2.leftMargin != i7 || marginLayoutParams2.rightMargin != i8) {
                            marginLayoutParams2.height = i10;
                            marginLayoutParams2.leftMargin = i7;
                            marginLayoutParams2.rightMargin = i8;
                            ah0Var.Z.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    ah0Var.Z = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i7;
                    layoutParams.rightMargin = i8;
                    ah0Var.X.addView(ah0Var.Z, -1, layoutParams);
                }
                View view4 = ah0Var.Z;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = ah0Var.Z;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!ah0Var.e0 && z) {
                    i3 = 0;
                }
                i = 0;
                z = z;
                z = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                i = 0;
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                i = 0;
                z = false;
                z = false;
            }
            if (z) {
                ah0Var.R.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = ah0Var.Z;
        if (view6 != null) {
            view6.setVisibility(z ? i : 8);
        }
        if (i2 != i3) {
            int i11 = xcjVar.n().a;
            int i12 = xcjVar.n().c;
            int i13 = xcjVar.n().d;
            int i14 = Build.VERSION.SDK_INT;
            ncj mcjVar = i14 >= 36 ? new mcj(bdjVarB) : i14 >= 35 ? new lcj(bdjVarB) : i14 >= 34 ? new kcj(bdjVarB) : i14 >= 31 ? new jcj(bdjVarB) : i14 >= 30 ? new icj(bdjVarB) : i14 >= 29 ? new hcj(bdjVarB) : new fcj(bdjVarB);
            mcjVar.h(f59.c(i11, i3, i12, i13));
            bdjVarB = mcjVar.b();
        }
        WeakHashMap weakHashMap2 = mvi.a;
        WindowInsets windowInsetsB = bdjVarB.b();
        if (windowInsetsB == null) {
            return bdjVarB;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsB);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsB) ? bdj.c(windowInsetsOnApplyWindowInsets, view) : bdjVarB;
    }

    @Override // defpackage.vdb
    public boolean s(vcb vcbVar) {
        Window.Callback callback = this.E.J.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, vcbVar);
        return true;
    }
}
