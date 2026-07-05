package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rpc implements cd6, h9f {
    public final /* synthetic */ vpc a;

    public rpc(vpc vpcVar) {
        this.a = vpcVar;
    }

    @Override // defpackage.cd6
    public final void a(float f) {
        vpc vpcVar = this.a.n.a;
        float fFloatValue = ((Number) vpcVar.a.invoke(Float.valueOf(f))).floatValue();
        int i = vpcVar.f;
        if (i == -1) {
            return;
        }
        vpcVar.i((int) (i + fFloatValue));
    }

    @Override // defpackage.h9f
    public final float b(float f) {
        int iE = this.a.e();
        a(f);
        return r0.e() - iE;
    }
}
