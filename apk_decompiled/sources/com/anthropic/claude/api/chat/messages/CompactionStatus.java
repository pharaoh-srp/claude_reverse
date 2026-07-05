package com.anthropic.claude.api.chat.messages;

import defpackage.fq6;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.l84;
import defpackage.m84;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.oq5;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0003()*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/CompactionStatus;", "", "Lcom/anthropic/claude/api/chat/messages/CompactionStatus$Status;", "status", "", "message", "<init>", "(Lcom/anthropic/claude/api/chat/messages/CompactionStatus$Status;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/chat/messages/CompactionStatus$Status;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/CompactionStatus;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/chat/messages/CompactionStatus$Status;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/api/chat/messages/CompactionStatus$Status;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/messages/CompactionStatus;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/chat/messages/CompactionStatus$Status;", "getStatus", "Ljava/lang/String;", "getMessage", "Companion", "Status", "com/anthropic/claude/api/chat/messages/a", "m84", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CompactionStatus {
    public static final int $stable = 0;
    private final String message;
    private final Status status;
    public static final m84 Companion = new m84();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new l84(0)), null};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/CompactionStatus$Status;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/anthropic/claude/api/chat/messages/b", "COMPACTING", "COMPLETE", "FAILED", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final class Status {
        private static final /* synthetic */ fq6 $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private static final kw9 $cachedSerializer$delegate;
        public static final b Companion;
        public static final Status COMPACTING = new Status("COMPACTING", 0);
        public static final Status COMPLETE = new Status("COMPLETE", 1);
        public static final Status FAILED = new Status("FAILED", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{COMPACTING, COMPLETE, FAILED};
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = wd6.n0(statusArr$values);
            Companion = new b();
            $cachedSerializer$delegate = yb5.w(w1a.F, new l84(1));
        }

        private Status(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return oq5.w("com.anthropic.claude.api.chat.messages.CompactionStatus.Status", values(), new String[]{"compacting", "complete", "failed"}, new Annotation[][]{null, null, null});
        }

        public static fq6 getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public /* synthetic */ CompactionStatus(int i, Status status, String str, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.status = status;
        if ((i & 2) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Status.Companion.serializer();
    }

    public static /* synthetic */ CompactionStatus copy$default(CompactionStatus compactionStatus, Status status, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            status = compactionStatus.status;
        }
        if ((i & 2) != 0) {
            str = compactionStatus.message;
        }
        return compactionStatus.copy(status, str);
    }

    public static final /* synthetic */ void write$Self$api(CompactionStatus self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.status);
        if (!output.E(serialDesc) && self.message == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.message);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final CompactionStatus copy(Status status, String message) {
        status.getClass();
        return new CompactionStatus(status, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompactionStatus)) {
            return false;
        }
        CompactionStatus compactionStatus = (CompactionStatus) other;
        return this.status == compactionStatus.status && x44.r(this.message, compactionStatus.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.message;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CompactionStatus(status=" + this.status + ", message=" + this.message + ")";
    }

    public CompactionStatus(Status status, String str) {
        status.getClass();
        this.status = status;
        this.message = str;
    }

    public /* synthetic */ CompactionStatus(Status status, String str, int i, mq5 mq5Var) {
        this(status, (i & 2) != 0 ? null : str);
    }
}
