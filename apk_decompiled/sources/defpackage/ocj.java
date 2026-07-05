package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ocj extends xcj {
    public static boolean n = false;
    public static Method o;
    public static Class p;
    public static Field q;
    public static Field r;
    public final WindowInsets c;
    public f59[] d;
    public f59 e;
    public bdj f;
    public f59 g;
    public int h;
    public s86 i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;

    public ocj(bdj bdjVar, WindowInsets windowInsets) {
        super(bdjVar);
        this.e = null;
        this.l = new Rect[10][];
        this.m = new Rect[10][];
        this.c = windowInsets;
    }

    private s86 D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.t()) {
            return s86.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        uve uveVarG = zsj.g(display, 0);
        uve uveVarG2 = zsj.g(display, 1);
        uve uveVarG3 = zsj.g(display, 2);
        uve uveVarG4 = zsj.g(display, 3);
        return s86.a(point.x, point.y, false, uveVarG != null ? uveVarG.a() : 0, uveVarG2 != null ? uveVarG2.a() : 0, uveVarG3 != null ? uveVarG3.a() : 0, uveVarG4 != null ? uveVarG4.a() : 0);
    }

    private static List<Rect> E(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[ycj.b(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] F(f59 f59Var) {
        ArrayList arrayList = new ArrayList();
        int i = f59Var.a;
        int i2 = f59Var.d;
        int i3 = f59Var.c;
        int i4 = f59Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, f59Var.a, this.j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.k, i4));
        }
        if (i3 != 0) {
            int i5 = this.k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
        }
        if (i2 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(0, i6 - i2, this.k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private f59 G(int i, boolean z) {
        f59 f59VarA = f59.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                f59VarA = f59.a(f59VarA, H(i2, z));
            }
        }
        return f59VarA;
    }

    private f59 I() {
        bdj bdjVar = this.f;
        return bdjVar != null ? bdjVar.a.l() : f59.e;
    }

    private f59 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            pmf.n("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!n) {
            L();
        }
        Method method = o;
        if (method != null && p != null && q != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) q.get(r.get(objInvoke));
                if (rect != null) {
                    return f59.c(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void L() {
        try {
            o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            p = cls;
            q = cls.getDeclaredField("mVisibleInsets");
            r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            q.setAccessible(true);
            r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        n = true;
    }

    public static boolean M(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.xcj
    public void A(int i) {
        this.h = i;
    }

    @Override // defpackage.xcj
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.xcj
    public void C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    public f59 H(int i, boolean z) {
        f59 f59VarL;
        int i2;
        f59 f59Var = f59.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    f59[] f59VarArr = this.d;
                    f59VarL = f59VarArr != null ? f59VarArr[ycj.b(8)] : null;
                    if (f59VarL != null) {
                        return f59VarL;
                    }
                    f59 f59VarN = n();
                    f59 f59VarI = I();
                    int i3 = f59VarN.d;
                    if (i3 > f59VarI.d) {
                        return f59.c(0, 0, 0, i3);
                    }
                    f59 f59Var2 = this.g;
                    if (f59Var2 != null && !f59Var2.equals(f59Var) && (i2 = this.g.d) > f59VarI.d) {
                        return f59.c(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return m();
                    }
                    if (i == 32) {
                        return k();
                    }
                    if (i == 64) {
                        return o();
                    }
                    if (i == 128) {
                        bdj bdjVar = this.f;
                        j86 j86VarH = bdjVar != null ? bdjVar.a.h() : h();
                        if (j86VarH != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return f59.c(i4 >= 28 ? je0.f(j86VarH.a) : 0, i4 >= 28 ? je0.h(j86VarH.a) : 0, i4 >= 28 ? je0.g(j86VarH.a) : 0, i4 >= 28 ? je0.e(j86VarH.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    f59 f59VarI2 = I();
                    f59 f59VarL2 = l();
                    return f59.c(Math.max(f59VarI2.a, f59VarL2.a), 0, Math.max(f59VarI2.c, f59VarL2.c), Math.max(f59VarI2.d, f59VarL2.d));
                }
                if ((this.h & 2) == 0) {
                    f59 f59VarN2 = n();
                    bdj bdjVar2 = this.f;
                    f59VarL = bdjVar2 != null ? bdjVar2.a.l() : null;
                    int iMin = f59VarN2.d;
                    if (f59VarL != null) {
                        iMin = Math.min(iMin, f59VarL.d);
                    }
                    return f59.c(f59VarN2.a, 0, f59VarN2.c, iMin);
                }
            }
        } else {
            if (z) {
                return f59.c(0, Math.max(I().b, n().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return f59.c(0, n().b, 0, 0);
            }
        }
        return f59Var;
    }

    public boolean K(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !H(i, false).equals(f59.e);
    }

    @Override // defpackage.xcj
    public void d(View view) {
        this.k = view.getWidth();
        this.j = view.getHeight();
        f59 f59VarJ = J(view);
        if (f59VarJ == null) {
            f59VarJ = f59.e;
        }
        x(f59VarJ);
    }

    @Override // defpackage.xcj
    public void e(bdj bdjVar) {
        bdjVar.a.y(this.f);
        f59 f59Var = this.g;
        xcj xcjVar = bdjVar.a;
        xcjVar.x(f59Var);
        xcjVar.A(this.h);
        xcjVar.v(this.i);
        xcjVar.B(this.l);
        xcjVar.C(this.m);
    }

    @Override // defpackage.xcj
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        ocj ocjVar = (ocj) obj;
        return Objects.equals(this.g, ocjVar.g) && M(this.h, ocjVar.h);
    }

    @Override // defpackage.xcj
    public List<Rect> f(int i) {
        return E(this.l, i);
    }

    @Override // defpackage.xcj
    public List<Rect> g(int i) {
        return E(this.m, i);
    }

    @Override // defpackage.xcj
    public f59 i(int i) {
        return G(i, false);
    }

    @Override // defpackage.xcj
    public f59 j(int i) {
        return G(i, true);
    }

    @Override // defpackage.xcj
    public final f59 n() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = f59.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.xcj
    public void p(View view) {
        this.i = D(view);
    }

    @Override // defpackage.xcj
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iB = ycj.b(i);
            this.l[iB] = F(i(i));
            if (i != 8) {
                this.m[iB] = F(j(i));
            }
        }
    }

    @Override // defpackage.xcj
    public bdj r(int i, int i2, int i3, int i4) {
        bdj bdjVarC = bdj.c(this.c, null);
        int i5 = Build.VERSION.SDK_INT;
        ncj mcjVar = i5 >= 36 ? new mcj(bdjVarC) : i5 >= 35 ? new lcj(bdjVarC) : i5 >= 34 ? new kcj(bdjVarC) : i5 >= 31 ? new jcj(bdjVarC) : i5 >= 30 ? new icj(bdjVarC) : i5 >= 29 ? new hcj(bdjVarC) : new fcj(bdjVarC);
        mcjVar.h(bdj.a(n(), i, i2, i3, i4));
        mcjVar.f(bdj.a(l(), i, i2, i3, i4));
        return mcjVar.b();
    }

    @Override // defpackage.xcj
    public boolean t() {
        return this.c.isRound();
    }

    @Override // defpackage.xcj
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !K(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.xcj
    public void v(s86 s86Var) {
        this.i = s86Var;
    }

    @Override // defpackage.xcj
    public void w(f59[] f59VarArr) {
        this.d = f59VarArr;
    }

    @Override // defpackage.xcj
    public void x(f59 f59Var) {
        this.g = f59Var;
    }

    @Override // defpackage.xcj
    public void y(bdj bdjVar) {
        this.f = bdjVar;
    }

    public ocj(bdj bdjVar, ocj ocjVar) {
        this(bdjVar, new WindowInsets(ocjVar.c));
    }
}
