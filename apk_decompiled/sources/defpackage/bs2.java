package defpackage;

import com.anthropic.claude.api.chat.ChatFeedbackType;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bs2 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public Object I;
    public final /* synthetic */ Serializable J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs2(ChatFeedbackType chatFeedbackType, String str, boolean z, cs2 cs2Var, String str2, boolean z2, tp4 tp4Var) {
        super(2, tp4Var);
        this.J = chatFeedbackType;
        this.K = str;
        this.G = z;
        this.M = cs2Var;
        this.L = str2;
        this.H = z2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.M;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.J;
        switch (i) {
            case 0:
                boolean z = this.H;
                return new bs2((ChatFeedbackType) obj5, (String) obj4, this.G, (cs2) obj2, (String) obj3, z, tp4Var);
            default:
                return new bs2(this.G, (float[]) obj5, (List) obj4, (y49) obj3, this.H, (List) obj2, tp4Var);
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
        return ((bs2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0146, code lost:
    
        if (r0 == r11) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015b, code lost:
    
        if (r0 == r11) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ab, code lost:
    
        if (r1.b(r21, r3) == r11) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[LOOP:1: B:28:0x0092->B:29:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b7  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bs2(boolean z, float[] fArr, List list, y49 y49Var, boolean z2, List list2, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = z;
        this.J = fArr;
        this.K = list;
        this.L = y49Var;
        this.H = z2;
        this.M = list2;
    }
}
