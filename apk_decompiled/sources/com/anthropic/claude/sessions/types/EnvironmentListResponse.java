package com.anthropic.claude.sessions.types;

import defpackage.fc6;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xq6;
import defpackage.yb5;
import defpackage.yq6;
import defpackage.znf;
import defpackage.zq6;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJB\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b/\u0010\u001f¨\u00063"}, d2 = {"Lcom/anthropic/claude/sessions/types/EnvironmentListResponse;", "", "", "Lcom/anthropic/claude/sessions/types/EnvironmentResource;", "environments", "", "has_more", "", "first_id", "last_id", "<init>", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;ZLjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/EnvironmentListResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "copy", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/EnvironmentListResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEnvironments", "Z", "getHas_more", "Ljava/lang/String;", "getFirst_id", "getLast_id", "Companion", "xq6", "yq6", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EnvironmentListResponse {
    private final List<EnvironmentResource> environments;
    private final String first_id;
    private final boolean has_more;
    private final String last_id;
    public static final yq6 Companion = new yq6();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new fc6(23)), null, null, null};

    public /* synthetic */ EnvironmentListResponse(int i, List list, boolean z, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, xq6.a.getDescriptor());
            throw null;
        }
        this.environments = list;
        this.has_more = z;
        if ((i & 4) == 0) {
            this.first_id = null;
        } else {
            this.first_id = str;
        }
        if ((i & 8) == 0) {
            this.last_id = null;
        } else {
            this.last_id = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(zq6.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnvironmentListResponse copy$default(EnvironmentListResponse environmentListResponse, List list, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = environmentListResponse.environments;
        }
        if ((i & 2) != 0) {
            z = environmentListResponse.has_more;
        }
        if ((i & 4) != 0) {
            str = environmentListResponse.first_id;
        }
        if ((i & 8) != 0) {
            str2 = environmentListResponse.last_id;
        }
        return environmentListResponse.copy(list, z, str, str2);
    }

    public static final /* synthetic */ void write$Self$sessions(EnvironmentListResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.environments);
        output.p(serialDesc, 1, self.has_more);
        if (output.E(serialDesc) || self.first_id != null) {
            output.B(serialDesc, 2, srg.a, self.first_id);
        }
        if (!output.E(serialDesc) && self.last_id == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.last_id);
    }

    public final List<EnvironmentResource> component1() {
        return this.environments;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHas_more() {
        return this.has_more;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFirst_id() {
        return this.first_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLast_id() {
        return this.last_id;
    }

    public final EnvironmentListResponse copy(List<EnvironmentResource> environments, boolean has_more, String first_id, String last_id) {
        environments.getClass();
        return new EnvironmentListResponse(environments, has_more, first_id, last_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnvironmentListResponse)) {
            return false;
        }
        EnvironmentListResponse environmentListResponse = (EnvironmentListResponse) other;
        return x44.r(this.environments, environmentListResponse.environments) && this.has_more == environmentListResponse.has_more && x44.r(this.first_id, environmentListResponse.first_id) && x44.r(this.last_id, environmentListResponse.last_id);
    }

    public final List<EnvironmentResource> getEnvironments() {
        return this.environments;
    }

    public final String getFirst_id() {
        return this.first_id;
    }

    public final boolean getHas_more() {
        return this.has_more;
    }

    public final String getLast_id() {
        return this.last_id;
    }

    public int hashCode() {
        int iP = fsh.p(this.environments.hashCode() * 31, 31, this.has_more);
        String str = this.first_id;
        int iHashCode = (iP + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.last_id;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List<EnvironmentResource> list = this.environments;
        boolean z = this.has_more;
        String str = this.first_id;
        String str2 = this.last_id;
        StringBuilder sb = new StringBuilder("EnvironmentListResponse(environments=");
        sb.append(list);
        sb.append(", has_more=");
        sb.append(z);
        sb.append(", first_id=");
        return vb7.t(sb, str, ", last_id=", str2, ")");
    }

    public EnvironmentListResponse(List<EnvironmentResource> list, boolean z, String str, String str2) {
        list.getClass();
        this.environments = list;
        this.has_more = z;
        this.first_id = str;
        this.last_id = str2;
    }

    public /* synthetic */ EnvironmentListResponse(List list, boolean z, String str, String str2, int i, mq5 mq5Var) {
        this(list, z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
