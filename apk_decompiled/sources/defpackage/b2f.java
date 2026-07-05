package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes3.dex */
public final class b2f implements u0f {
    public final Path a = new Path();
    public float b;
    public float c;

    public b2f(bi0 bi0Var) {
        if (bi0Var == null) {
            return;
        }
        bi0Var.r(this);
    }

    @Override // defpackage.u0f
    public final void a(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
        this.b = f3;
        this.c = f4;
    }

    @Override // defpackage.u0f
    public final void b(float f, float f2) {
        this.a.moveTo(f, f2);
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.u0f
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
        this.b = f5;
        this.c = f6;
    }

    @Override // defpackage.u0f
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.u0f
    public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        h2f.b(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
        this.b = f4;
        this.c = f5;
    }

    @Override // defpackage.u0f
    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
        this.b = f;
        this.c = f2;
    }
}
