package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class a29 extends xzg implements pz7 {
    public /* synthetic */ float E;

    public a29() {
        super(2, null);
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        a29 a29Var = new a29(2, tp4Var);
        a29Var.E = ((Number) obj).floatValue();
        return a29Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((a29) create(Float.valueOf(((Number) obj).floatValue()), (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        return Boolean.valueOf(this.E > MTTypesetterKt.kLineSkipLimitMultiplier);
    }
}
