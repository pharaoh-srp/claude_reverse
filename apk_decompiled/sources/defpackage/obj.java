package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class obj extends nik {
    public final /* synthetic */ int f;
    public final /* synthetic */ qbj g;

    public /* synthetic */ obj(qbj qbjVar, int i) {
        this.f = i;
        this.g = qbjVar;
    }

    @Override // defpackage.iyi
    public final void c() {
        View view;
        int i = this.f;
        qbj qbjVar = this.g;
        switch (i) {
            case 0:
                if (qbjVar.o && (view = qbjVar.g) != null) {
                    view.setTranslationY(MTTypesetterKt.kLineSkipLimitMultiplier);
                    qbjVar.d.setTranslationY(MTTypesetterKt.kLineSkipLimitMultiplier);
                }
                qbjVar.d.setVisibility(8);
                qbjVar.d.setTransitioning(false);
                qbjVar.s = null;
                qb5 qb5Var = qbjVar.k;
                if (qb5Var != null) {
                    qb5Var.s(qbjVar.j);
                    qbjVar.j = null;
                    qbjVar.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = qbjVar.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = mvi.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                qbjVar.s = null;
                qbjVar.d.requestLayout();
                break;
        }
    }
}
