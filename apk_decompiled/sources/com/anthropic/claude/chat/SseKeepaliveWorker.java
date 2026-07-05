package com.anthropic.claude.chat;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/anthropic/claude/chat/SseKeepaliveWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class SseKeepaliveWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SseKeepaliveWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vp4 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.kjg
            if (r0 == 0) goto L13
            r0 = r10
            kjg r0 = (defpackage.kjg) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            kjg r0 = new kjg
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.E
            int r1 = r0.G
            r2 = 6
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L27
            defpackage.sf5.h0(r10)
            goto L93
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r3
        L2d:
            defpackage.sf5.h0(r10)
            androidx.work.WorkerParameters r9 = r9.b
            pf5 r10 = r9.b
            r10.getClass()
            r5 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.util.HashMap r10 = r10.a
            java.lang.String r5 = "enqueuing_process_start"
            java.lang.Object r10 = r10.get(r5)
            boolean r5 = r10 instanceof java.lang.Long
            if (r5 == 0) goto L4a
            r1 = r10
        L4a:
            java.lang.Number r1 = (java.lang.Number) r1
            long r5 = r1.longValue()
            long r7 = android.os.Process.getStartElapsedRealtime()
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L65
            java.util.List r9 = defpackage.xah.a
            java.lang.String r9 = "SseKeepaliveWorker: process restarted since enqueue, bailing"
            defpackage.xah.e(r2, r9, r3, r3)
            vaa r9 = new vaa
            r9.<init>()
            return r9
        L65:
            lz1 r10 = defpackage.uh6.F
            pf5 r9 = r9.b
            java.lang.String r10 = "max_hold_sec"
            r1 = 300(0x12c, float:4.2E-43)
            int r9 = r9.b(r10, r1)
            zh6 r10 = defpackage.zh6.SECONDS
            long r9 = defpackage.v40.Q(r9, r10)
            java.util.List r1 = defpackage.xah.a
            java.lang.String r1 = defpackage.uh6.p(r9)
            java.lang.String r5 = "SseKeepaliveWorker: holding (cap="
            java.lang.String r6 = ")"
            java.lang.String r1 = defpackage.ij0.j(r5, r1, r6)
            defpackage.xah.e(r2, r1, r3, r3)
            r0.G = r4
            java.lang.Object r9 = defpackage.d4c.L(r9, r0)
            m45 r10 = defpackage.m45.E
            if (r9 != r10) goto L93
            return r10
        L93:
            java.util.List r9 = defpackage.xah.a
            java.lang.String r9 = "SseKeepaliveWorker: hit cap without being cancelled"
            defpackage.xah.e(r2, r9, r3, r3)
            xaa r9 = defpackage.yaa.a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.SseKeepaliveWorker.d(vp4):java.lang.Object");
    }
}
