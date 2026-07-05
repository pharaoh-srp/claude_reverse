package defpackage;

import com.anthropic.claude.tool.model.RecipeDisplayV0InputIngredientsItemUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class vq4 {
    public final double a;
    public final RecipeDisplayV0InputIngredientsItemUnit b;

    public vq4(double d, RecipeDisplayV0InputIngredientsItemUnit recipeDisplayV0InputIngredientsItemUnit) {
        recipeDisplayV0InputIngredientsItemUnit.getClass();
        this.a = d;
        this.b = recipeDisplayV0InputIngredientsItemUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq4)) {
            return false;
        }
        vq4 vq4Var = (vq4) obj;
        return Double.compare(this.a, vq4Var.a) == 0 && this.b == vq4Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Conversion(factor=" + this.a + ", targetUnit=" + this.b + ")";
    }
}
