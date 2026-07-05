package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qy {
    public Object a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ ry d;

    public qy(ry ryVar) {
        this.d = ryVar;
    }

    public final void a(float f, float f2) {
        ry ryVar = this.d;
        hsc hscVar = ryVar.j;
        float fH = hscVar.h();
        hscVar.i(f);
        ryVar.k.i(f2);
        if (Float.isNaN(fH)) {
            return;
        }
        boolean z = f >= fH;
        vq5 vq5VarC = ryVar.c();
        lsc lscVar = ryVar.g;
        if (hscVar.h() == vq5VarC.f(lscVar.getValue())) {
            Object objB = ryVar.c().b(hscVar.h() + (z ? 1.0f : -1.0f), z);
            if (objB == null) {
                objB = lscVar.getValue();
            }
            if (z) {
                this.a = lscVar.getValue();
                this.b = objB;
            } else {
                this.a = objB;
                this.b = lscVar.getValue();
            }
        } else {
            Object objB2 = ryVar.c().b(hscVar.h(), false);
            if (objB2 == null) {
                objB2 = lscVar.getValue();
            }
            Object objB3 = ryVar.c().b(hscVar.h(), true);
            if (objB3 == null) {
                objB3 = lscVar.getValue();
            }
            this.a = objB2;
            this.b = objB3;
        }
        vq5 vq5VarC2 = ryVar.c();
        Object obj = this.a;
        obj.getClass();
        float f3 = vq5VarC2.f(obj);
        vq5 vq5VarC3 = ryVar.c();
        Object obj2 = this.b;
        obj2.getClass();
        this.c = Math.abs(f3 - vq5VarC3.f(obj2));
        if (Math.abs(hscVar.h() - ryVar.c().f(lscVar.getValue())) >= this.c / 2.0f) {
            Object value = z ? this.b : this.a;
            if (value == null) {
                value = lscVar.getValue();
            }
            if (((Boolean) ryVar.a.invoke(value)).booleanValue()) {
                ryVar.g(value);
            }
        }
    }
}
