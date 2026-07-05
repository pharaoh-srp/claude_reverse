package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.q58;
import defpackage.qy1;
import defpackage.r58;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fB[\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJZ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b0\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b1\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b3\u0010\u001b¨\u00067"}, d2 = {"Lcom/anthropic/claude/sessions/types/GitProxyCompareFile;", "", "", "filename", "status", "", "additions", "deletions", "changes", "patch", "previous_filename", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/GitProxyCompareFile;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/GitProxyCompareFile;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFilename", "getStatus", "I", "getAdditions", "getDeletions", "getChanges", "getPatch", "getPrevious_filename", "Companion", "q58", "r58", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GitProxyCompareFile {
    public static final r58 Companion = new r58();
    private final int additions;
    private final int changes;
    private final int deletions;
    private final String filename;
    private final String patch;
    private final String previous_filename;
    private final String status;

    public /* synthetic */ GitProxyCompareFile(int i, String str, String str2, int i2, int i3, int i4, String str3, String str4, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, q58.a.getDescriptor());
            throw null;
        }
        this.filename = str;
        this.status = str2;
        this.additions = i2;
        this.deletions = i3;
        this.changes = i4;
        if ((i & 32) == 0) {
            this.patch = null;
        } else {
            this.patch = str3;
        }
        if ((i & 64) == 0) {
            this.previous_filename = null;
        } else {
            this.previous_filename = str4;
        }
    }

    public static /* synthetic */ GitProxyCompareFile copy$default(GitProxyCompareFile gitProxyCompareFile, String str, String str2, int i, int i2, int i3, String str3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = gitProxyCompareFile.filename;
        }
        if ((i4 & 2) != 0) {
            str2 = gitProxyCompareFile.status;
        }
        if ((i4 & 4) != 0) {
            i = gitProxyCompareFile.additions;
        }
        if ((i4 & 8) != 0) {
            i2 = gitProxyCompareFile.deletions;
        }
        if ((i4 & 16) != 0) {
            i3 = gitProxyCompareFile.changes;
        }
        if ((i4 & 32) != 0) {
            str3 = gitProxyCompareFile.patch;
        }
        if ((i4 & 64) != 0) {
            str4 = gitProxyCompareFile.previous_filename;
        }
        String str5 = str3;
        String str6 = str4;
        int i5 = i3;
        int i6 = i;
        return gitProxyCompareFile.copy(str, str2, i6, i2, i5, str5, str6);
    }

    public static final /* synthetic */ void write$Self$sessions(GitProxyCompareFile self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.filename);
        output.q(serialDesc, 1, self.status);
        output.l(2, self.additions, serialDesc);
        output.l(3, self.deletions, serialDesc);
        output.l(4, self.changes, serialDesc);
        if (output.E(serialDesc) || self.patch != null) {
            output.B(serialDesc, 5, srg.a, self.patch);
        }
        if (!output.E(serialDesc) && self.previous_filename == null) {
            return;
        }
        output.B(serialDesc, 6, srg.a, self.previous_filename);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAdditions() {
        return this.additions;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeletions() {
        return this.deletions;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getChanges() {
        return this.changes;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPatch() {
        return this.patch;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPrevious_filename() {
        return this.previous_filename;
    }

    public final GitProxyCompareFile copy(String filename, String status, int additions, int deletions, int changes, String patch, String previous_filename) {
        filename.getClass();
        status.getClass();
        return new GitProxyCompareFile(filename, status, additions, deletions, changes, patch, previous_filename);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GitProxyCompareFile)) {
            return false;
        }
        GitProxyCompareFile gitProxyCompareFile = (GitProxyCompareFile) other;
        return x44.r(this.filename, gitProxyCompareFile.filename) && x44.r(this.status, gitProxyCompareFile.status) && this.additions == gitProxyCompareFile.additions && this.deletions == gitProxyCompareFile.deletions && this.changes == gitProxyCompareFile.changes && x44.r(this.patch, gitProxyCompareFile.patch) && x44.r(this.previous_filename, gitProxyCompareFile.previous_filename);
    }

    public final int getAdditions() {
        return this.additions;
    }

    public final int getChanges() {
        return this.changes;
    }

    public final int getDeletions() {
        return this.deletions;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getPatch() {
        return this.patch;
    }

    public final String getPrevious_filename() {
        return this.previous_filename;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iC = vb7.c(this.changes, vb7.c(this.deletions, vb7.c(this.additions, kgh.l(this.filename.hashCode() * 31, 31, this.status), 31), 31), 31);
        String str = this.patch;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.previous_filename;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.filename;
        String str2 = this.status;
        int i = this.additions;
        int i2 = this.deletions;
        int i3 = this.changes;
        String str3 = this.patch;
        String str4 = this.previous_filename;
        StringBuilder sbR = kgh.r("GitProxyCompareFile(filename=", str, ", status=", str2, ", additions=");
        qy1.k(i, i2, ", deletions=", ", changes=", sbR);
        sbR.append(i3);
        sbR.append(", patch=");
        sbR.append(str3);
        sbR.append(", previous_filename=");
        return ij0.m(sbR, str4, ")");
    }

    public GitProxyCompareFile(String str, String str2, int i, int i2, int i3, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.filename = str;
        this.status = str2;
        this.additions = i;
        this.deletions = i2;
        this.changes = i3;
        this.patch = str3;
        this.previous_filename = str4;
    }

    public /* synthetic */ GitProxyCompareFile(String str, String str2, int i, int i2, int i3, String str3, String str4, int i4, mq5 mq5Var) {
        this(str, str2, i, i2, i3, (i4 & 32) != 0 ? null : str3, (i4 & 64) != 0 ? null : str4);
    }
}
