package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class b6 {
    public static final b6 d;
    public static final b6 e;
    public static final b6 f;
    public static final b6 g;
    public static final b6 h;
    public static final b6 i;
    public static final b6 j;
    public static final b6 k;
    public final Object a;
    public final int b;
    public final Class c;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityActionA = null;
        new b6(1, (String) null);
        new b6(2, (String) null);
        new b6(4, (String) null);
        new b6(8, (String) null);
        new b6(16, (String) null);
        new b6(32, (String) null);
        d = new b6(64, (String) null);
        e = new b6(FreeTypeConstants.FT_LOAD_PEDANTIC, (String) null);
        new b6(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING, t6.class);
        new b6(512, t6.class);
        new b6(FreeTypeConstants.FT_LOAD_NO_RECURSE, u6.class);
        new b6(FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM, u6.class);
        f = new b6(FreeTypeConstants.FT_LOAD_MONOCHROME, (String) null);
        g = new b6(FreeTypeConstants.FT_LOAD_LINEAR_DESIGN, (String) null);
        new b6(16384, (String) null);
        new b6(FreeTypeConstants.FT_LOAD_NO_AUTOHINT, (String) null);
        new b6(65536, (String) null);
        new b6(131072, y6.class);
        new b6(262144, (String) null);
        new b6(524288, (String) null);
        new b6(FreeTypeConstants.FT_LOAD_COLOR, (String) null);
        new b6(FreeTypeConstants.FT_LOAD_COMPUTE_METRICS, z6.class);
        new b6(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new b6(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, w6.class);
        h = new b6(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        i = new b6(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        j = new b6(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        k = new b6(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i2 = Build.VERSION.SDK_INT;
        new b6(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new b6(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new b6(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new b6(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new b6(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new b6(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, x6.class);
        new b6(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, v6.class);
        new b6(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new b6(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new b6(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new b6(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new b6(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new b6(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new b6(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new b6(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new b6(i2 >= 34 ? t5.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        int i3 = dz1.a;
        if (i2 >= 36) {
            if ((i2 < 36 ? i2 * 100000 : Build.VERSION.SDK_INT_FULL) >= 3600001) {
                accessibilityActionA = f6.a();
            }
        }
        new b6(accessibilityActionA, R.id.ALT, null, null, null);
    }

    public b6(Object obj, int i2, CharSequence charSequence, a7 a7Var, Class cls) {
        this.b = i2;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b6)) {
            return false;
        }
        Object obj2 = ((b6) obj).a;
        Object obj3 = this.a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strC = i6.c(this.b);
        if (strC.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strC = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strC);
        return sb.toString();
    }

    public b6(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public b6(int i2, String str) {
        this(null, i2, str, null, null);
    }
}
