package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public class ga4 extends Dialog implements m4a, xdc, izb, u5f {
    public p4a E;
    public final q28 F;
    public final u0h G;
    public final u0h H;

    public ga4(Context context, int i) {
        super(context, i);
        this.F = new q28(new t5f(this, new p3f(4, this)), 29);
        final int i2 = 0;
        this.G = new u0h(new zy7(this) { // from class: fa4
            public final /* synthetic */ ga4 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i3 = i2;
                ga4 ga4Var = this.F;
                switch (i3) {
                    case 0:
                        b56 b56Var = new b56();
                        ga4Var.b().u(b56Var);
                        return b56Var;
                    default:
                        return new vdc(new fc(6, ga4Var));
                }
            }
        });
        final int i3 = 1;
        this.H = new u0h(new zy7(this) { // from class: fa4
            public final /* synthetic */ ga4 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i32 = i3;
                ga4 ga4Var = this.F;
                switch (i32) {
                    case 0:
                        b56 b56Var = new b56();
                        ga4Var.b().u(b56Var);
                        return b56Var;
                    default:
                        return new vdc(new fc(6, ga4Var));
                }
            }
        });
    }

    public static void d(ga4 ga4Var) {
        super.onBackPressed();
    }

    @Override // defpackage.m4a
    public final c4a a() {
        return e();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.izb
    public final dpf b() {
        return c().b().c;
    }

    @Override // defpackage.xdc
    public final vdc c() {
        return (vdc) this.H.getValue();
    }

    public final p4a e() {
        p4a p4aVar = this.E;
        if (p4aVar != null) {
            return p4aVar;
        }
        p4a p4aVar2 = new p4a(this, true);
        this.E = p4aVar2;
        return p4aVar2;
    }

    public final void f() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.u5f
    public final q28 g() {
        return (q28) this.F.G;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((b56) this.G.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            vdc vdcVarC = c();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            vdcVarC.c(onBackInvokedDispatcher);
        }
        this.F.y(bundle);
        e().f(y3a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.F.z(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        e().f(y3a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        e().f(y3a.ON_DESTROY);
        this.E = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        f();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        f();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.setContentView(view, layoutParams);
    }
}
