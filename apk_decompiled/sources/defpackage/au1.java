package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class au1 extends il4 {
    public final /* synthetic */ int b = 1;

    public au1(boolean z) {
        super(Boolean.valueOf(z));
    }

    @Override // defpackage.il4
    public final yr9 a(tqb tqbVar) {
        switch (this.b) {
            case 0:
                tqbVar.getClass();
                or9 or9VarF = tqbVar.f();
                or9VarF.getClass();
                return or9VarF.r(vfd.BOOLEAN);
            case 1:
                tqbVar.getClass();
                or9 or9VarF2 = tqbVar.f();
                or9VarF2.getClass();
                return or9VarF2.r(vfd.DOUBLE);
            default:
                tqbVar.getClass();
                or9 or9VarF3 = tqbVar.f();
                or9VarF3.getClass();
                return or9VarF3.r(vfd.FLOAT);
        }
    }

    @Override // defpackage.il4
    public String toString() {
        int i = this.b;
        Object obj = this.a;
        switch (i) {
            case 1:
                return ((Number) obj).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) obj).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ au1(Object obj) {
        super(obj);
    }

    public au1(double d) {
        super(Double.valueOf(d));
    }

    public au1(float f) {
        super(Float.valueOf(f));
    }
}
