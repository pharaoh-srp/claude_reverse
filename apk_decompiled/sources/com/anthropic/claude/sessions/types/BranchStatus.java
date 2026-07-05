package com.anthropic.claude.sessions.types;

import defpackage.fsh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.sq6;
import defpackage.sw1;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vw1;
import defpackage.ww1;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010\"JX\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010$J\u001a\u0010,\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010$R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b7\u0010\"R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b8\u0010\"¨\u0006<"}, d2 = {"Lcom/anthropic/claude/sessions/types/BranchStatus;", "", "", "repo", "branch", "Lcom/anthropic/claude/sessions/types/BranchPullRequest;", "pull_request", "", "has_changes", "", "commits", "branch_exists", "has_session_binding", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/BranchPullRequest;ZIZZ)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/BranchPullRequest;ZIZZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/BranchStatus;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/sessions/types/BranchPullRequest;", "component4", "()Z", "component5", "()I", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/BranchPullRequest;ZIZZ)Lcom/anthropic/claude/sessions/types/BranchStatus;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRepo", "getBranch", "Lcom/anthropic/claude/sessions/types/BranchPullRequest;", "getPull_request", "Z", "getHas_changes", "I", "getCommits", "getBranch_exists", "getHas_session_binding", "Companion", "vw1", "ww1", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class BranchStatus {
    public static final ww1 Companion = new ww1();
    private final String branch;
    private final boolean branch_exists;
    private final int commits;
    private final boolean has_changes;
    private final boolean has_session_binding;
    private final BranchPullRequest pull_request;
    private final String repo;

    public /* synthetic */ BranchStatus(int i, String str, String str2, BranchPullRequest branchPullRequest, boolean z, int i2, boolean z2, boolean z3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, vw1.a.getDescriptor());
            throw null;
        }
        this.repo = str;
        this.branch = str2;
        if ((i & 4) == 0) {
            this.pull_request = null;
        } else {
            this.pull_request = branchPullRequest;
        }
        if ((i & 8) == 0) {
            this.has_changes = false;
        } else {
            this.has_changes = z;
        }
        if ((i & 16) == 0) {
            this.commits = 0;
        } else {
            this.commits = i2;
        }
        if ((i & 32) == 0) {
            this.branch_exists = false;
        } else {
            this.branch_exists = z2;
        }
        if ((i & 64) == 0) {
            this.has_session_binding = false;
        } else {
            this.has_session_binding = z3;
        }
    }

    public static /* synthetic */ BranchStatus copy$default(BranchStatus branchStatus, String str, String str2, BranchPullRequest branchPullRequest, boolean z, int i, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = branchStatus.repo;
        }
        if ((i2 & 2) != 0) {
            str2 = branchStatus.branch;
        }
        if ((i2 & 4) != 0) {
            branchPullRequest = branchStatus.pull_request;
        }
        if ((i2 & 8) != 0) {
            z = branchStatus.has_changes;
        }
        if ((i2 & 16) != 0) {
            i = branchStatus.commits;
        }
        if ((i2 & 32) != 0) {
            z2 = branchStatus.branch_exists;
        }
        if ((i2 & 64) != 0) {
            z3 = branchStatus.has_session_binding;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        int i3 = i;
        BranchPullRequest branchPullRequest2 = branchPullRequest;
        return branchStatus.copy(str, str2, branchPullRequest2, z, i3, z4, z5);
    }

    public static final /* synthetic */ void write$Self$sessions(BranchStatus self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.repo);
        output.q(serialDesc, 1, self.branch);
        if (output.E(serialDesc) || self.pull_request != null) {
            output.B(serialDesc, 2, sw1.a, self.pull_request);
        }
        if (output.E(serialDesc) || self.has_changes) {
            output.p(serialDesc, 3, self.has_changes);
        }
        if (output.E(serialDesc) || self.commits != 0) {
            output.l(4, self.commits, serialDesc);
        }
        if (output.E(serialDesc) || self.branch_exists) {
            output.p(serialDesc, 5, self.branch_exists);
        }
        if (output.E(serialDesc) || self.has_session_binding) {
            output.p(serialDesc, 6, self.has_session_binding);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRepo() {
        return this.repo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBranch() {
        return this.branch;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BranchPullRequest getPull_request() {
        return this.pull_request;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHas_changes() {
        return this.has_changes;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCommits() {
        return this.commits;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getBranch_exists() {
        return this.branch_exists;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHas_session_binding() {
        return this.has_session_binding;
    }

    public final BranchStatus copy(String repo, String branch, BranchPullRequest pull_request, boolean has_changes, int commits, boolean branch_exists, boolean has_session_binding) {
        repo.getClass();
        branch.getClass();
        return new BranchStatus(repo, branch, pull_request, has_changes, commits, branch_exists, has_session_binding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BranchStatus)) {
            return false;
        }
        BranchStatus branchStatus = (BranchStatus) other;
        return x44.r(this.repo, branchStatus.repo) && x44.r(this.branch, branchStatus.branch) && x44.r(this.pull_request, branchStatus.pull_request) && this.has_changes == branchStatus.has_changes && this.commits == branchStatus.commits && this.branch_exists == branchStatus.branch_exists && this.has_session_binding == branchStatus.has_session_binding;
    }

    public final String getBranch() {
        return this.branch;
    }

    public final boolean getBranch_exists() {
        return this.branch_exists;
    }

    public final int getCommits() {
        return this.commits;
    }

    public final boolean getHas_changes() {
        return this.has_changes;
    }

    public final boolean getHas_session_binding() {
        return this.has_session_binding;
    }

    public final BranchPullRequest getPull_request() {
        return this.pull_request;
    }

    public final String getRepo() {
        return this.repo;
    }

    public int hashCode() {
        int iL = kgh.l(this.repo.hashCode() * 31, 31, this.branch);
        BranchPullRequest branchPullRequest = this.pull_request;
        return Boolean.hashCode(this.has_session_binding) + fsh.p(vb7.c(this.commits, fsh.p((iL + (branchPullRequest == null ? 0 : branchPullRequest.hashCode())) * 31, 31, this.has_changes), 31), 31, this.branch_exists);
    }

    public String toString() {
        String str = this.repo;
        String str2 = this.branch;
        BranchPullRequest branchPullRequest = this.pull_request;
        boolean z = this.has_changes;
        int i = this.commits;
        boolean z2 = this.branch_exists;
        boolean z3 = this.has_session_binding;
        StringBuilder sbR = kgh.r("BranchStatus(repo=", str, ", branch=", str2, ", pull_request=");
        sbR.append(branchPullRequest);
        sbR.append(", has_changes=");
        sbR.append(z);
        sbR.append(", commits=");
        sbR.append(i);
        sbR.append(", branch_exists=");
        sbR.append(z2);
        sbR.append(", has_session_binding=");
        return sq6.v(")", sbR, z3);
    }

    public BranchStatus(String str, String str2, BranchPullRequest branchPullRequest, boolean z, int i, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        this.repo = str;
        this.branch = str2;
        this.pull_request = branchPullRequest;
        this.has_changes = z;
        this.commits = i;
        this.branch_exists = z2;
        this.has_session_binding = z3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BranchStatus(java.lang.String r9, java.lang.String r10, com.anthropic.claude.sessions.types.BranchPullRequest r11, boolean r12, int r13, boolean r14, boolean r15, int r16, defpackage.mq5 r17) {
        /*
            r8 = this;
            r0 = r16 & 4
            if (r0 == 0) goto L5
            r11 = 0
        L5:
            r3 = r11
            r11 = r16 & 8
            r0 = 0
            if (r11 == 0) goto Ld
            r4 = r0
            goto Le
        Ld:
            r4 = r12
        Le:
            r11 = r16 & 16
            if (r11 == 0) goto L14
            r5 = r0
            goto L15
        L14:
            r5 = r13
        L15:
            r11 = r16 & 32
            if (r11 == 0) goto L1b
            r6 = r0
            goto L1c
        L1b:
            r6 = r14
        L1c:
            r11 = r16 & 64
            if (r11 == 0) goto L25
            r7 = r0
            r1 = r9
            r2 = r10
            r0 = r8
            goto L29
        L25:
            r7 = r15
            r0 = r8
            r1 = r9
            r2 = r10
        L29:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.types.BranchStatus.<init>(java.lang.String, java.lang.String, com.anthropic.claude.sessions.types.BranchPullRequest, boolean, int, boolean, boolean, int, mq5):void");
    }
}
