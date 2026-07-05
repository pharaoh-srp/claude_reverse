package defpackage;

import android.graphics.Typeface;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m34 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ om8 F;
    public final /* synthetic */ CharSequence G;

    public /* synthetic */ m34(om8 om8Var, CharSequence charSequence, int i) {
        this.E = i;
        this.F = om8Var;
        this.G = charSequence;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        CharSequence charSequence = this.G;
        om8 om8Var = this.F;
        switch (i) {
            case 0:
                rgf rgfVar = (rgf) obj;
                rgfVar.getClass();
                int[] iArr = q54.a;
                om8Var.getClass();
                rgfVar.setTypeface(Typeface.MONOSPACE);
                rgfVar.setTextSize(14.0f);
                rgfVar.setTextColor(om8Var.a);
                int selectionStart = Selection.getSelectionStart(rgfVar.getText());
                int selectionEnd = Selection.getSelectionEnd(rgfVar.getText());
                rgfVar.setText(charSequence);
                CharSequence text = rgfVar.getText();
                if ((text instanceof Spannable) && selectionStart >= 0 && selectionEnd >= 0) {
                    Spannable spannable = (Spannable) text;
                    if (selectionStart <= spannable.length() && selectionEnd <= spannable.length()) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    }
                }
                break;
            default:
                TextView textView = (TextView) obj;
                textView.getClass();
                int[] iArr2 = q54.a;
                textView.setTypeface(Typeface.MONOSPACE);
                textView.setTextSize(14.0f);
                textView.setTextColor(om8Var.a);
                textView.setText(charSequence);
                break;
        }
        return ieiVar;
    }
}
