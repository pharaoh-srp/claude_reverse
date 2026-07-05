package com.anthropic.claude.conway;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.bj0;
import defpackage.mdj;
import defpackage.ql3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/anthropic/claude/conway/ConwayWakeWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lql3;", "scopeHolder", "Lbj0;", "appForegroundDetector", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lql3;Lbj0;)V", "n15", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class ConwayWakeWorker extends CoroutineWorker {
    public final ql3 g;
    public final bj0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConwayWakeWorker(Context context, WorkerParameters workerParameters, ql3 ql3Var, bj0 bj0Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        ql3Var.getClass();
        bj0Var.getClass();
        this.g = ql3Var;
        this.h = bj0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:66|(5:68|(1:70)(1:71)|(0)|80|(2:82|134)(3:83|84|(0)(0)))|73|171|74|(1:78)(1:79)|80|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x033f, code lost:
    
        if (defpackage.gb9.c0(r1, r3, r2) == r13) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0197, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a7 A[Catch: all -> 0x014f, TryCatch #7 {all -> 0x014f, blocks: (B:135:0x0342, B:115:0x02db, B:105:0x02a3, B:107:0x02a7, B:112:0x02b7, B:125:0x0309, B:127:0x030d, B:132:0x031d, B:84:0x01dd, B:86:0x01e1, B:87:0x01ef, B:89:0x01f7, B:90:0x0204, B:91:0x0224, B:93:0x022a, B:94:0x0236, B:55:0x0108, B:57:0x0142, B:60:0x0152, B:62:0x0158, B:65:0x0161, B:66:0x016f, B:68:0x0179, B:80:0x01ae, B:73:0x0183, B:74:0x018a, B:78:0x019a, B:79:0x01aa), top: B:175:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030d A[Catch: all -> 0x014f, TryCatch #7 {all -> 0x014f, blocks: (B:135:0x0342, B:115:0x02db, B:105:0x02a3, B:107:0x02a7, B:112:0x02b7, B:125:0x0309, B:127:0x030d, B:132:0x031d, B:84:0x01dd, B:86:0x01e1, B:87:0x01ef, B:89:0x01f7, B:90:0x0204, B:91:0x0224, B:93:0x022a, B:94:0x0236, B:55:0x0108, B:57:0x0142, B:60:0x0152, B:62:0x0158, B:65:0x0161, B:66:0x016f, B:68:0x0179, B:80:0x01ae, B:73:0x0183, B:74:0x018a, B:78:0x019a, B:79:0x01aa), top: B:175:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e1 A[Catch: all -> 0x014f, TryCatch #7 {all -> 0x014f, blocks: (B:135:0x0342, B:115:0x02db, B:105:0x02a3, B:107:0x02a7, B:112:0x02b7, B:125:0x0309, B:127:0x030d, B:132:0x031d, B:84:0x01dd, B:86:0x01e1, B:87:0x01ef, B:89:0x01f7, B:90:0x0204, B:91:0x0224, B:93:0x022a, B:94:0x0236, B:55:0x0108, B:57:0x0142, B:60:0x0152, B:62:0x0158, B:65:0x0161, B:66:0x016f, B:68:0x0179, B:80:0x01ae, B:73:0x0183, B:74:0x018a, B:78:0x019a, B:79:0x01aa), top: B:175:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ef A[Catch: all -> 0x014f, TryCatch #7 {all -> 0x014f, blocks: (B:135:0x0342, B:115:0x02db, B:105:0x02a3, B:107:0x02a7, B:112:0x02b7, B:125:0x0309, B:127:0x030d, B:132:0x031d, B:84:0x01dd, B:86:0x01e1, B:87:0x01ef, B:89:0x01f7, B:90:0x0204, B:91:0x0224, B:93:0x022a, B:94:0x0236, B:55:0x0108, B:57:0x0142, B:60:0x0152, B:62:0x0158, B:65:0x0161, B:66:0x016f, B:68:0x0179, B:80:0x01ae, B:73:0x0183, B:74:0x018a, B:78:0x019a, B:79:0x01aa), top: B:175:0x0108 }] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vp4 r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.ConwayWakeWorker.d(vp4):java.lang.Object");
    }
}
