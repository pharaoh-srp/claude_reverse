package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uhe;
import defpackage.vd4;
import defpackage.vhe;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lcom/anthropic/claude/sessions/types/RepoStatus;", "", "", "workflow_enabled", "app_installed", "<init>", "(ZLjava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLjava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/RepoStatus;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "copy", "(ZLjava/lang/Boolean;)Lcom/anthropic/claude/sessions/types/RepoStatus;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getWorkflow_enabled", "Ljava/lang/Boolean;", "getApp_installed", "Companion", "uhe", "vhe", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RepoStatus {
    public static final vhe Companion = new vhe();
    private final Boolean app_installed;
    private final boolean workflow_enabled;

    public /* synthetic */ RepoStatus(int i, boolean z, Boolean bool, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, uhe.a.getDescriptor());
            throw null;
        }
        this.workflow_enabled = z;
        if ((i & 2) == 0) {
            this.app_installed = null;
        } else {
            this.app_installed = bool;
        }
    }

    public static /* synthetic */ RepoStatus copy$default(RepoStatus repoStatus, boolean z, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = repoStatus.workflow_enabled;
        }
        if ((i & 2) != 0) {
            bool = repoStatus.app_installed;
        }
        return repoStatus.copy(z, bool);
    }

    public static final /* synthetic */ void write$Self$sessions(RepoStatus self, vd4 output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.workflow_enabled);
        if (!output.E(serialDesc) && self.app_installed == null) {
            return;
        }
        output.B(serialDesc, 1, zt1.a, self.app_installed);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getWorkflow_enabled() {
        return this.workflow_enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getApp_installed() {
        return this.app_installed;
    }

    public final RepoStatus copy(boolean workflow_enabled, Boolean app_installed) {
        return new RepoStatus(workflow_enabled, app_installed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RepoStatus)) {
            return false;
        }
        RepoStatus repoStatus = (RepoStatus) other;
        return this.workflow_enabled == repoStatus.workflow_enabled && x44.r(this.app_installed, repoStatus.app_installed);
    }

    public final Boolean getApp_installed() {
        return this.app_installed;
    }

    public final boolean getWorkflow_enabled() {
        return this.workflow_enabled;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.workflow_enabled) * 31;
        Boolean bool = this.app_installed;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "RepoStatus(workflow_enabled=" + this.workflow_enabled + ", app_installed=" + this.app_installed + ")";
    }

    public RepoStatus(boolean z, Boolean bool) {
        this.workflow_enabled = z;
        this.app_installed = bool;
    }

    public /* synthetic */ RepoStatus(boolean z, Boolean bool, int i, mq5 mq5Var) {
        this(z, (i & 2) != 0 ? null : bool);
    }
}
