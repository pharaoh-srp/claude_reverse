package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.anthropic.claude.R;
import com.anthropic.claude.mainactivity.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public class kig {
    public final MainActivity a;
    public Integer b;
    public Integer c;
    public Drawable d;
    public boolean e;
    public lig f = new pmf(3);
    public mr9 g;
    public fnf h;

    public kig(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public void a() {
        int i;
        TypedValue typedValue = new TypedValue();
        MainActivity mainActivity = this.a;
        Resources.Theme theme = mainActivity.getTheme();
        if (theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true)) {
            this.b = Integer.valueOf(typedValue.resourceId);
            this.c = Integer.valueOf(typedValue.data);
        }
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            this.d = xn5.c0(mainActivity, typedValue.resourceId);
        }
        if (theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true)) {
            this.e = typedValue.resourceId == R.dimen.splashscreen_icon_size_with_background;
        }
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        mainActivity.setTheme(i);
    }

    public void b(jpa jpaVar) {
        this.f = jpaVar;
        View viewFindViewById = this.a.findViewById(android.R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new eig(this, viewFindViewById));
    }

    public void c(mr9 mr9Var) {
        float dimension;
        this.g = mr9Var;
        MainActivity mainActivity = this.a;
        fnf fnfVar = new fnf(mainActivity);
        Integer num = this.b;
        Integer num2 = this.c;
        ViewGroup viewGroupH = fnfVar.h();
        if (num != null && num.intValue() != 0) {
            viewGroupH.setBackgroundResource(num.intValue());
        } else if (num2 != null) {
            viewGroupH.setBackgroundColor(num2.intValue());
        } else {
            viewGroupH.setBackground(mainActivity.getWindow().getDecorView().getBackground());
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            ImageView imageView = (ImageView) viewGroupH.findViewById(R.id.splashscreen_icon_view);
            if (this.e) {
                Drawable drawableC0 = xn5.c0(imageView.getContext(), R.drawable.icon_background);
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_with_background) * 0.6666667f;
                if (drawableC0 != null) {
                    imageView.setBackground(new sua(drawableC0, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_no_background) * 0.6666667f;
            }
            imageView.setImageDrawable(new sua(drawable, dimension));
        }
        viewGroupH.addOnLayoutChangeListener(new fig(this, fnfVar));
    }
}
