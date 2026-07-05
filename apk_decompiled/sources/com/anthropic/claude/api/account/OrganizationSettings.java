package com.anthropic.claude.api.account;

import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.oob;
import defpackage.skc;
import defpackage.srg;
import defpackage.tkc;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.y6a;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/api/account/OrganizationSettings;", "", "", "claude_console_privacy", "", "allowed_invite_domains", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/OrganizationSettings;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/api/account/OrganizationSettings;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClaude_console_privacy", "Ljava/util/List;", "getAllowed_invite_domains", "Companion", "skc", "tkc", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class OrganizationSettings {
    public static final int $stable = 0;
    private final List<String> allowed_invite_domains;
    private final String claude_console_privacy;
    public static final tkc Companion = new tkc();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new oob(17))};

    public /* synthetic */ OrganizationSettings(int i, String str, List list, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, skc.a.getDescriptor());
            throw null;
        }
        this.claude_console_privacy = str;
        if ((i & 2) == 0) {
            this.allowed_invite_domains = null;
        } else {
            this.allowed_invite_domains = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrganizationSettings copy$default(OrganizationSettings organizationSettings, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = organizationSettings.claude_console_privacy;
        }
        if ((i & 2) != 0) {
            list = organizationSettings.allowed_invite_domains;
        }
        return organizationSettings.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$api(OrganizationSettings self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.claude_console_privacy);
        if (!output.E(serialDesc) && self.allowed_invite_domains == null) {
            return;
        }
        output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.allowed_invite_domains);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClaude_console_privacy() {
        return this.claude_console_privacy;
    }

    public final List<String> component2() {
        return this.allowed_invite_domains;
    }

    public final OrganizationSettings copy(String claude_console_privacy, List<String> allowed_invite_domains) {
        claude_console_privacy.getClass();
        return new OrganizationSettings(claude_console_privacy, allowed_invite_domains);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrganizationSettings)) {
            return false;
        }
        OrganizationSettings organizationSettings = (OrganizationSettings) other;
        return x44.r(this.claude_console_privacy, organizationSettings.claude_console_privacy) && x44.r(this.allowed_invite_domains, organizationSettings.allowed_invite_domains);
    }

    public final List<String> getAllowed_invite_domains() {
        return this.allowed_invite_domains;
    }

    public final String getClaude_console_privacy() {
        return this.claude_console_privacy;
    }

    public int hashCode() {
        int iHashCode = this.claude_console_privacy.hashCode() * 31;
        List<String> list = this.allowed_invite_domains;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return y6a.o("OrganizationSettings(claude_console_privacy=", this.claude_console_privacy, ", allowed_invite_domains=", this.allowed_invite_domains, ")");
    }

    public OrganizationSettings(String str, List<String> list) {
        str.getClass();
        this.claude_console_privacy = str;
        this.allowed_invite_domains = list;
    }

    public /* synthetic */ OrganizationSettings(String str, List list, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
