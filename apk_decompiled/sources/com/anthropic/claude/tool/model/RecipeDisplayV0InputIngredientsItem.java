package com.anthropic.claude.tool.model;

import defpackage.b7e;
import defpackage.d7e;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.na6;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00063"}, d2 = {"Lcom/anthropic/claude/tool/model/RecipeDisplayV0InputIngredientsItem;", "", "", "amount", "", "id", "name", "Lcom/anthropic/claude/tool/model/RecipeDisplayV0InputIngredientsItemUnit;", "unit", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/RecipeDisplayV0InputIngredientsItemUnit;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/RecipeDisplayV0InputIngredientsItemUnit;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/RecipeDisplayV0InputIngredientsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/anthropic/claude/tool/model/RecipeDisplayV0InputIngredientsItemUnit;", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/RecipeDisplayV0InputIngredientsItemUnit;)Lcom/anthropic/claude/tool/model/RecipeDisplayV0InputIngredientsItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getAmount", "Ljava/lang/String;", "getId", "getName", "Lcom/anthropic/claude/tool/model/RecipeDisplayV0InputIngredientsItemUnit;", "getUnit", "Companion", "a7e", "b7e", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RecipeDisplayV0InputIngredientsItem {
    public static final b7e Companion = new b7e();
    private final Double amount;
    private final String id;
    private final String name;
    private final RecipeDisplayV0InputIngredientsItemUnit unit;

    public /* synthetic */ RecipeDisplayV0InputIngredientsItem(int i, Double d, String str, String str2, RecipeDisplayV0InputIngredientsItemUnit recipeDisplayV0InputIngredientsItemUnit, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.amount = null;
        } else {
            this.amount = d;
        }
        if ((i & 2) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 8) == 0) {
            this.unit = null;
        } else {
            this.unit = recipeDisplayV0InputIngredientsItemUnit;
        }
    }

    public static /* synthetic */ RecipeDisplayV0InputIngredientsItem copy$default(RecipeDisplayV0InputIngredientsItem recipeDisplayV0InputIngredientsItem, Double d, String str, String str2, RecipeDisplayV0InputIngredientsItemUnit recipeDisplayV0InputIngredientsItemUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            d = recipeDisplayV0InputIngredientsItem.amount;
        }
        if ((i & 2) != 0) {
            str = recipeDisplayV0InputIngredientsItem.id;
        }
        if ((i & 4) != 0) {
            str2 = recipeDisplayV0InputIngredientsItem.name;
        }
        if ((i & 8) != 0) {
            recipeDisplayV0InputIngredientsItemUnit = recipeDisplayV0InputIngredientsItem.unit;
        }
        return recipeDisplayV0InputIngredientsItem.copy(d, str, str2, recipeDisplayV0InputIngredientsItemUnit);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(RecipeDisplayV0InputIngredientsItem self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.amount != null) {
            output.B(serialDesc, 0, na6.a, self.amount);
        }
        if (output.E(serialDesc) || self.id != null) {
            output.B(serialDesc, 1, srg.a, self.id);
        }
        if (output.E(serialDesc) || self.name != null) {
            output.B(serialDesc, 2, srg.a, self.name);
        }
        if (!output.E(serialDesc) && self.unit == null) {
            return;
        }
        output.B(serialDesc, 3, d7e.d, self.unit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RecipeDisplayV0InputIngredientsItemUnit getUnit() {
        return this.unit;
    }

    public final RecipeDisplayV0InputIngredientsItem copy(Double amount, String id, String name, RecipeDisplayV0InputIngredientsItemUnit unit) {
        return new RecipeDisplayV0InputIngredientsItem(amount, id, name, unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecipeDisplayV0InputIngredientsItem)) {
            return false;
        }
        RecipeDisplayV0InputIngredientsItem recipeDisplayV0InputIngredientsItem = (RecipeDisplayV0InputIngredientsItem) other;
        return x44.r(this.amount, recipeDisplayV0InputIngredientsItem.amount) && x44.r(this.id, recipeDisplayV0InputIngredientsItem.id) && x44.r(this.name, recipeDisplayV0InputIngredientsItem.name) && this.unit == recipeDisplayV0InputIngredientsItem.unit;
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final RecipeDisplayV0InputIngredientsItemUnit getUnit() {
        return this.unit;
    }

    public int hashCode() {
        Double d = this.amount;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        RecipeDisplayV0InputIngredientsItemUnit recipeDisplayV0InputIngredientsItemUnit = this.unit;
        return iHashCode3 + (recipeDisplayV0InputIngredientsItemUnit != null ? recipeDisplayV0InputIngredientsItemUnit.hashCode() : 0);
    }

    public String toString() {
        return "RecipeDisplayV0InputIngredientsItem(amount=" + this.amount + ", id=" + this.id + ", name=" + this.name + ", unit=" + this.unit + ")";
    }

    public RecipeDisplayV0InputIngredientsItem() {
        this((Double) null, (String) null, (String) null, (RecipeDisplayV0InputIngredientsItemUnit) null, 15, (mq5) null);
    }

    public RecipeDisplayV0InputIngredientsItem(Double d, String str, String str2, RecipeDisplayV0InputIngredientsItemUnit recipeDisplayV0InputIngredientsItemUnit) {
        this.amount = d;
        this.id = str;
        this.name = str2;
        this.unit = recipeDisplayV0InputIngredientsItemUnit;
    }

    public /* synthetic */ RecipeDisplayV0InputIngredientsItem(Double d, String str, String str2, RecipeDisplayV0InputIngredientsItemUnit recipeDisplayV0InputIngredientsItemUnit, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : recipeDisplayV0InputIngredientsItemUnit);
    }
}
