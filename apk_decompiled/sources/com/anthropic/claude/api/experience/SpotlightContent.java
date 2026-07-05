package com.anthropic.claude.api.experience;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a97;
import defpackage.d97;
import defpackage.fsh;
import defpackage.g02;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.q87;
import defpackage.sa7;
import defpackage.srg;
import defpackage.tig;
import defpackage.uig;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wof;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KLBs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u007f\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\bHÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J~\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001bJ\u0010\u0010,\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b@\u0010\u001bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010#R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bE\u0010!R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010&R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bI\u0010(¨\u0006M"}, d2 = {"Lcom/anthropic/claude/api/experience/SpotlightContent;", "Lcom/anthropic/claude/api/experience/ExperienceContent;", "", "title", "description", "Lcom/anthropic/claude/api/experience/ExperienceAsset;", "asset", "badge_title", "", "Lcom/anthropic/claude/api/experience/ExperienceBullet;", "bullets", "Lcom/anthropic/claude/api/experience/BulletsStyle;", "bullets_style", "Lcom/anthropic/claude/api/experience/ExperienceButton;", "buttons", "", "dismissible", "Lcom/anthropic/claude/api/experience/ExperienceToggle;", "toggle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceAsset;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/api/experience/BulletsStyle;Ljava/util/List;ZLcom/anthropic/claude/api/experience/ExperienceToggle;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceAsset;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/api/experience/BulletsStyle;Ljava/util/List;ZLcom/anthropic/claude/api/experience/ExperienceToggle;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/api/experience/ExperienceAsset;", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/anthropic/claude/api/experience/BulletsStyle;", "component7", "component8", "()Z", "component9", "()Lcom/anthropic/claude/api/experience/ExperienceToggle;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceAsset;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/api/experience/BulletsStyle;Ljava/util/List;ZLcom/anthropic/claude/api/experience/ExperienceToggle;)Lcom/anthropic/claude/api/experience/SpotlightContent;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/SpotlightContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/anthropic/claude/api/experience/ExperienceAsset;", "getAsset", "getBadge_title", "Ljava/util/List;", "getBullets", "Lcom/anthropic/claude/api/experience/BulletsStyle;", "getBullets_style", "getButtons", "Z", "getDismissible", "Lcom/anthropic/claude/api/experience/ExperienceToggle;", "getToggle", "Companion", "tig", "uig", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SpotlightContent implements ExperienceContent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final uig Companion = new uig();
    private final ExperienceAsset asset;
    private final String badge_title;
    private final List<ExperienceBullet> bullets;
    private final BulletsStyle bullets_style;
    private final List<ExperienceButton> buttons;
    private final String description;
    private final boolean dismissible;
    private final String title;
    private final ExperienceToggle toggle;

    static {
        wof wofVar = new wof(5);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, yb5.w(w1aVar, wofVar), null, yb5.w(w1aVar, new wof(6)), null, null};
    }

    public /* synthetic */ SpotlightContent(int i, String str, String str2, ExperienceAsset experienceAsset, String str3, List list, BulletsStyle bulletsStyle, List list2, boolean z, ExperienceToggle experienceToggle, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, tig.a.getDescriptor());
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
            this.badge_title = null;
        } else {
            this.badge_title = str3;
        }
        int i2 = i & 16;
        lm6 lm6Var = lm6.E;
        if (i2 == 0) {
            this.bullets = lm6Var;
        } else {
            this.bullets = list;
        }
        if ((i & 32) == 0) {
            this.bullets_style = BulletsStyle.PLAIN;
        } else {
            this.bullets_style = bulletsStyle;
        }
        if ((i & 64) == 0) {
            this.buttons = lm6Var;
        } else {
            this.buttons = list2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.dismissible = true;
        } else {
            this.dismissible = z;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.toggle = null;
        } else {
            this.toggle = experienceToggle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(a97.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(d97.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpotlightContent copy$default(SpotlightContent spotlightContent, String str, String str2, ExperienceAsset experienceAsset, String str3, List list, BulletsStyle bulletsStyle, List list2, boolean z, ExperienceToggle experienceToggle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotlightContent.title;
        }
        if ((i & 2) != 0) {
            str2 = spotlightContent.description;
        }
        if ((i & 4) != 0) {
            experienceAsset = spotlightContent.asset;
        }
        if ((i & 8) != 0) {
            str3 = spotlightContent.badge_title;
        }
        if ((i & 16) != 0) {
            list = spotlightContent.bullets;
        }
        if ((i & 32) != 0) {
            bulletsStyle = spotlightContent.bullets_style;
        }
        if ((i & 64) != 0) {
            list2 = spotlightContent.buttons;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            z = spotlightContent.dismissible;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            experienceToggle = spotlightContent.toggle;
        }
        boolean z2 = z;
        ExperienceToggle experienceToggle2 = experienceToggle;
        BulletsStyle bulletsStyle2 = bulletsStyle;
        List list3 = list2;
        List list4 = list;
        ExperienceAsset experienceAsset2 = experienceAsset;
        return spotlightContent.copy(str, str2, experienceAsset2, str3, list4, bulletsStyle2, list3, z2, experienceToggle2);
    }

    public static final /* synthetic */ void write$Self$api(SpotlightContent self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.title);
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 1, srg.a, self.description);
        }
        if (output.E(serialDesc) || self.asset != null) {
            output.B(serialDesc, 2, q87.a, self.asset);
        }
        if (output.E(serialDesc) || self.badge_title != null) {
            output.B(serialDesc, 3, srg.a, self.badge_title);
        }
        boolean zE = output.E(serialDesc);
        lm6 lm6Var = lm6.E;
        if (zE || !x44.r(self.bullets, lm6Var)) {
            output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.bullets);
        }
        if (output.E(serialDesc) || self.bullets_style != BulletsStyle.PLAIN) {
            output.r(serialDesc, 5, g02.d, self.bullets_style);
        }
        if (output.E(serialDesc) || !x44.r(self.buttons, lm6Var)) {
            output.r(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.buttons);
        }
        if (output.E(serialDesc) || !self.dismissible) {
            output.p(serialDesc, 7, self.dismissible);
        }
        if (!output.E(serialDesc) && self.toggle == null) {
            return;
        }
        output.B(serialDesc, 8, sa7.a, self.toggle);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBadge_title() {
        return this.badge_title;
    }

    public final List<ExperienceBullet> component5() {
        return this.bullets;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BulletsStyle getBullets_style() {
        return this.bullets_style;
    }

    public final List<ExperienceButton> component7() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getDismissible() {
        return this.dismissible;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ExperienceToggle getToggle() {
        return this.toggle;
    }

    public final SpotlightContent copy(String title, String description, ExperienceAsset asset, String badge_title, List<ExperienceBullet> bullets, BulletsStyle bullets_style, List<ExperienceButton> buttons, boolean dismissible, ExperienceToggle toggle) {
        title.getClass();
        bullets.getClass();
        bullets_style.getClass();
        buttons.getClass();
        return new SpotlightContent(title, description, asset, badge_title, bullets, bullets_style, buttons, dismissible, toggle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotlightContent)) {
            return false;
        }
        SpotlightContent spotlightContent = (SpotlightContent) other;
        return x44.r(this.title, spotlightContent.title) && x44.r(this.description, spotlightContent.description) && x44.r(this.asset, spotlightContent.asset) && x44.r(this.badge_title, spotlightContent.badge_title) && x44.r(this.bullets, spotlightContent.bullets) && this.bullets_style == spotlightContent.bullets_style && x44.r(this.buttons, spotlightContent.buttons) && this.dismissible == spotlightContent.dismissible && x44.r(this.toggle, spotlightContent.toggle);
    }

    public final ExperienceAsset getAsset() {
        return this.asset;
    }

    public final String getBadge_title() {
        return this.badge_title;
    }

    public final List<ExperienceBullet> getBullets() {
        return this.bullets;
    }

    public final BulletsStyle getBullets_style() {
        return this.bullets_style;
    }

    public final List<ExperienceButton> getButtons() {
        return this.buttons;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getDismissible() {
        return this.dismissible;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ExperienceToggle getToggle() {
        return this.toggle;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ExperienceAsset experienceAsset = this.asset;
        int iHashCode3 = (iHashCode2 + (experienceAsset == null ? 0 : experienceAsset.hashCode())) * 31;
        String str2 = this.badge_title;
        int iP = fsh.p(kgh.m((this.bullets_style.hashCode() + kgh.m((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.bullets)) * 31, 31, this.buttons), 31, this.dismissible);
        ExperienceToggle experienceToggle = this.toggle;
        return iP + (experienceToggle != null ? experienceToggle.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        ExperienceAsset experienceAsset = this.asset;
        String str3 = this.badge_title;
        List<ExperienceBullet> list = this.bullets;
        BulletsStyle bulletsStyle = this.bullets_style;
        List<ExperienceButton> list2 = this.buttons;
        boolean z = this.dismissible;
        ExperienceToggle experienceToggle = this.toggle;
        StringBuilder sbR = kgh.r("SpotlightContent(title=", str, ", description=", str2, ", asset=");
        sbR.append(experienceAsset);
        sbR.append(", badge_title=");
        sbR.append(str3);
        sbR.append(", bullets=");
        sbR.append(list);
        sbR.append(", bullets_style=");
        sbR.append(bulletsStyle);
        sbR.append(", buttons=");
        sbR.append(list2);
        sbR.append(", dismissible=");
        sbR.append(z);
        sbR.append(", toggle=");
        sbR.append(experienceToggle);
        sbR.append(")");
        return sbR.toString();
    }

    public SpotlightContent(String str, String str2, ExperienceAsset experienceAsset, String str3, List<ExperienceBullet> list, BulletsStyle bulletsStyle, List<ExperienceButton> list2, boolean z, ExperienceToggle experienceToggle) {
        str.getClass();
        list.getClass();
        bulletsStyle.getClass();
        list2.getClass();
        this.title = str;
        this.description = str2;
        this.asset = experienceAsset;
        this.badge_title = str3;
        this.bullets = list;
        this.bullets_style = bulletsStyle;
        this.buttons = list2;
        this.dismissible = z;
        this.toggle = experienceToggle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SpotlightContent(String str, String str2, ExperienceAsset experienceAsset, String str3, List list, BulletsStyle bulletsStyle, List list2, boolean z, ExperienceToggle experienceToggle, int i, mq5 mq5Var) {
        str2 = (i & 2) != 0 ? null : str2;
        experienceAsset = (i & 4) != 0 ? null : experienceAsset;
        str3 = (i & 8) != 0 ? null : str3;
        int i2 = i & 16;
        lm6 lm6Var = lm6.E;
        this(str, str2, experienceAsset, str3, i2 != 0 ? lm6Var : list, (i & 32) != 0 ? BulletsStyle.PLAIN : bulletsStyle, (i & 64) != 0 ? lm6Var : list2, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? true : z, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : experienceToggle);
    }
}
