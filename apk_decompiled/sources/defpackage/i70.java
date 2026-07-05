package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i70 implements o5b {
    public final /* synthetic */ nxi a;
    public final /* synthetic */ av9 b;

    public i70(nxi nxiVar, av9 av9Var) {
        this.a = nxiVar;
        this.b = av9Var;
    }

    @Override // defpackage.o5b
    public final int a(xa9 xa9Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        nxi nxiVar = this.a;
        ViewGroup.LayoutParams layoutParams = nxiVar.getLayoutParams();
        layoutParams.getClass();
        nxiVar.measure(iMakeMeasureSpec, n70.l(nxiVar, 0, i, layoutParams.height));
        return nxiVar.getMeasuredWidth();
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        nxi nxiVar = this.a;
        int childCount = nxiVar.getChildCount();
        nm6 nm6Var = nm6.E;
        if (childCount == 0) {
            return q5bVar.U(rl4.j(j), rl4.i(j), nm6Var, ex.P);
        }
        if (rl4.j(j) != 0) {
            nxiVar.getChildAt(0).setMinimumWidth(rl4.j(j));
        }
        if (rl4.i(j) != 0) {
            nxiVar.getChildAt(0).setMinimumHeight(rl4.i(j));
        }
        int iJ = rl4.j(j);
        int iH = rl4.h(j);
        ViewGroup.LayoutParams layoutParams = nxiVar.getLayoutParams();
        layoutParams.getClass();
        int iL = n70.l(nxiVar, iJ, iH, layoutParams.width);
        int i = rl4.i(j);
        int iG = rl4.g(j);
        ViewGroup.LayoutParams layoutParams2 = nxiVar.getLayoutParams();
        layoutParams2.getClass();
        nxiVar.measure(iL, n70.l(nxiVar, i, iG, layoutParams2.height));
        return q5bVar.U(nxiVar.getMeasuredWidth(), nxiVar.getMeasuredHeight(), nm6Var, new g70(nxiVar, this.b, 1));
    }

    @Override // defpackage.o5b
    public final int c(xa9 xa9Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        nxi nxiVar = this.a;
        ViewGroup.LayoutParams layoutParams = nxiVar.getLayoutParams();
        layoutParams.getClass();
        nxiVar.measure(iMakeMeasureSpec, n70.l(nxiVar, 0, i, layoutParams.height));
        return nxiVar.getMeasuredWidth();
    }

    @Override // defpackage.o5b
    public final int d(xa9 xa9Var, List list, int i) {
        nxi nxiVar = this.a;
        ViewGroup.LayoutParams layoutParams = nxiVar.getLayoutParams();
        layoutParams.getClass();
        nxiVar.measure(n70.l(nxiVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return nxiVar.getMeasuredHeight();
    }

    @Override // defpackage.o5b
    public final int e(xa9 xa9Var, List list, int i) {
        nxi nxiVar = this.a;
        ViewGroup.LayoutParams layoutParams = nxiVar.getLayoutParams();
        layoutParams.getClass();
        nxiVar.measure(n70.l(nxiVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return nxiVar.getMeasuredHeight();
    }
}
