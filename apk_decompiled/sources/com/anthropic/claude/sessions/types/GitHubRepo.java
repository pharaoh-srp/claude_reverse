package com.anthropic.claude.sessions.types;

import defpackage.e79;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.j58;
import defpackage.k58;
import defpackage.kgh;
import defpackage.l58;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBW\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010)\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u00101R$\u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0011\u00108\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b7\u0010\u001bR\u0011\u00109\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/anthropic/claude/sessions/types/GitHubRepo;", "", "", "name", "Lcom/anthropic/claude/sessions/types/GitHubRepoOwner;", "owner", "default_branch", "visibility", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/GitHubRepoOwner;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "sourceUrl", "gheConfigurationId", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/sessions/types/GitHubRepoOwner;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/GitHubRepo;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/sessions/types/GitHubRepoOwner;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/GitHubRepoOwner;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/GitHubRepo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/anthropic/claude/sessions/types/GitHubRepoOwner;", "getOwner", "getDefault_branch", "getVisibility", "getSourceUrl", "setSourceUrl", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getGheConfigurationId", "()Ljava/lang/Integer;", "setGheConfigurationId", "(Ljava/lang/Integer;)V", "getId", "id", "isPrivate", "()Z", "Companion", "j58", "k58", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GitHubRepo {
    public static final k58 Companion = new k58();
    private final String default_branch;
    private Integer gheConfigurationId;
    private final String name;
    private final GitHubRepoOwner owner;
    private String sourceUrl;
    private final String visibility;

    public /* synthetic */ GitHubRepo(int i, String str, GitHubRepoOwner gitHubRepoOwner, String str2, String str3, String str4, Integer num, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, j58.a.getDescriptor());
            throw null;
        }
        this.name = str;
        this.owner = gitHubRepoOwner;
        this.default_branch = str2;
        if ((i & 8) == 0) {
            this.visibility = null;
        } else {
            this.visibility = str3;
        }
        if ((i & 16) == 0) {
            this.sourceUrl = null;
        } else {
            this.sourceUrl = str4;
        }
        if ((i & 32) == 0) {
            this.gheConfigurationId = null;
        } else {
            this.gheConfigurationId = num;
        }
    }

    public static /* synthetic */ GitHubRepo copy$default(GitHubRepo gitHubRepo, String str, GitHubRepoOwner gitHubRepoOwner, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gitHubRepo.name;
        }
        if ((i & 2) != 0) {
            gitHubRepoOwner = gitHubRepo.owner;
        }
        if ((i & 4) != 0) {
            str2 = gitHubRepo.default_branch;
        }
        if ((i & 8) != 0) {
            str3 = gitHubRepo.visibility;
        }
        return gitHubRepo.copy(str, gitHubRepoOwner, str2, str3);
    }

    public static final /* synthetic */ void write$Self$sessions(GitHubRepo self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.name);
        output.r(serialDesc, 1, l58.a, self.owner);
        output.q(serialDesc, 2, self.default_branch);
        if (output.E(serialDesc) || self.visibility != null) {
            output.B(serialDesc, 3, srg.a, self.visibility);
        }
        if (output.E(serialDesc) || self.sourceUrl != null) {
            output.B(serialDesc, 4, srg.a, self.sourceUrl);
        }
        if (!output.E(serialDesc) && self.gheConfigurationId == null) {
            return;
        }
        output.B(serialDesc, 5, e79.a, self.gheConfigurationId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GitHubRepoOwner getOwner() {
        return this.owner;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDefault_branch() {
        return this.default_branch;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVisibility() {
        return this.visibility;
    }

    public final GitHubRepo copy(String name, GitHubRepoOwner owner, String default_branch, String visibility) {
        name.getClass();
        owner.getClass();
        default_branch.getClass();
        return new GitHubRepo(name, owner, default_branch, visibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GitHubRepo)) {
            return false;
        }
        GitHubRepo gitHubRepo = (GitHubRepo) other;
        return x44.r(this.name, gitHubRepo.name) && x44.r(this.owner, gitHubRepo.owner) && x44.r(this.default_branch, gitHubRepo.default_branch) && x44.r(this.visibility, gitHubRepo.visibility);
    }

    public final String getDefault_branch() {
        return this.default_branch;
    }

    public final Integer getGheConfigurationId() {
        return this.gheConfigurationId;
    }

    public final String getId() {
        return ij0.C(this.owner.getLogin(), "/", this.name);
    }

    public final String getName() {
        return this.name;
    }

    public final GitHubRepoOwner getOwner() {
        return this.owner;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final String getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        int iL = kgh.l((this.owner.hashCode() + (this.name.hashCode() * 31)) * 31, 31, this.default_branch);
        String str = this.visibility;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public final boolean isPrivate() {
        return x44.r(this.visibility, "private") || x44.r(this.visibility, "internal");
    }

    public final void setGheConfigurationId(Integer num) {
        this.gheConfigurationId = num;
    }

    public final void setSourceUrl(String str) {
        this.sourceUrl = str;
    }

    public String toString() {
        String str = this.name;
        GitHubRepoOwner gitHubRepoOwner = this.owner;
        String str2 = this.default_branch;
        String str3 = this.visibility;
        StringBuilder sb = new StringBuilder("GitHubRepo(name=");
        sb.append(str);
        sb.append(", owner=");
        sb.append(gitHubRepoOwner);
        sb.append(", default_branch=");
        return vb7.t(sb, str2, ", visibility=", str3, ")");
    }

    public GitHubRepo(String str, GitHubRepoOwner gitHubRepoOwner, String str2, String str3) {
        str.getClass();
        gitHubRepoOwner.getClass();
        str2.getClass();
        this.name = str;
        this.owner = gitHubRepoOwner;
        this.default_branch = str2;
        this.visibility = str3;
    }

    public /* synthetic */ GitHubRepo(String str, GitHubRepoOwner gitHubRepoOwner, String str2, String str3, int i, mq5 mq5Var) {
        this(str, gitHubRepoOwner, str2, (i & 8) != 0 ? null : str3);
    }
}
