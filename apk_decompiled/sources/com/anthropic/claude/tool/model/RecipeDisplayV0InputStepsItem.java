package com.anthropic.claude.tool.model;

import defpackage.e79;
import defpackage.e7e;
import defpackage.f7e;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\u0018¨\u0006/"}, d2 = {"Lcom/anthropic/claude/tool/model/RecipeDisplayV0InputStepsItem;", "", "", "content", "id", "", "timer_seconds", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/RecipeDisplayV0InputStepsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/RecipeDisplayV0InputStepsItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContent", "getId", "Ljava/lang/Integer;", "getTimer_seconds", "getTitle", "Companion", "e7e", "f7e", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RecipeDisplayV0InputStepsItem {
    public static final f7e Companion = new f7e();
    private final String content;
    private final String id;
    private final Integer timer_seconds;
    private final String title;

    public /* synthetic */ RecipeDisplayV0InputStepsItem(int i, String str, String str2, Integer num, String str3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, e7e.a.getDescriptor());
            throw null;
        }
        this.content = str;
        this.id = str2;
        if ((i & 4) == 0) {
            this.timer_seconds = null;
        } else {
            this.timer_seconds = num;
        }
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
    }

    public static /* synthetic */ RecipeDisplayV0InputStepsItem copy$default(RecipeDisplayV0InputStepsItem recipeDisplayV0InputStepsItem, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recipeDisplayV0InputStepsItem.content;
        }
        if ((i & 2) != 0) {
            str2 = recipeDisplayV0InputStepsItem.id;
        }
        if ((i & 4) != 0) {
            num = recipeDisplayV0InputStepsItem.timer_seconds;
        }
        if ((i & 8) != 0) {
            str3 = recipeDisplayV0InputStepsItem.title;
        }
        return recipeDisplayV0InputStepsItem.copy(str, str2, num, str3);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(RecipeDisplayV0InputStepsItem self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.content);
        output.q(serialDesc, 1, self.id);
        if (output.E(serialDesc) || self.timer_seconds != null) {
            output.B(serialDesc, 2, e79.a, self.timer_seconds);
        }
        if (!output.E(serialDesc) && self.title == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTimer_seconds() {
        return this.timer_seconds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final RecipeDisplayV0InputStepsItem copy(String content, String id, Integer timer_seconds, String title) {
        content.getClass();
        id.getClass();
        return new RecipeDisplayV0InputStepsItem(content, id, timer_seconds, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecipeDisplayV0InputStepsItem)) {
            return false;
        }
        RecipeDisplayV0InputStepsItem recipeDisplayV0InputStepsItem = (RecipeDisplayV0InputStepsItem) other;
        return x44.r(this.content, recipeDisplayV0InputStepsItem.content) && x44.r(this.id, recipeDisplayV0InputStepsItem.id) && x44.r(this.timer_seconds, recipeDisplayV0InputStepsItem.timer_seconds) && x44.r(this.title, recipeDisplayV0InputStepsItem.title);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getTimer_seconds() {
        return this.timer_seconds;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iL = kgh.l(this.content.hashCode() * 31, 31, this.id);
        Integer num = this.timer_seconds;
        int iHashCode = (iL + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.title;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.content;
        String str2 = this.id;
        Integer num = this.timer_seconds;
        String str3 = this.title;
        StringBuilder sbR = kgh.r("RecipeDisplayV0InputStepsItem(content=", str, ", id=", str2, ", timer_seconds=");
        sbR.append(num);
        sbR.append(", title=");
        sbR.append(str3);
        sbR.append(")");
        return sbR.toString();
    }

    public RecipeDisplayV0InputStepsItem(String str, String str2, Integer num, String str3) {
        str.getClass();
        str2.getClass();
        this.content = str;
        this.id = str2;
        this.timer_seconds = num;
        this.title = str3;
    }

    public /* synthetic */ RecipeDisplayV0InputStepsItem(String str, String str2, Integer num, String str3, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3);
    }
}
