package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class xc4 extends xzg implements pz7 {
    public boolean E;
    public int F;
    public /* synthetic */ float G;
    public final /* synthetic */ yc4 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc4(yc4 yc4Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = yc4Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        xc4 xc4Var = new xc4(this.H, tp4Var);
        xc4Var.G = ((Number) obj).floatValue();
        return xc4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((xc4) create(Float.valueOf(((Number) obj).floatValue()), (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            float f = this.G;
            yc4 yc4Var = this.H;
            Object objG = yc4Var.a.d.E.g(ojf.e);
            pz7 pz7Var = (pz7) (objG != null ? objG : null);
            if (pz7Var == null) {
                throw sq6.z("Required value was null.");
            }
            boolean z2 = ((v8f) yc4Var.a.d.g(akf.w)).c;
            if (z2) {
                f = -f;
            }
            fcc fccVar = new fcc((((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.E = z2;
            this.F = 1;
            obj = pz7Var.invoke(fccVar, this);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
            z = z2;
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.E;
            sf5.h0(obj);
        }
        long j = ((fcc) obj).a;
        return new Float(z ? -Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
