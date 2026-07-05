package com.anthropic.claude.api.experience;

import defpackage.d97;
import defpackage.e79;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.rc1;
import defpackage.rt2;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\\\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010(¨\u0006?"}, d2 = {"Lcom/anthropic/claude/api/experience/ChatInputBannerContent;", "Lcom/anthropic/claude/api/experience/ExperienceContent;", "", "title", "description", "title_icon", "", "Lcom/anthropic/claude/api/experience/ExperienceButton;", "buttons", "", "dismissible", "", "min_messages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/ChatInputBannerContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "humanMessageCount", "meetsMessageThreshold", "(I)Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Ljava/lang/Boolean;", "component6", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/anthropic/claude/api/experience/ChatInputBannerContent;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "getTitle_icon", "Ljava/util/List;", "getButtons", "Ljava/lang/Boolean;", "getDismissible", "Ljava/lang/Integer;", "getMin_messages", "Companion", "qt2", "rt2", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatInputBannerContent implements ExperienceContent {
    public static final int $stable = 0;
    private final List<ExperienceButton> buttons;
    private final String description;
    private final Boolean dismissible;
    private final Integer min_messages;
    private final String title;
    private final String title_icon;
    public static final rt2 Companion = new rt2();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new rc1(14)), null, null};

    public /* synthetic */ ChatInputBannerContent(int i, String str, String str2, String str3, List list, Boolean bool, Integer num, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.title_icon = null;
        } else {
            this.title_icon = str3;
        }
        if ((i & 8) == 0) {
            this.buttons = lm6.E;
        } else {
            this.buttons = list;
        }
        if ((i & 16) == 0) {
            this.dismissible = null;
        } else {
            this.dismissible = bool;
        }
        if ((i & 32) == 0) {
            this.min_messages = null;
        } else {
            this.min_messages = num;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(d97.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatInputBannerContent copy$default(ChatInputBannerContent chatInputBannerContent, String str, String str2, String str3, List list, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatInputBannerContent.title;
        }
        if ((i & 2) != 0) {
            str2 = chatInputBannerContent.description;
        }
        if ((i & 4) != 0) {
            str3 = chatInputBannerContent.title_icon;
        }
        if ((i & 8) != 0) {
            list = chatInputBannerContent.buttons;
        }
        if ((i & 16) != 0) {
            bool = chatInputBannerContent.dismissible;
        }
        if ((i & 32) != 0) {
            num = chatInputBannerContent.min_messages;
        }
        Boolean bool2 = bool;
        Integer num2 = num;
        return chatInputBannerContent.copy(str, str2, str3, list, bool2, num2);
    }

    public static final /* synthetic */ void write$Self$api(ChatInputBannerContent self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 0, srg.a, self.title);
        }
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 1, srg.a, self.description);
        }
        if (output.E(serialDesc) || self.title_icon != null) {
            output.B(serialDesc, 2, srg.a, self.title_icon);
        }
        if (output.E(serialDesc) || !x44.r(self.buttons, lm6.E)) {
            output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.buttons);
        }
        if (output.E(serialDesc) || self.dismissible != null) {
            output.B(serialDesc, 4, zt1.a, self.dismissible);
        }
        if (!output.E(serialDesc) && self.min_messages == null) {
            return;
        }
        output.B(serialDesc, 5, e79.a, self.min_messages);
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
    public final String getTitle_icon() {
        return this.title_icon;
    }

    public final List<ExperienceButton> component4() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getDismissible() {
        return this.dismissible;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getMin_messages() {
        return this.min_messages;
    }

    public final ChatInputBannerContent copy(String title, String description, String title_icon, List<ExperienceButton> buttons, Boolean dismissible, Integer min_messages) {
        buttons.getClass();
        return new ChatInputBannerContent(title, description, title_icon, buttons, dismissible, min_messages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatInputBannerContent)) {
            return false;
        }
        ChatInputBannerContent chatInputBannerContent = (ChatInputBannerContent) other;
        return x44.r(this.title, chatInputBannerContent.title) && x44.r(this.description, chatInputBannerContent.description) && x44.r(this.title_icon, chatInputBannerContent.title_icon) && x44.r(this.buttons, chatInputBannerContent.buttons) && x44.r(this.dismissible, chatInputBannerContent.dismissible) && x44.r(this.min_messages, chatInputBannerContent.min_messages);
    }

    public final List<ExperienceButton> getButtons() {
        return this.buttons;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getDismissible() {
        return this.dismissible;
    }

    public final Integer getMin_messages() {
        return this.min_messages;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitle_icon() {
        return this.title_icon;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title_icon;
        int iM = kgh.m((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.buttons);
        Boolean bool = this.dismissible;
        int iHashCode3 = (iM + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.min_messages;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final boolean meetsMessageThreshold(int humanMessageCount) {
        Integer num = this.min_messages;
        return humanMessageCount >= (num != null ? num.intValue() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.title_icon;
        List<ExperienceButton> list = this.buttons;
        Boolean bool = this.dismissible;
        Integer num = this.min_messages;
        StringBuilder sbR = kgh.r("ChatInputBannerContent(title=", str, ", description=", str2, ", title_icon=");
        qy1.p(str3, ", buttons=", ", dismissible=", sbR, list);
        sbR.append(bool);
        sbR.append(", min_messages=");
        sbR.append(num);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatInputBannerContent() {
        this((String) null, (String) null, (String) null, (List) null, (Boolean) null, (Integer) null, 63, (mq5) null);
    }

    public ChatInputBannerContent(String str, String str2, String str3, List<ExperienceButton> list, Boolean bool, Integer num) {
        list.getClass();
        this.title = str;
        this.description = str2;
        this.title_icon = str3;
        this.buttons = list;
        this.dismissible = bool;
        this.min_messages = num;
    }

    public /* synthetic */ ChatInputBannerContent(String str, String str2, String str3, List list, Boolean bool, Integer num, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? lm6.E : list, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : num);
    }
}
