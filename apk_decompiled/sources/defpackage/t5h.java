package defpackage;

import android.content.Context;
import android.os.Handler;
import android.print.PrintAttributes;
import android.webkit.WebView;
import com.anthropic.claude.api.tasks.BlockingToolDetail;
import java.io.File;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class t5h extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5h(cji cjiVar, hwg hwgVar, Context context, hi6 hi6Var, zy7 zy7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 5;
        this.G = cjiVar;
        this.H = hwgVar;
        this.I = context;
        this.J = hi6Var;
        this.K = zy7Var;
    }

    public static final void d(AtomicBoolean atomicBoolean, Handler handler, ua2 ua2Var, WebView webView, boolean z) {
        if (atomicBoolean.compareAndSet(false, true)) {
            handler.post(new a8j(webView, 1));
            if (ua2Var.s() instanceof q6c) {
                ua2Var.resumeWith(Boolean.valueOf(z));
            }
        }
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.J;
        Object obj3 = this.K;
        switch (i) {
            case 0:
                t5h t5hVar = new t5h((x5h) this.H, (String) this.I, (String) obj2, (String) obj3, tp4Var, 0);
                t5hVar.G = obj;
                return t5hVar;
            case 1:
                t5h t5hVar2 = new t5h((myh) obj2, (BlockingToolDetail) obj3, tp4Var);
                t5hVar2.G = obj;
                return t5hVar2;
            case 2:
                t5h t5hVar3 = new t5h((uah) obj2, (String) this.I, (uh6) obj3, tp4Var);
                t5hVar3.G = obj;
                return t5hVar3;
            case 3:
                t5h t5hVar4 = new t5h((pz7) this.H, (poc) this.I, (l45) obj2, (AtomicReference) obj3, tp4Var, 3);
                t5hVar4.G = obj;
                return t5hVar4;
            case 4:
                t5h t5hVar5 = new t5h((p4i) this.I, (raf) obj2, (dae) obj3, tp4Var);
                t5hVar5.G = obj;
                return t5hVar5;
            case 5:
                return new t5h((cji) this.G, (hwg) this.H, (Context) this.I, (hi6) obj2, (zy7) obj3, tp4Var);
            case 6:
                return new t5h((Context) this.G, (String) this.I, (String) obj2, (PrintAttributes) this.H, (File) obj3, tp4Var);
            default:
                return new t5h((m9j) obj3, (String) this.I, (String) obj2, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((t5h) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0483, code lost:
    
        if (r9.f(r0, r23) == r7) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r0.b(r23, defpackage.p9j.a) == r7) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x030a -> B:119:0x030c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x04a6 -> B:145:0x040b). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t5h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5h(myh myhVar, BlockingToolDetail blockingToolDetail, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 1;
        this.J = myhVar;
        this.K = blockingToolDetail;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5h(p4i p4iVar, raf rafVar, dae daeVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 4;
        this.I = p4iVar;
        this.J = rafVar;
        this.K = daeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5h(uah uahVar, String str, uh6 uh6Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 2;
        this.J = uahVar;
        this.I = str;
        this.K = uh6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5h(m9j m9jVar, String str, String str2, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 7;
        this.K = m9jVar;
        this.I = str;
        this.J = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5h(Context context, String str, String str2, PrintAttributes printAttributes, File file, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 6;
        this.G = context;
        this.I = str;
        this.J = str2;
        this.H = printAttributes;
        this.K = file;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5h(Object obj, Object obj2, Object obj3, Serializable serializable, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.K = serializable;
    }
}
