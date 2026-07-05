package com.anthropic.claude.sessions.types;

import defpackage.e79;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mjf;
import defpackage.mq5;
import defpackage.njf;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u001b¨\u0006/"}, d2 = {"Lcom/anthropic/claude/sessions/types/SelfHostedRunnerPool;", "", "", "pool_id", "name", "", "alive_runner_count", "pending_session_count", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SelfHostedRunnerPool;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/anthropic/claude/sessions/types/SelfHostedRunnerPool;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPool_id", "getName", "Ljava/lang/Integer;", "getAlive_runner_count", "getPending_session_count", "Companion", "mjf", "njf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SelfHostedRunnerPool {
    public static final njf Companion = new njf();
    private final Integer alive_runner_count;
    private final String name;
    private final Integer pending_session_count;
    private final String pool_id;

    public /* synthetic */ SelfHostedRunnerPool(int i, String str, String str2, Integer num, Integer num2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, mjf.a.getDescriptor());
            throw null;
        }
        this.pool_id = str;
        this.name = str2;
        if ((i & 4) == 0) {
            this.alive_runner_count = null;
        } else {
            this.alive_runner_count = num;
        }
        if ((i & 8) == 0) {
            this.pending_session_count = null;
        } else {
            this.pending_session_count = num2;
        }
    }

    public static /* synthetic */ SelfHostedRunnerPool copy$default(SelfHostedRunnerPool selfHostedRunnerPool, String str, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selfHostedRunnerPool.pool_id;
        }
        if ((i & 2) != 0) {
            str2 = selfHostedRunnerPool.name;
        }
        if ((i & 4) != 0) {
            num = selfHostedRunnerPool.alive_runner_count;
        }
        if ((i & 8) != 0) {
            num2 = selfHostedRunnerPool.pending_session_count;
        }
        return selfHostedRunnerPool.copy(str, str2, num, num2);
    }

    public static final /* synthetic */ void write$Self$sessions(SelfHostedRunnerPool self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.pool_id);
        output.q(serialDesc, 1, self.name);
        if (output.E(serialDesc) || self.alive_runner_count != null) {
            output.B(serialDesc, 2, e79.a, self.alive_runner_count);
        }
        if (!output.E(serialDesc) && self.pending_session_count == null) {
            return;
        }
        output.B(serialDesc, 3, e79.a, self.pending_session_count);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPool_id() {
        return this.pool_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getAlive_runner_count() {
        return this.alive_runner_count;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getPending_session_count() {
        return this.pending_session_count;
    }

    public final SelfHostedRunnerPool copy(String pool_id, String name, Integer alive_runner_count, Integer pending_session_count) {
        pool_id.getClass();
        name.getClass();
        return new SelfHostedRunnerPool(pool_id, name, alive_runner_count, pending_session_count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfHostedRunnerPool)) {
            return false;
        }
        SelfHostedRunnerPool selfHostedRunnerPool = (SelfHostedRunnerPool) other;
        return x44.r(this.pool_id, selfHostedRunnerPool.pool_id) && x44.r(this.name, selfHostedRunnerPool.name) && x44.r(this.alive_runner_count, selfHostedRunnerPool.alive_runner_count) && x44.r(this.pending_session_count, selfHostedRunnerPool.pending_session_count);
    }

    public final Integer getAlive_runner_count() {
        return this.alive_runner_count;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getPending_session_count() {
        return this.pending_session_count;
    }

    public final String getPool_id() {
        return this.pool_id;
    }

    public int hashCode() {
        int iL = kgh.l(this.pool_id.hashCode() * 31, 31, this.name);
        Integer num = this.alive_runner_count;
        int iHashCode = (iL + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pending_session_count;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.pool_id;
        String str2 = this.name;
        Integer num = this.alive_runner_count;
        Integer num2 = this.pending_session_count;
        StringBuilder sbR = kgh.r("SelfHostedRunnerPool(pool_id=", str, ", name=", str2, ", alive_runner_count=");
        sbR.append(num);
        sbR.append(", pending_session_count=");
        sbR.append(num2);
        sbR.append(")");
        return sbR.toString();
    }

    public SelfHostedRunnerPool(String str, String str2, Integer num, Integer num2) {
        str.getClass();
        str2.getClass();
        this.pool_id = str;
        this.name = str2;
        this.alive_runner_count = num;
        this.pending_session_count = num2;
    }

    public /* synthetic */ SelfHostedRunnerPool(String str, String str2, Integer num, Integer num2, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }
}
