package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class trd {
    public final ArrayList a = new ArrayList();
    public final d1h b;
    public f59 c;
    public f59 d;
    public int e;
    public boolean f;

    public trd(d1h d1hVar, ArrayList arrayList) {
        f59 f59Var = f59.e;
        this.c = f59Var;
        this.d = f59Var;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = d1hVar.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            f59 f59Var2 = d1hVar.c;
            f59 f59Var3 = d1hVar.d;
            this.c = f59Var2;
            this.d = f59Var3;
            c();
            b(d1hVar.e);
        }
        this.b = d1hVar;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            l54 l54Var = (l54) list.get(i);
            l54Var.getClass();
            if (true == z) {
                trd trdVar = l54Var.e;
                if (trdVar != null) {
                    throw new IllegalStateException(l54Var + " (" + (i + 1) + "/" + size + ") is already controlled by " + trdVar + " but is still added to " + this);
                }
                l54Var.e = this;
                this.a.add(l54Var);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l54 l54Var = (l54) arrayList.get(size);
            if (!l54Var.g) {
                ColorDrawable colorDrawable = l54Var.f;
                if (l54Var.h != i) {
                    l54Var.h = i;
                    colorDrawable.setColor(i);
                    srd srdVar = l54Var.b;
                    srdVar.e = colorDrawable;
                    qb5 qb5Var = srdVar.i;
                    if (qb5Var != null) {
                        ((View) qb5Var.F).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i;
        f59 f59VarC;
        ArrayList arrayList = this.a;
        f59 f59Var = f59.e;
        f59 f59VarA = f59Var;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l54 l54Var = (l54) arrayList.get(size);
            f59 f59Var2 = this.c;
            f59 f59Var3 = this.d;
            l54Var.c = f59Var2;
            srd srdVar = l54Var.b;
            l54Var.d = f59Var3;
            if (!srdVar.c.equals(f59VarA)) {
                srdVar.c = f59VarA;
                qb5 qb5Var = srdVar.i;
                if (qb5Var != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qb5Var.E;
                    layoutParams.leftMargin = f59VarA.a;
                    layoutParams.topMargin = f59VarA.b;
                    layoutParams.rightMargin = f59VarA.c;
                    layoutParams.bottomMargin = f59VarA.d;
                    ((View) qb5Var.F).setLayoutParams(layoutParams);
                }
            }
            int i2 = l54Var.a;
            if (i2 == 1) {
                i = l54Var.c.a;
                int i3 = l54Var.d.a;
                if (srdVar.a != i3) {
                    srdVar.a = i3;
                    qb5 qb5Var2 = srdVar.i;
                    if (qb5Var2 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qb5Var2.E;
                        layoutParams2.width = i3;
                        ((View) qb5Var2.F).setLayoutParams(layoutParams2);
                    }
                }
                f59VarC = f59.c(i, 0, 0, 0);
            } else if (i2 == 2) {
                i = l54Var.c.b;
                int i4 = l54Var.d.b;
                if (srdVar.b != i4) {
                    srdVar.b = i4;
                    qb5 qb5Var3 = srdVar.i;
                    if (qb5Var3 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) qb5Var3.E;
                        layoutParams3.height = i4;
                        ((View) qb5Var3.F).setLayoutParams(layoutParams3);
                    }
                }
                f59VarC = f59.c(0, i, 0, 0);
            } else if (i2 == 4) {
                i = l54Var.c.c;
                int i5 = l54Var.d.c;
                if (srdVar.a != i5) {
                    srdVar.a = i5;
                    qb5 qb5Var4 = srdVar.i;
                    if (qb5Var4 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) qb5Var4.E;
                        layoutParams4.width = i5;
                        ((View) qb5Var4.F).setLayoutParams(layoutParams4);
                    }
                }
                f59VarC = f59.c(0, 0, i, 0);
            } else if (i2 != 8) {
                f59VarC = f59Var;
                i = 0;
            } else {
                i = l54Var.c.d;
                int i6 = l54Var.d.d;
                if (srdVar.b != i6) {
                    srdVar.b = i6;
                    qb5 qb5Var5 = srdVar.i;
                    if (qb5Var5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) qb5Var5.E;
                        layoutParams5.height = i6;
                        ((View) qb5Var5.F).setLayoutParams(layoutParams5);
                    }
                }
                f59VarC = f59.c(0, 0, 0, i);
            }
            boolean z = i > 0;
            if (srdVar.d != z) {
                srdVar.d = z;
                qb5 qb5Var6 = srdVar.i;
                if (qb5Var6 != null) {
                    ((View) qb5Var6.F).setVisibility(z ? 0 : 8);
                }
            }
            float f = MTTypesetterKt.kLineSkipLimitMultiplier;
            l54Var.c(i > 0 ? 1.0f : 0.0f);
            if (i > 0) {
                f = 1.0f;
            }
            l54Var.d(f);
            f59VarA = f59.a(f59VarA, f59VarC);
        }
    }
}
