package com.anthropic.claude.api.experience;

import defpackage.c97;
import defpackage.d97;
import defpackage.e97;
import defpackage.g97;
import defpackage.gid;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceButton;", "", "Lcom/anthropic/claude/api/experience/ExperienceButtonType;", "type", "", "text", "", "Lcom/anthropic/claude/api/experience/ExperienceClientAction;", "actions", "<init>", "(Lcom/anthropic/claude/api/experience/ExperienceButtonType;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/experience/ExperienceButtonType;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/ExperienceButton;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/experience/ExperienceButtonType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/anthropic/claude/api/experience/ExperienceButtonType;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/api/experience/ExperienceButton;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/experience/ExperienceButtonType;", "getType", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getActions", "Companion", "d97", "e97", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ExperienceButton {
    public static final int $stable = 0;
    private final List<ExperienceClientAction> actions;
    private final String text;
    private final ExperienceButtonType type;
    public static final e97 Companion = new e97();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new c97(0))};

    public /* synthetic */ ExperienceButton(int i, ExperienceButtonType experienceButtonType, String str, List list, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, d97.a.getDescriptor());
            throw null;
        }
        this.type = experienceButtonType;
        this.text = str;
        if ((i & 4) == 0) {
            this.actions = lm6.E;
        } else {
            this.actions = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ExperienceClientAction.Companion.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExperienceButton copy$default(ExperienceButton experienceButton, ExperienceButtonType experienceButtonType, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            experienceButtonType = experienceButton.type;
        }
        if ((i & 2) != 0) {
            str = experienceButton.text;
        }
        if ((i & 4) != 0) {
            list = experienceButton.actions;
        }
        return experienceButton.copy(experienceButtonType, str, list);
    }

    public static final /* synthetic */ void write$Self$api(ExperienceButton self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, g97.d, self.type);
        output.q(serialDesc, 1, self.text);
        if (!output.E(serialDesc) && x44.r(self.actions, lm6.E)) {
            return;
        }
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.actions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ExperienceButtonType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<ExperienceClientAction> component3() {
        return this.actions;
    }

    public final ExperienceButton copy(ExperienceButtonType type, String text, List<? extends ExperienceClientAction> actions) {
        type.getClass();
        text.getClass();
        actions.getClass();
        return new ExperienceButton(type, text, actions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperienceButton)) {
            return false;
        }
        ExperienceButton experienceButton = (ExperienceButton) other;
        return this.type == experienceButton.type && x44.r(this.text, experienceButton.text) && x44.r(this.actions, experienceButton.actions);
    }

    public final List<ExperienceClientAction> getActions() {
        return this.actions;
    }

    public final String getText() {
        return this.text;
    }

    public final ExperienceButtonType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.actions.hashCode() + kgh.l(this.type.hashCode() * 31, 31, this.text);
    }

    public String toString() {
        ExperienceButtonType experienceButtonType = this.type;
        String str = this.text;
        List<ExperienceClientAction> list = this.actions;
        StringBuilder sb = new StringBuilder("ExperienceButton(type=");
        sb.append(experienceButtonType);
        sb.append(", text=");
        sb.append(str);
        sb.append(", actions=");
        return gid.q(sb, list, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExperienceButton(ExperienceButtonType experienceButtonType, String str, List<? extends ExperienceClientAction> list) {
        experienceButtonType.getClass();
        str.getClass();
        list.getClass();
        this.type = experienceButtonType;
        this.text = str;
        this.actions = list;
    }

    public /* synthetic */ ExperienceButton(ExperienceButtonType experienceButtonType, String str, List list, int i, mq5 mq5Var) {
        this(experienceButtonType, str, (i & 4) != 0 ? lm6.E : list);
    }
}
