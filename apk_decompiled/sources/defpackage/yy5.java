package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yy5 {
    public final ArrayList a;
    public final char b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public yy5 f;
    public yy5 g;

    public yy5(ArrayList arrayList, char c, boolean z, boolean z2, yy5 yy5Var) {
        this.a = arrayList;
        this.b = c;
        this.d = z;
        this.e = z2;
        this.f = yy5Var;
        this.c = arrayList.size();
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean b() {
        return this.d;
    }

    public final edh c() {
        return (edh) this.a.get(0);
    }

    public final List d(int i) {
        ArrayList arrayList = this.a;
        if (i >= 1 && i <= arrayList.size()) {
            return arrayList.subList(0, i);
        }
        throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i);
    }

    public final edh e() {
        return (edh) this.a.get(r1.size() - 1);
    }

    public final List f(int i) {
        ArrayList arrayList = this.a;
        if (i >= 1 && i <= arrayList.size()) {
            return arrayList.subList(arrayList.size() - i, arrayList.size());
        }
        throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i);
    }

    public final int g() {
        return this.a.size();
    }

    public final int h() {
        return this.c;
    }
}
