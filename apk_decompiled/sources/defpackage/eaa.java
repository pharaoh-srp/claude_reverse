package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class eaa implements l5g {
    public static final Method e0;
    public static final Method f0;
    public final Context E;
    public ListAdapter F;
    public dh6 G;
    public int J;
    public int K;
    public boolean M;
    public boolean N;
    public boolean O;
    public baa R;
    public View S;
    public AdapterView.OnItemClickListener T;
    public AdapterView.OnItemSelectedListener U;
    public final Handler Z;
    public Rect b0;
    public boolean c0;
    public final jh0 d0;
    public final int H = -2;
    public int I = -2;
    public final int L = 1002;
    public int P = 0;
    public final int Q = Integer.MAX_VALUE;
    public final aaa V = new aaa(this, 1);
    public final daa W = new daa(this);
    public final caa X = new caa(this);
    public final aaa Y = new aaa(this, 0);
    public final Rect a0 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                e0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public eaa(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.E = context;
        this.Z = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t0e.o, i, 0);
        this.J = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.K = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.M = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        jh0 jh0Var = new jh0(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, t0e.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            jh0Var.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        jh0Var.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : xn5.c0(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.d0 = jh0Var;
        jh0Var.setInputMethodMode(1);
    }

    public dh6 a(Context context, boolean z) {
        return new dh6(context, z);
    }

    @Override // defpackage.l5g
    public final boolean b() {
        return this.d0.isShowing();
    }

    public final int c() {
        return this.J;
    }

    @Override // defpackage.l5g
    public final void dismiss() {
        jh0 jh0Var = this.d0;
        jh0Var.dismiss();
        jh0Var.setContentView(null);
        this.G = null;
        this.Z.removeCallbacks(this.V);
    }

    public final void e(int i) {
        this.J = i;
    }

    @Override // defpackage.l5g
    public final void g() {
        int i;
        int paddingBottom;
        dh6 dh6Var;
        dh6 dh6Var2 = this.G;
        Context context = this.E;
        jh0 jh0Var = this.d0;
        if (dh6Var2 == null) {
            dh6 dh6VarA = a(context, !this.c0);
            this.G = dh6VarA;
            dh6VarA.setAdapter(this.F);
            this.G.setOnItemClickListener(this.T);
            this.G.setFocusable(true);
            this.G.setFocusableInTouchMode(true);
            this.G.setOnItemSelectedListener(new x9a(this));
            this.G.setOnScrollListener(this.X);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.U;
            if (onItemSelectedListener != null) {
                this.G.setOnItemSelectedListener(onItemSelectedListener);
            }
            jh0Var.setContentView(this.G);
        }
        Drawable background = jh0Var.getBackground();
        Rect rect = this.a0;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.M) {
                this.K = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = y9a.a(jh0Var, this.S, this.K, jh0Var.getInputMethodMode() == 2);
        int i3 = this.H;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.I;
            int iA2 = this.G.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.G.getPaddingBottom() + this.G.getPaddingTop() + i : 0);
        }
        boolean z = jh0Var.getInputMethodMode() == 2;
        jh0Var.setWindowLayoutType(this.L);
        if (jh0Var.isShowing()) {
            if (this.S.isAttachedToWindow()) {
                int width = this.I;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.S.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.I;
                    if (z) {
                        jh0Var.setWidth(i5 == -1 ? -1 : 0);
                        jh0Var.setHeight(0);
                    } else {
                        jh0Var.setWidth(i5 == -1 ? -1 : 0);
                        jh0Var.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                jh0Var.setOutsideTouchable(true);
                int i6 = width;
                View view = this.S;
                int i7 = this.J;
                int i8 = this.K;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                jh0Var.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.I;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.S.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        jh0Var.setWidth(width2);
        jh0Var.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = e0;
            if (method != null) {
                try {
                    method.invoke(jh0Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            z9a.b(jh0Var, true);
        }
        jh0Var.setOutsideTouchable(true);
        jh0Var.setTouchInterceptor(this.W);
        if (this.O) {
            jh0Var.setOverlapAnchor(this.N);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f0;
            if (method2 != null) {
                try {
                    method2.invoke(jh0Var, this.b0);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            z9a.a(jh0Var, this.b0);
        }
        jh0Var.showAsDropDown(this.S, this.J, this.K, this.P);
        this.G.setSelection(-1);
        if ((!this.c0 || this.G.isInTouchMode()) && (dh6Var = this.G) != null) {
            dh6Var.setListSelectionHidden(true);
            dh6Var.requestLayout();
        }
        if (this.c0) {
            return;
        }
        this.Z.post(this.Y);
    }

    public final Drawable h() {
        return this.d0.getBackground();
    }

    @Override // defpackage.l5g
    public final dh6 j() {
        return this.G;
    }

    public final void k(Drawable drawable) {
        this.d0.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.K = i;
        this.M = true;
    }

    public final int o() {
        if (this.M) {
            return this.K;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        baa baaVar = this.R;
        if (baaVar == null) {
            this.R = new baa(this);
        } else {
            ListAdapter listAdapter2 = this.F;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(baaVar);
            }
        }
        this.F = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.R);
        }
        dh6 dh6Var = this.G;
        if (dh6Var != null) {
            dh6Var.setAdapter(this.F);
        }
    }

    public final void q(int i) {
        Drawable background = this.d0.getBackground();
        if (background == null) {
            this.I = i;
            return;
        }
        Rect rect = this.a0;
        background.getPadding(rect);
        this.I = rect.left + rect.right + i;
    }
}
