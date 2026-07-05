package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public class odb {
    public final Context a;
    public final vcb b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public vdb h;
    public mdb i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final ndb k = new ndb(this);

    public odb(Context context, vcb vcbVar, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = vcbVar;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final mdb a() {
        mdb nkgVar;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                nkgVar = new oe2(context2, this.e, this.d, this.c);
            } else {
                nkgVar = new nkg(context2, this.b, this.e, this.d, this.c);
            }
            nkgVar.l(this.b);
            nkgVar.r(this.k);
            nkgVar.n(this.e);
            nkgVar.f(this.h);
            nkgVar.o(this.g);
            nkgVar.p(this.f);
            this.i = nkgVar;
        }
        return this.i;
    }

    public final boolean b() {
        mdb mdbVar = this.i;
        return mdbVar != null && mdbVar.b();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        mdb mdbVarA = a();
        mdbVarA.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            mdbVarA.q(i);
            mdbVarA.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            mdbVarA.E = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        mdbVarA.g();
    }
}
