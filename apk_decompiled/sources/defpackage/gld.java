package defpackage;

import com.anthropic.claude.api.project.Project;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gld extends xzg implements pz7 {
    public Project E;
    public List F;
    public zv5 G;
    public yv5 H;
    public List I;
    public long J;
    public int K;
    public boolean L;
    public int M;
    public /* synthetic */ Object N;
    public final /* synthetic */ ild O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gld(ild ildVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.O = ildVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        gld gldVar = new gld(this.O, tp4Var);
        gldVar.N = obj;
        return gldVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((gld) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c1, code lost:
    
        if (r14.B0(r32) != r13) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0133  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.anthropic.claude.api.project.Project, java.lang.Object, java.util.List, yv5, zv5] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gld.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
