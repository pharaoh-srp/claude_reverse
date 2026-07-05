package com.anthropic.claude.sessions.types;

import defpackage.c97;
import defpackage.gvj;
import defpackage.h38;
import defpackage.i38;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mhe;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lcom/anthropic/claude/sessions/types/GetBatchBranchStatusRequest;", "", "", "Lcom/anthropic/claude/sessions/types/RepoBranch;", "repo_branches", "", "session_id", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/GetBatchBranchStatusRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/GetBatchBranchStatusRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRepo_branches", "Ljava/lang/String;", "getSession_id", "Companion", "h38", "i38", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GetBatchBranchStatusRequest {
    private final List<RepoBranch> repo_branches;
    private final String session_id;
    public static final i38 Companion = new i38();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new c97(15)), null};

    public /* synthetic */ GetBatchBranchStatusRequest(int i, List list, String str, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, h38.a.getDescriptor());
            throw null;
        }
        this.repo_branches = list;
        if ((i & 2) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(mhe.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetBatchBranchStatusRequest copy$default(GetBatchBranchStatusRequest getBatchBranchStatusRequest, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getBatchBranchStatusRequest.repo_branches;
        }
        if ((i & 2) != 0) {
            str = getBatchBranchStatusRequest.session_id;
        }
        return getBatchBranchStatusRequest.copy(list, str);
    }

    public static final /* synthetic */ void write$Self$sessions(GetBatchBranchStatusRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.repo_branches);
        if (!output.E(serialDesc) && self.session_id == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.session_id);
    }

    public final List<RepoBranch> component1() {
        return this.repo_branches;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    public final GetBatchBranchStatusRequest copy(List<RepoBranch> repo_branches, String session_id) {
        repo_branches.getClass();
        return new GetBatchBranchStatusRequest(repo_branches, session_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetBatchBranchStatusRequest)) {
            return false;
        }
        GetBatchBranchStatusRequest getBatchBranchStatusRequest = (GetBatchBranchStatusRequest) other;
        return x44.r(this.repo_branches, getBatchBranchStatusRequest.repo_branches) && x44.r(this.session_id, getBatchBranchStatusRequest.session_id);
    }

    public final List<RepoBranch> getRepo_branches() {
        return this.repo_branches;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        int iHashCode = this.repo_branches.hashCode() * 31;
        String str = this.session_id;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GetBatchBranchStatusRequest(repo_branches=" + this.repo_branches + ", session_id=" + this.session_id + ")";
    }

    public GetBatchBranchStatusRequest(List<RepoBranch> list, String str) {
        list.getClass();
        this.repo_branches = list;
        this.session_id = str;
    }

    public /* synthetic */ GetBatchBranchStatusRequest(List list, String str, int i, mq5 mq5Var) {
        this(list, (i & 2) != 0 ? null : str);
    }
}
