package com.anthropic.claude.chat.input.files;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.anthropic.claude.analytics.events.ChatEvents$AddAttachment;
import com.anthropic.claude.analytics.events.ChatEvents$UploadSource;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ag9;
import defpackage.bg9;
import defpackage.c97;
import defpackage.cpc;
import defpackage.en2;
import defpackage.f1c;
import defpackage.fkc;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.h21;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pf5;
import defpackage.ql3;
import defpackage.vaa;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vf3;
import defpackage.vnf;
import defpackage.vs2;
import defpackage.w1a;
import defpackage.x44;
import defpackage.y6a;
import defpackage.yb5;
import defpackage.z7;
import defpackage.znf;
import java.io.File;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/anthropic/claude/chat/input/files/FileUploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lcom/anthropic/claude/chat/input/files/FileUploadWorker$Args;", "args", "Lql3;", "scopeHolder", "Lbg9;", "json", "Lf1c;", "networkMonitor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/anthropic/claude/chat/input/files/FileUploadWorker$Args;Lql3;Lbg9;Lf1c;)V", "Args", "com/anthropic/claude/chat/input/files/e", "com/anthropic/claude/chat/input/files/d", "input"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class FileUploadWorker extends CoroutineWorker {
    public final Args g;
    public final ql3 h;
    public final bg9 i;
    public final f1c j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileUploadWorker(Context context, WorkerParameters workerParameters, Args args, ql3 ql3Var, bg9 bg9Var, f1c f1cVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        args.getClass();
        ql3Var.getClass();
        bg9Var.getClass();
        f1cVar.getClass();
        this.g = args;
        this.h = ql3Var;
        this.i = bg9Var;
        this.j = f1cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vp4 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.ek7
            if (r0 == 0) goto L13
            r0 = r11
            ek7 r0 = (defpackage.ek7) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            ek7 r0 = new ek7
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 1
            com.anthropic.claude.chat.input.files.FileUploadWorker$Args r4 = r10.g
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            java.io.File r0 = r0.E
            defpackage.sf5.h0(r11)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L85
            goto L63
        L2a:
            r11 = move-exception
            goto L6a
        L2c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            return r2
        L32:
            defpackage.sf5.h0(r11)
            java.io.File r11 = new java.io.File
            java.lang.String r1 = r4.getCacheFilePath()
            r11.<init>(r1)
            long r5 = r4.getEnqueuingProcessStart()
            long r7 = android.os.Process.getStartElapsedRealtime()
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L53
            r11.delete()
            vaa r10 = new vaa
            r10.<init>()
            return r10
        L53:
            r0.E = r11     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L85
            r0.H = r3     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L85
            java.lang.Object r0 = r10.f(r11, r0)     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L85
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L60
            return r1
        L60:
            r9 = r0
            r0 = r11
            r11 = r9
        L63:
            yaa r11 = (defpackage.yaa) r11     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L85
            return r11
        L66:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
        L6a:
            com.anthropic.claude.core.telemetry.SilentException r1 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r3 = r4.getUploadId()
            java.lang.String r4 = "FileUploadWorker: unexpected throw for "
            java.lang.String r3 = defpackage.ij0.i(r4, r3)
            r1.<init>(r3, r11)
            r11 = 3
            r3 = 0
            com.anthropic.claude.core.telemetry.SilentException.a(r1, r2, r3, r11)
            h21 r11 = defpackage.h21.F
            vaa r10 = r10.g(r0, r11, r3, r3)
            return r10
        L85:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.input.files.FileUploadWorker.d(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, java.lang.String, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.io.File r23, defpackage.vp4 r24) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.input.files.FileUploadWorker.f(java.io.File, vp4):java.lang.Object");
    }

    public final vaa g(File file, h21 h21Var, boolean z, int i) {
        file.delete();
        cpc[] cpcVarArr = {new cpc("reason", h21Var.name()), new cpc("retryable", Boolean.valueOf(z)), new cpc("retry_count", Integer.valueOf(i)), new cpc("wm_run_attempt", Integer.valueOf(this.b.c))};
        vf3 vf3Var = new vf3(1);
        for (int i2 = 0; i2 < 4; i2++) {
            cpc cpcVar = cpcVarArr[i2];
            vf3Var.d((String) cpcVar.E, cpcVar.F);
        }
        return new vaa(vf3Var.b());
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002UVBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010 J\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010)\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010 J\u0080\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010 J\u0010\u00106\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020\u00102\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010D\u001a\u0004\bF\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bG\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bH\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bI\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bJ\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bL\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010M\u001a\u0004\bN\u0010,R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\bP\u0010.R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010Q\u001a\u0004\bR\u00100R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\bS\u0010 ¨\u0006W"}, d2 = {"Lcom/anthropic/claude/chat/input/files/FileUploadWorker$Args;", "", "", "uploadId", "fileName", "mediaType", "Lcom/anthropic/claude/types/strings/ChatId;", "chatId", "Lcom/anthropic/claude/types/strings/AccountId;", "accountId", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "Lcom/anthropic/claude/analytics/events/ChatEvents$UploadSource;", "uploadSource", "Lcom/anthropic/claude/analytics/events/ChatEvents$AddAttachment;", "analyticsEvent", "", "reportProgress", "", "enqueuingProcessStart", "cacheFilePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$UploadSource;Lcom/anthropic/claude/analytics/events/ChatEvents$AddAttachment;ZJLjava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$UploadSource;Lcom/anthropic/claude/analytics/events/ChatEvents$AddAttachment;ZJLjava/lang/String;Lvnf;Lmq5;)V", "Lpf5;", "toWorkData", "()Lpf5;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4-CAG_bmg", "component4", "component5-islZJdo", "component5", "component6-XjkXN6I", "component6", "component7", "()Lcom/anthropic/claude/analytics/events/ChatEvents$UploadSource;", "component8", "()Lcom/anthropic/claude/analytics/events/ChatEvents$AddAttachment;", "component9", "()Z", "component10", "()J", "component11", "copy-5XtiZjQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$UploadSource;Lcom/anthropic/claude/analytics/events/ChatEvents$AddAttachment;ZJLjava/lang/String;)Lcom/anthropic/claude/chat/input/files/FileUploadWorker$Args;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$input", "(Lcom/anthropic/claude/chat/input/files/FileUploadWorker$Args;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUploadId", "getFileName", "getMediaType", "getChatId-CAG_bmg", "getAccountId-islZJdo", "getOrganizationId-XjkXN6I", "Lcom/anthropic/claude/analytics/events/ChatEvents$UploadSource;", "getUploadSource", "Lcom/anthropic/claude/analytics/events/ChatEvents$AddAttachment;", "getAnalyticsEvent", "Z", "getReportProgress", "J", "getEnqueuingProcessStart", "getCacheFilePath", "Companion", "com/anthropic/claude/chat/input/files/c", "com/anthropic/claude/chat/input/files/b", "input"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Args {
        private final String accountId;
        private final ChatEvents$AddAttachment analyticsEvent;
        private final String cacheFilePath;
        private final String chatId;
        private final long enqueuingProcessStart;
        private final String fileName;
        private final String mediaType;
        private final String organizationId;
        private final boolean reportProgress;
        private final String uploadId;
        private final ChatEvents$UploadSource uploadSource;
        public static final c Companion = new c();
        public static final int $stable = ChatEvents$AddAttachment.$stable;
        private static final kw9[] $childSerializers = {null, null, null, null, null, null, yb5.w(w1a.F, new c97(7)), null, null, null, null};

        private /* synthetic */ Args(int i, String str, String str2, String str3, String str4, String str5, String str6, ChatEvents$UploadSource chatEvents$UploadSource, ChatEvents$AddAttachment chatEvents$AddAttachment, boolean z, long j, String str7, vnf vnfVar) {
            if (511 != (i & 511)) {
                gvj.f(i, 511, b.a.getDescriptor());
                throw null;
            }
            this.uploadId = str;
            this.fileName = str2;
            this.mediaType = str3;
            this.chatId = str4;
            this.accountId = str5;
            this.organizationId = str6;
            this.uploadSource = chatEvents$UploadSource;
            this.analyticsEvent = chatEvents$AddAttachment;
            this.reportProgress = z;
            if ((i & 512) == 0) {
                this.enqueuingProcessStart = 0L;
            } else {
                this.enqueuingProcessStart = j;
            }
            if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
                this.cacheFilePath = "";
            } else {
                this.cacheFilePath = str7;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return ChatEvents$UploadSource.Companion.serializer();
        }

        /* JADX INFO: renamed from: copy-5XtiZjQ$default, reason: not valid java name */
        public static /* synthetic */ Args m673copy5XtiZjQ$default(Args args, String str, String str2, String str3, String str4, String str5, String str6, ChatEvents$UploadSource chatEvents$UploadSource, ChatEvents$AddAttachment chatEvents$AddAttachment, boolean z, long j, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.uploadId;
            }
            if ((i & 2) != 0) {
                str2 = args.fileName;
            }
            if ((i & 4) != 0) {
                str3 = args.mediaType;
            }
            if ((i & 8) != 0) {
                str4 = args.chatId;
            }
            if ((i & 16) != 0) {
                str5 = args.accountId;
            }
            if ((i & 32) != 0) {
                str6 = args.organizationId;
            }
            if ((i & 64) != 0) {
                chatEvents$UploadSource = args.uploadSource;
            }
            if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
                chatEvents$AddAttachment = args.analyticsEvent;
            }
            if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
                z = args.reportProgress;
            }
            if ((i & 512) != 0) {
                j = args.enqueuingProcessStart;
            }
            if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                str7 = args.cacheFilePath;
            }
            String str8 = str7;
            long j2 = j;
            ChatEvents$AddAttachment chatEvents$AddAttachment2 = chatEvents$AddAttachment;
            boolean z2 = z;
            String str9 = str6;
            ChatEvents$UploadSource chatEvents$UploadSource2 = chatEvents$UploadSource;
            String str10 = str5;
            String str11 = str3;
            return args.m677copy5XtiZjQ(str, str2, str11, str4, str10, str9, chatEvents$UploadSource2, chatEvents$AddAttachment2, z2, j2, str8);
        }

        public static final /* synthetic */ void write$Self$input(Args self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            output.q(serialDesc, 0, self.uploadId);
            output.q(serialDesc, 1, self.fileName);
            output.q(serialDesc, 2, self.mediaType);
            vs2 vs2Var = vs2.a;
            String str = self.chatId;
            output.B(serialDesc, 3, vs2Var, str != null ? ChatId.m978boximpl(str) : null);
            output.r(serialDesc, 4, z7.a, AccountId.m943boximpl(self.accountId));
            output.r(serialDesc, 5, fkc.a, OrganizationId.m1065boximpl(self.organizationId));
            output.r(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.uploadSource);
            output.r(serialDesc, 7, en2.a, self.analyticsEvent);
            output.p(serialDesc, 8, self.reportProgress);
            if (output.E(serialDesc) || self.enqueuingProcessStart != 0) {
                output.D(serialDesc, 9, self.enqueuingProcessStart);
            }
            if (!output.E(serialDesc) && x44.r(self.cacheFilePath, "")) {
                return;
            }
            output.q(serialDesc, 10, self.cacheFilePath);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUploadId() {
            return this.uploadId;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final long getEnqueuingProcessStart() {
            return this.enqueuingProcessStart;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getCacheFilePath() {
            return this.cacheFilePath;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMediaType() {
            return this.mediaType;
        }

        /* JADX INFO: renamed from: component4-CAG_bmg, reason: not valid java name and from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* JADX INFO: renamed from: component5-islZJdo, reason: not valid java name and from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* JADX INFO: renamed from: component6-XjkXN6I, reason: not valid java name and from getter */
        public final String getOrganizationId() {
            return this.organizationId;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final ChatEvents$UploadSource getUploadSource() {
            return this.uploadSource;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final ChatEvents$AddAttachment getAnalyticsEvent() {
            return this.analyticsEvent;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getReportProgress() {
            return this.reportProgress;
        }

        /* JADX INFO: renamed from: copy-5XtiZjQ, reason: not valid java name */
        public final Args m677copy5XtiZjQ(String uploadId, String fileName, String mediaType, String chatId, String accountId, String organizationId, ChatEvents$UploadSource uploadSource, ChatEvents$AddAttachment analyticsEvent, boolean reportProgress, long enqueuingProcessStart, String cacheFilePath) {
            y6a.s(uploadId, fileName, mediaType, accountId, organizationId);
            uploadSource.getClass();
            analyticsEvent.getClass();
            cacheFilePath.getClass();
            return new Args(uploadId, fileName, mediaType, chatId, accountId, organizationId, uploadSource, analyticsEvent, reportProgress, enqueuingProcessStart, cacheFilePath, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r8) {
            /*
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof com.anthropic.claude.chat.input.files.FileUploadWorker.Args
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.anthropic.claude.chat.input.files.FileUploadWorker$Args r8 = (com.anthropic.claude.chat.input.files.FileUploadWorker.Args) r8
                java.lang.String r1 = r7.uploadId
                java.lang.String r3 = r8.uploadId
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r7.fileName
                java.lang.String r3 = r8.fileName
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.String r1 = r7.mediaType
                java.lang.String r3 = r8.mediaType
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                java.lang.String r1 = r7.chatId
                java.lang.String r3 = r8.chatId
                if (r1 != 0) goto L39
                if (r3 != 0) goto L37
                r1 = r0
                goto L40
            L37:
                r1 = r2
                goto L40
            L39:
                if (r3 != 0) goto L3c
                goto L37
            L3c:
                boolean r1 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r1, r3)
            L40:
                if (r1 != 0) goto L43
                return r2
            L43:
                java.lang.String r1 = r7.accountId
                java.lang.String r3 = r8.accountId
                boolean r1 = com.anthropic.claude.types.strings.AccountId.m946equalsimpl0(r1, r3)
                if (r1 != 0) goto L4e
                return r2
            L4e:
                java.lang.String r1 = r7.organizationId
                java.lang.String r3 = r8.organizationId
                boolean r1 = com.anthropic.claude.types.strings.OrganizationId.m1068equalsimpl0(r1, r3)
                if (r1 != 0) goto L59
                return r2
            L59:
                com.anthropic.claude.analytics.events.ChatEvents$UploadSource r1 = r7.uploadSource
                com.anthropic.claude.analytics.events.ChatEvents$UploadSource r3 = r8.uploadSource
                if (r1 == r3) goto L60
                return r2
            L60:
                com.anthropic.claude.analytics.events.ChatEvents$AddAttachment r1 = r7.analyticsEvent
                com.anthropic.claude.analytics.events.ChatEvents$AddAttachment r3 = r8.analyticsEvent
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L6b
                return r2
            L6b:
                boolean r1 = r7.reportProgress
                boolean r3 = r8.reportProgress
                if (r1 == r3) goto L72
                return r2
            L72:
                long r3 = r7.enqueuingProcessStart
                long r5 = r8.enqueuingProcessStart
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 == 0) goto L7b
                return r2
            L7b:
                java.lang.String r7 = r7.cacheFilePath
                java.lang.String r8 = r8.cacheFilePath
                boolean r7 = defpackage.x44.r(r7, r8)
                if (r7 != 0) goto L86
                return r2
            L86:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.input.files.FileUploadWorker.Args.equals(java.lang.Object):boolean");
        }

        /* JADX INFO: renamed from: getAccountId-islZJdo, reason: not valid java name */
        public final String m678getAccountIdislZJdo() {
            return this.accountId;
        }

        public final ChatEvents$AddAttachment getAnalyticsEvent() {
            return this.analyticsEvent;
        }

        public final String getCacheFilePath() {
            return this.cacheFilePath;
        }

        /* JADX INFO: renamed from: getChatId-CAG_bmg, reason: not valid java name */
        public final String m679getChatIdCAG_bmg() {
            return this.chatId;
        }

        public final long getEnqueuingProcessStart() {
            return this.enqueuingProcessStart;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getMediaType() {
            return this.mediaType;
        }

        /* JADX INFO: renamed from: getOrganizationId-XjkXN6I, reason: not valid java name */
        public final String m680getOrganizationIdXjkXN6I() {
            return this.organizationId;
        }

        public final boolean getReportProgress() {
            return this.reportProgress;
        }

        public final String getUploadId() {
            return this.uploadId;
        }

        public final ChatEvents$UploadSource getUploadSource() {
            return this.uploadSource;
        }

        public int hashCode() {
            int iL = kgh.l(kgh.l(this.uploadId.hashCode() * 31, 31, this.fileName), 31, this.mediaType);
            String str = this.chatId;
            return this.cacheFilePath.hashCode() + vb7.e(fsh.p((this.analyticsEvent.hashCode() + ((this.uploadSource.hashCode() + ((OrganizationId.m1069hashCodeimpl(this.organizationId) + ((AccountId.m947hashCodeimpl(this.accountId) + ((iL + (str == null ? 0 : ChatId.m982hashCodeimpl(str))) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.reportProgress), 31, this.enqueuingProcessStart);
        }

        public String toString() {
            String str = this.uploadId;
            String str2 = this.fileName;
            String str3 = this.mediaType;
            String str4 = this.chatId;
            String strM983toStringimpl = str4 == null ? "null" : ChatId.m983toStringimpl(str4);
            String strM948toStringimpl = AccountId.m948toStringimpl(this.accountId);
            String strM1070toStringimpl = OrganizationId.m1070toStringimpl(this.organizationId);
            ChatEvents$UploadSource chatEvents$UploadSource = this.uploadSource;
            ChatEvents$AddAttachment chatEvents$AddAttachment = this.analyticsEvent;
            boolean z = this.reportProgress;
            long j = this.enqueuingProcessStart;
            String str5 = this.cacheFilePath;
            StringBuilder sbR = kgh.r("Args(uploadId=", str, ", fileName=", str2, ", mediaType=");
            kgh.u(sbR, str3, ", chatId=", strM983toStringimpl, ", accountId=");
            kgh.u(sbR, strM948toStringimpl, ", organizationId=", strM1070toStringimpl, ", uploadSource=");
            sbR.append(chatEvents$UploadSource);
            sbR.append(", analyticsEvent=");
            sbR.append(chatEvents$AddAttachment);
            sbR.append(", reportProgress=");
            sbR.append(z);
            sbR.append(", enqueuingProcessStart=");
            sbR.append(j);
            return kgh.q(sbR, ", cacheFilePath=", str5, ")");
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

        private Args(String str, String str2, String str3, String str4, String str5, String str6, ChatEvents$UploadSource chatEvents$UploadSource, ChatEvents$AddAttachment chatEvents$AddAttachment, boolean z, long j, String str7) {
            y6a.s(str, str2, str3, str5, str6);
            chatEvents$UploadSource.getClass();
            chatEvents$AddAttachment.getClass();
            str7.getClass();
            this.uploadId = str;
            this.fileName = str2;
            this.mediaType = str3;
            this.chatId = str4;
            this.accountId = str5;
            this.organizationId = str6;
            this.uploadSource = chatEvents$UploadSource;
            this.analyticsEvent = chatEvents$AddAttachment;
            this.reportProgress = z;
            this.enqueuingProcessStart = j;
            this.cacheFilePath = str7;
        }

        public /* synthetic */ Args(String str, String str2, String str3, String str4, String str5, String str6, ChatEvents$UploadSource chatEvents$UploadSource, ChatEvents$AddAttachment chatEvents$AddAttachment, boolean z, long j, String str7, mq5 mq5Var) {
            this(str, str2, str3, str4, str5, str6, chatEvents$UploadSource, chatEvents$AddAttachment, z, j, str7);
        }

        public /* synthetic */ Args(int i, String str, String str2, String str3, String str4, String str5, String str6, ChatEvents$UploadSource chatEvents$UploadSource, ChatEvents$AddAttachment chatEvents$AddAttachment, boolean z, long j, String str7, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, str3, str4, str5, str6, chatEvents$UploadSource, chatEvents$AddAttachment, z, j, str7, vnfVar);
        }

        public /* synthetic */ Args(String str, String str2, String str3, String str4, String str5, String str6, ChatEvents$UploadSource chatEvents$UploadSource, ChatEvents$AddAttachment chatEvents$AddAttachment, boolean z, long j, String str7, int i, mq5 mq5Var) {
            this(str, str2, str3, str4, str5, str6, chatEvents$UploadSource, chatEvents$AddAttachment, z, (i & 512) != 0 ? 0L : j, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? "" : str7, null);
        }
    }
}
