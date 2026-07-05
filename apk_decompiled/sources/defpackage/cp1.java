package defpackage;

import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cp1 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public fp1 a() {
        txj txjVarO;
        ArrayList arrayList = (ArrayList) this.d;
        boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (!z) {
            sz6.p("Details of the products must be provided.");
            return null;
        }
        ArrayList arrayList2 = (ArrayList) this.d;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((dp1) it.next()) == null) {
                    sz6.p("ProductDetailsParams cannot be null.");
                    return null;
                }
            }
        }
        fp1 fp1Var = new fp1();
        fp1Var.a = z && !((dp1) ((ArrayList) this.d).get(0)).a.e().isEmpty();
        fp1Var.b = (String) this.b;
        fp1Var.c = (String) this.c;
        fp1Var.d = ((t) this.e).d();
        fp1Var.f = new ArrayList();
        fp1Var.g = this.a;
        ArrayList arrayList3 = (ArrayList) this.d;
        if (arrayList3 != null) {
            txjVarO = txj.o(arrayList3);
        } else {
            kxj kxjVar = txj.F;
            txjVarO = szj.I;
        }
        fp1Var.e = txjVarO;
        return fp1Var;
    }

    public boolean b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentC;
        int i6;
        int i7;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.d;
        if (this.a && (viewParentC = c(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (((int[]) this.e) == null) {
                        this.e = new int[2];
                    }
                    int[] iArr4 = (int[]) this.e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentC instanceof l0c) {
                    ((l0c) viewParentC).g(nestedScrollView, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentC instanceof k0c) {
                        ((k0c) viewParentC).a(nestedScrollView, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentC.onNestedScroll(nestedScrollView, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public ViewParent c(int i) {
        if (i == 0) {
            return (ViewParent) this.b;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.c;
    }

    public void d(boolean z) {
        this.a = z;
    }

    public void e(String str) {
        this.b = str;
    }

    public void f(String str) {
        this.c = str;
    }

    public void g(List list) {
        this.d = new ArrayList(list);
    }

    public void h(ep1 ep1Var) {
        t tVarF = ep1.f();
        tVarF.c = ep1Var.b;
        tVarF.a = ep1Var.c;
        this.e = tVarF;
    }

    public void i(int i, int i2) {
        if (i < MTTypesetterKt.kLineSkipLimitMultiplier) {
            e39.a("Index should be non-negative");
        }
        ((isc) this.b).i(i);
        ((pz9) this.e).a(i);
        ((isc) this.c).i(i2);
    }
}
