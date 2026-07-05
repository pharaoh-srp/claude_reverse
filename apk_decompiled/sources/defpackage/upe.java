package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.anthropic.claude.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class upe {
    public static upe g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public jud e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final tpe h = new tpe(6);

    public static synchronized upe c() {
        try {
            if (g == null) {
                g = new upe();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        tpe tpeVar = h;
        tpeVar.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) tpeVar.c(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        jgg jggVar = (jgg) this.a.get(context);
        if (jggVar == null) {
            jggVar = new jgg(0);
            this.a.put(context, jggVar);
        }
        int i2 = jggVar.G;
        if (i2 != 0 && i <= jggVar.E[i2 - 1]) {
            jggVar.c(i, colorStateList);
            return;
        }
        if (i2 >= jggVar.E.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            jggVar.E = Arrays.copyOf(jggVar.E, i6);
            jggVar.F = Arrays.copyOf(jggVar.F, i6);
        }
        jggVar.E[i2] = i;
        jggVar.F[i2] = colorStateList;
        jggVar.G = i2 + 1;
    }

    public final Drawable b(Context context, int i) {
        Object obj;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            zka zkaVar = (zka) this.b.get(context);
            obj = null;
            if (zkaVar != null && (weakReference = (WeakReference) zkaVar.b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    zkaVar.g(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableG = this.e == null ? null : jud.g(this, context, i);
        if (layerDrawableG == null) {
            return layerDrawableG;
        }
        layerDrawableG.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableG.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableG;
                }
                zka zkaVar2 = (zka) this.b.get(context);
                if (zkaVar2 == null) {
                    zkaVar2 = new zka(obj);
                    this.b.put(context, zkaVar2);
                }
                zkaVar2.f(j, new WeakReference(constantState2));
                return layerDrawableG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable d(int i, Context context, boolean z) {
        Drawable drawableB;
        jud judVar;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableE = e(context, R.drawable.abc_vector_test);
                if (drawableE == null || (!(drawableE instanceof xri) && !"android.graphics.drawable.VectorDrawable".equals(drawableE.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(context, i);
            if (drawableB == null) {
                drawableB = context.getDrawable(i);
            }
            if (drawableB != null) {
                ColorStateList colorStateListG = g(context, i);
                PorterDuff.Mode modeK = null;
                if (colorStateListG != null) {
                    Drawable drawableMutate = drawableB.mutate();
                    auj.f(drawableMutate, colorStateListG);
                    if (this.e != null) {
                        modeK = jud.k(i);
                    }
                    if (modeK != null) {
                        auj.g(drawableMutate, modeK);
                    }
                    drawableB = drawableMutate;
                } else if ((this.e == null || !jud.n(context, i, drawableB)) && (((judVar = this.e) == null || !judVar.o(context, i, drawableB)) && z)) {
                    drawableB = null;
                }
            }
            if (drawableB != null) {
                je6.a(drawableB);
            }
        } finally {
        }
        return drawableB;
    }

    public final synchronized Drawable e(Context context, int i) {
        return d(i, context, false);
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        jgg jggVar;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListJ = null;
        colorStateList = (weakHashMap == null || (jggVar = (jgg) weakHashMap.get(context)) == null) ? null : (ColorStateList) jwj.f(jggVar, i);
        if (colorStateList == null) {
            jud judVar = this.e;
            if (judVar != null) {
                colorStateListJ = judVar.j(context, i);
            }
            if (colorStateListJ != null) {
                a(context, i, colorStateListJ);
            }
            colorStateList = colorStateListJ;
        }
        return colorStateList;
    }
}
