package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kn3 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ mxd F;

    public /* synthetic */ kn3(mxd mxdVar, int i) {
        this.E = i;
        this.F = mxdVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        float fD0;
        int i = this.E;
        mxd mxdVar = this.F;
        switch (i) {
            case 0:
                fD0 = wd6.d0(mxdVar.a(), MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
                break;
            case 1:
                fD0 = wd6.d0(mxdVar.a(), MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
                break;
            default:
                fD0 = mxdVar.a();
                break;
        }
        return Float.valueOf(fD0);
    }
}
