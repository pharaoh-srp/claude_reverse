package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
public final class zl6 implements TextWatcher {
    public final EditText E;
    public yl6 F;
    public boolean G = true;

    public zl6(EditText editText) {
        this.E = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            gl6 gl6VarA = gl6.a();
            if (editableText == null) {
                length = 0;
            } else {
                gl6VarA.getClass();
                length = editableText.length();
            }
            gl6VarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.E;
        if (!editText.isInEditMode() && this.G && gl6.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iC = gl6.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    gl6.a().g(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            gl6 gl6VarA = gl6.a();
            if (this.F == null) {
                this.F = new yl6(editText);
            }
            gl6VarA.h(this.F);
        }
    }
}
