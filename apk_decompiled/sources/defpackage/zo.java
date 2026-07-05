package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$UploadSource;
import com.anthropic.claude.bell.tts.d;
import com.anthropic.claude.bell.tts.f;
import com.anthropic.claude.chat.input.files.a;
import com.anthropic.claude.conway.protocol.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class zo extends xzg implements pz7 {
    public final /* synthetic */ int E = 4;
    public int F;
    public /* synthetic */ Object G;
    public Object H;
    public Object I;
    public Object J;
    public Object K;
    public Object L;
    public Object M;
    public Object N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(sm2 sm2Var, kie kieVar, d7 d7Var, a33 a33Var, nn nnVar, bo boVar, bo boVar2, zy7 zy7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = sm2Var;
        this.I = kieVar;
        this.J = d7Var;
        this.K = a33Var;
        this.L = nnVar;
        this.M = boVar;
        this.N = boVar2;
        this.O = zy7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.O;
        switch (i) {
            case 0:
                zo zoVar = new zo((ep) obj2, tp4Var);
                zoVar.G = obj;
                return zoVar;
            case 1:
                zo zoVar2 = new zo((sm2) this.H, (kie) this.I, (d7) this.J, (a33) this.K, (nn) this.L, (bo) this.M, (bo) this.N, (zy7) obj2, tp4Var);
                zoVar2.G = obj;
                return zoVar2;
            case 2:
                return new zo((a) this.I, (String) this.J, (String) this.K, (tw2) this.L, (ChatEvents$UploadSource) this.M, (bz7) this.N, (sw2) this.G, (pz7) obj2, tp4Var);
            case 3:
                zo zoVar3 = new zo((b0) this.I, (dae) this.K, (String) this.L, (f8) this.M, (bae) this.N, (lqa) obj2, (z9e) this.J, tp4Var);
                zoVar3.G = obj;
                return zoVar3;
            default:
                zo zoVar4 = new zo((f) this.I, (d6d) this.J, (bz7) this.K, (i2h) this.L, (d) this.M, (o2h) this.N, (u3e) obj2, tp4Var);
                zoVar4.G = obj;
                return zoVar4;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((zo) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x025b, code lost:
    
        if (r2 == r11) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0286, code lost:
    
        if (com.anthropic.claude.chat.input.files.a.l(r1, r2, r3, r5, r5, r8, r7, r8) == r11) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02d6, code lost:
    
        if (defpackage.gb9.c0(r2, r14, r6) != r11) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x020a, code lost:
    
        if (r2 == r11) goto L147;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x01f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c4  */
    /* JADX WARN: Type inference failed for: r15v23, types: [com.anthropic.claude.chat.input.files.a] */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30, types: [com.anthropic.claude.chat.input.files.a] */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41, types: [sw2, ww2] */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32, types: [sw2, ww2] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v44, types: [com.anthropic.claude.chat.input.files.a] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49, types: [com.anthropic.claude.chat.input.files.a] */
    /* JADX WARN: Type inference failed for: r1v54, types: [com.anthropic.claude.chat.input.files.a] */
    /* JADX WARN: Type inference failed for: r1v55, types: [com.anthropic.claude.chat.input.files.a] */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r4v14, types: [sw2] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x046f -> B:193:0x0476). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(ep epVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.O = epVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(f fVar, d6d d6dVar, bz7 bz7Var, i2h i2hVar, d dVar, o2h o2hVar, u3e u3eVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = fVar;
        this.J = d6dVar;
        this.K = bz7Var;
        this.L = i2hVar;
        this.M = dVar;
        this.N = o2hVar;
        this.O = u3eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(a aVar, String str, String str2, tw2 tw2Var, ChatEvents$UploadSource chatEvents$UploadSource, bz7 bz7Var, sw2 sw2Var, pz7 pz7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = aVar;
        this.J = str;
        this.K = str2;
        this.L = tw2Var;
        this.M = chatEvents$UploadSource;
        this.N = bz7Var;
        this.G = sw2Var;
        this.O = pz7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(b0 b0Var, dae daeVar, String str, f8 f8Var, bae baeVar, lqa lqaVar, z9e z9eVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = b0Var;
        this.K = daeVar;
        this.L = str;
        this.M = f8Var;
        this.N = baeVar;
        this.O = lqaVar;
        this.J = z9eVar;
    }
}
