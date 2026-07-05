package com.anthropic.claude.sessions.types;

import defpackage.f58;
import defpackage.g58;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.sq6;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b*\u0010(\u001a\u0004\b\u0006\u0010\u001b¨\u0006."}, d2 = {"Lcom/anthropic/claude/sessions/types/GitHubBranch;", "", "", "name", "commitSha", "", "isDefault", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/GitHubBranch;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/anthropic/claude/sessions/types/GitHubBranch;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getCommitSha", "getCommitSha$annotations", "()V", "Z", "isDefault$annotations", "Companion", "f58", "g58", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GitHubBranch {
    public static final g58 Companion = new g58();
    private final String commitSha;
    private final boolean isDefault;
    private final String name;

    public /* synthetic */ GitHubBranch(int i, String str, String str2, boolean z, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, f58.a.getDescriptor());
            throw null;
        }
        this.name = str;
        this.commitSha = str2;
        this.isDefault = z;
    }

    public static /* synthetic */ GitHubBranch copy$default(GitHubBranch gitHubBranch, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gitHubBranch.name;
        }
        if ((i & 2) != 0) {
            str2 = gitHubBranch.commitSha;
        }
        if ((i & 4) != 0) {
            z = gitHubBranch.isDefault;
        }
        return gitHubBranch.copy(str, str2, z);
    }

    public static /* synthetic */ void getCommitSha$annotations() {
    }

    public static /* synthetic */ void isDefault$annotations() {
    }

    public static final /* synthetic */ void write$Self$sessions(GitHubBranch self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.name);
        output.q(serialDesc, 1, self.commitSha);
        output.p(serialDesc, 2, self.isDefault);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCommitSha() {
        return this.commitSha;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    public final GitHubBranch copy(String name, String commitSha, boolean isDefault) {
        name.getClass();
        commitSha.getClass();
        return new GitHubBranch(name, commitSha, isDefault);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GitHubBranch)) {
            return false;
        }
        GitHubBranch gitHubBranch = (GitHubBranch) other;
        return x44.r(this.name, gitHubBranch.name) && x44.r(this.commitSha, gitHubBranch.commitSha) && this.isDefault == gitHubBranch.isDefault;
    }

    public final String getCommitSha() {
        return this.commitSha;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isDefault) + kgh.l(this.name.hashCode() * 31, 31, this.commitSha);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.commitSha;
        return sq6.v(")", kgh.r("GitHubBranch(name=", str, ", commitSha=", str2, ", isDefault="), this.isDefault);
    }

    public GitHubBranch(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.commitSha = str2;
        this.isDefault = z;
    }
}
