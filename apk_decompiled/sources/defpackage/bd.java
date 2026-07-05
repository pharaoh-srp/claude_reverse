package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bd implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ bd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        Object obj2 = this.J;
        Object obj3 = this.I;
        Object obj4 = this.H;
        Object obj5 = this.G;
        Object obj6 = this.F;
        switch (i) {
            case 0:
                wc wcVar = (wc) obj6;
                wcVar.a = ((z94) obj5).c((String) obj4, (ez1) obj3, new cd(0, (nwb) obj2));
                return new dd(0, wcVar);
            default:
                occ occVar = (occ) obj5;
                cjh cjhVar = (cjh) obj4;
                m2a m2aVar = (m2a) obj3;
                eeg eegVar = (eeg) obj2;
                cv9 cv9Var = (cv9) obj;
                cv9Var.a();
                float fH = ((pd5) obj6).c.h();
                if (fH != MTTypesetterKt.kLineSkipLimitMultiplier) {
                    long j = cjhVar.b;
                    int i2 = kkh.c;
                    int iD = occVar.D((int) (j >> 32));
                    zjh zjhVarD = m2aVar.d();
                    l9e l9eVarC = zjhVarD != null ? zjhVarD.a.c(iD) : new l9e(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
                    float fFloor = (float) Math.floor(cv9Var.q0(2.0f));
                    float f = fFloor < 1.0f ? 1.0f : fFloor;
                    float f2 = f / 2.0f;
                    float f3 = l9eVarC.a + f2;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (cv9Var.E.g() >> 32)) - f2;
                    if (f3 > fIntBitsToFloat) {
                        f3 = fIntBitsToFloat;
                    }
                    if (f3 >= f2) {
                        f2 = f3;
                    }
                    float fFloor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
                    cv9Var.E.c(eegVar, (((long) Float.floatToRawIntBits(l9eVarC.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloor2)) << 32), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(l9eVarC.d))), f, fH);
                }
                return iei.a;
        }
    }
}
