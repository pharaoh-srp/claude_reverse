package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sp0 {
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;

    public sp0(sp0 sp0Var) {
        this.a = 2;
        this.b = sp0Var.b;
        this.c = sp0Var.c;
        this.d = sp0Var.d;
        this.e = sp0Var.e;
    }

    public static void a(sp0 sp0Var, float f, float f2, int i) {
        float f3 = sp0Var.b;
        if ((i & 2) != 0) {
            f = sp0Var.c;
        }
        float f4 = sp0Var.d;
        if ((i & 8) != 0) {
            f2 = sp0Var.e;
        }
        sp0Var.b = f3;
        float f5 = sp0Var.c;
        if (f5 >= f) {
            f = f5;
        }
        sp0Var.c = f;
        sp0Var.d = f4;
        float f6 = sp0Var.e;
        if (f6 >= f2) {
            f2 = f6;
        }
        sp0Var.e = f2;
    }

    public static void b(sp0 sp0Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = sp0Var.b;
        }
        if ((i & 2) != 0) {
            f2 = sp0Var.d;
        }
        float f3 = sp0Var.b;
        if (f3 >= f) {
            f = f3;
        }
        sp0Var.b = f;
        float f4 = sp0Var.d;
        if (f4 >= f2) {
            f2 = f4;
        }
        sp0Var.d = f2;
    }

    public float c() {
        return this.d;
    }

    public float d() {
        return this.b;
    }

    public float e() {
        return this.e;
    }

    public float f() {
        return this.c;
    }

    public float g() {
        return this.b + this.d;
    }

    public float h() {
        return this.c + this.e;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "[" + this.b + " " + this.c + " " + this.d + " " + this.e + "]";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ sp0(float f, float f2, float f3, float f4, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }
}
