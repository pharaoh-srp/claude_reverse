package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q99 implements u9d {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ a80 e;
    public final /* synthetic */ a80 f;
    public final /* synthetic */ nwb g;
    public final /* synthetic */ nwb h;
    public final /* synthetic */ nwb i;
    public final /* synthetic */ fu9 j;

    public q99(int i, int i2, int i3, int i4, a80 a80Var, a80 a80Var2, nwb nwbVar, nwb nwbVar2, nwb nwbVar3, fu9 fu9Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = a80Var;
        this.f = a80Var2;
        this.g = nwbVar;
        this.h = nwbVar2;
        this.i = nwbVar3;
        this.j = fu9Var;
    }

    @Override // defpackage.u9d
    public final long a(c79 c79Var, long j, fu9 fu9Var, long j2) {
        long jB;
        c79Var.getClass();
        fu9Var.getClass();
        int i = this.a;
        float f = i;
        int i2 = this.b;
        float f2 = i2;
        int i3 = (((int) (j >> 32)) - ((int) (j2 >> 32))) - this.c;
        if (i3 >= i) {
            i = i3;
        }
        float f3 = i;
        int i4 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) - this.d;
        if (i4 >= i2) {
            i2 = i4;
        }
        float f4 = i2;
        l9e l9eVar = new l9e(f, f2, f3, f4);
        nwb nwbVar = this.g;
        if (!l9eVar.equals((l9e) nwbVar.getValue())) {
            nwbVar.setValue(l9eVar);
        }
        if (((Boolean) this.h.getValue()).booleanValue()) {
            jB = (((long) Float.floatToRawIntBits(((Number) this.f.e()).floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(((Number) this.e.e()).floatValue())) << 32);
        } else {
            long j3 = ((fcc) this.i.getValue()).a;
            fcc fccVar = new fcc(j3);
            if ((j3 & 9223372034707292159L) == 9205357640488583168L) {
                fccVar = null;
            }
            jB = fccVar != null ? fccVar.a : r99.b(this.j, l9eVar);
        }
        return (((long) mwa.L(wd6.d0(Float.intBitsToFloat((int) (jB >> 32)), f, f3))) << 32) | (((long) mwa.L(wd6.d0(Float.intBitsToFloat((int) (jB & 4294967295L)), f2, f4))) & 4294967295L);
    }
}
