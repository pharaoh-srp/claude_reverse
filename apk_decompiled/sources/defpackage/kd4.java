package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class kd4 {
    public boolean a;
    public Object b;

    public kd4() {
        this.b = new HashMap();
    }

    public void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        Collection collectionValues = ((HashMap) this.b).values();
        collectionValues.getClass();
        Iterator it = w44.p1(collectionValues).iterator();
        while (it.hasNext()) {
            ((y59) it.next()).onDestroy();
        }
    }

    public void b() {
        this.a = true;
    }

    public void c() {
        this.a = false;
    }

    public void d() {
        this.a = false;
    }

    public void e(byte b) {
        ((e99) this.b).writeLong(b);
    }

    public void f(char c) {
        ((e99) this.b).a(c);
    }

    public void g(int i) {
        ((e99) this.b).writeLong(i);
    }

    public void h(long j) {
        ((e99) this.b).writeLong(j);
    }

    public void i(short s) {
        ((e99) this.b).writeLong(s);
    }

    public void j(String str) {
        str.getClass();
        ((e99) this.b).e(str);
    }

    public void k(Object obj, y59 y59Var) {
        y59Var.getClass();
        HashMap map = (HashMap) this.b;
        if (map.containsKey(obj)) {
            mr9.f(ij0.h("Another instance is already associated with the key: ", obj));
            return;
        }
        map.put(obj, y59Var);
        if (this.a) {
            y59Var.onDestroy();
        }
    }

    public void l() {
    }

    public void m() {
    }

    public void n(ivk ivkVar) {
        if (this.a) {
            jyj.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((m6i) this.b).a(new n81(ivkVar, agd.E, null));
        } catch (Throwable unused) {
            jyj.h("BillingLogger", "logging failed.");
        }
    }

    public /* synthetic */ kd4(boolean z, Serializable serializable) {
        this.a = z;
        this.b = serializable;
    }

    public kd4(e99 e99Var) {
        this.b = e99Var;
        this.a = true;
    }
}
