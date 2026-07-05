package defpackage;

import android.os.SystemClock;
import com.anthropic.claude.sessions.types.ControlRequestBody;
import com.anthropic.claude.sessions.types.SdkEvent;
import com.anthropic.claude.sessions.types.StdinMessage;
import com.anthropic.claude.sessions.types.m;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vqf extends xzg implements pz7 {
    public dae E;
    public gvf F;
    public z9e G;
    public cae H;
    public List I;
    public List J;
    public dae K;
    public dae L;
    public z9e M;
    public z9e N;
    public dae O;
    public dae P;
    public gh2 Q;
    public n29 R;
    public z9e S;
    public gh2 T;
    public Object U;
    public fvf V;
    public Object W;
    public SdkEvent X;
    public Object Y;
    public Object Z;
    public Iterator a0;
    public fvf b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public boolean h0;
    public boolean i0;
    public long j0;
    public long k0;
    public int l0;
    public /* synthetic */ Object m0;
    public final /* synthetic */ jrf n0;
    public final /* synthetic */ boolean o0;
    public final /* synthetic */ String p0;
    public final /* synthetic */ boolean q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqf(jrf jrfVar, boolean z, String str, boolean z2, tp4 tp4Var) {
        super(2, tp4Var);
        this.n0 = jrfVar;
        this.o0 = z;
        this.p0 = str;
        this.q0 = z2;
    }

    public static final void d(z9e z9eVar, dae daeVar, aid aidVar, boolean z, jrf jrfVar, String str) {
        if (z9eVar.E) {
            return;
        }
        lf9 lf9Var = (lf9) daeVar.E;
        if (lf9Var == null || !lf9Var.c()) {
            z9eVar.E = true;
            String strI = vb7.i();
            m mVar = ControlRequestBody.Companion;
            Boolean bool = Boolean.TRUE;
            if (!z) {
                bool = null;
            }
            mVar.getClass();
            daeVar.E = gb9.D(aidVar, null, null, new tqf(jrfVar, str, new StdinMessage.ControlRequest((String) null, (String) null, strI, new ControlRequestBody.Initialize((String) null, bool, 1, (mq5) null), 3, (mq5) null), z9eVar, null), 3);
        }
    }

    public static final Object n(z9e z9eVar, cae caeVar, aid aidVar, gvf gvfVar, vqf vqfVar) {
        z9eVar.E = false;
        caeVar.E = SystemClock.elapsedRealtime();
        return aidVar.J.b(vqfVar, new fuf(gvfVar.g()));
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        vqf vqfVar = new vqf(this.n0, this.o0, this.p0, this.q0, tp4Var);
        vqfVar.m0 = obj;
        return vqfVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((vqf) create((aid) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x02c1: MOVE (r44 I:??[long, double]) = (r12 I:??[long, double]), block:B:22:0x02ba */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0922: MOVE (r44 I:??[long, double]) = (r12 I:??[long, double]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0d7d: MOVE (r44 I:??[long, double]) = (r12 I:??[long, double]), block:B:83:0x0d77 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0fd8: MOVE (r44 I:??[long, double]) = (r12 I:??[long, double]), block:B:98:0x0fd2 */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x01ef: MOVE (r30 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:15:0x01e9 */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x02ba: MOVE (r30 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:22:0x02ba */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x08f5: MOVE (r30 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0da1: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:84:0x0d83 */
    /* JADX WARN: Not initialized variable reg: 29, insn: 0x02e4: MOVE (r1 I:??[OBJECT, ARRAY]) = (r29 I:??[OBJECT, ARRAY]), block:B:22:0x02ba */
    /* JADX WARN: Not initialized variable reg: 29, insn: 0x0927: MOVE (r1 I:??[OBJECT, ARRAY]) = (r29 I:??[OBJECT, ARRAY]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 29, insn: 0x0d9b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r29 I:??[OBJECT, ARRAY]), block:B:84:0x0d83 */
    /* JADX WARN: Not initialized variable reg: 31, insn: 0x0da3: MOVE (r34 I:??[OBJECT, ARRAY]) = (r31 I:??[OBJECT, ARRAY]), block:B:84:0x0d83 */
    /* JADX WARN: Not initialized variable reg: 32, insn: 0x02e6: MOVE (r39 I:??[OBJECT, ARRAY]) = (r32 I:??[OBJECT, ARRAY]), block:B:22:0x02ba */
    /* JADX WARN: Not initialized variable reg: 32, insn: 0x0d7f: MOVE (r41 I:??[OBJECT, ARRAY]) = (r32 I:??[OBJECT, ARRAY]), block:B:83:0x0d77 */
    /* JADX WARN: Not initialized variable reg: 32, insn: 0x0fda: MOVE (r41 I:??[OBJECT, ARRAY]) = (r32 I:??[OBJECT, ARRAY]), block:B:98:0x0fd2 */
    /* JADX WARN: Not initialized variable reg: 33, insn: 0x02dd: MOVE (r6 I:??[OBJECT, ARRAY]) = (r33 I:??[OBJECT, ARRAY]), block:B:22:0x02ba */
    /* JADX WARN: Not initialized variable reg: 33, insn: 0x0d9d: MOVE (r8 I:??[OBJECT, ARRAY]) = (r33 I:??[OBJECT, ARRAY]), block:B:84:0x0d83 */
    /* JADX WARN: Not initialized variable reg: 34, insn: 0x0d9f: MOVE (r15 I:??[OBJECT, ARRAY]) = (r34 I:??[OBJECT, ARRAY]), block:B:84:0x0d83 */
    /* JADX WARN: Not initialized variable reg: 35, insn: 0x02df: MOVE (r41 I:??[OBJECT, ARRAY]) = (r35 I:??[OBJECT, ARRAY]), block:B:22:0x02ba */
    /* JADX WARN: Not initialized variable reg: 35, insn: 0x0916: MOVE (r39 I:??[OBJECT, ARRAY]) = (r35 I:??[OBJECT, ARRAY]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 35, insn: 0x0fdc: MOVE (r12 I:??[OBJECT, ARRAY]) = (r35 I:??[OBJECT, ARRAY]), block:B:98:0x0fd2 */
    /* JADX WARN: Not initialized variable reg: 36, insn: 0x01eb: MOVE (r41 I:??[OBJECT, ARRAY]) = (r36 I:??[OBJECT, ARRAY]), block:B:15:0x01e9 */
    /* JADX WARN: Not initialized variable reg: 36, insn: 0x02ea: MOVE (r8 I:??[OBJECT, ARRAY]) = (r36 I:??[OBJECT, ARRAY]), block:B:22:0x02ba */
    /* JADX WARN: Not initialized variable reg: 36, insn: 0x0918: MOVE (r6 I:??[OBJECT, ARRAY]) = (r36 I:??[OBJECT, ARRAY]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 36, insn: 0x0fde: MOVE (r35 I:??[OBJECT, ARRAY]) = (r36 I:??[OBJECT, ARRAY]), block:B:98:0x0fd2 */
    /* JADX WARN: Not initialized variable reg: 37, insn: 0x02c3: MOVE (r15 I:??[OBJECT, ARRAY]) = (r37 I:??[OBJECT, ARRAY]), block:B:22:0x02ba */
    /* JADX WARN: Not initialized variable reg: 37, insn: 0x08fc: MOVE (r34 I:??[OBJECT, ARRAY]) = (r37 I:??[OBJECT, ARRAY]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 37, insn: 0x0d81: MOVE (r12 I:??[OBJECT, ARRAY]) = (r37 I:??[OBJECT, ARRAY]), block:B:83:0x0d77 */
    /* JADX WARN: Not initialized variable reg: 37, insn: 0x0fe0: MOVE (r36 I:??[OBJECT, ARRAY]) = (r37 I:??[OBJECT, ARRAY]), block:B:98:0x0fd2 */
    /* JADX WARN: Not initialized variable reg: 38, insn: 0x02c5: MOVE (r12 I:??[OBJECT, ARRAY]) = (r38 I:??[OBJECT, ARRAY]), block:B:22:0x02ba */
    /* JADX WARN: Not initialized variable reg: 38, insn: 0x0929: MOVE (r41 I:??[OBJECT, ARRAY]) = (r38 I:??[OBJECT, ARRAY]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 38, insn: 0x0da5: MOVE (r11 I:??[OBJECT, ARRAY]) = (r38 I:??[OBJECT, ARRAY]), block:B:84:0x0d83 */
    /* JADX WARN: Not initialized variable reg: 39, insn: 0x02e1: MOVE (r35 I:??[OBJECT, ARRAY]) = (r39 I:??[OBJECT, ARRAY]), block:B:22:0x02ba */
    /* JADX WARN: Not initialized variable reg: 39, insn: 0x08fe: MOVE (r8 I:??[OBJECT, ARRAY]) = (r39 I:??[OBJECT, ARRAY]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 39, insn: 0x0d83: MOVE (r10 I:??[OBJECT, ARRAY]) = (r39 I:??[OBJECT, ARRAY]), block:B:84:0x0d83 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0d94: MOVE (r39 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:84:0x0d83 */
    /* JADX WARN: Not initialized variable reg: 40, insn: 0x02ec: MOVE (r36 I:??[OBJECT, ARRAY]) = (r40 I:??[OBJECT, ARRAY]), block:B:22:0x02ba */
    /* JADX WARN: Not initialized variable reg: 40, insn: 0x0900: MOVE (r15 I:??[OBJECT, ARRAY]) = (r40 I:??[OBJECT, ARRAY]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 40, insn: 0x0d85: MOVE (r7 I:??[OBJECT, ARRAY]) = (r40 I:??[OBJECT, ARRAY]), block:B:84:0x0d83 */
    /* JADX WARN: Not initialized variable reg: 41, insn: 0x01e9: MOVE (r15 I:??[OBJECT, ARRAY]) = (r41 I:??[OBJECT, ARRAY]), block:B:15:0x01e9 */
    /* JADX WARN: Not initialized variable reg: 41, insn: 0x02c7: MOVE (r11 I:??[OBJECT, ARRAY]) = (r41 I:??[OBJECT, ARRAY]), block:B:22:0x02ba */
    /* JADX WARN: Not initialized variable reg: 41, insn: 0x0924: MOVE (r12 I:??[OBJECT, ARRAY]) = (r41 I:??[OBJECT, ARRAY]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 42, insn: 0x02c9: MOVE (r10 I:??[OBJECT, ARRAY]) = (r42 I:??[OBJECT, ARRAY]), block:B:22:0x02ba */
    /* JADX WARN: Not initialized variable reg: 42, insn: 0x091a: MOVE (r35 I:??[OBJECT, ARRAY]) = (r42 I:??[OBJECT, ARRAY]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 43, insn: 0x02cb: MOVE (r7 I:??[OBJECT, ARRAY]) = (r43 I:??[OBJECT, ARRAY]), block:B:22:0x02ba */
    /* JADX WARN: Not initialized variable reg: 43, insn: 0x091c: MOVE (r36 I:??[OBJECT, ARRAY]) = (r43 I:??[OBJECT, ARRAY]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 44, insn: 0x0902: MOVE (r11 I:??[OBJECT, ARRAY]) = (r44 I:??[OBJECT, ARRAY]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 45, insn: 0x091e: MOVE (r10 I:??[OBJECT, ARRAY]) = (r45 I:??[OBJECT, ARRAY]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 46, insn: 0x0904: MOVE (r7 I:??[OBJECT, ARRAY]) = (r46 I:??[OBJECT, ARRAY]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x02d9: MOVE (r37 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:22:0x02ba */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0912: MOVE (r37 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:57:0x08f5 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0d96: MOVE (r37 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:84:0x0d83 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:1102:0x2aa9 -> B:2758:0x2050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:1220:0x2d38 -> B:2758:0x2050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:1522:0x345a -> B:2758:0x2050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:2151:0x42f6 -> B:2758:0x2050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:2248:0x45a0 -> B:2758:0x2050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:2302:0x4742 -> B:2758:0x2050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:2520:0x5063 -> B:8:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:475:0x1b9e -> B:3042:0x1ab6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:748:0x2266 -> B:2758:0x2050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.vd1
    public final java.lang.Object invokeSuspend(java.lang.Object r146) {
        /*
            Method dump skipped, instruction units count: 20704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
