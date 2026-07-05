package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b53 extends xzg implements rz7 {
    public /* synthetic */ boolean E;
    public /* synthetic */ boolean F;

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        b53 b53Var = new b53(3, (tp4) obj3);
        b53Var.E = zBooleanValue;
        b53Var.F = zBooleanValue2;
        return b53Var.invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.E;
        boolean z2 = this.F;
        sf5.h0(obj);
        return Boolean.valueOf(z && z2);
    }
}
