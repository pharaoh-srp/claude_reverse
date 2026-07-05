package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public abstract class eb1 {
    public final Object a;
    public Object b;

    public eb1(sf5 sf5Var) {
        this.a = new db1(0, this);
        this.b = new cb1(this, sf5Var);
    }

    public void a(String str) {
        ((CopyOnWriteArraySet) this.a).add(str);
        ((CopyOnWriteArraySet) this.b).remove(str);
    }

    public boolean b() {
        return ((db1) this.a).b && ((cb1) this.b).b;
    }

    public void c() {
    }

    public abstract void d();

    public void e(ab1 ab1Var) {
    }

    public void f() {
    }

    public InputMethodManager g() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.b;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = ((View) this.a).getContext().getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService;
        this.b = inputMethodManager2;
        return inputMethodManager2;
    }

    public void h(boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.b;
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.a;
        if (z) {
            copyOnWriteArraySet2.add("android.widget.ImageView");
            copyOnWriteArraySet.remove("android.widget.ImageView");
        } else {
            copyOnWriteArraySet.add("android.widget.ImageView");
            copyOnWriteArraySet2.remove("android.widget.ImageView");
        }
    }

    public void i(boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.b;
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.a;
        if (z) {
            copyOnWriteArraySet2.add("android.widget.TextView");
            copyOnWriteArraySet.remove("android.widget.TextView");
        } else {
            copyOnWriteArraySet.add("android.widget.TextView");
            copyOnWriteArraySet2.remove("android.widget.TextView");
        }
    }

    public void j() {
    }

    public abstract void k();

    public eb1() {
        this.a = new CopyOnWriteArraySet();
        this.b = new CopyOnWriteArraySet();
    }

    public eb1(View view) {
        this.a = view;
    }
}
