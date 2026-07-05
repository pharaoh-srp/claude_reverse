package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class d1h {
    public final b1h a;
    public final ArrayList b = new ArrayList();
    public f59 c;
    public f59 d;
    public int e;

    public d1h(ViewGroup viewGroup) {
        View childAt;
        f59 f59Var = f59.e;
        this.c = f59Var;
        this.d = f59Var;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        b1h b1hVar = new b1h(this, viewGroup.getContext(), viewGroup);
        this.a = b1hVar;
        b1hVar.setVisibility(8);
        b1hVar.setWillNotDraw(true);
        jke jkeVar = new jke(4, this);
        WeakHashMap weakHashMap = mvi.a;
        fvi.c(b1hVar, jkeVar);
        mvi.j(b1hVar, new c1h(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (childAt == null) {
            viewGroup.addView(b1hVar, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new q88(viewGroup, b1hVar));
        }
    }
}
