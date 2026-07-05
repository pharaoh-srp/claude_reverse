package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ak9 {
    public final Throwable a;
    public final String b;
    public final ArrayList c;

    public ak9(String str, Throwable th, ArrayList arrayList) {
        this.a = th;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak9)) {
            return false;
        }
        ak9 ak9Var = (ak9) obj;
        return this.a.equals(ak9Var.a) && this.b.equals(ak9Var.b) && this.c.equals(ak9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Rum(throwable=" + this.a + ", message=" + this.b + ", threads=" + this.c + ")";
    }
}
