package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sn4 implements pg6, quc, ge1 {
    public final at a;
    public final RectF b;
    public final ecc c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final boolean g;
    public final ArrayList h;
    public final pna i;
    public ArrayList j;
    public final c5i k;

    public sn4(pna pnaVar, le1 le1Var, boolean z, ArrayList arrayList, i80 i80Var) {
        this.a = new at(7);
        this.b = new RectF();
        this.c = new ecc();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.i = pnaVar;
        this.g = z;
        this.h = arrayList;
        if (i80Var != null) {
            c5i c5iVar = new c5i(i80Var);
            this.k = c5iVar;
            c5iVar.a(le1Var);
            c5iVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ym4 ym4Var = (ym4) arrayList.get(size);
            if (ym4Var instanceof ta8) {
                arrayList2.add((ta8) ym4Var);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((ta8) arrayList2.get(size2)).d(arrayList.listIterator(arrayList.size()));
        }
    }

    @Override // defpackage.ge1
    public final void a() {
        this.i.invalidateSelf();
    }

    @Override // defpackage.ym4
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ym4 ym4Var = (ym4) arrayList.get(size2);
            ym4Var.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(ym4Var);
        }
    }

    @Override // defpackage.pg6
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        c5i c5iVar = this.k;
        if (c5iVar != null) {
            matrix2.preConcat(c5iVar.d());
        }
        RectF rectF2 = this.f;
        rectF2.set(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
        ArrayList arrayList = this.h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ym4 ym4Var = (ym4) arrayList.get(size);
            if (ym4Var instanceof pg6) {
                ((pg6) ym4Var).c(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List d() {
        if (this.j == null) {
            this.j = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i >= arrayList.size()) {
                    break;
                }
                ym4 ym4Var = (ym4) arrayList.get(i);
                if (ym4Var instanceof quc) {
                    this.j.add((quc) ym4Var);
                }
                i++;
            }
        }
        return this.j;
    }

    @Override // defpackage.quc
    public final Path e() {
        Matrix matrix = this.d;
        matrix.reset();
        c5i c5iVar = this.k;
        if (c5iVar != null) {
            matrix.set(c5iVar.d());
        }
        Path path = this.e;
        path.reset();
        if (!this.g) {
            ArrayList arrayList = this.h;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ym4 ym4Var = (ym4) arrayList.get(size);
                if (ym4Var instanceof quc) {
                    path.addPath(((quc) ym4Var).e(), matrix);
                }
            }
        }
        return path;
    }

    @Override // defpackage.pg6
    public final void f(Canvas canvas, Matrix matrix, int i, gh6 gh6Var) {
        boolean z;
        if (this.g) {
            return;
        }
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        c5i c5iVar = this.k;
        if (c5iVar != null) {
            matrix2.preConcat(c5iVar.d());
            i = (int) (((((c5iVar.p == null ? 100 : ((Integer) r1.d()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        pna pnaVar = this.i;
        pnaVar.getClass();
        boolean z2 = false;
        ArrayList arrayList = this.h;
        if (gh6Var != null && pnaVar.O) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    z = false;
                    break;
                } else {
                    if ((arrayList.get(i2) instanceof pg6) && (i3 = i3 + 1) >= 2) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        int i4 = z2 ? 255 : i;
        ecc eccVar = this.c;
        if (z2) {
            RectF rectF = this.b;
            rectF.set(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
            c(rectF, matrix, true);
            at atVar = this.a;
            atVar.F = i;
            if (gh6Var != null) {
                if (Color.alpha(gh6Var.d) > 0) {
                    atVar.G = gh6Var;
                } else {
                    atVar.G = null;
                }
                gh6Var = null;
            } else {
                atVar.G = null;
            }
            canvas = eccVar.e(canvas, rectF, atVar);
        } else if (gh6Var != null) {
            gh6 gh6Var2 = new gh6(gh6Var);
            gh6Var2.b(i4);
            gh6Var = gh6Var2;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof pg6) {
                ((pg6) obj).f(canvas, matrix2, i4, gh6Var);
            }
        }
        if (z2) {
            eccVar.c();
        }
    }

    public sn4(pna pnaVar, le1 le1Var, o0g o0gVar, bna bnaVar) {
        i80 i80Var;
        String str = o0gVar.a;
        boolean z = o0gVar.c;
        List list = o0gVar.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ym4 ym4VarA = ((co4) list.get(i2)).a(pnaVar, bnaVar, le1Var);
            if (ym4VarA != null) {
                arrayList.add(ym4VarA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                i80Var = null;
                break;
            }
            co4 co4Var = (co4) list.get(i);
            if (co4Var instanceof i80) {
                i80Var = (i80) co4Var;
                break;
            }
            i++;
        }
        this(pnaVar, le1Var, z, arrayList, i80Var);
    }
}
