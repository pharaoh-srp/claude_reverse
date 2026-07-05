package com.anthropic.claude.sessions.types;

import defpackage.c97;
import defpackage.f58;
import defpackage.gvj;
import defpackage.h58;
import defpackage.i58;
import defpackage.kw9;
import defpackage.mdj;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JB\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u001dR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010 ¨\u00067"}, d2 = {"Lcom/anthropic/claude/sessions/types/GitHubBranchListResponse;", "", "", "Lcom/anthropic/claude/sessions/types/GitHubBranch;", "data", "", "defaultBranch", "lastId", "", "hasMore", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/GitHubBranchListResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)Lcom/anthropic/claude/sessions/types/GitHubBranchListResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getData", "Ljava/lang/String;", "getDefaultBranch", "getDefaultBranch$annotations", "()V", "getLastId", "getLastId$annotations", "Z", "getHasMore", "getHasMore$annotations", "Companion", "h58", "i58", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GitHubBranchListResponse {
    private final List<GitHubBranch> data;
    private final String defaultBranch;
    private final boolean hasMore;
    private final String lastId;
    public static final i58 Companion = new i58();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new c97(19)), null, null, null};

    public /* synthetic */ GitHubBranchListResponse(int i, List list, String str, String str2, boolean z, vnf vnfVar) {
        if (9 != (i & 9)) {
            gvj.f(i, 9, h58.a.getDescriptor());
            throw null;
        }
        this.data = list;
        if ((i & 2) == 0) {
            this.defaultBranch = null;
        } else {
            this.defaultBranch = str;
        }
        if ((i & 4) == 0) {
            this.lastId = null;
        } else {
            this.lastId = str2;
        }
        this.hasMore = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(f58.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GitHubBranchListResponse copy$default(GitHubBranchListResponse gitHubBranchListResponse, List list, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = gitHubBranchListResponse.data;
        }
        if ((i & 2) != 0) {
            str = gitHubBranchListResponse.defaultBranch;
        }
        if ((i & 4) != 0) {
            str2 = gitHubBranchListResponse.lastId;
        }
        if ((i & 8) != 0) {
            z = gitHubBranchListResponse.hasMore;
        }
        return gitHubBranchListResponse.copy(list, str, str2, z);
    }

    public static /* synthetic */ void getDefaultBranch$annotations() {
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public static /* synthetic */ void getLastId$annotations() {
    }

    public static final /* synthetic */ void write$Self$sessions(GitHubBranchListResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.data);
        if (output.E(serialDesc) || self.defaultBranch != null) {
            output.B(serialDesc, 1, srg.a, self.defaultBranch);
        }
        if (output.E(serialDesc) || self.lastId != null) {
            output.B(serialDesc, 2, srg.a, self.lastId);
        }
        output.p(serialDesc, 3, self.hasMore);
    }

    public final List<GitHubBranch> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDefaultBranch() {
        return this.defaultBranch;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastId() {
        return this.lastId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final GitHubBranchListResponse copy(List<GitHubBranch> data, String defaultBranch, String lastId, boolean hasMore) {
        data.getClass();
        return new GitHubBranchListResponse(data, defaultBranch, lastId, hasMore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GitHubBranchListResponse)) {
            return false;
        }
        GitHubBranchListResponse gitHubBranchListResponse = (GitHubBranchListResponse) other;
        return x44.r(this.data, gitHubBranchListResponse.data) && x44.r(this.defaultBranch, gitHubBranchListResponse.defaultBranch) && x44.r(this.lastId, gitHubBranchListResponse.lastId) && this.hasMore == gitHubBranchListResponse.hasMore;
    }

    public final List<GitHubBranch> getData() {
        return this.data;
    }

    public final String getDefaultBranch() {
        return this.defaultBranch;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getLastId() {
        return this.lastId;
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        String str = this.defaultBranch;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastId;
        return Boolean.hashCode(this.hasMore) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "GitHubBranchListResponse(data=" + this.data + ", defaultBranch=" + this.defaultBranch + ", lastId=" + this.lastId + ", hasMore=" + this.hasMore + ")";
    }

    public GitHubBranchListResponse(List<GitHubBranch> list, String str, String str2, boolean z) {
        list.getClass();
        this.data = list;
        this.defaultBranch = str;
        this.lastId = str2;
        this.hasMore = z;
    }

    public /* synthetic */ GitHubBranchListResponse(List list, String str, String str2, boolean z, int i, mq5 mq5Var) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, z);
    }
}
