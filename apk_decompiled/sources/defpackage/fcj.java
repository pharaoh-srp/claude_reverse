package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class fcj extends ncj {
    public static Field g = null;
    public static boolean h = false;
    public static Constructor i = null;
    public static boolean j = false;
    public WindowInsets e;
    public f59 f;

    public fcj() {
        this.e = j();
    }

    private static WindowInsets j() {
        if (!h) {
            try {
                g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // defpackage.ncj
    public bdj b() {
        a();
        bdj bdjVarC = bdj.c(this.e, null);
        f59[] f59VarArr = this.b;
        xcj xcjVar = bdjVarC.a;
        xcjVar.w(f59VarArr);
        xcjVar.z(this.f);
        xcjVar.v(null);
        xcjVar.B(this.c);
        xcjVar.C(this.d);
        return bdjVarC;
    }

    @Override // defpackage.ncj
    public void f(f59 f59Var) {
        this.f = f59Var;
    }

    @Override // defpackage.ncj
    public void h(f59 f59Var) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(f59Var.a, f59Var.b, f59Var.c, f59Var.d);
        }
    }

    public fcj(bdj bdjVar) {
        super(bdjVar);
        this.e = bdjVar.b();
    }
}
