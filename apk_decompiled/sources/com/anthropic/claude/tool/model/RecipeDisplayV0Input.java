package com.anthropic.claude.tool.model;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a7e;
import defpackage.e79;
import defpackage.e7e;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.y6e;
import defpackage.yb5;
import defpackage.z6e;
import defpackage.zcd;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABBw\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\tHÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0084\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b:\u0010\u0019R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b=\u0010\u0019R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b>\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b?\u0010\u0019¨\u0006C"}, d2 = {"Lcom/anthropic/claude/tool/model/RecipeDisplayV0Input;", "", "", "base_servings", "", "description", "image_page_url", "image_source", "image_url", "", "Lcom/anthropic/claude/tool/model/RecipeDisplayV0InputIngredientsItem;", "ingredients", "notes", "Lcom/anthropic/claude/tool/model/RecipeDisplayV0InputStepsItem;", "steps", "title", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/RecipeDisplayV0Input;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/RecipeDisplayV0Input;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getBase_servings", "Ljava/lang/String;", "getDescription", "getImage_page_url", "getImage_source", "getImage_url", "Ljava/util/List;", "getIngredients", "getNotes", "getSteps", "getTitle", "Companion", "y6e", "z6e", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RecipeDisplayV0Input {
    private static final kw9[] $childSerializers;
    public static final z6e Companion = new z6e();
    private final Integer base_servings;
    private final String description;
    private final String image_page_url;
    private final String image_source;
    private final String image_url;
    private final List<RecipeDisplayV0InputIngredientsItem> ingredients;
    private final String notes;
    private final List<RecipeDisplayV0InputStepsItem> steps;
    private final String title;

    static {
        zcd zcdVar = new zcd(13);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, yb5.w(w1aVar, zcdVar), null, yb5.w(w1aVar, new zcd(14)), null};
    }

    public /* synthetic */ RecipeDisplayV0Input(int i, Integer num, String str, String str2, String str3, String str4, List list, String str5, List list2, String str6, vnf vnfVar) {
        if (384 != (i & 384)) {
            gvj.f(i, 384, y6e.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.base_servings = null;
        } else {
            this.base_servings = num;
        }
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        if ((i & 4) == 0) {
            this.image_page_url = null;
        } else {
            this.image_page_url = str2;
        }
        if ((i & 8) == 0) {
            this.image_source = null;
        } else {
            this.image_source = str3;
        }
        if ((i & 16) == 0) {
            this.image_url = null;
        } else {
            this.image_url = str4;
        }
        if ((i & 32) == 0) {
            this.ingredients = null;
        } else {
            this.ingredients = list;
        }
        if ((i & 64) == 0) {
            this.notes = null;
        } else {
            this.notes = str5;
        }
        this.steps = list2;
        this.title = str6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(a7e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(e7e.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecipeDisplayV0Input copy$default(RecipeDisplayV0Input recipeDisplayV0Input, Integer num, String str, String str2, String str3, String str4, List list, String str5, List list2, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            num = recipeDisplayV0Input.base_servings;
        }
        if ((i & 2) != 0) {
            str = recipeDisplayV0Input.description;
        }
        if ((i & 4) != 0) {
            str2 = recipeDisplayV0Input.image_page_url;
        }
        if ((i & 8) != 0) {
            str3 = recipeDisplayV0Input.image_source;
        }
        if ((i & 16) != 0) {
            str4 = recipeDisplayV0Input.image_url;
        }
        if ((i & 32) != 0) {
            list = recipeDisplayV0Input.ingredients;
        }
        if ((i & 64) != 0) {
            str5 = recipeDisplayV0Input.notes;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            list2 = recipeDisplayV0Input.steps;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str6 = recipeDisplayV0Input.title;
        }
        List list3 = list2;
        String str7 = str6;
        List list4 = list;
        String str8 = str5;
        String str9 = str4;
        String str10 = str2;
        return recipeDisplayV0Input.copy(num, str, str10, str3, str9, list4, str8, list3, str7);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(RecipeDisplayV0Input self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.base_servings != null) {
            output.B(serialDesc, 0, e79.a, self.base_servings);
        }
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 1, srg.a, self.description);
        }
        if (output.E(serialDesc) || self.image_page_url != null) {
            output.B(serialDesc, 2, srg.a, self.image_page_url);
        }
        if (output.E(serialDesc) || self.image_source != null) {
            output.B(serialDesc, 3, srg.a, self.image_source);
        }
        if (output.E(serialDesc) || self.image_url != null) {
            output.B(serialDesc, 4, srg.a, self.image_url);
        }
        if (output.E(serialDesc) || self.ingredients != null) {
            output.B(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.ingredients);
        }
        if (output.E(serialDesc) || self.notes != null) {
            output.B(serialDesc, 6, srg.a, self.notes);
        }
        output.r(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.steps);
        output.q(serialDesc, 8, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getBase_servings() {
        return this.base_servings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImage_page_url() {
        return this.image_page_url;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage_source() {
        return this.image_source;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImage_url() {
        return this.image_url;
    }

    public final List<RecipeDisplayV0InputIngredientsItem> component6() {
        return this.ingredients;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    public final List<RecipeDisplayV0InputStepsItem> component8() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final RecipeDisplayV0Input copy(Integer base_servings, String description, String image_page_url, String image_source, String image_url, List<RecipeDisplayV0InputIngredientsItem> ingredients, String notes, List<RecipeDisplayV0InputStepsItem> steps, String title) {
        steps.getClass();
        title.getClass();
        return new RecipeDisplayV0Input(base_servings, description, image_page_url, image_source, image_url, ingredients, notes, steps, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecipeDisplayV0Input)) {
            return false;
        }
        RecipeDisplayV0Input recipeDisplayV0Input = (RecipeDisplayV0Input) other;
        return x44.r(this.base_servings, recipeDisplayV0Input.base_servings) && x44.r(this.description, recipeDisplayV0Input.description) && x44.r(this.image_page_url, recipeDisplayV0Input.image_page_url) && x44.r(this.image_source, recipeDisplayV0Input.image_source) && x44.r(this.image_url, recipeDisplayV0Input.image_url) && x44.r(this.ingredients, recipeDisplayV0Input.ingredients) && x44.r(this.notes, recipeDisplayV0Input.notes) && x44.r(this.steps, recipeDisplayV0Input.steps) && x44.r(this.title, recipeDisplayV0Input.title);
    }

    public final Integer getBase_servings() {
        return this.base_servings;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage_page_url() {
        return this.image_page_url;
    }

    public final String getImage_source() {
        return this.image_source;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final List<RecipeDisplayV0InputIngredientsItem> getIngredients() {
        return this.ingredients;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final List<RecipeDisplayV0InputStepsItem> getSteps() {
        return this.steps;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.base_servings;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image_page_url;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image_source;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.image_url;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<RecipeDisplayV0InputIngredientsItem> list = this.ingredients;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.notes;
        return this.title.hashCode() + kgh.m((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.steps);
    }

    public String toString() {
        Integer num = this.base_servings;
        String str = this.description;
        String str2 = this.image_page_url;
        String str3 = this.image_source;
        String str4 = this.image_url;
        List<RecipeDisplayV0InputIngredientsItem> list = this.ingredients;
        String str5 = this.notes;
        List<RecipeDisplayV0InputStepsItem> list2 = this.steps;
        String str6 = this.title;
        StringBuilder sb = new StringBuilder("RecipeDisplayV0Input(base_servings=");
        sb.append(num);
        sb.append(", description=");
        sb.append(str);
        sb.append(", image_page_url=");
        kgh.u(sb, str2, ", image_source=", str3, ", image_url=");
        qy1.p(str4, ", ingredients=", ", notes=", sb, list);
        qy1.p(str5, ", steps=", ", title=", sb, list2);
        return ij0.m(sb, str6, ")");
    }

    public RecipeDisplayV0Input(Integer num, String str, String str2, String str3, String str4, List<RecipeDisplayV0InputIngredientsItem> list, String str5, List<RecipeDisplayV0InputStepsItem> list2, String str6) {
        list2.getClass();
        str6.getClass();
        this.base_servings = num;
        this.description = str;
        this.image_page_url = str2;
        this.image_source = str3;
        this.image_url = str4;
        this.ingredients = list;
        this.notes = str5;
        this.steps = list2;
        this.title = str6;
    }

    public /* synthetic */ RecipeDisplayV0Input(Integer num, String str, String str2, String str3, String str4, List list, String str5, List list2, String str6, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5, list2, str6);
    }
}
