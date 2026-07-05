package defpackage;

import android.view.ViewStructure;

/* JADX INFO: loaded from: classes3.dex */
public final class o9d extends ts9 implements sz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9d(int i, Object obj) {
        super(4);
        this.F = i;
        this.G = obj;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.F;
        iei ieiVar = iei.a;
        Object obj5 = this.G;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                ((ViewStructure) obj5).setDimens(iIntValue, iIntValue2, 0, 0, ((Number) obj3).intValue() - iIntValue, ((Number) obj4).intValue() - iIntValue2);
                break;
            default:
                long j = ((fcc) obj).a;
                long j2 = ((fcc) obj2).a;
                float fFloatValue = ((Number) obj3).floatValue();
                long jLongValue = ((Number) obj4).longValue();
                qkj qkjVar = (qkj) obj5;
                if (qkjVar.V) {
                    gb9.D(qkjVar.d1(), null, null, new okj(qkjVar, j2, fFloatValue, j, jLongValue, null), 3);
                }
                break;
        }
        return ieiVar;
    }
}
