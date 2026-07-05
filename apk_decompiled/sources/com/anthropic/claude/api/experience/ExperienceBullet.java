package com.anthropic.claude.api.experience;

import defpackage.a97;
import defpackage.b97;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sa7;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ>\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceBullet;", "", "", "icon", "title", "text", "Lcom/anthropic/claude/api/experience/ExperienceToggle;", "toggle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceToggle;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceToggle;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/ExperienceBullet;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/api/experience/ExperienceToggle;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceToggle;)Lcom/anthropic/claude/api/experience/ExperienceBullet;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getTitle", "getText", "Lcom/anthropic/claude/api/experience/ExperienceToggle;", "getToggle", "Companion", "a97", "b97", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ExperienceBullet {
    public static final int $stable = 0;
    public static final b97 Companion = new b97();
    private final String icon;
    private final String text;
    private final String title;
    private final ExperienceToggle toggle;

    public /* synthetic */ ExperienceBullet(int i, String str, String str2, String str3, ExperienceToggle experienceToggle, vnf vnfVar) {
        if (4 != (i & 4)) {
            gvj.f(i, 4, a97.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        this.text = str3;
        if ((i & 8) == 0) {
            this.toggle = null;
        } else {
            this.toggle = experienceToggle;
        }
    }

    public static /* synthetic */ ExperienceBullet copy$default(ExperienceBullet experienceBullet, String str, String str2, String str3, ExperienceToggle experienceToggle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = experienceBullet.icon;
        }
        if ((i & 2) != 0) {
            str2 = experienceBullet.title;
        }
        if ((i & 4) != 0) {
            str3 = experienceBullet.text;
        }
        if ((i & 8) != 0) {
            experienceToggle = experienceBullet.toggle;
        }
        return experienceBullet.copy(str, str2, str3, experienceToggle);
    }

    public static final /* synthetic */ void write$Self$api(ExperienceBullet self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.icon != null) {
            output.B(serialDesc, 0, srg.a, self.icon);
        }
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 1, srg.a, self.title);
        }
        output.q(serialDesc, 2, self.text);
        if (!output.E(serialDesc) && self.toggle == null) {
            return;
        }
        output.B(serialDesc, 3, sa7.a, self.toggle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ExperienceToggle getToggle() {
        return this.toggle;
    }

    public final ExperienceBullet copy(String icon, String title, String text, ExperienceToggle toggle) {
        text.getClass();
        return new ExperienceBullet(icon, title, text, toggle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperienceBullet)) {
            return false;
        }
        ExperienceBullet experienceBullet = (ExperienceBullet) other;
        return x44.r(this.icon, experienceBullet.icon) && x44.r(this.title, experienceBullet.title) && x44.r(this.text, experienceBullet.text) && x44.r(this.toggle, experienceBullet.toggle);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ExperienceToggle getToggle() {
        return this.toggle;
    }

    public int hashCode() {
        String str = this.icon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iL = kgh.l((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.text);
        ExperienceToggle experienceToggle = this.toggle;
        return iL + (experienceToggle != null ? experienceToggle.hashCode() : 0);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.title;
        String str3 = this.text;
        ExperienceToggle experienceToggle = this.toggle;
        StringBuilder sbR = kgh.r("ExperienceBullet(icon=", str, ", title=", str2, ", text=");
        sbR.append(str3);
        sbR.append(", toggle=");
        sbR.append(experienceToggle);
        sbR.append(")");
        return sbR.toString();
    }

    public ExperienceBullet(String str, String str2, String str3, ExperienceToggle experienceToggle) {
        str3.getClass();
        this.icon = str;
        this.title = str2;
        this.text = str3;
        this.toggle = experienceToggle;
    }

    public /* synthetic */ ExperienceBullet(String str, String str2, String str3, ExperienceToggle experienceToggle, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : experienceToggle);
    }
}
