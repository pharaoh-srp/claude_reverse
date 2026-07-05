package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class rri extends sri {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public rri(rri rriVar, bp0 bp0Var) {
        tri priVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.d = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.e = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.i = MTTypesetterKt.kLineSkipLimitMultiplier;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = rriVar.c;
        this.d = rriVar.d;
        this.e = rriVar.e;
        this.f = rriVar.f;
        this.g = rriVar.g;
        this.h = rriVar.h;
        this.i = rriVar.i;
        String str = rriVar.k;
        this.k = str;
        if (str != null) {
            bp0Var.put(str, this);
        }
        matrix.set(rriVar.j);
        ArrayList arrayList = rriVar.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof rri) {
                this.b.add(new rri((rri) obj, bp0Var));
            } else {
                if (obj instanceof qri) {
                    qri qriVar = (qri) obj;
                    qri qriVar2 = new qri(qriVar);
                    qriVar2.e = MTTypesetterKt.kLineSkipLimitMultiplier;
                    qriVar2.g = 1.0f;
                    qriVar2.h = 1.0f;
                    qriVar2.i = MTTypesetterKt.kLineSkipLimitMultiplier;
                    qriVar2.j = 1.0f;
                    qriVar2.k = MTTypesetterKt.kLineSkipLimitMultiplier;
                    qriVar2.l = Paint.Cap.BUTT;
                    qriVar2.m = Paint.Join.MITER;
                    qriVar2.n = 4.0f;
                    qriVar2.d = qriVar.d;
                    qriVar2.e = qriVar.e;
                    qriVar2.g = qriVar.g;
                    qriVar2.f = qriVar.f;
                    qriVar2.c = qriVar.c;
                    qriVar2.h = qriVar.h;
                    qriVar2.i = qriVar.i;
                    qriVar2.j = qriVar.j;
                    qriVar2.k = qriVar.k;
                    qriVar2.l = qriVar.l;
                    qriVar2.m = qriVar.m;
                    qriVar2.n = qriVar.n;
                    priVar = qriVar2;
                } else {
                    if (!(obj instanceof pri)) {
                        sz6.j("Unknown object in the tree!");
                        throw null;
                    }
                    priVar = new pri((pri) obj);
                }
                this.b.add(priVar);
                Object obj2 = priVar.b;
                if (obj2 != null) {
                    bp0Var.put(obj2, priVar);
                }
            }
        }
    }

    @Override // defpackage.sri
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((sri) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.sri
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((sri) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public rri() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.d = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.e = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.i = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.j = new Matrix();
        this.k = null;
    }
}
