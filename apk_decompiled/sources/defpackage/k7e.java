package defpackage;

import com.anthropic.claude.tool.model.RecipeDisplayV0InputIngredientsItem;
import com.anthropic.claude.tool.model.RecipeDisplayV0InputIngredientsItemUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k7e {
    public static final ide a = new ide("\\{([^}]+)\\}");
    public static final Map b;
    public static final Map c;
    public static final Set d;

    static {
        RecipeDisplayV0InputIngredientsItemUnit recipeDisplayV0InputIngredientsItemUnit = RecipeDisplayV0InputIngredientsItemUnit.CUP;
        RecipeDisplayV0InputIngredientsItemUnit recipeDisplayV0InputIngredientsItemUnit2 = RecipeDisplayV0InputIngredientsItemUnit.ML;
        cpc cpcVar = new cpc(recipeDisplayV0InputIngredientsItemUnit, new vq4(236.588d, recipeDisplayV0InputIngredientsItemUnit2));
        cpc cpcVar2 = new cpc(RecipeDisplayV0InputIngredientsItemUnit.TBSP, new vq4(14.787d, recipeDisplayV0InputIngredientsItemUnit2));
        cpc cpcVar3 = new cpc(RecipeDisplayV0InputIngredientsItemUnit.TSP, new vq4(4.929d, recipeDisplayV0InputIngredientsItemUnit2));
        cpc cpcVar4 = new cpc(RecipeDisplayV0InputIngredientsItemUnit.FL_OZ, new vq4(29.5735d, recipeDisplayV0InputIngredientsItemUnit2));
        RecipeDisplayV0InputIngredientsItemUnit recipeDisplayV0InputIngredientsItemUnit3 = RecipeDisplayV0InputIngredientsItemUnit.OZ;
        RecipeDisplayV0InputIngredientsItemUnit recipeDisplayV0InputIngredientsItemUnit4 = RecipeDisplayV0InputIngredientsItemUnit.G;
        cpc cpcVar5 = new cpc(recipeDisplayV0InputIngredientsItemUnit3, new vq4(28.3495d, recipeDisplayV0InputIngredientsItemUnit4));
        RecipeDisplayV0InputIngredientsItemUnit recipeDisplayV0InputIngredientsItemUnit5 = RecipeDisplayV0InputIngredientsItemUnit.LB;
        b = sta.h0(cpcVar, cpcVar2, cpcVar3, cpcVar4, cpcVar5, new cpc(recipeDisplayV0InputIngredientsItemUnit5, new vq4(453.592d, recipeDisplayV0InputIngredientsItemUnit4)));
        cpc cpcVar6 = new cpc(recipeDisplayV0InputIngredientsItemUnit2, new vq4(0.00423d, recipeDisplayV0InputIngredientsItemUnit));
        RecipeDisplayV0InputIngredientsItemUnit recipeDisplayV0InputIngredientsItemUnit6 = RecipeDisplayV0InputIngredientsItemUnit.L;
        cpc cpcVar7 = new cpc(recipeDisplayV0InputIngredientsItemUnit6, new vq4(4.227d, recipeDisplayV0InputIngredientsItemUnit));
        cpc cpcVar8 = new cpc(recipeDisplayV0InputIngredientsItemUnit4, new vq4(0.03527d, recipeDisplayV0InputIngredientsItemUnit3));
        RecipeDisplayV0InputIngredientsItemUnit recipeDisplayV0InputIngredientsItemUnit7 = RecipeDisplayV0InputIngredientsItemUnit.KG;
        c = sta.h0(cpcVar6, cpcVar7, cpcVar8, new cpc(recipeDisplayV0InputIngredientsItemUnit7, new vq4(2.205d, recipeDisplayV0InputIngredientsItemUnit5)));
        d = mp0.Z0(new RecipeDisplayV0InputIngredientsItemUnit[]{recipeDisplayV0InputIngredientsItemUnit2, recipeDisplayV0InputIngredientsItemUnit6, recipeDisplayV0InputIngredientsItemUnit4, recipeDisplayV0InputIngredientsItemUnit7});
    }

    public static final String a(int i) {
        if (i >= 3600) {
            int i2 = i / 3600;
            int i3 = (i % 3600) / 60;
            if (i3 <= 0) {
                return i2 + "h";
            }
            return i2 + "h " + i3 + "m";
        }
        if (i < 60) {
            return i + "s";
        }
        int i4 = i / 60;
        int i5 = i % 60;
        if (i5 <= 0) {
            return i4 + "m";
        }
        return i4 + "m " + i5 + "s";
    }

    public static final String b(RecipeDisplayV0InputIngredientsItem recipeDisplayV0InputIngredientsItem, float f, v5b v5bVar) {
        vq4 vq4Var;
        cpc cpcVar;
        cpc cpcVar2;
        vq4 vq4Var2;
        String strValueOf;
        recipeDisplayV0InputIngredientsItem.getClass();
        v5bVar.getClass();
        ArrayList arrayList = new ArrayList();
        Double amount = recipeDisplayV0InputIngredientsItem.getAmount();
        if (amount != null) {
            double dDoubleValue = amount.doubleValue() * ((double) f);
            RecipeDisplayV0InputIngredientsItemUnit unit = recipeDisplayV0InputIngredientsItem.getUnit();
            if (unit == null) {
                cpcVar = new cpc(Double.valueOf(dDoubleValue), "");
            } else {
                boolean zContains = d.contains(unit);
                String loggingName = unit.getLoggingName();
                int iOrdinal = v5bVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        wg6.i();
                        return null;
                    }
                    if (zContains || (vq4Var2 = (vq4) b.get(unit)) == null) {
                        cpcVar = new cpc(Double.valueOf(dDoubleValue), loggingName);
                    } else {
                        cpcVar2 = new cpc(Double.valueOf(dDoubleValue * vq4Var2.a), vq4Var2.b.getLoggingName());
                        cpcVar = cpcVar2;
                    }
                } else if (zContains && (vq4Var = (vq4) c.get(unit)) != null) {
                    cpcVar2 = new cpc(Double.valueOf(dDoubleValue * vq4Var.a), vq4Var.b.getLoggingName());
                    cpcVar = cpcVar2;
                } else {
                    cpcVar = new cpc(Double.valueOf(dDoubleValue), loggingName);
                }
            }
            double dDoubleValue2 = ((Number) cpcVar.E).doubleValue();
            String str = (String) cpcVar.F;
            List listX = x44.X(new cpc(Double.valueOf(0.125d), "1/8"), new cpc(Double.valueOf(0.25d), "1/4"), new cpc(Double.valueOf(0.333d), "1/3"), new cpc(Double.valueOf(0.375d), "3/8"), new cpc(Double.valueOf(0.5d), "1/2"), new cpc(Double.valueOf(0.625d), "5/8"), new cpc(Double.valueOf(0.666d), "2/3"), new cpc(Double.valueOf(0.75d), "3/4"), new cpc(Double.valueOf(0.875d), "7/8"));
            int iFloor = (int) Math.floor(dDoubleValue2);
            double d2 = dDoubleValue2 - ((double) iFloor);
            if (d2 < 0.01d) {
                strValueOf = String.valueOf(iFloor);
            } else {
                Iterator it = listX.iterator();
                while (true) {
                    if (it.hasNext()) {
                        cpc cpcVar3 = (cpc) it.next();
                        double dDoubleValue3 = ((Number) cpcVar3.E).doubleValue();
                        String str2 = (String) cpcVar3.F;
                        if (Math.abs(d2 - dDoubleValue3) < 0.05d) {
                            if (iFloor > 0) {
                                strValueOf = iFloor + " " + str2;
                            } else {
                                strValueOf = str2;
                            }
                        }
                    } else {
                        strValueOf = dDoubleValue2 < 10.0d ? String.format(Locale.US, "%.2g", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue2)}, 1)) : String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue2)}, 1));
                    }
                }
            }
            arrayList.add(strValueOf);
            if (str.length() > 0) {
                arrayList.add(str);
            }
        }
        String name = recipeDisplayV0InputIngredientsItem.getName();
        if (name != null && name.length() != 0) {
            arrayList.add(name);
        }
        return w44.S0(arrayList, " ", null, null, null, 62);
    }

    public static final String c(String str, List list, float f, v5b v5bVar) {
        str.getClass();
        v5bVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((RecipeDisplayV0InputIngredientsItem) obj).getId() != null) {
                arrayList.add(obj);
            }
        }
        int iD0 = tta.d0(x44.y(arrayList, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (Object obj2 : arrayList) {
            String id = ((RecipeDisplayV0InputIngredientsItem) obj2).getId();
            id.getClass();
            linkedHashMap.put(id, obj2);
        }
        return a.g(str, new k10(linkedHashMap, f, v5bVar, 5));
    }

    public static final String d(int i) {
        int i2 = i / 3600;
        int i3 = (i % 3600) / 60;
        int i4 = i % 60;
        return i2 > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, 2));
    }
}
