package com.anthropic.claude.sessions.types;

import defpackage.e79;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rhe;
import defpackage.she;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006,"}, d2 = {"Lcom/anthropic/claude/sessions/types/RepoResyncParams;", "", "", "owner", "repo", "", "ghe_configuration_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/RepoResyncParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/anthropic/claude/sessions/types/RepoResyncParams;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOwner", "getRepo", "Ljava/lang/Integer;", "getGhe_configuration_id", "Companion", "rhe", "she", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RepoResyncParams {
    public static final she Companion = new she();
    private final Integer ghe_configuration_id;
    private final String owner;
    private final String repo;

    public /* synthetic */ RepoResyncParams(int i, String str, String str2, Integer num, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, rhe.a.getDescriptor());
            throw null;
        }
        this.owner = str;
        this.repo = str2;
        if ((i & 4) == 0) {
            this.ghe_configuration_id = null;
        } else {
            this.ghe_configuration_id = num;
        }
    }

    public static /* synthetic */ RepoResyncParams copy$default(RepoResyncParams repoResyncParams, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = repoResyncParams.owner;
        }
        if ((i & 2) != 0) {
            str2 = repoResyncParams.repo;
        }
        if ((i & 4) != 0) {
            num = repoResyncParams.ghe_configuration_id;
        }
        return repoResyncParams.copy(str, str2, num);
    }

    public static final /* synthetic */ void write$Self$sessions(RepoResyncParams self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.owner);
        output.q(serialDesc, 1, self.repo);
        if (!output.E(serialDesc) && self.ghe_configuration_id == null) {
            return;
        }
        output.B(serialDesc, 2, e79.a, self.ghe_configuration_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRepo() {
        return this.repo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getGhe_configuration_id() {
        return this.ghe_configuration_id;
    }

    public final RepoResyncParams copy(String owner, String repo, Integer ghe_configuration_id) {
        owner.getClass();
        repo.getClass();
        return new RepoResyncParams(owner, repo, ghe_configuration_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RepoResyncParams)) {
            return false;
        }
        RepoResyncParams repoResyncParams = (RepoResyncParams) other;
        return x44.r(this.owner, repoResyncParams.owner) && x44.r(this.repo, repoResyncParams.repo) && x44.r(this.ghe_configuration_id, repoResyncParams.ghe_configuration_id);
    }

    public final Integer getGhe_configuration_id() {
        return this.ghe_configuration_id;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final String getRepo() {
        return this.repo;
    }

    public int hashCode() {
        int iL = kgh.l(this.owner.hashCode() * 31, 31, this.repo);
        Integer num = this.ghe_configuration_id;
        return iL + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.owner;
        String str2 = this.repo;
        Integer num = this.ghe_configuration_id;
        StringBuilder sbR = kgh.r("RepoResyncParams(owner=", str, ", repo=", str2, ", ghe_configuration_id=");
        sbR.append(num);
        sbR.append(")");
        return sbR.toString();
    }

    public RepoResyncParams(String str, String str2, Integer num) {
        str.getClass();
        str2.getClass();
        this.owner = str;
        this.repo = str2;
        this.ghe_configuration_id = num;
    }

    public /* synthetic */ RepoResyncParams(String str, String str2, Integer num, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : num);
    }
}
