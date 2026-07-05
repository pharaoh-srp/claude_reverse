package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f70 extends s34 {
    public final /* synthetic */ int G;
    public final /* synthetic */ ViewGroup H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f70(ViewGroup viewGroup, int i) {
        super(1);
        this.G = i;
        this.H = viewGroup;
    }

    @Override // defpackage.s34
    public final bdj c(bdj bdjVar, List list) {
        int i = this.G;
        ViewGroup viewGroup = this.H;
        switch (i) {
            case 0:
                return ((nxi) viewGroup).n(bdjVar);
            default:
                b36 b36Var = (b36) viewGroup;
                if (b36Var.Q) {
                    return bdjVar;
                }
                View childAt = b36Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, b36Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, b36Var.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? bdjVar : bdjVar.a.r(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // defpackage.s34
    public final cbf d(ecj ecjVar, cbf cbfVar) {
        int i = this.G;
        ViewGroup viewGroup = this.H;
        switch (i) {
            case 0:
                z39 z39Var = (z39) ((nxi) viewGroup).g0.k0.H;
                if (!z39Var.y0.R) {
                    return cbfVar;
                }
                long jA0 = yfd.a0(z39Var.K(0L));
                int i2 = (int) (jA0 >> 32);
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (int) (jA0 & 4294967295L);
                if (i3 < 0) {
                    i3 = 0;
                }
                long jK = nai.A(z39Var).k();
                int i4 = (int) (jK >> 32);
                int i5 = (int) (jK & 4294967295L);
                long j = z39Var.G;
                long jA02 = yfd.a0(z39Var.K((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i6 = i4 - ((int) (jA02 >> 32));
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - ((int) (jA02 & 4294967295L));
                int i8 = i7 >= 0 ? i7 : 0;
                return (i2 == 0 && i3 == 0 && i6 == 0 && i8 == 0) ? cbfVar : new cbf(n70.m((f59) cbfVar.F, i2, i3, i6, i8), 19, n70.m((f59) cbfVar.G, i2, i3, i6, i8));
            default:
                b36 b36Var = (b36) viewGroup;
                if (b36Var.Q) {
                    return cbfVar;
                }
                View childAt = b36Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, b36Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, b36Var.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return cbfVar;
                }
                f59 f59VarC = f59.c(iMax, iMax2, iMax3, iMax4);
                int i9 = f59VarC.a;
                f59 f59Var = (f59) cbfVar.F;
                int i10 = f59VarC.b;
                int i11 = f59VarC.c;
                int i12 = f59VarC.d;
                return new cbf(bdj.a(f59Var, i9, i10, i11, i12), 19, bdj.a((f59) cbfVar.G, i9, i10, i11, i12));
        }
    }
}
