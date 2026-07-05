package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: loaded from: classes2.dex */
public final class o5d extends xzg implements pz7 {
    public jxb E;
    public p5d F;
    public CharSequence G;
    public long H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ CharSequence K;
    public final /* synthetic */ long L;
    public final /* synthetic */ p5d M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5d(CharSequence charSequence, long j, p5d p5dVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = charSequence;
        this.L = j;
        this.M = p5dVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        o5d o5dVar = new o5d(this.K, this.L, this.M, tp4Var);
        o5dVar.J = obj;
        return o5dVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((o5d) create((TextClassifier) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        p5d p5dVar;
        long j;
        jxb jxbVar;
        TextSelection textSelection;
        CharSequence charSequence;
        int i = this.I;
        if (i == 0) {
            sf5.h0(obj);
            TextClassifier textClassifier = (TextClassifier) this.J;
            l5d.C();
            long j2 = this.L;
            int iG = kkh.g(j2);
            int iF = kkh.f(j2);
            CharSequence charSequence2 = this.K;
            TextSelection.Request.Builder builderL = l5d.l(iG, iF, charSequence2);
            p5dVar = this.M;
            TextSelection.Request.Builder defaultLocales = builderL.setDefaultLocales(p5dVar.b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jM = mwa.m(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            m45 m45Var = m45.E;
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.H = jM;
                this.I = 2;
                if (p5d.a(p5dVar, this.K, jM, textClassifier, this) != m45Var) {
                    j = jM;
                }
            } else {
                jxbVar = p5dVar.e;
                this.J = textSelectionSuggestSelection;
                this.E = jxbVar;
                this.F = p5dVar;
                this.G = charSequence2;
                this.H = jM;
                this.I = 1;
                if (jxbVar.c(this) != m45Var) {
                    textSelection = textSelectionSuggestSelection;
                    charSequence = charSequence2;
                    j = jM;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    p5dVar.g.setValue(new tdh(charSequence, j, textClassification));
                }
            }
            return m45Var;
        }
        if (i == 1) {
            j = this.H;
            charSequence = this.G;
            p5dVar = this.F;
            jxbVar = this.E;
            textSelection = (TextSelection) this.J;
            sf5.h0(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                p5dVar.g.setValue(new tdh(charSequence, j, textClassification2));
            } finally {
                jxbVar.d(null);
            }
        } else {
            if (i != 2) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.H;
            sf5.h0(obj);
        }
        return new kkh(j);
    }
}
