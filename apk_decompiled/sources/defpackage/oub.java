package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oub {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;

    public final void a(float f, float f2, float f3, float f4, float f5) {
        float f6 = this.a;
        if (f6 >= f) {
            f = f6;
        }
        float f7 = this.b;
        if (f7 >= f2) {
            f2 = f7;
        }
        float f8 = this.c;
        if (f8 >= f3) {
            f3 = f8;
        }
        float f9 = this.d;
        if (f9 >= f4) {
            f4 = f9;
        }
        float f10 = this.e;
        if (f10 >= f5) {
            f5 = f10;
        }
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final float c(ge2 ge2Var) {
        ge2Var.getClass();
        return this.b + this.c + (this.a * ((float) (ge2Var.d().c() / ge2Var.d().d())));
    }

    public final float d() {
        return this.b + this.d;
    }
}
