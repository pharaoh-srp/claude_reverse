package defpackage;

import com.anthropic.claude.api.tasks.TaskSessionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class e9h {
    public final x5h a;
    public final kdg b = new kdg();
    public final lsc c = mpk.P(c9h.E);
    public String d;

    public e9h(x5h x5hVar) {
        this.a = x5hVar;
    }

    public final String a(TaskSessionEvent taskSessionEvent) {
        String id = taskSessionEvent.getId();
        return id == null ? grc.p(this.b.size(), "idx-") : id;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (defpackage.d4c.L(r8, r0) == r7) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (defpackage.knk.B(r0.getContext()) == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a8 -> B:13:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, java.lang.String r13, defpackage.uh6 r14, defpackage.vp4 r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.d9h
            if (r0 == 0) goto L13
            r0 = r15
            d9h r0 = (defpackage.d9h) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            d9h r0 = new d9h
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.H
            int r1 = r0.J
            lsc r2 = r11.c
            r3 = 0
            r4 = 2
            r5 = 1
            iei r6 = defpackage.iei.a
            m45 r7 = defpackage.m45.E
            if (r1 == 0) goto L49
            if (r1 == r5) goto L3f
            if (r1 != r4) goto L39
            uh6 r12 = r0.G
            java.lang.String r13 = r0.F
            java.lang.String r14 = r0.E
            defpackage.sf5.h0(r15)
        L34:
            r10 = r14
            r14 = r12
            r12 = r10
            goto Lab
        L39:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            return r3
        L3f:
            uh6 r12 = r0.G
            java.lang.String r13 = r0.F
            java.lang.String r14 = r0.E
            defpackage.sf5.h0(r15)
            goto L89
        L49:
            defpackage.sf5.h0(r15)
            kdg r15 = r11.b
            r15.clear()
            r11.d = r3
            c9h r15 = defpackage.c9h.E
            r2.setValue(r15)
        L58:
            java.lang.String r15 = r11.d
            if (r15 != 0) goto L5e
            java.lang.String r15 = "0"
        L5e:
            x5h r1 = r11.a
            w5h r15 = r1.a(r12, r13, r15)
            n23 r1 = new n23
            r8 = 6
            r1.<init>(r12, r13, r3, r8)
            yp7 r8 = new yp7
            r9 = 0
            r8.<init>(r15, r1, r9)
            i7 r15 = new i7
            r1 = 22
            r15.<init>(r1, r11)
            r0.E = r12
            r0.F = r13
            r0.G = r14
            r0.J = r5
            java.lang.Object r15 = r8.a(r15, r0)
            if (r15 != r7) goto L86
            goto Laa
        L86:
            r10 = r14
            r14 = r12
            r12 = r10
        L89:
            java.lang.Object r15 = r2.getValue()
            c9h r15 = (defpackage.c9h) r15
            c9h r1 = defpackage.c9h.G
            if (r15 != r1) goto L94
            goto Lb5
        L94:
            if (r12 != 0) goto L9a
            r2.setValue(r1)
            return r6
        L9a:
            long r8 = r12.E
            r0.E = r14
            r0.F = r13
            r0.G = r12
            r0.J = r4
            java.lang.Object r15 = defpackage.d4c.L(r8, r0)
            if (r15 != r7) goto L34
        Laa:
            return r7
        Lab:
            c45 r15 = r0.getContext()
            boolean r15 = defpackage.knk.B(r15)
            if (r15 != 0) goto L58
        Lb5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9h.b(java.lang.String, java.lang.String, uh6, vp4):java.lang.Object");
    }
}
