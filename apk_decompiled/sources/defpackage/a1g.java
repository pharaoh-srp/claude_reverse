package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a1g {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public a1g() {
        d(MTTypesetterKt.kLineSkipLimitMultiplier, 270.0f, MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        w0g w0gVar = new w0g(f4, f5, f4, f5);
        w0gVar.f = this.d;
        w0gVar.g = f3;
        this.g.add(new u0g(w0gVar));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((y0g) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        x0g x0gVar = new x0g();
        x0gVar.b = f;
        x0gVar.c = f2;
        this.f.add(x0gVar);
        v0g v0gVar = new v0g(x0gVar, this.b, this.c);
        float fB = v0gVar.b() + 270.0f;
        float fB2 = v0gVar.b() + 270.0f;
        a(fB);
        this.g.add(v0gVar);
        this.d = fB2;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
