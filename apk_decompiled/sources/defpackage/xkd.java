package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.RecipeDisplayV0Input;
import com.anthropic.claude.tool.model.RecipeDisplayV0InputIngredientsItem;
import com.anthropic.claude.tool.model.RecipeDisplayV0InputStepsItem;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xkd implements rz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ float F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ xkd(float f, tkd tkdVar, zy7 zy7Var, String str, bz7 bz7Var) {
        this.F = f;
        this.G = tkdVar;
        this.H = zy7Var;
        this.I = str;
        this.J = bz7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj4 = this.J;
        Object obj5 = this.I;
        Object obj6 = this.H;
        Object obj7 = this.G;
        switch (i) {
            case 0:
                tkd tkdVar = (tkd) obj7;
                zy7 zy7Var = (zy7) obj6;
                String str = (String) obj5;
                bz7 bz7Var = (bz7) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    fqb fqbVar = fqb.E;
                    iqb iqbVarL = gb9.L(rkj.j(b.c(fqbVar, 1.0f), za9.E), this.F, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarL);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, cxeVarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    int i2 = tkdVar.k + tkdVar.l;
                    if (1.0f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    zhk.e(i2, 0, e18Var, zy7Var, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), str);
                    kxk.g(e18Var, b.t(fqbVar, 12.0f));
                    String str2 = tkdVar.a;
                    String str3 = tkdVar.b;
                    String str4 = tkdVar.j;
                    if (1.0f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    ce5.a(str2, str3, str4, bz7Var, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), e18Var, 0);
                    e18Var.p(true);
                    kxk.g(e18Var, b.e(fqbVar, 16.0f));
                }
                break;
            default:
                final q7e q7eVar = (q7e) obj7;
                final Context context = (Context) obj6;
                final RecipeDisplayV0Input recipeDisplayV0Input = (RecipeDisplayV0Input) obj5;
                final nwb nwbVar = (nwb) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    ta4 ta4VarQ0 = fd9.q0(-458565907, new ska(16, q7eVar), e18Var2);
                    boolean zF = e18Var2.f(q7eVar);
                    Object objN = e18Var2.N();
                    lz1 lz1Var = jd4.a;
                    if (zF || objN == lz1Var) {
                        objN = new aac(q7eVar, 16, nwbVar);
                        e18Var2.k0(objN);
                    }
                    t30.b(ta4VarQ0, (zy7) objN, null, psk.b, null, false, null, null, e18Var2, 3078, 500);
                    boolean zH = e18Var2.h(context) | e18Var2.f(recipeDisplayV0Input);
                    final float f = this.F;
                    boolean zC = e18Var2.c(f) | zH | e18Var2.f(q7eVar);
                    Object objN2 = e18Var2.N();
                    if (zC || objN2 == lz1Var) {
                        final int i3 = 0;
                        zy7 zy7Var2 = new zy7() { // from class: m7e
                            @Override // defpackage.zy7
                            public final Object a() {
                                int iIntValue3;
                                iei ieiVar2;
                                int iIntValue4;
                                int i4 = i3;
                                iei ieiVar3 = iei.a;
                                lm6 lm6Var = lm6.E;
                                nwb nwbVar2 = nwbVar;
                                q7e q7eVar2 = q7eVar;
                                float f2 = f;
                                RecipeDisplayV0Input recipeDisplayV0Input2 = recipeDisplayV0Input;
                                Context context2 = context;
                                switch (i4) {
                                    case 0:
                                        v5b v5bVarO = q7eVar2.O();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(recipeDisplayV0Input2.getTitle());
                                        sb.append("\n\n");
                                        String description = recipeDisplayV0Input2.getDescription();
                                        if (description != null) {
                                            sb.append(description);
                                            sb.append("\n\n");
                                        }
                                        List<RecipeDisplayV0InputIngredientsItem> ingredients = recipeDisplayV0Input2.getIngredients();
                                        if (ingredients != null && !ingredients.isEmpty()) {
                                            String string = context2.getString(R.string.recipe_ingredients);
                                            string.getClass();
                                            String upperCase = string.toUpperCase(Locale.ROOT);
                                            upperCase.getClass();
                                            sb.append(upperCase);
                                            sb.append('\n');
                                            Iterator<T> it = ingredients.iterator();
                                            while (it.hasNext()) {
                                                sb.append("• ".concat(k7e.b((RecipeDisplayV0InputIngredientsItem) it.next(), f2, v5bVarO)));
                                                sb.append('\n');
                                            }
                                            sb.append('\n');
                                        }
                                        if (!recipeDisplayV0Input2.getSteps().isEmpty()) {
                                            String string2 = context2.getString(R.string.recipe_steps);
                                            string2.getClass();
                                            String upperCase2 = string2.toUpperCase(Locale.ROOT);
                                            upperCase2.getClass();
                                            sb.append(upperCase2);
                                            sb.append('\n');
                                            int i5 = 0;
                                            for (Object obj8 : recipeDisplayV0Input2.getSteps()) {
                                                int i6 = i5 + 1;
                                                if (i5 < 0) {
                                                    x44.n0();
                                                    throw null;
                                                }
                                                RecipeDisplayV0InputStepsItem recipeDisplayV0InputStepsItem = (RecipeDisplayV0InputStepsItem) obj8;
                                                String content = recipeDisplayV0InputStepsItem.getContent();
                                                List<RecipeDisplayV0InputIngredientsItem> ingredients2 = recipeDisplayV0Input2.getIngredients();
                                                if (ingredients2 == null) {
                                                    ingredients2 = lm6Var;
                                                }
                                                sb.append(i6 + ". " + k7e.c(content, ingredients2, f2, v5bVarO));
                                                Integer timer_seconds = recipeDisplayV0InputStepsItem.getTimer_seconds();
                                                if (timer_seconds != null && (iIntValue3 = timer_seconds.intValue()) > 0) {
                                                    sb.append(" ⏱ ".concat(k7e.a(iIntValue3)));
                                                }
                                                sb.append('\n');
                                                i5 = i6;
                                            }
                                            sb.append('\n');
                                        }
                                        String notes = recipeDisplayV0Input2.getNotes();
                                        if (notes != null) {
                                            String string3 = context2.getString(R.string.recipe_notes);
                                            string3.getClass();
                                            String upperCase3 = string3.toUpperCase(Locale.ROOT);
                                            upperCase3.getClass();
                                            sb.append(upperCase3);
                                            sb.append('\n');
                                            sb.append(notes);
                                            sb.append('\n');
                                        }
                                        String string4 = sb.toString();
                                        Intent intent = new Intent();
                                        intent.setAction("android.intent.action.SEND");
                                        intent.putExtra("android.intent.extra.TEXT", string4);
                                        intent.setType("text/plain");
                                        try {
                                            context2.startActivity(Intent.createChooser(intent, null));
                                            break;
                                        } catch (Exception unused) {
                                        }
                                        nwbVar2.setValue(Boolean.FALSE);
                                        return ieiVar3;
                                    default:
                                        v5b v5bVarO2 = q7eVar2.O();
                                        String string5 = context2.getString(R.string.recipe_ingredients);
                                        string5.getClass();
                                        String string6 = context2.getString(R.string.recipe_steps);
                                        string6.getClass();
                                        String string7 = context2.getString(R.string.recipe_notes);
                                        string7.getClass();
                                        StringBuilder sb2 = new StringBuilder("<html><head><style>body { font-family: sans-serif; padding: 20px; }h1 { margin-bottom: 10px; }h2 { margin-top: 20px; margin-bottom: 10px; color: #666; }ul { padding-left: 20px; }ol { padding-left: 20px; }li { margin-bottom: 8px; }</style></head><body>");
                                        sb2.append("<h1>" + TextUtils.htmlEncode(recipeDisplayV0Input2.getTitle()) + "</h1>");
                                        String description2 = recipeDisplayV0Input2.getDescription();
                                        if (description2 != null) {
                                            sb2.append("<p>" + TextUtils.htmlEncode(description2) + "</p>");
                                        }
                                        List<RecipeDisplayV0InputIngredientsItem> ingredients3 = recipeDisplayV0Input2.getIngredients();
                                        if (ingredients3 == null || ingredients3.isEmpty()) {
                                            ieiVar2 = ieiVar3;
                                        } else {
                                            ieiVar2 = ieiVar3;
                                            sb2.append("<h2>" + TextUtils.htmlEncode(string5) + "</h2><ul>");
                                            Iterator<T> it2 = ingredients3.iterator();
                                            while (it2.hasNext()) {
                                                sb2.append("<li>" + TextUtils.htmlEncode(k7e.b((RecipeDisplayV0InputIngredientsItem) it2.next(), f2, v5bVarO2)) + "</li>");
                                            }
                                            sb2.append("</ul>");
                                        }
                                        if (!recipeDisplayV0Input2.getSteps().isEmpty()) {
                                            sb2.append("<h2>" + TextUtils.htmlEncode(string6) + "</h2><ol>");
                                            for (RecipeDisplayV0InputStepsItem recipeDisplayV0InputStepsItem2 : recipeDisplayV0Input2.getSteps()) {
                                                String content2 = recipeDisplayV0InputStepsItem2.getContent();
                                                List<RecipeDisplayV0InputIngredientsItem> ingredients4 = recipeDisplayV0Input2.getIngredients();
                                                if (ingredients4 == null) {
                                                    ingredients4 = lm6Var;
                                                }
                                                sb2.append("<li>" + TextUtils.htmlEncode(k7e.c(content2, ingredients4, f2, v5bVarO2)));
                                                Integer timer_seconds2 = recipeDisplayV0InputStepsItem2.getTimer_seconds();
                                                if (timer_seconds2 != null && (iIntValue4 = timer_seconds2.intValue()) > 0) {
                                                    sb2.append(" <em>(" + TextUtils.htmlEncode(k7e.a(iIntValue4)) + ")</em>");
                                                }
                                                sb2.append("</li>");
                                            }
                                            sb2.append("</ol>");
                                        }
                                        String notes2 = recipeDisplayV0Input2.getNotes();
                                        if (notes2 != null) {
                                            sb2.append(ij0.l("<h2>", TextUtils.htmlEncode(string7), "</h2><p>", TextUtils.htmlEncode(notes2), "</p>"));
                                        }
                                        sb2.append("</body></html>");
                                        String string8 = sb2.toString();
                                        WebView webView = new WebView(context2);
                                        webView.setWebViewClient(new a1e(context2, 1, recipeDisplayV0Input2));
                                        webView.loadDataWithBaseURL(null, string8, "text/html", "UTF-8", null);
                                        nwbVar2.setValue(Boolean.FALSE);
                                        return ieiVar2;
                                }
                            }
                        };
                        e18Var2.k0(zy7Var2);
                        objN2 = zy7Var2;
                    }
                    t30.b(psk.c, (zy7) objN2, null, psk.d, null, false, null, null, e18Var2, 3078, 500);
                    boolean zH2 = e18Var2.h(context) | e18Var2.f(recipeDisplayV0Input) | e18Var2.c(f) | e18Var2.f(q7eVar);
                    Object objN3 = e18Var2.N();
                    if (zH2 || objN3 == lz1Var) {
                        final int i4 = 1;
                        zy7 zy7Var3 = new zy7() { // from class: m7e
                            @Override // defpackage.zy7
                            public final Object a() {
                                int iIntValue3;
                                iei ieiVar2;
                                int iIntValue4;
                                int i42 = i4;
                                iei ieiVar3 = iei.a;
                                lm6 lm6Var = lm6.E;
                                nwb nwbVar2 = nwbVar;
                                q7e q7eVar2 = q7eVar;
                                float f2 = f;
                                RecipeDisplayV0Input recipeDisplayV0Input2 = recipeDisplayV0Input;
                                Context context2 = context;
                                switch (i42) {
                                    case 0:
                                        v5b v5bVarO = q7eVar2.O();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(recipeDisplayV0Input2.getTitle());
                                        sb.append("\n\n");
                                        String description = recipeDisplayV0Input2.getDescription();
                                        if (description != null) {
                                            sb.append(description);
                                            sb.append("\n\n");
                                        }
                                        List<RecipeDisplayV0InputIngredientsItem> ingredients = recipeDisplayV0Input2.getIngredients();
                                        if (ingredients != null && !ingredients.isEmpty()) {
                                            String string = context2.getString(R.string.recipe_ingredients);
                                            string.getClass();
                                            String upperCase = string.toUpperCase(Locale.ROOT);
                                            upperCase.getClass();
                                            sb.append(upperCase);
                                            sb.append('\n');
                                            Iterator<T> it = ingredients.iterator();
                                            while (it.hasNext()) {
                                                sb.append("• ".concat(k7e.b((RecipeDisplayV0InputIngredientsItem) it.next(), f2, v5bVarO)));
                                                sb.append('\n');
                                            }
                                            sb.append('\n');
                                        }
                                        if (!recipeDisplayV0Input2.getSteps().isEmpty()) {
                                            String string2 = context2.getString(R.string.recipe_steps);
                                            string2.getClass();
                                            String upperCase2 = string2.toUpperCase(Locale.ROOT);
                                            upperCase2.getClass();
                                            sb.append(upperCase2);
                                            sb.append('\n');
                                            int i5 = 0;
                                            for (Object obj8 : recipeDisplayV0Input2.getSteps()) {
                                                int i6 = i5 + 1;
                                                if (i5 < 0) {
                                                    x44.n0();
                                                    throw null;
                                                }
                                                RecipeDisplayV0InputStepsItem recipeDisplayV0InputStepsItem = (RecipeDisplayV0InputStepsItem) obj8;
                                                String content = recipeDisplayV0InputStepsItem.getContent();
                                                List<RecipeDisplayV0InputIngredientsItem> ingredients2 = recipeDisplayV0Input2.getIngredients();
                                                if (ingredients2 == null) {
                                                    ingredients2 = lm6Var;
                                                }
                                                sb.append(i6 + ". " + k7e.c(content, ingredients2, f2, v5bVarO));
                                                Integer timer_seconds = recipeDisplayV0InputStepsItem.getTimer_seconds();
                                                if (timer_seconds != null && (iIntValue3 = timer_seconds.intValue()) > 0) {
                                                    sb.append(" ⏱ ".concat(k7e.a(iIntValue3)));
                                                }
                                                sb.append('\n');
                                                i5 = i6;
                                            }
                                            sb.append('\n');
                                        }
                                        String notes = recipeDisplayV0Input2.getNotes();
                                        if (notes != null) {
                                            String string3 = context2.getString(R.string.recipe_notes);
                                            string3.getClass();
                                            String upperCase3 = string3.toUpperCase(Locale.ROOT);
                                            upperCase3.getClass();
                                            sb.append(upperCase3);
                                            sb.append('\n');
                                            sb.append(notes);
                                            sb.append('\n');
                                        }
                                        String string4 = sb.toString();
                                        Intent intent = new Intent();
                                        intent.setAction("android.intent.action.SEND");
                                        intent.putExtra("android.intent.extra.TEXT", string4);
                                        intent.setType("text/plain");
                                        try {
                                            context2.startActivity(Intent.createChooser(intent, null));
                                            break;
                                        } catch (Exception unused) {
                                        }
                                        nwbVar2.setValue(Boolean.FALSE);
                                        return ieiVar3;
                                    default:
                                        v5b v5bVarO2 = q7eVar2.O();
                                        String string5 = context2.getString(R.string.recipe_ingredients);
                                        string5.getClass();
                                        String string6 = context2.getString(R.string.recipe_steps);
                                        string6.getClass();
                                        String string7 = context2.getString(R.string.recipe_notes);
                                        string7.getClass();
                                        StringBuilder sb2 = new StringBuilder("<html><head><style>body { font-family: sans-serif; padding: 20px; }h1 { margin-bottom: 10px; }h2 { margin-top: 20px; margin-bottom: 10px; color: #666; }ul { padding-left: 20px; }ol { padding-left: 20px; }li { margin-bottom: 8px; }</style></head><body>");
                                        sb2.append("<h1>" + TextUtils.htmlEncode(recipeDisplayV0Input2.getTitle()) + "</h1>");
                                        String description2 = recipeDisplayV0Input2.getDescription();
                                        if (description2 != null) {
                                            sb2.append("<p>" + TextUtils.htmlEncode(description2) + "</p>");
                                        }
                                        List<RecipeDisplayV0InputIngredientsItem> ingredients3 = recipeDisplayV0Input2.getIngredients();
                                        if (ingredients3 == null || ingredients3.isEmpty()) {
                                            ieiVar2 = ieiVar3;
                                        } else {
                                            ieiVar2 = ieiVar3;
                                            sb2.append("<h2>" + TextUtils.htmlEncode(string5) + "</h2><ul>");
                                            Iterator<T> it2 = ingredients3.iterator();
                                            while (it2.hasNext()) {
                                                sb2.append("<li>" + TextUtils.htmlEncode(k7e.b((RecipeDisplayV0InputIngredientsItem) it2.next(), f2, v5bVarO2)) + "</li>");
                                            }
                                            sb2.append("</ul>");
                                        }
                                        if (!recipeDisplayV0Input2.getSteps().isEmpty()) {
                                            sb2.append("<h2>" + TextUtils.htmlEncode(string6) + "</h2><ol>");
                                            for (RecipeDisplayV0InputStepsItem recipeDisplayV0InputStepsItem2 : recipeDisplayV0Input2.getSteps()) {
                                                String content2 = recipeDisplayV0InputStepsItem2.getContent();
                                                List<RecipeDisplayV0InputIngredientsItem> ingredients4 = recipeDisplayV0Input2.getIngredients();
                                                if (ingredients4 == null) {
                                                    ingredients4 = lm6Var;
                                                }
                                                sb2.append("<li>" + TextUtils.htmlEncode(k7e.c(content2, ingredients4, f2, v5bVarO2)));
                                                Integer timer_seconds2 = recipeDisplayV0InputStepsItem2.getTimer_seconds();
                                                if (timer_seconds2 != null && (iIntValue4 = timer_seconds2.intValue()) > 0) {
                                                    sb2.append(" <em>(" + TextUtils.htmlEncode(k7e.a(iIntValue4)) + ")</em>");
                                                }
                                                sb2.append("</li>");
                                            }
                                            sb2.append("</ol>");
                                        }
                                        String notes2 = recipeDisplayV0Input2.getNotes();
                                        if (notes2 != null) {
                                            sb2.append(ij0.l("<h2>", TextUtils.htmlEncode(string7), "</h2><p>", TextUtils.htmlEncode(notes2), "</p>"));
                                        }
                                        sb2.append("</body></html>");
                                        String string8 = sb2.toString();
                                        WebView webView = new WebView(context2);
                                        webView.setWebViewClient(new a1e(context2, 1, recipeDisplayV0Input2));
                                        webView.loadDataWithBaseURL(null, string8, "text/html", "UTF-8", null);
                                        nwbVar2.setValue(Boolean.FALSE);
                                        return ieiVar2;
                                }
                            }
                        };
                        e18Var2.k0(zy7Var3);
                        objN3 = zy7Var3;
                    }
                    t30.b(psk.e, (zy7) objN3, null, psk.f, null, false, null, null, e18Var2, 3078, 500);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ xkd(q7e q7eVar, Context context, RecipeDisplayV0Input recipeDisplayV0Input, float f, nwb nwbVar) {
        this.G = q7eVar;
        this.H = context;
        this.I = recipeDisplayV0Input;
        this.F = f;
        this.J = nwbVar;
    }
}
