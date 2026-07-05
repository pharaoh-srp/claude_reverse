package com.anthropic.claude.conway.protocol;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nl8;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0003*+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006-"}, d2 = {"Lcom/anthropic/claude/conway/protocol/HealthResponse;", "", "", "probeId", "Lcom/anthropic/claude/conway/protocol/HealthResponse$Result;", "result", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/conway/protocol/HealthResponse$Result;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/conway/protocol/HealthResponse$Result;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/HealthResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/conway/protocol/HealthResponse$Result;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/conway/protocol/HealthResponse$Result;)Lcom/anthropic/claude/conway/protocol/HealthResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProbeId", "getProbeId$annotations", "()V", "Lcom/anthropic/claude/conway/protocol/HealthResponse$Result;", "getResult", "Companion", "Result", "com/anthropic/claude/conway/protocol/c0", "nl8", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthResponse {
    public static final int $stable = 0;
    public static final nl8 Companion = new nl8();
    private final String probeId;
    private final Result result;

    public /* synthetic */ HealthResponse(int i, String str, Result result, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, c0.a.getDescriptor());
            throw null;
        }
        this.probeId = str;
        this.result = result;
    }

    public static /* synthetic */ HealthResponse copy$default(HealthResponse healthResponse, String str, Result result, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthResponse.probeId;
        }
        if ((i & 2) != 0) {
            result = healthResponse.result;
        }
        return healthResponse.copy(str, result);
    }

    public static /* synthetic */ void getProbeId$annotations() {
    }

    public static final /* synthetic */ void write$Self$conway(HealthResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.probeId);
        output.r(serialDesc, 1, d0.a, self.result);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProbeId() {
        return this.probeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Result getResult() {
        return this.result;
    }

    public final HealthResponse copy(String probeId, Result result) {
        probeId.getClass();
        result.getClass();
        return new HealthResponse(probeId, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthResponse)) {
            return false;
        }
        HealthResponse healthResponse = (HealthResponse) other;
        return x44.r(this.probeId, healthResponse.probeId) && x44.r(this.result, healthResponse.result);
    }

    public final String getProbeId() {
        return this.probeId;
    }

    public final Result getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode() + (this.probeId.hashCode() * 31);
    }

    public String toString() {
        return "HealthResponse(probeId=" + this.probeId + ", result=" + this.result + ")";
    }

    public HealthResponse(String str, Result result) {
        str.getClass();
        result.getClass();
        this.probeId = str;
        this.result = result;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0019¨\u0006)"}, d2 = {"Lcom/anthropic/claude/conway/protocol/HealthResponse$Result;", "", "", "ok", "", "error", "<init>", "(ZLjava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/HealthResponse$Result;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/anthropic/claude/conway/protocol/HealthResponse$Result;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getOk", "Ljava/lang/String;", "getError", "Companion", "com/anthropic/claude/conway/protocol/d0", "com/anthropic/claude/conway/protocol/e0", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Result {
        public static final int $stable = 0;
        public static final e0 Companion = new e0();
        private final String error;
        private final boolean ok;

        public /* synthetic */ Result(int i, boolean z, String str, vnf vnfVar) {
            if (1 != (i & 1)) {
                gvj.f(i, 1, d0.a.getDescriptor());
                throw null;
            }
            this.ok = z;
            if ((i & 2) == 0) {
                this.error = null;
            } else {
                this.error = str;
            }
        }

        public static /* synthetic */ Result copy$default(Result result, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = result.ok;
            }
            if ((i & 2) != 0) {
                str = result.error;
            }
            return result.copy(z, str);
        }

        public static final /* synthetic */ void write$Self$conway(Result self, vd4 output, SerialDescriptor serialDesc) {
            output.p(serialDesc, 0, self.ok);
            if (!output.E(serialDesc) && self.error == null) {
                return;
            }
            output.B(serialDesc, 1, srg.a, self.error);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getOk() {
            return this.ok;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getError() {
            return this.error;
        }

        public final Result copy(boolean ok, String error) {
            return new Result(ok, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return this.ok == result.ok && x44.r(this.error, result.error);
        }

        public final String getError() {
            return this.error;
        }

        public final boolean getOk() {
            return this.ok;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.ok) * 31;
            String str = this.error;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Result(ok=" + this.ok + ", error=" + this.error + ")";
        }

        public Result(boolean z, String str) {
            this.ok = z;
            this.error = str;
        }

        public /* synthetic */ Result(boolean z, String str, int i, mq5 mq5Var) {
            this(z, (i & 2) != 0 ? null : str);
        }
    }
}
