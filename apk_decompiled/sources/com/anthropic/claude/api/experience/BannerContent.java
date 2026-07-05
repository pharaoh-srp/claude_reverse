package com.anthropic.claude.api.experience;

import defpackage.d97;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.q87;
import defpackage.rc1;
import defpackage.sq6;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xc1;
import defpackage.yb5;
import defpackage.yc1;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBQ\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$JL\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\"R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010$¨\u0006<"}, d2 = {"Lcom/anthropic/claude/api/experience/BannerContent;", "Lcom/anthropic/claude/api/experience/ExperienceContent;", "", "title", "description", "Lcom/anthropic/claude/api/experience/ExperienceAsset;", "asset", "", "Lcom/anthropic/claude/api/experience/ExperienceButton;", "buttons", "", "inlineButtons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceAsset;Ljava/util/List;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceAsset;Ljava/util/List;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/BannerContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/api/experience/ExperienceAsset;", "component4", "()Ljava/util/List;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceAsset;Ljava/util/List;Z)Lcom/anthropic/claude/api/experience/BannerContent;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/anthropic/claude/api/experience/ExperienceAsset;", "getAsset", "Ljava/util/List;", "getButtons", "Z", "getInlineButtons", "getInlineButtons$annotations", "()V", "Companion", "xc1", "yc1", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class BannerContent implements ExperienceContent {
    public static final int $stable = 0;
    private final ExperienceAsset asset;
    private final List<ExperienceButton> buttons;
    private final String description;
    private final boolean inlineButtons;
    private final String title;
    public static final yc1 Companion = new yc1();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new rc1(1)), null};

    public /* synthetic */ BannerContent(int i, String str, String str2, ExperienceAsset experienceAsset, List list, boolean z, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, xc1.a.getDescriptor());
            throw null;
        }
        this.title = str;
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.asset = null;
        } else {
            this.asset = experienceAsset;
        }
        if ((i & 8) == 0) {
            this.buttons = lm6.E;
        } else {
            this.buttons = list;
        }
        if ((i & 16) == 0) {
            this.inlineButtons = false;
        } else {
            this.inlineButtons = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(d97.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BannerContent copy$default(BannerContent bannerContent, String str, String str2, ExperienceAsset experienceAsset, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerContent.title;
        }
        if ((i & 2) != 0) {
            str2 = bannerContent.description;
        }
        if ((i & 4) != 0) {
            experienceAsset = bannerContent.asset;
        }
        if ((i & 8) != 0) {
            list = bannerContent.buttons;
        }
        if ((i & 16) != 0) {
            z = bannerContent.inlineButtons;
        }
        boolean z2 = z;
        ExperienceAsset experienceAsset2 = experienceAsset;
        return bannerContent.copy(str, str2, experienceAsset2, list, z2);
    }

    public static /* synthetic */ void getInlineButtons$annotations() {
    }

    public static final /* synthetic */ void write$Self$api(BannerContent self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.title);
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 1, srg.a, self.description);
        }
        if (output.E(serialDesc) || self.asset != null) {
            output.B(serialDesc, 2, q87.a, self.asset);
        }
        if (output.E(serialDesc) || !x44.r(self.buttons, lm6.E)) {
            output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.buttons);
        }
        if (output.E(serialDesc) || self.inlineButtons) {
            output.p(serialDesc, 4, self.inlineButtons);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ExperienceAsset getAsset() {
        return this.asset;
    }

    public final List<ExperienceButton> component4() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getInlineButtons() {
        return this.inlineButtons;
    }

    public final BannerContent copy(String title, String description, ExperienceAsset asset, List<ExperienceButton> buttons, boolean inlineButtons) {
        title.getClass();
        buttons.getClass();
        return new BannerContent(title, description, asset, buttons, inlineButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerContent)) {
            return false;
        }
        BannerContent bannerContent = (BannerContent) other;
        return x44.r(this.title, bannerContent.title) && x44.r(this.description, bannerContent.description) && x44.r(this.asset, bannerContent.asset) && x44.r(this.buttons, bannerContent.buttons) && this.inlineButtons == bannerContent.inlineButtons;
    }

    public final ExperienceAsset getAsset() {
        return this.asset;
    }

    public final List<ExperienceButton> getButtons() {
        return this.buttons;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getInlineButtons() {
        return this.inlineButtons;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ExperienceAsset experienceAsset = this.asset;
        return Boolean.hashCode(this.inlineButtons) + kgh.m((iHashCode2 + (experienceAsset != null ? experienceAsset.hashCode() : 0)) * 31, 31, this.buttons);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        ExperienceAsset experienceAsset = this.asset;
        List<ExperienceButton> list = this.buttons;
        boolean z = this.inlineButtons;
        StringBuilder sbR = kgh.r("BannerContent(title=", str, ", description=", str2, ", asset=");
        sbR.append(experienceAsset);
        sbR.append(", buttons=");
        sbR.append(list);
        sbR.append(", inlineButtons=");
        return sq6.v(")", sbR, z);
    }

    public BannerContent(String str, String str2, ExperienceAsset experienceAsset, List<ExperienceButton> list, boolean z) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.description = str2;
        this.asset = experienceAsset;
        this.buttons = list;
        this.inlineButtons = z;
    }

    public /* synthetic */ BannerContent(String str, String str2, ExperienceAsset experienceAsset, List list, boolean z, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : experienceAsset, (i & 8) != 0 ? lm6.E : list, (i & 16) != 0 ? false : z);
    }
}
