package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f51 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final p31 g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public f51(e51 e51Var) {
        this.a = e51Var.a;
        this.b = e51Var.b;
        this.c = e51Var.c;
        this.d = e51Var.d;
        this.e = e51Var.e;
        this.f = e51Var.f;
        this.g = e51Var.g;
        this.h = e51Var.h;
        this.i = e51Var.i;
        this.j = e51Var.j;
        this.k = e51Var.k;
    }

    public final e51 a() {
        e51 e51Var = new e51();
        e51Var.a = this.a;
        e51Var.b = this.b;
        e51Var.c = this.c;
        e51Var.d = this.d;
        e51Var.e = this.e;
        e51Var.f = this.f;
        e51Var.g = this.g;
        e51Var.h = this.h;
        e51Var.i = this.i;
        e51Var.j = this.j;
        e51Var.k = this.k;
        return e51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f51.class != obj.getClass()) {
            return false;
        }
        f51 f51Var = (f51) obj;
        return this.a == f51Var.a && this.b == f51Var.b && this.c == f51Var.c && this.d == f51Var.d && this.e == f51Var.e && this.f == f51Var.f && this.h == f51Var.h && this.i == f51Var.i && this.j == f51Var.j && this.k == f51Var.k && this.g.equals(f51Var.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}
