package defpackage;

import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;

/* JADX INFO: loaded from: classes2.dex */
public final class ey8 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ lvh G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey8(lvh lvhVar, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = lvhVar;
        this.H = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.H;
        lvh lvhVar = this.G;
        switch (i) {
            case 0:
                return new ey8(lvhVar, str, tp4Var, 0);
            default:
                return new ey8(lvhVar, str, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((ey8) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.H;
        lvh lvhVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    xga xgaVar = new xga(3);
                    this.F = 1;
                    if (j8.O(getContext()).b0(this, xgaVar) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                lvhVar.m.invoke(ImageGalleryItemId.m304boximpl(str));
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    xga xgaVar2 = new xga(3);
                    this.F = 1;
                    if (j8.O(getContext()).b0(this, xgaVar2) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                lvhVar.m.invoke(ImageGalleryItemId.m304boximpl(str));
                break;
        }
        return ieiVar;
    }
}
