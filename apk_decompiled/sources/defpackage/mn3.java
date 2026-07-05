package defpackage;

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.ScriptIntrinsicBlur;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class mn3 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public /* synthetic */ float F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn3(zt0 zt0Var, float f, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = zt0Var;
        this.F = f;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                mn3 mn3Var = new mn3((aae) obj2, tp4Var);
                mn3Var.F = ((Number) obj).floatValue();
                return mn3Var;
            default:
                return new mn3((zt0) obj2, this.F, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((mn3) create(Float.valueOf(((Number) obj).floatValue()), (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                ((mn3) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                aae aaeVar = (aae) obj2;
                float f = this.F;
                sf5.h0(obj);
                Boolean boolValueOf = Boolean.valueOf(f == MTTypesetterKt.kLineSkipLimitMultiplier || f > aaeVar.E);
                aaeVar.E = f;
                return boolValueOf;
            default:
                sf5.h0(obj);
                zt0 zt0Var = (zt0) obj2;
                float f2 = this.F;
                Allocation allocation = (Allocation) zt0Var.f;
                ScriptIntrinsicBlur scriptIntrinsicBlur = (ScriptIntrinsicBlur) zt0Var.d;
                if (!zt0Var.b) {
                    if (f2 > 25.0f) {
                        f2 = 25.0f;
                    }
                    scriptIntrinsicBlur.setRadius(f2);
                    scriptIntrinsicBlur.forEach(allocation);
                    if (!zt0Var.b) {
                        allocation.copyTo((Bitmap) zt0Var.g);
                    }
                }
                return iei.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn3(aae aaeVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = aaeVar;
    }
}
