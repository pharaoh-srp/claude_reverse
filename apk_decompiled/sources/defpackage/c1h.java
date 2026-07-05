package defpackage;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c1h extends s34 {
    public final HashMap G;
    public final /* synthetic */ d1h H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1h(d1h d1hVar) {
        super(0);
        this.H = d1hVar;
        this.G = new HashMap();
    }

    @Override // defpackage.s34
    public final void a(ecj ecjVar) {
        ArrayList arrayList = this.H.b;
        if ((ecjVar.a.d() & 519) != 0) {
            this.G.remove(ecjVar);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                trd trdVar = (trd) arrayList.get(size);
                int i = trdVar.e;
                boolean z = i > 0;
                int i2 = i - 1;
                trdVar.e = i2;
                if (z && i2 == 0) {
                    trdVar.c();
                }
            }
        }
    }

    @Override // defpackage.s34
    public final void b(ecj ecjVar) {
        ArrayList arrayList = this.H.b;
        if ((ecjVar.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((trd) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.s34
    public final bdj c(bdj bdjVar, List list) {
        ArrayList arrayList = this.H.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            ecj ecjVar = (ecj) list.get(size);
            Integer num = (Integer) this.G.get(ecjVar);
            if (num != null) {
                int iIntValue = num.intValue();
                float fA = ecjVar.a.a();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fA;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fA;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fA;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fA;
                }
                i |= iIntValue;
            }
        }
        f59 f59VarB = f59.b(bdjVar.a.i(519), bdjVar.a.i(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            trd trdVar = (trd) arrayList.get(size2);
            f59 f59Var = trdVar.d;
            ArrayList arrayList2 = trdVar.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                l54 l54Var = (l54) arrayList2.get(size3);
                int i2 = l54Var.a;
                if ((i2 & i) != 0) {
                    srd srdVar = l54Var.b;
                    if (!srdVar.d) {
                        srdVar.d = true;
                        qb5 qb5Var = srdVar.i;
                        if (qb5Var != null) {
                            ((View) qb5Var.F).setVisibility(0);
                        }
                    }
                    if (i2 == 1) {
                        int i3 = f59Var.a;
                        if (i3 > 0) {
                            l54Var.d(f59VarB.a / i3);
                        }
                        l54Var.c(rectF.left);
                    } else if (i2 == 2) {
                        int i4 = f59Var.b;
                        if (i4 > 0) {
                            l54Var.d(f59VarB.b / i4);
                        }
                        l54Var.c(rectF.top);
                    } else if (i2 == 4) {
                        int i5 = f59Var.c;
                        if (i5 > 0) {
                            l54Var.d(f59VarB.c / i5);
                        }
                        l54Var.c(rectF.right);
                    } else if (i2 == 8) {
                        int i6 = f59Var.d;
                        if (i6 > 0) {
                            l54Var.d(f59VarB.d / i6);
                        }
                        l54Var.c(rectF.bottom);
                    }
                }
            }
        }
        return bdjVar;
    }

    @Override // defpackage.s34
    public final cbf d(ecj ecjVar, cbf cbfVar) {
        if ((ecjVar.a.d() & 519) != 0) {
            f59 f59Var = (f59) cbfVar.G;
            f59 f59Var2 = (f59) cbfVar.F;
            int i = f59Var.a != f59Var2.a ? 1 : 0;
            if (f59Var.b != f59Var2.b) {
                i |= 2;
            }
            if (f59Var.c != f59Var2.c) {
                i |= 4;
            }
            if (f59Var.d != f59Var2.d) {
                i |= 8;
            }
            this.G.put(ecjVar, Integer.valueOf(i));
        }
        return cbfVar;
    }
}
