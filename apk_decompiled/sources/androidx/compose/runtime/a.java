package androidx.compose.runtime;

import defpackage.grc;
import defpackage.gre;
import defpackage.iei;
import defpackage.ij0;
import defpackage.m45;
import defpackage.nai;
import defpackage.pz7;
import defpackage.qvb;
import defpackage.sf5;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.wub;
import defpackage.zmf;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends gre implements pz7 {
    public int F;
    public int G;
    public int H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ ComposePausableCompositionException K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ComposePausableCompositionException composePausableCompositionException, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = composePausableCompositionException;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        a aVar = new a(this.K, tp4Var);
        aVar.J = obj;
        return aVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((zmf) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        zmf zmfVar;
        int i;
        int i2;
        int i3;
        String strP;
        int i4;
        int i5;
        String str;
        ComposePausableCompositionException composePausableCompositionException = this.K;
        qvb qvbVar = composePausableCompositionException.E;
        wub wubVar = composePausableCompositionException.G;
        int i6 = this.I;
        if (i6 == 0) {
            sf5.h0(obj);
            zmfVar = (zmf) this.J;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.H;
            i2 = this.G;
            i3 = this.F;
            zmfVar = (zmf) this.J;
            sf5.h0(obj);
        }
        if (i3 >= Math.min(composePausableCompositionException.H + 10, wubVar.b)) {
            return iei.a;
        }
        int i7 = i3 + 1;
        int iC = wubVar.c(i3);
        switch (iC) {
            case 0:
                strP = "up";
                break;
            case 1:
                String strH = ij0.h("down ", qvbVar.f(i2));
                i2++;
                strP = strH;
                break;
            case 2:
                strP = "remove " + wubVar.c(i7) + ' ' + wubVar.c(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                strP = "move " + wubVar.c(i7) + ' ' + wubVar.c(i3 + 2) + ' ' + wubVar.c(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                strP = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iC2 = wubVar.c(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iC2 + ' ' + qvbVar.f(i2);
                int i8 = i4;
                strP = str;
                i7 = i8;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iC3 = wubVar.c(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iC3 + ' ' + qvbVar.f(i2);
                int i82 = i4;
                strP = str;
                i7 = i82;
                i2 = i5;
                break;
            case 7:
                Object objF = qvbVar.f(i2);
                objF.getClass();
                nai.n(2, objF);
                i2 += 2;
                strP = "apply " + ((pz7) objF);
                break;
            case 8:
                strP = "reuse " + composePausableCompositionException.F.f(i);
                i++;
                break;
            case 9:
                strP = "recompose pending";
                break;
            default:
                strP = grc.p(iC, "unknown op: ");
                break;
        }
        this.J = zmfVar;
        this.F = i7;
        this.G = i2;
        this.H = i;
        this.I = 1;
        zmfVar.d(this, i3 + ": " + strP);
        return m45.E;
    }
}
