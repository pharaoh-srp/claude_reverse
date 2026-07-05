package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.j58;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.s48;
import defpackage.srg;
import defpackage.uhe;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.yhe;
import defpackage.zhe;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J>\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00066"}, d2 = {"Lcom/anthropic/claude/sessions/types/RepoWithStatus;", "", "Lcom/anthropic/claude/sessions/types/GitHubRepo;", "repo", "Lcom/anthropic/claude/sessions/types/RepoStatus;", "status", "Lcom/anthropic/claude/sessions/types/GheSource;", "ghe", "", "source_url", "<init>", "(Lcom/anthropic/claude/sessions/types/GitHubRepo;Lcom/anthropic/claude/sessions/types/RepoStatus;Lcom/anthropic/claude/sessions/types/GheSource;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/sessions/types/GitHubRepo;Lcom/anthropic/claude/sessions/types/RepoStatus;Lcom/anthropic/claude/sessions/types/GheSource;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/RepoWithStatus;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/sessions/types/GitHubRepo;", "component2", "()Lcom/anthropic/claude/sessions/types/RepoStatus;", "component3", "()Lcom/anthropic/claude/sessions/types/GheSource;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/sessions/types/GitHubRepo;Lcom/anthropic/claude/sessions/types/RepoStatus;Lcom/anthropic/claude/sessions/types/GheSource;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/RepoWithStatus;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/sessions/types/GitHubRepo;", "getRepo", "Lcom/anthropic/claude/sessions/types/RepoStatus;", "getStatus", "Lcom/anthropic/claude/sessions/types/GheSource;", "getGhe", "Ljava/lang/String;", "getSource_url", "Companion", "yhe", "zhe", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RepoWithStatus {
    public static final zhe Companion = new zhe();
    private final GheSource ghe;
    private final GitHubRepo repo;
    private final String source_url;
    private final RepoStatus status;

    public /* synthetic */ RepoWithStatus(int i, GitHubRepo gitHubRepo, RepoStatus repoStatus, GheSource gheSource, String str, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, yhe.a.getDescriptor());
            throw null;
        }
        this.repo = gitHubRepo;
        if ((i & 2) == 0) {
            this.status = null;
        } else {
            this.status = repoStatus;
        }
        if ((i & 4) == 0) {
            this.ghe = null;
        } else {
            this.ghe = gheSource;
        }
        if ((i & 8) == 0) {
            this.source_url = null;
        } else {
            this.source_url = str;
        }
    }

    public static /* synthetic */ RepoWithStatus copy$default(RepoWithStatus repoWithStatus, GitHubRepo gitHubRepo, RepoStatus repoStatus, GheSource gheSource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            gitHubRepo = repoWithStatus.repo;
        }
        if ((i & 2) != 0) {
            repoStatus = repoWithStatus.status;
        }
        if ((i & 4) != 0) {
            gheSource = repoWithStatus.ghe;
        }
        if ((i & 8) != 0) {
            str = repoWithStatus.source_url;
        }
        return repoWithStatus.copy(gitHubRepo, repoStatus, gheSource, str);
    }

    public static final /* synthetic */ void write$Self$sessions(RepoWithStatus self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, j58.a, self.repo);
        if (output.E(serialDesc) || self.status != null) {
            output.B(serialDesc, 1, uhe.a, self.status);
        }
        if (output.E(serialDesc) || self.ghe != null) {
            output.B(serialDesc, 2, s48.a, self.ghe);
        }
        if (!output.E(serialDesc) && self.source_url == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.source_url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GitHubRepo getRepo() {
        return this.repo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RepoStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GheSource getGhe() {
        return this.ghe;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSource_url() {
        return this.source_url;
    }

    public final RepoWithStatus copy(GitHubRepo repo, RepoStatus status, GheSource ghe, String source_url) {
        repo.getClass();
        return new RepoWithStatus(repo, status, ghe, source_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RepoWithStatus)) {
            return false;
        }
        RepoWithStatus repoWithStatus = (RepoWithStatus) other;
        return x44.r(this.repo, repoWithStatus.repo) && x44.r(this.status, repoWithStatus.status) && x44.r(this.ghe, repoWithStatus.ghe) && x44.r(this.source_url, repoWithStatus.source_url);
    }

    public final GheSource getGhe() {
        return this.ghe;
    }

    public final GitHubRepo getRepo() {
        return this.repo;
    }

    public final String getSource_url() {
        return this.source_url;
    }

    public final RepoStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.repo.hashCode() * 31;
        RepoStatus repoStatus = this.status;
        int iHashCode2 = (iHashCode + (repoStatus == null ? 0 : repoStatus.hashCode())) * 31;
        GheSource gheSource = this.ghe;
        int iHashCode3 = (iHashCode2 + (gheSource == null ? 0 : gheSource.hashCode())) * 31;
        String str = this.source_url;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "RepoWithStatus(repo=" + this.repo + ", status=" + this.status + ", ghe=" + this.ghe + ", source_url=" + this.source_url + ")";
    }

    public RepoWithStatus(GitHubRepo gitHubRepo, RepoStatus repoStatus, GheSource gheSource, String str) {
        gitHubRepo.getClass();
        this.repo = gitHubRepo;
        this.status = repoStatus;
        this.ghe = gheSource;
        this.source_url = str;
    }

    public /* synthetic */ RepoWithStatus(GitHubRepo gitHubRepo, RepoStatus repoStatus, GheSource gheSource, String str, int i, mq5 mq5Var) {
        this(gitHubRepo, (i & 2) != 0 ? null : repoStatus, (i & 4) != 0 ? null : gheSource, (i & 8) != 0 ? null : str);
    }
}
