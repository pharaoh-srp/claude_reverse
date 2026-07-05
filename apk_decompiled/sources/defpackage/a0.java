package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 implements hn0 {
    public final /* synthetic */ int E;
    public final Object F;
    public Object G;
    public Object H;

    public a0() {
        this.E = 2;
        djd djdVar = new djd();
        djdVar.a = Float.NaN;
        this.F = djdVar;
        this.G = new un5();
    }

    public static void m(ArrayList arrayList, int i, int i2, int i3) {
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List listSubList = arrayList.subList(i, i3 + i);
            ArrayList arrayListQ1 = w44.q1(listSubList);
            listSubList.clear();
            arrayList.addAll(i4, arrayListQ1);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            arrayList.set(i, arrayList.set(i2, arrayList.get(i)));
        } else {
            arrayList.add(i4, arrayList.remove(i));
        }
    }

    @Override // defpackage.hn0
    public void b(Object obj) {
        ((ArrayList) this.H).add(this.G);
        this.G = obj;
    }

    public void f() {
        ((ArrayList) this.H).clear();
        this.G = this.F;
        n();
    }

    @Override // defpackage.hn0
    public void g() {
        this.G = ((ArrayList) this.H).remove(r0.size() - 1);
    }

    @Override // defpackage.hn0
    public Object j() {
        return this.G;
    }

    public abstract ww7 l();

    public abstract void n();

    public String toString() {
        switch (this.E) {
            case 1:
                return getClass().getSimpleName() + ": " + l();
            default:
                return super.toString();
        }
    }

    public a0(txb txbVar, cbi cbiVar, neg negVar) {
        this.E = 1;
        this.F = txbVar;
        this.G = cbiVar;
        this.H = negVar;
    }

    public a0(Object obj) {
        this.E = 0;
        this.F = obj;
        this.H = new ArrayList();
        this.G = obj;
    }
}
