package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import com.anthropic.claude.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class yt5 {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public yt5(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final yt5 g(ViewGroup viewGroup, rx7 rx7Var) {
        viewGroup.getClass();
        rx7Var.H().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof yt5) {
            return (yt5) tag;
        }
        yt5 yt5Var = new yt5(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, yt5Var);
        return yt5Var;
    }

    public static final yt5 h(ViewGroup viewGroup, ql8 ql8Var) {
        viewGroup.getClass();
        ql8Var.getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof yt5) {
            return (yt5) tag;
        }
        yt5 yt5Var = new yt5(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, yt5Var);
        return yt5Var;
    }

    public static boolean i(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((rgg) it.next()).getClass();
            throw null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((rgg) it2.next()).getClass();
            b54.t0(arrayList2, null);
        }
        return !arrayList2.isEmpty();
    }

    public final void a(rgg rggVar) {
        rggVar.getClass();
        if (rggVar.b) {
            throw null;
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        if (rx7.J(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((rgg) it.next()).getClass();
            throw null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            ((rgg) listIterator.previous()).getClass();
            throw null;
        }
        if (rx7.J(2)) {
            Log.v("FragmentManager", "Executing operations from " + ((Object) null) + " to " + ((Object) null));
        }
        ArrayList<st5> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ((rgg) w44.U0(arrayList)).getClass();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            ((rgg) it2.next()).getClass();
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            rgg rggVar = (rgg) it3.next();
            arrayList2.add(new st5(rggVar, z));
            new xt5(rggVar);
            if (!z) {
                throw null;
            }
            throw null;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (!((xt5) obj).o()) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((xt5) it4.next()).getClass();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((xt5) it5.next()).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        if (it6.hasNext()) {
            ((st5) it6.next()).getClass();
            throw null;
        }
        arrayList7.isEmpty();
        for (st5 st5Var : arrayList2) {
            Context context = this.a.getContext();
            st5Var.getClass();
            context.getClass();
            i49 i49VarP = st5Var.p(context);
            if (i49VarP != null) {
                if (((AnimatorSet) i49VarP.G) != null) {
                    throw null;
                }
                arrayList6.add(st5Var);
            }
        }
        Iterator it7 = arrayList6.iterator();
        if (it7.hasNext()) {
            ((st5) it7.next()).getClass();
            throw null;
        }
    }

    public final void c() {
        rx7.J(3);
        ArrayList arrayList = this.c;
        l(arrayList);
        arrayList.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((rgg) it.next()).getClass();
            b54.t0(arrayList2, null);
        }
        List listP1 = w44.p1(w44.t1(arrayList2));
        int size = listP1.size();
        for (int i = 0; i < size; i++) {
            ((qgg) listP1.get(i)).a(this.a);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((rgg) arrayList.get(i2));
        }
        List listP12 = w44.p1(arrayList);
        if (listP12.size() <= 0) {
            return;
        }
        ((rgg) listP12.get(0)).getClass();
        throw null;
    }

    public final void d() {
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            e();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList<rgg> arrayListQ1 = w44.q1(this.c);
                this.c.clear();
                for (rgg rggVar : arrayListQ1) {
                    if (!this.b.isEmpty()) {
                        rggVar.getClass();
                        throw null;
                    }
                    rggVar.getClass();
                }
                for (rgg rggVar2 : arrayListQ1) {
                    if (this.d) {
                        if (rx7.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + rggVar2);
                        }
                        rggVar2.b();
                        throw null;
                    }
                    if (rx7.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + rggVar2);
                    }
                    rggVar2.a(this.a);
                    this.d = false;
                    this.c.add(rggVar2);
                }
                if (!this.b.isEmpty()) {
                    m();
                    ArrayList arrayListQ12 = w44.q1(this.b);
                    if (arrayListQ12.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(arrayListQ12);
                    if (rx7.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayListQ12, this.e);
                    boolean zI = i(arrayListQ12);
                    Iterator it = arrayListQ12.iterator();
                    if (it.hasNext()) {
                        ((rgg) it.next()).getClass();
                        throw null;
                    }
                    this.d = !zI;
                    if (rx7.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zI + " \ntransition = true");
                    }
                    if (zI) {
                        l(arrayListQ12);
                        int size = arrayListQ12.size();
                        for (int i = 0; i < size; i++) {
                            a((rgg) arrayListQ12.get(i));
                        }
                    }
                    this.e = false;
                    if (rx7.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (rx7.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                m();
                l(this.b);
                ArrayList<rgg> arrayListQ1 = w44.q1(this.c);
                Iterator it = arrayListQ1.iterator();
                while (it.hasNext()) {
                    ((rgg) it.next()).getClass();
                }
                for (rgg rggVar : arrayListQ1) {
                    if (rx7.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling running operation " + rggVar);
                    }
                    rggVar.a(this.a);
                }
                ArrayList<rgg> arrayListQ12 = w44.q1(this.b);
                Iterator it2 = arrayListQ12.iterator();
                while (it2.hasNext()) {
                    ((rgg) it2.next()).getClass();
                }
                for (rgg rggVar2 : arrayListQ12) {
                    if (rx7.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling pending operation " + rggVar2);
                    }
                    rggVar2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        if (this.f) {
            if (rx7.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f = false;
            d();
        }
    }

    public final void j() {
        synchronized (this.b) {
            m();
            ArrayList arrayList = this.b;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            if (listIterator.hasPrevious()) {
                ((rgg) listIterator.previous()).getClass();
                throw null;
            }
            this.f = false;
        }
    }

    public final void k(ab1 ab1Var) {
        if (rx7.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + ab1Var.c);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((rgg) it.next()).getClass();
            b54.t0(arrayList, null);
        }
        List listP1 = w44.p1(w44.t1(arrayList));
        int size = listP1.size();
        for (int i = 0; i < size; i++) {
            ((qgg) listP1.get(i)).b(ab1Var, this.a);
        }
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rgg rggVar = (rgg) arrayList.get(i);
            rggVar.getClass();
            if (!rggVar.a) {
                rggVar.a = true;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((rgg) it.next()).getClass();
            b54.t0(arrayList2, null);
        }
        List listP1 = w44.p1(w44.t1(arrayList2));
        int size2 = listP1.size();
        for (int i2 = 0; i2 < size2; i2++) {
            qgg qggVar = (qgg) listP1.get(i2);
            qggVar.getClass();
            ViewGroup viewGroup = this.a;
            viewGroup.getClass();
            if (!qggVar.a) {
                qggVar.c(viewGroup);
            }
            qggVar.a = true;
        }
    }

    public final void m() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((rgg) it.next()).getClass();
        }
    }

    public final void n(boolean z) {
        this.e = z;
    }
}
