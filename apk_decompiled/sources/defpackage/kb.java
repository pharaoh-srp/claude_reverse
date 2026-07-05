package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.anthropic.claude.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kb implements wdb {
    public final Context E;
    public Context F;
    public vcb G;
    public final LayoutInflater H;
    public vdb I;
    public ydb L;
    public jb M;
    public Drawable N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public hb W;
    public hb X;
    public t08 Y;
    public ib Z;
    public final int J = R.layout.abc_action_menu_layout;
    public final int K = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray V = new SparseBooleanArray();
    public final ive a0 = new ive(5, this);

    public kb(Context context) {
        this.E = context;
        this.H = LayoutInflater.from(context);
    }

    @Override // defpackage.wdb
    public final void a(vcb vcbVar, boolean z) {
        g();
        hb hbVar = this.X;
        if (hbVar != null && hbVar.b()) {
            hbVar.i.dismiss();
        }
        vdb vdbVar = this.I;
        if (vdbVar != null) {
            vdbVar.a(vcbVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b(adb adbVar, View view, ViewGroup viewGroup) {
        View actionView = adbVar.getActionView();
        if (actionView == null || adbVar.e()) {
            xdb xdbVar = view instanceof xdb ? (xdb) view : (xdb) this.H.inflate(this.K, viewGroup, false);
            xdbVar.a(adbVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) xdbVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.L);
            if (this.Z == null) {
                this.Z = new ib(this);
            }
            actionMenuItemView.setPopupCallback(this.Z);
            actionView = (View) xdbVar;
        }
        actionView.setVisibility(adbVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof mb)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wdb
    public final boolean c(xug xugVar) {
        boolean z;
        if (xugVar.hasVisibleItems()) {
            xug xugVar2 = xugVar;
            while (true) {
                vcb vcbVar = xugVar2.z;
                if (vcbVar == this.G) {
                    break;
                }
                xugVar2 = (xug) vcbVar;
            }
            adb adbVar = xugVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.L;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof xdb) && ((xdb) childAt).getItemData() == adbVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                xugVar.A.getClass();
                int size = xugVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = xugVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                hb hbVar = new hb(this, this.F, xugVar, view);
                this.X = hbVar;
                hbVar.g = z;
                mdb mdbVar = hbVar.i;
                if (mdbVar != null) {
                    mdbVar.o(z);
                }
                hb hbVar2 = this.X;
                if (!hbVar2.b()) {
                    if (hbVar2.e == null) {
                        sz6.j("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    hbVar2.d(0, 0, false, false);
                }
                vdb vdbVar = this.I;
                if (vdbVar != null) {
                    vdbVar.s(xugVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wdb
    public final boolean d() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        kb kbVar = this;
        vcb vcbVar = kbVar.G;
        if (vcbVar != null) {
            arrayListL = vcbVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = kbVar.T;
        int i3 = kbVar.S;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) kbVar.L;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            adb adbVar = (adb) arrayListL.get(i4);
            int i7 = adbVar.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (kbVar.U && adbVar.C) {
                i2 = 0;
            }
            i4++;
        }
        if (kbVar.P && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = kbVar.V;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            adb adbVar2 = (adb) arrayListL.get(i9);
            int i11 = adbVar2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = adbVar2.b;
            if (z3) {
                View viewB = kbVar.b(adbVar2, null, viewGroup);
                viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewB.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                adbVar2.f(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewB2 = kbVar.b(adbVar2, null, viewGroup);
                    viewB2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewB2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z5 &= i3 + i10 > 0;
                }
                if (z5 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z4) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        adb adbVar3 = (adb) arrayListL.get(i13);
                        if (adbVar3.b == i12) {
                            if ((adbVar3.x & 32) == 32) {
                                i8++;
                            }
                            adbVar3.f(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                adbVar2.f(z5);
            } else {
                adbVar2.f(false);
                i9++;
                i = 2;
                kbVar = this;
                z = true;
            }
            i9++;
            i = 2;
            kbVar = this;
            z = true;
        }
        return z;
    }

    @Override // defpackage.wdb
    public final boolean e(adb adbVar) {
        return false;
    }

    @Override // defpackage.wdb
    public final void f(vdb vdbVar) {
        throw null;
    }

    public final boolean g() {
        Object obj;
        t08 t08Var = this.Y;
        if (t08Var != null && (obj = this.L) != null) {
            ((View) obj).removeCallbacks(t08Var);
            this.Y = null;
            return true;
        }
        hb hbVar = this.W;
        if (hbVar == null) {
            return false;
        }
        if (hbVar.b()) {
            hbVar.i.dismiss();
        }
        return true;
    }

    @Override // defpackage.wdb
    public final boolean h(adb adbVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wdb
    public final void i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.L;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            vcb vcbVar = this.G;
            if (vcbVar != null) {
                vcbVar.i();
                ArrayList arrayListL = this.G.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    adb adbVar = (adb) arrayListL.get(i2);
                    if ((adbVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        adb itemData = childAt instanceof xdb ? ((xdb) childAt).getItemData() : null;
                        View viewB = b(adbVar, childAt, viewGroup);
                        if (adbVar != itemData) {
                            viewB.setPressed(false);
                            viewB.jumpDrawablesToCurrentState();
                        }
                        if (viewB != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewB.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewB);
                            }
                            ((ViewGroup) this.L).addView(viewB, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.M) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.L).requestLayout();
        vcb vcbVar2 = this.G;
        if (vcbVar2 != null) {
            vcbVar2.i();
            ArrayList arrayList2 = vcbVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ddb ddbVar = ((adb) arrayList2.get(i3)).A;
            }
        }
        vcb vcbVar3 = this.G;
        if (vcbVar3 != null) {
            vcbVar3.i();
            arrayList = vcbVar3.j;
        }
        if (this.P && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((adb) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        jb jbVar = this.M;
        if (z) {
            if (jbVar == null) {
                this.M = new jb(this, this.E);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.M.getParent();
            if (viewGroup3 != this.L) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.M);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.L;
                jb jbVar2 = this.M;
                actionMenuView.getClass();
                mb mbVarI = ActionMenuView.i();
                mbVarI.a = true;
                actionMenuView.addView(jbVar2, mbVarI);
            }
        } else if (jbVar != null) {
            Object parent = jbVar.getParent();
            Object obj = this.L;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.M);
            }
        }
        ((ActionMenuView) this.L).setOverflowReserved(this.P);
    }

    public final boolean j() {
        hb hbVar = this.W;
        return hbVar != null && hbVar.b();
    }

    @Override // defpackage.wdb
    public final void k(Context context, vcb vcbVar) {
        this.F = context;
        LayoutInflater.from(context);
        this.G = vcbVar;
        Resources resources = context.getResources();
        if (!this.Q) {
            this.P = true;
        }
        int i = 2;
        this.R = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.T = i;
        int measuredWidth = this.R;
        if (this.P) {
            if (this.M == null) {
                jb jbVar = new jb(this, this.E);
                this.M = jbVar;
                if (this.O) {
                    jbVar.setImageDrawable(this.N);
                    this.N = null;
                    this.O = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.M.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.M.getMeasuredWidth();
        } else {
            this.M = null;
        }
        this.S = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean l() {
        vcb vcbVar;
        boolean z = false;
        if (this.P && !j() && (vcbVar = this.G) != null && this.L != null && this.Y == null) {
            vcbVar.i();
            if (!vcbVar.j.isEmpty()) {
                t08 t08Var = new t08(this, new hb(this, this.F, this.G, this.M), z, 1);
                this.Y = t08Var;
                ((View) this.L).post(t08Var);
                return true;
            }
        }
        return false;
    }
}
