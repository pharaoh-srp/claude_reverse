package com.anthropic.claude.api.experience;

import defpackage.fsh;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sa7;
import defpackage.srg;
import defpackage.ta7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0018¨\u0006."}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceToggle;", "", "", "label", "", "default_on", "paramKey", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/ExperienceToggle;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZLjava/lang/String;)Lcom/anthropic/claude/api/experience/ExperienceToggle;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "Z", "getDefault_on", "getParamKey", "getParamKey$annotations", "()V", "Companion", "ta7", "sa7", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ExperienceToggle {
    public static final int $stable = 0;
    public static final ta7 Companion = new ta7();
    public static final String DEFAULT_PARAM_KEY = "value";
    private final boolean default_on;
    private final String label;
    private final String paramKey;

    public /* synthetic */ ExperienceToggle(int i, String str, boolean z, String str2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, sa7.a.getDescriptor());
            throw null;
        }
        this.label = str;
        if ((i & 2) == 0) {
            this.default_on = true;
        } else {
            this.default_on = z;
        }
        if ((i & 4) == 0) {
            this.paramKey = null;
        } else {
            this.paramKey = str2;
        }
    }

    public static /* synthetic */ ExperienceToggle copy$default(ExperienceToggle experienceToggle, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = experienceToggle.label;
        }
        if ((i & 2) != 0) {
            z = experienceToggle.default_on;
        }
        if ((i & 4) != 0) {
            str2 = experienceToggle.paramKey;
        }
        return experienceToggle.copy(str, z, str2);
    }

    public static /* synthetic */ void getParamKey$annotations() {
    }

    public static final /* synthetic */ void write$Self$api(ExperienceToggle self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.label);
        if (output.E(serialDesc) || !self.default_on) {
            output.p(serialDesc, 1, self.default_on);
        }
        if (!output.E(serialDesc) && self.paramKey == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.paramKey);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDefault_on() {
        return this.default_on;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParamKey() {
        return this.paramKey;
    }

    public final ExperienceToggle copy(String label, boolean default_on, String paramKey) {
        label.getClass();
        return new ExperienceToggle(label, default_on, paramKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperienceToggle)) {
            return false;
        }
        ExperienceToggle experienceToggle = (ExperienceToggle) other;
        return x44.r(this.label, experienceToggle.label) && this.default_on == experienceToggle.default_on && x44.r(this.paramKey, experienceToggle.paramKey);
    }

    public final boolean getDefault_on() {
        return this.default_on;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getParamKey() {
        return this.paramKey;
    }

    public int hashCode() {
        int iP = fsh.p(this.label.hashCode() * 31, 31, this.default_on);
        String str = this.paramKey;
        return iP + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.label;
        boolean z = this.default_on;
        String str2 = this.paramKey;
        StringBuilder sb = new StringBuilder("ExperienceToggle(label=");
        sb.append(str);
        sb.append(", default_on=");
        sb.append(z);
        sb.append(", paramKey=");
        return ij0.m(sb, str2, ")");
    }

    public ExperienceToggle(String str, boolean z, String str2) {
        str.getClass();
        this.label = str;
        this.default_on = z;
        this.paramKey = str2;
    }

    public /* synthetic */ ExperienceToggle(String str, boolean z, String str2, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : str2);
    }
}
