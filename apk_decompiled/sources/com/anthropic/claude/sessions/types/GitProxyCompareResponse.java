package com.anthropic.claude.sessions.types;

import defpackage.c97;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.q58;
import defpackage.qy1;
import defpackage.srg;
import defpackage.u58;
import defpackage.uo0;
import defpackage.v58;
import defpackage.vb7;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ^\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010 J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b3\u0010 R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b4\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b7\u0010\u001d¨\u0006;"}, d2 = {"Lcom/anthropic/claude/sessions/types/GitProxyCompareResponse;", "", "", "base_branch", "head_branch", "", "ahead_by", "behind_by", "total_commits", "", "Lcom/anthropic/claude/sessions/types/GitProxyCompareFile;", "files", "diff_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IIILjava/util/List;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/GitProxyCompareResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/GitProxyCompareResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBase_branch", "getHead_branch", "I", "getAhead_by", "getBehind_by", "getTotal_commits", "Ljava/util/List;", "getFiles", "getDiff_url", "Companion", "u58", "v58", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GitProxyCompareResponse {
    private final int ahead_by;
    private final String base_branch;
    private final int behind_by;
    private final String diff_url;
    private final List<GitProxyCompareFile> files;
    private final String head_branch;
    private final int total_commits;
    public static final v58 Companion = new v58();
    private static final kw9[] $childSerializers = {null, null, null, null, null, yb5.w(w1a.F, new c97(21)), null};

    public /* synthetic */ GitProxyCompareResponse(int i, String str, String str2, int i2, int i3, int i4, List list, String str3, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, u58.a.getDescriptor());
            throw null;
        }
        this.base_branch = str;
        this.head_branch = str2;
        this.ahead_by = i2;
        this.behind_by = i3;
        this.total_commits = i4;
        this.files = list;
        if ((i & 64) == 0) {
            this.diff_url = null;
        } else {
            this.diff_url = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(q58.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GitProxyCompareResponse copy$default(GitProxyCompareResponse gitProxyCompareResponse, String str, String str2, int i, int i2, int i3, List list, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = gitProxyCompareResponse.base_branch;
        }
        if ((i4 & 2) != 0) {
            str2 = gitProxyCompareResponse.head_branch;
        }
        if ((i4 & 4) != 0) {
            i = gitProxyCompareResponse.ahead_by;
        }
        if ((i4 & 8) != 0) {
            i2 = gitProxyCompareResponse.behind_by;
        }
        if ((i4 & 16) != 0) {
            i3 = gitProxyCompareResponse.total_commits;
        }
        if ((i4 & 32) != 0) {
            list = gitProxyCompareResponse.files;
        }
        if ((i4 & 64) != 0) {
            str3 = gitProxyCompareResponse.diff_url;
        }
        List list2 = list;
        String str4 = str3;
        int i5 = i3;
        int i6 = i;
        return gitProxyCompareResponse.copy(str, str2, i6, i2, i5, list2, str4);
    }

    public static final /* synthetic */ void write$Self$sessions(GitProxyCompareResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.base_branch);
        output.q(serialDesc, 1, self.head_branch);
        output.l(2, self.ahead_by, serialDesc);
        output.l(3, self.behind_by, serialDesc);
        output.l(4, self.total_commits, serialDesc);
        output.r(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.files);
        if (!output.E(serialDesc) && self.diff_url == null) {
            return;
        }
        output.B(serialDesc, 6, srg.a, self.diff_url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBase_branch() {
        return this.base_branch;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHead_branch() {
        return this.head_branch;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAhead_by() {
        return this.ahead_by;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBehind_by() {
        return this.behind_by;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotal_commits() {
        return this.total_commits;
    }

    public final List<GitProxyCompareFile> component6() {
        return this.files;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDiff_url() {
        return this.diff_url;
    }

    public final GitProxyCompareResponse copy(String base_branch, String head_branch, int ahead_by, int behind_by, int total_commits, List<GitProxyCompareFile> files, String diff_url) {
        base_branch.getClass();
        head_branch.getClass();
        files.getClass();
        return new GitProxyCompareResponse(base_branch, head_branch, ahead_by, behind_by, total_commits, files, diff_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GitProxyCompareResponse)) {
            return false;
        }
        GitProxyCompareResponse gitProxyCompareResponse = (GitProxyCompareResponse) other;
        return x44.r(this.base_branch, gitProxyCompareResponse.base_branch) && x44.r(this.head_branch, gitProxyCompareResponse.head_branch) && this.ahead_by == gitProxyCompareResponse.ahead_by && this.behind_by == gitProxyCompareResponse.behind_by && this.total_commits == gitProxyCompareResponse.total_commits && x44.r(this.files, gitProxyCompareResponse.files) && x44.r(this.diff_url, gitProxyCompareResponse.diff_url);
    }

    public final int getAhead_by() {
        return this.ahead_by;
    }

    public final String getBase_branch() {
        return this.base_branch;
    }

    public final int getBehind_by() {
        return this.behind_by;
    }

    public final String getDiff_url() {
        return this.diff_url;
    }

    public final List<GitProxyCompareFile> getFiles() {
        return this.files;
    }

    public final String getHead_branch() {
        return this.head_branch;
    }

    public final int getTotal_commits() {
        return this.total_commits;
    }

    public int hashCode() {
        int iM = kgh.m(vb7.c(this.total_commits, vb7.c(this.behind_by, vb7.c(this.ahead_by, kgh.l(this.base_branch.hashCode() * 31, 31, this.head_branch), 31), 31), 31), 31, this.files);
        String str = this.diff_url;
        return iM + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.base_branch;
        String str2 = this.head_branch;
        int i = this.ahead_by;
        int i2 = this.behind_by;
        int i3 = this.total_commits;
        List<GitProxyCompareFile> list = this.files;
        String str3 = this.diff_url;
        StringBuilder sbR = kgh.r("GitProxyCompareResponse(base_branch=", str, ", head_branch=", str2, ", ahead_by=");
        qy1.k(i, i2, ", behind_by=", ", total_commits=", sbR);
        sbR.append(i3);
        sbR.append(", files=");
        sbR.append(list);
        sbR.append(", diff_url=");
        return ij0.m(sbR, str3, ")");
    }

    public GitProxyCompareResponse(String str, String str2, int i, int i2, int i3, List<GitProxyCompareFile> list, String str3) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.base_branch = str;
        this.head_branch = str2;
        this.ahead_by = i;
        this.behind_by = i2;
        this.total_commits = i3;
        this.files = list;
        this.diff_url = str3;
    }

    public /* synthetic */ GitProxyCompareResponse(String str, String str2, int i, int i2, int i3, List list, String str3, int i4, mq5 mq5Var) {
        this(str, str2, i, i2, i3, list, (i4 & 64) != 0 ? null : str3);
    }
}
