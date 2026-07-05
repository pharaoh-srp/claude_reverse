package com.anthropic.claude.sessions.types;

import defpackage.e79;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pgj;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006%"}, d2 = {"Lcom/anthropic/claude/sessions/types/WorkQueueStats;", "", "", "workers_polling", "<init>", "(Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/WorkQueueStats;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/anthropic/claude/sessions/types/WorkQueueStats;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getWorkers_polling", "Companion", "ogj", "pgj", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class WorkQueueStats {
    public static final pgj Companion = new pgj();
    private final Integer workers_polling;

    public /* synthetic */ WorkQueueStats(int i, Integer num, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.workers_polling = null;
        } else {
            this.workers_polling = num;
        }
    }

    public static /* synthetic */ WorkQueueStats copy$default(WorkQueueStats workQueueStats, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = workQueueStats.workers_polling;
        }
        return workQueueStats.copy(num);
    }

    public static final /* synthetic */ void write$Self$sessions(WorkQueueStats self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.workers_polling == null) {
            return;
        }
        output.B(serialDesc, 0, e79.a, self.workers_polling);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getWorkers_polling() {
        return this.workers_polling;
    }

    public final WorkQueueStats copy(Integer workers_polling) {
        return new WorkQueueStats(workers_polling);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WorkQueueStats) && x44.r(this.workers_polling, ((WorkQueueStats) other).workers_polling);
    }

    public final Integer getWorkers_polling() {
        return this.workers_polling;
    }

    public int hashCode() {
        Integer num = this.workers_polling;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "WorkQueueStats(workers_polling=" + this.workers_polling + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkQueueStats() {
        this((Integer) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public WorkQueueStats(Integer num) {
        this.workers_polling = num;
    }

    public /* synthetic */ WorkQueueStats(Integer num, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : num);
    }
}
