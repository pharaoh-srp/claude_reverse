package defpackage;

import com.anthropic.claude.api.chat.InputMode;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class k83 extends xzg implements pz7 {
    public int E;
    public CharSequence F;
    public ArrayList G;
    public ArrayList H;
    public InputMode I;
    public boolean J;
    public int K;
    public final /* synthetic */ hw2 L;
    public final /* synthetic */ t53 M;
    public final /* synthetic */ ps7 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k83(hw2 hw2Var, t53 t53Var, ps7 ps7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.L = hw2Var;
        this.M = t53Var;
        this.N = ps7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new k83(this.L, this.M, this.N, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((k83) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5 A[Catch: CancellationException -> 0x0047, TryCatch #2 {CancellationException -> 0x0047, blocks: (B:15:0x003c, B:42:0x00c9, B:44:0x00d5, B:47:0x00e5, B:46:0x00df), top: B:81:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df A[Catch: CancellationException -> 0x0047, TryCatch #2 {CancellationException -> 0x0047, blocks: (B:15:0x003c, B:42:0x00c9, B:44:0x00d5, B:47:0x00e5, B:46:0x00df), top: B:81:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a A[Catch: CancellationException -> 0x0027, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0027, blocks: (B:8:0x0022, B:61:0x0144, B:63:0x014a), top: B:83:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k83.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
