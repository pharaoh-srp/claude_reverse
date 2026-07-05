package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gj6 extends fj6 {
    @Override // defpackage.ej6, defpackage.cj6
    public void b(e1h e1hVar, e1h e1hVar2, Window window, View view, boolean z, boolean z2) {
        e1hVar.getClass();
        e1hVar2.getClass();
        window.getClass();
        view.getClass();
        mbj.b(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int iA = e1hVar.a(z);
        int iA2 = e1hVar2.a(z2);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (i < viewGroup.getChildCount()) {
                    int i2 = i + 1;
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    Object tag = childAt.getTag();
                    if (tag instanceof List) {
                        List list = (List) tag;
                        if (list.size() == 4 && (list.get(0) instanceof l54)) {
                            for (Object obj : (Iterable) tag) {
                                if ((obj instanceof l54 ? (l54) obj : null) != null) {
                                    l54 l54Var = (l54) obj;
                                    int iA3 = l54Var.a();
                                    if (iA3 == 1) {
                                        l54Var.b(iA2);
                                    } else if (iA3 == 2) {
                                        l54Var.b(iA);
                                    } else if (iA3 == 4) {
                                        l54Var.b(iA2);
                                    } else if (iA3 == 8) {
                                        l54Var.b(iA2);
                                    }
                                }
                            }
                        }
                    }
                    i = i2;
                } else if (iA != 0 || iA2 != 0) {
                    List listX = x44.X(new l54(2, iA), new l54(1, iA2), new l54(4, iA2), new l54(8, iA2));
                    urd urdVar = new urd(((ViewGroup) view).getContext(), listX);
                    urdVar.setTag(listX);
                    viewGroup.addView(urdVar);
                }
            }
        }
        window.setNavigationBarContrastEnforced(e1hVar2.c == 0);
        int i3 = Build.VERSION.SDK_INT;
        fdj edjVar = i3 >= 35 ? new edj(window) : i3 >= 30 ? new ddj(window) : new cdj(window);
        edjVar.d(!z);
        edjVar.c(!z2);
    }
}
