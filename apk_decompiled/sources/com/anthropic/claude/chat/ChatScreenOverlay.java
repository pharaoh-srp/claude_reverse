package com.anthropic.claude.chat;

import com.anthropic.claude.types.strings.TaskId;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.w53;
import defpackage.yb5;
import defpackage.z5h;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bs\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/chat/ChatScreenOverlay;", "", "Companion", "None", "BrowserTakeover", "com/anthropic/claude/chat/i", "Lcom/anthropic/claude/chat/ChatScreenOverlay$BrowserTakeover;", "Lcom/anthropic/claude/chat/ChatScreenOverlay$None;", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface ChatScreenOverlay {
    public static final i Companion = i.a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/chat/ChatScreenOverlay$None;", "Lcom/anthropic/claude/chat/ChatScreenOverlay;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class None implements ChatScreenOverlay {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new w53(16));

        private None() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.ChatScreenOverlay.None", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return -185104273;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "None";
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J&\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/chat/ChatScreenOverlay$BrowserTakeover;", "Lcom/anthropic/claude/chat/ChatScreenOverlay;", "", "takeoverPath", "Lcom/anthropic/claude/types/strings/TaskId;", "taskId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/ChatScreenOverlay$BrowserTakeover;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2-ucJv0z8", "component2", "copy-WrWafIQ", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/chat/ChatScreenOverlay$BrowserTakeover;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTakeoverPath", "getTaskId-ucJv0z8", "Companion", "com/anthropic/claude/chat/g", "com/anthropic/claude/chat/h", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class BrowserTakeover implements ChatScreenOverlay {
        public static final int $stable = 0;
        public static final h Companion = new h();
        private final String takeoverPath;
        private final String taskId;

        private /* synthetic */ BrowserTakeover(int i, String str, String str2, vnf vnfVar) {
            if (1 != (i & 1)) {
                gvj.f(i, 1, g.a.getDescriptor());
                throw null;
            }
            this.takeoverPath = str;
            if ((i & 2) == 0) {
                this.taskId = null;
            } else {
                this.taskId = str2;
            }
        }

        /* JADX INFO: renamed from: copy-WrWafIQ$default, reason: not valid java name */
        public static /* synthetic */ BrowserTakeover m580copyWrWafIQ$default(BrowserTakeover browserTakeover, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = browserTakeover.takeoverPath;
            }
            if ((i & 2) != 0) {
                str2 = browserTakeover.taskId;
            }
            return browserTakeover.m582copyWrWafIQ(str, str2);
        }

        public static final /* synthetic */ void write$Self$chat(BrowserTakeover self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.takeoverPath);
            if (!output.E(serialDesc) && self.taskId == null) {
                return;
            }
            z5h z5hVar = z5h.a;
            String str = self.taskId;
            output.B(serialDesc, 1, z5hVar, str != null ? TaskId.m1128boximpl(str) : null);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTakeoverPath() {
            return this.takeoverPath;
        }

        /* JADX INFO: renamed from: component2-ucJv0z8, reason: not valid java name and from getter */
        public final String getTaskId() {
            return this.taskId;
        }

        /* JADX INFO: renamed from: copy-WrWafIQ, reason: not valid java name */
        public final BrowserTakeover m582copyWrWafIQ(String takeoverPath, String taskId) {
            takeoverPath.getClass();
            return new BrowserTakeover(takeoverPath, taskId, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.anthropic.claude.chat.ChatScreenOverlay.BrowserTakeover
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.anthropic.claude.chat.ChatScreenOverlay$BrowserTakeover r5 = (com.anthropic.claude.chat.ChatScreenOverlay.BrowserTakeover) r5
                java.lang.String r1 = r4.takeoverPath
                java.lang.String r3 = r5.takeoverPath
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r4 = r4.taskId
                java.lang.String r5 = r5.taskId
                if (r4 != 0) goto L23
                if (r5 != 0) goto L21
                r4 = r0
                goto L2a
            L21:
                r4 = r2
                goto L2a
            L23:
                if (r5 != 0) goto L26
                goto L21
            L26:
                boolean r4 = com.anthropic.claude.types.strings.TaskId.m1131equalsimpl0(r4, r5)
            L2a:
                if (r4 != 0) goto L2d
                return r2
            L2d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.ChatScreenOverlay.BrowserTakeover.equals(java.lang.Object):boolean");
        }

        public final String getTakeoverPath() {
            return this.takeoverPath;
        }

        /* JADX INFO: renamed from: getTaskId-ucJv0z8, reason: not valid java name */
        public final String m583getTaskIducJv0z8() {
            return this.taskId;
        }

        public int hashCode() {
            int iHashCode = this.takeoverPath.hashCode() * 31;
            String str = this.taskId;
            return iHashCode + (str == null ? 0 : TaskId.m1132hashCodeimpl(str));
        }

        public String toString() {
            String str = this.takeoverPath;
            String str2 = this.taskId;
            return ij0.l("BrowserTakeover(takeoverPath=", str, ", taskId=", str2 == null ? "null" : TaskId.m1133toStringimpl(str2), ")");
        }

        public /* synthetic */ BrowserTakeover(String str, String str2, mq5 mq5Var) {
            this(str, str2);
        }

        public /* synthetic */ BrowserTakeover(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, vnfVar);
        }

        private BrowserTakeover(String str, String str2) {
            str.getClass();
            this.takeoverPath = str;
            this.taskId = str2;
        }

        public /* synthetic */ BrowserTakeover(String str, String str2, int i, mq5 mq5Var) {
            this(str, (i & 2) != 0 ? null : str2, null);
        }
    }
}
