package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class s00 {
    public static final s00 a = new s00();

    public static PointerIcon b(Context context, x7d x7dVar) {
        return x7dVar instanceof l40 ? PointerIcon.getSystemIcon(context, ((l40) x7dVar).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    public final void a(View view, x7d x7dVar) {
        PointerIcon pointerIconB = b(view.getContext(), x7dVar);
        if (x44.r(view.getPointerIcon(), pointerIconB)) {
            return;
        }
        view.setPointerIcon(pointerIconB);
    }
}
