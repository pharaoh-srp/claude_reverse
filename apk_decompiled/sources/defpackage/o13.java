package defpackage;

import android.content.res.Resources;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.citation.Citation;
import com.anthropic.claude.tool.model.KnowledgeSource;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o13 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ pz7 G;
    public final /* synthetic */ Resources H;
    public final /* synthetic */ pz7 I;

    public /* synthetic */ o13(bz7 bz7Var, pz7 pz7Var, Resources resources, pz7 pz7Var2, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = pz7Var;
        this.H = resources;
        this.I = pz7Var2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        pz7 pz7Var = this.I;
        Resources resources = this.H;
        pz7 pz7Var2 = this.G;
        bz7 bz7Var = this.F;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                Citation citation = (Citation) bz7Var.invoke(str);
                if (citation != null) {
                    if (!citation.isGrouped()) {
                        pz7Var.invoke(citation.getSourceUrl(), citation.is_trusted());
                    } else {
                        List listJ = jpi.j(citation);
                        String quantityString = resources.getQuantityString(R.plurals.knowledge_sources, listJ.size());
                        quantityString.getClass();
                        pz7Var2.invoke(quantityString, listJ);
                    }
                }
                break;
            default:
                str.getClass();
                Citation citation2 = (Citation) bz7Var.invoke(str);
                if (citation2 != null) {
                    if (!citation2.isGrouped()) {
                        KnowledgeSource.Companion.getClass();
                        pz7Var.invoke(wq9.a(citation2), citation2.getSourceUrl());
                    } else {
                        List listJ2 = jpi.j(citation2);
                        String quantityString2 = resources.getQuantityString(R.plurals.knowledge_sources, listJ2.size());
                        quantityString2.getClass();
                        pz7Var2.invoke(quantityString2, listJ2);
                    }
                }
                break;
        }
        return ieiVar;
    }
}
