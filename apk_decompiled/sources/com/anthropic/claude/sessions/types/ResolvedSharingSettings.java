package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.hne;
import defpackage.ine;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/sessions/types/ResolvedSharingSettings;", "", "", "enforce_repo_check", "show_display_name", "<init>", "(ZZ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ResolvedSharingSettings;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/anthropic/claude/sessions/types/ResolvedSharingSettings;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnforce_repo_check", "getShow_display_name", "Companion", "hne", "ine", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ResolvedSharingSettings {
    public static final ine Companion = new ine();
    private final boolean enforce_repo_check;
    private final boolean show_display_name;

    public /* synthetic */ ResolvedSharingSettings(int i, boolean z, boolean z2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, hne.a.getDescriptor());
            throw null;
        }
        this.enforce_repo_check = z;
        if ((i & 2) == 0) {
            this.show_display_name = false;
        } else {
            this.show_display_name = z2;
        }
    }

    public static /* synthetic */ ResolvedSharingSettings copy$default(ResolvedSharingSettings resolvedSharingSettings, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = resolvedSharingSettings.enforce_repo_check;
        }
        if ((i & 2) != 0) {
            z2 = resolvedSharingSettings.show_display_name;
        }
        return resolvedSharingSettings.copy(z, z2);
    }

    public static final /* synthetic */ void write$Self$sessions(ResolvedSharingSettings self, vd4 output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.enforce_repo_check);
        if (output.E(serialDesc) || self.show_display_name) {
            output.p(serialDesc, 1, self.show_display_name);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnforce_repo_check() {
        return this.enforce_repo_check;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShow_display_name() {
        return this.show_display_name;
    }

    public final ResolvedSharingSettings copy(boolean enforce_repo_check, boolean show_display_name) {
        return new ResolvedSharingSettings(enforce_repo_check, show_display_name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResolvedSharingSettings)) {
            return false;
        }
        ResolvedSharingSettings resolvedSharingSettings = (ResolvedSharingSettings) other;
        return this.enforce_repo_check == resolvedSharingSettings.enforce_repo_check && this.show_display_name == resolvedSharingSettings.show_display_name;
    }

    public final boolean getEnforce_repo_check() {
        return this.enforce_repo_check;
    }

    public final boolean getShow_display_name() {
        return this.show_display_name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.show_display_name) + (Boolean.hashCode(this.enforce_repo_check) * 31);
    }

    public String toString() {
        return "ResolvedSharingSettings(enforce_repo_check=" + this.enforce_repo_check + ", show_display_name=" + this.show_display_name + ")";
    }

    public ResolvedSharingSettings(boolean z, boolean z2) {
        this.enforce_repo_check = z;
        this.show_display_name = z2;
    }

    public /* synthetic */ ResolvedSharingSettings(boolean z, boolean z2, int i, mq5 mq5Var) {
        this(z, (i & 2) != 0 ? false : z2);
    }
}
