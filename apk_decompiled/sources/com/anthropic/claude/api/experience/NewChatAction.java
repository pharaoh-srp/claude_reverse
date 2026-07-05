package com.anthropic.claude.api.experience;

import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.n2c;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/api/experience/NewChatAction;", "Lcom/anthropic/claude/api/experience/ExperienceClientAction;", "", "input_text", "model_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/NewChatAction;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/experience/NewChatAction;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInput_text", "getModel_id", "Companion", "m2c", "n2c", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class NewChatAction implements ExperienceClientAction {
    public static final int $stable = 0;
    public static final n2c Companion = new n2c();
    private final String input_text;
    private final String model_id;

    public /* synthetic */ NewChatAction(int i, String str, String str2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.input_text = null;
        } else {
            this.input_text = str;
        }
        if ((i & 2) == 0) {
            this.model_id = null;
        } else {
            this.model_id = str2;
        }
    }

    public static /* synthetic */ NewChatAction copy$default(NewChatAction newChatAction, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newChatAction.input_text;
        }
        if ((i & 2) != 0) {
            str2 = newChatAction.model_id;
        }
        return newChatAction.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$api(NewChatAction self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.input_text != null) {
            output.B(serialDesc, 0, srg.a, self.input_text);
        }
        if (!output.E(serialDesc) && self.model_id == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.model_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInput_text() {
        return this.input_text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel_id() {
        return this.model_id;
    }

    public final NewChatAction copy(String input_text, String model_id) {
        return new NewChatAction(input_text, model_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewChatAction)) {
            return false;
        }
        NewChatAction newChatAction = (NewChatAction) other;
        return x44.r(this.input_text, newChatAction.input_text) && x44.r(this.model_id, newChatAction.model_id);
    }

    public final String getInput_text() {
        return this.input_text;
    }

    public final String getModel_id() {
        return this.model_id;
    }

    public int hashCode() {
        String str = this.input_text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.model_id;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return ij0.l("NewChatAction(input_text=", this.input_text, ", model_id=", this.model_id, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewChatAction() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public NewChatAction(String str, String str2) {
        this.input_text = str;
        this.model_id = str2;
    }

    public /* synthetic */ NewChatAction(String str, String str2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
