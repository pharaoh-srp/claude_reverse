package com.anthropic.claude.chat;

import android.content.Context;
import com.anthropic.claude.analytics.events.ChatEvents$RetryCompletionReason;
import com.anthropic.claude.api.chat.ChatCompletionRequest;
import com.anthropic.claude.api.chat.CreateChatRequest;
import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.chat.input.draft.QueuedSendRequest;
import com.anthropic.claude.chat.queue.QueuedMessageWorker;
import com.anthropic.claude.configs.flags.MessageQueueConfig;
import com.anthropic.claude.configs.flags.SendRetryConfig;
import defpackage.c69;
import defpackage.d4c;
import defpackage.dae;
import defpackage.hi6;
import defpackage.iei;
import defpackage.koi;
import defpackage.l45;
import defpackage.lf9;
import defpackage.lz1;
import defpackage.poj;
import defpackage.pz7;
import defpackage.t53;
import defpackage.tp4;
import defpackage.uh6;
import defpackage.uhd;
import defpackage.v03;
import defpackage.xzg;
import defpackage.z9e;
import defpackage.zh6;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends xzg implements pz7 {
    public z9e E;
    public dae F;
    public poj G;
    public uhd H;
    public dae I;
    public dae J;
    public ChatCompletionRequest K;
    public hi6 L;
    public lf9 M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public /* synthetic */ Object V;
    public final /* synthetic */ lf9 W;
    public final /* synthetic */ t53 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ List a0;
    public final /* synthetic */ List b0;
    public final /* synthetic */ InputMode c0;
    public final /* synthetic */ String d0;
    public final /* synthetic */ ChatEvents$RetryCompletionReason e0;
    public final /* synthetic */ String f0;
    public final /* synthetic */ boolean g0;
    public final /* synthetic */ CreateChatRequest h0;
    public final /* synthetic */ MessageQueueConfig i0;
    public final /* synthetic */ SendRetryConfig j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(lf9 lf9Var, t53 t53Var, boolean z, String str, List list, List list2, InputMode inputMode, String str2, ChatEvents$RetryCompletionReason chatEvents$RetryCompletionReason, String str3, boolean z2, CreateChatRequest createChatRequest, MessageQueueConfig messageQueueConfig, SendRetryConfig sendRetryConfig, tp4 tp4Var) {
        super(2, tp4Var);
        this.W = lf9Var;
        this.X = t53Var;
        this.Y = z;
        this.Z = str;
        this.a0 = list;
        this.b0 = list2;
        this.c0 = inputMode;
        this.d0 = str2;
        this.e0 = chatEvents$RetryCompletionReason;
        this.f0 = str3;
        this.g0 = z2;
        this.h0 = createChatRequest;
        this.i0 = messageQueueConfig;
        this.j0 = sendRetryConfig;
    }

    public static final Object d(t53 t53Var, ChatCompletionRequest chatCompletionRequest, boolean z, boolean z2, uhd uhdVar, List list, String str, MessageQueueConfig messageQueueConfig, xzg xzgVar) {
        c69 c69VarP;
        c69 c69Var;
        t53Var.A1(v03.a);
        c69 c69VarE = t53Var.g.e();
        Context context = t53Var.c;
        String str2 = t53Var.L0;
        koi koiVar = t53Var.d;
        String str3 = koiVar.d;
        String str4 = koiVar.e;
        long jM728getTtlUwyO8pc = messageQueueConfig.m728getTtlUwyO8pc();
        c69VarE.getClass();
        lz1 lz1Var = uh6.F;
        long jO = uh6.o(jM728getTtlUwyO8pc, zh6.SECONDS);
        int i = uh6.i(jM728getTtlUwyO8pc);
        if (jO == 0 && i == 0) {
            c69Var = c69VarE;
        } else {
            long j = c69VarE.E;
            long j2 = j + jO;
            if ((j ^ j2) >= 0 || (jO ^ j) < 0) {
                int i2 = c69VarE.F + i;
                c69 c69Var2 = c69.G;
                c69VarP = d4c.P(i2, j2);
            } else {
                c69VarP = jM728getTtlUwyO8pc > 0 ? c69.H : c69.G;
            }
            c69Var = c69VarP;
        }
        QueuedMessageWorker.Args args = new QueuedMessageWorker.Args(str2, str3, str4, c69Var, null);
        String str5 = null;
        if (!z && !z2 && uhdVar != null) {
            str5 = uhdVar.a;
        }
        return QueuedMessageWorker.j.c(context, args, new QueuedSendRequest(chatCompletionRequest, str5, koiVar.d, koiVar.e, c69VarE, messageQueueConfig.m728getTtlUwyO8pc(), list, str, null), t53Var.e0, messageQueueConfig.getMax_active(), xzgVar);
    }

    public static final void n(t53 t53Var, dae daeVar, dae daeVar2, boolean z) {
        if (t53.S(t53Var, (String) daeVar.E, (String) daeVar2.E, z)) {
            t53.c0(t53Var);
        }
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        b bVar = new b(this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, tp4Var);
        bVar.V = obj;
        return bVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x015d, code lost:
    
        if (r0 == r13) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0171, code lost:
    
        if (r0 == r13) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x049d A[PHI: r0
      0x049d: PHI (r0v101 java.lang.String) = (r0v40 java.lang.String), (r0v41 java.lang.String), (r0v46 java.lang.String) binds: [B:112:0x049b, B:130:0x04c9, B:123:0x04b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0556 A[LOOP:3: B:153:0x0550->B:155:0x0556, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x067e A[Catch: all -> 0x0624, Exception -> 0x0629, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0624, blocks: (B:167:0x060f, B:169:0x061d, B:179:0x067e, B:193:0x06d2), top: B:379:0x060f }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x09f2 A[Catch: all -> 0x08b4, TryCatch #11 {all -> 0x08b4, blocks: (B:290:0x09ee, B:292:0x09f2, B:295:0x09ff, B:297:0x0a03, B:306:0x0a1a, B:165:0x05fb, B:177:0x0657, B:182:0x068a, B:184:0x0690, B:186:0x06b3, B:188:0x06b9, B:190:0x06c1, B:191:0x06c4, B:197:0x070b, B:199:0x0728, B:201:0x0731, B:203:0x0742, B:204:0x0745, B:206:0x076b, B:207:0x0783, B:209:0x07cc, B:211:0x07d2), top: B:396:0x05fb }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0a8a A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #9 {all -> 0x0070, blocks: (B:9:0x005c, B:14:0x008f, B:315:0x0a82, B:317:0x0a8a), top: B:393:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0abd A[Catch: all -> 0x0ac3, TRY_LEAVE, TryCatch #20 {all -> 0x0ac3, blocks: (B:322:0x0ab4, B:324:0x0abd), top: B:411:0x0ab4 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0ad7  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0bc8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0c2d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x060f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:445:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d8  */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r16v36 */
    /* JADX WARN: Type inference failed for: r18v5, types: [lf9] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5, types: [lf9] */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r1v39, types: [ozf] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v64, types: [int] */
    /* JADX WARN: Type inference failed for: r1v65, types: [lf9] */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v20 */
    /* JADX WARN: Type inference failed for: r21v21 */
    /* JADX WARN: Type inference failed for: r21v22 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r28v0, types: [fkg] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v13 */
    /* JADX WARN: Type inference failed for: r28v14 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v77, types: [int] */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r6v61, types: [fkg, lf9] */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v70, types: [lf9] */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v76 */
    /* JADX WARN: Type inference failed for: r6v79 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r7v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v77 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r8v70 */
    /* JADX WARN: Type inference failed for: r9v1, types: [ozf] */
    /* JADX WARN: Type inference failed for: r9v2, types: [lf9] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v75 */
    /* JADX WARN: Type inference failed for: r9v79 */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r92) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
