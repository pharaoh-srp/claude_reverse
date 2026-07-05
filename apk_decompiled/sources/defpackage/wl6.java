package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class wl6 extends ovj {
    public final TextView d;
    public final ql6 e;
    public boolean f = true;

    public wl6(TextView textView) {
        this.d = textView;
        this.e = new ql6(textView);
    }

    @Override // defpackage.ovj
    public final InputFilter[] f(InputFilter[] inputFilterArr) {
        if (!this.f) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof ql6) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            ql6 ql6Var = this.e;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = ql6Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == ql6Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.ovj
    public final void i(boolean z) {
        if (z) {
            k();
        }
    }

    @Override // defpackage.ovj
    public final void j(boolean z) {
        this.f = z;
        k();
        TextView textView = this.d;
        textView.setFilters(f(textView.getFilters()));
    }

    public final void k() {
        TextView textView = this.d;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f) {
            if (!(transformationMethod instanceof am6) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new am6(transformationMethod);
            }
        } else if (transformationMethod instanceof am6) {
            transformationMethod = ((am6) transformationMethod).E;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
