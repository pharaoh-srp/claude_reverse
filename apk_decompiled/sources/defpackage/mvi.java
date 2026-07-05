package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class mvi {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final avi d = new avi();
    public static final cvi e = new cvi();

    public static gyi a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        gyi gyiVar = (gyi) a.get(view);
        if (gyiVar != null) {
            return gyiVar;
        }
        gyi gyiVar2 = new gyi(view);
        a.put(view, gyiVar2);
        return gyiVar2;
    }

    public static void b(View view, bdj bdjVar) {
        WindowInsets windowInsetsB = bdjVar.b();
        if (windowInsetsB != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? jvi.a(view, windowInsetsB) : dvi.a(view, windowInsetsB);
            if (windowInsetsA.equals(windowInsetsB)) {
                return;
            }
            bdj.c(windowInsetsA, view);
        }
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ivi.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static String[] d(eh0 eh0Var) {
        return Build.VERSION.SDK_INT >= 31 ? kvi.a(eh0Var) : (String[]) eh0Var.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void e(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = ((CharSequence) new bvi(1).d(view)) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add((CharSequence) new bvi(1).d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add((CharSequence) new bvi(1).d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ao4 f(View view, ao4 ao4Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(ao4Var);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return kvi.b(view, ao4Var);
        }
        flh flhVar = (flh) view.getTag(R.id.tag_on_receive_content_listener);
        jec jecVar = d;
        if (flhVar == null) {
            if (view instanceof jec) {
                jecVar = (jec) view;
            }
            return jecVar.a(ao4Var);
        }
        ao4 ao4VarA = flh.a(view, ao4Var);
        if (ao4VarA == null) {
            return null;
        }
        if (view instanceof jec) {
            jecVar = (jec) view;
        }
        return jecVar.a(ao4VarA);
    }

    public static void g(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            ivi.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void h(View view, h5 h5Var) {
        if (h5Var == null && (c(view) instanceof g5)) {
            h5Var = new h5();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(h5Var == null ? null : h5Var.F);
    }

    public static void i(View view, CharSequence charSequence) {
        new bvi(1).e(view, charSequence);
        cvi cviVar = e;
        if (charSequence == null) {
            cviVar.E.remove(view);
            view.removeOnAttachStateChangeListener(cviVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(cviVar);
        } else {
            cviVar.E.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(cviVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(cviVar);
            }
        }
    }

    public static void j(View view, s34 s34Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(s34Var != null ? new bcj(s34Var) : null);
        } else {
            acj.k(view, s34Var);
        }
    }
}
