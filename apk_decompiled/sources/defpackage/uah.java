package defpackage;

import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.types.strings.TaskId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uah implements kah {
    public final n9h b;
    public final koi c;
    public final f8h d;
    public final fj0 e = new fj0(wl0.P, new sz6(21));
    public final mdg f = new mdg();
    public final lsc g = mpk.P(Boolean.FALSE);
    public final wz5 h;

    public uah(n9h n9hVar, koi koiVar, f8h f8hVar) {
        this.b = n9hVar;
        this.c = koiVar;
        this.d = f8hVar;
        final int i = 0;
        this.h = mpk.w(new zy7(this) { // from class: lah
            public final /* synthetic */ uah F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                uah uahVar = this.F;
                switch (i2) {
                    case 0:
                        return w44.i1(uahVar.e.y(), new iec(8));
                    default:
                        List listH = uahVar.h();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listH) {
                            if (((TaskResponse) obj).getStatus().isActive()) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                }
            }
        });
        final int i2 = 1;
        mpk.w(new zy7(this) { // from class: lah
            public final /* synthetic */ uah F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                uah uahVar = this.F;
                switch (i22) {
                    case 0:
                        return w44.i1(uahVar.e.y(), new iec(8));
                    default:
                        List listH = uahVar.h();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listH) {
                            if (((TaskResponse) obj).getStatus().isActive()) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                }
            }
        });
    }

    public static final void b(uah uahVar, TaskResponse taskResponse) {
        uahVar.f.remove(TaskId.m1128boximpl(taskResponse.m450getUuidFxcw9s()));
        uahVar.e.S(taskResponse);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, com.anthropic.claude.api.tasks.ApproveTaskAgentOverrides r6, defpackage.vp4 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.mah
            if (r0 == 0) goto L13
            r0 = r7
            mah r0 = (defpackage.mah) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            mah r0 = new mah
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.H
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            java.lang.String r5 = r0.E
            defpackage.sf5.h0(r7)
            goto L53
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2e:
            defpackage.sf5.h0(r7)
            koi r7 = r4.c
            java.lang.String r7 = r7.e
            if (r6 == 0) goto L3e
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L3e
            goto L3f
        L3e:
            r6 = r3
        L3f:
            com.anthropic.claude.api.tasks.ApproveTaskRequest r1 = new com.anthropic.claude.api.tasks.ApproveTaskRequest
            r1.<init>(r6)
            r0.E = r5
            r0.H = r2
            n9h r6 = r4.b
            java.lang.Object r7 = r6.j(r7, r5, r1, r0)
            m45 r6 = defpackage.m45.E
            if (r7 != r6) goto L53
            return r6
        L53:
            com.anthropic.claude.api.result.ApiResult r7 = (com.anthropic.claude.api.result.ApiResult) r7
            boolean r6 = r7 instanceof defpackage.of0
            if (r6 == 0) goto L64
            r0 = r7
            of0 r0 = (defpackage.of0) r0
            java.lang.Object r0 = r0.b
            com.anthropic.claude.api.tasks.TaskResponse r0 = (com.anthropic.claude.api.tasks.TaskResponse) r0
            b(r4, r0)
            goto L68
        L64:
            boolean r4 = r7 instanceof defpackage.nf0
            if (r4 == 0) goto L9b
        L68:
            if (r6 != 0) goto L9a
            boolean r4 = r7 instanceof defpackage.nf0
            if (r4 == 0) goto L96
            r4 = r7
            nf0 r4 = (defpackage.nf0) r4
            com.anthropic.claude.core.telemetry.SilentException r6 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r5 = com.anthropic.claude.types.strings.TaskId.m1133toStringimpl(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to approve task "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = ": "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r6.<init>(r4)
            r4 = 0
            r5 = 3
            com.anthropic.claude.core.telemetry.SilentException.a(r6, r3, r4, r5)
            return r7
        L96:
            defpackage.mr9.b()
            return r3
        L9a:
            return r7
        L9b:
            defpackage.mr9.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uah.c(java.lang.String, com.anthropic.claude.api.tasks.ApproveTaskAgentOverrides, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r6, defpackage.vp4 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.nah
            if (r0 == 0) goto L13
            r0 = r7
            nah r0 = (defpackage.nah) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            nah r0 = new nah
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            java.lang.String r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L44
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r2
        L2e:
            defpackage.sf5.h0(r7)
            koi r7 = r5.c
            java.lang.String r7 = r7.e
            r0.E = r6
            r0.H = r3
            n9h r1 = r5.b
            java.lang.Object r7 = r1.c(r7, r6, r0)
            m45 r0 = defpackage.m45.E
            if (r7 != r0) goto L44
            return r0
        L44:
            com.anthropic.claude.api.result.ApiResult r7 = (com.anthropic.claude.api.result.ApiResult) r7
            boolean r0 = r7 instanceof defpackage.lf0
            fj0 r1 = r5.e
            iei r3 = defpackage.iei.a
            mdg r5 = r5.f
            if (r0 == 0) goto L71
            r0 = r7
            lf0 r0 = (defpackage.lf0) r0
            int r0 = r0.a()
            r4 = 404(0x194, float:5.66E-43)
            if (r0 != r4) goto L71
            com.anthropic.claude.types.strings.TaskId r7 = com.anthropic.claude.types.strings.TaskId.m1128boximpl(r6)
            r5.put(r7, r3)
            com.anthropic.claude.types.strings.TaskId r5 = com.anthropic.claude.types.strings.TaskId.m1128boximpl(r6)
            r1.D(r5)
            of0 r5 = new of0
            r6 = 204(0xcc, float:2.86E-43)
            r5.<init>(r6, r3)
            return r5
        L71:
            boolean r0 = r7 instanceof defpackage.of0
            if (r0 == 0) goto L8b
            r4 = r7
            of0 r4 = (defpackage.of0) r4
            java.lang.Object r4 = r4.b
            iei r4 = (defpackage.iei) r4
            com.anthropic.claude.types.strings.TaskId r4 = com.anthropic.claude.types.strings.TaskId.m1128boximpl(r6)
            r5.put(r4, r3)
            com.anthropic.claude.types.strings.TaskId r5 = com.anthropic.claude.types.strings.TaskId.m1128boximpl(r6)
            r1.D(r5)
            goto L8f
        L8b:
            boolean r5 = r7 instanceof defpackage.nf0
            if (r5 == 0) goto Lc2
        L8f:
            if (r0 != 0) goto Lc1
            boolean r5 = r7 instanceof defpackage.nf0
            if (r5 == 0) goto Lbd
            r5 = r7
            nf0 r5 = (defpackage.nf0) r5
            com.anthropic.claude.core.telemetry.SilentException r0 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r6 = com.anthropic.claude.types.strings.TaskId.m1133toStringimpl(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to delete task "
            r1.<init>(r3)
            r1.append(r6)
            java.lang.String r6 = ": "
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            r5 = 0
            r6 = 3
            com.anthropic.claude.core.telemetry.SilentException.a(r0, r2, r5, r6)
            return r7
        Lbd:
            defpackage.mr9.b()
            return r2
        Lc1:
            return r7
        Lc2:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uah.d(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9 A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #0 {all -> 0x002d, blocks: (B:12:0x0027, B:23:0x0064, B:27:0x006e, B:28:0x0077, B:29:0x0088, B:31:0x008e, B:32:0x00a2, B:34:0x00b6, B:19:0x0040, B:38:0x00c9, B:40:0x00cd, B:43:0x00f3, B:44:0x00f8), top: B:47:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0061 -> B:23:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r14, defpackage.vp4 r15) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uah.e(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.pah
            if (r0 == 0) goto L13
            r0 = r6
            pah r0 = (defpackage.pah) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            pah r0 = new pah
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            java.lang.String r5 = r0.E
            defpackage.sf5.h0(r6)
            goto L44
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2e:
            defpackage.sf5.h0(r6)
            koi r6 = r4.c
            java.lang.String r6 = r6.e
            r0.E = r5
            r0.H = r3
            n9h r1 = r4.b
            java.lang.Object r6 = r1.i(r6, r5, r0)
            m45 r0 = defpackage.m45.E
            if (r6 != r0) goto L44
            return r0
        L44:
            com.anthropic.claude.api.result.ApiResult r6 = (com.anthropic.claude.api.result.ApiResult) r6
            boolean r0 = r6 instanceof defpackage.of0
            if (r0 == 0) goto L55
            r1 = r6
            of0 r1 = (defpackage.of0) r1
            java.lang.Object r1 = r1.b
            com.anthropic.claude.api.tasks.TaskResponse r1 = (com.anthropic.claude.api.tasks.TaskResponse) r1
            b(r4, r1)
            goto L59
        L55:
            boolean r1 = r6 instanceof defpackage.nf0
            if (r1 == 0) goto Lb0
        L59:
            if (r0 != 0) goto Laf
            boolean r0 = r6 instanceof defpackage.nf0
            if (r0 == 0) goto Lab
            r0 = r6
            nf0 r0 = (defpackage.nf0) r0
            boolean r1 = r0 instanceof defpackage.lf0
            if (r1 == 0) goto L86
            r1 = r0
            lf0 r1 = (defpackage.lf0) r1
            int r1 = r1.a()
            r3 = 404(0x194, float:5.66E-43)
            if (r1 != r3) goto L86
            com.anthropic.claude.types.strings.TaskId r0 = com.anthropic.claude.types.strings.TaskId.m1128boximpl(r5)
            iei r1 = defpackage.iei.a
            mdg r2 = r4.f
            r2.put(r0, r1)
            fj0 r4 = r4.e
            com.anthropic.claude.types.strings.TaskId r5 = com.anthropic.claude.types.strings.TaskId.m1128boximpl(r5)
            r4.D(r5)
            return r6
        L86:
            com.anthropic.claude.core.telemetry.SilentException r4 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r5 = com.anthropic.claude.types.strings.TaskId.m1133toStringimpl(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to fetch task "
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r5 = ": "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            r4.<init>(r5)
            r5 = 0
            r0 = 3
            com.anthropic.claude.core.telemetry.SilentException.a(r4, r2, r5, r0)
            return r6
        Lab:
            defpackage.mr9.b()
            return r2
        Laf:
            return r6
        Lb0:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uah.f(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Integer r11, java.lang.Integer r12, defpackage.vp4 r13) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uah.g(java.lang.Integer, java.lang.Integer, vp4):java.lang.Object");
    }

    public final List h() {
        return (List) this.h.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r10, java.lang.Integer r11, java.lang.String r12, java.lang.String r13, defpackage.vp4 r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof defpackage.rah
            if (r0 == 0) goto L14
            r0 = r14
            rah r0 = (defpackage.rah) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.H = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            rah r0 = new rah
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.F
            int r0 = r7.H
            r1 = 1
            r8 = 0
            if (r0 == 0) goto L30
            if (r0 != r1) goto L2a
            java.lang.String r10 = r7.E
            defpackage.sf5.h0(r14)
            goto L4b
        L2a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r8
        L30:
            defpackage.sf5.h0(r14)
            koi r14 = r9.c
            java.lang.String r2 = r14.e
            r7.E = r10
            r7.H = r1
            n9h r1 = r9.b
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r14 = r1.f(r2, r3, r4, r5, r6, r7)
            m45 r9 = defpackage.m45.E
            if (r14 != r9) goto L4a
            return r9
        L4a:
            r10 = r3
        L4b:
            com.anthropic.claude.api.result.ApiResult r14 = (com.anthropic.claude.api.result.ApiResult) r14
            boolean r9 = r14 instanceof defpackage.of0
            if (r9 != 0) goto L81
            boolean r9 = r14 instanceof defpackage.nf0
            if (r9 == 0) goto L7d
            r9 = r14
            nf0 r9 = (defpackage.nf0) r9
            com.anthropic.claude.core.telemetry.SilentException r11 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r10 = com.anthropic.claude.types.strings.TaskId.m1133toStringimpl(r10)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Failed to list events for task "
            r12.<init>(r13)
            r12.append(r10)
            java.lang.String r10 = ": "
            r12.append(r10)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9)
            r9 = 0
            r10 = 3
            com.anthropic.claude.core.telemetry.SilentException.a(r11, r8, r9, r10)
            return r14
        L7d:
            defpackage.mr9.b()
            return r8
        L81:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uah.i(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.sah
            if (r0 == 0) goto L13
            r0 = r6
            sah r0 = (defpackage.sah) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            sah r0 = new sah
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            java.lang.String r5 = r0.E
            defpackage.sf5.h0(r6)
            goto L44
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2e:
            defpackage.sf5.h0(r6)
            koi r6 = r4.c
            java.lang.String r6 = r6.e
            r0.E = r5
            r0.H = r3
            n9h r1 = r4.b
            java.lang.Object r6 = r1.e(r6, r5, r0)
            m45 r0 = defpackage.m45.E
            if (r6 != r0) goto L44
            return r0
        L44:
            com.anthropic.claude.api.result.ApiResult r6 = (com.anthropic.claude.api.result.ApiResult) r6
            boolean r0 = r6 instanceof defpackage.of0
            if (r0 == 0) goto L55
            r1 = r6
            of0 r1 = (defpackage.of0) r1
            java.lang.Object r1 = r1.b
            com.anthropic.claude.api.tasks.TaskResponse r1 = (com.anthropic.claude.api.tasks.TaskResponse) r1
            b(r4, r1)
            goto L59
        L55:
            boolean r4 = r6 instanceof defpackage.nf0
            if (r4 == 0) goto L8c
        L59:
            if (r0 != 0) goto L8b
            boolean r4 = r6 instanceof defpackage.nf0
            if (r4 == 0) goto L87
            r4 = r6
            nf0 r4 = (defpackage.nf0) r4
            com.anthropic.claude.core.telemetry.SilentException r0 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r5 = com.anthropic.claude.types.strings.TaskId.m1133toStringimpl(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to reject task "
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r5 = ": "
            r1.append(r5)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            r4 = 0
            r5 = 3
            com.anthropic.claude.core.telemetry.SilentException.a(r0, r2, r4, r5)
            return r6
        L87:
            defpackage.mr9.b()
            return r2
        L8b:
            return r6
        L8c:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uah.j(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r6, java.lang.String r7, defpackage.vp4 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.tah
            if (r0 == 0) goto L13
            r0 = r8
            tah r0 = (defpackage.tah) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            tah r0 = new tah
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.F
            int r1 = r0.H
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            java.lang.String r6 = r0.E
            defpackage.sf5.h0(r8)
            goto L49
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r3
        L2e:
            defpackage.sf5.h0(r8)
            koi r8 = r5.c
            java.lang.String r8 = r8.e
            com.anthropic.claude.api.tasks.SendTaskMessageRequest r1 = new com.anthropic.claude.api.tasks.SendTaskMessageRequest
            r1.<init>(r7)
            r0.E = r6
            r0.H = r2
            n9h r5 = r5.b
            java.lang.Object r8 = r5.d(r8, r6, r1, r0)
            m45 r5 = defpackage.m45.E
            if (r8 != r5) goto L49
            return r5
        L49:
            com.anthropic.claude.api.result.ApiResult r8 = (com.anthropic.claude.api.result.ApiResult) r8
            boolean r5 = r8 instanceof defpackage.of0
            r7 = 3
            r0 = 0
            if (r5 == 0) goto L71
            r1 = r8
            of0 r1 = (defpackage.of0) r1
            java.lang.Object r1 = r1.b
            com.anthropic.claude.api.tasks.SendTaskMessageResponse r1 = (com.anthropic.claude.api.tasks.SendTaskMessageResponse) r1
            boolean r1 = r1.getOk()
            if (r1 != 0) goto L75
            com.anthropic.claude.core.telemetry.SilentException r1 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r2 = com.anthropic.claude.types.strings.TaskId.m1133toStringimpl(r6)
            java.lang.String r4 = "sendMessage returned ok=false for task "
            java.lang.String r2 = defpackage.ij0.i(r4, r2)
            r1.<init>(r2)
            com.anthropic.claude.core.telemetry.SilentException.a(r1, r3, r0, r7)
            goto L75
        L71:
            boolean r1 = r8 instanceof defpackage.nf0
            if (r1 == 0) goto La6
        L75:
            if (r5 != 0) goto La5
            boolean r5 = r8 instanceof defpackage.nf0
            if (r5 == 0) goto La1
            r5 = r8
            nf0 r5 = (defpackage.nf0) r5
            com.anthropic.claude.core.telemetry.SilentException r1 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r6 = com.anthropic.claude.types.strings.TaskId.m1133toStringimpl(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to send message to task "
            r2.<init>(r4)
            r2.append(r6)
            java.lang.String r6 = ": "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            com.anthropic.claude.core.telemetry.SilentException.a(r1, r3, r0, r7)
            return r8
        La1:
            defpackage.mr9.b()
            return r3
        La5:
            return r8
        La6:
            defpackage.mr9.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uah.k(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    public final void l(boolean z) {
        this.g.setValue(Boolean.valueOf(z));
    }
}
