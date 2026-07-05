package com.anthropic.claude.code.remote.notification;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.SessionId;
import com.anthropic.claude.types.strings.ToolUseId;
import defpackage.ag9;
import defpackage.bg9;
import defpackage.c1i;
import defpackage.cpc;
import defpackage.fkc;
import defpackage.fsf;
import defpackage.fsh;
import defpackage.gid;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pf5;
import defpackage.ql3;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vf3;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import defpackage.z7;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\f\rB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/code/remote/notification/CCRPermissionActionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lcom/anthropic/claude/code/remote/notification/CCRPermissionActionWorker$Args;", "args", "Lql3;", "scopeHolder", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/anthropic/claude/code/remote/notification/CCRPermissionActionWorker$Args;Lql3;)V", "Args", "com/anthropic/claude/code/remote/notification/c", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class CCRPermissionActionWorker extends CoroutineWorker {
    public final Args g;
    public final ql3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CCRPermissionActionWorker(Context context, WorkerParameters workerParameters, Args args, ql3 ql3Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        args.getClass();
        ql3Var.getClass();
        this.g = args;
        this.h = ql3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
    
        if (r1 == r12) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0111, code lost:
    
        if (r1 == r12) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vp4 r20) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.notification.CCRPermissionActionWorker.d(vp4):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BCBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010B_\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0010\u0010)\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010#J\u0010\u0010+\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b*\u0010#J\u0010\u0010,\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010#JX\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b2\u0010#J\u0010\u00103\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b:\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b;\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b<\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b=\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b@\u0010#¨\u0006D"}, d2 = {"Lcom/anthropic/claude/code/remote/notification/CCRPermissionActionWorker$Args;", "", "Lcom/anthropic/claude/types/strings/SessionId;", "sessionId", "", "requestId", "Lcom/anthropic/claude/types/strings/ToolUseId;", "toolUseId", "Lcom/anthropic/claude/types/strings/AccountId;", "accountId", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "", "allow", "comment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$remote", "(Lcom/anthropic/claude/code/remote/notification/CCRPermissionActionWorker$Args;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lpf5;", "toWorkData", "()Lpf5;", "component1-Ocx55TE", "()Ljava/lang/String;", "component1", "component2", "component3-ERU6ZeY", "component3", "component4-islZJdo", "component4", "component5-XjkXN6I", "component5", "component6", "()Z", "component7", "copy-IkRqMqg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/anthropic/claude/code/remote/notification/CCRPermissionActionWorker$Args;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionId-Ocx55TE", "getRequestId", "getToolUseId-ERU6ZeY", "getAccountId-islZJdo", "getOrganizationId-XjkXN6I", "Z", "getAllow", "getComment", "Companion", "com/anthropic/claude/code/remote/notification/b", "com/anthropic/claude/code/remote/notification/a", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Args {
        public static final int $stable = 0;
        public static final b Companion = new b();
        private final String accountId;
        private final boolean allow;
        private final String comment;
        private final String organizationId;
        private final String requestId;
        private final String sessionId;
        private final String toolUseId;

        private /* synthetic */ Args(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, vnf vnfVar) {
            if (63 != (i & 63)) {
                gvj.f(i, 63, a.a.getDescriptor());
                throw null;
            }
            this.sessionId = str;
            this.requestId = str2;
            this.toolUseId = str3;
            this.accountId = str4;
            this.organizationId = str5;
            this.allow = z;
            if ((i & 64) == 0) {
                this.comment = null;
            } else {
                this.comment = str6;
            }
        }

        /* JADX INFO: renamed from: copy-IkRqMqg$default, reason: not valid java name */
        public static /* synthetic */ Args m710copyIkRqMqg$default(Args args, String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.sessionId;
            }
            if ((i & 2) != 0) {
                str2 = args.requestId;
            }
            if ((i & 4) != 0) {
                str3 = args.toolUseId;
            }
            if ((i & 8) != 0) {
                str4 = args.accountId;
            }
            if ((i & 16) != 0) {
                str5 = args.organizationId;
            }
            if ((i & 32) != 0) {
                z = args.allow;
            }
            if ((i & 64) != 0) {
                str6 = args.comment;
            }
            boolean z2 = z;
            String str7 = str6;
            String str8 = str5;
            String str9 = str3;
            return args.m715copyIkRqMqg(str, str2, str9, str4, str8, z2, str7);
        }

        public static final /* synthetic */ void write$Self$remote(Args self, vd4 output, SerialDescriptor serialDesc) {
            output.r(serialDesc, 0, fsf.a, SessionId.m1114boximpl(self.sessionId));
            output.q(serialDesc, 1, self.requestId);
            output.r(serialDesc, 2, c1i.a, ToolUseId.m1157boximpl(self.toolUseId));
            output.r(serialDesc, 3, z7.a, AccountId.m943boximpl(self.accountId));
            output.r(serialDesc, 4, fkc.a, OrganizationId.m1065boximpl(self.organizationId));
            output.p(serialDesc, 5, self.allow);
            if (!output.E(serialDesc) && self.comment == null) {
                return;
            }
            output.B(serialDesc, 6, srg.a, self.comment);
        }

        /* JADX INFO: renamed from: component1-Ocx55TE, reason: not valid java name and from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        /* JADX INFO: renamed from: component3-ERU6ZeY, reason: not valid java name and from getter */
        public final String getToolUseId() {
            return this.toolUseId;
        }

        /* JADX INFO: renamed from: component4-islZJdo, reason: not valid java name and from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* JADX INFO: renamed from: component5-XjkXN6I, reason: not valid java name and from getter */
        public final String getOrganizationId() {
            return this.organizationId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getAllow() {
            return this.allow;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getComment() {
            return this.comment;
        }

        /* JADX INFO: renamed from: copy-IkRqMqg, reason: not valid java name */
        public final Args m715copyIkRqMqg(String sessionId, String requestId, String toolUseId, String accountId, String organizationId, boolean allow, String comment) {
            sessionId.getClass();
            requestId.getClass();
            toolUseId.getClass();
            accountId.getClass();
            organizationId.getClass();
            return new Args(sessionId, requestId, toolUseId, accountId, organizationId, allow, comment, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return SessionId.m1117equalsimpl0(this.sessionId, args.sessionId) && x44.r(this.requestId, args.requestId) && ToolUseId.m1160equalsimpl0(this.toolUseId, args.toolUseId) && AccountId.m946equalsimpl0(this.accountId, args.accountId) && OrganizationId.m1068equalsimpl0(this.organizationId, args.organizationId) && this.allow == args.allow && x44.r(this.comment, args.comment);
        }

        /* JADX INFO: renamed from: getAccountId-islZJdo, reason: not valid java name */
        public final String m716getAccountIdislZJdo() {
            return this.accountId;
        }

        public final boolean getAllow() {
            return this.allow;
        }

        public final String getComment() {
            return this.comment;
        }

        /* JADX INFO: renamed from: getOrganizationId-XjkXN6I, reason: not valid java name */
        public final String m717getOrganizationIdXjkXN6I() {
            return this.organizationId;
        }

        public final String getRequestId() {
            return this.requestId;
        }

        /* JADX INFO: renamed from: getSessionId-Ocx55TE, reason: not valid java name */
        public final String m718getSessionIdOcx55TE() {
            return this.sessionId;
        }

        /* JADX INFO: renamed from: getToolUseId-ERU6ZeY, reason: not valid java name */
        public final String m719getToolUseIdERU6ZeY() {
            return this.toolUseId;
        }

        public int hashCode() {
            int iP = fsh.p((OrganizationId.m1069hashCodeimpl(this.organizationId) + ((AccountId.m947hashCodeimpl(this.accountId) + ((ToolUseId.m1161hashCodeimpl(this.toolUseId) + kgh.l(SessionId.m1118hashCodeimpl(this.sessionId) * 31, 31, this.requestId)) * 31)) * 31)) * 31, 31, this.allow);
            String str = this.comment;
            return iP + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String strM1119toStringimpl = SessionId.m1119toStringimpl(this.sessionId);
            String str = this.requestId;
            String strM1162toStringimpl = ToolUseId.m1162toStringimpl(this.toolUseId);
            String strM948toStringimpl = AccountId.m948toStringimpl(this.accountId);
            String strM1070toStringimpl = OrganizationId.m1070toStringimpl(this.organizationId);
            boolean z = this.allow;
            String str2 = this.comment;
            StringBuilder sbR = kgh.r("Args(sessionId=", strM1119toStringimpl, ", requestId=", str, ", toolUseId=");
            kgh.u(sbR, strM1162toStringimpl, ", accountId=", strM948toStringimpl, ", organizationId=");
            gid.t(sbR, strM1070toStringimpl, ", allow=", z, ", comment=");
            return ij0.m(sbR, str2, ")");
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

        private Args(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
            y6a.s(str, str2, str3, str4, str5);
            this.sessionId = str;
            this.requestId = str2;
            this.toolUseId = str3;
            this.accountId = str4;
            this.organizationId = str5;
            this.allow = z;
            this.comment = str6;
        }

        public /* synthetic */ Args(String str, String str2, String str3, String str4, String str5, boolean z, String str6, mq5 mq5Var) {
            this(str, str2, str3, str4, str5, z, str6);
        }

        public /* synthetic */ Args(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, str3, str4, str5, z, str6, vnfVar);
        }

        public /* synthetic */ Args(String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, mq5 mq5Var) {
            this(str, str2, str3, str4, str5, z, (i & 64) != 0 ? null : str6, null);
        }
    }
}
