package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pw0;
import defpackage.qw0;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/sessions/types/AskUserQuestionOption;", "", "", "label", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/AskUserQuestionOption;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/AskUserQuestionOption;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getDescription", "Companion", "pw0", "qw0", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AskUserQuestionOption {
    public static final qw0 Companion = new qw0();
    private final String description;
    private final String label;

    public /* synthetic */ AskUserQuestionOption(int i, String str, String str2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, pw0.a.getDescriptor());
            throw null;
        }
        this.label = str;
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
    }

    public static /* synthetic */ AskUserQuestionOption copy$default(AskUserQuestionOption askUserQuestionOption, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = askUserQuestionOption.label;
        }
        if ((i & 2) != 0) {
            str2 = askUserQuestionOption.description;
        }
        return askUserQuestionOption.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$sessions(AskUserQuestionOption self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.label);
        if (!output.E(serialDesc) && self.description == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.description);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final AskUserQuestionOption copy(String label, String description) {
        label.getClass();
        return new AskUserQuestionOption(label, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AskUserQuestionOption)) {
            return false;
        }
        AskUserQuestionOption askUserQuestionOption = (AskUserQuestionOption) other;
        return x44.r(this.label, askUserQuestionOption.label) && x44.r(this.description, askUserQuestionOption.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        String str = this.description;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return ij0.l("AskUserQuestionOption(label=", this.label, ", description=", this.description, ")");
    }

    public AskUserQuestionOption(String str, String str2) {
        str.getClass();
        this.label = str;
        this.description = str2;
    }

    public /* synthetic */ AskUserQuestionOption(String str, String str2, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
