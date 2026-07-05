package com.anthropic.claude.chat.queue;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.OrganizationId;
import defpackage.ag9;
import defpackage.bg9;
import defpackage.c69;
import defpackage.cpc;
import defpackage.fkc;
import defpackage.g69;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mn5;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pf5;
import defpackage.ql3;
import defpackage.vd4;
import defpackage.vf3;
import defpackage.vnf;
import defpackage.vs2;
import defpackage.x44;
import defpackage.z7;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/anthropic/claude/chat/queue/QueuedMessageWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lcom/anthropic/claude/chat/queue/QueuedMessageWorker$Args;", "args", "Lql3;", "scopeHolder", "Lmn5;", "dateTimeProvider", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/anthropic/claude/chat/queue/QueuedMessageWorker$Args;Lql3;Lmn5;)V", "Args", "com/anthropic/claude/chat/queue/d", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class QueuedMessageWorker extends CoroutineWorker {
    public static final d j = new d();
    public final Args g;
    public final ql3 h;
    public final mn5 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueuedMessageWorker(Context context, WorkerParameters workerParameters, Args args, ql3 ql3Var, mn5 mn5Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        args.getClass();
        ql3Var.getClass();
        mn5Var.getClass();
        this.g = args;
        this.h = ql3Var;
        this.i = mn5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
    
        if (r13 == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vp4 r13) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.queue.QueuedMessageWorker.d(vp4):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J8\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b4\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010%¨\u0006:"}, d2 = {"Lcom/anthropic/claude/chat/queue/QueuedMessageWorker$Args;", "", "Lcom/anthropic/claude/types/strings/ChatId;", "chatId", "Lcom/anthropic/claude/types/strings/AccountId;", "accountId", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "Lc69;", "expiresAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc69;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc69;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/queue/QueuedMessageWorker$Args;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lpf5;", "toWorkData", "()Lpf5;", "component1-RjYBDck", "()Ljava/lang/String;", "component1", "component2-islZJdo", "component2", "component3-XjkXN6I", "component3", "component4", "()Lc69;", "copy-KYcCR1w", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc69;)Lcom/anthropic/claude/chat/queue/QueuedMessageWorker$Args;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChatId-RjYBDck", "getAccountId-islZJdo", "getOrganizationId-XjkXN6I", "Lc69;", "getExpiresAt", "Companion", "com/anthropic/claude/chat/queue/b", "com/anthropic/claude/chat/queue/a", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Args {
        public static final int $stable = 8;
        public static final b Companion = new b();
        private final String accountId;
        private final String chatId;
        private final c69 expiresAt;
        private final String organizationId;

        private /* synthetic */ Args(int i, String str, String str2, String str3, c69 c69Var, vnf vnfVar) {
            if (15 != (i & 15)) {
                gvj.f(i, 15, a.a.getDescriptor());
                throw null;
            }
            this.chatId = str;
            this.accountId = str2;
            this.organizationId = str3;
            this.expiresAt = c69Var;
        }

        /* JADX INFO: renamed from: copy-KYcCR1w$default, reason: not valid java name */
        public static /* synthetic */ Args m687copyKYcCR1w$default(Args args, String str, String str2, String str3, c69 c69Var, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.chatId;
            }
            if ((i & 2) != 0) {
                str2 = args.accountId;
            }
            if ((i & 4) != 0) {
                str3 = args.organizationId;
            }
            if ((i & 8) != 0) {
                c69Var = args.expiresAt;
            }
            return args.m691copyKYcCR1w(str, str2, str3, c69Var);
        }

        public static final /* synthetic */ void write$Self$chat(Args self, vd4 output, SerialDescriptor serialDesc) {
            output.r(serialDesc, 0, vs2.a, ChatId.m978boximpl(self.chatId));
            output.r(serialDesc, 1, z7.a, AccountId.m943boximpl(self.accountId));
            output.r(serialDesc, 2, fkc.a, OrganizationId.m1065boximpl(self.organizationId));
            output.r(serialDesc, 3, g69.a, self.expiresAt);
        }

        /* JADX INFO: renamed from: component1-RjYBDck, reason: not valid java name and from getter */
        public final String getChatId() {
            return this.chatId;
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
        public final c69 getExpiresAt() {
            return this.expiresAt;
        }

        /* JADX INFO: renamed from: copy-KYcCR1w, reason: not valid java name */
        public final Args m691copyKYcCR1w(String chatId, String accountId, String organizationId, c69 expiresAt) {
            chatId.getClass();
            accountId.getClass();
            organizationId.getClass();
            expiresAt.getClass();
            return new Args(chatId, accountId, organizationId, expiresAt, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return ChatId.m981equalsimpl0(this.chatId, args.chatId) && AccountId.m946equalsimpl0(this.accountId, args.accountId) && OrganizationId.m1068equalsimpl0(this.organizationId, args.organizationId) && x44.r(this.expiresAt, args.expiresAt);
        }

        /* JADX INFO: renamed from: getAccountId-islZJdo, reason: not valid java name */
        public final String m692getAccountIdislZJdo() {
            return this.accountId;
        }

        /* JADX INFO: renamed from: getChatId-RjYBDck, reason: not valid java name */
        public final String m693getChatIdRjYBDck() {
            return this.chatId;
        }

        public final c69 getExpiresAt() {
            return this.expiresAt;
        }

        /* JADX INFO: renamed from: getOrganizationId-XjkXN6I, reason: not valid java name */
        public final String m694getOrganizationIdXjkXN6I() {
            return this.organizationId;
        }

        public int hashCode() {
            return this.expiresAt.hashCode() + ((OrganizationId.m1069hashCodeimpl(this.organizationId) + ((AccountId.m947hashCodeimpl(this.accountId) + (ChatId.m982hashCodeimpl(this.chatId) * 31)) * 31)) * 31);
        }

        public String toString() {
            String strM983toStringimpl = ChatId.m983toStringimpl(this.chatId);
            String strM948toStringimpl = AccountId.m948toStringimpl(this.accountId);
            String strM1070toStringimpl = OrganizationId.m1070toStringimpl(this.organizationId);
            c69 c69Var = this.expiresAt;
            StringBuilder sbR = kgh.r("Args(chatId=", strM983toStringimpl, ", accountId=", strM948toStringimpl, ", organizationId=");
            sbR.append(strM1070toStringimpl);
            sbR.append(", expiresAt=");
            sbR.append(c69Var);
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

        public /* synthetic */ Args(String str, String str2, String str3, c69 c69Var, mq5 mq5Var) {
            this(str, str2, str3, c69Var);
        }

        public /* synthetic */ Args(int i, String str, String str2, String str3, c69 c69Var, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, str3, c69Var, vnfVar);
        }

        private Args(String str, String str2, String str3, c69 c69Var) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            c69Var.getClass();
            this.chatId = str;
            this.accountId = str2;
            this.organizationId = str3;
            this.expiresAt = c69Var;
        }
    }
}
