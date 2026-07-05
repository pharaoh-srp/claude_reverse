package com.anthropic.claude.sessions.types;

import defpackage.blc;
import defpackage.clc;
import defpackage.dlc;
import defpackage.gid;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/sessions/types/OutcomeGitInfo;", "", "Lcom/anthropic/claude/sessions/types/GitInfoType;", "type", "", "repo", "", "branches", "<init>", "(Lcom/anthropic/claude/sessions/types/GitInfoType;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/sessions/types/GitInfoType;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/OutcomeGitInfo;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/sessions/types/GitInfoType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/anthropic/claude/sessions/types/GitInfoType;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/sessions/types/OutcomeGitInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/sessions/types/GitInfoType;", "getType", "Ljava/lang/String;", "getRepo", "Ljava/util/List;", "getBranches", "Companion", "clc", "dlc", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class OutcomeGitInfo {
    private static final kw9[] $childSerializers;
    public static final dlc Companion = new dlc();
    private final List<String> branches;
    private final String repo;
    private final GitInfoType type;

    static {
        blc blcVar = new blc(0);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, blcVar), null, yb5.w(w1aVar, new blc(1))};
    }

    public /* synthetic */ OutcomeGitInfo(int i, GitInfoType gitInfoType, String str, List list, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, clc.a.getDescriptor());
            throw null;
        }
        this.type = gitInfoType;
        this.repo = str;
        this.branches = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return GitInfoType.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OutcomeGitInfo copy$default(OutcomeGitInfo outcomeGitInfo, GitInfoType gitInfoType, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            gitInfoType = outcomeGitInfo.type;
        }
        if ((i & 2) != 0) {
            str = outcomeGitInfo.repo;
        }
        if ((i & 4) != 0) {
            list = outcomeGitInfo.branches;
        }
        return outcomeGitInfo.copy(gitInfoType, str, list);
    }

    public static final /* synthetic */ void write$Self$sessions(OutcomeGitInfo self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.type);
        output.q(serialDesc, 1, self.repo);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.branches);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GitInfoType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRepo() {
        return this.repo;
    }

    public final List<String> component3() {
        return this.branches;
    }

    public final OutcomeGitInfo copy(GitInfoType type, String repo, List<String> branches) {
        type.getClass();
        repo.getClass();
        branches.getClass();
        return new OutcomeGitInfo(type, repo, branches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutcomeGitInfo)) {
            return false;
        }
        OutcomeGitInfo outcomeGitInfo = (OutcomeGitInfo) other;
        return this.type == outcomeGitInfo.type && x44.r(this.repo, outcomeGitInfo.repo) && x44.r(this.branches, outcomeGitInfo.branches);
    }

    public final List<String> getBranches() {
        return this.branches;
    }

    public final String getRepo() {
        return this.repo;
    }

    public final GitInfoType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.branches.hashCode() + kgh.l(this.type.hashCode() * 31, 31, this.repo);
    }

    public String toString() {
        GitInfoType gitInfoType = this.type;
        String str = this.repo;
        List<String> list = this.branches;
        StringBuilder sb = new StringBuilder("OutcomeGitInfo(type=");
        sb.append(gitInfoType);
        sb.append(", repo=");
        sb.append(str);
        sb.append(", branches=");
        return gid.q(sb, list, ")");
    }

    public OutcomeGitInfo(GitInfoType gitInfoType, String str, List<String> list) {
        gitInfoType.getClass();
        str.getClass();
        list.getClass();
        this.type = gitInfoType;
        this.repo = str;
        this.branches = list;
    }
}
