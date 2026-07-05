package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.anthropic.claude.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cd9 {
    public final bd9 a;
    public final fd9 b;
    public boolean c;
    public final float d;

    public cd9(Window window, bd9 bd9Var) {
        this.a = bd9Var;
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            sz6.j("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
            throw null;
        }
        View rootView = viewPeekDecorView.getRootView();
        Object tag = rootView.getTag(R.id.metricsStateHolder);
        if (tag == null) {
            tag = new fxc();
            rootView.setTag(R.id.metricsStateHolder, tag);
        }
        fxc fxcVar = (fxc) tag;
        if (fxcVar.a == null) {
            rl rlVar = new rl();
            rlVar.F = new ArrayList();
            rlVar.G = new ArrayList();
            rlVar.H = new ArrayList();
            rlVar.I = new ArrayList();
            rlVar.E = new ArrayList();
            rlVar.J = new ArrayList();
            fxcVar.a = rlVar;
        }
        fd9 gd9Var = Build.VERSION.SDK_INT >= 31 ? new gd9(this, viewPeekDecorView, window) : new fd9(this, viewPeekDecorView, window);
        this.b = gd9Var;
        gd9Var.d.getDecorView().post(new dd9(true, gd9Var));
        this.c = true;
        this.d = 2.0f;
    }

    public final void a(boolean z) {
        if (z != this.c) {
            fd9 fd9Var = this.b;
            fd9Var.d.getDecorView().post(new dd9(z, fd9Var));
            this.c = z;
        }
    }
}
