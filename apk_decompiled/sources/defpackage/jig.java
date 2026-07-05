package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import com.anthropic.claude.R;
import com.anthropic.claude.mainactivity.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class jig extends kig {
    public iig i;
    public boolean j;
    public final hig k;

    public jig(MainActivity mainActivity) {
        super(mainActivity);
        this.j = true;
        this.k = new hig(this, mainActivity);
    }

    @Override // defpackage.kig
    public final void a() {
        int i;
        MainActivity mainActivity = this.a;
        Resources.Theme theme = mainActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i);
        }
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = mainActivity.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.k);
        }
    }

    @Override // defpackage.kig
    public final void b(jpa jpaVar) {
        this.f = jpaVar;
        View viewFindViewById = this.a.findViewById(android.R.id.content);
        ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
        if (this.i != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.i);
        }
        iig iigVar = new iig(this, viewFindViewById);
        this.i = iigVar;
        viewTreeObserver.addOnPreDrawListener(iigVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gig] */
    @Override // defpackage.kig
    public final void c(mr9 mr9Var) {
        this.a.getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener(mr9Var) { // from class: gig
            @Override // android.window.SplashScreen.OnExitAnimationListener
            public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                jig jigVar = this.a;
                MainActivity mainActivity = jigVar.a;
                splashScreenView.getClass();
                int i = Build.VERSION.SDK_INT;
                if (i < 33) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = mainActivity.getTheme();
                    Window window = mainActivity.getWindow();
                    if (theme.resolveAttribute(android.R.attr.statusBarColor, typedValue, true)) {
                        window.setStatusBarColor(typedValue.data);
                    }
                    if (theme.resolveAttribute(android.R.attr.navigationBarColor, typedValue, true)) {
                        window.setNavigationBarColor(typedValue.data);
                    }
                    if (theme.resolveAttribute(android.R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                        if (typedValue.data != 0) {
                            window.addFlags(Integer.MIN_VALUE);
                        } else {
                            window.clearFlags(Integer.MIN_VALUE);
                        }
                    }
                    View decorView = window.getDecorView();
                    decorView.getClass();
                    ViewGroup viewGroup = (ViewGroup) decorView;
                    rrk.h(theme, viewGroup, typedValue);
                    viewGroup.setOnHierarchyChangeListener(null);
                    window.setDecorFitsSystemWindows(jigVar.j);
                }
                ire migVar = i >= 31 ? new mig(mainActivity) : new ire(mainActivity);
                migVar.f();
                ((mig) migVar).H = splashScreenView;
                int i2 = MainActivity.h0;
                migVar.m();
            }
        });
    }
}
