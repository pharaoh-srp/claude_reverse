package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class md5 {
    public final AndroidComposeView a;
    public final fj0 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public cjh j;
    public yjh k;
    public occ l;
    public l9e n;
    public l9e o;
    public final Object c = new Object();
    public bz7 m = bx.c0;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = nwa.a();
    public final Matrix r = new Matrix();

    public md5(AndroidComposeView androidComposeView, fj0 fj0Var) {
        this.a = androidComposeView;
        this.b = fj0Var;
    }

    public final void a() {
        fj0 fj0Var = this.b;
        kw9 kw9Var = (kw9) fj0Var.F;
        InputMethodManager inputMethodManager = (InputMethodManager) kw9Var.getValue();
        View view = (View) fj0Var.E;
        if (inputMethodManager.isActive(view)) {
            bz7 bz7Var = this.m;
            float[] fArr = this.q;
            bz7Var.invoke(new nwa(fArr));
            this.a.s(fArr);
            Matrix matrix = this.r;
            csg.M(matrix, fArr);
            cjh cjhVar = this.j;
            cjhVar.getClass();
            occ occVar = this.l;
            occVar.getClass();
            yjh yjhVar = this.k;
            yjhVar.getClass();
            l9e l9eVar = this.n;
            l9eVar.getClass();
            l9e l9eVar2 = this.o;
            l9eVar2.getClass();
            ((InputMethodManager) kw9Var.getValue()).updateCursorAnchorInfo(view, jvk.i(this.p, cjhVar, occVar, yjhVar, matrix, l9eVar, l9eVar2, this.f, this.g, this.h, this.i));
            this.e = false;
        }
    }
}
