package defpackage;

import android.net.Uri;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.mcp.McpToolApprovalOption;
import com.anthropic.claude.api.project.Project;

/* JADX INFO: loaded from: classes2.dex */
public final class c53 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public boolean G;
    public Object H;
    public /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c53(Object obj, Object obj2, boolean z, Object obj3, Object obj4, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.G = z;
        this.J = obj3;
        this.K = obj4;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.K;
        Object obj3 = this.J;
        switch (i) {
            case 0:
                return new c53((t53) this.H, (String) this.I, this.G, (String) obj3, (McpToolApprovalOption) obj2, tp4Var, 0);
            case 1:
                return new c53((qmh) this.H, (Integer) this.I, this.G, (jsc) obj3, (jsc) obj2, tp4Var, 1);
            case 2:
                c53 c53Var = new c53((ChatConversationWithProjectReference) obj3, this.G, (bj5) obj2, tp4Var);
                c53Var.I = obj;
                return c53Var;
            case 3:
                c53 c53Var2 = new c53((jj5) obj3, (Project) obj2, this.G, (String) this.I, tp4Var, 3);
                c53Var2.H = obj;
                return c53Var2;
            case 4:
                return new c53((ik6) this.H, (bz7) this.I, (zy7) obj3, (zy7) obj2, tp4Var);
            case 5:
                return new c53((s5e) obj3, (j8i) obj2, this.G, (String) this.I, tp4Var, 5);
            default:
                c53 c53Var3 = new c53((u6j) obj3, (Uri) obj2, (String) this.I, tp4Var);
                c53Var3.H = obj;
                return c53Var3;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((c53) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb A[Catch: Exception -> 0x0039, TryCatch #1 {Exception -> 0x0039, blocks: (B:10:0x0031, B:16:0x0045, B:41:0x011f, B:43:0x0127, B:46:0x012f, B:19:0x004f, B:29:0x0095, B:31:0x00cb, B:33:0x00d9, B:34:0x00f2, B:36:0x00f9, B:37:0x00fe, B:38:0x0109, B:20:0x0056, B:26:0x0076, B:23:0x005f), top: B:220:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0127 A[Catch: Exception -> 0x0039, TryCatch #1 {Exception -> 0x0039, blocks: (B:10:0x0031, B:16:0x0045, B:41:0x011f, B:43:0x0127, B:46:0x012f, B:19:0x004f, B:29:0x0095, B:31:0x00cb, B:33:0x00d9, B:34:0x00f2, B:36:0x00f9, B:37:0x00fe, B:38:0x0109, B:20:0x0056, B:26:0x0076, B:23:0x005f), top: B:220:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016a A[Catch: Exception -> 0x0154, TryCatch #5 {Exception -> 0x0154, blocks: (B:53:0x014f, B:50:0x0147, B:58:0x015a, B:61:0x016a, B:62:0x0175, B:64:0x017b, B:65:0x018b, B:67:0x0191, B:68:0x01ab, B:70:0x01b1), top: B:220:0x0027 }] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c53.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c53(u6j u6jVar, Uri uri, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 6;
        this.J = u6jVar;
        this.K = uri;
        this.I = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c53(ChatConversationWithProjectReference chatConversationWithProjectReference, boolean z, bj5 bj5Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 2;
        this.J = chatConversationWithProjectReference;
        this.G = z;
        this.K = bj5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c53(ik6 ik6Var, bz7 bz7Var, zy7 zy7Var, zy7 zy7Var2, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 4;
        this.H = ik6Var;
        this.I = bz7Var;
        this.J = zy7Var;
        this.K = zy7Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c53(Object obj, Object obj2, boolean z, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.J = obj;
        this.K = obj2;
        this.G = z;
        this.I = str;
    }
}
