package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ui5 extends xzg implements pz7 {
    public ChatConversationWithProjectReference E;
    public ChatConversationWithProjectReference F;
    public int G;
    public boolean H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ String K;
    public final /* synthetic */ String L;
    public final /* synthetic */ String M;
    public final /* synthetic */ dae N;
    public final /* synthetic */ boolean O;
    public final /* synthetic */ bj5 P;
    public final /* synthetic */ List Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui5(String str, String str2, String str3, dae daeVar, boolean z, bj5 bj5Var, List list, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = str;
        this.L = str2;
        this.M = str3;
        this.N = daeVar;
        this.O = z;
        this.P = bj5Var;
        this.Q = list;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        ui5 ui5Var = new ui5(this.K, this.L, this.M, this.N, this.O, this.P, this.Q, tp4Var);
        ui5Var.J = obj;
        return ui5Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((ui5) create((kq4) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
