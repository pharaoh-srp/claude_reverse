package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$ConversationLoadSource;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class am2 extends xzg implements pz7 {
    public int E;
    public int F;
    public int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ em2 I;
    public final /* synthetic */ long J;
    public final /* synthetic */ List K;
    public final /* synthetic */ String L;
    public final /* synthetic */ ChatEvents$ConversationLoadSource M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am2(int i, em2 em2Var, long j, List list, String str, ChatEvents$ConversationLoadSource chatEvents$ConversationLoadSource, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = i;
        this.I = em2Var;
        this.J = j;
        this.K = list;
        this.L = str;
        this.M = chatEvents$ConversationLoadSource;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new am2(this.H, this.I, this.J, this.K, this.L, this.M, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((am2) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.G
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            int r6 = r0.H
            iei r7 = defpackage.iei.a
            em2 r8 = r0.I
            m45 r9 = defpackage.m45.E
            if (r1 == 0) goto L33
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1c
            defpackage.sf5.h0(r19)
            return r7
        L1c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r2
        L22:
            int r1 = r0.F
            int r2 = r0.E
            defpackage.sf5.h0(r19)
            r4 = r19
        L2b:
            r15 = r1
            goto L77
        L2d:
            defpackage.sf5.h0(r19)
            r1 = r19
            goto L46
        L33:
            defpackage.sf5.h0(r19)
            long r10 = defpackage.hm2.b
            e41 r1 = new e41
            r1.<init>(r8, r6, r2, r5)
            r0.G = r5
            java.lang.Object r1 = defpackage.iuj.R(r10, r1, r0)
            if (r1 != r9) goto L46
            goto La5
        L46:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L50
            boolean r1 = r1.booleanValue()
        L4e:
            r2 = r1
            goto L52
        L50:
            r1 = 0
            goto L4e
        L52:
            if (r2 != 0) goto L55
            goto La6
        L55:
            int r1 = r8.B
            if (r6 != r1) goto L5a
            goto La6
        L5a:
            r8.B = r6
            mn5 r1 = r8.d
            long r10 = r1.a()
            long r12 = r0.J
            long r10 = r10 - r12
            int r1 = (int) r10
            md9 r5 = r8.f
            ad9 r10 = defpackage.rx2.b
            r0.E = r2
            r0.F = r1
            r0.G = r4
            java.lang.Object r4 = r5.a(r10, r0)
            if (r4 != r9) goto L2b
            goto La5
        L77:
            r16 = r4
            zc9 r16 = (defpackage.zc9) r16
            isc r1 = r8.u
            int r1 = r1.h()
            if (r1 == r6) goto L84
            goto La6
        L84:
            h86 r1 = r8.g
            e45 r1 = r1.getDefault()
            tm r10 = new tm
            com.anthropic.claude.analytics.events.ChatEvents$ConversationLoadSource r14 = r0.M
            r17 = 0
            java.util.List r11 = r0.K
            em2 r12 = r0.I
            java.lang.String r13 = r0.L
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r0.E = r2
            r0.F = r15
            r0.G = r3
            java.lang.Object r0 = defpackage.gb9.c0(r1, r10, r0)
            if (r0 != r9) goto La6
        La5:
            return r9
        La6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
