package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kf9 {
    public static void a(View view, LinkedHashMap linkedHashMap) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return kf9.class.equals(obj != null ? obj.getClass() : null);
    }

    public final int hashCode() {
        return kf9.class.hashCode();
    }
}
