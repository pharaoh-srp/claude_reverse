package com.anthropic.claude.tool.model;

import defpackage.c7e;
import defpackage.d7e;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rod;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/anthropic/claude/tool/model/RecipeDisplayV0InputIngredientsItemUnit;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "c7e", "G", "KG", "ML", "L", "TSP", "TBSP", "CUP", "FL_OZ", "OZ", "LB", "PINCH", "PIECE", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = d7e.class)
public final class RecipeDisplayV0InputIngredientsItemUnit {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ RecipeDisplayV0InputIngredientsItemUnit[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final c7e Companion;
    private final String loggingName;
    public static final RecipeDisplayV0InputIngredientsItemUnit G = new RecipeDisplayV0InputIngredientsItemUnit("G", 0, "g");
    public static final RecipeDisplayV0InputIngredientsItemUnit KG = new RecipeDisplayV0InputIngredientsItemUnit("KG", 1, "kg");
    public static final RecipeDisplayV0InputIngredientsItemUnit ML = new RecipeDisplayV0InputIngredientsItemUnit("ML", 2, "ml");
    public static final RecipeDisplayV0InputIngredientsItemUnit L = new RecipeDisplayV0InputIngredientsItemUnit("L", 3, "l");
    public static final RecipeDisplayV0InputIngredientsItemUnit TSP = new RecipeDisplayV0InputIngredientsItemUnit("TSP", 4, "tsp");
    public static final RecipeDisplayV0InputIngredientsItemUnit TBSP = new RecipeDisplayV0InputIngredientsItemUnit("TBSP", 5, "tbsp");
    public static final RecipeDisplayV0InputIngredientsItemUnit CUP = new RecipeDisplayV0InputIngredientsItemUnit("CUP", 6, "cup");
    public static final RecipeDisplayV0InputIngredientsItemUnit FL_OZ = new RecipeDisplayV0InputIngredientsItemUnit("FL_OZ", 7, "fl_oz");
    public static final RecipeDisplayV0InputIngredientsItemUnit OZ = new RecipeDisplayV0InputIngredientsItemUnit("OZ", 8, "oz");
    public static final RecipeDisplayV0InputIngredientsItemUnit LB = new RecipeDisplayV0InputIngredientsItemUnit("LB", 9, "lb");
    public static final RecipeDisplayV0InputIngredientsItemUnit PINCH = new RecipeDisplayV0InputIngredientsItemUnit("PINCH", 10, "pinch");
    public static final RecipeDisplayV0InputIngredientsItemUnit PIECE = new RecipeDisplayV0InputIngredientsItemUnit("PIECE", 11, "piece");

    private static final /* synthetic */ RecipeDisplayV0InputIngredientsItemUnit[] $values() {
        return new RecipeDisplayV0InputIngredientsItemUnit[]{G, KG, ML, L, TSP, TBSP, CUP, FL_OZ, OZ, LB, PINCH, PIECE};
    }

    static {
        RecipeDisplayV0InputIngredientsItemUnit[] recipeDisplayV0InputIngredientsItemUnitArr$values = $values();
        $VALUES = recipeDisplayV0InputIngredientsItemUnitArr$values;
        $ENTRIES = wd6.n0(recipeDisplayV0InputIngredientsItemUnitArr$values);
        Companion = new c7e();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new rod(21));
    }

    private RecipeDisplayV0InputIngredientsItemUnit(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.RecipeDisplayV0InputIngredientsItemUnit", values(), new String[]{"g", "kg", "ml", "l", "tsp", "tbsp", "cup", "fl_oz", "oz", "lb", "pinch", "piece"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static RecipeDisplayV0InputIngredientsItemUnit valueOf(String str) {
        return (RecipeDisplayV0InputIngredientsItemUnit) Enum.valueOf(RecipeDisplayV0InputIngredientsItemUnit.class, str);
    }

    public static RecipeDisplayV0InputIngredientsItemUnit[] values() {
        return (RecipeDisplayV0InputIngredientsItemUnit[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
