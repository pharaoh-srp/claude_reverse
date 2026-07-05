package com.anthropic.claude.models.organization.configtypes;

import defpackage.gvj;
import defpackage.ib8;
import defpackage.ij0;
import defpackage.jb8;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LMB\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B±\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ¦\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u0010\u0010,\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b>\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b?\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b@\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\bA\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\bB\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\bC\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\bD\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\bE\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\bF\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\bG\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bH\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\bI\u0010\u001aR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\bJ\u0010\u001a¨\u0006N"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/GroveConfigStrings;", "", "", "disabled_toggle", "onboarding_bullet_title", "onboarding_bullet_description", "onboarding_toggle", "notice_title", "notice_description", "notice_toggle_title", "notice_toggle_description", "notice_p2_title", "notice_p2_description", "notice_learnmore", "notice_footer", "settings_toggle_title", "settings_toggle_description", "settings_notice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/GroveConfigStrings;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/GroveConfigStrings;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getDisabled_toggle", "getOnboarding_bullet_title", "getOnboarding_bullet_description", "getOnboarding_toggle", "getNotice_title", "getNotice_description", "getNotice_toggle_title", "getNotice_toggle_description", "getNotice_p2_title", "getNotice_p2_description", "getNotice_learnmore", "getNotice_footer", "getSettings_toggle_title", "getSettings_toggle_description", "getSettings_notice", "Companion", "ib8", "jb8", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GroveConfigStrings {
    public static final int $stable = 0;
    public static final jb8 Companion = new jb8();
    private final String disabled_toggle;
    private final String notice_description;
    private final String notice_footer;
    private final String notice_learnmore;
    private final String notice_p2_description;
    private final String notice_p2_title;
    private final String notice_title;
    private final String notice_toggle_description;
    private final String notice_toggle_title;
    private final String onboarding_bullet_description;
    private final String onboarding_bullet_title;
    private final String onboarding_toggle;
    private final String settings_notice;
    private final String settings_toggle_description;
    private final String settings_toggle_title;

    public /* synthetic */ GroveConfigStrings(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, vnf vnfVar) {
        if (32767 != (i & 32767)) {
            gvj.f(i, 32767, ib8.a.getDescriptor());
            throw null;
        }
        this.disabled_toggle = str;
        this.onboarding_bullet_title = str2;
        this.onboarding_bullet_description = str3;
        this.onboarding_toggle = str4;
        this.notice_title = str5;
        this.notice_description = str6;
        this.notice_toggle_title = str7;
        this.notice_toggle_description = str8;
        this.notice_p2_title = str9;
        this.notice_p2_description = str10;
        this.notice_learnmore = str11;
        this.notice_footer = str12;
        this.settings_toggle_title = str13;
        this.settings_toggle_description = str14;
        this.settings_notice = str15;
    }

    public static final /* synthetic */ void write$Self$models(GroveConfigStrings self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.disabled_toggle);
        output.q(serialDesc, 1, self.onboarding_bullet_title);
        output.q(serialDesc, 2, self.onboarding_bullet_description);
        output.q(serialDesc, 3, self.onboarding_toggle);
        output.q(serialDesc, 4, self.notice_title);
        output.q(serialDesc, 5, self.notice_description);
        output.q(serialDesc, 6, self.notice_toggle_title);
        output.q(serialDesc, 7, self.notice_toggle_description);
        output.q(serialDesc, 8, self.notice_p2_title);
        output.q(serialDesc, 9, self.notice_p2_description);
        output.q(serialDesc, 10, self.notice_learnmore);
        output.q(serialDesc, 11, self.notice_footer);
        output.q(serialDesc, 12, self.settings_toggle_title);
        output.q(serialDesc, 13, self.settings_toggle_description);
        output.q(serialDesc, 14, self.settings_notice);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisabled_toggle() {
        return this.disabled_toggle;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNotice_p2_description() {
        return this.notice_p2_description;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getNotice_learnmore() {
        return this.notice_learnmore;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getNotice_footer() {
        return this.notice_footer;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSettings_toggle_title() {
        return this.settings_toggle_title;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSettings_toggle_description() {
        return this.settings_toggle_description;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSettings_notice() {
        return this.settings_notice;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOnboarding_bullet_title() {
        return this.onboarding_bullet_title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOnboarding_bullet_description() {
        return this.onboarding_bullet_description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOnboarding_toggle() {
        return this.onboarding_toggle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNotice_title() {
        return this.notice_title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNotice_description() {
        return this.notice_description;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNotice_toggle_title() {
        return this.notice_toggle_title;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNotice_toggle_description() {
        return this.notice_toggle_description;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNotice_p2_title() {
        return this.notice_p2_title;
    }

    public final GroveConfigStrings copy(String disabled_toggle, String onboarding_bullet_title, String onboarding_bullet_description, String onboarding_toggle, String notice_title, String notice_description, String notice_toggle_title, String notice_toggle_description, String notice_p2_title, String notice_p2_description, String notice_learnmore, String notice_footer, String settings_toggle_title, String settings_toggle_description, String settings_notice) {
        y6a.s(disabled_toggle, onboarding_bullet_title, onboarding_bullet_description, onboarding_toggle, notice_title);
        y6a.s(notice_description, notice_toggle_title, notice_toggle_description, notice_p2_title, notice_p2_description);
        notice_learnmore.getClass();
        notice_footer.getClass();
        settings_toggle_title.getClass();
        settings_toggle_description.getClass();
        settings_notice.getClass();
        return new GroveConfigStrings(disabled_toggle, onboarding_bullet_title, onboarding_bullet_description, onboarding_toggle, notice_title, notice_description, notice_toggle_title, notice_toggle_description, notice_p2_title, notice_p2_description, notice_learnmore, notice_footer, settings_toggle_title, settings_toggle_description, settings_notice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroveConfigStrings)) {
            return false;
        }
        GroveConfigStrings groveConfigStrings = (GroveConfigStrings) other;
        return x44.r(this.disabled_toggle, groveConfigStrings.disabled_toggle) && x44.r(this.onboarding_bullet_title, groveConfigStrings.onboarding_bullet_title) && x44.r(this.onboarding_bullet_description, groveConfigStrings.onboarding_bullet_description) && x44.r(this.onboarding_toggle, groveConfigStrings.onboarding_toggle) && x44.r(this.notice_title, groveConfigStrings.notice_title) && x44.r(this.notice_description, groveConfigStrings.notice_description) && x44.r(this.notice_toggle_title, groveConfigStrings.notice_toggle_title) && x44.r(this.notice_toggle_description, groveConfigStrings.notice_toggle_description) && x44.r(this.notice_p2_title, groveConfigStrings.notice_p2_title) && x44.r(this.notice_p2_description, groveConfigStrings.notice_p2_description) && x44.r(this.notice_learnmore, groveConfigStrings.notice_learnmore) && x44.r(this.notice_footer, groveConfigStrings.notice_footer) && x44.r(this.settings_toggle_title, groveConfigStrings.settings_toggle_title) && x44.r(this.settings_toggle_description, groveConfigStrings.settings_toggle_description) && x44.r(this.settings_notice, groveConfigStrings.settings_notice);
    }

    public final String getDisabled_toggle() {
        return this.disabled_toggle;
    }

    public final String getNotice_description() {
        return this.notice_description;
    }

    public final String getNotice_footer() {
        return this.notice_footer;
    }

    public final String getNotice_learnmore() {
        return this.notice_learnmore;
    }

    public final String getNotice_p2_description() {
        return this.notice_p2_description;
    }

    public final String getNotice_p2_title() {
        return this.notice_p2_title;
    }

    public final String getNotice_title() {
        return this.notice_title;
    }

    public final String getNotice_toggle_description() {
        return this.notice_toggle_description;
    }

    public final String getNotice_toggle_title() {
        return this.notice_toggle_title;
    }

    public final String getOnboarding_bullet_description() {
        return this.onboarding_bullet_description;
    }

    public final String getOnboarding_bullet_title() {
        return this.onboarding_bullet_title;
    }

    public final String getOnboarding_toggle() {
        return this.onboarding_toggle;
    }

    public final String getSettings_notice() {
        return this.settings_notice;
    }

    public final String getSettings_toggle_description() {
        return this.settings_toggle_description;
    }

    public final String getSettings_toggle_title() {
        return this.settings_toggle_title;
    }

    public int hashCode() {
        return this.settings_notice.hashCode() + kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(this.disabled_toggle.hashCode() * 31, 31, this.onboarding_bullet_title), 31, this.onboarding_bullet_description), 31, this.onboarding_toggle), 31, this.notice_title), 31, this.notice_description), 31, this.notice_toggle_title), 31, this.notice_toggle_description), 31, this.notice_p2_title), 31, this.notice_p2_description), 31, this.notice_learnmore), 31, this.notice_footer), 31, this.settings_toggle_title), 31, this.settings_toggle_description);
    }

    public String toString() {
        String str = this.disabled_toggle;
        String str2 = this.onboarding_bullet_title;
        String str3 = this.onboarding_bullet_description;
        String str4 = this.onboarding_toggle;
        String str5 = this.notice_title;
        String str6 = this.notice_description;
        String str7 = this.notice_toggle_title;
        String str8 = this.notice_toggle_description;
        String str9 = this.notice_p2_title;
        String str10 = this.notice_p2_description;
        String str11 = this.notice_learnmore;
        String str12 = this.notice_footer;
        String str13 = this.settings_toggle_title;
        String str14 = this.settings_toggle_description;
        String str15 = this.settings_notice;
        StringBuilder sbR = kgh.r("GroveConfigStrings(disabled_toggle=", str, ", onboarding_bullet_title=", str2, ", onboarding_bullet_description=");
        kgh.u(sbR, str3, ", onboarding_toggle=", str4, ", notice_title=");
        kgh.u(sbR, str5, ", notice_description=", str6, ", notice_toggle_title=");
        kgh.u(sbR, str7, ", notice_toggle_description=", str8, ", notice_p2_title=");
        kgh.u(sbR, str9, ", notice_p2_description=", str10, ", notice_learnmore=");
        kgh.u(sbR, str11, ", notice_footer=", str12, ", settings_toggle_title=");
        kgh.u(sbR, str13, ", settings_toggle_description=", str14, ", settings_notice=");
        return ij0.m(sbR, str15, ")");
    }

    public GroveConfigStrings(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        y6a.s(str, str2, str3, str4, str5);
        y6a.s(str6, str7, str8, str9, str10);
        y6a.s(str11, str12, str13, str14, str15);
        this.disabled_toggle = str;
        this.onboarding_bullet_title = str2;
        this.onboarding_bullet_description = str3;
        this.onboarding_toggle = str4;
        this.notice_title = str5;
        this.notice_description = str6;
        this.notice_toggle_title = str7;
        this.notice_toggle_description = str8;
        this.notice_p2_title = str9;
        this.notice_p2_description = str10;
        this.notice_learnmore = str11;
        this.notice_footer = str12;
        this.settings_toggle_title = str13;
        this.settings_toggle_description = str14;
        this.settings_notice = str15;
    }
}
