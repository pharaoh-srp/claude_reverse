package defpackage;

import android.view.View;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class ink {
    public static final m4a a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            m4a m4aVar = tag instanceof m4a ? (m4a) tag : null;
            if (m4aVar != null) {
                return m4aVar;
            }
            Object objA = bmk.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static void b(int i, int i2) {
        String strL;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strL = esk.l("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    sz6.p(grc.p(i2, "negative size: "));
                    return;
                }
                strL = esk.l("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strL);
        }
    }

    public static void c(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? d(i, i3, "start index") : (i2 < 0 || i2 > i3) ? d(i2, i3, "end index") : esk.l("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String d(int i, int i2, String str) {
        if (i < 0) {
            return esk.l("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return esk.l("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        sz6.p(grc.p(i2, "negative size: "));
        return null;
    }
}
