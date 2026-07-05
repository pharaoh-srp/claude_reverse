package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xb0 implements Appendable {
    public final StringBuilder E;
    public final ArrayList F;
    public final ArrayList G;

    public xb0(int i) {
        this.E = new StringBuilder(i);
        this.F = new ArrayList();
        this.G = new ArrayList();
        new ArrayList();
    }

    public final void a(int i, int i2, String str, String str2) {
        this.G.add(new wb0(i, i2, erg.a(str2), str));
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.E.append(c);
        return this;
    }

    public final void b(egg eggVar, int i, int i2) {
        this.G.add(new wb0(eggVar, i, i2, null, 8));
    }

    public final void c(char c) {
        this.E.append(c);
    }

    public final void d(int i, int i2, CharSequence charSequence) {
        if (charSequence instanceof zb0) {
            f((zb0) charSequence, i, i2);
        } else {
            this.E.append(charSequence, i, i2);
        }
    }

    public final void e(zb0 zb0Var) {
        StringBuilder sb = this.E;
        int length = sb.length();
        sb.append(zb0Var.F);
        List list = zb0Var.E;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                yb0 yb0Var = (yb0) list.get(i);
                this.G.add(new wb0(yb0Var.b + length, yb0Var.c + length, yb0Var.a, yb0Var.d));
            }
        }
    }

    public final void f(zb0 zb0Var, int i, int i2) {
        StringBuilder sb = this.E;
        int length = sb.length();
        sb.append((CharSequence) zb0Var.F, i, i2);
        List listA = ac0.a(zb0Var, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                yb0 yb0Var = (yb0) listA.get(i3);
                this.G.add(new wb0(yb0Var.b + length, yb0Var.c + length, yb0Var.a, yb0Var.d));
            }
        }
    }

    public final void g(CharSequence charSequence) {
        if (charSequence instanceof zb0) {
            e((zb0) charSequence);
        } else {
            this.E.append(charSequence);
        }
    }

    public final void h(String str) {
        this.E.append(str);
    }

    public final void i() {
        ArrayList arrayList = this.F;
        if (arrayList.isEmpty()) {
            c39.c("Nothing to pop.");
        }
        ((wb0) arrayList.remove(arrayList.size() - 1)).c = this.E.length();
    }

    public final void j(int i) {
        ArrayList arrayList = this.F;
        if (i >= arrayList.size()) {
            c39.c(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            i();
        }
    }

    public final int k(o6a o6aVar) {
        wb0 wb0Var = new wb0(o6aVar, this.E.length(), 0, null, 12);
        this.F.add(wb0Var);
        this.G.add(wb0Var);
        return r7.size() - 1;
    }

    public final int l(String str, String str2) {
        wb0 wb0Var = new wb0(erg.a(str2), this.E.length(), 0, str, 4);
        this.F.add(wb0Var);
        this.G.add(wb0Var);
        return r7.size() - 1;
    }

    public final int m(egg eggVar) {
        wb0 wb0Var = new wb0(eggVar, this.E.length(), 0, null, 12);
        this.F.add(wb0Var);
        this.G.add(wb0Var);
        return r7.size() - 1;
    }

    public final zb0 n() {
        StringBuilder sb = this.E;
        String string = sb.toString();
        ArrayList arrayList = this.G;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((wb0) arrayList.get(i)).a(sb.length()));
        }
        return new zb0(string, (List) arrayList2);
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        d(i, i2, charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    public /* synthetic */ xb0() {
        this(16);
    }

    public xb0(zb0 zb0Var) {
        this();
        e(zb0Var);
    }
}
