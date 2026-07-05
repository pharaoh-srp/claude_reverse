package com.anthropic.claude.code.remote.notification;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.anthropic.claude.analytics.events.PushEvents$SessionReplyActionResult;
import com.anthropic.claude.analytics.events.PushEvents$SessionReplyOutcome;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.SessionId;
import defpackage.ag9;
import defpackage.bg9;
import defpackage.cpc;
import defpackage.fkc;
import defpackage.fsf;
import defpackage.gvj;
import defpackage.hre;
import defpackage.iei;
import defpackage.ij0;
import defpackage.jre;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pf5;
import defpackage.qi3;
import defpackage.ql3;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vf3;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xaa;
import defpackage.yaa;
import defpackage.ysj;
import defpackage.z7;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/anthropic/claude/code/remote/notification/SessionReplyActionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lcom/anthropic/claude/code/remote/notification/SessionReplyActionWorker$Args;", "args", "Lql3;", "scopeHolder", "Lqi3;", "analytics", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/anthropic/claude/code/remote/notification/SessionReplyActionWorker$Args;Lql3;Lqi3;)V", "Args", "com/anthropic/claude/code/remote/notification/f", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class SessionReplyActionWorker extends CoroutineWorker {
    public final Args g;
    public final ql3 h;
    public final qi3 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionReplyActionWorker(Context context, WorkerParameters workerParameters, Args args, ql3 ql3Var, qi3 qi3Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        args.getClass();
        ql3Var.getClass();
        qi3Var.getClass();
        this.g = args;
        this.h = ql3Var;
        this.i = qi3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.qtf
            if (r0 == 0) goto L13
            r0 = r5
            qtf r0 = (defpackage.qtf) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            qtf r0 = new qtf
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            defpackage.sf5.h0(r5)     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L52
            goto L3c
        L26:
            r5 = move-exception
            goto L3f
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2e:
            defpackage.sf5.h0(r5)
            r0.G = r2     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L52
            java.lang.Object r5 = r4.g(r0)     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L52
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L3c
            return r0
        L3c:
            yaa r5 = (defpackage.yaa) r5     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L52
            return r5
        L3f:
            com.anthropic.claude.core.telemetry.SilentException r0 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r1 = "SessionReplyActionWorker: doWork threw"
            r0.<init>(r1, r5)
            r5 = 3
            r1 = 0
            com.anthropic.claude.core.telemetry.SilentException.a(r0, r3, r1, r5)
            com.anthropic.claude.analytics.events.PushEvents$SessionReplyOutcome r5 = com.anthropic.claude.analytics.events.PushEvents$SessionReplyOutcome.API_FAILURE
            xaa r4 = r4.f(r5, r1)
            return r4
        L52:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.notification.SessionReplyActionWorker.d(vp4):java.lang.Object");
    }

    public final xaa f(PushEvents$SessionReplyOutcome pushEvents$SessionReplyOutcome, int i) {
        Object hreVar;
        Args args = this.g;
        Object hreVar2 = iei.a;
        try {
            h(pushEvents$SessionReplyOutcome, i);
            hreVar = hreVar2;
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        Throwable thA = jre.a(hreVar);
        if (thA != null) {
            SilentException.a(new SilentException("SessionReplyActionWorker: trackResult threw", thA), null, false, 3);
        }
        try {
            Context context = this.a;
            context.getClass();
            ysj.d(context, args.getNotificationId(), args.getSubmittedAtMillis());
        } catch (Throwable th2) {
            hreVar2 = new hre(th2);
        }
        Throwable thA2 = jre.a(hreVar2);
        if (thA2 != null) {
            SilentException.a(new SilentException("SessionReplyActionWorker: appendSendFailure threw", thA2), null, false, 3);
        }
        return yaa.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
    
        if (r0 == r12) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.vp4 r22) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.notification.SessionReplyActionWorker.g(vp4):java.lang.Object");
    }

    public final void h(PushEvents$SessionReplyOutcome pushEvents$SessionReplyOutcome, int i) {
        Args args = this.g;
        this.i.e(new PushEvents$SessionReplyActionResult(args.m726getOrganizationIdXjkXN6I(), args.m725getAccountIdislZJdo(), args.m727getSessionIdOcx55TE(), pushEvents$SessionReplyOutcome, i), PushEvents$SessionReplyActionResult.Companion.serializer());
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBS\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010+JL\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b/\u0010!J\u0010\u00100\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b0\u0010(J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b7\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b8\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b;\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010+¨\u0006A"}, d2 = {"Lcom/anthropic/claude/code/remote/notification/SessionReplyActionWorker$Args;", "", "Lcom/anthropic/claude/types/strings/SessionId;", "sessionId", "Lcom/anthropic/claude/types/strings/AccountId;", "accountId", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "", "notificationId", "", "text", "", "submittedAtMillis", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$remote", "(Lcom/anthropic/claude/code/remote/notification/SessionReplyActionWorker$Args;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lpf5;", "toWorkData", "()Lpf5;", "component1-Ocx55TE", "()Ljava/lang/String;", "component1", "component2-islZJdo", "component2", "component3-XjkXN6I", "component3", "component4", "()I", "component5", "component6", "()J", "copy-ApZTgtA", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;J)Lcom/anthropic/claude/code/remote/notification/SessionReplyActionWorker$Args;", "copy", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionId-Ocx55TE", "getAccountId-islZJdo", "getOrganizationId-XjkXN6I", "I", "getNotificationId", "getText", "J", "getSubmittedAtMillis", "Companion", "com/anthropic/claude/code/remote/notification/e", "com/anthropic/claude/code/remote/notification/d", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Args {
        public static final int $stable = 0;
        public static final e Companion = new e();
        private final String accountId;
        private final int notificationId;
        private final String organizationId;
        private final String sessionId;
        private final long submittedAtMillis;
        private final String text;

        private /* synthetic */ Args(int i, String str, String str2, String str3, int i2, String str4, long j, vnf vnfVar) {
            if (31 != (i & 31)) {
                gvj.f(i, 31, d.a.getDescriptor());
                throw null;
            }
            this.sessionId = str;
            this.accountId = str2;
            this.organizationId = str3;
            this.notificationId = i2;
            this.text = str4;
            if ((i & 32) == 0) {
                this.submittedAtMillis = 0L;
            } else {
                this.submittedAtMillis = j;
            }
        }

        /* JADX INFO: renamed from: copy-ApZTgtA$default, reason: not valid java name */
        public static /* synthetic */ Args m720copyApZTgtA$default(Args args, String str, String str2, String str3, int i, String str4, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = args.sessionId;
            }
            if ((i2 & 2) != 0) {
                str2 = args.accountId;
            }
            if ((i2 & 4) != 0) {
                str3 = args.organizationId;
            }
            if ((i2 & 8) != 0) {
                i = args.notificationId;
            }
            if ((i2 & 16) != 0) {
                str4 = args.text;
            }
            if ((i2 & 32) != 0) {
                j = args.submittedAtMillis;
            }
            long j2 = j;
            String str5 = str4;
            String str6 = str3;
            return args.m724copyApZTgtA(str, str2, str6, i, str5, j2);
        }

        public static final /* synthetic */ void write$Self$remote(Args self, vd4 output, SerialDescriptor serialDesc) {
            output.r(serialDesc, 0, fsf.a, SessionId.m1114boximpl(self.sessionId));
            output.r(serialDesc, 1, z7.a, AccountId.m943boximpl(self.accountId));
            output.r(serialDesc, 2, fkc.a, OrganizationId.m1065boximpl(self.organizationId));
            output.l(3, self.notificationId, serialDesc);
            output.q(serialDesc, 4, self.text);
            if (!output.E(serialDesc) && self.submittedAtMillis == 0) {
                return;
            }
            output.D(serialDesc, 5, self.submittedAtMillis);
        }

        /* JADX INFO: renamed from: component1-Ocx55TE, reason: not valid java name and from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* JADX INFO: renamed from: component2-islZJdo, reason: not valid java name and from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* JADX INFO: renamed from: component3-XjkXN6I, reason: not valid java name and from getter */
        public final String getOrganizationId() {
            return this.organizationId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getNotificationId() {
            return this.notificationId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getSubmittedAtMillis() {
            return this.submittedAtMillis;
        }

        /* JADX INFO: renamed from: copy-ApZTgtA, reason: not valid java name */
        public final Args m724copyApZTgtA(String sessionId, String accountId, String organizationId, int notificationId, String text, long submittedAtMillis) {
            sessionId.getClass();
            accountId.getClass();
            organizationId.getClass();
            text.getClass();
            return new Args(sessionId, accountId, organizationId, notificationId, text, submittedAtMillis, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return SessionId.m1117equalsimpl0(this.sessionId, args.sessionId) && AccountId.m946equalsimpl0(this.accountId, args.accountId) && OrganizationId.m1068equalsimpl0(this.organizationId, args.organizationId) && this.notificationId == args.notificationId && x44.r(this.text, args.text) && this.submittedAtMillis == args.submittedAtMillis;
        }

        /* JADX INFO: renamed from: getAccountId-islZJdo, reason: not valid java name */
        public final String m725getAccountIdislZJdo() {
            return this.accountId;
        }

        public final int getNotificationId() {
            return this.notificationId;
        }

        /* JADX INFO: renamed from: getOrganizationId-XjkXN6I, reason: not valid java name */
        public final String m726getOrganizationIdXjkXN6I() {
            return this.organizationId;
        }

        /* JADX INFO: renamed from: getSessionId-Ocx55TE, reason: not valid java name */
        public final String m727getSessionIdOcx55TE() {
            return this.sessionId;
        }

        public final long getSubmittedAtMillis() {
            return this.submittedAtMillis;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return Long.hashCode(this.submittedAtMillis) + kgh.l(vb7.c(this.notificationId, (OrganizationId.m1069hashCodeimpl(this.organizationId) + ((AccountId.m947hashCodeimpl(this.accountId) + (SessionId.m1118hashCodeimpl(this.sessionId) * 31)) * 31)) * 31, 31), 31, this.text);
        }

        public String toString() {
            String strM1119toStringimpl = SessionId.m1119toStringimpl(this.sessionId);
            String strM948toStringimpl = AccountId.m948toStringimpl(this.accountId);
            String strM1070toStringimpl = OrganizationId.m1070toStringimpl(this.organizationId);
            int i = this.notificationId;
            String str = this.text;
            long j = this.submittedAtMillis;
            StringBuilder sbR = kgh.r("Args(sessionId=", strM1119toStringimpl, ", accountId=", strM948toStringimpl, ", organizationId=");
            sbR.append(strM1070toStringimpl);
            sbR.append(", notificationId=");
            sbR.append(i);
            sbR.append(", text=");
            sbR.append(str);
            sbR.append(", submittedAtMillis=");
            sbR.append(j);
            sbR.append(")");
            return sbR.toString();
        }

        public final pf5 toWorkData() {
            ag9 ag9Var = bg9.d;
            ag9Var.getClass();
            cpc[] cpcVarArr = {new cpc("args", ag9Var.d(this, Companion.serializer()))};
            vf3 vf3Var = new vf3(1);
            cpc cpcVar = cpcVarArr[0];
            vf3Var.d((String) cpcVar.E, cpcVar.F);
            return vf3Var.b();
        }

        private Args(String str, String str2, String str3, int i, String str4, long j) {
            ij0.z(str, str2, str3, str4);
            this.sessionId = str;
            this.accountId = str2;
            this.organizationId = str3;
            this.notificationId = i;
            this.text = str4;
            this.submittedAtMillis = j;
        }

        public /* synthetic */ Args(String str, String str2, String str3, int i, String str4, long j, mq5 mq5Var) {
            this(str, str2, str3, i, str4, j);
        }

        public /* synthetic */ Args(int i, String str, String str2, String str3, int i2, String str4, long j, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, str3, i2, str4, j, vnfVar);
        }

        public /* synthetic */ Args(String str, String str2, String str3, int i, String str4, long j, int i2, mq5 mq5Var) {
            this(str, str2, str3, i, str4, (i2 & 32) != 0 ? 0L : j, null);
        }
    }
}
